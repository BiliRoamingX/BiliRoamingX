package com.bapis.bilibili.playershared;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes22.dex */
public final class FragmentVideo extends GeneratedMessageLite<FragmentVideo, FragmentVideo.C16010b> implements MessageLiteOrBuilder {
    private static final FragmentVideo DEFAULT_INSTANCE;
    private static volatile Parser<FragmentVideo> PARSER = null;
    public static final int VIDEOS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<FragmentVideoInfo> videos_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentVideo$a */
    /* loaded from: classes22.dex */
    static /* synthetic */ class C16009a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22415xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22415xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22415xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22415xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22415xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22415xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22415xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22415xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentVideo$b */
    /* loaded from: classes22.dex */
    public static final class C16010b extends GeneratedMessageLite.Builder<FragmentVideo, C16010b> implements MessageLiteOrBuilder {
        /* synthetic */ C16010b(C16009a c16009a) {
            this();
        }

        public C16010b addAllVideos(Iterable<? extends FragmentVideoInfo> iterable) {
            copyOnWrite();
            ((FragmentVideo) this.instance).addAllVideos(iterable);
            return this;
        }

        public C16010b addVideos(FragmentVideoInfo fragmentVideoInfo) {
            copyOnWrite();
            ((FragmentVideo) this.instance).addVideos(fragmentVideoInfo);
            return this;
        }

        public C16010b clearVideos() {
            copyOnWrite();
            ((FragmentVideo) this.instance).clearVideos();
            return this;
        }

        public FragmentVideoInfo getVideos(int i) {
            return ((FragmentVideo) this.instance).getVideos(i);
        }

        public int getVideosCount() {
            return ((FragmentVideo) this.instance).getVideosCount();
        }

        public List<FragmentVideoInfo> getVideosList() {
            return Collections.unmodifiableList(((FragmentVideo) this.instance).getVideosList());
        }

        public C16010b removeVideos(int i) {
            copyOnWrite();
            ((FragmentVideo) this.instance).removeVideos(i);
            return this;
        }

        public C16010b setVideos(int i, FragmentVideoInfo fragmentVideoInfo) {
            copyOnWrite();
            ((FragmentVideo) this.instance).setVideos(i, fragmentVideoInfo);
            return this;
        }

        private C16010b() {
            super(FragmentVideo.DEFAULT_INSTANCE);
        }

        public C16010b addVideos(int i, FragmentVideoInfo fragmentVideoInfo) {
            copyOnWrite();
            ((FragmentVideo) this.instance).addVideos(i, fragmentVideoInfo);
            return this;
        }

        public C16010b setVideos(int i, FragmentVideoInfo.C16012b c16012b) {
            copyOnWrite();
            ((FragmentVideo) this.instance).setVideos(i, c16012b.build());
            return this;
        }

        public C16010b addVideos(FragmentVideoInfo.C16012b c16012b) {
            copyOnWrite();
            ((FragmentVideo) this.instance).addVideos(c16012b.build());
            return this;
        }

        public C16010b addVideos(int i, FragmentVideoInfo.C16012b c16012b) {
            copyOnWrite();
            ((FragmentVideo) this.instance).addVideos(i, c16012b.build());
            return this;
        }
    }

    static {
        FragmentVideo fragmentVideo = new FragmentVideo();
        DEFAULT_INSTANCE = fragmentVideo;
        GeneratedMessageLite.registerDefaultInstance(FragmentVideo.class, fragmentVideo);
    }

    private FragmentVideo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVideos(Iterable<? extends FragmentVideoInfo> iterable) {
        ensureVideosIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.videos_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideos(FragmentVideoInfo fragmentVideoInfo) {
        fragmentVideoInfo.getClass();
        ensureVideosIsMutable();
        this.videos_.add(fragmentVideoInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideos() {
        this.videos_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureVideosIsMutable() {
        Internal.ProtobufList<FragmentVideoInfo> protobufList = this.videos_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.videos_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FragmentVideo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C16010b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FragmentVideo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FragmentVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentVideo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FragmentVideo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVideos(int i) {
        ensureVideosIsMutable();
        this.videos_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideos(int i, FragmentVideoInfo fragmentVideoInfo) {
        fragmentVideoInfo.getClass();
        ensureVideosIsMutable();
        this.videos_.set(i, fragmentVideoInfo);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C16009a.f22415xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FragmentVideo();
            case 2:
                return new C16010b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"videos_", FragmentVideoInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FragmentVideo> parser = PARSER;
                if (parser == null) {
                    synchronized (FragmentVideo.class) {
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

    public FragmentVideoInfo getVideos(int i) {
        return this.videos_.get(i);
    }

    public int getVideosCount() {
        return this.videos_.size();
    }

    public List<FragmentVideoInfo> getVideosList() {
        return this.videos_;
    }

    public InterfaceC16108h getVideosOrBuilder(int i) {
        return this.videos_.get(i);
    }

    public List<? extends InterfaceC16108h> getVideosOrBuilderList() {
        return this.videos_;
    }

    public static C16010b newBuilder(FragmentVideo fragmentVideo) {
        return DEFAULT_INSTANCE.createBuilder(fragmentVideo);
    }

    public static FragmentVideo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentVideo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FragmentVideo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideos(int i, FragmentVideoInfo fragmentVideoInfo) {
        fragmentVideoInfo.getClass();
        ensureVideosIsMutable();
        this.videos_.add(i, fragmentVideoInfo);
    }

    public static FragmentVideo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FragmentVideo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FragmentVideo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FragmentVideo parseFrom(InputStream inputStream) throws IOException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentVideo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentVideo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FragmentVideo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
