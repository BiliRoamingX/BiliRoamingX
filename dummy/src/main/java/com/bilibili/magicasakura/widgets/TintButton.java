package com.bilibili.magicasakura.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

@SuppressLint("AppCompatCustomView")
public class TintButton extends RadioButton {
    public TintButton(Context context) {
        super(context);
    }

    public TintButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TintButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setBackgroundTintList(int i14) {
    }
}
