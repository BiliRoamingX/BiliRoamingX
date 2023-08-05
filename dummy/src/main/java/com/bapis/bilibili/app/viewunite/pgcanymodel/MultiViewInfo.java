package com.bapis.bilibili.app.viewunite.pgcanymodel;

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
public final class MultiViewInfo extends GeneratedMessageLite<MultiViewInfo, MultiViewInfo.Builder> implements MessageLiteOrBuilder {
    public static final int CHANGING_DANCE_FIELD_NUMBER = 2;
    private static final MultiViewInfo DEFAULT_INSTANCE;
    public static final int IS_MULTI_VIEW_SEASON_FIELD_NUMBER = 1;
    private static volatile Parser<MultiViewInfo> PARSER;
    private String changingDance_ = "";
    private boolean isMultiViewSeason_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.MultiViewInfo$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17066xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17066xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17066xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<MultiViewInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70891 c70891) {
            this();
        }

        public Builder clearChangingDance() {
            copyOnWrite();
            ((MultiViewInfo) this.instance).clearChangingDance();
            return this;
        }

        public Builder clearIsMultiViewSeason() {
            copyOnWrite();
            ((MultiViewInfo) this.instance).clearIsMultiViewSeason();
            return this;
        }

        public String getChangingDance() {
            return ((MultiViewInfo) this.instance).getChangingDance();
        }

        public ByteString getChangingDanceBytes() {
            return ((MultiViewInfo) this.instance).getChangingDanceBytes();
        }

        public boolean getIsMultiViewSeason() {
            return ((MultiViewInfo) this.instance).getIsMultiViewSeason();
        }

        public Builder setChangingDance(String str) {
            copyOnWrite();
            ((MultiViewInfo) this.instance).setChangingDance(str);
            return this;
        }

        public Builder setChangingDanceBytes(ByteString byteString) {
            copyOnWrite();
            ((MultiViewInfo) this.instance).setChangingDanceBytes(byteString);
            return this;
        }

        public Builder setIsMultiViewSeason(boolean z) {
            copyOnWrite();
            ((MultiViewInfo) this.instance).setIsMultiViewSeason(z);
            return this;
        }

        private Builder() {
            super(MultiViewInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        MultiViewInfo multiViewInfo = new MultiViewInfo();
        DEFAULT_INSTANCE = multiViewInfo;
        GeneratedMessageLite.registerDefaultInstance(MultiViewInfo.class, multiViewInfo);
    }

    private MultiViewInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangingDance() {
        this.changingDance_ = getDefaultInstance().getChangingDance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMultiViewSeason() {
        this.isMultiViewSeason_ = false;
    }

    public static MultiViewInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MultiViewInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MultiViewInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiViewInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MultiViewInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangingDance(String str) {
        str.getClass();
        this.changingDance_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangingDanceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.changingDance_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMultiViewSeason(boolean z) {
        this.isMultiViewSeason_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70891.f17066xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MultiViewInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0208", new Object[]{"isMultiViewSeason_", "changingDance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MultiViewInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (MultiViewInfo.class) {
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

    public String getChangingDance() {
        return this.changingDance_;
    }

    public ByteString getChangingDanceBytes() {
        return ByteString.copyFromUtf8(this.changingDance_);
    }

    public boolean getIsMultiViewSeason() {
        return this.isMultiViewSeason_;
    }

    public static Builder newBuilder(MultiViewInfo multiViewInfo) {
        return DEFAULT_INSTANCE.createBuilder(multiViewInfo);
    }

    public static MultiViewInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiViewInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultiViewInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MultiViewInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MultiViewInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MultiViewInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MultiViewInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MultiViewInfo parseFrom(InputStream inputStream) throws IOException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiViewInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultiViewInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MultiViewInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
