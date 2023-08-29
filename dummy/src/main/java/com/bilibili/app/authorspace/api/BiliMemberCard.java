package com.bilibili.app.authorspace.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
@Keep
/* loaded from: classes20.dex */
public class BiliMemberCard {
    @Nullable
    @JSONField(name = "achieve")
    public Achieve achieve;
    @JSONField(name = "digital_id")
    public String digitalId;
    @JSONField(name = "digital_type")
    public int digitalType;
    @Nullable
    @JSONField(name = "entrance")
    public SpaceEntrance entrance;
    @JSONField(name = "silence_url")
    public String examUrl;
    @JSONField(name = "face_nft_new")
    public int faceNft;
    @JSONField(name = "fans_group")
    public int fansGroup;
    @JSONField(name = "has_digital_asset")
    public boolean hasDigitalAsset;
    @JSONField(name = "has_face_nft")
    public boolean hasNft;
    @JSONField(name = "is_deleted")
    public int isDeleted;
    @Nullable
    @JSONField(name = "likes")
    public UserLike likes;
    @JSONField(name = "article")
    public int mArticles;
    @JSONField(name = "audio")
    public int mAudio;
    @JSONField(name = "face")
    public String mAvatar;
    @JSONField(name = "birthday")
    public String mBirthDay;
    @JSONField(name = "description")
    public String mDescription;
    @JSONField(name = "fans")
    public int mFollowers;
    @JSONField(name = "attention")
    public int mFollowings;
    @JSONField(name = "sex")
    public String mGender;
    @JSONField(name = "mid")
    public long mMid;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "place")
    public String mPlace;
    @JSONField(name = "regtime")
    public long mRegTime;
    @JSONField(name = "sign")
    public String mSignature;
    @Nullable
    @JSONField(name = "nft_certificate")
    public NftCertificate nftCertificate;
    @JSONField(name = "nft_face_icon")
    public NftFaceIcon nftFaceIcon;
    @JSONField(name = "nft_face_jump")
    public String nftFaceJump;
    @JSONField(name = "nft_id")
    public String nftId;
    @Nullable
    @JSONField(name = "pendant")
    public Pendant pendant;
    @JSONField(name = "pendant_title")
    public String pendantTitle;
    @JSONField(name = "pendant_url")
    public String pendantUrl;
    @Nullable
    @JSONField(name = "pr_info")
    public PrInfo prInfo;
    @Nullable
    @JSONField(name = "profession_verify")
    public ProfessionVerify professionVerify;
    @JSONField(name = "silence")
    public int silence;
    @JSONField(name = "end_time")
    public long silenceEndTime;
    @JSONField(name = "user_like")
    public UserLike userLike;
    @JSONField(name = "approve")
    public boolean verified;

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class Achieve {
        @JSONField(name = "achieve_url")
        public String achieveUrl;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "is_default")
        public boolean isDefault;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class NftCertificate {
        @Nullable
        @JSONField(name = "detail_url")
        public String detailUrl;
        @JSONField(name = "has_cert")
        public boolean hasCert;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class NftFaceIcon {
        @Nullable
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "region_type")
        public int regionType;
        @JSONField(name = "show_status")
        public int showStatus;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class Pendant {
        @JSONField(name = "expire")
        public long expire;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "image_enhance")
        public String imageEnhance;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "pid")
        public int pid;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class PrInfo {
        @JSONField(name = "bg_color")
        public String bgColor;
        @JSONField(name = "bg_color_night")
        public String bgColorNight;
        @JSONField(name = "content")
        public String content;
        public String icon;
        @JSONField(name = "icon_night")
        public String iconNight;
        @JSONField(name = "text_color")
        public String textColor;
        @JSONField(name = "text_color_night")
        public String textColorNight;
        @JSONField(name = "url")
        public String url;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class ProfessionVerify {
        @Nullable
        @JSONField(name = "icon")
        public String icon;
        @Nullable
        @JSONField(name = "link_url")
        public String linkUrl;
        @Nullable
        @JSONField(name = "show_desc")
        public String showDesc;

        public Boolean checkValid() {
            String str = this.showDesc;
            return Boolean.valueOf(str != null && str.length() > 0);
        }
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class SpaceEntrance {
        @Nullable
        @JSONField(name = "icon")
        public String icon;
        @JSONField(name = "is_show_entrance")
        public boolean isShowEntrance;
        @Nullable
        @JSONField(name = "jump_url")
        public String jumpUrl;
    }

    /* compiled from: BL */
    @Keep
    /* loaded from: classes20.dex */
    public static class UserLike {
        @JSONField(name = "like_num")
        public long likeNum;
        @JSONField(name = "rule")
        public String rule;
        @JSONField(name = "rule_url")
        public String ruleUrl;
        @JSONField(name = "skr_tip")
        public String tips;
    }

    public boolean hasAudioPrivilege() {
        return this.mAudio == 1;
    }

    public boolean hasNftCert() {
        NftCertificate nftCertificate = this.nftCertificate;
        return nftCertificate != null && nftCertificate.hasCert;
    }

    public boolean hasSpaceEntrance() {
        SpaceEntrance spaceEntrance = this.entrance;
        return spaceEntrance != null && spaceEntrance.isShowEntrance;
    }

    public boolean isDeleted() {
        return this.isDeleted == 1;
    }

    public boolean isSilence() {
        return this.silence == 1;
    }
}
