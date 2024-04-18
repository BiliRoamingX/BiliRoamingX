package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class PointActivity extends GeneratedMessageLite<PointActivity, PointActivity.Builder> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final PointActivity DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 3;
    private static volatile Parser<PointActivity> PARSER = null;
    public static final int TIP_FIELD_NUMBER = 1;
    private String tip_ = "";
    private String content_ = "";
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.PointActivity$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70291 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17010xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17010xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17010xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17010xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17010xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17010xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17010xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17010xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PointActivity, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70291 c70291) {
            this();
        }

        public Builder clearContent() {
            copyOnWrite();
            ((PointActivity) this.instance).clearContent();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((PointActivity) this.instance).clearLink();
            return this;
        }

        public Builder clearTip() {
            copyOnWrite();
            ((PointActivity) this.instance).clearTip();
            return this;
        }

        public String getContent() {
            return ((PointActivity) this.instance).getContent();
        }

        public ByteString getContentBytes() {
            return ((PointActivity) this.instance).getContentBytes();
        }

        public String getLink() {
            return ((PointActivity) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((PointActivity) this.instance).getLinkBytes();
        }

        public String getTip() {
            return ((PointActivity) this.instance).getTip();
        }

        public ByteString getTipBytes() {
            return ((PointActivity) this.instance).getTipBytes();
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((PointActivity) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((PointActivity) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((PointActivity) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((PointActivity) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setTip(String str) {
            copyOnWrite();
            ((PointActivity) this.instance).setTip(str);
            return this;
        }

        public Builder setTipBytes(ByteString byteString) {
            copyOnWrite();
            ((PointActivity) this.instance).setTipBytes(byteString);
            return this;
        }

        private Builder() {
            super(PointActivity.DEFAULT_INSTANCE);
        }
    }

    static {
        PointActivity pointActivity = new PointActivity();
        DEFAULT_INSTANCE = pointActivity;
        GeneratedMessageLite.registerDefaultInstance(PointActivity.class, pointActivity);
    }

    private PointActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTip() {
        this.tip_ = getDefaultInstance().getTip();
    }

    public static PointActivity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PointActivity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PointActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PointActivity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PointActivity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTip(String str) {
        str.getClass();
        this.tip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTipBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tip_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70291.f17010xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PointActivity();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"tip_", "content_", "link_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PointActivity> parser = PARSER;
                if (parser == null) {
                    synchronized (PointActivity.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getTip() {
        return this.tip_;
    }

    public ByteString getTipBytes() {
        return ByteString.copyFromUtf8(this.tip_);
    }

    public static Builder newBuilder(PointActivity pointActivity) {
        return DEFAULT_INSTANCE.createBuilder(pointActivity);
    }

    public static PointActivity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PointActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PointActivity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PointActivity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PointActivity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PointActivity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PointActivity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PointActivity parseFrom(InputStream inputStream) throws IOException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PointActivity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PointActivity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PointActivity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PointActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
