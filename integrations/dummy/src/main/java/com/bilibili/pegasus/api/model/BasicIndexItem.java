package com.bilibili.pegasus.api.model;

import android.net.Uri;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.pegasus.api.modelv2.Args;
import com.bilibili.pegasus.api.modelv2.UpArgs;

import java.util.HashMap;
import java.util.List;

@Keep
public class BasicIndexItem {
    public long adIndex;
    @Nullable
    public String ad_cb;
    @Nullable
    public Args args;
    @Nullable
    public String cardGoto;
    public int cardGotoType;
    public int cardPosition;
    @Nullable
    public String cardType;
    public transient long channelId;
    @Nullable
    public String clickUrl;
    public long cmMark;
    @Nullable
    public String cover;
    public long creativeId;
    @Nullable
    public String dalaoFeature;
    @Nullable
    public String dislikeReportData;
    public transient long dislikeTimestamp;
    @Nullable
    public String fromType;
    @Nullable
    public String goTo;
    public int gotoType;
    public long id;
    public long idx;
    public int index;
    @Nullable
    public String ip;
    public boolean isAd;
    public boolean isAdLoc;
    public long materialId;
    @Nullable
    public String param;
    @Nullable
    public PlayerArgs playerArgs;
    @Nullable
    public String posRecUniqueId;
    @Nullable
    public String requestId;
    public long resourceId;
    @Nullable
    public transient DislikeReason selectedDislikeReason;
    @Nullable
    public transient DislikeReason selectedFeedbackReason;
    @Nullable
    public String showUrl;
    public int show_bottom;
    public int show_top;
    @Nullable
    public String squareCover;
    public long srcId;
    @Nullable
    public String state;
    @Nullable
    private Uri stringUriCache;
    @Nullable
    public String subtitle;
    @Nullable
    public transient BasicIndexItem superItem;
    @Nullable
    public transient String tabId;
    @Nullable
    public transient String tabName;
    @Nullable
    public List<ThreePointItem> threePoint;
    @Nullable
    public List<ThreePointItem> threePointV3;
    @Nullable
    public String title;
    public String trackId;
    @Nullable
    public UpArgs upArgs;
    @Nullable
    private String uri;
    @Nullable
    public HashMap<String, String> uriCache;
    @Nullable
    public String viewTypeString;
    public long serverType = -1;
    public long cardIndex = -1;
    public boolean hasAttached = false;
    private transient boolean mHasPendingUpdate = false;
    public transient int createType = 0;
    public transient int selectedDislikeType = -1;
    public transient int dislikeState = -1;
    public transient int dislikeCardHeight = 0;
    public boolean hasReportShow = false;
    public boolean hasReportShowV2 = false;
}
