package com.bilibili.app.authorspace.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.adcommon.basic.model.SourceContent;
import com.bilibili.comm.charge.api.ChargeRankResult;

import java.util.List;

@Keep
public class BiliSpace {
    @Nullable
    @JSONField(name = "tab2")
    public List<Tab> tab;

    @Nullable
    @JSONField(name = "live")
    public BiliUserLiveEntry liveEntry;

    @Nullable
    @JSONField(name = "elec")
    public ChargeRankResult chargeResult;

    @Nullable
    @JSONField(name = "guard")
    public BiliSpaceGuard guard;

    @Nullable
    @JSONField(name = "ad_source_content")
    public SourceContent ad;
    @Nullable
    @JSONField(name = "ad_source_content_v2")
    public SourceContent adV2;

    @Nullable
    @JSONField(name = "archive")
    public BiliSpaceArchiveVideo archiveVideo;

    @Nullable
    @JSONField(name = "article")
    public BiliSpaceArticleList article;

    @Nullable
    @JSONField(name = "audios")
    public BiliSpaceAudioList audio;

    @Nullable
    @JSONField(name = "season")
    public BiliSpaceSeason season;

    @Nullable
    @JSONField(name = "space_cat")
    public SpaceCat spaceCat;

    @Nullable
    @JSONField(name = "coin_archive")
    public BiliSpaceArchiveVideo coinVideo;

    @Nullable
    @JSONField(name = "like_archive")
    public BiliSpaceArchiveVideo recommendVideo;

    @Nullable
    @JSONField(name = "sub_comic")
    public BiliSpaceComicList followComicList;

    @Nullable
    @JSONField(name = "play_game")
    public BiliSpaceUserGame spaceGame;

    @Nullable
    @JSONField(name = "cheese")
    public BiliSpaceArchiveVideo cheeseVideo;

    @Nullable
    @JSONField(name = "fans_dress")
    public BiliSpaceFansDress fansDress;

    @Nullable
    @JSONField(name = "favourite2")
    public BiliSpaceFavoriteBox favoriteBox;

    @Nullable
    @JSONField(name = "comic")
    public BiliSpaceComicList comicList;

    @Nullable
    @JSONField(name = "ugc_season")
    public BiliSpaceUgcSeasonList ugcSeasonList;

    @Nullable
    @JSONField(name = "contract_resource")
    public ContractResource contractResource;

    @Nullable
    @JSONField(name = "nft_show_module")
    public BiliSpaceNftShowModule nftShowModule;

    @Nullable
    @JSONField(name = "space_button_list")
    public List<BiliSpaceButtonEntrance> buttonEntranceList;

    @Keep
    public static class Tab {
        public List<Tab> items;
        public String param;
        @Nullable
        @JSONField(name = "season_id")
        public String seasonId;
        @Nullable
        @JSONField(name = "series_id")
        public String seriesId;
        public String title;
    }

    @Keep
    public static class SpaceCat {
        @Nullable
        @JSONField(name = "cat_jump_link")
        public String catJumpUrl;
        @JSONField(name = "has_cat")
        public boolean hasCat;
    }
}
