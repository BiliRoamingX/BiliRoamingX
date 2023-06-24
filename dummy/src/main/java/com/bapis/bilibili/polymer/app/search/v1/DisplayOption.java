package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class DisplayOption extends GeneratedMessageLite<DisplayOption, DisplayOption.Builder> implements MessageLiteOrBuilder {
    private static final DisplayOption DEFAULT_INSTANCE;
    private static volatile Parser<DisplayOption> PARSER = null;
    public static final int SEARCH_PAGE_VISUAL_OPTI_FIELD_NUMBER = 2;
    public static final int VIDEO_TITLE_ROW_FIELD_NUMBER = 1;
    private int searchPageVisualOpti_;
    private int videoTitleRow_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.DisplayOption$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17657xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17657xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17657xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17657xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17657xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17657xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17657xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17657xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DisplayOption, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79551 c79551) {
            this();
        }

        public Builder clearSearchPageVisualOpti() {
            copyOnWrite();
            ((DisplayOption) this.instance).clearSearchPageVisualOpti();
            return this;
        }

        public Builder clearVideoTitleRow() {
            copyOnWrite();
            ((DisplayOption) this.instance).clearVideoTitleRow();
            return this;
        }

        public int getSearchPageVisualOpti() {
            return ((DisplayOption) this.instance).getSearchPageVisualOpti();
        }

        public int getVideoTitleRow() {
            return ((DisplayOption) this.instance).getVideoTitleRow();
        }

        public Builder setSearchPageVisualOpti(int i) {
            copyOnWrite();
            ((DisplayOption) this.instance).setSearchPageVisualOpti(i);
            return this;
        }

        public Builder setVideoTitleRow(int i) {
            copyOnWrite();
            ((DisplayOption) this.instance).setVideoTitleRow(i);
            return this;
        }

        private Builder() {
            super(DisplayOption.DEFAULT_INSTANCE);
        }
    }

    static {
        DisplayOption displayOption = new DisplayOption();
        DEFAULT_INSTANCE = displayOption;
        GeneratedMessageLite.registerDefaultInstance(DisplayOption.class, displayOption);
    }

    private DisplayOption() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchPageVisualOpti() {
        this.searchPageVisualOpti_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoTitleRow() {
        this.videoTitleRow_ = 0;
    }

    public static DisplayOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DisplayOption parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DisplayOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DisplayOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DisplayOption> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchPageVisualOpti(int i) {
        this.searchPageVisualOpti_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoTitleRow(int i) {
        this.videoTitleRow_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79551.f17657xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DisplayOption();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"videoTitleRow_", "searchPageVisualOpti_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DisplayOption> parser = PARSER;
                if (parser == null) {
                    synchronized (DisplayOption.class) {
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

    public int getSearchPageVisualOpti() {
        return this.searchPageVisualOpti_;
    }

    public int getVideoTitleRow() {
        return this.videoTitleRow_;
    }

    public static Builder newBuilder(DisplayOption displayOption) {
        return DEFAULT_INSTANCE.createBuilder(displayOption);
    }

    public static DisplayOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DisplayOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DisplayOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DisplayOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DisplayOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DisplayOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DisplayOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DisplayOption parseFrom(InputStream inputStream) throws IOException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DisplayOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DisplayOption parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DisplayOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DisplayOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
