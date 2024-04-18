package app.revanced.bilibili.meta;

import androidx.annotation.Keep;

@Keep
public class HookFlags {
    /**
     * hook flag to indicate stopping execute method and make a null result for method
     */
    public static final Object STOP_EXECUTION = new Object();
}
