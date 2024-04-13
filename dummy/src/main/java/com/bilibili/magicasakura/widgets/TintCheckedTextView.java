package com.bilibili.magicasakura.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

@SuppressLint("AppCompatCustomView")
public class TintCheckedTextView extends CheckedTextView {
    public TintCheckedTextView(Context context) {
        super(context);
    }

    public TintCheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TintCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
