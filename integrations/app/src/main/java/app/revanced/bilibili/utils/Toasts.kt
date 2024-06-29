package app.revanced.bilibili.utils

import android.content.Context
import android.view.Gravity
import android.widget.Toast
import androidx.annotation.GravityInt
import androidx.annotation.Keep

object Toasts {

    @JvmOverloads
    @JvmStatic
    fun showShortWithId(
        idName: String,
        vararg formatArgs: Any?,
        @GravityInt gravity: Int = Gravity.CENTER,
    ) {
        val message = if (formatArgs.isEmpty()) {
            Utils.getString(idName)
        } else {
            Utils.getString(idName, *formatArgs)
        }
        show(message, Toast.LENGTH_SHORT, gravity)
    }

    @JvmOverloads
    @JvmStatic
    fun showLongWithId(
        idName: String,
        vararg formatArgs: Any?,
        @GravityInt gravity: Int = Gravity.CENTER,
    ) {
        val message = if (formatArgs.isEmpty()) {
            Utils.getString(idName)
        } else {
            Utils.getString(idName, *formatArgs)
        }
        show(message, Toast.LENGTH_LONG, gravity)
    }

    @JvmOverloads
    @JvmStatic
    fun showShort(message: String, @GravityInt gravity: Int = Gravity.CENTER) {
        show(message, Toast.LENGTH_SHORT, gravity)
    }

    @JvmOverloads
    @JvmStatic
    fun showLong(message: String, @GravityInt gravity: Int = Gravity.CENTER) {
        show(message, Toast.LENGTH_LONG, gravity)
    }

    @JvmStatic
    fun show(message: String, duration: Int, @GravityInt gravity: Int) {
        val prefixMessage = Utils.getString("biliroaming_toast_prefix")
        val finalMessage = prefixMessage + message
        Utils.runOnMainThread {
            show(Utils.getContext(), finalMessage, duration, gravity)
        }
    }

    @JvmStatic
    @Keep
    // codes will filled by patcher
    fun cancel() {
        // nop
    }

    @JvmStatic
    @Keep
    // codes will filled by patcher
    fun show(context: Context, message: String, duration: Int, @GravityInt gravity: Int) {
        // nop
    }
}
