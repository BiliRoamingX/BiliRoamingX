package com.bapis.bilibili.community.service.dm.v1;

public class DmViewReplyEx {
    public static void clearActivityMeta(DmViewReply reply) {
        DmViewReply.access$6100(reply);
    }

    public static void clearCommand(DmViewReply reply) {
        DmViewReply.access$8000(reply);
    }

    public static void setClosed(DmViewReply reply, boolean closed) {
        DmViewReply.access$100(reply, closed);
    }

    public static void setInputPlaceholder(DmViewReply reply, String inputPlaceholder) {
        DmViewReply.access$3200(reply, inputPlaceholder);
    }
}
