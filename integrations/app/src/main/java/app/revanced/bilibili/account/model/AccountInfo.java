package app.revanced.bilibili.account.model;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
/* loaded from: classes6.dex */
public class AccountInfo {
    public static final int ANSWER_STATUS_IN_PROGRESS = 2;
    public static final int ANSWER_STATUS_NOT = 1;
    public static final int SEX_TYPE_FEMALE = 2;
    public static final int SEX_TYPE_MALE = 1;
    public static final int SEX_TYPE_OTHER = 0;
    public static final int SILENCE_TYPE_EVER = 2;
    public static final int SILENCE_TYPE_NONE = 0;
    public static final int SILENCE_TYPE_NO_EVER = 1;

    @JSONField(name = "answer_status")
    public int answerStatus;

    @JSONField(name = "face")
    public String avatar;

    @JSONField(name = "birthday")
    public String birthday;

    @JSONField(name = "coins")
    public float coins;

    @JSONField(name = "email_status")
    public int emailStatus;

    @JSONField(name = "end_time")
    public long endTime;

    @JSONField(name = "has_face_nft")
    public boolean hasNft;

    @JSONField(name = "identification")
    public int identification;

    @JSONField(name = "in_reg_audit")
    public int inRegAudit;

    @JSONField(name = "is_jury")
    public boolean isJury;

    @JSONField(name = "is_senior_member")
    public int isSeniorMember;

    @JSONField(name = "set_birthday")
    public boolean isSetBirthday;

    @JSONField(name = "is_tourist")
    public int isTourist;

    @JSONField(name = "level")
    public int level;

    @JSONField(name = "mid")
    public long mid;

    @JSONField(name = "pin_prompting")
    public int pinPrompting;

    @JSONField(name = "rank")
    public int rank;

    @JSONField(name = "sex")
    public int sex;

    @JSONField(name = "sign")
    public String signature;

    @JSONField(name = "silence")
    public int silence;

    @JSONField(name = "tel_status")
    public int telStatus;

    @JSONField(name = "name")
    public String userName;

    @JSONField(name = "vip")
    public VipUserInfo vipInfo;

    public int getSilenceType() {
        if (silence == 0)
            return SILENCE_TYPE_NONE;
        return endTime == 0 ? SILENCE_TYPE_EVER : SILENCE_TYPE_NO_EVER;
    }

    public String getVipLabelTheme() {
        VipUserInfo vipUserInfo = vipInfo;
        if (vipUserInfo != null)
            return vipUserInfo.getLabelTheme();
        return null;
    }

    public boolean isFormalAccount() {
        return rank >= 10000;
    }

    public boolean isMobileVerified() {
        return telStatus > 0;
    }

    public boolean isRealName() {
        return identification == 1;
    }
}
