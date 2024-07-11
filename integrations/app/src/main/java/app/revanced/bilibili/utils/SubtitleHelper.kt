package app.revanced.bilibili.utils

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.BitmapFactory.Options
import app.revanced.bilibili.settings.Settings
import org.json.JSONArray
import org.json.JSONObject
import java.io.*
import java.net.URL
import java.nio.ByteBuffer
import java.util.zip.GZIPInputStream

class TrieNode<V>(val key: Char, val level: Int = 0) {
    private val children = hashMapOf<Char, TrieNode<V>>()

    val isLeaf get() = value != null
    var value: V? = null

    fun getOrAddChild(k: Char) = children.computeIfAbsent(k) { TrieNode(k, level + 1) }

    fun child(k: Char) = children[k]
}

class Trie<T> {
    private val root = TrieNode<T>(key = '\u0000')

    fun add(w: String, value: T) {
        if (w.isEmpty()) return
        var p = root
        for (c in w.toCharArray())
            p = p.getOrAddChild(c)
        p.value = value
    }

    fun bestMatch(sen: CharArray): TrieNode<T>? {
        var node: TrieNode<T> = root
        var leaf: TrieNode<T>? = null
        for (c in sen) {
            node = node.child(c) ?: break
            if (node.isLeaf) leaf = node
        }
        return leaf
    }
}

class Dictionary(
    private val chars: Map<Char, Char>,
    private val dict: Trie<String>,
    private val maxLen: Int
) {
    private fun convert(reader: Reader, writer: Writer) {
        val `in` = PushbackReader(reader.buffered(), maxLen)
        val buf = CharArray(maxLen)
        var len: Int

        while (true) {
            len = `in`.read(buf)
            if (len == -1) break
            val node = dict.bestMatch(buf)
            if (node != null) {
                val offset = node.level
                node.value?.let { writer.write(it) }
                `in`.unread(buf, offset, len - offset)
            } else {
                `in`.unread(buf, 0, len)
                val ch = `in`.read().toChar()
                writer.write(chars.getOrDefault(ch, ch).code)
            }
        }
    }

    fun convert(str: String) = StringWriter().also {
        convert(str.reader(), it)
    }.toString()

    companion object {
        private const val SHARP = '#'
        private const val EQUAL = '='

        fun loadDictionary(mappingFile: File): Dictionary {
            val charMap = HashMap<Char, Char>(4096)
            val dict = Trie<String>()
            var maxLen = 2
            mappingFile.bufferedReader().useLines { lines ->
                lines.filterNot { it.isBlank() || it.trimStart().startsWith(SHARP) }
                    .map { it.split(EQUAL, limit = 2) }.filter { it.size == 2 }.forEach { (k, v) ->
                        if (k.length == 1 && v.length == 1) {
                            charMap[k[0]] = v[0]
                        } else {
                            maxLen = k.length.coerceAtLeast(maxLen)
                            dict.add(k, v)
                        }
                    }
            }
            return Dictionary(charMap, dict, maxLen)
        }
    }
}

object SubtitleHelper {
    private val dictFile by lazy { File(Utils.getContext().filesDir, "t2cn.txt") }
    private val tmpDictFile by lazy { File(Utils.getContext().filesDir, "t2cn.txt.tmp") }
    private const val DICT_URL =
        "https://archive.biliimg.com/bfs/archive/566adec17e127bf92aed21832db0206ccecc8caa.png"
    private const val CHECK_INTERVAL = 60 * 1000

    private val assTextStyleRegex = Regex("""\{.*?\}""")
    private val needMergeRegex = Regex(".*(,|[a-z]|[A-Z])$")
    private val vttOrSrtTimeLineRegex =
        Regex("""((?<fromH>\d{2,4}):)?(?<fromM>\d{2}):(?<fromS>\d{2}[.,]\d{2,3})\s-->\s((?<toH>\d{2,4}):)?(?<toM>\d{2}):(?<toS>\d{2}[.,]\d{2,3})""")
    private val appendedInfoRegex =
        Regex("""\n?(「字幕.*?」|（禁止.*?(拉黑|相关内容)）|请注意，.*?拉黑)\n?""")

    // vtt reference: https://developer.mozilla.org/zh-CN/docs/Web/API/WebVTT_API
    // srt reference: https://docs.fileformat.com/video/srt/#formatting-of-srt-files
    private val vttOrSrtCueStyleRegex = Regex("""(^-+\s?)|(<.*?>)|(\{.*?\})""")

    @JvmStatic
    val dictExist get() = dictFile.isFile

