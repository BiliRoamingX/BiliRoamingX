package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class ActivityResource extends GeneratedMessageLite<ActivityResource, ActivityResource.Builder> implements MessageLiteOrBuilder {
    private static final ActivityResource DEFAULT_INSTANCE;
    public static final int MOD_POOL_NAME_FIELD_NUMBER = 1;
    public static final int MOD_RESOURCE_NAME_FIELD_NUMBER = 2;
    private static volatile Parser<ActivityResource> PARSER;
    private String modPoolName_ = "";
    private String modResourceName_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.ActivityResource$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16958xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16958xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16958xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16958xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16958xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16958xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16958xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16958xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ActivityResource, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69701 c69701) {
            this();
        }

        public Builder clearModPoolName() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearModPoolName();
            return this;
        }

        public Builder clearModResourceName() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearModResourceName();
            return this;
        }

        public String getModPoolName() {
            return ((ActivityResource) this.instance).getModPoolName();
        }

        public ByteString getModPoolNameBytes() {
            return ((ActivityResource) this.instance).getModPoolNameBytes();
        }

        public String getModResourceName() {
            return ((ActivityResource) this.instance).getModResourceName();
        }

        public ByteString getModResourceNameBytes() {
            return ((ActivityResource) this.instance).getModResourceNameBytes();
        }

        public Builder setModPoolName(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setModPoolName(str);
            return this;
        }

        public Builder setModPoolNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setModPoolNameBytes(byteString);
            return this;
        }

        public Builder setModResourceName(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setModResourceName(str);
            return this;
        }

        public Builder setModResourceNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setModResourceNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(ActivityResource.DEFAULT_INSTANCE);
        }
    }

    static {
        ActivityResource activityResource = new ActivityResource();
        DEFAULT_INSTANCE = activityResource;
        GeneratedMessageLite.registerDefaultInstance(ActivityResource.class, activityResource);
    }

    private ActivityResource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModPoolName() {
        this.modPoolName_ = getDefaultInstance().getModPoolName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModResourceName() {
        this.modResourceName_ = getDefaultInstance().getModResourceName();
    }

    public static ActivityResource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivityResource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityResource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ActivityResource> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModPoolName(String str) {
        str.getClass();
        this.modPoolName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModPoolNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.modPoolName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModResourceName(String str) {
        str.getClass();
        this.modResourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModResourceNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.modResourceName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69701.f16958xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ActivityResource();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"modPoolName_", "modResourceName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ActivityResource> parser = PARSER;
                if (parser == null) {
                    synchronized (ActivityResource.class) {
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

    public String getModPoolName() {
        return this.modPoolName_;
    }

    public ByteString getModPoolNameBytes() {
        return ByteString.copyFromUtf8(this.modPoolName_);
    }

    public String getModResourceName() {
        return this.modResourceName_;
    }

    public ByteString getModResourceNameBytes() {
        return ByteString.copyFromUtf8(this.modResourceName_);
    }

    public static Builder newBuilder(ActivityResource activityResource) {
        return DEFAULT_INSTANCE.createBuilder(activityResource);
    }

    public static ActivityResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ActivityResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityResource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(InputStream inputStream) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ActivityResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
