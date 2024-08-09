package app.revanced.bilibili.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import app.revanced.bilibili.utils.Reflex;
import tv.danmaku.bili.widget.preference.BLRadioGroupEntrancePreference;

public class RadioGroupEntrancePreference extends BLRadioGroupEntrancePreference {
    public RadioGroupEntrancePreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RadioGroupEntrancePreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Nullable
    @Override
    public CharSequence getSummary() {
        if (isEnabled()) {
            return super.getSummary();
        } else {
            return Reflex.getObjectField(this, "mSummary");
        }
    }
}
