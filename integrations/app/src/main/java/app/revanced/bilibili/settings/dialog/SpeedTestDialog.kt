package app.revanced.bilibili.settings.dialog

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.net.Uri
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import app.revanced.bilibili.api.BiliRoamingApi.getPlayUrl
import app.revanced.bilibili.api.CustomServerException
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONObject
import java.net.URL
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

data class SpeedTestResult(
    val name: String,
    val value: String,
    var speed: String,
    var selected: Boolean
)

@SuppressLint("ViewConstructor")
class SpeedTestItemView(
    context: Context,
    name: String = "",
    speed: String = "",
    selected: Boolean = false
) : LinearLayout(context) {
    private val nameView: TextView
    private val speedView: TextView
    private val checkedView: RadioButton

    var name: String
        get() = nameView.text.toString()
        set(value) {
            nameView.text = value
        }

    var speed: String
        get() = speedView.text.toString()
        set(value) {
            speedView.text = value
        }

    @get:JvmName("selected")
    @set:JvmName("selected")
    var selected: Boolean
        get() = checkedView.isChecked
        set(value) {
            checkedView.isChecked = value
            checkedView.visibility = if (value) View.VISIBLE else View.INVISIBLE
        }

    init {
        orientation = HORIZONTAL
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        nameView = TextView(context).apply {
            setPadding(5.dp, 5.dp, 5.dp, 5.dp)
            setSingleLine()
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
            layoutParams = LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { weight = 3f }
        }.also { addView(it) }
        speedView = TextView(context).apply {
            setPadding(5.dp, 5.dp, 5.dp, 5.dp)
            setSingleLine()
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
            layoutParams = LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { weight = 2f }
        }.also { addView(it) }
        val radioButton = Widgets.createTintView<RadioButton>(context, "RadioButton")
        checkedView = radioButton.apply {
            layoutParams = LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply {
                weight = 0.7f
                gravity = Gravity.CENTER_VERTICAL
            }
        }.also { addView(it) }
        this.name = name
        this.speed = speed
        this.selected = selected
    }
}

class SpeedTestAdapter(private val context: Context) : ArrayAdapter<SpeedTestResult>(context, 0) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return (convertView as? SpeedTestItemView ?: SpeedTestItemView(context)).apply {
            getItem(position)?.let {
                name = it.name
                speed = Utils.getString("biliroaming_speed_formatter", it.speed)
                selected = it.selected
            }
        }
    }

    fun sort() = sort { a, b ->
        val aSpeed = a.speed.toLongOrNull()
        val bSpeed = b.speed.toLongOrNull()
        if (aSpeed == null && bSpeed == null) 0
        else if (aSpeed == null) 1
        else if (bSpeed == null) -1
        else (bSpeed - aSpeed).toInt()
    }
}

class SpeedTestDialog(context: Context, onDismiss: (Boolean) -> Unit) :
    AlertDialog.Builder(context) {
    private val speedTestExecutor = Executors.newFixedThreadPool(2)

    private val view = ListView(context)
    private val adapter = SpeedTestAdapter(context)
    private var changed = false

    init {
        view.adapter = adapter
        view.addHeaderView(
            SpeedTestItemView(
                context,
                name = "UPOS",
                speed = Utils.getString("biliroaming_speed")
            ), null, false
        )
        view.setPadding(16.dp, 10.dp, 16.dp, 10.dp)
        setView(view)
        setPositiveButton(Utils.getString("biliroaming_close"), null)
        setOnDismissListener {
            speedTestExecutor.shutdown()
            onDismiss(changed)
        }
        view.setOnItemClickListener { _, _, pos, _ ->
            val (name, value, _) = adapter.getItem(pos - 1/*headerView*/)
                ?: return@setOnItemClickListener
            Settings.UposHost.save(value)
            for (i in 0 until adapter.count) {
                val item = adapter.getItem(i) ?: continue
                item.selected = item.value == value
            }
            adapter.notifyDataSetChanged()
            changed = true
            Toasts.showShortWithId("biliroaming_upos_enabled", name)
        }

        setTitle(Utils.getString("biliroaming_test_upos_title"))
    }

    override fun show(): AlertDialog {
        val dialog = super.create().constraintSize(maxHeight = -1).apply { show() }
        dialog.setTitle(Utils.getString("biliroaming_speed_testing"))
        val results = Utils.getStringArray("biliroaming_upos_entries")
            .zip(Utils.getStringArray("biliroaming_upos_values"))
            .map { (name, value) ->
                SpeedTestResult(name, value, "...", value == Settings.UposHost())
            }.also { adapter.addAll(it) }
        speedTestExecutor.execute {
            val url = getTestUrl() ?: run {
                Utils.runOnMainThread {
                    dialog.setTitle(Utils.getString("biliroaming_speed_test_failed"))
                }
                return@execute
            }
            results.forEach {
                it.speed = speedTest(it.value, url).toString()
                Utils.runOnMainThread {
                    adapter.sort()
                }
            }
            Utils.runOnMainThread {
                dialog.setTitle(Utils.getString("biliroaming_speed_test_ok"))
            }
        }
        return dialog
    }

    private fun speedTest(upos: String, rawUrl: String) = try {
        speedTestExecutor.submit<Long?> {
            val url = if (upos == Constants.NON_UPOS_VALUE) URL(rawUrl) else {
                URL(Uri.parse(rawUrl).buildUpon().authority(upos).toString())
            }
            val connection = url.openConnection()
            connection.connectTimeout = 5000
            connection.readTimeout = 5000
            connection.setRequestProperty("User-Agent", "Bilibili Freedoooooom/MarkII")
            connection.connect()
            val buffer = ByteArray(8192)
            var size = 0
            val start = System.currentTimeMillis()
            connection.getInputStream().use { stream ->
                while (!Thread.currentThread().isInterrupted) {
                    val read = stream.read(buffer)
                    if (read <= 0) break
                    size += read
                }
            }
            size / (System.currentTimeMillis() - start) // KB/s
        }.get(5, TimeUnit.SECONDS)
    } catch (e: Throwable) {
        0L
    }

    private val overseaTestParams = mapOf(
        "ep_id" to "285145",
        "fnval" to "16",
        "platform" to "android",
        "test" to "true"
    )
    private val mainlandTestParams = mapOf(
        "ep_id" to "100615",
        "fnval" to "16",
        "platform" to "android",
        "test" to "true"
    )

    private fun getTestUrl() = try {
        speedTestExecutor.submit<String?> {
            val json = if (area == Area.China) {
                getPlayUrl(overseaTestParams, arrayOf(Area.HongKong, Area.TaiWan))
            } else getPlayUrl(mainlandTestParams, arrayOf(Area.China))
            json?.toJSONObject()?.optJSONObject("dash")?.getJSONArray("audio")
                ?.asSequence<JSONObject>()
                ?.minWithOrNull { a, b -> a.optInt("bandwidth") - b.optInt("bandwidth") }
                ?.optString("base_url")?.replace("https", "http")
        }.get(5, TimeUnit.SECONDS)
    } catch (e: CustomServerException) {
        Logger.error(e) { "UPOS 测速失败, ${e.message}" }
        null
    } catch (e: Throwable) {
        Logger.error(e) { "UPOS 测速失败, message: ${e.message}" }
        null
    }
}
