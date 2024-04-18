package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes14.dex */
public final class BottomDisplay extends GeneratedMessageLite<BottomDisplay, BottomDisplay.Builder> implements BottomDisplayOrBuilder {
    private static final BottomDisplay DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile Parser<BottomDisplay> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String icon_ = "";
    private TextInfo title_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplay$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78201 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17547xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17547xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17547xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17547xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17547xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17547xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17547xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17547xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BottomDisplay, Builder> implements BottomDisplayOrBuilder {
        /* synthetic */ Builder(C78201 c78201) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((BottomDisplay) this.instance).clearIcon();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((BottomDisplay) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
        public String getIcon() {
            return ((BottomDisplay) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
        public ByteString getIconBytes() {
            return ((BottomDisplay) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
        public TextInfo getTitle() {
            return ((BottomDisplay) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
        public boolean hasTitle() {
            return ((BottomDisplay) this.instance).hasTitle();
        }

        public Builder mergeTitle(TextInfo textInfo) {
            copyOnWrite();
            ((BottomDisplay) this.instance).mergeTitle(textInfo);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((BottomDisplay) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((BottomDisplay) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setTitle(TextInfo textInfo) {
            copyOnWrite();
            ((BottomDisplay) this.instance).setTitle(textInfo);
            return this;
        }

        private Builder() {
            super(BottomDisplay.DEFAULT_INSTANCE);
        }

        public Builder setTitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((BottomDisplay) this.instance).setTitle(builder.build());
            return this;
        }
    }

    static {
        BottomDisplay bottomDisplay = new BottomDisplay();
        DEFAULT_INSTANCE = bottomDisplay;
        GeneratedMessageLite.registerDefaultInstance(BottomDisplay.class, bottomDisplay);
    }

    private BottomDisplay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    public static BottomDisplay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitle(TextInfo textInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BottomDisplay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BottomDisplay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BottomDisplay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BottomDisplay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(TextInfo textInfo) {
        textInfo.getClass();
        this.title_ = textInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78201.f17547xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BottomDisplay();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0208", new Object[]{"title_", "icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BottomDisplay> parser = PARSER;
                if (parser == null) {
                    synchronized (BottomDisplay.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
    public TextInfo getTitle() {
        TextInfo textInfo = this.title_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplayOrBuilder
    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static Builder newBuilder(BottomDisplay bottomDisplay) {
        return DEFAULT_INSTANCE.createBuilder(bottomDisplay);
    }

    public static BottomDisplay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BottomDisplay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BottomDisplay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BottomDisplay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BottomDisplay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BottomDisplay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BottomDisplay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BottomDisplay parseFrom(InputStream inputStream) throws IOException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BottomDisplay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BottomDisplay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BottomDisplay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BottomDisplay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
