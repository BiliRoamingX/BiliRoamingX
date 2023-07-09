package tv.danmaku.bili.ui.main2.api;

import android.text.TextUtils;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.homepage.mine.MenuGroup;

import java.util.List;

public class AccountMine {
    @Nullable
    @JSONField(name = "sections_v2")
    public List<MenuGroup> sectionListV2;

    @Nullable
    @JSONField(name = "mall_home")
    public GarbEntrance garbEntrance;

    @JSONField(name = "ipad_sections")
    public List<MenuGroup.Item> padSectionList;

    @JSONField(name = "ipad_recommend_sections")
    public List<MenuGroup.Item> recommendSectionList;

    @JSONField(name = "ipad_more_sections")
    public List<MenuGroup.Item> moreSectionList;

    @Keep
    /* loaded from: classes12.dex */
    public static class GarbEntrance {
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "uri")
        public String uri;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GarbEntrance) {
                GarbEntrance garbEntrance = (GarbEntrance) obj;
                String str = this.icon;
                if (str == null ? garbEntrance.icon == null : str.equals(garbEntrance.icon)) {
                    String str2 = this.uri;
                    if (str2 == null ? garbEntrance.uri == null : str2.equals(garbEntrance.uri)) {
                        String str3 = this.title;
                        String str4 = garbEntrance.title;
                        return str3 != null ? str3.equals(str4) : str4 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.icon;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.uri;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.title;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public boolean isValid() {
            return !TextUtils.isEmpty(this.uri);
        }
    }
}
