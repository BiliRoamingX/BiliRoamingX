package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class Lottery extends GeneratedMessageLite<Lottery, Lottery.C14738b> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 8;
    public static final int CTIME_FIELD_NUMBER = 7;
    private static final Lottery DEFAULT_INSTANCE;
    public static final int LOTTERY_ID_FIELD_NUMBER = 1;
    public static final int LOTTERY_MID_FIELD_NUMBER = 3;
    public static final int LOTTERY_STATUS_FIELD_NUMBER = 2;
    public static final int LOTTERY_TIME_FIELD_NUMBER = 4;
    public static final int MEMBER_FIELD_NUMBER = 9;
    public static final int OID_FIELD_NUMBER = 5;
    private static volatile Parser<Lottery> PARSER = null;
    public static final int REPLY_CONTROL_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 6;
    private Content content_;
    private long ctime_;
    private long lotteryId_;
    private long lotteryMid_;
    private long lotteryStatus_;
    private long lotteryTime_;
    private Member member_;
    private long oid_;
    private ReplyControl replyControl_;
    private long type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Lottery$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14737a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22001xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22001xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22001xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22001xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22001xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Lottery$b */
    /* loaded from: classes21.dex */
    public static final class C14738b extends GeneratedMessageLite.Builder<Lottery, C14738b> implements MessageLiteOrBuilder {
        /* synthetic */ C14738b(C14737a c14737a) {
            this();
        }

        public C14738b clearContent() {
            copyOnWrite();
            ((Lottery) this.instance).clearContent();
            return this;
        }

        public C14738b clearCtime() {
            copyOnWrite();
            ((Lottery) this.instance).clearCtime();
            return this;
        }

        public C14738b clearLotteryId() {
            copyOnWrite();
            ((Lottery) this.instance).clearLotteryId();
            return this;
        }

        public C14738b clearLotteryMid() {
            copyOnWrite();
            ((Lottery) this.instance).clearLotteryMid();
            return this;
        }

        public C14738b clearLotteryStatus() {
            copyOnWrite();
            ((Lottery) this.instance).clearLotteryStatus();
            return this;
        }

        public C14738b clearLotteryTime() {
            copyOnWrite();
            ((Lottery) this.instance).clearLotteryTime();
            return this;
        }

        public C14738b clearMember() {
            copyOnWrite();
            ((Lottery) this.instance).clearMember();
            return this;
        }

        public C14738b clearOid() {
            copyOnWrite();
            ((Lottery) this.instance).clearOid();
            return this;
        }

        public C14738b clearReplyControl() {
            copyOnWrite();
            ((Lottery) this.instance).clearReplyControl();
            return this;
        }

        public C14738b clearType() {
            copyOnWrite();
            ((Lottery) this.instance).clearType();
            return this;
        }

        public Content getContent() {
            return ((Lottery) this.instance).getContent();
        }

        public long getCtime() {
            return ((Lottery) this.instance).getCtime();
        }

        public long getLotteryId() {
            return ((Lottery) this.instance).getLotteryId();
        }

        public long getLotteryMid() {
            return ((Lottery) this.instance).getLotteryMid();
        }

        public long getLotteryStatus() {
            return ((Lottery) this.instance).getLotteryStatus();
        }

        public long getLotteryTime() {
            return ((Lottery) this.instance).getLotteryTime();
        }

        public Member getMember() {
            return ((Lottery) this.instance).getMember();
        }

        public long getOid() {
            return ((Lottery) this.instance).getOid();
        }

        public ReplyControl getReplyControl() {
            return ((Lottery) this.instance).getReplyControl();
        }

        public long getType() {
            return ((Lottery) this.instance).getType();
        }

        public boolean hasContent() {
            return ((Lottery) this.instance).hasContent();
        }

        public boolean hasMember() {
            return ((Lottery) this.instance).hasMember();
        }

        public boolean hasReplyControl() {
            return ((Lottery) this.instance).hasReplyControl();
        }

        public C14738b mergeContent(Content content) {
            copyOnWrite();
            ((Lottery) this.instance).mergeContent(content);
            return this;
        }

        public C14738b mergeMember(Member member) {
            copyOnWrite();
            ((Lottery) this.instance).mergeMember(member);
            return this;
        }

        public C14738b mergeReplyControl(ReplyControl replyControl) {
            copyOnWrite();
            ((Lottery) this.instance).mergeReplyControl(replyControl);
            return this;
        }

        public C14738b setContent(Content content) {
            copyOnWrite();
            ((Lottery) this.instance).setContent(content);
            return this;
        }

        public C14738b setCtime(long j) {
            copyOnWrite();
            ((Lottery) this.instance).setCtime(j);
            return this;
        }

        public C14738b setLotteryId(long j) {
            copyOnWrite();
            ((Lottery) this.instance).setLotteryId(j);
            return this;
        }

        public C14738b setLotteryMid(long j) {
            copyOnWrite();
            ((Lottery) this.instance).setLotteryMid(j);
            return this;
        }

        public C14738b setLotteryStatus(long j) {
            copyOnWrite();
            ((Lottery) this.instance).setLotteryStatus(j);
            return this;
        }

        public C14738b setLotteryTime(long j) {
            copyOnWrite();
            ((Lottery) this.instance).setLotteryTime(j);
            return this;
        }

        public C14738b setMember(Member member) {
            copyOnWrite();
            ((Lottery) this.instance).setMember(member);
            return this;
        }

        public C14738b setOid(long j) {
            copyOnWrite();
            ((Lottery) this.instance).setOid(j);
            return this;
        }

        public C14738b setReplyControl(ReplyControl replyControl) {
            copyOnWrite();
            ((Lottery) this.instance).setReplyControl(replyControl);
            return this;
        }

        public C14738b setType(long j) {
            copyOnWrite();
            ((Lottery) this.instance).setType(j);
            return this;
        }

        private C14738b() {
            super(Lottery.DEFAULT_INSTANCE);
        }

        public C14738b setContent(Content.C14691c c14691c) {
            copyOnWrite();
            ((Lottery) this.instance).setContent(c14691c.build());
            return this;
        }

        public C14738b setMember(Member.C14751b c14751b) {
            copyOnWrite();
            ((Lottery) this.instance).setMember(c14751b.build());
            return this;
        }

        public C14738b setReplyControl(ReplyControl.C14815b c14815b) {
            copyOnWrite();
            ((Lottery) this.instance).setReplyControl(c14815b.build());
            return this;
        }
    }

    static {
        Lottery lottery = new Lottery();
        DEFAULT_INSTANCE = lottery;
        GeneratedMessageLite.registerDefaultInstance(Lottery.class, lottery);
    }

    private Lottery() {
    }

    public void clearContent() {
        this.content_ = null;
    }

    public void clearCtime() {
        this.ctime_ = 0L;
    }

    public void clearLotteryId() {
        this.lotteryId_ = 0L;
    }

    public void clearLotteryMid() {
        this.lotteryMid_ = 0L;
    }

    public void clearLotteryStatus() {
        this.lotteryStatus_ = 0L;
    }

    public void clearLotteryTime() {
        this.lotteryTime_ = 0L;
    }

    public void clearMember() {
        this.member_ = null;
    }

    public void clearOid() {
        this.oid_ = 0L;
    }

    public void clearReplyControl() {
        this.replyControl_ = null;
    }

    public void clearType() {
        this.type_ = 0L;
    }

    public static Lottery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeContent(Content content) {
        content.getClass();
        Content content2 = this.content_;
        if (content2 != null && content2 != Content.getDefaultInstance()) {
            this.content_ = Content.newBuilder(this.content_).mergeFrom((Content) content).buildPartial();
        } else {
            this.content_ = content;
        }
    }

    public void mergeMember(Member member) {
        member.getClass();
        Member member2 = this.member_;
        if (member2 != null && member2 != Member.getDefaultInstance()) {
            this.member_ = Member.newBuilder(this.member_).mergeFrom((Member) member).buildPartial();
        } else {
            this.member_ = member;
        }
    }

    public void mergeReplyControl(ReplyControl replyControl) {
        replyControl.getClass();
        ReplyControl replyControl2 = this.replyControl_;
        if (replyControl2 != null && replyControl2 != ReplyControl.getDefaultInstance()) {
            this.replyControl_ = ReplyControl.newBuilder(this.replyControl_).mergeFrom((ReplyControl) replyControl).buildPartial();
        } else {
            this.replyControl_ = replyControl;
        }
    }

    public static C14738b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Lottery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Lottery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Lottery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Lottery> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setContent(Content content) {
        content.getClass();
        this.content_ = content;
    }

    public void setCtime(long j) {
        this.ctime_ = j;
    }

    public void setLotteryId(long j) {
        this.lotteryId_ = j;
    }

    public void setLotteryMid(long j) {
        this.lotteryMid_ = j;
    }

    public void setLotteryStatus(long j) {
        this.lotteryStatus_ = j;
    }

    public void setLotteryTime(long j) {
        this.lotteryTime_ = j;
    }

    public void setMember(Member member) {
        member.getClass();
        this.member_ = member;
    }

    public void setOid(long j) {
        this.oid_ = j;
    }

    public void setReplyControl(ReplyControl replyControl) {
        replyControl.getClass();
        this.replyControl_ = replyControl;
    }

    public void setType(long j) {
        this.type_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14737a.f22001xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Lottery();
            case 2:
                return new C14738b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\t\t\t\n\t", new Object[]{"lotteryId_", "lotteryStatus_", "lotteryMid_", "lotteryTime_", "oid_", "type_", "ctime_", "content_", "member_", "replyControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Lottery> parser = PARSER;
                if (parser == null) {
                    synchronized (Lottery.class) {
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

    public Content getContent() {
        Content content = this.content_;
        return content == null ? Content.getDefaultInstance() : content;
    }

    public long getCtime() {
        return this.ctime_;
    }

    public long getLotteryId() {
        return this.lotteryId_;
    }

    public long getLotteryMid() {
        return this.lotteryMid_;
    }

    public long getLotteryStatus() {
        return this.lotteryStatus_;
    }

    public long getLotteryTime() {
        return this.lotteryTime_;
    }

    public Member getMember() {
        Member member = this.member_;
        return member == null ? Member.getDefaultInstance() : member;
    }

    public long getOid() {
        return this.oid_;
    }

    public ReplyControl getReplyControl() {
        ReplyControl replyControl = this.replyControl_;
        return replyControl == null ? ReplyControl.getDefaultInstance() : replyControl;
    }

    public long getType() {
        return this.type_;
    }

    public boolean hasContent() {
        return this.content_ != null;
    }

    public boolean hasMember() {
        return this.member_ != null;
    }

    public boolean hasReplyControl() {
        return this.replyControl_ != null;
    }

    public static C14738b newBuilder(Lottery lottery) {
        return DEFAULT_INSTANCE.createBuilder(lottery);
    }

    public static Lottery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Lottery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Lottery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Lottery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Lottery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Lottery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Lottery parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Lottery parseFrom(InputStream inputStream) throws IOException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Lottery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Lottery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Lottery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Lottery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
