package app.revanced.bilibili.account.model;

import com.alibaba.fastjson.annotation.JSONField;

public class VipUserInfo {
    public static final int VIP_STATUS_BANNED = 3;
    public static final int VIP_STATUS_FREEZE = 2;
    public static final int VIP_STATUS_OUT_OF_DATE = 0;
    public static final int VIP_STATUS_WITHIN_DATE = 1;
    public static final int VIP_THEME_TYPE_FOOL_DAY = 1;
    public static final int VIP_THEME_TYPE_NORMAL = 0;
    public static final int VIP_TYPE_VIP_FALSE = 0;
    public static final int VIP_TYPE_VIP_TRUE = 1;
    public static final int VIP_TYPE_VIP_TRUE_YEAR = 2;

    @JSONField(name = "avatar_subscript")
    public int avatarSubscript;

    @JSONField(name = "due_date")
    public long endTime;

    @JSONField(name = "label")
    public VipLabel label;

    @JSONField(name = "nickname_color")
    public String nicknameColor;

    @JSONField(name = "theme_type")
    public int themeType;

    @JSONField(name = "vip_pay_type")
    public int vipPayType;

    @JSONField(name = "status")
    public int vipStatus;

    @JSONField(name = "type")
    public int vipType;

    public static class VipLabel {

        @JSONField(name = "image")
        public String image;

        @JSONField(name = "label_theme")
        public String labelTheme;

        @JSONField(name = "path")
        public String path;

        @JSONField(name = "text")
        public String text;
    }

    public String getLabelPath() {
        VipLabel vipLabel = label;
        if (vipLabel != null)
            return vipLabel.path;
        return null;
    }

    public String getLabelTheme() {
        VipLabel vipLabel = label;
        if (vipLabel != null)
            return vipLabel.labelTheme;
        return null;
    }

    public boolean isEffectiveVip() {
        int type = vipType;
        return (type == VIP_TYPE_VIP_TRUE || type == VIP_TYPE_VIP_TRUE_YEAR)
                && vipStatus == VIP_STATUS_WITHIN_DATE;
    }

    public boolean isEffectiveYearVip() {
        return vipType == VIP_TYPE_VIP_TRUE_YEAR
                && vipStatus == VIP_STATUS_WITHIN_DATE;
    }

    public boolean isFrozen() {
        int type = vipType;
        return (type == VIP_TYPE_VIP_TRUE || type == VIP_TYPE_VIP_TRUE_YEAR)
                && vipStatus == VIP_STATUS_FREEZE;
    }

    public boolean isLittleVip() {
        return isEffectiveVip() && themeType == VIP_THEME_TYPE_FOOL_DAY;
    }

    public boolean isOutdated() {
        int type = vipType;
        return (type == VIP_TYPE_VIP_TRUE || type == VIP_TYPE_VIP_TRUE_YEAR)
                && vipStatus == VIP_STATUS_OUT_OF_DATE;
    }
}
