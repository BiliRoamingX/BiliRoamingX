package com.bapis.bilibili.app.distribution.setting.search;

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
public final class SearchDeviceConfig extends GeneratedMessageLite<SearchDeviceConfig, SearchDeviceConfig.C8397b> implements MessageLiteOrBuilder {
    public static final int AUTO_PLAY_FIELD_NUMBER = 1;
    private static final SearchDeviceConfig DEFAULT_INSTANCE;
    private static volatile Parser<SearchDeviceConfig> PARSER;
    private SearchAutoPlay autoPlay_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.search.SearchDeviceConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8396a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19952xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19952xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19952xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19952xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19952xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19952xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.search.SearchDeviceConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8397b extends GeneratedMessageLite.Builder<SearchDeviceConfig, C8397b> implements MessageLiteOrBuilder {
        /* synthetic */ C8397b(C8396a c8396a) {
            this();
        }

        public C8397b clearAutoPlay() {
            copyOnWrite();
            ((SearchDeviceConfig) this.instance).clearAutoPlay();
            return this;
        }

        public SearchAutoPlay getAutoPlay() {
            return ((SearchDeviceConfig) this.instance).getAutoPlay();
        }

        public boolean hasAutoPlay() {
            return ((SearchDeviceConfig) this.instance).hasAutoPlay();
        }

        public C8397b mergeAutoPlay(SearchAutoPlay searchAutoPlay) {
            copyOnWrite();
            ((SearchDeviceConfig) this.instance).mergeAutoPlay(searchAutoPlay);
            return this;
        }

        public C8397b setAutoPlay(SearchAutoPlay searchAutoPlay) {
            copyOnWrite();
            ((SearchDeviceConfig) this.instance).setAutoPlay(searchAutoPlay);
            return this;
        }

        private C8397b() {
            super(SearchDeviceConfig.DEFAULT_INSTANCE);
        }

        public C8397b setAutoPlay(SearchAutoPlay.C8395b c8395b) {
            copyOnWrite();
            ((SearchDeviceConfig) this.instance).setAutoPlay(c8395b.build());
            return this;
        }
    }

    static {
        SearchDeviceConfig searchDeviceConfig = new SearchDeviceConfig();
        DEFAULT_INSTANCE = searchDeviceConfig;
        GeneratedMessageLite.registerDefaultInstance(SearchDeviceConfig.class, searchDeviceConfig);
    }

    private SearchDeviceConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoPlay() {
        this.autoPlay_ = null;
    }

    public static SearchDeviceConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAutoPlay(SearchAutoPlay searchAutoPlay) {
        searchAutoPlay.getClass();
        SearchAutoPlay searchAutoPlay2 = this.autoPlay_;
        if (searchAutoPlay2 != null && searchAutoPlay2 != SearchAutoPlay.getDefaultInstance()) {
            this.autoPlay_ = SearchAutoPlay.newBuilder(this.autoPlay_).mergeFrom((SearchAutoPlay) searchAutoPlay).buildPartial();
        } else {
            this.autoPlay_ = searchAutoPlay;
        }
    }

    public static C8397b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchDeviceConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchDeviceConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchDeviceConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoPlay(SearchAutoPlay searchAutoPlay) {
        searchAutoPlay.getClass();
        this.autoPlay_ = searchAutoPlay;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8396a.f19952xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchDeviceConfig();
            case 2:
                return new C8397b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"autoPlay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchDeviceConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (SearchDeviceConfig.class) {
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

    public SearchAutoPlay getAutoPlay() {
        SearchAutoPlay searchAutoPlay = this.autoPlay_;
        return searchAutoPlay == null ? SearchAutoPlay.getDefaultInstance() : searchAutoPlay;
    }

    public boolean hasAutoPlay() {
        return this.autoPlay_ != null;
    }

    public static C8397b newBuilder(SearchDeviceConfig searchDeviceConfig) {
        return DEFAULT_INSTANCE.createBuilder(searchDeviceConfig);
    }

    public static SearchDeviceConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchDeviceConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchDeviceConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SearchDeviceConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchDeviceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchDeviceConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchDeviceConfig parseFrom(InputStream inputStream) throws IOException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchDeviceConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchDeviceConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchDeviceConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
