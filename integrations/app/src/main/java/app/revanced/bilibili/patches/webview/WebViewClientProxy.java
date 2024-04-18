package app.revanced.bilibili.patches.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@SuppressWarnings("deprecation")
public class WebViewClientProxy extends WebViewClient {
    @NonNull
    private final WebViewClient delegate;
    @Nullable
    private final WebViewClient proxy;

    public WebViewClientProxy(@NonNull WebViewClient delegate, @Nullable WebViewClient proxy) {
        this.delegate = delegate;
        this.proxy = proxy;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        delegate.onPageStarted(view, url, favicon);
        if (proxy != null)
            proxy.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        delegate.onPageFinished(view, url);
        if (proxy != null)
            proxy.onPageFinished(view, url);
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (proxy == null || !proxy.shouldOverrideUrlLoading(view, url))
            return delegate.shouldOverrideUrlLoading(view, url);
        return true;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if (proxy == null || !proxy.shouldOverrideUrlLoading(view, request))
            return delegate.shouldOverrideUrlLoading(view, request);
        return true;
    }

    @Override
    public void onLoadResource(WebView view, String url) {
        delegate.onLoadResource(view, url);
        if (proxy != null)
            proxy.onLoadResource(view, url);
    }

    @Override
    public void onPageCommitVisible(WebView view, String url) {
        delegate.onPageCommitVisible(view, url);
        if (proxy != null)
            proxy.onPageCommitVisible(view, url);
    }

    @Nullable
    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        WebResourceResponse response;
        if (proxy == null || (response = proxy.shouldInterceptRequest(view, url)) == null)
            return delegate.shouldInterceptRequest(view, url);
        return response;
    }

    @Nullable
    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse response;
        if (proxy == null || (response = proxy.shouldInterceptRequest(view, request)) == null)
            return delegate.shouldInterceptRequest(view, request);
        return response;
    }

    @Override
    public void onTooManyRedirects(WebView view, Message cancelMsg, Message continueMsg) {
        delegate.onTooManyRedirects(view, cancelMsg, continueMsg);
        if (proxy != null)
            proxy.onTooManyRedirects(view, cancelMsg, continueMsg);
    }

    @Override
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        delegate.onReceivedError(view, errorCode, description, failingUrl);
        if (proxy != null)
            proxy.onReceivedError(view, errorCode, description, failingUrl);
    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        delegate.onReceivedError(view, request, error);
        if (proxy != null)
            proxy.onReceivedError(view, request, error);
    }

    @Override
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        delegate.onReceivedHttpError(view, request, errorResponse);
        if (proxy != null)
            proxy.onReceivedHttpError(view, request, errorResponse);
    }

    @Override
    public void onFormResubmission(WebView view, Message dontResend, Message resend) {
        delegate.onFormResubmission(view, dontResend, resend);
        if (proxy != null)
            proxy.onFormResubmission(view, dontResend, resend);
    }

    @Override
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        delegate.doUpdateVisitedHistory(view, url, isReload);
        if (proxy != null)
            proxy.doUpdateVisitedHistory(view, url, isReload);
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        delegate.onReceivedSslError(view, handler, error);
        if (proxy != null)
            proxy.onReceivedSslError(view, handler, error);
    }

    @Override
    public void onReceivedClientCertRequest(WebView view, ClientCertRequest request) {
        delegate.onReceivedClientCertRequest(view, request);
        if (proxy != null)
            proxy.onReceivedClientCertRequest(view, request);
    }

    @Override
    public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
        delegate.onReceivedHttpAuthRequest(view, handler, host, realm);
        if (proxy != null)
            proxy.onReceivedHttpAuthRequest(view, handler, host, realm);
    }

    @Override
    public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
        if (proxy == null || !proxy.shouldOverrideKeyEvent(view, event))
            return delegate.shouldOverrideKeyEvent(view, event);
        return true;
    }

    @Override
    public void onUnhandledKeyEvent(WebView view, KeyEvent event) {
        delegate.onUnhandledKeyEvent(view, event);
        if (proxy != null)
            proxy.onUnhandledKeyEvent(view, event);
    }

    @Override
    public void onScaleChanged(WebView view, float oldScale, float newScale) {
        delegate.onScaleChanged(view, oldScale, newScale);
        if (proxy != null)
            proxy.onScaleChanged(view, oldScale, newScale);
    }

    @Override
    public void onReceivedLoginRequest(WebView view, String realm, @Nullable String account, String args) {
        delegate.onReceivedLoginRequest(view, realm, account, args);
        if (proxy != null)
            proxy.onReceivedLoginRequest(view, realm, account, args);
    }

    @Override
    @RequiresApi(api = Build.VERSION_CODES.O)
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        if (proxy == null || !proxy.onRenderProcessGone(view, detail))
            return delegate.onRenderProcessGone(view, detail);
        return true;
    }

    @Override
    @RequiresApi(api = Build.VERSION_CODES.O_MR1)
    public void onSafeBrowsingHit(WebView view, WebResourceRequest request, int threatType, SafeBrowsingResponse callback) {
        delegate.onSafeBrowsingHit(view, request, threatType, callback);
        if (proxy != null)
            proxy.onSafeBrowsingHit(view, request, threatType, callback);
    }
}
