package com.bapis.bilibili.app.view.v1;

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
public final class UgcSeasonStatV2 extends GeneratedMessageLite<UgcSeasonStatV2, UgcSeasonStatV2.Builder> implements MessageLiteOrBuilder {
    private static final UgcSeasonStatV2 DEFAULT_INSTANCE;
    private static volatile Parser<UgcSeasonStatV2> PARSER = null;
    public static final int VIEW_VT_FIELD_NUMBER = 11;
    private StatInfo viewVt_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UgcSeasonStatV2$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68811 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16838xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16838xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16838xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16838xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16838xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16838xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16838xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16838xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcSeasonStatV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68811 c68811) {
            this();
        }

        public Builder clearViewVt() {
            copyOnWrite();
            ((UgcSeasonStatV2) this.instance).clearViewVt();
            return this;
        }

        public StatInfo getViewVt() {
            return ((UgcSeasonStatV2) this.instance).getViewVt();
        }

        public boolean hasViewVt() {
            return ((UgcSeasonStatV2) this.instance).hasViewVt();
        }

        public Builder mergeViewVt(StatInfo statInfo) {
            copyOnWrite();
            ((UgcSeasonStatV2) this.instance).mergeViewVt(statInfo);
            return this;
        }

        public Builder setViewVt(StatInfo statInfo) {
            copyOnWrite();
            ((UgcSeasonStatV2) this.instance).setViewVt(statInfo);
            return this;
        }

        private Builder() {
            super(UgcSeasonStatV2.DEFAULT_INSTANCE);
        }

        public Builder setViewVt(StatInfo.Builder builder) {
            copyOnWrite();
            ((UgcSeasonStatV2) this.instance).setViewVt(builder.build());
            return this;
        }
    }

    static {
        UgcSeasonStatV2 ugcSeasonStatV2 = new UgcSeasonStatV2();
        DEFAULT_INSTANCE = ugcSeasonStatV2;
        GeneratedMessageLite.registerDefaultInstance(UgcSeasonStatV2.class, ugcSeasonStatV2);
    }

    private UgcSeasonStatV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewVt() {
        this.viewVt_ = null;
    }

    public static UgcSeasonStatV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewVt(StatInfo statInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcSeasonStatV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonStatV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcSeasonStatV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewVt(StatInfo statInfo) {
        statInfo.getClass();
        this.viewVt_ = statInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68811.f16838xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcSeasonStatV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u000b\u000b\u0001\u0000\u0000\u0000\u000b\t", new Object[]{"viewVt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcSeasonStatV2> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcSeasonStatV2.class) {
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

    public StatInfo getViewVt() {
        StatInfo statInfo = this.viewVt_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public boolean hasViewVt() {
        return this.viewVt_ != null;
    }

    public static Builder newBuilder(UgcSeasonStatV2 ugcSeasonStatV2) {
        return DEFAULT_INSTANCE.createBuilder(ugcSeasonStatV2);
    }

    public static UgcSeasonStatV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonStatV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcSeasonStatV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UgcSeasonStatV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcSeasonStatV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcSeasonStatV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcSeasonStatV2 parseFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonStatV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonStatV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcSeasonStatV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonStatV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
