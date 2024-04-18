package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class ReplyInfo extends GeneratedMessageLite<ReplyInfo, ReplyInfo.C14819b> implements InterfaceC14927i {
    public static final int CONTENT_FIELD_NUMBER = 12;
    public static final int COUNT_FIELD_NUMBER = 11;
    public static final int CTIME_FIELD_NUMBER = 10;
    private static final ReplyInfo DEFAULT_INSTANCE;
    public static final int DIALOG_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int LIKE_FIELD_NUMBER = 9;
    public static final int MEMBER_FIELD_NUMBER = 13;
    public static final int MEMBER_V2_FIELD_NUMBER = 15;
    public static final int MID_FIELD_NUMBER = 5;
    public static final int OID_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 7;
    private static volatile Parser<ReplyInfo> PARSER = null;
    public static final int REPLIES_FIELD_NUMBER = 1;
    public static final int REPLY_CONTROL_FIELD_NUMBER = 14;
    public static final int ROOT_FIELD_NUMBER = 6;
    public static final int TRACK_INFO_FIELD_NUMBER = 16;
    public static final int TYPE_FIELD_NUMBER = 4;
    private Content content_;
    private long count_;
    private long ctime_;
    private long dialog_;
    private long id_;
    private long like_;
    private MemberV2 memberV2_;
    private Member member_;
    private long mid_;
    private long oid_;
    private long parent_;
    private ReplyControl replyControl_;
    private long root_;
    private long type_;
    private Internal.ProtobufList<ReplyInfo> replies_ = GeneratedMessageLite.emptyProtobufList();
    private String trackInfo_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyInfo$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14818a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22021xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22021xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22021xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22021xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22021xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22021xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22021xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22021xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyInfo$b */
    /* loaded from: classes21.dex */
    public static final class C14819b extends GeneratedMessageLite.Builder<ReplyInfo, C14819b> implements InterfaceC14927i {
        /* synthetic */ C14819b(C14818a c14818a) {
            this();
        }

        public C14819b addAllReplies(Iterable<? extends ReplyInfo> iterable) {
            copyOnWrite();
            ((ReplyInfo) this.instance).addAllReplies(iterable);
            return this;
        }

        public C14819b addReplies(ReplyInfo replyInfo) {
            copyOnWrite();
            ((ReplyInfo) this.instance).addReplies(replyInfo);
            return this;
        }

        public C14819b clearContent() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearContent();
            return this;
        }

        public C14819b clearCount() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearCount();
            return this;
        }

        public C14819b clearCtime() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearCtime();
            return this;
        }

        public C14819b clearDialog() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearDialog();
            return this;
        }

        public C14819b clearId() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearId();
            return this;
        }

        public C14819b clearLike() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearLike();
            return this;
        }

        public C14819b clearMember() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearMember();
            return this;
        }

        public C14819b clearMemberV2() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearMemberV2();
            return this;
        }

        public C14819b clearMid() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearMid();
            return this;
        }

        public C14819b clearOid() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearOid();
            return this;
        }

        public C14819b clearParent() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearParent();
            return this;
        }

        public C14819b clearReplies() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearReplies();
            return this;
        }

        public C14819b clearReplyControl() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearReplyControl();
            return this;
        }

        public C14819b clearRoot() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearRoot();
            return this;
        }

        public C14819b clearTrackInfo() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearTrackInfo();
            return this;
        }

        public C14819b clearType() {
            copyOnWrite();
            ((ReplyInfo) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public Content getContent() {
            return ((ReplyInfo) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getCount() {
            return ((ReplyInfo) this.instance).getCount();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getCtime() {
            return ((ReplyInfo) this.instance).getCtime();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getDialog() {
            return ((ReplyInfo) this.instance).getDialog();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getId() {
            return ((ReplyInfo) this.instance).getId();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getLike() {
            return ((ReplyInfo) this.instance).getLike();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public Member getMember() {
            return ((ReplyInfo) this.instance).getMember();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public MemberV2 getMemberV2() {
            return ((ReplyInfo) this.instance).getMemberV2();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getMid() {
            return ((ReplyInfo) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getOid() {
            return ((ReplyInfo) this.instance).getOid();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getParent() {
            return ((ReplyInfo) this.instance).getParent();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public ReplyInfo getReplies(int i) {
            return ((ReplyInfo) this.instance).getReplies(i);
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public int getRepliesCount() {
            return ((ReplyInfo) this.instance).getRepliesCount();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public List<ReplyInfo> getRepliesList() {
            return Collections.unmodifiableList(((ReplyInfo) this.instance).getRepliesList());
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public ReplyControl getReplyControl() {
            return ((ReplyInfo) this.instance).getReplyControl();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getRoot() {
            return ((ReplyInfo) this.instance).getRoot();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public String getTrackInfo() {
            return ((ReplyInfo) this.instance).getTrackInfo();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public ByteString getTrackInfoBytes() {
            return ((ReplyInfo) this.instance).getTrackInfoBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public long getType() {
            return ((ReplyInfo) this.instance).getType();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public boolean hasContent() {
            return ((ReplyInfo) this.instance).hasContent();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public boolean hasMember() {
            return ((ReplyInfo) this.instance).hasMember();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public boolean hasMemberV2() {
            return ((ReplyInfo) this.instance).hasMemberV2();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
        public boolean hasReplyControl() {
            return ((ReplyInfo) this.instance).hasReplyControl();
        }

        public C14819b mergeContent(Content content) {
            copyOnWrite();
            ((ReplyInfo) this.instance).mergeContent(content);
            return this;
        }

        public C14819b mergeMember(Member member) {
            copyOnWrite();
            ((ReplyInfo) this.instance).mergeMember(member);
            return this;
        }

        public C14819b mergeMemberV2(MemberV2 memberV2) {
            copyOnWrite();
            ((ReplyInfo) this.instance).mergeMemberV2(memberV2);
            return this;
        }

        public C14819b mergeReplyControl(ReplyControl replyControl) {
            copyOnWrite();
            ((ReplyInfo) this.instance).mergeReplyControl(replyControl);
            return this;
        }

        public C14819b removeReplies(int i) {
            copyOnWrite();
            ((ReplyInfo) this.instance).removeReplies(i);
            return this;
        }

        public C14819b setContent(Content content) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setContent(content);
            return this;
        }

        public C14819b setCount(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setCount(j);
            return this;
        }

        public C14819b setCtime(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setCtime(j);
            return this;
        }

        public C14819b setDialog(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setDialog(j);
            return this;
        }

        public C14819b setId(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setId(j);
            return this;
        }

        public C14819b setLike(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setLike(j);
            return this;
        }

        public C14819b setMember(Member member) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setMember(member);
            return this;
        }

        public C14819b setMemberV2(MemberV2 memberV2) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setMemberV2(memberV2);
            return this;
        }

        public C14819b setMid(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setMid(j);
            return this;
        }

        public C14819b setOid(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setOid(j);
            return this;
        }

        public C14819b setParent(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setParent(j);
            return this;
        }

        public C14819b setReplies(int i, ReplyInfo replyInfo) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setReplies(i, replyInfo);
            return this;
        }

        public C14819b setReplyControl(ReplyControl replyControl) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setReplyControl(replyControl);
            return this;
        }

        public C14819b setRoot(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setRoot(j);
            return this;
        }

        public C14819b setTrackInfo(String str) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setTrackInfo(str);
            return this;
        }

        public C14819b setTrackInfoBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setTrackInfoBytes(byteString);
            return this;
        }

        public C14819b setType(long j) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setType(j);
            return this;
        }

        private C14819b() {
            super(ReplyInfo.DEFAULT_INSTANCE);
        }

        public C14819b addReplies(int i, ReplyInfo replyInfo) {
            copyOnWrite();
            ((ReplyInfo) this.instance).addReplies(i, replyInfo);
            return this;
        }

        public C14819b setContent(Content.C14691c c14691c) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setContent(c14691c.build());
            return this;
        }

        public C14819b setMember(Member.C14751b c14751b) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setMember(c14751b.build());
            return this;
        }

        public C14819b setMemberV2(MemberV2.C14769b c14769b) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setMemberV2(c14769b.build());
            return this;
        }

        public C14819b setReplies(int i, C14819b c14819b) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setReplies(i, c14819b.build());
            return this;
        }

        public C14819b setReplyControl(ReplyControl.C14815b c14815b) {
            copyOnWrite();
            ((ReplyInfo) this.instance).setReplyControl(c14815b.build());
            return this;
        }

        public C14819b addReplies(C14819b c14819b) {
            copyOnWrite();
            ((ReplyInfo) this.instance).addReplies(c14819b.build());
            return this;
        }

        public C14819b addReplies(int i, C14819b c14819b) {
            copyOnWrite();
            ((ReplyInfo) this.instance).addReplies(i, c14819b.build());
            return this;
        }
    }

    static {
        ReplyInfo replyInfo = new ReplyInfo();
        DEFAULT_INSTANCE = replyInfo;
        GeneratedMessageLite.registerDefaultInstance(ReplyInfo.class, replyInfo);
    }

    private ReplyInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReplies(Iterable<? extends ReplyInfo> iterable) {
        ensureRepliesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.replies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReplies(ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureRepliesIsMutable();
        this.replies_.add(replyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtime() {
        this.ctime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDialog() {
        this.dialog_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLike() {
        this.like_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMember() {
        this.member_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberV2() {
        this.memberV2_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplies() {
        this.replies_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplyControl() {
        this.replyControl_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackInfo() {
        this.trackInfo_ = getDefaultInstance().getTrackInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0L;
    }

    private void ensureRepliesIsMutable() {
        Internal.ProtobufList<ReplyInfo> protobufList = this.replies_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.replies_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ReplyInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(Content content) {
        content.getClass();
        Content content2 = this.content_;
        if (content2 != null && content2 != Content.getDefaultInstance()) {
            this.content_ = Content.newBuilder(this.content_).mergeFrom((Content) content).buildPartial();
        } else {
            this.content_ = content;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMember(Member member) {
        member.getClass();
        Member member2 = this.member_;
        if (member2 != null && member2 != Member.getDefaultInstance()) {
            this.member_ = Member.newBuilder(this.member_).mergeFrom((Member) member).buildPartial();
        } else {
            this.member_ = member;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMemberV2(MemberV2 memberV2) {
        memberV2.getClass();
        MemberV2 memberV22 = this.memberV2_;
        if (memberV22 != null && memberV22 != MemberV2.getDefaultInstance()) {
            this.memberV2_ = MemberV2.newBuilder(this.memberV2_).mergeFrom((MemberV2) memberV2).buildPartial();
        } else {
            this.memberV2_ = memberV2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReplyControl(ReplyControl replyControl) {
        replyControl.getClass();
        ReplyControl replyControl2 = this.replyControl_;
        if (replyControl2 != null && replyControl2 != ReplyControl.getDefaultInstance()) {
            this.replyControl_ = ReplyControl.newBuilder(this.replyControl_).mergeFrom((ReplyControl) replyControl).buildPartial();
        } else {
            this.replyControl_ = replyControl;
        }
    }

    public static C14819b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReplyInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReplyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReplyInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReplies(int i) {
        ensureRepliesIsMutable();
        this.replies_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(Content content) {
        content.getClass();
        this.content_ = content;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtime(long j) {
        this.ctime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDialog(long j) {
        this.dialog_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLike(long j) {
        this.like_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMember(Member member) {
        member.getClass();
        this.member_ = member;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberV2(MemberV2 memberV2) {
        memberV2.getClass();
        this.memberV2_ = memberV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(long j) {
        this.parent_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplies(int i, ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureRepliesIsMutable();
        this.replies_.set(i, replyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyControl(ReplyControl replyControl) {
        replyControl.getClass();
        this.replyControl_ = replyControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoot(long j) {
        this.root_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackInfo(String str) {
        str.getClass();
        this.trackInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackInfo_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j) {
        this.type_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14818a.f22021xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReplyInfo();
            case 2:
                return new C14819b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u0002\n\u0002\u000b\u0002\f\t\r\t\u000e\t\u000f\t\u0010\u0208", new Object[]{"replies_", ReplyInfo.class, "id_", "oid_", "type_", "mid_", "root_", "parent_", "dialog_", "like_", "ctime_", "count_", "content_", "member_", "replyControl_", "memberV2_", "trackInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReplyInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (ReplyInfo.class) {
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

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public Content getContent() {
        Content content = this.content_;
        return content == null ? Content.getDefaultInstance() : content;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getCount() {
        return this.count_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getCtime() {
        return this.ctime_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getDialog() {
        return this.dialog_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getLike() {
        return this.like_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public Member getMember() {
        Member member = this.member_;
        return member == null ? Member.getDefaultInstance() : member;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public MemberV2 getMemberV2() {
        MemberV2 memberV2 = this.memberV2_;
        return memberV2 == null ? MemberV2.getDefaultInstance() : memberV2;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getOid() {
        return this.oid_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getParent() {
        return this.parent_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public ReplyInfo getReplies(int i) {
        return this.replies_.get(i);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public int getRepliesCount() {
        return this.replies_.size();
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public List<ReplyInfo> getRepliesList() {
        return this.replies_;
    }

    public InterfaceC14927i getRepliesOrBuilder(int i) {
        return this.replies_.get(i);
    }

    public List<? extends InterfaceC14927i> getRepliesOrBuilderList() {
        return this.replies_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public ReplyControl getReplyControl() {
        ReplyControl replyControl = this.replyControl_;
        return replyControl == null ? ReplyControl.getDefaultInstance() : replyControl;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getRoot() {
        return this.root_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public String getTrackInfo() {
        return this.trackInfo_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public ByteString getTrackInfoBytes() {
        return ByteString.copyFromUtf8(this.trackInfo_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public long getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public boolean hasContent() {
        return this.content_ != null;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public boolean hasMember() {
        return this.member_ != null;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public boolean hasMemberV2() {
        return this.memberV2_ != null;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14927i
    public boolean hasReplyControl() {
        return this.replyControl_ != null;
    }

    public static C14819b newBuilder(ReplyInfo replyInfo) {
        return DEFAULT_INSTANCE.createBuilder(replyInfo);
    }

    public static ReplyInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReplyInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReplies(int i, ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureRepliesIsMutable();
        this.replies_.add(i, replyInfo);
    }

    public static ReplyInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReplyInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReplyInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReplyInfo parseFrom(InputStream inputStream) throws IOException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReplyInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