    private fun downloadDictFromCdn(): Boolean {
        if (dictExist) return true
        runCatching {
            val buffer = URL(DICT_URL).openStream().buffered().use {
                val options = Options().apply { inPreferredConfig = Bitmap.Config.RGB_565 }
                val bitmap = BitmapFactory.decodeStream(it, null, options)
                ByteBuffer.allocate(bitmap!!.byteCount).apply {
                    bitmap.let { b -> b.copyPixelsToBuffer(this); b.recycle() }
                    rewind()
                }
            }
            val bytes = ByteArray(buffer.int).also { buffer.get(it) }
            dictFile.outputStream().use { o ->
                GZIPInputStream(bytes.inputStream()).use { it.copyTo(o) }
            }
        }.onSuccess {
            return true
        }.onFailure {
            Logger.error(it) { "failed to download subtitle convert dict from cdn" }
            dictFile.delete()
        }
        return false
    }

    @JvmStatic
    fun checkDictUpdate(): Boolean {
        val lastCheckTime = cachePrefs.getLong("subtitle_dict_last_check_time", 0)
        if (System.currentTimeMillis() - lastCheckTime < CHECK_INTERVAL && dictExist)
            return false
        cachePrefs.edit {
            putLong("subtitle_dict_last_check_time", System.currentTimeMillis())
        }
        val url = "https://api.github.com/repos/BBSub/ZhConvertDict/releases/latest"
        val json = runCatching {
            JSONObject(URL(url).readText())
        }.onFailure { Logger.error(it) { "failed to get dict api response" } }
            .getOrNull() ?: return if (!dictExist) downloadDictFromCdn() else false
        val tagName = json.optString("tag_name")
        val latestVer = cachePrefs.getString("subtitle_dict_latest_version", null).orEmpty()
        if (latestVer != tagName || !dictExist) {
            val sha256sum = json.optString("body")
                .takeUnless { it.isNullOrEmpty() } ?: return false
            var dictUrl = json.optJSONArray("assets")
                ?.optJSONObject(0)?.optString("browser_download_url")
                .takeUnless { it.isNullOrEmpty() } ?: return false
            dictUrl = speedupGhUrl(dictUrl)
            runCatching {
                tmpDictFile.outputStream().use { o ->
                    GZIPInputStream(URL(dictUrl).openStream())
                        .use { it.copyTo(o) }
                }
            }.onSuccess {
                if (tmpDictFile.sha256Hex == sha256sum
                    && (dictFile.takeIf { it.exists() }?.delete() != false)
                    && tmpDictFile.renameTo(dictFile)
                ) {
                    cachePrefs.edit {
                        putString("subtitle_dict_latest_version", tagName)
                    }
                    return true
                }
                tmpDictFile.delete()
            }.onFailure {
                Logger.error(it) { "failed to download subtitle convert dict" }
                tmpDictFile.delete()
            }
        }
        return if (!dictExist) downloadDictFromCdn() else false
    }

    @JvmStatic
    fun reloadDict() {
        dict(true)
    }

    @Volatile
    private var dict: Dictionary? = null
    private fun dict(reload: Boolean = false): Dictionary {
        val d = dict
        if (!reload && d != null)
            return d
        synchronized(this) {
            var newD = dict
            if (reload || newD == null)
                newD = Dictionary.loadDictionary(dictFile)
            dict = newD
            return newD
        }
    }

    @JvmStatic
    fun convert(json: String): String {
        val subJson = JSONObject(json)
        var subBody = subJson.optJSONArray("body") ?: return json
        val subText = subBody.asSequence<JSONObject>().map {
            it.optString("content")
        }.joinToString("\u0000")
            // Remove srt style, bilibili not support it
            .replace(vttOrSrtCueStyleRegex, "")
        val converted = dict().convert(subText)
        val lines = converted.split('\u0000')
        subBody.asSequence<JSONObject>().zip(lines.asSequence()).forEach { (obj, line) ->
            obj.put("content", line)
        }
        subBody = subBody.appendInfo("请注意，站内宣传漫游或脚本会被拉黑")
        return subJson.apply {
            put("body", subBody)
        }.toString()
    }

    @JvmStatic
    fun errorResponse(content: String) = JSONObject().apply {
        put("body", JSONArray().apply {
            put(JSONObject().apply {
                put("from", 0)
                put("location", 2)
                put("to", 9999)
                put("content", content)
            })
        })
    }.toString()

