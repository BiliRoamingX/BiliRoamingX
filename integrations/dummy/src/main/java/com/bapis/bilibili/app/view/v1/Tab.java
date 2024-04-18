package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class Tab extends GeneratedMessageLite<Tab, Tab.Builder> implements MessageLiteOrBuilder {
    public static final int AD_TAB_INFO_FIELD_NUMBER = 11;
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final Tab DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 10;
    public static final int OID_FIELD_NUMBER = 3;
    public static final int OTYPE_FIELD_NUMBER = 2;
    private static volatile Parser<Tab> PARSER = null;
    public static final int PIC_FIELD_NUMBER = 9;
    public static final int STYLE_FIELD_NUMBER = 5;
    public static final int TEXT_COLOR_FIELD_NUMBER = 7;
    public static final int TEXT_COLOR_SELECTED_FIELD_NUMBER = 8;
    public static final int TEXT_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 4;
    private Any adTabInfo_;
    private long id_;
    private long oid_;
    private int otype_;
    private int style_;
    private String background_ = "";
    private String uri_ = "";
    private String text_ = "";
    private String textColor_ = "";
    private String textColorSelected_ = "";
    private String pic_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Tab$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16832xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16832xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16832xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16832xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16832xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16832xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16832xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16832xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Tab, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68731 c68731) {
            this();
        }

        public Builder clearAdTabInfo() {
            copyOnWrite();
            ((Tab) this.instance).clearAdTabInfo();
            return this;
        }

        public Builder clearBackground() {
            copyOnWrite();
            ((Tab) this.instance).clearBackground();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Tab) this.instance).clearId();
            return this;
        }

        public Builder clearOid() {
            copyOnWrite();
            ((Tab) this.instance).clearOid();
            return this;
        }

        public Builder clearOtype() {
            copyOnWrite();
            ((Tab) this.instance).clearOtype();
            return this;
        }

        public Builder clearPic() {
            copyOnWrite();
            ((Tab) this.instance).clearPic();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((Tab) this.instance).clearStyle();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Tab) this.instance).clearText();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((Tab) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorSelected() {
            copyOnWrite();
            ((Tab) this.instance).clearTextColorSelected();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((Tab) this.instance).clearUri();
            return this;
        }

        public Any getAdTabInfo() {
            return ((Tab) this.instance).getAdTabInfo();
        }

        public String getBackground() {
            return ((Tab) this.instance).getBackground();
        }

        public ByteString getBackgroundBytes() {
            return ((Tab) this.instance).getBackgroundBytes();
        }

        public long getId() {
            return ((Tab) this.instance).getId();
        }

        public long getOid() {
            return ((Tab) this.instance).getOid();
        }

        public TabOtype getOtype() {
            return ((Tab) this.instance).getOtype();
        }

        public int getOtypeValue() {
            return ((Tab) this.instance).getOtypeValue();
        }

        public String getPic() {
            return ((Tab) this.instance).getPic();
        }

        public ByteString getPicBytes() {
            return ((Tab) this.instance).getPicBytes();
        }

        public TabStyle getStyle() {
            return ((Tab) this.instance).getStyle();
        }

        public int getStyleValue() {
            return ((Tab) this.instance).getStyleValue();
        }

        public String getText() {
            return ((Tab) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Tab) this.instance).getTextBytes();
        }

        public String getTextColor() {
            return ((Tab) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((Tab) this.instance).getTextColorBytes();
        }

        public String getTextColorSelected() {
            return ((Tab) this.instance).getTextColorSelected();
        }

        public ByteString getTextColorSelectedBytes() {
            return ((Tab) this.instance).getTextColorSelectedBytes();
        }

        public String getUri() {
            return ((Tab) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((Tab) this.instance).getUriBytes();
        }

        public boolean hasAdTabInfo() {
            return ((Tab) this.instance).hasAdTabInfo();
        }

        public Builder mergeAdTabInfo(Any any) {
            copyOnWrite();
            ((Tab) this.instance).mergeAdTabInfo(any);
            return this;
        }

        public Builder setAdTabInfo(Any any) {
            copyOnWrite();
            ((Tab) this.instance).setAdTabInfo(any);
            return this;
        }

        public Builder setBackground(String str) {
            copyOnWrite();
            ((Tab) this.instance).setBackground(str);
            return this;
        }

        public Builder setBackgroundBytes(ByteString byteString) {
            copyOnWrite();
            ((Tab) this.instance).setBackgroundBytes(byteString);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((Tab) this.instance).setId(j);
            return this;
        }

        public Builder setOid(long j) {
            copyOnWrite();
            ((Tab) this.instance).setOid(j);
            return this;
        }

        public Builder setOtype(TabOtype tabOtype) {
            copyOnWrite();
            ((Tab) this.instance).setOtype(tabOtype);
            return this;
        }

        public Builder setOtypeValue(int i) {
            copyOnWrite();
            ((Tab) this.instance).setOtypeValue(i);
            return this;
        }

        public Builder setPic(String str) {
            copyOnWrite();
            ((Tab) this.instance).setPic(str);
            return this;
        }

        public Builder setPicBytes(ByteString byteString) {
            copyOnWrite();
            ((Tab) this.instance).setPicBytes(byteString);
            return this;
        }

        public Builder setStyle(TabStyle tabStyle) {
            copyOnWrite();
            ((Tab) this.instance).setStyle(tabStyle);
            return this;
        }

        public Builder setStyleValue(int i) {
            copyOnWrite();
            ((Tab) this.instance).setStyleValue(i);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Tab) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Tab) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((Tab) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((Tab) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorSelected(String str) {
            copyOnWrite();
            ((Tab) this.instance).setTextColorSelected(str);
            return this;
        }

        public Builder setTextColorSelectedBytes(ByteString byteString) {
            copyOnWrite();
            ((Tab) this.instance).setTextColorSelectedBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Tab) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Tab) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(Tab.DEFAULT_INSTANCE);
        }

        public Builder setAdTabInfo(Any.Builder builder) {
            copyOnWrite();
            ((Tab) this.instance).setAdTabInfo(builder.build());
            return this;
        }
    }

    static {
        Tab tab = new Tab();
        DEFAULT_INSTANCE = tab;
        GeneratedMessageLite.registerDefaultInstance(Tab.class, tab);
    }

    private Tab() {
    }

    public void clearAdTabInfo() {
        this.adTabInfo_ = null;
    }

    public void clearBackground() {
        this.background_ = getDefaultInstance().getBackground();
    }

    public void clearId() {
        this.id_ = 0L;
    }

    public void clearOid() {
        this.oid_ = 0L;
    }

    public void clearOtype() {
        this.otype_ = 0;
    }

    public void clearPic() {
        this.pic_ = getDefaultInstance().getPic();
    }

    public void clearStyle() {
        this.style_ = 0;
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    public void clearTextColorSelected() {
        this.textColorSelected_ = getDefaultInstance().getTextColorSelected();
    }

    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Tab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAdTabInfo(Any any) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Tab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Tab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Tab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Tab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAdTabInfo(Any any) {
        any.getClass();
        this.adTabInfo_ = any;
    }

    public void setBackground(String str) {
        str.getClass();
        this.background_ = str;
    }

    public void setBackgroundBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.background_ = byteString.toStringUtf8();
    }

    public void setId(long j) {
        this.id_ = j;
    }

    public void setOid(long j) {
        this.oid_ = j;
    }

    public void setOtype(TabOtype tabOtype) {
        this.otype_ = tabOtype.getNumber();
    }

    public void setOtypeValue(int i) {
        this.otype_ = i;
    }

    public void setPic(String str) {
        str.getClass();
        this.pic_ = str;
    }

    public void setPicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pic_ = byteString.toStringUtf8();
    }

    public void setStyle(TabStyle tabStyle) {
        this.style_ = tabStyle.getNumber();
    }

    public void setStyleValue(int i) {
        this.style_ = i;
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

    public void setTextColorSelected(String str) {
        str.getClass();
        this.textColorSelected_ = str;
    }

    public void setTextColorSelectedBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColorSelected_ = byteString.toStringUtf8();
    }

    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68731.f16832xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Tab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0002\u0004\u0208\u0005\f\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0002\u000b\t", new Object[]{"background_", "otype_", "oid_", "uri_", "style_", "text_", "textColor_", "textColorSelected_", "pic_", "id_", "adTabInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Tab> parser = PARSER;
                if (parser == null) {
                    synchronized (Tab.class) {
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

    public Any getAdTabInfo() {
        Any any = this.adTabInfo_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public String getBackground() {
        return this.background_;
    }

    public ByteString getBackgroundBytes() {
        return ByteString.copyFromUtf8(this.background_);
    }

    public long getId() {
        return this.id_;
    }

    public long getOid() {
        return this.oid_;
    }

    public TabOtype getOtype() {
        TabOtype forNumber = TabOtype.forNumber(this.otype_);
        return forNumber == null ? TabOtype.UNRECOGNIZED : forNumber;
    }

    public int getOtypeValue() {
        return this.otype_;
    }

    public String getPic() {
        return this.pic_;
    }

    public ByteString getPicBytes() {
        return ByteString.copyFromUtf8(this.pic_);
    }

    public TabStyle getStyle() {
        TabStyle forNumber = TabStyle.forNumber(this.style_);
        return forNumber == null ? TabStyle.UNRECOGNIZED : forNumber;
    }

    public int getStyleValue() {
        return this.style_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public String getTextColorSelected() {
        return this.textColorSelected_;
    }

    public ByteString getTextColorSelectedBytes() {
        return ByteString.copyFromUtf8(this.textColorSelected_);
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public boolean hasAdTabInfo() {
        return this.adTabInfo_ != null;
    }

    public static Builder newBuilder(Tab tab) {
        return DEFAULT_INSTANCE.createBuilder(tab);
    }

    public static Tab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Tab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Tab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Tab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Tab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Tab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Tab parseFrom(InputStream inputStream) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Tab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Tab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Tab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
