package app.revanced.bilibili.patches.main;

import android.app.Application;

import java.io.File;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.Utils;

public class ApplicationDelegate {
    public static void onCreate(Application app) {
        if (Utils.isInMainProcess()) {
            Utils.async(ApplicationDelegate::startLog);
        }
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void startLog() {
        if (!Settings.DEBUG.getBoolean())
            return;
        try {
            File logFile = KtUtils.getLogFile();
            File oldLogFile = KtUtils.getOldLogFile();
            if (logFile.exists()) {
                if (oldLogFile.exists())
                    oldLogFile.delete();
                logFile.renameTo(oldLogFile);
            }
            logFile.delete();
            logFile.createNewFile();
            Runtime.getRuntime().exec(
                    new String[]{
                            "logcat",
                            "-T",
                            "100",
                            "-f",
                            logFile.getAbsolutePath()
                    }
            );
        } catch (Throwable ignored) {
        }
    }
}
