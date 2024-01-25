package com.bapis.bilibili.playershared;

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
/* loaded from: classes22.dex */
public final class VideoCtrl extends GeneratedMessageLite<VideoCtrl, VideoCtrl.C11731b> implements MessageLiteOrBuilder {
    public static final int AUTO_QN_CTL_FIELD_NUMBER = 1;
    private static final VideoCtrl DEFAULT_INSTANCE;
    private static volatile Parser<VideoCtrl> PARSER;
    private AutoQnCtl autoQnCtl_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.VideoCtrl$a */
    /* loaded from: classes22.dex */
    static /* synthetic */ class C11730a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19535xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19535xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19535xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19535xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19535xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19535xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19535xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19535xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.VideoCtrl$b */
    /* loaded from: classes22.dex */
    public static final class C11731b extends GeneratedMessageLite.Builder<VideoCtrl, C11731b> implements MessageLiteOrBuilder {
        /* synthetic */ C11731b(C11730a c11730a) {
            this();
        }

        public C11731b clearAutoQnCtl() {
            copyOnWrite();
            ((VideoCtrl) this.instance).clearAutoQnCtl();
            return this;
        }

        public AutoQnCtl getAutoQnCtl() {
            return ((VideoCtrl) this.instance).getAutoQnCtl();
        }

        public boolean hasAutoQnCtl() {
            return ((VideoCtrl) this.instance).hasAutoQnCtl();
        }

        public C11731b mergeAutoQnCtl(AutoQnCtl autoQnCtl) {
            copyOnWrite();
            ((VideoCtrl) this.instance).mergeAutoQnCtl(autoQnCtl);
            return this;
        }

        public C11731b setAutoQnCtl(AutoQnCtl autoQnCtl) {
            copyOnWrite();
            ((VideoCtrl) this.instance).setAutoQnCtl(autoQnCtl);
            return this;
        }

        private C11731b() {
            super(VideoCtrl.DEFAULT_INSTANCE);
        }

        public C11731b setAutoQnCtl(AutoQnCtl.C11577b c11577b) {
            copyOnWrite();
            ((VideoCtrl) this.instance).setAutoQnCtl(c11577b.build());
            return this;
        }
    }

    static {
        VideoCtrl videoCtrl = new VideoCtrl();
        DEFAULT_INSTANCE = videoCtrl;
        GeneratedMessageLite.registerDefaultInstance(VideoCtrl.class, videoCtrl);
    }

    private VideoCtrl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoQnCtl() {
        this.autoQnCtl_ = null;
    }

    public static VideoCtrl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAutoQnCtl(AutoQnCtl autoQnCtl) {
        autoQnCtl.getClass();
        AutoQnCtl autoQnCtl2 = this.autoQnCtl_;
        if (autoQnCtl2 != null && autoQnCtl2 != AutoQnCtl.getDefaultInstance()) {
            this.autoQnCtl_ = AutoQnCtl.newBuilder(this.autoQnCtl_).mergeFrom((AutoQnCtl) autoQnCtl).buildPartial();
        } else {
            this.autoQnCtl_ = autoQnCtl;
        }
    }

    public static C11731b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoCtrl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoCtrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoCtrl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoCtrl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoQnCtl(AutoQnCtl autoQnCtl) {
        autoQnCtl.getClass();
        this.autoQnCtl_ = autoQnCtl;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C11730a c11730a = null;
        switch (C11730a.f19535xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoCtrl();
            case 2:
                return new C11731b(c11730a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"autoQnCtl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoCtrl> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoCtrl.class) {
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

    public AutoQnCtl getAutoQnCtl() {
        AutoQnCtl autoQnCtl = this.autoQnCtl_;
        return autoQnCtl == null ? AutoQnCtl.getDefaultInstance() : autoQnCtl;
    }

    public boolean hasAutoQnCtl() {
        return this.autoQnCtl_ != null;
    }

    public static C11731b newBuilder(VideoCtrl videoCtrl) {
        return DEFAULT_INSTANCE.createBuilder(videoCtrl);
    }

    public static VideoCtrl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoCtrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoCtrl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoCtrl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoCtrl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoCtrl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoCtrl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoCtrl parseFrom(InputStream inputStream) throws IOException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoCtrl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoCtrl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoCtrl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoCtrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
