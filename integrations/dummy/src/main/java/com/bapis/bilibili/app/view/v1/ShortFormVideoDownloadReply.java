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
public final class ShortFormVideoDownloadReply extends GeneratedMessageLite<ShortFormVideoDownloadReply, ShortFormVideoDownloadReply.Builder> implements MessageLiteOrBuilder {
    public static final int BACKUP_DOWNLOAD_URL_FIELD_NUMBER = 5;
    private static final ShortFormVideoDownloadReply DEFAULT_INSTANCE;
    public static final int DOWNLOAD_URL_FIELD_NUMBER = 2;
    public static final int HAS_DOWNLOAD_URL_FIELD_NUMBER = 1;
    public static final int MD5_FIELD_NUMBER = 3;
    private static volatile Parser<ShortFormVideoDownloadReply> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    private boolean hasDownloadUrl_;
    private long size_;
    private String downloadUrl_ = "";
    private String md5_ = "";
    private String backupDownloadUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ShortFormVideoDownloadReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16820xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16820xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16820xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16820xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16820xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16820xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16820xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16820xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ShortFormVideoDownloadReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68611 c68611) {
            this();
        }

        public Builder clearBackupDownloadUrl() {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).clearBackupDownloadUrl();
            return this;
        }

        public Builder clearDownloadUrl() {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).clearDownloadUrl();
            return this;
        }

        public Builder clearHasDownloadUrl() {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).clearHasDownloadUrl();
            return this;
        }

        public Builder clearMd5() {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).clearMd5();
            return this;
        }

        public Builder clearSize() {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).clearSize();
            return this;
        }

        public String getBackupDownloadUrl() {
            return ((ShortFormVideoDownloadReply) this.instance).getBackupDownloadUrl();
        }

        public ByteString getBackupDownloadUrlBytes() {
            return ((ShortFormVideoDownloadReply) this.instance).getBackupDownloadUrlBytes();
        }

        public String getDownloadUrl() {
            return ((ShortFormVideoDownloadReply) this.instance).getDownloadUrl();
        }

        public ByteString getDownloadUrlBytes() {
            return ((ShortFormVideoDownloadReply) this.instance).getDownloadUrlBytes();
        }

        public boolean getHasDownloadUrl() {
            return ((ShortFormVideoDownloadReply) this.instance).getHasDownloadUrl();
        }

        public String getMd5() {
            return ((ShortFormVideoDownloadReply) this.instance).getMd5();
        }

        public ByteString getMd5Bytes() {
            return ((ShortFormVideoDownloadReply) this.instance).getMd5Bytes();
        }

        public long getSize() {
            return ((ShortFormVideoDownloadReply) this.instance).getSize();
        }

        public Builder setBackupDownloadUrl(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setBackupDownloadUrl(str);
            return this;
        }

        public Builder setBackupDownloadUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setBackupDownloadUrlBytes(byteString);
            return this;
        }

        public Builder setDownloadUrl(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setDownloadUrl(str);
            return this;
        }

        public Builder setDownloadUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setDownloadUrlBytes(byteString);
            return this;
        }

        public Builder setHasDownloadUrl(boolean z) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setHasDownloadUrl(z);
            return this;
        }

        public Builder setMd5(String str) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setMd5(str);
            return this;
        }

        public Builder setMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setMd5Bytes(byteString);
            return this;
        }

        public Builder setSize(long j) {
            copyOnWrite();
            ((ShortFormVideoDownloadReply) this.instance).setSize(j);
            return this;
        }

        private Builder() {
            super(ShortFormVideoDownloadReply.DEFAULT_INSTANCE);
        }
    }

    static {
        ShortFormVideoDownloadReply shortFormVideoDownloadReply = new ShortFormVideoDownloadReply();
        DEFAULT_INSTANCE = shortFormVideoDownloadReply;
        GeneratedMessageLite.registerDefaultInstance(ShortFormVideoDownloadReply.class, shortFormVideoDownloadReply);
    }

    private ShortFormVideoDownloadReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackupDownloadUrl() {
        this.backupDownloadUrl_ = getDefaultInstance().getBackupDownloadUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadUrl() {
        this.downloadUrl_ = getDefaultInstance().getDownloadUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasDownloadUrl() {
        this.hasDownloadUrl_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMd5() {
        this.md5_ = getDefaultInstance().getMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    public static ShortFormVideoDownloadReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ShortFormVideoDownloadReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShortFormVideoDownloadReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ShortFormVideoDownloadReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackupDownloadUrl(String str) {
        str.getClass();
        this.backupDownloadUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackupDownloadUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.backupDownloadUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadUrl(String str) {
        str.getClass();
        this.downloadUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.downloadUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasDownloadUrl(boolean z) {
        this.hasDownloadUrl_ = z;
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
    public void setSize(long j) {
        this.size_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68611.f16820xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ShortFormVideoDownloadReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0208\u0003\u0208\u0004\u0003\u0005\u0208", new Object[]{"hasDownloadUrl_", "downloadUrl_", "md5_", "size_", "backupDownloadUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ShortFormVideoDownloadReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ShortFormVideoDownloadReply.class) {
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

    public String getBackupDownloadUrl() {
        return this.backupDownloadUrl_;
    }

    public ByteString getBackupDownloadUrlBytes() {
        return ByteString.copyFromUtf8(this.backupDownloadUrl_);
    }

    public String getDownloadUrl() {
        return this.downloadUrl_;
    }

    public ByteString getDownloadUrlBytes() {
        return ByteString.copyFromUtf8(this.downloadUrl_);
    }

    public boolean getHasDownloadUrl() {
        return this.hasDownloadUrl_;
    }

    public String getMd5() {
        return this.md5_;
    }

    public ByteString getMd5Bytes() {
        return ByteString.copyFromUtf8(this.md5_);
    }

    public long getSize() {
        return this.size_;
    }

    public static Builder newBuilder(ShortFormVideoDownloadReply shortFormVideoDownloadReply) {
        return DEFAULT_INSTANCE.createBuilder(shortFormVideoDownloadReply);
    }

    public static ShortFormVideoDownloadReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ShortFormVideoDownloadReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShortFormVideoDownloadReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReply parseFrom(InputStream inputStream) throws IOException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShortFormVideoDownloadReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ShortFormVideoDownloadReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ShortFormVideoDownloadReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShortFormVideoDownloadReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
