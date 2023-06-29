package app.revanced.bilibili.patches.webview

import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import app.revanced.bilibili.patches.CommentImagePatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

object WebViewPatch {
    private val jsHooker = object : Any() {
        @Suppress("UNUSED")
        @JavascriptInterface
        fun saveImage(url: String) {
            Utils.async {
                CommentImagePatch.saveImage(url)
            }
        }
    }

    @JvmStatic
    fun setWebViewClient(webView: WebView, client: WebViewClient) {
        webView.addJavascriptInterface(jsHooker, "hooker")
        webView.webViewClient = WebViewClientProxy(client, object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                if (!Settings.SAVE_COMMENT_IMAGE.boolean) return
                if (url.startsWith("https://www.bilibili.com/h5/note-app/view")) {
                    view.evaluateJavascript(
                        """(function(){for(var i=0;i<document.images.length;++i){if(document.images[i].className==='img-preview'){document.images[i].addEventListener("contextmenu",(e)=>{hooker.saveImage(e.target.currentSrc);})}}})()""",
                        null
                    )
                }
            }
        })
    }
}
