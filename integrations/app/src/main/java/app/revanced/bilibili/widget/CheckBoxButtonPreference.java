package app.revanced.bilibili.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.CheckBoxPreference;

public class CheckBoxButtonPreference extends CheckBoxPreference {
    private String mValue;
    private OnPreferenceClickListener mOnClickListener;

    public CheckBoxButtonPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CheckBoxButtonPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public CheckBoxButtonPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckBoxButtonPreference(@NonNull Context context) {
        super(context);
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

    public OnPreferenceClickListener getPreferenceClickListener() {
        return mOnClickListener;
    }

    public void setPreferenceClickListener(OnPreferenceClickListener listener) {
        mOnClickListener = listener;
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void performClick() {
        if (!isEnabled() || !isSelectable())
            return;
        onClick();
        if (mOnClickListener != null)
            mOnClickListener.onPreferenceClick(this);
    }

    public interface OnPreferenceClickListener {
        void onPreferenceClick(CheckBoxButtonPreference preference);
    }
}
