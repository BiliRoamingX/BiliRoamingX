package app.revanced.bilibili.settings.dialog

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import app.revanced.bilibili.utils.*

/**
 * Created by iAcn on 2019/7/14
 * Email i@iacn.me
 */
@SuppressLint("SetTextI18n")
class ColorChooseDialog(
    context: Context,
    defColor: Int,
    private val onConfirm: (color: Int) -> Unit
) : AlertDialog.Builder(context) {
    private val view = context.inflateLayout("biliroaming_dialog_color_choose")
    private val sampleView: View = view.findView("biliroaming_view_sample")
    private val etColor: EditText = view.findView("biliroaming_et_color")
    private val sbColorR: SeekBar = view.findView("biliroaming_sb_colorR")
    private val sbColorG: SeekBar = view.findView("biliroaming_sb_colorG")
    private val sbColorB: SeekBar = view.findView("biliroaming_sb_colorB")
    private val tvColorR: TextView = view.findView("biliroaming_tv_colorR")
    private val tvColorG: TextView = view.findView("biliroaming_tv_colorG")
    private val tvColorB: TextView = view.findView("biliroaming_tv_colorB")

    val color: Int
        get() = Color.rgb(sbColorR.progress, sbColorG.progress, sbColorB.progress)

    private fun setEditTextListener() {
        etColor.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                updateValue(s.toString().toIntColor())
            }
        })
    }

    private fun setSeekBarListener() {
        val listener: OnSeekBarChangeListener = object : OnSeekBarChangeListener {
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (fromUser)
                    etColor.setText(color.toHexColor(alpha = false))
                tvColorR.text = sbColorR.progress.toString()
                tvColorG.text = sbColorG.progress.toString()
                tvColorB.text = sbColorB.progress.toString()
            }
        }
        sbColorR.setOnSeekBarChangeListener(listener)
        sbColorG.setOnSeekBarChangeListener(listener)
        sbColorB.setOnSeekBarChangeListener(listener)
    }

    private fun updateValue(color: Int) {
        sampleView.setBackgroundColor(color)
        val progressR = Color.red(color)
        val progressG = Color.green(color)
        val progressB = Color.blue(color)
        sbColorR.progress = progressR
        sbColorG.progress = progressG
        sbColorB.progress = progressB
        tvColorR.text = progressR.toString()
        tvColorG.text = progressG.toString()
        tvColorB.text = progressB.toString()
    }

    override fun show(): AlertDialog = super.create().constraintSize().apply { show() }

    init {
        setView(view)
        setEditTextListener()
        setSeekBarListener()
        updateValue(defColor)
        etColor.setText(defColor.toHexColor(alpha = false))
        setTitle(Utils.getString("biliroaming_dialog_color_picker_title"))
        setPositiveButton(android.R.string.ok) { _, _ -> onConfirm(color) }
        setNegativeButton(android.R.string.cancel, null)
    }
}
