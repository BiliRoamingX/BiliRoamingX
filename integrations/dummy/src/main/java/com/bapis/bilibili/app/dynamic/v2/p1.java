package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface p1 extends MessageLiteOrBuilder {
    ExtendReplyParam getParams(int i2);

    int getParamsCount();

    List<ExtendReplyParam> getParamsList();

    String getUri();

    ByteString getUriBytes();
}
