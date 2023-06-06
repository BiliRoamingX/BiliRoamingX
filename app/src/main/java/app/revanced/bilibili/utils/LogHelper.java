package app.revanced.bilibili.utils;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.PrintWriter;
import java.io.StringWriter;

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
            var selfClass = this.getClass();

            String fullClassName = selfClass.getName();
            final int dollarSignIndex = fullClassName.indexOf('$');
            if (dollarSignIndex == -1) {
                return selfClass.getSimpleName(); // already an outer class
            }

            // class is inner, static, or anonymous
            // parse the simple name full name
            // a class with no package returns index of -1, but incrementing gives index zero which is correct
            final int simpleClassNameStartIndex = fullClassName.lastIndexOf('.') + 1;
            return fullClassName.substring(simpleClassNameStartIndex, dollarSignIndex);
        }
    }

    private static final String REVANCED_LOG_PREFIX = "revanced: ";

    public static void debug(@NonNull LogMessage message) {
        if (Settings.DEBUG.getBoolean()) {
            var messageString = message.buildMessageString();

            var builder = new StringBuilder(messageString);
            var sw = new StringWriter();
            new Throwable().printStackTrace(new PrintWriter(sw));

            builder.append('\n').append(sw);
            messageString = builder.toString();

            Log.d(REVANCED_LOG_PREFIX + message.findOuterClassSimpleName(), messageString);
        }
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
        String logTag = REVANCED_LOG_PREFIX + message.findOuterClassSimpleName();
        String logMessage = message.buildMessageString();
        if (ex == null) {
            Log.i(logTag, logMessage);
        } else {
            Log.i(logTag, logMessage, ex);
        }
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
        String messageString = message.buildMessageString();
        String outerClassSimpleName = message.findOuterClassSimpleName();
        String logMessage = REVANCED_LOG_PREFIX + outerClassSimpleName;
        if (ex == null) {
            Log.e(logMessage, messageString);
        } else {
            Log.e(logMessage, messageString, ex);
        }
    }

    public static void trace() {
        var sw = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(sw));
        Log.e(REVANCED_LOG_PREFIX + "LogHelper", sw.toString());
    }
}
