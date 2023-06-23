package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class DashItem extends GeneratedMessageLite<DashItem, DashItem.Builder> implements DashItemOrBuilder {
    public static final int BACKUP_URL_FIELD_NUMBER = 3;
    public static final int BANDWIDTH_FIELD_NUMBER = 4;
    public static final int BASE_URL_FIELD_NUMBER = 2;
    public static final int CODECID_FIELD_NUMBER = 5;
    private static final DashItem DEFAULT_INSTANCE;
    public static final int FRAME_RATE_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MD5_FIELD_NUMBER = 6;
    private static volatile Parser<DashItem> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 7;
    public static final int WIDEVINE_PSSH_FIELD_NUMBER = 9;
    private int bandwidth_;
    private int codecid_;
    private int id_;
    private long size_;
    private String baseUrl_ = "";
    private Internal.ProtobufList<String> backupUrl_ = GeneratedMessageLite.emptyProtobufList();
    private String md5_ = "";
    private String frameRate_ = "";
    private String widevinePssh_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.DashItem$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78311 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17556xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17556xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17556xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17556xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17556xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17556xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17556xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17556xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DashItem, Builder> implements DashItemOrBuilder {
        /* synthetic */ Builder(C78311 c78311) {
            this();
        }

        public Builder addAllBackupUrl(Iterable<String> iterable) {
            copyOnWrite();
            ((DashItem) this.instance).addAllBackupUrl(iterable);
            return this;
        }

        public Builder addBackupUrl(String str) {
            copyOnWrite();
            ((DashItem) this.instance).addBackupUrl(str);
            return this;
        }

        public Builder addBackupUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((DashItem) this.instance).addBackupUrlBytes(byteString);
            return this;
        }

        public Builder clearBackupUrl() {
            copyOnWrite();
            ((DashItem) this.instance).clearBackupUrl();
            return this;
        }

        public Builder clearBandwidth() {
            copyOnWrite();
            ((DashItem) this.instance).clearBandwidth();
            return this;
        }

        public Builder clearBaseUrl() {
            copyOnWrite();
            ((DashItem) this.instance).clearBaseUrl();
            return this;
        }

        public Builder clearCodecid() {
            copyOnWrite();
            ((DashItem) this.instance).clearCodecid();
            return this;
        }

        public Builder clearFrameRate() {
            copyOnWrite();
            ((DashItem) this.instance).clearFrameRate();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((DashItem) this.instance).clearId();
            return this;
        }

        public Builder clearMd5() {
            copyOnWrite();
            ((DashItem) this.instance).clearMd5();
            return this;
        }

        public Builder clearSize() {
            copyOnWrite();
            ((DashItem) this.instance).clearSize();
            return this;
        }

        public Builder clearWidevinePssh() {
            copyOnWrite();
            ((DashItem) this.instance).clearWidevinePssh();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public String getBackupUrl(int i) {
            return ((DashItem) this.instance).getBackupUrl(i);
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public ByteString getBackupUrlBytes(int i) {
            return ((DashItem) this.instance).getBackupUrlBytes(i);
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public int getBackupUrlCount() {
            return ((DashItem) this.instance).getBackupUrlCount();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public List<String> getBackupUrlList() {
            return Collections.unmodifiableList(((DashItem) this.instance).getBackupUrlList());
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public int getBandwidth() {
            return ((DashItem) this.instance).getBandwidth();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public String getBaseUrl() {
            return ((DashItem) this.instance).getBaseUrl();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public ByteString getBaseUrlBytes() {
            return ((DashItem) this.instance).getBaseUrlBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public int getCodecid() {
            return ((DashItem) this.instance).getCodecid();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public String getFrameRate() {
            return ((DashItem) this.instance).getFrameRate();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public ByteString getFrameRateBytes() {
            return ((DashItem) this.instance).getFrameRateBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public int getId() {
            return ((DashItem) this.instance).getId();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public String getMd5() {
            return ((DashItem) this.instance).getMd5();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public ByteString getMd5Bytes() {
            return ((DashItem) this.instance).getMd5Bytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public long getSize() {
            return ((DashItem) this.instance).getSize();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public String getWidevinePssh() {
            return ((DashItem) this.instance).getWidevinePssh();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
        public ByteString getWidevinePsshBytes() {
            return ((DashItem) this.instance).getWidevinePsshBytes();
        }

        public Builder setBackupUrl(int i, String str) {
            copyOnWrite();
            ((DashItem) this.instance).setBackupUrl(i, str);
            return this;
        }

        public Builder setBandwidth(int i) {
            copyOnWrite();
            ((DashItem) this.instance).setBandwidth(i);
            return this;
        }

        public Builder setBaseUrl(String str) {
            copyOnWrite();
            ((DashItem) this.instance).setBaseUrl(str);
            return this;
        }

        public Builder setBaseUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((DashItem) this.instance).setBaseUrlBytes(byteString);
            return this;
        }

        public Builder setCodecid(int i) {
            copyOnWrite();
            ((DashItem) this.instance).setCodecid(i);
            return this;
        }

        public Builder setFrameRate(String str) {
            copyOnWrite();
            ((DashItem) this.instance).setFrameRate(str);
            return this;
        }

        public Builder setFrameRateBytes(ByteString byteString) {
            copyOnWrite();
            ((DashItem) this.instance).setFrameRateBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((DashItem) this.instance).setId(i);
            return this;
        }

        public Builder setMd5(String str) {
            copyOnWrite();
            ((DashItem) this.instance).setMd5(str);
            return this;
        }

        public Builder setMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((DashItem) this.instance).setMd5Bytes(byteString);
            return this;
        }

        public Builder setSize(long j) {
            copyOnWrite();
            ((DashItem) this.instance).setSize(j);
            return this;
        }

        public Builder setWidevinePssh(String str) {
            copyOnWrite();
            ((DashItem) this.instance).setWidevinePssh(str);
            return this;
        }

        public Builder setWidevinePsshBytes(ByteString byteString) {
            copyOnWrite();
            ((DashItem) this.instance).setWidevinePsshBytes(byteString);
            return this;
        }

        private Builder() {
            super(DashItem.DEFAULT_INSTANCE);
        }
    }

    static {
        DashItem dashItem = new DashItem();
        DEFAULT_INSTANCE = dashItem;
        GeneratedMessageLite.registerDefaultInstance(DashItem.class, dashItem);
    }

    private DashItem() {
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
    public void clearBandwidth() {
        this.bandwidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseUrl() {
        this.baseUrl_ = getDefaultInstance().getBaseUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodecid() {
        this.codecid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameRate() {
        this.frameRate_ = getDefaultInstance().getFrameRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMd5() {
        this.md5_ = getDefaultInstance().getMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidevinePssh() {
        this.widevinePssh_ = getDefaultInstance().getWidevinePssh();
    }

    private void ensureBackupUrlIsMutable() {
        Internal.ProtobufList<String> protobufList = this.backupUrl_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.backupUrl_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DashItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DashItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DashItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DashItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DashItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackupUrl(int i, String str) {
        str.getClass();
        ensureBackupUrlIsMutable();
        this.backupUrl_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBandwidth(int i) {
        this.bandwidth_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseUrl(String str) {
        str.getClass();
        this.baseUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.baseUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecid(int i) {
        this.codecid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameRate(String str) {
        str.getClass();
        this.frameRate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameRateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.frameRate_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidevinePssh(String str) {
        str.getClass();
        this.widevinePssh_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidevinePsshBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.widevinePssh_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78311.f17556xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DashItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\u000b\u0002\u0208\u0003\u021a\u0004\u000b\u0005\u000b\u0006\u0208\u0007\u0003\b\u0208\t\u0208", new Object[]{"id_", "baseUrl_", "backupUrl_", "bandwidth_", "codecid_", "md5_", "size_", "frameRate_", "widevinePssh_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DashItem> parser = PARSER;
                if (parser == null) {
                    synchronized (DashItem.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public String getBackupUrl(int i) {
        return this.backupUrl_.get(i);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public ByteString getBackupUrlBytes(int i) {
        return ByteString.copyFromUtf8(this.backupUrl_.get(i));
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public int getBackupUrlCount() {
        return this.backupUrl_.size();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public List<String> getBackupUrlList() {
        return this.backupUrl_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public int getBandwidth() {
        return this.bandwidth_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public String getBaseUrl() {
        return this.baseUrl_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public ByteString getBaseUrlBytes() {
        return ByteString.copyFromUtf8(this.baseUrl_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public int getCodecid() {
        return this.codecid_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public String getFrameRate() {
        return this.frameRate_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public ByteString getFrameRateBytes() {
        return ByteString.copyFromUtf8(this.frameRate_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public String getMd5() {
        return this.md5_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public ByteString getMd5Bytes() {
        return ByteString.copyFromUtf8(this.md5_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public long getSize() {
        return this.size_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public String getWidevinePssh() {
        return this.widevinePssh_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.DashItemOrBuilder
    public ByteString getWidevinePsshBytes() {
        return ByteString.copyFromUtf8(this.widevinePssh_);
    }

    public static Builder newBuilder(DashItem dashItem) {
        return DEFAULT_INSTANCE.createBuilder(dashItem);
    }

    public static DashItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DashItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DashItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DashItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DashItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DashItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DashItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DashItem parseFrom(InputStream inputStream) throws IOException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DashItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DashItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DashItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DashItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
