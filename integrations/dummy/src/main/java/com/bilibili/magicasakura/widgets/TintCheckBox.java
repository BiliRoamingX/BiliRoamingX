package com.bilibili.magicasakura.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

@SuppressLint("AppCompatCustomView")
public class TintCheckBox extends CheckBox {
    public TintCheckBox(Context context) {
        super(context);
    }

    public TintCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TintCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setCompoundButtonTintList(int resId) {
    }
}
