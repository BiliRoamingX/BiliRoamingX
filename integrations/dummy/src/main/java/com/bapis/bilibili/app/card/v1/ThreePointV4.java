package com.bapis.bilibili.app.card.v1;

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
/* loaded from: classes13.dex */
public final class ThreePointV4 extends GeneratedMessageLite<ThreePointV4, ThreePointV4.C5900b> implements InterfaceC5945y {
    private static final ThreePointV4 DEFAULT_INSTANCE;
    private static volatile Parser<ThreePointV4> PARSER = null;
    public static final int SHARE_PLANE_FIELD_NUMBER = 1;
    public static final int WATCH_LATER_FIELD_NUMBER = 2;
    private SharePlane sharePlane_;
    private WatchLater watchLater_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePointV4$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5899a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15998xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15998xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15998xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15998xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15998xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15998xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePointV4$b */
    /* loaded from: classes13.dex */
    public static final class C5900b extends GeneratedMessageLite.Builder<ThreePointV4, C5900b> implements InterfaceC5945y {
        /* synthetic */ C5900b(C5899a c5899a) {
            this();
        }

        public C5900b clearSharePlane() {
            copyOnWrite();
            ((ThreePointV4) this.instance).clearSharePlane();
            return this;
        }

        public C5900b clearWatchLater() {
            copyOnWrite();
            ((ThreePointV4) this.instance).clearWatchLater();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
        public SharePlane getSharePlane() {
            return ((ThreePointV4) this.instance).getSharePlane();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
        public WatchLater getWatchLater() {
            return ((ThreePointV4) this.instance).getWatchLater();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
        public boolean hasSharePlane() {
            return ((ThreePointV4) this.instance).hasSharePlane();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
        public boolean hasWatchLater() {
            return ((ThreePointV4) this.instance).hasWatchLater();
        }

        public C5900b mergeSharePlane(SharePlane sharePlane) {
            copyOnWrite();
            ((ThreePointV4) this.instance).mergeSharePlane(sharePlane);
            return this;
        }

        public C5900b mergeWatchLater(WatchLater watchLater) {
            copyOnWrite();
            ((ThreePointV4) this.instance).mergeWatchLater(watchLater);
            return this;
        }

        public C5900b setSharePlane(SharePlane sharePlane) {
            copyOnWrite();
            ((ThreePointV4) this.instance).setSharePlane(sharePlane);
            return this;
        }

        public C5900b setWatchLater(WatchLater watchLater) {
            copyOnWrite();
            ((ThreePointV4) this.instance).setWatchLater(watchLater);
            return this;
        }

        private C5900b() {
            super(ThreePointV4.DEFAULT_INSTANCE);
        }

        public C5900b setSharePlane(SharePlane.C5857b c5857b) {
            copyOnWrite();
            ((ThreePointV4) this.instance).setSharePlane(c5857b.build());
            return this;
        }

        public C5900b setWatchLater(WatchLater.C5918b c5918b) {
            copyOnWrite();
            ((ThreePointV4) this.instance).setWatchLater(c5918b.build());
            return this;
        }
    }

    static {
        ThreePointV4 threePointV4 = new ThreePointV4();
        DEFAULT_INSTANCE = threePointV4;
        GeneratedMessageLite.registerDefaultInstance(ThreePointV4.class, threePointV4);
    }

    private ThreePointV4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharePlane() {
        this.sharePlane_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchLater() {
        this.watchLater_ = null;
    }

    public static ThreePointV4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSharePlane(SharePlane sharePlane) {
        sharePlane.getClass();
        SharePlane sharePlane2 = this.sharePlane_;
        if (sharePlane2 != null && sharePlane2 != SharePlane.getDefaultInstance()) {
            this.sharePlane_ = SharePlane.newBuilder(this.sharePlane_).mergeFrom((SharePlane) sharePlane).buildPartial();
        } else {
            this.sharePlane_ = sharePlane;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchLater(WatchLater watchLater) {
        watchLater.getClass();
        WatchLater watchLater2 = this.watchLater_;
        if (watchLater2 != null && watchLater2 != WatchLater.getDefaultInstance()) {
            this.watchLater_ = WatchLater.newBuilder(this.watchLater_).mergeFrom((WatchLater) watchLater).buildPartial();
        } else {
            this.watchLater_ = watchLater;
        }
    }

    public static C5900b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ThreePointV4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ThreePointV4) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePointV4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ThreePointV4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharePlane(SharePlane sharePlane) {
        sharePlane.getClass();
        this.sharePlane_ = sharePlane;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchLater(WatchLater watchLater) {
        watchLater.getClass();
        this.watchLater_ = watchLater;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5899a.f15998xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ThreePointV4();
            case 2:
                return new C5900b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"sharePlane_", "watchLater_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ThreePointV4> parser = PARSER;
                if (parser == null) {
                    synchronized (ThreePointV4.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
    public SharePlane getSharePlane() {
        SharePlane sharePlane = this.sharePlane_;
        return sharePlane == null ? SharePlane.getDefaultInstance() : sharePlane;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
    public WatchLater getWatchLater() {
        WatchLater watchLater = this.watchLater_;
        return watchLater == null ? WatchLater.getDefaultInstance() : watchLater;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
    public boolean hasSharePlane() {
        return this.sharePlane_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5945y
    public boolean hasWatchLater() {
        return this.watchLater_ != null;
    }

    public static C5900b newBuilder(ThreePointV4 threePointV4) {
        return DEFAULT_INSTANCE.createBuilder(threePointV4);
    }

    public static ThreePointV4 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV4) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePointV4 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ThreePointV4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ThreePointV4 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ThreePointV4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ThreePointV4 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ThreePointV4 parseFrom(InputStream inputStream) throws IOException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePointV4 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePointV4 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ThreePointV4 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
