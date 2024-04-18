package tv.danmaku.bili.ui.main.event.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

@Keep
public class EventEntranceModel {
    @Nullable
    private String hash;
    @Nullable
    private Online online;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setOnline(Online online) {
    }

    public static class Online {
    }
}
