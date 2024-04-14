package app.revanced.bilibili.patches

import android.system.Os
import androidx.annotation.Keep
import app.revanced.bilibili.utils.LogHelper
import app.revanced.bilibili.utils.Utils

object CrashHandlerPatch {
    @Keep
    @JvmStatic
    fun onCrash(thread: Thread, error: Throwable) {
        LogHelper.error({
            "FATAL, crashed, pid: ${Os.getpid()}, tid: ${thread.id}, pname: ${Utils.currentProcessName()}, tname: ${thread.name}, error: "
        }, error)
    }
}
