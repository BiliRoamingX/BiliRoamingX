package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.Stat;
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
public final class Arc extends GeneratedMessageLite<Arc, Arc.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 5;
    public static final int CID_FIELD_NUMBER = 2;
    public static final int COPYRIGHT_FIELD_NUMBER = 6;
    public static final int COVER_FIELD_NUMBER = 8;
    private static final Arc DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile Parser<Arc> PARSER = null;
    public static final int RIGHT_FIELD_NUMBER = 7;
    public static final int STAT_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 10;
    public static final int TYPE_ID_FIELD_NUMBER = 9;
    private long aid_;
    private long cid_;
    private int copyright_;
    private long duration_;
    private Rights right_;
    private Stat stat_;
    private long typeId_;
    private String bvid_ = "";
    private String cover_ = "";
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Arc$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71121 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17088xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17088xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17088xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17088xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17088xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17088xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17088xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17088xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Arc, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71121 c71121) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((Arc) this.instance).clearAid();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((Arc) this.instance).clearBvid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((Arc) this.instance).clearCid();
            return this;
        }

        public Builder clearCopyright() {
            copyOnWrite();
            ((Arc) this.instance).clearCopyright();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Arc) this.instance).clearCover();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((Arc) this.instance).clearDuration();
            return this;
        }

        public Builder clearRight() {
            copyOnWrite();
            ((Arc) this.instance).clearRight();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((Arc) this.instance).clearStat();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Arc) this.instance).clearTitle();
            return this;
        }

        public Builder clearTypeId() {
            copyOnWrite();
            ((Arc) this.instance).clearTypeId();
            return this;
        }

        public long getAid() {
            return ((Arc) this.instance).getAid();
        }

        public String getBvid() {
            return ((Arc) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((Arc) this.instance).getBvidBytes();
        }

        public long getCid() {
            return ((Arc) this.instance).getCid();
        }

        public int getCopyright() {
            return ((Arc) this.instance).getCopyright();
        }

        public String getCover() {
            return ((Arc) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((Arc) this.instance).getCoverBytes();
        }

        public long getDuration() {
            return ((Arc) this.instance).getDuration();
        }

        public Rights getRight() {
            return ((Arc) this.instance).getRight();
        }

        public Stat getStat() {
            return ((Arc) this.instance).getStat();
        }

        public String getTitle() {
            return ((Arc) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Arc) this.instance).getTitleBytes();
        }

        public long getTypeId() {
            return ((Arc) this.instance).getTypeId();
        }

        public boolean hasRight() {
            return ((Arc) this.instance).hasRight();
        }

        public boolean hasStat() {
            return ((Arc) this.instance).hasStat();
        }

        public Builder mergeRight(Rights rights) {
            copyOnWrite();
            ((Arc) this.instance).mergeRight(rights);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((Arc) this.instance).mergeStat(stat);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((Arc) this.instance).setAid(j);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((Arc) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((Arc) this.instance).setCid(j);
            return this;
        }

        public Builder setCopyright(int i) {
            copyOnWrite();
            ((Arc) this.instance).setCopyright(i);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Arc) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((Arc) this.instance).setDuration(j);
            return this;
        }

        public Builder setRight(Rights rights) {
            copyOnWrite();
            ((Arc) this.instance).setRight(rights);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((Arc) this.instance).setStat(stat);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Arc) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Arc) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTypeId(long j) {
            copyOnWrite();
            ((Arc) this.instance).setTypeId(j);
            return this;
        }

        private Builder() {
            super(Arc.DEFAULT_INSTANCE);
        }

        public Builder setRight(Rights.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setRight(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((Arc) this.instance).setStat(builder.build());
            return this;
        }
    }

    static {
        Arc arc = new Arc();
        DEFAULT_INSTANCE = arc;
        GeneratedMessageLite.registerDefaultInstance(Arc.class, arc);
    }

    private Arc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyright() {
        this.copyright_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRight() {
        this.right_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeId() {
        this.typeId_ = 0L;
    }

    public static Arc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRight(Rights rights) {
        rights.getClass();
        Rights rights2 = this.right_;
        if (rights2 != null && rights2 != Rights.getDefaultInstance()) {
            this.right_ = Rights.newBuilder(this.right_).mergeFrom((Rights) rights).buildPartial();
        } else {
            this.right_ = rights;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStat(Stat stat) {
        stat.getClass();
        Stat stat2 = this.stat_;
        if (stat2 != null && stat2 != Stat.getDefaultInstance()) {
            this.stat_ = Stat.newBuilder(this.stat_).mergeFrom((Stat) stat).buildPartial();
        } else {
            this.stat_ = stat;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Arc parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Arc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Arc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Arc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyright(int i) {
        this.copyright_ = i;
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
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRight(Rights rights) {
        rights.getClass();
        this.right_ = rights;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeId(long j) {
        this.typeId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71121.f17088xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Arc();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\t\u0005\u0208\u0006\u0004\u0007\t\b\u0208\t\u0002\n\u0208", new Object[]{"aid_", "cid_", "duration_", "stat_", "bvid_", "copyright_", "right_", "cover_", "typeId_", "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Arc> parser = PARSER;
                if (parser == null) {
                    synchronized (Arc.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public long getCid() {
        return this.cid_;
    }

    public int getCopyright() {
        return this.copyright_;
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public long getDuration() {
        return this.duration_;
    }

    public Rights getRight() {
        Rights rights = this.right_;
        return rights == null ? Rights.getDefaultInstance() : rights;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public long getTypeId() {
        return this.typeId_;
    }

    public boolean hasRight() {
        return this.right_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public static Builder newBuilder(Arc arc) {
        return DEFAULT_INSTANCE.createBuilder(arc);
    }

    public static Arc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Arc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Arc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Arc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Arc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Arc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Arc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Arc parseFrom(InputStream inputStream) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Arc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Arc parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Arc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Arc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
