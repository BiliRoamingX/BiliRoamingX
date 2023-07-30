package android.support.v4.media.session;

import android.os.Bundle;

import java.util.List;

public class PlaybackStateCompat {
    // method will added by patcher
    public long getActionsForBiliRoaming() {
        throw new UnsupportedOperationException("Stub");
    }

    // method will added by patcher
    public List<CustomAction> getCustomActionsForBiliRoaming() {
        throw new UnsupportedOperationException("Stub");
    }

    public static final class CustomAction {
        // access flag will change to public by patcher
        public CustomAction(String action, CharSequence name, int icon, Bundle extras) {
        }
    }
}
