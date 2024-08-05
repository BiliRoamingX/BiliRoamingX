package app.revanced.bilibili.utils

import android.app.NotificationManager
import android.media.MediaScannerConnection
import android.os.Environment
import app.revanced.bilibili.model.DownloadEntry
import app.revanced.bilibili.model.saveFilename
import app.revanced.bilibili.model.showName
import java.io.File
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.atomic.AtomicInteger

class DownloadEntrySelection(val entry: DownloadEntry, val saveDir: File, var selected: Boolean = false)

object VideoExporter {
    @Volatile
    var exporting = false
        private set

    private val notifyIdGenerator = AtomicInteger(Int.MIN_VALUE)

    fun readAllCacheVideos(): List<DownloadEntrySelection> {
        val downloadDir = File(Utils.getContext().getExternalFilesDir(null)!!.parentFile, "download")
        return downloadDir.listFiles().orEmpty().flatMap {
            it.listFiles().orEmpty().asIterable()
        }.mapNotNull { dir ->
            val entry = File(dir, "entry.json").runCatchingOrNull {
                inputStream().use { it.fromJson<DownloadEntry>() }
            } ?: return@mapNotNull null
            if (!entry.isCompleted)
                return@mapNotNull null
            val videoQuality = entry.videoQuality
            val saveDir = File(dir, videoQuality.toString())
            if (!saveDir.isDirectory)
                return@mapNotNull null
            DownloadEntrySelection(entry, saveDir)
        }.toList()
    }

    fun exportVideos(selections: List<DownloadEntrySelection>) {
        exporting = true
        Toasts.showShortWithId("biliroaming_exporting")
        val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val videosDir = File(downloadsDir, "bilibili/videos").apply { mkdirs() }
        val threadsCount = Runtime.getRuntime().availableProcessors().coerceAtLeast(2)
        val executors = Executors.newFixedThreadPool(threadsCount)
        val complete = AtomicInteger(0)
        val success = AtomicInteger(0)
        val total = selections.size
        val tasks = mutableListOf<Future<*>>()
        val context = Utils.getContext()
        val notifyId = notifyIdGenerator.getAndIncrement()
        val nm = context.requireSystemService<NotificationManager>()
        executors.execute {
            val initProgress = Triple(total, 0, false)
            nm.showNotification(notifyId, "缓存视频导出中：0/$total", ongoing = true, progress = initProgress)
            for (selection in selections) {
                val entry = selection.entry
                val saveDir = selection.saveDir
                val videoPath = File(saveDir, "video.m4s").absolutePath
                val audioPath = File(saveDir, "audio.m4s").absolutePath
                val exportPath = File(videosDir, "${entry.saveFilename}.mp4").absolutePath
                executors.submit {
                    runCatching {
                        MediaMerger.merge(videoPath, audioPath, exportPath)
                        success.incrementAndGet()
                    }.onFailure {
                        Logger.error(it) { "video merge failed, avId: ${entry.avid}, epId: ${entry.ep.episodeId}, name: ${entry.showName}" }
                        File(exportPath).delete()
                        nm.showNotification(notifyIdGenerator.getAndIncrement(), "缓存视频导出失败", entry.showName)
                    }
                    val completeCount = complete.incrementAndGet()
                    val title = "缓存视频导出中：$completeCount/$total"
                    val progress = Triple(total, completeCount, false)
                    nm.showNotification(notifyId, title, entry.showName, ongoing = true, progress = progress)
                }.let { tasks.add(it) }
            }
            tasks.forEach { it.runCatchingOrNull { get() } }
            val title = when (val successCount = success.get()) {
                0 -> "缓存视频导出完成，全部失败"
                total -> "缓存视频导出完成，全部成功"
                else -> "缓存视频导出完成，部分成功：$successCount/$total"
            }
            val text = "导出路径为：${videosDir.absolutePath}"
            nm.showNotification(notifyId, title, text)
            MediaScannerConnection.scanFile(context, videosDir.list().orEmpty(), null, null)
            exporting = false
            executors.shutdown()
        }
    }
}
