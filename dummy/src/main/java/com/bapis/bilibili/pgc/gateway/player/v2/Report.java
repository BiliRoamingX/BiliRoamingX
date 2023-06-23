package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class Report extends GeneratedMessageLite<Report, Report.Builder> implements MessageLiteOrBuilder {
    public static final int CLICK_EVENT_ID_FIELD_NUMBER = 2;
    private static final Report DEFAULT_INSTANCE;
    public static final int EXTENDS_FIELD_NUMBER = 3;
    private static volatile Parser<Report> PARSER = null;
    public static final int SHOW_EVENT_ID_FIELD_NUMBER = 1;
    private String showEventId_ = "";
    private String clickEventId_ = "";
    private String extends_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.Report$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78751 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17590xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17590xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17590xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17590xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17590xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17590xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17590xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17590xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Report, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78751 c78751) {
            this();
        }

        public Builder clearClickEventId() {
            copyOnWrite();
            ((Report) this.instance).clearClickEventId();
            return this;
        }

        public Builder clearExtends() {
            copyOnWrite();
            ((Report) this.instance).clearExtends();
            return this;
        }

        public Builder clearShowEventId() {
            copyOnWrite();
            ((Report) this.instance).clearShowEventId();
            return this;
        }

        public String getClickEventId() {
            return ((Report) this.instance).getClickEventId();
        }

        public ByteString getClickEventIdBytes() {
            return ((Report) this.instance).getClickEventIdBytes();
        }

        public String getExtends() {
            return ((Report) this.instance).getExtends();
        }

        public ByteString getExtendsBytes() {
            return ((Report) this.instance).getExtendsBytes();
        }

        public String getShowEventId() {
            return ((Report) this.instance).getShowEventId();
        }

        public ByteString getShowEventIdBytes() {
            return ((Report) this.instance).getShowEventIdBytes();
        }

        public Builder setClickEventId(String str) {
            copyOnWrite();
            ((Report) this.instance).setClickEventId(str);
            return this;
        }

        public Builder setClickEventIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Report) this.instance).setClickEventIdBytes(byteString);
            return this;
        }

        public Builder setExtends(String str) {
            copyOnWrite();
            ((Report) this.instance).setExtends(str);
            return this;
        }

        public Builder setExtendsBytes(ByteString byteString) {
            copyOnWrite();
            ((Report) this.instance).setExtendsBytes(byteString);
            return this;
        }

        public Builder setShowEventId(String str) {
            copyOnWrite();
            ((Report) this.instance).setShowEventId(str);
            return this;
        }

        public Builder setShowEventIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Report) this.instance).setShowEventIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(Report.DEFAULT_INSTANCE);
        }
    }

    static {
        Report report = new Report();
        DEFAULT_INSTANCE = report;
        GeneratedMessageLite.registerDefaultInstance(Report.class, report);
    }

    private Report() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickEventId() {
        this.clickEventId_ = getDefaultInstance().getClickEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtends() {
        this.extends_ = getDefaultInstance().getExtends();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowEventId() {
        this.showEventId_ = getDefaultInstance().getShowEventId();
    }

    public static Report getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Report parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Report) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Report parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Report> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickEventId(String str) {
        str.getClass();
        this.clickEventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickEventIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clickEventId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtends(String str) {
        str.getClass();
        this.extends_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extends_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowEventId(String str) {
        str.getClass();
        this.showEventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowEventIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.showEventId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78751.f17590xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Report();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"showEventId_", "clickEventId_", "extends_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Report> parser = PARSER;
                if (parser == null) {
                    synchronized (Report.class) {
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

    public String getClickEventId() {
        return this.clickEventId_;
    }

    public ByteString getClickEventIdBytes() {
        return ByteString.copyFromUtf8(this.clickEventId_);
    }

    public String getExtends() {
        return this.extends_;
    }

    public ByteString getExtendsBytes() {
        return ByteString.copyFromUtf8(this.extends_);
    }

    public String getShowEventId() {
        return this.showEventId_;
    }

    public ByteString getShowEventIdBytes() {
        return ByteString.copyFromUtf8(this.showEventId_);
    }

    public static Builder newBuilder(Report report) {
        return DEFAULT_INSTANCE.createBuilder(report);
    }

    public static Report parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Report) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Report parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Report parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Report parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Report parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Report parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Report parseFrom(InputStream inputStream) throws IOException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Report parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Report parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Report parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Report) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
