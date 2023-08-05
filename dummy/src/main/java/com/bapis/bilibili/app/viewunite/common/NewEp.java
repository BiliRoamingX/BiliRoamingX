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
public final class NewEp extends GeneratedMessageLite<NewEp, NewEp.Builder> implements MessageLiteOrBuilder {
    public static final int COVER_FIELD_NUMBER = 6;
    private static final NewEp DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INDEX_SHOW_FIELD_NUMBER = 7;
    public static final int IS_NEW_FIELD_NUMBER = 4;
    public static final int MORE_FIELD_NUMBER = 5;
    private static volatile Parser<NewEp> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int id_;
    private int isNew_;
    private String title_ = "";
    private String desc_ = "";
    private String more_ = "";
    private String cover_ = "";
    private String indexShow_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.NewEp$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17000xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17000xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<NewEp, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70181 c70181) {
            this();
        }

        public Builder clearCover() {
            copyOnWrite();
            ((NewEp) this.instance).clearCover();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((NewEp) this.instance).clearDesc();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((NewEp) this.instance).clearId();
            return this;
        }

        public Builder clearIndexShow() {
            copyOnWrite();
            ((NewEp) this.instance).clearIndexShow();
            return this;
        }

        public Builder clearIsNew() {
            copyOnWrite();
            ((NewEp) this.instance).clearIsNew();
            return this;
        }

        public Builder clearMore() {
            copyOnWrite();
            ((NewEp) this.instance).clearMore();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((NewEp) this.instance).clearTitle();
            return this;
        }

        public String getCover() {
            return ((NewEp) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((NewEp) this.instance).getCoverBytes();
        }

        public String getDesc() {
            return ((NewEp) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((NewEp) this.instance).getDescBytes();
        }

        public int getId() {
            return ((NewEp) this.instance).getId();
        }

        public String getIndexShow() {
            return ((NewEp) this.instance).getIndexShow();
        }

        public ByteString getIndexShowBytes() {
            return ((NewEp) this.instance).getIndexShowBytes();
        }

        public int getIsNew() {
            return ((NewEp) this.instance).getIsNew();
        }

        public String getMore() {
            return ((NewEp) this.instance).getMore();
        }

        public ByteString getMoreBytes() {
            return ((NewEp) this.instance).getMoreBytes();
        }

        public String getTitle() {
            return ((NewEp) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((NewEp) this.instance).getTitleBytes();
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((NewEp) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((NewEp) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((NewEp) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((NewEp) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((NewEp) this.instance).setId(i);
            return this;
        }

        public Builder setIndexShow(String str) {
            copyOnWrite();
            ((NewEp) this.instance).setIndexShow(str);
            return this;
        }

        public Builder setIndexShowBytes(ByteString byteString) {
            copyOnWrite();
            ((NewEp) this.instance).setIndexShowBytes(byteString);
            return this;
        }

        public Builder setIsNew(int i) {
            copyOnWrite();
            ((NewEp) this.instance).setIsNew(i);
            return this;
        }

        public Builder setMore(String str) {
            copyOnWrite();
            ((NewEp) this.instance).setMore(str);
            return this;
        }

        public Builder setMoreBytes(ByteString byteString) {
            copyOnWrite();
            ((NewEp) this.instance).setMoreBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((NewEp) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((NewEp) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(NewEp.DEFAULT_INSTANCE);
        }
    }

    static {
        NewEp newEp = new NewEp();
        DEFAULT_INSTANCE = newEp;
        GeneratedMessageLite.registerDefaultInstance(NewEp.class, newEp);
    }

    private NewEp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndexShow() {
        this.indexShow_ = getDefaultInstance().getIndexShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNew() {
        this.isNew_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMore() {
        this.more_ = getDefaultInstance().getMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static NewEp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NewEp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NewEp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NewEp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NewEp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndexShow(String str) {
        str.getClass();
        this.indexShow_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndexShowBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.indexShow_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNew(int i) {
        this.isNew_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMore(String str) {
        str.getClass();
        this.more_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.more_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70181.f17000xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new NewEp();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"id_", "title_", "desc_", "isNew_", "more_", "cover_", "indexShow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NewEp> parser = PARSER;
                if (parser == null) {
                    synchronized (NewEp.class) {
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

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public int getId() {
        return this.id_;
    }

    public String getIndexShow() {
        return this.indexShow_;
    }

    public ByteString getIndexShowBytes() {
        return ByteString.copyFromUtf8(this.indexShow_);
    }

    public int getIsNew() {
        return this.isNew_;
    }

    public String getMore() {
        return this.more_;
    }

    public ByteString getMoreBytes() {
        return ByteString.copyFromUtf8(this.more_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(NewEp newEp) {
        return DEFAULT_INSTANCE.createBuilder(newEp);
    }

    public static NewEp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NewEp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NewEp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NewEp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NewEp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NewEp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NewEp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NewEp parseFrom(InputStream inputStream) throws IOException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NewEp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NewEp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NewEp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
