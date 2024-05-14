package app.revanced.bilibili.utils;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Consumer;

import app.revanced.bilibili.settings.Settings;

public class Logger {

    /**
     * Log messages using lambdas.
     */
    public interface LogMessage {
        @NonNull
        String build();
    }

    private static final int MAX_LENGTH = 3000;
    public static final String LOG_TAG = "BiliRoamingX";

    public static void debug(boolean trace, @NonNull LogMessage message) {
        if (Settings.Debug.get()) {
            var logMessage = message.build();
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
        debug(false, message);
    }

    /**
     * Logs warn messages using the outer class name of the code calling this method.
     */
    public static void warn(@NonNull LogMessage message) {
        warn(null, message);
    }

    /**
     * Logs warn messages using the outer class name of the code calling this method.
     */
    public static void warn(@Nullable Exception ex, @NonNull LogMessage message) {
        var logMessage = message.build();
        if (ex != null)
            logMessage = logMessage + '\n' + KtUtils.fullStackTraceString(ex);
        log(logMessage, (m) -> Log.w(LOG_TAG, m));
    }

    /**
     * Logs information messages using the outer class name of the code calling this method.
     */
    public static void info(@NonNull LogMessage message) {
        info(null, message);
    }

    /**
     * Logs information messages using the outer class name of the code calling this method.
     */
    public static void info(@Nullable Exception ex, @NonNull LogMessage message) {
        var logMessage = message.build();
        if (ex != null)
            logMessage = logMessage + '\n' + KtUtils.fullStackTraceString(ex);
        log(logMessage, (m) -> Log.i(LOG_TAG, m));
    }

    /**
     * Logs exceptions under the outer class name of the code calling this method.
     */
    public static void error(@NonNull LogMessage message) {
        error(null, message);
    }

    /**
     * Logs exceptions under the outer class name of the code calling this method.
     */
    public static void error(@Nullable Throwable ex, @NonNull LogMessage message) {
        String logMessage = message.build();
        if (ex != null)
            logMessage = logMessage + '\n' + KtUtils.fullStackTraceString(ex);
        log(logMessage, (m) -> Log.e(LOG_TAG, m));
    }

    private static synchronized void log(String message, Consumer<String> logger) {
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
