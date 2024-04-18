package tv.danmaku.bili.widget;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.preference.PreferenceCategory;

public class RadioGroupPreference extends PreferenceCategory {
    public RadioGroupPreference(@NonNull Context context) {
        super(context);
    }

    public RadioButtonPreference findPreferenceByRadioValue(int value) {
        throw new UnsupportedOperationException("Stub");
    }

    public String getRadioValue() {
        throw new UnsupportedOperationException("Stub");
    }

    public int getRadioValueAsInteger(int value) {
        throw new UnsupportedOperationException("Stub");
    }

    public void removeByRadioValue(int value) {
    }

    public void setEnabledByRadioValue(String value, boolean enabled) {
    }

    public void setRadioSummary(int value, String summary) {
    }

    public boolean setRadioValue(String value) {
        throw new UnsupportedOperationException("Stub");
    }

    public RadioButtonPreference findPreferenceByRadioValue(String value) {
        throw new UnsupportedOperationException("Stub");
    }

    public void setEnabledByRadioValue(int value, boolean enabled) {
    }
}
