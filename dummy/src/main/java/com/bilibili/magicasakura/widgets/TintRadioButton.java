package com.bilibili.magicasakura.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

@SuppressLint("AppCompatCustomView")
public class TintRadioButton extends RadioButton {
    public TintRadioButton(Context context) {
        super(context);
    }

    public TintRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TintRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setCompoundButtonTintList(int resId) {
    }
}
