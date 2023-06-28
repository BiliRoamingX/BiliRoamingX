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
public final class PlayerIcon extends GeneratedMessageLite<PlayerIcon, PlayerIcon.Builder> implements MessageLiteOrBuilder {
    private static final PlayerIcon DEFAULT_INSTANCE;
    public static final int DRAG_DATA_FIELD_NUMBER = 8;
    public static final int DRAG_LEFT_PNG_FIELD_NUMBER = 5;
    public static final int DRAG_RIGHT_PNG_FIELD_NUMBER = 7;
    public static final int HASH1_FIELD_NUMBER = 2;
    public static final int HASH2_FIELD_NUMBER = 4;
    public static final int MIDDLE_PNG_FIELD_NUMBER = 6;
    public static final int NODRAG_DATA_FIELD_NUMBER = 9;
    private static volatile Parser<PlayerIcon> PARSER = null;
    public static final int URL1_FIELD_NUMBER = 1;
    public static final int URL2_FIELD_NUMBER = 3;
    private IconData dragData_;
    private IconData nodragData_;
    private String url1_ = "";
    private String hash1_ = "";
    private String url2_ = "";
    private String hash2_ = "";
    private String dragLeftPng_ = "";
    private String middlePng_ = "";
    private String dragRightPng_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PlayerIcon$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16780xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16780xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16780xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16780xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16780xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16780xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16780xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16780xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayerIcon, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68181 c68181) {
            this();
        }

        public Builder clearDragData() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearDragData();
            return this;
        }

        public Builder clearDragLeftPng() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearDragLeftPng();
            return this;
        }

        public Builder clearDragRightPng() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearDragRightPng();
            return this;
        }

        public Builder clearHash1() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearHash1();
            return this;
        }

        public Builder clearHash2() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearHash2();
            return this;
        }

        public Builder clearMiddlePng() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearMiddlePng();
            return this;
        }

        public Builder clearNodragData() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearNodragData();
            return this;
        }

        public Builder clearUrl1() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearUrl1();
            return this;
        }

        public Builder clearUrl2() {
            copyOnWrite();
            ((PlayerIcon) this.instance).clearUrl2();
            return this;
        }

        public IconData getDragData() {
            return ((PlayerIcon) this.instance).getDragData();
        }

        public String getDragLeftPng() {
            return ((PlayerIcon) this.instance).getDragLeftPng();
        }

        public ByteString getDragLeftPngBytes() {
            return ((PlayerIcon) this.instance).getDragLeftPngBytes();
        }

        public String getDragRightPng() {
            return ((PlayerIcon) this.instance).getDragRightPng();
        }

        public ByteString getDragRightPngBytes() {
            return ((PlayerIcon) this.instance).getDragRightPngBytes();
        }

        public String getHash1() {
            return ((PlayerIcon) this.instance).getHash1();
        }

        public ByteString getHash1Bytes() {
            return ((PlayerIcon) this.instance).getHash1Bytes();
        }

        public String getHash2() {
            return ((PlayerIcon) this.instance).getHash2();
        }

        public ByteString getHash2Bytes() {
            return ((PlayerIcon) this.instance).getHash2Bytes();
        }

        public String getMiddlePng() {
            return ((PlayerIcon) this.instance).getMiddlePng();
        }

        public ByteString getMiddlePngBytes() {
            return ((PlayerIcon) this.instance).getMiddlePngBytes();
        }

        public IconData getNodragData() {
            return ((PlayerIcon) this.instance).getNodragData();
        }

        public String getUrl1() {
            return ((PlayerIcon) this.instance).getUrl1();
        }

        public ByteString getUrl1Bytes() {
            return ((PlayerIcon) this.instance).getUrl1Bytes();
        }

        public String getUrl2() {
            return ((PlayerIcon) this.instance).getUrl2();
        }

        public ByteString getUrl2Bytes() {
            return ((PlayerIcon) this.instance).getUrl2Bytes();
        }

        public boolean hasDragData() {
            return ((PlayerIcon) this.instance).hasDragData();
        }

        public boolean hasNodragData() {
            return ((PlayerIcon) this.instance).hasNodragData();
        }

        public Builder mergeDragData(IconData iconData) {
            copyOnWrite();
            ((PlayerIcon) this.instance).mergeDragData(iconData);
            return this;
        }

        public Builder mergeNodragData(IconData iconData) {
            copyOnWrite();
            ((PlayerIcon) this.instance).mergeNodragData(iconData);
            return this;
        }

        public Builder setDragData(IconData iconData) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setDragData(iconData);
            return this;
        }

        public Builder setDragLeftPng(String str) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setDragLeftPng(str);
            return this;
        }

        public Builder setDragLeftPngBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setDragLeftPngBytes(byteString);
            return this;
        }

        public Builder setDragRightPng(String str) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setDragRightPng(str);
            return this;
        }

        public Builder setDragRightPngBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setDragRightPngBytes(byteString);
            return this;
        }

        public Builder setHash1(String str) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setHash1(str);
            return this;
        }

        public Builder setHash1Bytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setHash1Bytes(byteString);
            return this;
        }

        public Builder setHash2(String str) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setHash2(str);
            return this;
        }

        public Builder setHash2Bytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setHash2Bytes(byteString);
            return this;
        }

        public Builder setMiddlePng(String str) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setMiddlePng(str);
            return this;
        }

        public Builder setMiddlePngBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setMiddlePngBytes(byteString);
            return this;
        }

        public Builder setNodragData(IconData iconData) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setNodragData(iconData);
            return this;
        }

        public Builder setUrl1(String str) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setUrl1(str);
            return this;
        }

        public Builder setUrl1Bytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setUrl1Bytes(byteString);
            return this;
        }

        public Builder setUrl2(String str) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setUrl2(str);
            return this;
        }

        public Builder setUrl2Bytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setUrl2Bytes(byteString);
            return this;
        }

        private Builder() {
            super(PlayerIcon.DEFAULT_INSTANCE);
        }

        public Builder setDragData(IconData.Builder builder) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setDragData(builder.build());
            return this;
        }

        public Builder setNodragData(IconData.Builder builder) {
            copyOnWrite();
            ((PlayerIcon) this.instance).setNodragData(builder.build());
            return this;
        }
    }

    static {
        PlayerIcon playerIcon = new PlayerIcon();
        DEFAULT_INSTANCE = playerIcon;
        GeneratedMessageLite.registerDefaultInstance(PlayerIcon.class, playerIcon);
    }

    private PlayerIcon() {
    }

    public void clearDragData() {
        this.dragData_ = null;
    }

    public void clearDragLeftPng() {
        this.dragLeftPng_ = getDefaultInstance().getDragLeftPng();
    }

    public void clearDragRightPng() {
        this.dragRightPng_ = getDefaultInstance().getDragRightPng();
    }

    public void clearHash1() {
        this.hash1_ = getDefaultInstance().getHash1();
    }

    public void clearHash2() {
        this.hash2_ = getDefaultInstance().getHash2();
    }

    public void clearMiddlePng() {
        this.middlePng_ = getDefaultInstance().getMiddlePng();
    }

    public void clearNodragData() {
        this.nodragData_ = null;
    }

    public void clearUrl1() {
        this.url1_ = getDefaultInstance().getUrl1();
    }

    public void clearUrl2() {
        this.url2_ = getDefaultInstance().getUrl2();
    }

    public static PlayerIcon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeDragData(IconData iconData) {
    }

    public void mergeNodragData(IconData iconData) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerIcon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerIcon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerIcon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerIcon> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDragData(IconData iconData) {
        iconData.getClass();
        this.dragData_ = iconData;
    }

    public void setDragLeftPng(String str) {
        str.getClass();
        this.dragLeftPng_ = str;
    }

    public void setDragLeftPngBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dragLeftPng_ = byteString.toStringUtf8();
    }

    public void setDragRightPng(String str) {
        str.getClass();
        this.dragRightPng_ = str;
    }

    public void setDragRightPngBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dragRightPng_ = byteString.toStringUtf8();
    }

    public void setHash1(String str) {
        str.getClass();
        this.hash1_ = str;
    }

    public void setHash1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.hash1_ = byteString.toStringUtf8();
    }

    public void setHash2(String str) {
        str.getClass();
        this.hash2_ = str;
    }

    public void setHash2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.hash2_ = byteString.toStringUtf8();
    }

    public void setMiddlePng(String str) {
        str.getClass();
        this.middlePng_ = str;
    }

    public void setMiddlePngBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.middlePng_ = byteString.toStringUtf8();
    }

    public void setNodragData(IconData iconData) {
        iconData.getClass();
        this.nodragData_ = iconData;
    }

    public void setUrl1(String str) {
        str.getClass();
        this.url1_ = str;
    }

    public void setUrl1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url1_ = byteString.toStringUtf8();
    }

    public void setUrl2(String str) {
        str.getClass();
        this.url2_ = str;
    }

    public void setUrl2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url2_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68181.f16780xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerIcon();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\t\t\t", new Object[]{"url1_", "hash1_", "url2_", "hash2_", "dragLeftPng_", "middlePng_", "dragRightPng_", "dragData_", "nodragData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerIcon> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerIcon.class) {
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

    public IconData getDragData() {
        IconData iconData = this.dragData_;
        return iconData == null ? IconData.getDefaultInstance() : iconData;
    }

    public String getDragLeftPng() {
        return this.dragLeftPng_;
    }

    public ByteString getDragLeftPngBytes() {
        return ByteString.copyFromUtf8(this.dragLeftPng_);
    }

    public String getDragRightPng() {
        return this.dragRightPng_;
    }

    public ByteString getDragRightPngBytes() {
        return ByteString.copyFromUtf8(this.dragRightPng_);
    }

    public String getHash1() {
        return this.hash1_;
    }

    public ByteString getHash1Bytes() {
        return ByteString.copyFromUtf8(this.hash1_);
    }

    public String getHash2() {
        return this.hash2_;
    }

    public ByteString getHash2Bytes() {
        return ByteString.copyFromUtf8(this.hash2_);
    }

    public String getMiddlePng() {
        return this.middlePng_;
    }

    public ByteString getMiddlePngBytes() {
        return ByteString.copyFromUtf8(this.middlePng_);
    }

    public IconData getNodragData() {
        IconData iconData = this.nodragData_;
        return iconData == null ? IconData.getDefaultInstance() : iconData;
    }

    public String getUrl1() {
        return this.url1_;
    }

    public ByteString getUrl1Bytes() {
        return ByteString.copyFromUtf8(this.url1_);
    }

    public String getUrl2() {
        return this.url2_;
    }

    public ByteString getUrl2Bytes() {
        return ByteString.copyFromUtf8(this.url2_);
    }

    public boolean hasDragData() {
        return this.dragData_ != null;
    }

    public boolean hasNodragData() {
        return this.nodragData_ != null;
    }

    public static Builder newBuilder(PlayerIcon playerIcon) {
        return DEFAULT_INSTANCE.createBuilder(playerIcon);
    }

    public static PlayerIcon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerIcon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerIcon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerIcon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayerIcon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerIcon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerIcon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerIcon parseFrom(InputStream inputStream) throws IOException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerIcon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerIcon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerIcon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
