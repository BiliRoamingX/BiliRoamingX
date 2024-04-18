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
public final class RelateTab extends GeneratedMessageLite<RelateTab, RelateTab.Builder> implements RelateTabOrBuilder {
    private static final RelateTab DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<RelateTab> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String id_ = "";
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RelateTab$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68421 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16802xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16802xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16802xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16802xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16802xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16802xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16802xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16802xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateTab, Builder> implements RelateTabOrBuilder {
        /* synthetic */ Builder(C68421 c68421) {
            this();
        }

        public Builder clearId() {
            copyOnWrite();
            ((RelateTab) this.instance).clearId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((RelateTab) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
        public String getId() {
            return ((RelateTab) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
        public ByteString getIdBytes() {
            return ((RelateTab) this.instance).getIdBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
        public String getTitle() {
            return ((RelateTab) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
        public ByteString getTitleBytes() {
            return ((RelateTab) this.instance).getTitleBytes();
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((RelateTab) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateTab) this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((RelateTab) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateTab) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(RelateTab.DEFAULT_INSTANCE);
        }
    }

    static {
        RelateTab relateTab = new RelateTab();
        DEFAULT_INSTANCE = relateTab;
        GeneratedMessageLite.registerDefaultInstance(RelateTab.class, relateTab);
    }

    private RelateTab() {
    }

    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static RelateTab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateTab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateTab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateTab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68421.f16802xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateTab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"id_", "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateTab> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateTab.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.RelateTabOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(RelateTab relateTab) {
        return DEFAULT_INSTANCE.createBuilder(relateTab);
    }

    public static RelateTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateTab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateTab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateTab parseFrom(InputStream inputStream) throws IOException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateTab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
