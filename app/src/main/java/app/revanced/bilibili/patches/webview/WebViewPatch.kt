package app.revanced.bilibili.patches.webview

import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

object WebViewPatch {
    private val jsHooker = object : Any() {
        @Suppress("UNUSED")
        @JavascriptInterface
        fun saveImage(url: String) {
            val originUrl = url.substringBeforeLast('@')
            Utils.async { Utils.saveImage(originUrl) }
        }
    }

    @Keep
    @JvmStatic
    fun setWebViewClient(webView: WebView, client: WebViewClient) {
        webView.addJavascriptInterface(jsHooker, "hooker")
        webView.webViewClient = WebViewClientProxy(client, object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                if (!Settings.SAVE_COMMENT_IMAGE.boolean) return
                if (url.startsWith("https://www.bilibili.com/h5/note-app/view")) {
                    view.evaluateJavascript(
                        """(function(){for(var i=0;i<document.images.length;++i){var image=document.images[i];if(image.className==='img-preview'||image.parentElement.className==='img-preview'){image.addEventListener("contextmenu",(e)=>{hooker.saveImage(e.target.currentSrc)})}}})()""",
                        null
                    )
                }
            }
        })
    }
}
