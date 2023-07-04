package com.bapis.bilibili.app.playurl.v1;

public class StreamInfoEx {
    public static void setNeedVip(StreamInfo streamInfo, boolean needVip) {
        StreamInfo.access$1500(streamInfo, needVip);
    }

    public static void setVipFree(StreamInfo streamInfo, boolean vipFree) {
        StreamInfo.access$3400(streamInfo, vipFree);
    }
}
