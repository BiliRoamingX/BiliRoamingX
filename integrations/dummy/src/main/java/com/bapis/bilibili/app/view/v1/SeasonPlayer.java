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
public final class SeasonPlayer extends GeneratedMessageLite<SeasonPlayer, SeasonPlayer.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 3;
    private static final SeasonPlayer DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 4;
    private static volatile Parser<SeasonPlayer> PARSER = null;
    public static final int VID_FIELD_NUMBER = 2;
    private long aid_;
    private long cid_;
    private String vid_ = "";
    private String from_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SeasonPlayer$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68531 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16813xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16813xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16813xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16813xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16813xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16813xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16813xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16813xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonPlayer, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68531 c68531) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((SeasonPlayer) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((SeasonPlayer) this.instance).clearCid();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((SeasonPlayer) this.instance).clearFrom();
            return this;
        }

        public Builder clearVid() {
            copyOnWrite();
            ((SeasonPlayer) this.instance).clearVid();
            return this;
        }

        public long getAid() {
            return ((SeasonPlayer) this.instance).getAid();
        }

        public long getCid() {
            return ((SeasonPlayer) this.instance).getCid();
        }

        public String getFrom() {
            return ((SeasonPlayer) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((SeasonPlayer) this.instance).getFromBytes();
        }

        public String getVid() {
            return ((SeasonPlayer) this.instance).getVid();
        }

        public ByteString getVidBytes() {
            return ((SeasonPlayer) this.instance).getVidBytes();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((SeasonPlayer) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((SeasonPlayer) this.instance).setCid(j);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((SeasonPlayer) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonPlayer) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setVid(String str) {
            copyOnWrite();
            ((SeasonPlayer) this.instance).setVid(str);
            return this;
        }

        public Builder setVidBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonPlayer) this.instance).setVidBytes(byteString);
            return this;
        }

        private Builder() {
            super(SeasonPlayer.DEFAULT_INSTANCE);
        }
    }

    static {
        SeasonPlayer seasonPlayer = new SeasonPlayer();
        DEFAULT_INSTANCE = seasonPlayer;
        GeneratedMessageLite.registerDefaultInstance(SeasonPlayer.class, seasonPlayer);
    }

    private SeasonPlayer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVid() {
        this.vid_ = getDefaultInstance().getVid();
    }

    public static SeasonPlayer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonPlayer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonPlayer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonPlayer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVid(String str) {
        str.getClass();
        this.vid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68531.f16813xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonPlayer();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u0208", new Object[]{"aid_", "vid_", "cid_", "from_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonPlayer> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonPlayer.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public String getVid() {
        return this.vid_;
    }

    public ByteString getVidBytes() {
        return ByteString.copyFromUtf8(this.vid_);
    }

    public static Builder newBuilder(SeasonPlayer seasonPlayer) {
        return DEFAULT_INSTANCE.createBuilder(seasonPlayer);
    }

    public static SeasonPlayer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonPlayer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonPlayer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonPlayer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonPlayer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonPlayer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonPlayer parseFrom(InputStream inputStream) throws IOException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonPlayer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonPlayer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonPlayer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
