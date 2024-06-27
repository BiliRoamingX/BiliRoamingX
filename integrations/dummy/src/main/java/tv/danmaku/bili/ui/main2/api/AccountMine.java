package tv.danmaku.bili.ui.main2.api;

import android.text.TextUtils;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.homepage.MenuItemTip;
import com.bilibili.lib.homepage.mine.MenuGroup;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: BL */
@Keep
/* loaded from: classes15.dex */
public class AccountMine {
    @Nullable
    @JSONField(name = "answer")
    public Answer answer;
    @JSONField(name = "answer_status")
    public int answerStatus;
    @JSONField(name = "audio_type")
    public int audioType;
    @JSONField(name = "bcoin")
    public float bcoin;
    @JSONField(name = "bili_link_bubble")
    public BiliLinkBubble biliLinkBubble;
    @Nullable
    @JSONField(name = "bubbles")
    public List<GuideBubble> bubbles;
    @JSONField(name = "coin")
    public float coin;
    @JSONField(name = "dynamic")
    public long dynamic;
    @JSONField(name = "enable_bili_link")
    public boolean enableBiliLink;
    @JSONField(name = "end_time")
    public long end_time;
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "first_live_time")
    public long firstLiveTime;
    @JSONField(name = "follower")
    public long follower;
    @JSONField(name = "following")
    public long following;
    @Nullable
    @JSONField(name = "game_tip")
    public List<MenuItemTip> gameTips;
    @Nullable
    @JSONField(name = "mall_home")
    public GarbEntrance garbEntrance;
    @JSONField(name = "in_reg_audit")
    public int inRegAudit;
    @JSONField(name = "level")
    public int level;
    @Nullable
    @JSONField(name = "live_tip")
    public LiveTip liveTip;
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "new_followers")
    public int newFollowers;
    @JSONField(name = "new_followers_rtime")
    public long newFollowersTime;
    @JSONField(name = "nft")
    public NFTData nftData;
    @Nullable
    @JSONField(name = "pendant")
    public Pendant pendant;
    @JSONField(name = "rank")
    public int rank;
    @Nullable
    @JSONField(name = "rework_v1", serialize = false)
    public ReworkV1 reworkV1;
    @Nullable
    @JSONField(name = "sections")
    public List<MenuGroup> sectionList;
    @Nullable
    @JSONField(name = "sections_v2")
    public List<MenuGroup> sectionListV2;
    @Nullable
    @JSONField(name = "senior_gate")
    public SeniorStatus seniorStatus;
    @JSONField(name = "sex")
    public int sex;
    @JSONField(name = "show_creative")
    public int showCreative;
    @JSONField(name = "show_face_guide")
    public boolean showFaceGuide;
    @JSONField(name = "show_name_guide")
    public boolean showNameGuide;
    @JSONField(name = "show_nft_face_guide")
    public boolean showNftGuide;
    @JSONField(name = "show_videoup")
    public int showVideoup;
    @JSONField(name = "silence")
    public int silence;
    @Nullable
    @JSONField(name = "vip_section_right")
    public VipSectionRight vipSectionRight;
    @Nullable
    @JSONField(name = "vip_section_v2")
    public VipSectionV2 vipSectionV2;
    @JSONField(name = "vip_type")
    public int vipType;

    // ===START from hd===
    @JSONField(name = "ipad_sections")
    public List<MenuGroup.Item> padSectionList;
    @JSONField(name = "ipad_recommend_sections")
    public List<MenuGroup.Item> recommendSectionList;
    @JSONField(name = "ipad_more_sections")
    public List<MenuGroup.Item> moreSectionList;
    // ===END===

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class Answer {
        public String progress;
        public String text;
        public String url;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Answer) {
                Answer answer = (Answer) obj;
                String str = this.text;
                if (str == null ? answer.text == null : str.equals(answer.text)) {
                    String str2 = this.url;
                    if (str2 == null ? answer.url == null : str2.equals(answer.url)) {
                        String str3 = this.progress;
                        String str4 = answer.progress;
                        return str3 != null ? str3.equals(str4) : str4 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.url;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.progress;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class BiliLinkBubble {
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "id")
        public int id;
        @JSONField(name = "pic")
        public String pic;
        @JSONField(name = "title")
        public String title;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class BirthdayConf {
        @JSONField(name = "birthday")
        public long birthday;
        @JSONField(name = "bubble_text")
        public String bubleText;
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "url")
        public String url;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
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

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class GuideBubble {
        @Nullable
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "id")
        public long id;
        @JSONField(name = "type")
        public int type;

        public String toString() {
            return "GuideBubble{id=" + this.id + ", icon='" + this.icon + "', type=" + this.type + '}';
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class LiveTip {
        public static final int BUTTON_MODE = 0;
        public static final int LINK_MODE = 1;
        public static final int NO_TEXT_MODE = 2;
        @JSONField(name = "button_icon")
        public String btnIcon;
        @JSONField(name = "button_text")
        public String btnText;
        @JSONField(name = "icon")
        public String iconUrl;
        @JSONField(name = "id")
        public long id;
        @JSONField(name = "mod")
        public int mode;
        @JSONField(name = "text")
        public String text;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "url_text")
        public String urlText;

        public boolean isValid() {
            return (TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.text)) ? false : true;
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class NFTData {
        @JSONField(name = "icon")
        public NFTIcon icon;
        @JSONField(name = "region_type")
        public int type;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class NFTIcon {
        private static int SHOW_STATUS_RAW = 2;
        private static int SHOW_STATUS_ZOOMING = 1;
        @JSONField(name = "show_status")
        public int showStatus;
        @JSONField(name = "url")
        public String url;

        public boolean checkValid() {
            int i = this.showStatus;
            return i == SHOW_STATUS_RAW || i == SHOW_STATUS_ZOOMING;
        }

        public boolean enableZooming() {
            return this.showStatus == SHOW_STATUS_ZOOMING;
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class Pendant {
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "image_enhance")
        public String imageEnhance;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pendant pendant = (Pendant) obj;
            String str = this.image;
            if (str == null ? pendant.image == null : str.equals(pendant.image)) {
                String str2 = this.imageEnhance;
                return str2 != null ? str2.equals(pendant.imageEnhance) : pendant.imageEnhance == null;
            }
            return false;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.imageEnhance;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Pendant{image='" + this.image + "'}";
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class ReworkV1 {
        @Nullable
        @JSONField(name = "worst_creative")
        public BackupPublishButton backupPublishButton;
        @JSONField(name = "new_mine")
        public boolean newMine;
        @JSONField(name = "dynamic_ids")
        public List<Long> originalIds;
        @JSONField(name = "original_num")
        public int originalNum;
        @JSONField(name = "user_original_state")
        public int userOriginalState;

        /* compiled from: BL */
        @Keep
        /* loaded from: classes15.dex */
        public static class BackupPublishButton {
            @Nullable
            @JSONField(name = "button_icon")
            public String buttonIcon;
            @Nullable
            @JSONField(name = "button_link")
            public String buttonLink;
            @Nullable
            @JSONField(name = "button_text")
            public String buttonText;
            @Nullable
            @JSONField(name = "title")
            public String title;

            public String defaultSubtitle() {
                return new SimpleDateFormat("M\u6708d\u65e5", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BackupPublishButton) {
                    BackupPublishButton backupPublishButton = (BackupPublishButton) obj;
                    return Objects.equals(this.buttonLink, backupPublishButton.buttonLink) && Objects.equals(this.buttonIcon, backupPublishButton.buttonIcon) && Objects.equals(this.buttonText, backupPublishButton.buttonText) && Objects.equals(this.title, backupPublishButton.title);
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.buttonLink, this.buttonIcon, this.buttonText, this.title);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ReworkV1) {
                ReworkV1 reworkV1 = (ReworkV1) obj;
                return this.userOriginalState == reworkV1.userOriginalState && this.newMine == reworkV1.newMine && this.originalNum == reworkV1.originalNum && Objects.equals(this.originalIds, reworkV1.originalIds) && Objects.equals(this.backupPublishButton, reworkV1.backupPublishButton);
            }
            return false;
        }

        public boolean hasOriginal() {
            return this.userOriginalState == 2;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.userOriginalState), Boolean.valueOf(this.newMine), Integer.valueOf(this.originalNum), this.originalIds, this.backupPublishButton);
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class SeniorGateFlash {
        @JSONField(name = "icon")
        public String icon;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class SeniorStatus {
        @Nullable
        @JSONField(name = "birthday_conf")
        public BirthdayConf birthdayConf;
        @Nullable
        @JSONField(name = "bubble")
        public String bubble;
        @Nullable
        @JSONField(name = "text")
        public String entranceTitle;
        @JSONField(name = "identity")
        public int identity;
        @Nullable
        @JSONField(name = "member_text")
        public String memberText;
        @Nullable
        @JSONField(name = "url")
        public String url;

        @JSONField(deserialize = false, serialize = false)
        public boolean isSeniorMember() {
            int i = this.identity;
            return i == 2 || i == 3;
        }

        @JSONField(deserialize = false, serialize = false)
        public boolean showEntrance() {
            return !TextUtils.isEmpty(this.url);
        }

        public String toString() {
            return "SeniorStatus{identity=" + this.identity + ", entranceTitle='" + this.entranceTitle + "', url='" + this.url + "'}";
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class TopLevelFlash {
        @JSONField(name = "icon")
        public String icon;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class VIPSectionRevision {
        @JSONField(name = "module_background_color")
        public VIPSectionRevisionBgColor bgColor;
        @Nullable
        @JSONField(name = "button_icon")
        public String buttonIcon;
        @JSONField(name = "button_icon_period")
        public int buttonIconPeriod;
        @JSONField(name = "button_icon_times")
        public int buttonIconTimes;
        @JSONField(name = "button_link")
        public String buttonLink;
        @JSONField(name = "click_title")
        public String clickTitle;
        @JSONField(name = "img")
        public String img;
        @JSONField(name = "img_night")
        public String imgNight;
        @JSONField(name = "text_color")
        public VIPSectionRevisionTextColor textColor;
        @JSONField(name = "version")
        public String version;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class VIPSectionRevisionBgColor {
        @JSONField(name = "day_dress")
        public String dayDress;
        @JSONField(name = "day_no_dress")
        public String dayNoDress;
        @JSONField(name = "night_dress")
        public String nightDress;
        @JSONField(name = "night_no_dress")
        public String nightNoDress;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class VIPSectionRevisionTextColor {
        @JSONField(name = "day_dress_text")
        public String dayDress;
        @JSONField(name = "day_no_dress_text")
        public String dayNoDress;
        @JSONField(name = "night_dress_text")
        public String nightDress;
        @JSONField(name = "night_no_dress_text")
        public String nightNoDress;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public static class VipSectionRight {
        @JSONField(name = "id")
        public long id;
        @JSONField(name = "img")
        public String img;
        @JSONField(name = "link")
        public String link;
        @JSONField(name = "tip")
        public String tip;
        @JSONField(name = "title")
        public String title;

        public boolean isValid() {
            return (TextUtils.isEmpty(this.title) || TextUtils.isEmpty(this.tip) || TextUtils.isEmpty(this.link)) ? false : true;
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes15.dex */
    public class VipSectionV2 {
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "exp_group_tag")
        public String expGroupTag;
        @JSONField(name = "exp_tag")
        public String expTag;
        @JSONField(name = "id")
        public long id;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "type")
        public String type;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "vip_section_revision")
        public VIPSectionRevision vipSectionRevision;

        public VipSectionV2() {
        }

        public boolean isNewVipSection() {
            String str = this.type;
            return str == null || TextUtils.equals(str, "2");
        }

        public boolean isValid() {
            return (this.title == null || this.desc == null || this.vipSectionRevision == null) ? false : true;
        }
    }

    public boolean isAccountInRegAudit() {
        return this.inRegAudit == 1;
    }

    public boolean isEffectiveVip() {
        int i = this.vipType;
        return i == 1 || i == 2;
    }

    public boolean isFormalAccount() {
        return this.rank >= 10000;
    }

    public boolean isSeniorUser() {
        SeniorStatus seniorStatus;
        return this.level == 6 && (seniorStatus = this.seniorStatus) != null && seniorStatus.isSeniorMember();
    }
}
