package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface SpecialCellOrBuilder extends MessageLiteOrBuilder {
    String getCellBgcolor();

    ByteString getCellBgcolorBytes();

    String getCellBgcolorNight();

    ByteString getCellBgcolorNightBytes();

    CellFluid getCellFluid();

    String getCellType();

    ByteString getCellTypeBytes();

    String getEndIcon();

    ByteString getEndIconBytes();

    String getEndIconNight();

    ByteString getEndIconNightBytes();

    String getIcon();

    ByteString getIconBytes();

    String getIconNight();

    ByteString getIconNightBytes();

    String getJumpType();

    ByteString getJumpTypeBytes();

    String getJumpUrl();

    ByteString getJumpUrlBytes();

    long getNotesCount();

    String getPageTitle();

    ByteString getPageTitleBytes();

    String getParam();

    ByteString getParamBytes();

    String getText();

    ByteString getTextBytes();

    String getTextColor();

    ByteString getTextColorBytes();

    String getTextColorNight();

    ByteString getTextColorNightBytes();

    boolean hasCellFluid();
}
