package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.Any;
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
public final class RelateCMCard extends GeneratedMessageLite<RelateCMCard, RelateCMCard.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    private static final RelateCMCard DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile Parser<RelateCMCard> PARSER = null;
    public static final int SOURCE_CONTENT_FIELD_NUMBER = 2;
    public static final int STAT_FIELD_NUMBER = 4;
    private long aid_;
    private long duration_;
    private Any sourceContent_;
    private Stat stat_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateCMCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70391 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17020xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17020xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17020xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17020xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17020xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17020xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17020xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17020xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateCMCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70391 c70391) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((RelateCMCard) this.instance).clearAid();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((RelateCMCard) this.instance).clearDuration();
            return this;
        }

        public Builder clearSourceContent() {
            copyOnWrite();
            ((RelateCMCard) this.instance).clearSourceContent();
            return this;
        }

        public Builder clearStat() {
            copyOnWrite();
            ((RelateCMCard) this.instance).clearStat();
            return this;
        }

        public long getAid() {
            return ((RelateCMCard) this.instance).getAid();
        }

        public long getDuration() {
            return ((RelateCMCard) this.instance).getDuration();
        }

        public Any getSourceContent() {
            return ((RelateCMCard) this.instance).getSourceContent();
        }

        public Stat getStat() {
            return ((RelateCMCard) this.instance).getStat();
        }

        public boolean hasSourceContent() {
            return ((RelateCMCard) this.instance).hasSourceContent();
        }

        public boolean hasStat() {
            return ((RelateCMCard) this.instance).hasStat();
        }

        public Builder mergeSourceContent(Any any) {
            copyOnWrite();
            ((RelateCMCard) this.instance).mergeSourceContent(any);
            return this;
        }

        public Builder mergeStat(Stat stat) {
            copyOnWrite();
            ((RelateCMCard) this.instance).mergeStat(stat);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((RelateCMCard) this.instance).setAid(j);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((RelateCMCard) this.instance).setDuration(j);
            return this;
        }

        public Builder setSourceContent(Any any) {
            copyOnWrite();
            ((RelateCMCard) this.instance).setSourceContent(any);
            return this;
        }

        public Builder setStat(Stat stat) {
            copyOnWrite();
            ((RelateCMCard) this.instance).setStat(stat);
            return this;
        }

        private Builder() {
            super(RelateCMCard.DEFAULT_INSTANCE);
        }

        public Builder setSourceContent(Any.Builder builder) {
            copyOnWrite();
            ((RelateCMCard) this.instance).setSourceContent(builder.build());
            return this;
        }

        public Builder setStat(Stat.Builder builder) {
            copyOnWrite();
            ((RelateCMCard) this.instance).setStat(builder.build());
            return this;
        }
    }

    static {
        RelateCMCard relateCMCard = new RelateCMCard();
        DEFAULT_INSTANCE = relateCMCard;
        GeneratedMessageLite.registerDefaultInstance(RelateCMCard.class, relateCMCard);
    }

    private RelateCMCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContent() {
        this.sourceContent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    public static RelateCMCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContent(Any any) {
        any.getClass();
        Any any2 = this.sourceContent_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.sourceContent_ = Any.newBuilder(this.sourceContent_).mergeFrom((Any) any).buildPartial();
        } else {
            this.sourceContent_ = any;
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

    public static RelateCMCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateCMCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateCMCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateCMCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContent(Any any) {
        any.getClass();
        this.sourceContent_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70391.f17020xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateCMCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\t\u0003\u0002\u0004\t", new Object[]{"aid_", "sourceContent_", "duration_", "stat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateCMCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateCMCard.class) {
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

    public long getDuration() {
        return this.duration_;
    }

    public Any getSourceContent() {
        Any any = this.sourceContent_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public boolean hasSourceContent() {
        return this.sourceContent_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public static Builder newBuilder(RelateCMCard relateCMCard) {
        return DEFAULT_INSTANCE.createBuilder(relateCMCard);
    }

    public static RelateCMCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateCMCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateCMCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateCMCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateCMCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateCMCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateCMCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateCMCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateCMCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateCMCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateCMCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateCMCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
