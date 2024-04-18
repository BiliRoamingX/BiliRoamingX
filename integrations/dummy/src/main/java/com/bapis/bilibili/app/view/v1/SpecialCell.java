package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class SpecialCell extends GeneratedMessageLite<SpecialCell, SpecialCell.Builder> implements SpecialCellOrBuilder {
    public static final int CELL_BGCOLOR_FIELD_NUMBER = 8;
    public static final int CELL_BGCOLOR_NIGHT_FIELD_NUMBER = 9;
    public static final int CELL_FLUID_FIELD_NUMBER = 16;
    public static final int CELL_TYPE_FIELD_NUMBER = 7;
    private static final SpecialCell DEFAULT_INSTANCE;
    public static final int END_ICON_FIELD_NUMBER = 13;
    public static final int END_ICON_NIGHT_FIELD_NUMBER = 14;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int ICON_NIGHT_FIELD_NUMBER = 2;
    public static final int JUMP_TYPE_FIELD_NUMBER = 12;
    public static final int JUMP_URL_FIELD_NUMBER = 6;
    public static final int NOTES_COUNT_FIELD_NUMBER = 15;
    public static final int PAGE_TITLE_FIELD_NUMBER = 11;
    public static final int PARAM_FIELD_NUMBER = 10;
    private static volatile Parser<SpecialCell> PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 4;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 3;
    private CellFluid cellFluid_;
    private long notesCount_;
    private String icon_ = "";
    private String iconNight_ = "";
    private String text_ = "";
    private String textColor_ = "";
    private String textColorNight_ = "";
    private String jumpUrl_ = "";
    private String cellType_ = "";
    private String cellBgcolor_ = "";
    private String cellBgcolorNight_ = "";
    private String param_ = "";
    private String pageTitle_ = "";
    private String jumpType_ = "";
    private String endIcon_ = "";
    private String endIconNight_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SpecialCell$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16822xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16822xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16822xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16822xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16822xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16822xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16822xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16822xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SpecialCell, Builder> implements SpecialCellOrBuilder {
        /* synthetic */ Builder(C68631 c68631) {
            this();
        }

        public Builder clearCellBgcolor() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearCellBgcolor();
            return this;
        }

        public Builder clearCellBgcolorNight() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearCellBgcolorNight();
            return this;
        }

        public Builder clearCellFluid() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearCellFluid();
            return this;
        }

        public Builder clearCellType() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearCellType();
            return this;
        }

        public Builder clearEndIcon() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearEndIcon();
            return this;
        }

        public Builder clearEndIconNight() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearEndIconNight();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearIcon();
            return this;
        }

        public Builder clearIconNight() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearIconNight();
            return this;
        }

        public Builder clearJumpType() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearJumpType();
            return this;
        }

        public Builder clearJumpUrl() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearJumpUrl();
            return this;
        }

        public Builder clearNotesCount() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearNotesCount();
            return this;
        }

        public Builder clearPageTitle() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearPageTitle();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearParam();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((SpecialCell) this.instance).clearTextColorNight();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getCellBgcolor() {
            return ((SpecialCell) this.instance).getCellBgcolor();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getCellBgcolorBytes() {
            return ((SpecialCell) this.instance).getCellBgcolorBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getCellBgcolorNight() {
            return ((SpecialCell) this.instance).getCellBgcolorNight();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getCellBgcolorNightBytes() {
            return ((SpecialCell) this.instance).getCellBgcolorNightBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public CellFluid getCellFluid() {
            return ((SpecialCell) this.instance).getCellFluid();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getCellType() {
            return ((SpecialCell) this.instance).getCellType();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getCellTypeBytes() {
            return ((SpecialCell) this.instance).getCellTypeBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getEndIcon() {
            return ((SpecialCell) this.instance).getEndIcon();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getEndIconBytes() {
            return ((SpecialCell) this.instance).getEndIconBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getEndIconNight() {
            return ((SpecialCell) this.instance).getEndIconNight();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getEndIconNightBytes() {
            return ((SpecialCell) this.instance).getEndIconNightBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getIcon() {
            return ((SpecialCell) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getIconBytes() {
            return ((SpecialCell) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getIconNight() {
            return ((SpecialCell) this.instance).getIconNight();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getIconNightBytes() {
            return ((SpecialCell) this.instance).getIconNightBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getJumpType() {
            return ((SpecialCell) this.instance).getJumpType();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getJumpTypeBytes() {
            return ((SpecialCell) this.instance).getJumpTypeBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getJumpUrl() {
            return ((SpecialCell) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getJumpUrlBytes() {
            return ((SpecialCell) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public long getNotesCount() {
            return ((SpecialCell) this.instance).getNotesCount();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getPageTitle() {
            return ((SpecialCell) this.instance).getPageTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getPageTitleBytes() {
            return ((SpecialCell) this.instance).getPageTitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getParam() {
            return ((SpecialCell) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getParamBytes() {
            return ((SpecialCell) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getText() {
            return ((SpecialCell) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getTextBytes() {
            return ((SpecialCell) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getTextColor() {
            return ((SpecialCell) this.instance).getTextColor();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getTextColorBytes() {
            return ((SpecialCell) this.instance).getTextColorBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public String getTextColorNight() {
            return ((SpecialCell) this.instance).getTextColorNight();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public ByteString getTextColorNightBytes() {
            return ((SpecialCell) this.instance).getTextColorNightBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
        public boolean hasCellFluid() {
            return ((SpecialCell) this.instance).hasCellFluid();
        }

        public Builder mergeCellFluid(CellFluid cellFluid) {
            copyOnWrite();
            ((SpecialCell) this.instance).mergeCellFluid(cellFluid);
            return this;
        }

        public Builder setCellBgcolor(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellBgcolor(str);
            return this;
        }

        public Builder setCellBgcolorBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellBgcolorBytes(byteString);
            return this;
        }

        public Builder setCellBgcolorNight(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellBgcolorNight(str);
            return this;
        }

        public Builder setCellBgcolorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellBgcolorNightBytes(byteString);
            return this;
        }

        public Builder setCellFluid(CellFluid cellFluid) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellFluid(cellFluid);
            return this;
        }

        public Builder setCellType(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellType(str);
            return this;
        }

        public Builder setCellTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellTypeBytes(byteString);
            return this;
        }

        public Builder setEndIcon(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setEndIcon(str);
            return this;
        }

        public Builder setEndIconBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setEndIconBytes(byteString);
            return this;
        }

        public Builder setEndIconNight(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setEndIconNight(str);
            return this;
        }

        public Builder setEndIconNightBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setEndIconNightBytes(byteString);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setIconNight(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setIconNight(str);
            return this;
        }

        public Builder setIconNightBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setIconNightBytes(byteString);
            return this;
        }

        public Builder setJumpType(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setJumpType(str);
            return this;
        }

        public Builder setJumpTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setJumpTypeBytes(byteString);
            return this;
        }

        public Builder setJumpUrl(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setJumpUrl(str);
            return this;
        }

        public Builder setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public Builder setNotesCount(long j) {
            copyOnWrite();
            ((SpecialCell) this.instance).setNotesCount(j);
            return this;
        }

        public Builder setPageTitle(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setPageTitle(str);
            return this;
        }

        public Builder setPageTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setPageTitleBytes(byteString);
            return this;
        }

        public Builder setParam(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setParam(str);
            return this;
        }

        public Builder setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setParamBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((SpecialCell) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((SpecialCell) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        private Builder() {
            super(SpecialCell.DEFAULT_INSTANCE);
        }

        public Builder setCellFluid(CellFluid.Builder builder) {
            copyOnWrite();
            ((SpecialCell) this.instance).setCellFluid(builder.build());
            return this;
        }
    }

    static {
        SpecialCell specialCell = new SpecialCell();
        DEFAULT_INSTANCE = specialCell;
        GeneratedMessageLite.registerDefaultInstance(SpecialCell.class, specialCell);
    }

    private SpecialCell() {
    }

    public void clearCellBgcolor() {
        this.cellBgcolor_ = getDefaultInstance().getCellBgcolor();
    }

    public void clearCellBgcolorNight() {
        this.cellBgcolorNight_ = getDefaultInstance().getCellBgcolorNight();
    }

    public void clearCellFluid() {
        this.cellFluid_ = null;
    }

    public void clearCellType() {
        this.cellType_ = getDefaultInstance().getCellType();
    }

    public void clearEndIcon() {
        this.endIcon_ = getDefaultInstance().getEndIcon();
    }

    public void clearEndIconNight() {
        this.endIconNight_ = getDefaultInstance().getEndIconNight();
    }

    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    public void clearIconNight() {
        this.iconNight_ = getDefaultInstance().getIconNight();
    }

    public void clearJumpType() {
        this.jumpType_ = getDefaultInstance().getJumpType();
    }

    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    public void clearNotesCount() {
        this.notesCount_ = 0L;
    }

    public void clearPageTitle() {
        this.pageTitle_ = getDefaultInstance().getPageTitle();
    }

    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    public void clearTextColorNight() {
        this.textColorNight_ = getDefaultInstance().getTextColorNight();
    }

    public static SpecialCell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeCellFluid(CellFluid cellFluid) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SpecialCell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpecialCell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpecialCell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SpecialCell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCellBgcolor(String str) {
        str.getClass();
        this.cellBgcolor_ = str;
    }

    public void setCellBgcolorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cellBgcolor_ = byteString.toStringUtf8();
    }

    public void setCellBgcolorNight(String str) {
        str.getClass();
        this.cellBgcolorNight_ = str;
    }

    public void setCellBgcolorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cellBgcolorNight_ = byteString.toStringUtf8();
    }

    public void setCellFluid(CellFluid cellFluid) {
        cellFluid.getClass();
        this.cellFluid_ = cellFluid;
    }

    public void setCellType(String str) {
        str.getClass();
        this.cellType_ = str;
    }

    public void setCellTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cellType_ = byteString.toStringUtf8();
    }

    public void setEndIcon(String str) {
        str.getClass();
        this.endIcon_ = str;
    }

    public void setEndIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.endIcon_ = byteString.toStringUtf8();
    }

    public void setEndIconNight(String str) {
        str.getClass();
        this.endIconNight_ = str;
    }

    public void setEndIconNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.endIconNight_ = byteString.toStringUtf8();
    }

    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    public void setIconNight(String str) {
        str.getClass();
        this.iconNight_ = str;
    }

    public void setIconNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconNight_ = byteString.toStringUtf8();
    }

    public void setJumpType(String str) {
        str.getClass();
        this.jumpType_ = str;
    }

    public void setJumpTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpType_ = byteString.toStringUtf8();
    }

    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    public void setNotesCount(long j) {
        this.notesCount_ = j;
    }

    public void setPageTitle(String str) {
        str.getClass();
        this.pageTitle_ = str;
    }

    public void setPageTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pageTitle_ = byteString.toStringUtf8();
    }

    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    public void setTextColor(String str) {
        str.getClass();
        this.textColor_ = str;
    }

    public void setTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }

    public void setTextColorNight(String str) {
        str.getClass();
        this.textColorNight_ = str;
    }

    public void setTextColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColorNight_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68631.f16822xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SpecialCell();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0208\u000e\u0208\u000f\u0002\u0010\t", new Object[]{"icon_", "iconNight_", "text_", "textColor_", "textColorNight_", "jumpUrl_", "cellType_", "cellBgcolor_", "cellBgcolorNight_", "param_", "pageTitle_", "jumpType_", "endIcon_", "endIconNight_", "notesCount_", "cellFluid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SpecialCell> parser = PARSER;
                if (parser == null) {
                    synchronized (SpecialCell.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getCellBgcolor() {
        return this.cellBgcolor_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getCellBgcolorBytes() {
        return ByteString.copyFromUtf8(this.cellBgcolor_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getCellBgcolorNight() {
        return this.cellBgcolorNight_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getCellBgcolorNightBytes() {
        return ByteString.copyFromUtf8(this.cellBgcolorNight_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public CellFluid getCellFluid() {
        CellFluid cellFluid = this.cellFluid_;
        return cellFluid == null ? CellFluid.getDefaultInstance() : cellFluid;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getCellType() {
        return this.cellType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getCellTypeBytes() {
        return ByteString.copyFromUtf8(this.cellType_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getEndIcon() {
        return this.endIcon_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getEndIconBytes() {
        return ByteString.copyFromUtf8(this.endIcon_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getEndIconNight() {
        return this.endIconNight_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getEndIconNightBytes() {
        return ByteString.copyFromUtf8(this.endIconNight_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getIconNight() {
        return this.iconNight_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getIconNightBytes() {
        return ByteString.copyFromUtf8(this.iconNight_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getJumpType() {
        return this.jumpType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getJumpTypeBytes() {
        return ByteString.copyFromUtf8(this.jumpType_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public long getNotesCount() {
        return this.notesCount_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getPageTitle() {
        return this.pageTitle_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getPageTitleBytes() {
        return ByteString.copyFromUtf8(this.pageTitle_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getTextColor() {
        return this.textColor_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public String getTextColorNight() {
        return this.textColorNight_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SpecialCellOrBuilder
    public boolean hasCellFluid() {
        return this.cellFluid_ != null;
    }

    public static Builder newBuilder(SpecialCell specialCell) {
        return DEFAULT_INSTANCE.createBuilder(specialCell);
    }

    public static SpecialCell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecialCell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SpecialCell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SpecialCell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SpecialCell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SpecialCell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SpecialCell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SpecialCell parseFrom(InputStream inputStream) throws IOException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpecialCell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SpecialCell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SpecialCell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecialCell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
