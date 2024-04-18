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
public final class RecordInfo extends GeneratedMessageLite<RecordInfo, RecordInfo.Builder> implements MessageLiteOrBuilder {
    private static final RecordInfo DEFAULT_INSTANCE;
    private static volatile Parser<RecordInfo> PARSER = null;
    public static final int RECORD_FIELD_NUMBER = 1;
    public static final int RECORD_ICON_FIELD_NUMBER = 2;
    private String record_ = "";
    private String recordIcon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.RecordInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17589xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17589xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17589xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17589xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17589xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17589xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17589xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17589xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RecordInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78741 c78741) {
            this();
        }

        public Builder clearRecord() {
            copyOnWrite();
            ((RecordInfo) this.instance).clearRecord();
            return this;
        }

        public Builder clearRecordIcon() {
            copyOnWrite();
            ((RecordInfo) this.instance).clearRecordIcon();
            return this;
        }

        public String getRecord() {
            return ((RecordInfo) this.instance).getRecord();
        }

        public ByteString getRecordBytes() {
            return ((RecordInfo) this.instance).getRecordBytes();
        }

        public String getRecordIcon() {
            return ((RecordInfo) this.instance).getRecordIcon();
        }

        public ByteString getRecordIconBytes() {
            return ((RecordInfo) this.instance).getRecordIconBytes();
        }

        public Builder setRecord(String str) {
            copyOnWrite();
            ((RecordInfo) this.instance).setRecord(str);
            return this;
        }

        public Builder setRecordBytes(ByteString byteString) {
            copyOnWrite();
            ((RecordInfo) this.instance).setRecordBytes(byteString);
            return this;
        }

        public Builder setRecordIcon(String str) {
            copyOnWrite();
            ((RecordInfo) this.instance).setRecordIcon(str);
            return this;
        }

        public Builder setRecordIconBytes(ByteString byteString) {
            copyOnWrite();
            ((RecordInfo) this.instance).setRecordIconBytes(byteString);
            return this;
        }

        private Builder() {
            super(RecordInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        RecordInfo recordInfo = new RecordInfo();
        DEFAULT_INSTANCE = recordInfo;
        GeneratedMessageLite.registerDefaultInstance(RecordInfo.class, recordInfo);
    }

    private RecordInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecord() {
        this.record_ = getDefaultInstance().getRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecordIcon() {
        this.recordIcon_ = getDefaultInstance().getRecordIcon();
    }

    public static RecordInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecordInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecordInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecordInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecordInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecord(String str) {
        str.getClass();
        this.record_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.record_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordIcon(String str) {
        str.getClass();
        this.recordIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.recordIcon_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78741.f17589xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RecordInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"record_", "recordIcon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecordInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (RecordInfo.class) {
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

    public String getRecord() {
        return this.record_;
    }

    public ByteString getRecordBytes() {
        return ByteString.copyFromUtf8(this.record_);
    }

    public String getRecordIcon() {
        return this.recordIcon_;
    }

    public ByteString getRecordIconBytes() {
        return ByteString.copyFromUtf8(this.recordIcon_);
    }

    public static Builder newBuilder(RecordInfo recordInfo) {
        return DEFAULT_INSTANCE.createBuilder(recordInfo);
    }

    public static RecordInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecordInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecordInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecordInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecordInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecordInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecordInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecordInfo parseFrom(InputStream inputStream) throws IOException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecordInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecordInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecordInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
