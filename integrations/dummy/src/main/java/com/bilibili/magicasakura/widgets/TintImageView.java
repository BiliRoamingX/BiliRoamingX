package com.bilibili.magicasakura.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

@SuppressLint("AppCompatCustomView")
public class TintImageView extends ImageView {
    public TintImageView(Context context) {
        super(context);
    }

    public TintImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TintImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setImageTintList(int i14) {
    }
}
