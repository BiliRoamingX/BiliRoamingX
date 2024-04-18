package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ResponseUrl extends GeneratedMessageLite<ResponseUrl, ResponseUrl.Builder> implements ResponseUrlOrBuilder {
    public static final int BACKUP_URL_FIELD_NUMBER = 5;
    private static final ResponseUrl DEFAULT_INSTANCE;
    public static final int LENGTH_FIELD_NUMBER = 2;
    public static final int MD5_FIELD_NUMBER = 6;
    public static final int ORDER_FIELD_NUMBER = 1;
    private static volatile Parser<ResponseUrl> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 4;
    private long length_;
    private int order_;
    private long size_;
    private String url_ = "";
    private Internal.ProtobufList<String> backupUrl_ = GeneratedMessageLite.emptyProtobufList();
    private String md5_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.ResponseUrl$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65131 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16544xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16544xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16544xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16544xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16544xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16544xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16544xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16544xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ResponseUrl, Builder> implements ResponseUrlOrBuilder {
        /* synthetic */ Builder(C65131 c65131) {
            this();
        }

        public Builder addAllBackupUrl(Iterable<String> iterable) {
            copyOnWrite();
            ((ResponseUrl) this.instance).addAllBackupUrl(iterable);
            return this;
        }

        public Builder addBackupUrl(String str) {
            copyOnWrite();
            ((ResponseUrl) this.instance).addBackupUrl(str);
            return this;
        }

        public Builder addBackupUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ResponseUrl) this.instance).addBackupUrlBytes(byteString);
            return this;
        }

        public Builder clearBackupUrl() {
            copyOnWrite();
            ((ResponseUrl) this.instance).clearBackupUrl();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((ResponseUrl) this.instance).clearLength();
            return this;
        }

        public Builder clearMd5() {
            copyOnWrite();
            ((ResponseUrl) this.instance).clearMd5();
            return this;
        }

        public Builder clearOrder() {
            copyOnWrite();
            ((ResponseUrl) this.instance).clearOrder();
            return this;
        }

        public Builder clearSize() {
            copyOnWrite();
            ((ResponseUrl) this.instance).clearSize();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((ResponseUrl) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public String getBackupUrl(int i) {
            return ((ResponseUrl) this.instance).getBackupUrl(i);
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public ByteString getBackupUrlBytes(int i) {
            return ((ResponseUrl) this.instance).getBackupUrlBytes(i);
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public int getBackupUrlCount() {
            return ((ResponseUrl) this.instance).getBackupUrlCount();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public List<String> getBackupUrlList() {
            return Collections.unmodifiableList(((ResponseUrl) this.instance).getBackupUrlList());
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public long getLength() {
            return ((ResponseUrl) this.instance).getLength();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public String getMd5() {
            return ((ResponseUrl) this.instance).getMd5();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public ByteString getMd5Bytes() {
            return ((ResponseUrl) this.instance).getMd5Bytes();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public int getOrder() {
            return ((ResponseUrl) this.instance).getOrder();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public long getSize() {
            return ((ResponseUrl) this.instance).getSize();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public String getUrl() {
            return ((ResponseUrl) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
        public ByteString getUrlBytes() {
            return ((ResponseUrl) this.instance).getUrlBytes();
        }

        public Builder setBackupUrl(int i, String str) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setBackupUrl(i, str);
            return this;
        }

        public Builder setLength(long j) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setLength(j);
            return this;
        }

        public Builder setMd5(String str) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setMd5(str);
            return this;
        }

        public Builder setMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setMd5Bytes(byteString);
            return this;
        }

        public Builder setOrder(int i) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setOrder(i);
            return this;
        }

        public Builder setSize(long j) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setSize(j);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ResponseUrl) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(ResponseUrl.DEFAULT_INSTANCE);
        }
    }

    static {
        ResponseUrl responseUrl = new ResponseUrl();
        DEFAULT_INSTANCE = responseUrl;
        GeneratedMessageLite.registerDefaultInstance(ResponseUrl.class, responseUrl);
    }

    private ResponseUrl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBackupUrl(Iterable<String> iterable) {
        ensureBackupUrlIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.backupUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBackupUrl(String str) {
        str.getClass();
        ensureBackupUrlIsMutable();
        this.backupUrl_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBackupUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBackupUrlIsMutable();
        this.backupUrl_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackupUrl() {
        this.backupUrl_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.length_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMd5() {
        this.md5_ = getDefaultInstance().getMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrder() {
        this.order_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensureBackupUrlIsMutable() {
        Internal.ProtobufList<String> protobufList = this.backupUrl_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.backupUrl_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ResponseUrl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResponseUrl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponseUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponseUrl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResponseUrl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackupUrl(int i, String str) {
        str.getClass();
        ensureBackupUrlIsMutable();
        this.backupUrl_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(long j) {
        this.length_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5(String str) {
        str.getClass();
        this.md5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.md5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrder(int i) {
        this.order_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j) {
        this.size_ = j;
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65131.f16544xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ResponseUrl();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u000b\u0002\u0003\u0003\u0003\u0004\u0208\u0005\u021a\u0006\u0208", new Object[]{"order_", "length_", "size_", "url_", "backupUrl_", "md5_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResponseUrl> parser = PARSER;
                if (parser == null) {
                    synchronized (ResponseUrl.class) {
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

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public String getBackupUrl(int i) {
        return this.backupUrl_.get(i);
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public ByteString getBackupUrlBytes(int i) {
        return ByteString.copyFromUtf8(this.backupUrl_.get(i));
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public int getBackupUrlCount() {
        return this.backupUrl_.size();
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public List<String> getBackupUrlList() {
        return this.backupUrl_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public long getLength() {
        return this.length_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public String getMd5() {
        return this.md5_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public ByteString getMd5Bytes() {
        return ByteString.copyFromUtf8(this.md5_);
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public int getOrder() {
        return this.order_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public long getSize() {
        return this.size_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.ResponseUrlOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(ResponseUrl responseUrl) {
        return DEFAULT_INSTANCE.createBuilder(responseUrl);
    }

    public static ResponseUrl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponseUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponseUrl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResponseUrl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResponseUrl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResponseUrl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResponseUrl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResponseUrl parseFrom(InputStream inputStream) throws IOException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResponseUrl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResponseUrl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResponseUrl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResponseUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
