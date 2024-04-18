package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Author;
import com.bapis.bilibili.app.archive.v1.Stat;
import com.bapis.bilibili.app.view.v1.ArchiveStat;
import com.bapis.bilibili.app.view.v1.CM;
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
public final class CmIpad extends GeneratedMessageLite<CmIpad, CmIpad.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 5;
    public static final int AUTHOR_FIELD_NUMBER = 2;
    public static final int CM_FIELD_NUMBER = 1;
    private static final CmIpad DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    private static volatile Parser<CmIpad> PARSER = null;
    public static final int STAT_FIELD_NUMBER = 3;
    public static final int STAT_V2_FIELD_NUMBER = 6;
    private long aid_;
    private Author author_;
    private CM cm_;
    private long duration_;
    private ArchiveStat statV2_;
    private Stat stat_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CmIpad$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67391 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16713xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16713xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16713xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16713xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16713xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16713xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16713xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16713xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CmIpad, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67391 c67391) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((CmIpad) this.instance).clearAid();
            return this;
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((CmIpad) this.instance).clearAuthor();
            return this;
        }

        public Builder clearCm() {
            copyOnWrite();
            ((CmIpad) this.instance).clearCm();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((CmIpad) this.instance).clearDuration();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((CmIpad) this.instance).clearStat();
            return this;
        }

        public Builder clearStatV2() {
            copyOnWrite();
            ((CmIpad) this.instance).clearStatV2();
            return this;
        }

        public long getAid() {
            return ((CmIpad) this.instance).getAid();
        }

        public Author getAuthor() {
            return ((CmIpad) this.instance).getAuthor();
        }

        public CM getCm() {
            return ((CmIpad) this.instance).getCm();
        }

        public long getDuration() {
            return ((CmIpad) this.instance).getDuration();
        }

        public Stat getStat() {
            return ((CmIpad) this.instance).getStat();
        }

        public ArchiveStat getStatV2() {
            return ((CmIpad) this.instance).getStatV2();
        }

        public boolean hasAuthor() {
            return ((CmIpad) this.instance).hasAuthor();
        }

        public boolean hasCm() {
            return ((CmIpad) this.instance).hasCm();
        }

        public boolean hasStat() {
            return ((CmIpad) this.instance).hasStat();
        }

        public boolean hasStatV2() {
            return ((CmIpad) this.instance).hasStatV2();
        }

        public Builder mergeAuthor(Author author) {
            copyOnWrite();
            ((CmIpad) this.instance).mergeAuthor(author);
            return this;
        }

        public Builder mergeCm(CM cm) {
            copyOnWrite();
            ((CmIpad) this.instance).mergeCm(cm);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((CmIpad) this.instance).mergeStat(stat);
            return this;
        }

        public Builder mergeStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((CmIpad) this.instance).mergeStatV2(archiveStat);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((CmIpad) this.instance).setAid(j);
            return this;
        }

        public Builder setAuthor(Author author) {
            copyOnWrite();
            ((CmIpad) this.instance).setAuthor(author);
            return this;
        }

        public Builder setCm(CM cm) {
            copyOnWrite();
            ((CmIpad) this.instance).setCm(cm);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((CmIpad) this.instance).setDuration(j);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((CmIpad) this.instance).setStat(stat);
            return this;
        }

        public Builder setStatV2(ArchiveStat archiveStat) {
            copyOnWrite();
            ((CmIpad) this.instance).setStatV2(archiveStat);
            return this;
        }

        private Builder() {
            super(CmIpad.DEFAULT_INSTANCE);
        }

        public Builder setAuthor(Author.Builder builder) {
            copyOnWrite();
            ((CmIpad) this.instance).setAuthor(builder.build());
            return this;
        }

        public Builder setCm(CM.Builder builder) {
            copyOnWrite();
            ((CmIpad) this.instance).setCm(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((CmIpad) this.instance).setStat(builder.build());
            return this;
        }

        public Builder setStatV2(ArchiveStat.Builder builder) {
            copyOnWrite();
            ((CmIpad) this.instance).setStatV2(builder.build());
            return this;
        }
    }

    static {
        CmIpad cmIpad = new CmIpad();
        DEFAULT_INSTANCE = cmIpad;
        GeneratedMessageLite.registerDefaultInstance(CmIpad.class, cmIpad);
    }

    private CmIpad() {
    }

    public void clearAid() {
        this.aid_ = 0L;
    }

    public void clearAuthor() {
        this.author_ = null;
    }

    public void clearCm() {
        this.cm_ = null;
    }

    public void clearDuration() {
        this.duration_ = 0L;
    }

    public void clearStat() {
        this.stat_ = null;
    }

    public void clearStatV2() {
        this.statV2_ = null;
    }

    public static CmIpad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAuthor(Author author) {
    }

    public void mergeCm(CM cm) {
    }

    public void mergeStat(Stat stat) {
    }

    public void mergeStatV2(ArchiveStat archiveStat) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CmIpad parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CmIpad) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CmIpad parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CmIpad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAid(long j) {
        this.aid_ = j;
    }

    public void setAuthor(Author author) {
        author.getClass();
        this.author_ = author;
    }

    public void setCm(CM cm) {
        cm.getClass();
        this.cm_ = cm;
    }

    public void setDuration(long j) {
        this.duration_ = j;
    }

    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    public void setStatV2(ArchiveStat archiveStat) {
        archiveStat.getClass();
        this.statV2_ = archiveStat;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67391.f16713xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CmIpad();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\u0002\u0005\u0002\u0006\t", new Object[]{"cm_", "author_", "stat_", "duration_", "aid_", "statV2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CmIpad> parser = PARSER;
                if (parser == null) {
                    synchronized (CmIpad.class) {
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

    public Author getAuthor() {
        Author author = this.author_;
        return author == null ? Author.getDefaultInstance() : author;
    }

    public CM getCm() {
        CM cm = this.cm_;
        return cm == null ? CM.getDefaultInstance() : cm;
    }

    public long getDuration() {
        return this.duration_;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public ArchiveStat getStatV2() {
        ArchiveStat archiveStat = this.statV2_;
        return archiveStat == null ? ArchiveStat.getDefaultInstance() : archiveStat;
    }

    public boolean hasAuthor() {
        return this.author_ != null;
    }

    public boolean hasCm() {
        return this.cm_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public boolean hasStatV2() {
        return this.statV2_ != null;
    }

    public static Builder newBuilder(CmIpad cmIpad) {
        return DEFAULT_INSTANCE.createBuilder(cmIpad);
    }

    public static CmIpad parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CmIpad) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CmIpad parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CmIpad parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CmIpad parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CmIpad parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CmIpad parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CmIpad parseFrom(InputStream inputStream) throws IOException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CmIpad parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CmIpad parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CmIpad parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CmIpad) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
