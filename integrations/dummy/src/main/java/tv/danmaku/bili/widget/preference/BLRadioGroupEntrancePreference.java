package tv.danmaku.bili.widget.preference;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Map;

public class BLRadioGroupEntrancePreference extends BLPreference {
    public BLRadioGroupEntrancePreference(@NonNull Context context) {
        super(context);
    }

    public BLRadioGroupEntrancePreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BLRadioGroupEntrancePreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setRadioEntryMap(Map<CharSequence, CharSequence> map) {
    }
}
