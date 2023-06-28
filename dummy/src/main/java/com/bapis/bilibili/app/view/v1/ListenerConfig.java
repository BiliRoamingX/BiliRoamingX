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
public final class ListenerConfig extends GeneratedMessageLite<ListenerConfig, ListenerConfig.Builder> implements MessageLiteOrBuilder {
    private static final ListenerConfig DEFAULT_INSTANCE;
    public static final int GUIDE_BAR_FIELD_NUMBER = 2;
    public static final int JUMP_STYLE_FIELD_NUMBER = 1;
    private static volatile Parser<ListenerConfig> PARSER;
    private ListenerGuideBar guideBar_;
    private long jumpStyle_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ListenerConfig$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16756xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16756xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16756xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16756xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16756xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16756xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16756xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16756xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ListenerConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67891 c67891) {
            this();
        }

        public Builder clearGuideBar() {
            copyOnWrite();
            ((ListenerConfig) this.instance).clearGuideBar();
            return this;
        }

        public Builder clearJumpStyle() {
            copyOnWrite();
            ((ListenerConfig) this.instance).clearJumpStyle();
            return this;
        }

        public ListenerGuideBar getGuideBar() {
            return ((ListenerConfig) this.instance).getGuideBar();
        }

        public long getJumpStyle() {
            return ((ListenerConfig) this.instance).getJumpStyle();
        }

        public boolean hasGuideBar() {
            return ((ListenerConfig) this.instance).hasGuideBar();
        }

        public Builder mergeGuideBar(ListenerGuideBar listenerGuideBar) {
            copyOnWrite();
            ((ListenerConfig) this.instance).mergeGuideBar(listenerGuideBar);
            return this;
        }

        public Builder setGuideBar(ListenerGuideBar listenerGuideBar) {
            copyOnWrite();
            ((ListenerConfig) this.instance).setGuideBar(listenerGuideBar);
            return this;
        }

        public Builder setJumpStyle(long j) {
            copyOnWrite();
            ((ListenerConfig) this.instance).setJumpStyle(j);
            return this;
        }

        private Builder() {
            super(ListenerConfig.DEFAULT_INSTANCE);
        }

        public Builder setGuideBar(ListenerGuideBar.Builder builder) {
            copyOnWrite();
            ((ListenerConfig) this.instance).setGuideBar(builder.build());
            return this;
        }
    }

    static {
        ListenerConfig listenerConfig = new ListenerConfig();
        DEFAULT_INSTANCE = listenerConfig;
        GeneratedMessageLite.registerDefaultInstance(ListenerConfig.class, listenerConfig);
    }

    private ListenerConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuideBar() {
        this.guideBar_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpStyle() {
        this.jumpStyle_ = 0L;
    }

    public static ListenerConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGuideBar(ListenerGuideBar listenerGuideBar) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ListenerConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenerConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ListenerConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuideBar(ListenerGuideBar listenerGuideBar) {
        listenerGuideBar.getClass();
        this.guideBar_ = listenerGuideBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpStyle(long j) {
        this.jumpStyle_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67891.f16756xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ListenerConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\t", new Object[]{"jumpStyle_", "guideBar_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListenerConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (ListenerConfig.class) {
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

    public ListenerGuideBar getGuideBar() {
        ListenerGuideBar listenerGuideBar = this.guideBar_;
        return listenerGuideBar == null ? ListenerGuideBar.getDefaultInstance() : listenerGuideBar;
    }

    public long getJumpStyle() {
        return this.jumpStyle_;
    }

    public boolean hasGuideBar() {
        return this.guideBar_ != null;
    }

    public static Builder newBuilder(ListenerConfig listenerConfig) {
        return DEFAULT_INSTANCE.createBuilder(listenerConfig);
    }

    public static ListenerConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListenerConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListenerConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ListenerConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListenerConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListenerConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ListenerConfig parseFrom(InputStream inputStream) throws IOException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenerConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListenerConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListenerConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
