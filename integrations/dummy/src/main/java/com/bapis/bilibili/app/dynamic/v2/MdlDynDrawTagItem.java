package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes19.dex */
public final class MdlDynDrawTagItem extends GeneratedMessageLite<MdlDynDrawTagItem, MdlDynDrawTagItem.C5688b> implements MessageLiteOrBuilder {
    private static final MdlDynDrawTagItem DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 7;
    public static final int MID_FIELD_NUMBER = 8;
    public static final int ORIENTATION_FIELD_NUMBER = 5;
    private static volatile Parser<MdlDynDrawTagItem> PARSER = null;
    public static final int POI_FIELD_NUMBER = 10;
    public static final int SCHEMA_URL_FIELD_NUMBER = 11;
    public static final int SOURCE_FIELD_NUMBER = 6;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TID_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private long itemId_;
    private long mid_;
    private int orientation_;
    private int source_;
    private long tid_;
    private long x_;
    private long y_;
    private String url_ = "";
    private String text_ = "";
    private String poi_ = "";
    private String schemaUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawTagItem$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5687a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17353xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17353xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17353xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17353xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17353xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17353xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17353xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17353xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawTagItem$b */
    /* loaded from: classes19.dex */
    public static final class C5688b extends GeneratedMessageLite.Builder<MdlDynDrawTagItem, C5688b> implements MessageLiteOrBuilder {
        /* synthetic */ C5688b(C5687a c5687a) {
            this();
        }

        public C5688b clearItemId() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearItemId();
            return this;
        }

