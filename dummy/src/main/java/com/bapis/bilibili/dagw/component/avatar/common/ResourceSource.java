package com.bapis.bilibili.dagw.component.avatar.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class ResourceSource extends GeneratedMessageLite<ResourceSource, ResourceSource.Builder> implements ResourceSourceOrBuilder {
    private static final ResourceSource DEFAULT_INSTANCE;
    public static final int DRAW_FIELD_NUMBER = 5;
    public static final int LOCAL_FIELD_NUMBER = 4;
    private static volatile Parser<ResourceSource> PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 2;
    public static final int REMOTE_FIELD_NUMBER = 3;
    public static final int SRC_TYPE_FIELD_NUMBER = 1;
    private int placeholder_;
    private int resCase_ = 0;
    private Object res_;
    private int srcType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.ResourceSource$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17369xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17369xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17369xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17369xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17369xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17369xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17369xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17369xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ResourceSource, Builder> implements ResourceSourceOrBuilder {
        /* synthetic */ Builder(C75231 c75231) {
            this();
        }

        public Builder clearDraw() {
            copyOnWrite();
            ((ResourceSource) this.instance).clearDraw();
            return this;
        }

        public Builder clearLocal() {
            copyOnWrite();
            ((ResourceSource) this.instance).clearLocal();
            return this;
        }

        public Builder clearPlaceholder() {
            copyOnWrite();
            ((ResourceSource) this.instance).clearPlaceholder();
            return this;
        }

        public Builder clearRemote() {
            copyOnWrite();
            ((ResourceSource) this.instance).clearRemote();
            return this;
        }

        public Builder clearRes() {
            copyOnWrite();
            ((ResourceSource) this.instance).clearRes();
            return this;
        }

        public Builder clearSrcType() {
            copyOnWrite();
            ((ResourceSource) this.instance).clearSrcType();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public NativeDrawRes getDraw() {
            return ((ResourceSource) this.instance).getDraw();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public LocalRes getLocal() {
            return ((ResourceSource) this.instance).getLocal();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public int getLocalValue() {
            return ((ResourceSource) this.instance).getLocalValue();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public LocalRes getPlaceholder() {
            return ((ResourceSource) this.instance).getPlaceholder();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public int getPlaceholderValue() {
            return ((ResourceSource) this.instance).getPlaceholderValue();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public RemoteRes getRemote() {
            return ((ResourceSource) this.instance).getRemote();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public ResCase getResCase() {
            return ((ResourceSource) this.instance).getResCase();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public SourceType getSrcType() {
            return ((ResourceSource) this.instance).getSrcType();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public int getSrcTypeValue() {
            return ((ResourceSource) this.instance).getSrcTypeValue();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public boolean hasDraw() {
            return ((ResourceSource) this.instance).hasDraw();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public boolean hasLocal() {
            return ((ResourceSource) this.instance).hasLocal();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
        public boolean hasRemote() {
            return ((ResourceSource) this.instance).hasRemote();
        }

        public Builder mergeDraw(NativeDrawRes nativeDrawRes) {
            copyOnWrite();
            ((ResourceSource) this.instance).mergeDraw(nativeDrawRes);
            return this;
        }

        public Builder mergeRemote(RemoteRes remoteRes) {
            copyOnWrite();
            ((ResourceSource) this.instance).mergeRemote(remoteRes);
            return this;
        }

        public Builder setDraw(NativeDrawRes nativeDrawRes) {
            copyOnWrite();
            ((ResourceSource) this.instance).setDraw(nativeDrawRes);
            return this;
        }

        public Builder setLocal(LocalRes localRes) {
            copyOnWrite();
            ((ResourceSource) this.instance).setLocal(localRes);
            return this;
        }

        public Builder setLocalValue(int i) {
            copyOnWrite();
            ((ResourceSource) this.instance).setLocalValue(i);
            return this;
        }

        public Builder setPlaceholder(LocalRes localRes) {
            copyOnWrite();
            ((ResourceSource) this.instance).setPlaceholder(localRes);
            return this;
        }

        public Builder setPlaceholderValue(int i) {
            copyOnWrite();
            ((ResourceSource) this.instance).setPlaceholderValue(i);
            return this;
        }

        public Builder setRemote(RemoteRes remoteRes) {
            copyOnWrite();
            ((ResourceSource) this.instance).setRemote(remoteRes);
            return this;
        }

        public Builder setSrcType(SourceType sourceType) {
            copyOnWrite();
            ((ResourceSource) this.instance).setSrcType(sourceType);
            return this;
        }

        public Builder setSrcTypeValue(int i) {
            copyOnWrite();
            ((ResourceSource) this.instance).setSrcTypeValue(i);
            return this;
        }

        private Builder() {
            super(ResourceSource.DEFAULT_INSTANCE);
        }

        public Builder setDraw(NativeDrawRes.Builder builder) {
            copyOnWrite();
            ((ResourceSource) this.instance).setDraw(builder.build());
            return this;
        }

        public Builder setRemote(RemoteRes.Builder builder) {
            copyOnWrite();
            ((ResourceSource) this.instance).setRemote(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum LocalRes implements Internal.EnumLite {
        LOCAL_RES_INVALID(0),
        LOCAL_RES_ICON_VIP(1),
        LOCAL_RES_ICON_SMALL_VIP(2),
        LOCAL_RES_ICON_PERSONAL_VERIFY(3),
        LOCAL_RES_ICON_ENTERPRISE_VERIFY(4),
        LOCAL_RES_ICON_NFT_MAINLAND(5),
        LOCAL_RES_DEFAULT_AVATAR(6),
        UNRECOGNIZED(-1);
        
        public static final int LOCAL_RES_DEFAULT_AVATAR_VALUE = 6;
        public static final int LOCAL_RES_ICON_ENTERPRISE_VERIFY_VALUE = 4;
        public static final int LOCAL_RES_ICON_NFT_MAINLAND_VALUE = 5;
        public static final int LOCAL_RES_ICON_PERSONAL_VERIFY_VALUE = 3;
        public static final int LOCAL_RES_ICON_SMALL_VIP_VALUE = 2;
        public static final int LOCAL_RES_ICON_VIP_VALUE = 1;
        public static final int LOCAL_RES_INVALID_VALUE = 0;
        private static final Internal.EnumLiteMap<LocalRes> internalValueMap = new Internal.EnumLiteMap<LocalRes>() { // from class: com.bapis.bilibili.dagw.component.avatar.common.ResourceSource.LocalRes.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LocalRes findValueByNumber(int i) {
                return LocalRes.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        private static final class LocalResVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new LocalResVerifier();

            private LocalResVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return LocalRes.forNumber(i) != null;
            }
        }

        LocalRes(int i) {
            this.value = i;
        }

        public static LocalRes forNumber(int i) {
            switch (i) {
                case 0:
                    return LOCAL_RES_INVALID;
                case 1:
                    return LOCAL_RES_ICON_VIP;
                case 2:
                    return LOCAL_RES_ICON_SMALL_VIP;
                case 3:
                    return LOCAL_RES_ICON_PERSONAL_VERIFY;
                case 4:
                    return LOCAL_RES_ICON_ENTERPRISE_VERIFY;
                case 5:
                    return LOCAL_RES_ICON_NFT_MAINLAND;
                case 6:
                    return LOCAL_RES_DEFAULT_AVATAR;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<LocalRes> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return LocalResVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static LocalRes valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum ResCase {
        REMOTE(3),
        LOCAL(4),
        DRAW(5),
        RES_NOT_SET(0);
        
        private final int value;

        ResCase(int i) {
            this.value = i;
        }

        public static ResCase forNumber(int i) {
            if (i != 0) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return DRAW;
                    }
                    return LOCAL;
                }
                return REMOTE;
            }
            return RES_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ResCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum SourceType implements Internal.EnumLite {
        SRC_TYPE_INVALID(0),
        SRC_TYPE_URL(1),
        SRC_TYPE_LOCAL(2),
        SRC_TYPE_DRAW(3),
        UNRECOGNIZED(-1);
        
        public static final int SRC_TYPE_DRAW_VALUE = 3;
        public static final int SRC_TYPE_INVALID_VALUE = 0;
        public static final int SRC_TYPE_LOCAL_VALUE = 2;
        public static final int SRC_TYPE_URL_VALUE = 1;
        private static final Internal.EnumLiteMap<SourceType> internalValueMap = new Internal.EnumLiteMap<SourceType>() { // from class: com.bapis.bilibili.dagw.component.avatar.common.ResourceSource.SourceType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SourceType findValueByNumber(int i) {
                return SourceType.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        private static final class SourceTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new SourceTypeVerifier();

            private SourceTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return SourceType.forNumber(i) != null;
            }
        }

        SourceType(int i) {
            this.value = i;
        }

        public static SourceType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return SRC_TYPE_DRAW;
                    }
                    return SRC_TYPE_LOCAL;
                }
                return SRC_TYPE_URL;
            }
            return SRC_TYPE_INVALID;
        }

        public static Internal.EnumLiteMap<SourceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return SourceTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static SourceType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ResourceSource resourceSource = new ResourceSource();
        DEFAULT_INSTANCE = resourceSource;
        GeneratedMessageLite.registerDefaultInstance(ResourceSource.class, resourceSource);
    }

    private ResourceSource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDraw() {
        if (this.resCase_ == 5) {
            this.resCase_ = 0;
            this.res_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocal() {
        if (this.resCase_ == 4) {
            this.resCase_ = 0;
            this.res_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceholder() {
        this.placeholder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemote() {
        if (this.resCase_ == 3) {
            this.resCase_ = 0;
            this.res_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRes() {
        this.resCase_ = 0;
        this.res_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSrcType() {
        this.srcType_ = 0;
    }

    public static ResourceSource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDraw(NativeDrawRes nativeDrawRes) {
        nativeDrawRes.getClass();
        if (this.resCase_ == 5 && this.res_ != NativeDrawRes.getDefaultInstance()) {
            this.res_ = NativeDrawRes.newBuilder((NativeDrawRes) this.res_).mergeFrom((NativeDrawRes) nativeDrawRes).buildPartial();
        } else {
            this.res_ = nativeDrawRes;
        }
        this.resCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemote(RemoteRes remoteRes) {
        remoteRes.getClass();
        if (this.resCase_ == 3 && this.res_ != RemoteRes.getDefaultInstance()) {
            this.res_ = RemoteRes.newBuilder((RemoteRes) this.res_).mergeFrom((RemoteRes) remoteRes).buildPartial();
        } else {
            this.res_ = remoteRes;
        }
        this.resCase_ = 3;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceSource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceSource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceSource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResourceSource> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDraw(NativeDrawRes nativeDrawRes) {
        nativeDrawRes.getClass();
        this.res_ = nativeDrawRes;
        this.resCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocal(LocalRes localRes) {
        this.res_ = Integer.valueOf(localRes.getNumber());
        this.resCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalValue(int i) {
        this.resCase_ = 4;
        this.res_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceholder(LocalRes localRes) {
        this.placeholder_ = localRes.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceholderValue(int i) {
        this.placeholder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemote(RemoteRes remoteRes) {
        remoteRes.getClass();
        this.res_ = remoteRes;
        this.resCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrcType(SourceType sourceType) {
        this.srcType_ = sourceType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrcTypeValue(int i) {
        this.srcType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75231.f17369xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ResourceSource();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003<\u0000\u0004?\u0000\u0005<\u0000", new Object[]{"res_", "resCase_", "srcType_", "placeholder_", RemoteRes.class, NativeDrawRes.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResourceSource> parser = PARSER;
                if (parser == null) {
                    synchronized (ResourceSource.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public NativeDrawRes getDraw() {
        if (this.resCase_ == 5) {
            return (NativeDrawRes) this.res_;
        }
        return NativeDrawRes.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public LocalRes getLocal() {
        if (this.resCase_ == 4) {
            LocalRes forNumber = LocalRes.forNumber(((Integer) this.res_).intValue());
            return forNumber == null ? LocalRes.UNRECOGNIZED : forNumber;
        }
        return LocalRes.LOCAL_RES_INVALID;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public int getLocalValue() {
        if (this.resCase_ == 4) {
            return ((Integer) this.res_).intValue();
        }
        return 0;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public LocalRes getPlaceholder() {
        LocalRes forNumber = LocalRes.forNumber(this.placeholder_);
        return forNumber == null ? LocalRes.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public int getPlaceholderValue() {
        return this.placeholder_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public RemoteRes getRemote() {
        if (this.resCase_ == 3) {
            return (RemoteRes) this.res_;
        }
        return RemoteRes.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public ResCase getResCase() {
        return ResCase.forNumber(this.resCase_);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public SourceType getSrcType() {
        SourceType forNumber = SourceType.forNumber(this.srcType_);
        return forNumber == null ? SourceType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public int getSrcTypeValue() {
        return this.srcType_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public boolean hasDraw() {
        return this.resCase_ == 5;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public boolean hasLocal() {
        return this.resCase_ == 4;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ResourceSourceOrBuilder
    public boolean hasRemote() {
        return this.resCase_ == 3;
    }

    public static Builder newBuilder(ResourceSource resourceSource) {
        return DEFAULT_INSTANCE.createBuilder(resourceSource);
    }

    public static ResourceSource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceSource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceSource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResourceSource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResourceSource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResourceSource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceSource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResourceSource parseFrom(InputStream inputStream) throws IOException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceSource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceSource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResourceSource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceSource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
