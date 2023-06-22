package com.bapis.bilibili.community.service.dm.v1;

import androidx.annotation.Keep;

@Keep
public class DmViewReplyEx {
    public static void clearActivityMeta(DmViewReply reply) {
        DmViewReply.access$6100(reply);
    }

    public static void clearCommand(DmViewReply reply) {
        DmViewReply.access$8000(reply);
    }
}
