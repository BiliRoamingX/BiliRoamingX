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

        /**
         * @return For outer classes, this returns {@link Class#getSimpleName()}.
         * For inner, static, or anonymous classes, this returns the simple name of the enclosing class.<br>
         * <br>
         * For example, each of these classes return 'SomethingView':
         * <code>
         * com.company.SomethingView
         * com.company.SomethingView$StaticClass
         * com.company.SomethingView$1
         * </code>
         */
        default String findOuterClassSimpleName() {
            var selfClass = getClass();

            var fullClassName = selfClass.getName();
            var dollarSignIndex = fullClassName.indexOf('$');
            if (dollarSignIndex == -1)
                return selfClass.getSimpleName(); // already an outer class

            // class is inner, static, or anonymous
            // parse the simple name full name
            // a class with no package returns index of -1, but incrementing gives index zero which is correct
            var simpleClassNameStartIndex = fullClassName.lastIndexOf('.') + 1;
            return fullClassName.substring(simpleClassNameStartIndex, dollarSignIndex);
        }
    }

    private static final int MAX_LENGTH = 3000;
    private static final String REVANCED_LOG_PREFIX = "revanced: ";

    public static void debug(@NonNull LogMessage message, boolean trace) {
        if (Settings.DEBUG.getBoolean()) {
            var logTag = REVANCED_LOG_PREFIX + message.findOuterClassSimpleName();
            var logMessage = message.buildMessageString();
            if (trace) {
                var builder = new StringBuilder(logMessage);
                var sw = new StringWriter();
                new Throwable().printStackTrace(new PrintWriter(sw));
                builder.append('\n').append(sw);
                logMessage = builder.toString();
            }
            log(logMessage, (m) -> Log.d(logTag, m));
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
        var logTag = REVANCED_LOG_PREFIX + message.findOuterClassSimpleName();
        if (ex != null)
            logMessage = logMessage + '\n' + Log.getStackTraceString(ex);
        log(logMessage, (m) -> Log.w(logTag, m));
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
        var logTag = REVANCED_LOG_PREFIX + message.findOuterClassSimpleName();
        if (ex != null)
            logMessage = logMessage + '\n' + Log.getStackTraceString(ex);
        log(logMessage, (m) -> Log.i(logTag, m));
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
        String logTag = REVANCED_LOG_PREFIX + message.findOuterClassSimpleName();
        if (ex != null)
            logMessage = logMessage + '\n' + Log.getStackTraceString(ex);
        log(logMessage, (m) -> Log.e(logTag, m));
    }

    public static void trace() {
        var sw = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(sw));
        Log.e(REVANCED_LOG_PREFIX + "LogHelper", sw.toString());
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
