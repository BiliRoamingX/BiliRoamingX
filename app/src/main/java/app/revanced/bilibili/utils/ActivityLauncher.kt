@file:Suppress("deprecation")

package app.revanced.bilibili.utils

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.content.pm.PackageManager
import kotlin.random.Random

typealias ActivityResult = (code: Int, data: Intent?) -> Unit
typealias PermissionResult = (granted: Boolean, shouldExplain: Boolean) -> Unit

fun Activity.launch(intent: Intent, result: ActivityResult) {
    ActivityLauncher.with(this).launch(intent, result)
}

fun Activity.launchCatching(intent: Intent, result: ActivityResult) =
    runCatching { launch(intent, result) }

fun Activity.requestPermission(permission: String, result: PermissionResult) {
    ActivityLauncher.with(this).requestPermission(permission, result)
}

class ActivityLauncher private constructor(private val activity: Activity) {
    companion object {
        private const val TAG_LAUNCHER = "tag_activity_launcher"
        private val codeGenerator = Random

        fun with(activity: Activity): ActivityLauncher {
            return ActivityLauncher(activity)
        }
    }

    private fun getProxyFragment(): ProxyFragment {
        return activity.fragmentManager.findFragmentByTag(TAG_LAUNCHER)
                as? ProxyFragment ?: run {
            ProxyFragment().also {
                activity.fragmentManager.beginTransaction()
                    .add(it, TAG_LAUNCHER).commitNowAllowingStateLoss()
            }
        }
    }

    private fun generateRequestCode(fragment: ProxyFragment): Int {
        val existedCodes = fragment.resultMap.keys + fragment.permissionResultMap.keys
        var code = codeGenerator.nextInt(0, 2 shl 16)
        while (code in existedCodes) {
            code = codeGenerator.nextInt(0, 2 shl 16)
        }
        return code
    }

    fun launch(intent: Intent, result: ActivityResult) {
        val fragment = getProxyFragment()
        val requestCode = generateRequestCode(fragment)
        fragment.resultMap[requestCode] = result
        fragment.startActivityForResult(intent, requestCode)
    }

    fun requestPermission(permission: String, result: PermissionResult) {
        if (activity.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED) {
            result(true, false)
            return
        }
        val fragment = getProxyFragment()
        val requestCode = generateRequestCode(fragment)
        fragment.permissionResultMap[requestCode] = result
        fragment.requestPermissions(arrayOf(permission), requestCode)
    }

    class ProxyFragment : Fragment() {
        val resultMap = mutableMapOf<Int, ActivityResult>()
        val permissionResultMap = mutableMapOf<Int, PermissionResult>()

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            resultMap[requestCode]?.let {
                it(resultCode, data)
                resultMap.remove(requestCode)
            }
        }

        override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
        ) {
            permissionResultMap[requestCode]?.let {
                val permission = permissions.firstOrNull() ?: return@let
                val grantResult = grantResults.firstOrNull() ?: return@let
                val granted = grantResult == PackageManager.PERMISSION_GRANTED
                val shouldExplain = !granted
                        && (activity?.shouldShowRequestPermissionRationale(permission) ?: false)
                it(granted, shouldExplain)
                permissionResultMap.remove(requestCode)
            }
        }

        override fun onDestroy() {
            super.onDestroy()
            resultMap.clear()
            permissionResultMap.clear()
        }
    }
}