        public C5688b clearMid() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearMid();
            return this;
        }

        public C5688b clearOrientation() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearOrientation();
            return this;
        }

        public C5688b clearPoi() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearPoi();
            return this;
        }

        public C5688b clearSchemaUrl() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearSchemaUrl();
            return this;
        }

        public C5688b clearSource() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearSource();
            return this;
        }

        public C5688b clearText() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearText();
            return this;
        }

        public C5688b clearTid() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearTid();
            return this;
        }

        public C5688b clearUrl() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearUrl();
            return this;
        }

        public C5688b clearX() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearX();
            return this;
        }

        public C5688b clearY() {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).clearY();
            return this;
        }

        public long getItemId() {
            return ((MdlDynDrawTagItem) this.instance).getItemId();
        }

        public long getMid() {
            return ((MdlDynDrawTagItem) this.instance).getMid();
        }

        public int getOrientation() {
            return ((MdlDynDrawTagItem) this.instance).getOrientation();
        }

        public String getPoi() {
            return ((MdlDynDrawTagItem) this.instance).getPoi();
        }

        public ByteString getPoiBytes() {
            return ((MdlDynDrawTagItem) this.instance).getPoiBytes();
        }

        public String getSchemaUrl() {
            return ((MdlDynDrawTagItem) this.instance).getSchemaUrl();
        }

        public ByteString getSchemaUrlBytes() {
            return ((MdlDynDrawTagItem) this.instance).getSchemaUrlBytes();
        }

        public int getSource() {
            return ((MdlDynDrawTagItem) this.instance).getSource();
        }

        public String getText() {
            return ((MdlDynDrawTagItem) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((MdlDynDrawTagItem) this.instance).getTextBytes();
        }

        public long getTid() {
            return ((MdlDynDrawTagItem) this.instance).getTid();
        }

        public String getUrl() {
            return ((MdlDynDrawTagItem) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((MdlDynDrawTagItem) this.instance).getUrlBytes();
        }

        public long getX() {
            return ((MdlDynDrawTagItem) this.instance).getX();
        }

        public long getY() {
            return ((MdlDynDrawTagItem) this.instance).getY();
        }

        public C5688b setItemId(long j2) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setItemId(j2);
            return this;
        }

        public C5688b setMid(long j2) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setMid(j2);
            return this;
        }

        public C5688b setOrientation(int i2) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setOrientation(i2);
            return this;
        }

        public C5688b setPoi(String str) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setPoi(str);
            return this;
        }

        public C5688b setPoiBytes(ByteString byteString) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setPoiBytes(byteString);
            return this;
        }

        public C5688b setSchemaUrl(String str) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setSchemaUrl(str);
            return this;
        }

        public C5688b setSchemaUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setSchemaUrlBytes(byteString);
            return this;
        }

        public C5688b setSource(int i2) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setSource(i2);
            return this;
        }

        public C5688b setText(String str) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setText(str);
            return this;
        }

        public C5688b setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setTextBytes(byteString);
            return this;
        }

        public C5688b setTid(long j2) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setTid(j2);
            return this;
        }

        public C5688b setUrl(String str) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setUrl(str);
            return this;
        }

        public C5688b setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setUrlBytes(byteString);
            return this;
        }

        public C5688b setX(long j2) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setX(j2);
            return this;
        }

        public C5688b setY(long j2) {
            copyOnWrite();
            ((MdlDynDrawTagItem) this.instance).setY(j2);
            return this;
        }

        private C5688b() {
            super(MdlDynDrawTagItem.DEFAULT_INSTANCE);
        }
    }

    static {
        MdlDynDrawTagItem mdlDynDrawTagItem = new MdlDynDrawTagItem();
        DEFAULT_INSTANCE = mdlDynDrawTagItem;
        GeneratedMessageLite.registerDefaultInstance(MdlDynDrawTagItem.class, mdlDynDrawTagItem);
    }

    private MdlDynDrawTagItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemId() {
        this.itemId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrientation() {
        this.orientation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoi() {
        this.poi_ = getDefaultInstance().getPoi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.x_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.y_ = 0L;
    }

    public static MdlDynDrawTagItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5688b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MdlDynDrawTagItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDrawTagItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MdlDynDrawTagItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemId(long j2) {
        this.itemId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j2) {
        this.mid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientation(int i2) {
        this.orientation_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoi(String str) {
        str.getClass();
        this.poi_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoiBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.poi_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrl(String str) {
        str.getClass();
        this.schemaUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.schemaUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(int i2) {
        this.source_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(long j2) {
        this.tid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(long j2) {
        this.x_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(long j2) {
        this.y_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5687a c5687a = null;
        switch (C5687a.f17353xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MdlDynDrawTagItem();
            case 2:
                return new C5688b(c5687a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0004\u0006\u0004\u0007\u0002\b\u0002\t\u0002\n\u0208\u000b\u0208", new Object[]{"url_", "text_", "x_", "y_", "orientation_", "source_", "itemId_", "mid_", "tid_", "poi_", "schemaUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MdlDynDrawTagItem> parser = PARSER;
                if (parser == null) {
                    synchronized (MdlDynDrawTagItem.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public long getItemId() {
        return this.itemId_;
    }

    public long getMid() {
        return this.mid_;
    }

    public int getOrientation() {
        return this.orientation_;
    }

    public String getPoi() {
        return this.poi_;
    }

    public ByteString getPoiBytes() {
        return ByteString.copyFromUtf8(this.poi_);
    }

    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    public ByteString getSchemaUrlBytes() {
        return ByteString.copyFromUtf8(this.schemaUrl_);
    }

    public int getSource() {
        return this.source_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public long getTid() {
        return this.tid_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public long getX() {
        return this.x_;
    }

    public long getY() {
        return this.y_;
    }

    public static C5688b newBuilder(MdlDynDrawTagItem mdlDynDrawTagItem) {
        return DEFAULT_INSTANCE.createBuilder(mdlDynDrawTagItem);
    }

    public static MdlDynDrawTagItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDrawTagItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MdlDynDrawTagItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MdlDynDrawTagItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MdlDynDrawTagItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MdlDynDrawTagItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MdlDynDrawTagItem parseFrom(InputStream inputStream) throws IOException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDrawTagItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDrawTagItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MdlDynDrawTagItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawTagItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
