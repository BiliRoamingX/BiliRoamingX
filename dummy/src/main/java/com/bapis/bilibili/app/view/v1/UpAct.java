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
public final class UpAct extends GeneratedMessageLite<UpAct, UpAct.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 7;
    private static final UpAct DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 5;
    public static final int MID_FIELD_NUMBER = 2;
    private static volatile Parser<UpAct> PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int STATEMENT_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 6;
    private long mid_;
    private long sid_;
    private String title_ = "";
    private String statement_ = "";
    private String image_ = "";
    private String url_ = "";
    private String button_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UpAct$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16839xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16839xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16839xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16839xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16839xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16839xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16839xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16839xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UpAct, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68821 c68821) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((UpAct) this.instance).clearButton();
            return this;
        }

        public Builder clearImage() {
            copyOnWrite();
            ((UpAct) this.instance).clearImage();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((UpAct) this.instance).clearMid();
            return this;
        }

        public Builder clearSid() {
            copyOnWrite();
            ((UpAct) this.instance).clearSid();
            return this;
        }

        public Builder clearStatement() {
            copyOnWrite();
            ((UpAct) this.instance).clearStatement();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((UpAct) this.instance).clearTitle();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((UpAct) this.instance).clearUrl();
            return this;
        }

        public String getButton() {
            return ((UpAct) this.instance).getButton();
        }

        public ByteString getButtonBytes() {
            return ((UpAct) this.instance).getButtonBytes();
        }

        public String getImage() {
            return ((UpAct) this.instance).getImage();
        }

        public ByteString getImageBytes() {
            return ((UpAct) this.instance).getImageBytes();
        }

        public long getMid() {
            return ((UpAct) this.instance).getMid();
        }

        public long getSid() {
            return ((UpAct) this.instance).getSid();
        }

        public String getStatement() {
            return ((UpAct) this.instance).getStatement();
        }

        public ByteString getStatementBytes() {
            return ((UpAct) this.instance).getStatementBytes();
        }

        public String getTitle() {
            return ((UpAct) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((UpAct) this.instance).getTitleBytes();
        }

        public String getUrl() {
            return ((UpAct) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((UpAct) this.instance).getUrlBytes();
        }

        public Builder setButton(String str) {
            copyOnWrite();
            ((UpAct) this.instance).setButton(str);
            return this;
        }

        public Builder setButtonBytes(ByteString byteString) {
            copyOnWrite();
            ((UpAct) this.instance).setButtonBytes(byteString);
            return this;
        }

        public Builder setImage(String str) {
            copyOnWrite();
            ((UpAct) this.instance).setImage(str);
            return this;
        }

        public Builder setImageBytes(ByteString byteString) {
            copyOnWrite();
            ((UpAct) this.instance).setImageBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((UpAct) this.instance).setMid(j);
            return this;
        }

        public Builder setSid(long j) {
            copyOnWrite();
            ((UpAct) this.instance).setSid(j);
            return this;
        }

        public Builder setStatement(String str) {
            copyOnWrite();
            ((UpAct) this.instance).setStatement(str);
            return this;
        }

        public Builder setStatementBytes(ByteString byteString) {
            copyOnWrite();
            ((UpAct) this.instance).setStatementBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((UpAct) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UpAct) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((UpAct) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((UpAct) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(UpAct.DEFAULT_INSTANCE);
        }
    }

    static {
        UpAct upAct = new UpAct();
        DEFAULT_INSTANCE = upAct;
        GeneratedMessageLite.registerDefaultInstance(UpAct.class, upAct);
    }

    private UpAct() {
    }

    public void clearButton() {
        this.button_ = getDefaultInstance().getButton();
    }

    public void clearImage() {
        this.image_ = getDefaultInstance().getImage();
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearSid() {
        this.sid_ = 0L;
    }

    public void clearStatement() {
        this.statement_ = getDefaultInstance().getStatement();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static UpAct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UpAct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpAct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpAct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UpAct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setButton(String str) {
        str.getClass();
        this.button_ = str;
    }

    public void setButtonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.button_ = byteString.toStringUtf8();
    }

    public void setImage(String str) {
        str.getClass();
        this.image_ = str;
    }

    public void setImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.image_ = byteString.toStringUtf8();
    }

    public void setMid(long j) {
        this.mid_ = j;
    }

    public void setSid(long j) {
        this.sid_ = j;
    }

    public void setStatement(String str) {
        str.getClass();
        this.statement_ = str;
    }

    public void setStatementBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.statement_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68821.f16839xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UpAct();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"sid_", "mid_", "title_", "statement_", "image_", "url_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UpAct> parser = PARSER;
                if (parser == null) {
                    synchronized (UpAct.class) {
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

    public String getButton() {
        return this.button_;
    }

    public ByteString getButtonBytes() {
        return ByteString.copyFromUtf8(this.button_);
    }

    public String getImage() {
        return this.image_;
    }

    public ByteString getImageBytes() {
        return ByteString.copyFromUtf8(this.image_);
    }

    public long getMid() {
        return this.mid_;
    }

    public long getSid() {
        return this.sid_;
    }

    public String getStatement() {
        return this.statement_;
    }

    public ByteString getStatementBytes() {
        return ByteString.copyFromUtf8(this.statement_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(UpAct upAct) {
        return DEFAULT_INSTANCE.createBuilder(upAct);
    }

    public static UpAct parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpAct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpAct parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UpAct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UpAct parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UpAct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpAct parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UpAct parseFrom(InputStream inputStream) throws IOException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpAct parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpAct parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UpAct parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpAct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
