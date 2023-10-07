package app.revanced.bilibili.meta;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
/* loaded from: classes5.dex */
public class CookieInfo {
    @JSONField(name = "cookies")
    public List<CookieBean> cookies;

    public CookieInfo(List<CookieBean> cookies) {
        this.cookies = cookies;
    }

    /* compiled from: BL */
    /* loaded from: classes5.dex */
    public static class CookieBean {
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "value")
        public String value;

        public CookieBean(String name, String value) {
            this.name = name;
            this.value = value;
        }
    }
}
