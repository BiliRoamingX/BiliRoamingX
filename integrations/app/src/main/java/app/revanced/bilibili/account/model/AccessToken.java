package app.revanced.bilibili.account.model;

import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

public class AccessToken {

    @JSONField(name = "access_token")
    public String accessKey;

    @JSONField(name = "expires")
    public long expires;

    @JSONField(name = "expires_in")
    public long expiresIn;

    @JSONField(name = "fast_login_token")
    public String fastLoginToken;

    @JSONField(name = "mid")
    public long mid;

    @JSONField(name = "refresh_token")
    public String refreshToken;

    public AccessToken(String accessKey, long expires, long expiresIn, String fastLoginToken, long mid, String refreshToken) {
        this.accessKey = accessKey;
        this.expires = expires;
        this.expiresIn = expiresIn;
        this.fastLoginToken = fastLoginToken;
        this.mid = mid;
        this.refreshToken = refreshToken;
    }

    public boolean canRefresh() {
        return this.mid > 0 && !TextUtils.isEmpty(this.refreshToken);
    }

    public final boolean isExpired() {
        return System.currentTimeMillis() > this.expires * 1000;
    }

    public final boolean isValid() {
        return this.mid > 0 && !TextUtils.isEmpty(this.accessKey);
    }
}
