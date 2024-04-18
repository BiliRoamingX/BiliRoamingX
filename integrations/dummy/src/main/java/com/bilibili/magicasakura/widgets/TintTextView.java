package com.bilibili.magicasakura.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class TintTextView extends TextView {
    public TintTextView(Context context) {
        super(context);
    }

    public TintTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TintTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
