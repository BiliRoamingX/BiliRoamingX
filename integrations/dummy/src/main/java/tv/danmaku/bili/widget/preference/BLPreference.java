package tv.danmaku.bili.widget.preference;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;

public class BLPreference extends Preference {
    public BLPreference(@NonNull Context context) {
        super(context, null);
    }

    public BLPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BLPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
