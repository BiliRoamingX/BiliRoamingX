package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class MaterialRes extends GeneratedMessageLite<MaterialRes, MaterialRes.Builder> implements MaterialResOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 6;
    public static final int BG_PIC_FIELD_NUMBER = 7;
    private static final MaterialRes DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int JUMP_TYPE_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile Parser<MaterialRes> PARSER = null;
    public static final int TYP_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 3;
    private long id_;
    private int jumpType_;
    private int typ_;
    private String icon_ = "";
    private String url_ = "";
    private String name_ = "";
    private String bgColor_ = "";
    private String bgPic_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.MaterialRes$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16762xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16762xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16762xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16762xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16762xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16762xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16762xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16762xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<MaterialRes, Builder> implements MaterialResOrBuilder {
        /* synthetic */ Builder(C67951 c67951) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgPic() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearBgPic();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearIcon();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearId();
            return this;
        }

        public Builder clearJumpType() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearJumpType();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearName();
            return this;
        }

        public Builder clearTyp() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearTyp();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((MaterialRes) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public String getBgColor() {
            return ((MaterialRes) this.instance).getBgColor();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public ByteString getBgColorBytes() {
            return ((MaterialRes) this.instance).getBgColorBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public String getBgPic() {
            return ((MaterialRes) this.instance).getBgPic();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public ByteString getBgPicBytes() {
            return ((MaterialRes) this.instance).getBgPicBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public String getIcon() {
            return ((MaterialRes) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public ByteString getIconBytes() {
            return ((MaterialRes) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public long getId() {
            return ((MaterialRes) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public int getJumpType() {
            return ((MaterialRes) this.instance).getJumpType();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public String getName() {
            return ((MaterialRes) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public ByteString getNameBytes() {
            return ((MaterialRes) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public int getTyp() {
            return ((MaterialRes) this.instance).getTyp();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public String getUrl() {
            return ((MaterialRes) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
        public ByteString getUrlBytes() {
            return ((MaterialRes) this.instance).getUrlBytes();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((MaterialRes) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialRes) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgPic(String str) {
            copyOnWrite();
            ((MaterialRes) this.instance).setBgPic(str);
            return this;
        }

        public Builder setBgPicBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialRes) this.instance).setBgPicBytes(byteString);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((MaterialRes) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialRes) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((MaterialRes) this.instance).setId(j);
            return this;
        }

        public Builder setJumpType(int i) {
            copyOnWrite();
            ((MaterialRes) this.instance).setJumpType(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((MaterialRes) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialRes) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setTyp(int i) {
            copyOnWrite();
            ((MaterialRes) this.instance).setTyp(i);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((MaterialRes) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialRes) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(MaterialRes.DEFAULT_INSTANCE);
        }
    }

    static {
        MaterialRes materialRes = new MaterialRes();
        DEFAULT_INSTANCE = materialRes;
        GeneratedMessageLite.registerDefaultInstance(MaterialRes.class, materialRes);
    }

    private MaterialRes() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgPic() {
        this.bgPic_ = getDefaultInstance().getBgPic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpType() {
        this.jumpType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTyp() {
        this.typ_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static MaterialRes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MaterialRes parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MaterialRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaterialRes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MaterialRes> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColor(String str) {
        str.getClass();
        this.bgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgPic(String str) {
        str.getClass();
        this.bgPic_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgPicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgPic_ = byteString.toStringUtf8();
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
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpType(int i) {
        this.jumpType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTyp(int i) {
        this.typ_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67951.f16762xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MaterialRes();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0208\b\u0004", new Object[]{"id_", "icon_", "url_", "typ_", "name_", "bgColor_", "bgPic_", "jumpType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MaterialRes> parser = PARSER;
                if (parser == null) {
                    synchronized (MaterialRes.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public String getBgColor() {
        return this.bgColor_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public String getBgPic() {
        return this.bgPic_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public ByteString getBgPicBytes() {
        return ByteString.copyFromUtf8(this.bgPic_);
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public int getJumpType() {
        return this.jumpType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public int getTyp() {
        return this.typ_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.view.v1.MaterialResOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(MaterialRes materialRes) {
        return DEFAULT_INSTANCE.createBuilder(materialRes);
    }

    public static MaterialRes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MaterialRes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MaterialRes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MaterialRes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MaterialRes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MaterialRes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MaterialRes parseFrom(InputStream inputStream) throws IOException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaterialRes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MaterialRes parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MaterialRes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
