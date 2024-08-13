package app.revanced.bilibili.patches

import android.annotation.SuppressLint
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bilibili.music.podcast.view.PodcastSpeedSeekBar
import tv.danmaku.ijk.media.player.IMediaPlayer

object PlaybackSpeedPatch {

    @JvmStatic
    private val stockSpeedArray = floatArrayOf(2.0f, 1.5f, 1.25f, 1.0f, 0.75f, 0.5f)

    @JvmStatic
    private val stockReverseSpeedArray = floatArrayOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f)

    @JvmStatic
    private var cacheOverrideSpeed = ""

    @JvmStatic
    private var cacheSpeedArray = floatArrayOf()

    @JvmStatic
    private var cacheReverseSpeedArray = floatArrayOf()

    @JvmStatic
    private val newSpeedArray: FloatArray
        get() = if (cacheOverrideSpeed == Settings.OverridePlaybackSpeed()) {
            cacheSpeedArray
        } else {
            cacheOverrideSpeed = Settings.OverridePlaybackSpeed()
            cacheSpeedArray = cacheOverrideSpeed.let { v ->
                if (v.isEmpty()) floatArrayOf()
                else v.split(' ').map { it.toFloat() }.toFloatArray()
            }
            cacheReverseSpeedArray = cacheSpeedArray.reversedArray()
            cacheSpeedArray
        }

    @JvmStatic
    private val newSpeedReversedArray: FloatArray
        get() = if (cacheOverrideSpeed == Settings.OverridePlaybackSpeed()) {
            cacheReverseSpeedArray
        } else {
            cacheOverrideSpeed = Settings.OverridePlaybackSpeed()
            cacheSpeedArray = cacheOverrideSpeed.let { v ->
                if (v.isEmpty()) floatArrayOf()
                else v.split(' ').map { it.toFloat() }.toFloatArray()
            }
            cacheReverseSpeedArray = cacheSpeedArray.reversedArray()
            cacheReverseSpeedArray
        }

    @Keep
    @JvmStatic
    fun defaultSpeed(player: IMediaPlayer?, speed: Float): Float {
        // only apply to video, not apply to podcast
        if (player != null && player.videoSarNum <= 0) return speed
        val customSpeed = Settings.DefaultPlaybackSpeed()
        return if (customSpeed != 0f) customSpeed else speed
    }

    @Keep
    @JvmStatic
    fun defaultSpeed(speed: Float) = defaultSpeed(null, speed)

    @Keep
    @JvmStatic
    fun longPressSpeed(speed: Float): Float {
        if (speed == 2.0f || speed == 3.0f) {
            val customSpeed = Settings.LongPressPlaybackSpeed()
            if (customSpeed != 0f) return customSpeed
        }
        return speed
    }

    @Keep
    @JvmStatic
    fun getOverrideSpeedArray(original: FloatArray): FloatArray {
        return newSpeedArray.let { if (it.isNotEmpty()) it else original }
    }

    @Keep
    @JvmStatic
    fun getOverrideReverseSpeedArray(original: FloatArray): FloatArray {
        return newSpeedReversedArray.let { if (it.isNotEmpty()) it else original }
    }

    @Keep
    @JvmStatic
    @SuppressLint("SetTextI18n")
    fun onNewPlaybackSpeedSetting(setting: Any) {
        val newSpeedReversedArray = newSpeedReversedArray.takeIf { it.isNotEmpty() }
            ?: stockReverseSpeedArray
        val clazz = setting.javaClass
        val playSpeedTextGroupId = Utils.getResId("playback_speed_text_group", "id")
        val speedTextColorId = Utils.getResId("selector_bplayer_selector_panel_text_pink", "color")
        val speedTextGroupField = clazz.declaredFields.filter {
            it.type == ViewGroup::class.java
        }.firstNotNullOfOrNull {
            it.isAccessible = true
            if ((it.get(setting) as? ViewGroup)?.id == playSpeedTextGroupId) {
                it
            } else null
        } ?: return
        val speedTextGroup = speedTextGroupField.get(setting) as ViewGroup
        val context = speedTextGroup.context
        val scrollView = HorizontalScrollView(context).apply {
            id = speedTextGroup.id
            layoutParams = speedTextGroup.layoutParams
            isHorizontalScrollBarEnabled = false
        }
        val newSpeedTextGroup = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
            )
        }.also { scrollView.addView(it) }
        (speedTextGroup.parent as ViewGroup).apply {
            removeView(speedTextGroup)
            addView(scrollView)
        }
        val newSpeedText = { speed: Float, id: Int ->
            TextView(context).apply {
                text = speed.toString()
                this.id = id
                setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14F)
                setTextColor(context.getColor(speedTextColorId))
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            }
        }
        val newSpeedIdMap = newSpeedReversedArray.associateWith { View.generateViewId() }
        newSpeedIdMap.forEach { (speed, id) ->
            newSpeedText(speed, id).let { newSpeedTextGroup.addView(it) }
        }
        newSpeedTextGroup.children.forEachIndexed { index, view ->
            when (index) {
                0 -> view.setPadding(12.dp, 4.dp, 16.dp, 4.dp)

                newSpeedTextGroup.childCount - 1 ->
                    view.setPadding(16.dp, 4.dp, 12.dp, 4.dp)

                else -> view.setPadding(16.dp, 4.dp, 16.dp, 4.dp)
            }
        }
        speedTextGroupField.set(setting, newSpeedTextGroup)
        Reflex.findFirstFieldByExactTypeOrNull(clazz, IntArray::class.java)
            ?.set(null, newSpeedIdMap.values.toIntArray())
        Reflex.findFirstFieldByExactTypeOrNull(clazz, FloatArray::class.java)
            ?.set(null, newSpeedReversedArray)
    }

    @Keep
    @JvmStatic
    fun onNewPodcastSpeedSeekBar(seekBar: PodcastSpeedSeekBar) {
        val newSpeedReversedArray = newSpeedReversedArray.takeIf { it.isNotEmpty() }
            ?: stockReverseSpeedArray
        val speedNameList = seekBar.speedNameListForBiliRoaming.ifEmpty { return }
        val pairClass = speedNameList.first().javaClass
        speedNameList.clear()
        speedNameList.addAll(newSpeedReversedArray.map { pairClass.new(it, "${it}x") })
        seekBar.setSpeedArrayForBiliRoaming(newSpeedReversedArray)
        seekBar.max = newSpeedReversedArray.lastIndex.coerceAtLeast(0) * 100
    }

    @Keep
    @JvmStatic
    fun onUnitePlayerSetSpeedMenu(original: Array<String>): Array<String> {
        val speeds = newSpeedReversedArray
        return if (speeds.isNotEmpty())
            speeds.map { it.toString() }.toTypedArray()
        else original
    }
}
