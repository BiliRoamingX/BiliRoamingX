package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class Rank extends GeneratedMessageLite<Rank, Rank.Builder> implements MessageLiteOrBuilder {
    private static final Rank DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int ICON_NIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<Rank> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    private String icon_ = "";
    private String iconNight_ = "";
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Rank$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68321 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16793xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16793xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16793xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16793xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16793xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16793xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16793xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16793xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Rank, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68321 c68321) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((Rank) this.instance).clearIcon();
            return this;
        }

        public Builder clearIconNight() {
            copyOnWrite();
            ((Rank) this.instance).clearIconNight();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Rank) this.instance).clearText();
            return this;
        }

        public String getIcon() {
            return ((Rank) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((Rank) this.instance).getIconBytes();
        }

        public String getIconNight() {
            return ((Rank) this.instance).getIconNight();
        }

        public ByteString getIconNightBytes() {
            return ((Rank) this.instance).getIconNightBytes();
        }

        public String getText() {
            return ((Rank) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Rank) this.instance).getTextBytes();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((Rank) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Rank) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setIconNight(String str) {
            copyOnWrite();
            ((Rank) this.instance).setIconNight(str);
            return this;
        }

        public Builder setIconNightBytes(ByteString byteString) {
            copyOnWrite();
            ((Rank) this.instance).setIconNightBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Rank) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Rank) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(Rank.DEFAULT_INSTANCE);
        }
    }

    static {
        Rank rank = new Rank();
        DEFAULT_INSTANCE = rank;
        GeneratedMessageLite.registerDefaultInstance(Rank.class, rank);
    }

    private Rank() {
    }

    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    public void clearIconNight() {
        this.iconNight_ = getDefaultInstance().getIconNight();
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static Rank getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Rank parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Rank) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rank parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Rank> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    public void setIconNight(String str) {
        str.getClass();
        this.iconNight_ = str;
    }

    public void setIconNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconNight_ = byteString.toStringUtf8();
    }

    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68321.f16793xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Rank();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"icon_", "iconNight_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Rank> parser = PARSER;
                if (parser == null) {
                    synchronized (Rank.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public String getIconNight() {
        return this.iconNight_;
    }

    public ByteString getIconNightBytes() {
        return ByteString.copyFromUtf8(this.iconNight_);
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(Rank rank) {
        return DEFAULT_INSTANCE.createBuilder(rank);
    }

    public static Rank parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rank) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rank parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Rank parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Rank parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Rank parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Rank parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Rank parseFrom(InputStream inputStream) throws IOException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rank parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rank parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Rank parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
