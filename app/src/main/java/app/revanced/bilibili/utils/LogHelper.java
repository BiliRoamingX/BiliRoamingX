package app.revanced.bilibili.utils;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Consumer;

import app.revanced.bilibili.settings.Settings;

public class LogHelper {

    /**
     * Log messages using lambdas.
     */
    public interface LogMessage {
        @NonNull
        String buildMessageString();
    }

    private static final int MAX_LENGTH = 3000;
    private static final String LOG_TAG = "BiliRoamingX";

    public static void debug(@NonNull LogMessage message, boolean trace) {
        if (Settings.DEBUG.getBoolean()) {
            var logMessage = message.buildMessageString();
            if (trace) {
                var builder = new StringBuilder(logMessage);
                var sw = new StringWriter();
                new Throwable().printStackTrace(new PrintWriter(sw));
                builder.append('\n').append(sw);
                logMessage = builder.toString();
            }
            log(logMessage, (m) -> Log.d(LOG_TAG, m));
        }
    }

    public static void debug(@NonNull LogMessage message) {
        debug(message, false);
    }

    /**
     * Logs warn messages using the outer class name of the code calling this method.
     */
    public static void warn(@NonNull LogMessage message) {
        warn(message, null);
    }

    /**
     * Logs warn messages using the outer class name of the code calling this method.
     */
    public static void warn(@NonNull LogMessage message, @Nullable Exception ex) {
        var logMessage = message.buildMessageString();
        if (ex != null)
            logMessage = logMessage + '\n' + Log.getStackTraceString(ex);
        log(logMessage, (m) -> Log.w(LOG_TAG, m));
    }

    /**
     * Logs information messages using the outer class name of the code calling this method.
     */
    public static void info(@NonNull LogMessage message) {
        info(message, null);
    }

    /**
     * Logs information messages using the outer class name of the code calling this method.
     */
    public static void info(@NonNull LogMessage message, @Nullable Exception ex) {
        var logMessage = message.buildMessageString();
        if (ex != null)
            logMessage = logMessage + '\n' + Log.getStackTraceString(ex);
        log(logMessage, (m) -> Log.i(LOG_TAG, m));
    }

    /**
     * Logs exceptions under the outer class name of the code calling this method.
     */
    public static void error(@NonNull LogMessage message) {
        error(message, null);
    }

    /**
     * Logs exceptions under the outer class name of the code calling this method.
     */
    public static void error(@NonNull LogMessage message, @Nullable Throwable ex) {
        String logMessage = message.buildMessageString();
        if (ex != null)
            logMessage = logMessage + '\n' + Log.getStackTraceString(ex);
        log(logMessage, (m) -> Log.e(LOG_TAG, m));
    }

    public static void trace() {
        var sw = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(sw));
        Log.e(LOG_TAG + ".LogHelper", sw.toString());
    }

    private static void log(String message, Consumer<String> logger) {
        if (message.length() <= MAX_LENGTH) {
            logger.accept(message);
            return;
        }
        var chunkCount = (int) Math.ceil((double) message.length() / MAX_LENGTH);
        for (var i = 0; i < chunkCount; i++) {
            var start = MAX_LENGTH * i;
            var end = start + MAX_LENGTH;
            if (end >= message.length()) {
                logger.accept(message.substring(start));
            } else {
                logger.accept(message.substring(start, end));
            }
        }
    }
}
