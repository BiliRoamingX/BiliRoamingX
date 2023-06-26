package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class DmMaskWall extends GeneratedMessageLite<DmMaskWall, DmMaskWall.Builder> implements DmMaskWallOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    private static final DmMaskWall DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile Parser<DmMaskWall> PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private int contentType_;
    private String content_ = "";
    private long end_;
    private long start_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmMaskWall$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17057xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17057xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DmMaskWall, Builder> implements DmMaskWallOrBuilder {
        /* synthetic */ Builder(C72151 c72151) {
            this();
        }

        public Builder clearContent() {
            copyOnWrite();
            ((DmMaskWall) this.instance).clearContent();
            return this;
        }

        public Builder clearContentType() {
            copyOnWrite();
            ((DmMaskWall) this.instance).clearContentType();
            return this;
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((DmMaskWall) this.instance).clearEnd();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((DmMaskWall) this.instance).clearStart();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
        public String getContent() {
            return ((DmMaskWall) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
        public ByteString getContentBytes() {
            return ((DmMaskWall) this.instance).getContentBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
        public DmMaskWallContentType getContentType() {
            return ((DmMaskWall) this.instance).getContentType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
        public int getContentTypeValue() {
            return ((DmMaskWall) this.instance).getContentTypeValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
        public long getEnd() {
            return ((DmMaskWall) this.instance).getEnd();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
        public long getStart() {
            return ((DmMaskWall) this.instance).getStart();
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((DmMaskWall) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((DmMaskWall) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setContentType(DmMaskWallContentType dmMaskWallContentType) {
            copyOnWrite();
            ((DmMaskWall) this.instance).setContentType(dmMaskWallContentType);
            return this;
        }

        public Builder setContentTypeValue(int i) {
            copyOnWrite();
            ((DmMaskWall) this.instance).setContentTypeValue(i);
            return this;
        }

        public Builder setEnd(long j) {
            copyOnWrite();
            ((DmMaskWall) this.instance).setEnd(j);
            return this;
        }

        public Builder setStart(long j) {
            copyOnWrite();
            ((DmMaskWall) this.instance).setStart(j);
            return this;
        }

        private Builder() {
            super(DmMaskWall.DEFAULT_INSTANCE);
        }
    }

    static {
        DmMaskWall dmMaskWall = new DmMaskWall();
        DEFAULT_INSTANCE = dmMaskWall;
        GeneratedMessageLite.registerDefaultInstance(DmMaskWall.class, dmMaskWall);
    }

    private DmMaskWall() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0L;
    }

    public static DmMaskWall getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmMaskWall parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmMaskWall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmMaskWall parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmMaskWall> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentType(DmMaskWallContentType dmMaskWallContentType) {
        this.contentType_ = dmMaskWallContentType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentTypeValue(int i) {
        this.contentType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(long j) {
        this.end_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j) {
        this.start_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72151.f17057xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmMaskWall();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208\u0004\f", new Object[]{"start_", "end_", "content_", "contentType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmMaskWall> parser = PARSER;
                if (parser == null) {
                    synchronized (DmMaskWall.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
    public DmMaskWallContentType getContentType() {
        DmMaskWallContentType forNumber = DmMaskWallContentType.forNumber(this.contentType_);
        return forNumber == null ? DmMaskWallContentType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
    public int getContentTypeValue() {
        return this.contentType_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
    public long getEnd() {
        return this.end_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.DmMaskWallOrBuilder
    public long getStart() {
        return this.start_;
    }

    public static Builder newBuilder(DmMaskWall dmMaskWall) {
        return DEFAULT_INSTANCE.createBuilder(dmMaskWall);
    }

    public static DmMaskWall parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmMaskWall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmMaskWall parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmMaskWall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DmMaskWall parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmMaskWall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmMaskWall parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmMaskWall parseFrom(InputStream inputStream) throws IOException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmMaskWall parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmMaskWall parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmMaskWall parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmMaskWall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