    @JvmStatic
    fun translate(json: String): String {
        fun String.format(): String {
            val lines = this.lines()
            if (lines.size == 1) return this
            val result = StringBuilder()
            lines.forEach { line ->
                val trimmed = line.trim()
                result.append(trimmed)
                if (trimmed.matches(needMergeRegex)) {
                    result.append(' ')
                } else {
                    result.appendLine()
                }
            }
            return result.toString().trimEnd()
        }

        val subJson = JSONObject(json)
        var subBody = subJson.optJSONArray("body") ?: return json
        val texts = subBody.asSequence<JSONObject>()
            .map { it.optString("content").format() }.toList()
        val server = Settings.SubtitleTranslateServer()
        val translator = if (server == "microsoft") MicrosoftTranslator else GoogleTranslator
        val trans = translator.translate(texts).ifEmpty {
            return errorResponse("字幕翻译失败，请检查网络是否可以访问翻译服务提供商")
        }
        subBody.asSequence<JSONObject>().zip(trans.asSequence()).forEach { (item, content) ->
            val prettyContent = content.replace("。。。", "...").removeSuffix("，").removeSuffix("。")
            item.put("content", prettyContent)
        }
        subBody = subBody.appendInfo("请注意，站内宣传漫游或脚本会被拉黑")
        return subJson.apply {
            put("body", subBody)
        }.toString()
    }

    private fun JSONArray.appendInfo(content: String): JSONArray {
        if (length() == 0) return this
        val firstLine = optJSONObject(0)
            ?: return this
        val lastLine = optJSONObject(length() - 1)
            ?: return this
        val firstFrom = firstLine.optDouble("from")
            .takeIf { !it.isNaN() } ?: return this
        val lastTo = lastLine.optDouble("to")
            .takeIf { !it.isNaN() } ?: return this
        val minDuration = 1.0
        val maxDuration = 5.0
        val interval = 0.3
        val appendStart = firstFrom >= minDuration + interval
        val from = if (appendStart) 0.0 else lastTo + interval
        val to = if (appendStart) {
            from + (firstFrom - interval).coerceAtMost(maxDuration)
        } else from + maxDuration
        val info = JSONObject().apply {
            put("from", from)
            put("location", 2)
            put("to", to)
            put("content", content)
        }
        return if (appendStart) {
            JSONArray().apply {
                put(info)
                for (jo in this@appendInfo) {
                    put(jo)
                }
            }
        } else apply { put(info) }
    }

    fun ass2Bcc(ass: String): String {
        var layerIndex = -1
        var startIndex = -1
        var endIndex = -1
        var textIndex = -1
        val body = JSONArray()
        val result = JSONObject().put("body", body)

        fun String.toSeconds(): Float {
            val (h, m, s) = split(':')
            return h.toInt() * 60 * 60 + m.toInt() * 60 + s.toFloat()
        }

        fun String.format() = replace(assTextStyleRegex, "")
            .replace("\\h", " ")
            .replace("\\N", "\n")

        class Timeline(val layer: Int, val from: Float, val to: Float, val text: String, var handled: Boolean = false)

        val lines = ass.lines()
        var formatParsed = false
        val timelines = mutableListOf<Timeline>()
        lines.withIndex().forEach { (index, line) ->
            if (!formatParsed && line.startsWith("[Events]")) {
                val eventFormat = lines[index + 1]
                if (!eventFormat.startsWith("Format:"))
                    error("invalid ass subtitle")
                val names = eventFormat.removePrefix("Format:")
                    .split(',', limit = 10).map(String::trim)
                layerIndex = names.indexOf("Layer")
                startIndex = names.indexOf("Start")
                endIndex = names.indexOf("End")
                textIndex = names.indexOf("Text")
                if (layerIndex == -1 || startIndex == -1 || endIndex == -1 || textIndex == -1)
                    error("invalid ass subtitle")
                formatParsed = true
            } else if (line.startsWith("Dialogue:")) {
                val values = line.removePrefix("Dialogue:")
                    .trim().split(',', limit = 10)
                val layer = values[layerIndex]
                val start = values[startIndex]
                val end = values[endIndex]
                val text = values[textIndex]
                timelines.add(Timeline(layer.toInt(), start.toSeconds(), end.toSeconds(), text.format()))
            }
        }
        timelines.forEach { timeline ->
            if (!timeline.handled) {
                val mergedText = timelines.filter {
                    it.from == timeline.from && it.to == timeline.to
                }.onEach { it.handled = true }.sortedByDescending { it.layer }
                    .joinToString("\n") { it.text }
                JSONObject().apply {
                    put("from", timeline.from)
                    put("to", timeline.to)
                    put("location", 2)
                    put("content", mergedText)
                }.let { body.put(it) }
            }
        }

        return result.toString()
    }

