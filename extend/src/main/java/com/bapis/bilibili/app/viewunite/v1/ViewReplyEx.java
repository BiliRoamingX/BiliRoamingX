package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.Any;

public class ViewReplyEx {
    public static void setSupplement(ViewReply viewReply, Any supplement) {
        ViewReply.access$1600(viewReply, supplement);
    }

    public static void setArc(ViewReply viewReply, Arc arc) {
        ViewReply.access$400(viewReply, arc);
    }
}
