package com.bapis.bilibili.app.archive.v1;

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
/* loaded from: classes12.dex */
public final class StaffInfo extends GeneratedMessageLite<StaffInfo, StaffInfo.Builder> implements StaffInfoOrBuilder {
    public static final int ATTRIBUTE_FIELD_NUMBER = 3;
    private static final StaffInfo DEFAULT_INSTANCE;
    public static final int MID_FIELD_NUMBER = 1;
    private static volatile Parser<StaffInfo> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private long attribute_;
    private long mid_;
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.v1.StaffInfo$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55211 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15731xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15731xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15731xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15731xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15731xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15731xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15731xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15731xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StaffInfo, Builder> implements StaffInfoOrBuilder {
        /* synthetic */ Builder(C55211 c55211) {
            this();
        }

        public Builder clearAttribute() {
            copyOnWrite();
            ((StaffInfo) this.instance).clearAttribute();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((StaffInfo) this.instance).clearMid();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((StaffInfo) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
        public long getAttribute() {
            return ((StaffInfo) this.instance).getAttribute();
        }

        @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
        public long getMid() {
            return ((StaffInfo) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
        public String getTitle() {
            return ((StaffInfo) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
        public ByteString getTitleBytes() {
            return ((StaffInfo) this.instance).getTitleBytes();
        }

        public Builder setAttribute(long j) {
            copyOnWrite();
            ((StaffInfo) this.instance).setAttribute(j);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((StaffInfo) this.instance).setMid(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((StaffInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((StaffInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(StaffInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        StaffInfo staffInfo = new StaffInfo();
        DEFAULT_INSTANCE = staffInfo;
        GeneratedMessageLite.registerDefaultInstance(StaffInfo.class, staffInfo);
    }

    private StaffInfo() {
    }

    public void clearAttribute() {
        this.attribute_ = 0L;
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static StaffInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StaffInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StaffInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StaffInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StaffInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAttribute(long j) {
        this.attribute_ = j;
    }

    public void setMid(long j) {
        this.mid_ = j;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55211.f15731xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new StaffInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002", new Object[]{"mid_", "title_", "attribute_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StaffInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (StaffInfo.class) {
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

    @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
    public long getAttribute() {
        return this.attribute_;
    }

    @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.archive.v1.StaffInfoOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(StaffInfo staffInfo) {
        return DEFAULT_INSTANCE.createBuilder(staffInfo);
    }

    public static StaffInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StaffInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StaffInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StaffInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StaffInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StaffInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StaffInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StaffInfo parseFrom(InputStream inputStream) throws IOException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StaffInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StaffInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StaffInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StaffInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