    fun vttOrSrt2Bcc(vtt: String): String {
        // reference: https://developer.mozilla.org/zh-CN/docs/Web/API/WebVTT_API
        val body = JSONArray()
        val result = JSONObject().put("body", body)

        fun MatchGroupCollection.timeline(): Pair<Float, Float> {
            val fromH = this["fromH"]?.value.orEmpty()
            val fromM = this["fromM"]?.value.orEmpty()
            val fromS = this["fromS"]?.value.orEmpty()
            val toH = this["toH"]?.value.orEmpty()
            val toM = this["toM"]?.value.orEmpty()
            val toS = this["toS"]?.value.orEmpty()
            val from = fromH.ifEmpty { "0" }.toInt() * 60 * 60 +
                    fromM.toInt() * 60 + fromS.replace(',', '.').toFloat()
            val to = toH.ifEmpty { "0" }.toInt() * 60 * 60 +
                    toM.toInt() * 60 + toS.replace(',', '.').toFloat()
            return from to to
        }

        fun String.format() = replace(vttOrSrtCueStyleRegex, "")
            .replace("&amp;", "&")
            .replace("&lt;", "<")
            .replace("&gt;", ">")
            .replace("&lrm;", "")
            .replace("&rlm;", "")
            .replace("&nbsp;", " ")

        var from = 0f
        var to = 0f
        var content = StringBuilder()
        var newLine = false
        vtt.lineSequence().forEach { line ->
            val timeline = vttOrSrtTimeLineRegex.find(line)?.groups?.timeline()
            if (timeline != null) {
                newLine = true
                from = timeline.first
                to = timeline.second
            } else if (newLine && line.isNotBlank()) {
                if (content.isNotEmpty())
                    content.appendLine()
                content.append(line.format())
            } else if (newLine) {
                body.put(JSONObject().apply {
                    put("from", from)
                    put("to", to)
                    put("location", 2)
                    put("content", content.toString())
                })
                content = StringBuilder()
                newLine = false
            }
        }
        if (newLine) {
            // maybe not ends with empty line
            body.put(JSONObject().apply {
                put("from", from)
                put("to", to)
                put("location", 2)
                put("content", content.toString())
            })
        }
        return result.toString()
    }

    fun formatBcc(bcc: String): String = bcc.toJSONObject().run {
        optJSONArray("body").orEmpty()
            .removeAppendedInfo().reSort().let {
                put("body", it)
            }
    }.toString(2)

    fun bccToSrt(bcc: String): String {
        val lines = bcc.toJSONObject().optJSONArray("body").orEmpty()

        fun Double.toTime(): String {
            val time = this
            val ms = (1000 * (time - time.toInt())).toInt()
            val seconds = time.toInt()
            val sec = seconds % 60
            val minutes = seconds / 60
            val min = minutes % 60
            val hour = minutes / 60
            return "%02d:%02d:%02d,%03d".format(hour, min, sec, ms)
        }

        var lineCount = 1
        val result = StringBuilder()
        for (o in lines) {
            val content = o.optString("content")
            val from = o.optDouble("from")
            val to = o.optDouble("to")
            result.appendLine(lineCount++)
            result.appendLine(from.toTime() + " --> " + to.toTime())
            result.appendLine(content.trim())
            result.appendLine()
        }
        return result.toString()
    }

    private fun JSONArray.removeAppendedInfo() = apply {
        (5 downTo 0).forEach { idx ->
            optJSONObject(idx)?.run {
                val newContent = optString("content").replace(appendedInfoRegex, "")
                if (newContent.isEmpty()) remove(idx) else put("content", newContent)
            }
        }

        // try merge same line after purge
        var end = -1
        var start = -1
        var content = ""
        var from = 0.0
        var to = 0.0
        (5 downTo 0).forEach { idx ->
            optJSONObject(idx)?.let {
                val f = it.optDouble("from")
                val t = it.optDouble("to")
                val c = it.optString("content")
                if (end == -1) {
                    end = idx; content = c; to = t; from = f
                } else {
                    if (c != content) {
                        if (start != -1) {
                            for (i in end downTo start + 1)
                                remove(i)
                            optJSONObject(start)?.put("to", to)
                        }
                        end = idx; content = c; to = t; from = f; start = -1
                    } else if (t == from) {
                        start = idx; from = t
                        if (start == 0) {
                            for (i in end downTo 1)
                                remove(i)
                            optJSONObject(0)?.put("to", to)
                        }
                    }
                }
            }
        }

        val lastIdx = length() - 1
        optJSONObject(lastIdx)?.run {
            if (optString("content").matches(appendedInfoRegex)) {
                remove(lastIdx)
            }
        }
    }

    private fun JSONArray.reSort() = apply {
        for (o in this) {
            val content = o.getString("content")
            val from = o.getDouble("from")
            val location = o.getInt("location")
            val to = o.getDouble("to")
            o.remove("content")
            o.remove("from")
            o.remove("location")
            o.remove("to")
            o.put("content", content)
            o.put("from", from)
            o.put("to", to)
            o.put("location", location)
        }
    }
}
