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
public final class RefreshPage extends GeneratedMessageLite<RefreshPage, RefreshPage.Builder> implements MessageLiteOrBuilder {
    private static final RefreshPage DEFAULT_INSTANCE;
    private static volatile Parser<RefreshPage> PARSER = null;
    public static final int REFRESHABLE_FIELD_NUMBER = 1;
    public static final int REFRESH_ICON_FIELD_NUMBER = 2;
    public static final int REFRESH_SHOW_FIELD_NUMBER = 4;
    public static final int REFRESH_TEXT_FIELD_NUMBER = 3;
    private int refreshIcon_;
    private float refreshShow_;
    private String refreshText_ = "";
    private int refreshable_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RefreshPage$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68371 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16798xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16798xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16798xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16798xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16798xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16798xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16798xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16798xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RefreshPage, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68371 c68371) {
            this();
        }

        public Builder clearRefreshIcon() {
            copyOnWrite();
            ((RefreshPage) this.instance).clearRefreshIcon();
            return this;
        }

        public Builder clearRefreshShow() {
            copyOnWrite();
            ((RefreshPage) this.instance).clearRefreshShow();
            return this;
        }

        public Builder clearRefreshText() {
            copyOnWrite();
            ((RefreshPage) this.instance).clearRefreshText();
            return this;
        }

        public Builder clearRefreshable() {
            copyOnWrite();
            ((RefreshPage) this.instance).clearRefreshable();
            return this;
        }

        public int getRefreshIcon() {
            return ((RefreshPage) this.instance).getRefreshIcon();
        }

        public float getRefreshShow() {
            return ((RefreshPage) this.instance).getRefreshShow();
        }

        public String getRefreshText() {
            return ((RefreshPage) this.instance).getRefreshText();
        }

        public ByteString getRefreshTextBytes() {
            return ((RefreshPage) this.instance).getRefreshTextBytes();
        }

        public int getRefreshable() {
            return ((RefreshPage) this.instance).getRefreshable();
        }

        public Builder setRefreshIcon(int i) {
            copyOnWrite();
            ((RefreshPage) this.instance).setRefreshIcon(i);
            return this;
        }

        public Builder setRefreshShow(float f) {
            copyOnWrite();
            ((RefreshPage) this.instance).setRefreshShow(f);
            return this;
        }

        public Builder setRefreshText(String str) {
            copyOnWrite();
            ((RefreshPage) this.instance).setRefreshText(str);
            return this;
        }

        public Builder setRefreshTextBytes(ByteString byteString) {
            copyOnWrite();
            ((RefreshPage) this.instance).setRefreshTextBytes(byteString);
            return this;
        }

        public Builder setRefreshable(int i) {
            copyOnWrite();
            ((RefreshPage) this.instance).setRefreshable(i);
            return this;
        }

        private Builder() {
            super(RefreshPage.DEFAULT_INSTANCE);
        }
    }

    static {
        RefreshPage refreshPage = new RefreshPage();
        DEFAULT_INSTANCE = refreshPage;
        GeneratedMessageLite.registerDefaultInstance(RefreshPage.class, refreshPage);
    }

    private RefreshPage() {
    }

    public void clearRefreshIcon() {
        this.refreshIcon_ = 0;
    }

    public void clearRefreshShow() {
        this.refreshShow_ = 0.0f;
    }

    public void clearRefreshText() {
        this.refreshText_ = getDefaultInstance().getRefreshText();
    }

    public void clearRefreshable() {
        this.refreshable_ = 0;
    }

    public static RefreshPage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RefreshPage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RefreshPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RefreshPage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RefreshPage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setRefreshIcon(int i) {
        this.refreshIcon_ = i;
    }

    public void setRefreshShow(float f) {
        this.refreshShow_ = f;
    }

    public void setRefreshText(String str) {
        str.getClass();
        this.refreshText_ = str;
    }

    public void setRefreshTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.refreshText_ = byteString.toStringUtf8();
    }

    public void setRefreshable(int i) {
        this.refreshable_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68371.f16798xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RefreshPage();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0208\u0004\u0001", new Object[]{"refreshable_", "refreshIcon_", "refreshText_", "refreshShow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RefreshPage> parser = PARSER;
                if (parser == null) {
                    synchronized (RefreshPage.class) {
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

    public int getRefreshIcon() {
        return this.refreshIcon_;
    }

    public float getRefreshShow() {
        return this.refreshShow_;
    }

    public String getRefreshText() {
        return this.refreshText_;
    }

    public ByteString getRefreshTextBytes() {
        return ByteString.copyFromUtf8(this.refreshText_);
    }

    public int getRefreshable() {
        return this.refreshable_;
    }

    public static Builder newBuilder(RefreshPage refreshPage) {
        return DEFAULT_INSTANCE.createBuilder(refreshPage);
    }

    public static RefreshPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RefreshPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RefreshPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RefreshPage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RefreshPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RefreshPage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RefreshPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RefreshPage parseFrom(InputStream inputStream) throws IOException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RefreshPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RefreshPage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RefreshPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RefreshPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
