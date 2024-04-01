@file:Suppress("deprecation")

package app.revanced.bilibili.utils

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import kotlin.random.Random

typealias ActivityResult = (code: Int, data: Intent?) -> Unit

class ActivityLauncher private constructor(private val activity: Activity) {
    companion object {
        private const val TAG_LAUNCHER = "tag_activity_launcher"
        private val codeGenerator = Random

        fun with(activity: Activity): ActivityLauncher {
            return ActivityLauncher(activity)
        }

        private fun genValidCode(existedCodes: Set<Int>): Int {
            var code = codeGenerator.nextInt(0, 2 shl 16)
            while (code in existedCodes) {
                code = codeGenerator.nextInt(0, 2 shl 16)
            }
            return code
        }
    }

    fun launch(intent: Intent, result: ActivityResult) {
        val fragment = activity.fragmentManager.findFragmentByTag(TAG_LAUNCHER)
                as? ProxyFragment ?: run {
            ProxyFragment().also {
                activity.fragmentManager.beginTransaction()
                    .add(it, TAG_LAUNCHER).commitNowAllowingStateLoss()
            }
        }
        val requestCode = genValidCode(fragment.resultMap.keys)
        fragment.resultMap[requestCode] = result
        fragment.startActivityForResult(intent, requestCode)
    }

    class ProxyFragment : Fragment() {
        val resultMap = mutableMapOf<Int, ActivityResult>()

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            resultMap[requestCode]?.let {
                it(resultCode, data)
                resultMap.remove(requestCode)
            }
        }

        override fun onDestroy() {
            super.onDestroy()
            resultMap.clear()
        }
    }
}
