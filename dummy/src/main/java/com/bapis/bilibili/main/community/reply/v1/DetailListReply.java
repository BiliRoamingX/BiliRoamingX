package com.bapis.bilibili.main.community.reply.v1;

import com.bapis.bilibili.pagination.FeedPaginationReply;
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
/* loaded from: classes21.dex */
public final class DetailListReply extends GeneratedMessageLite<DetailListReply, DetailListReply.C14701b> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_FIELD_NUMBER = 4;
    public static final int CURSOR_FIELD_NUMBER = 1;
    private static final DetailListReply DEFAULT_INSTANCE;
    public static final int LIKES_FIELD_NUMBER = 5;
    public static final int MODE_FIELD_NUMBER = 6;
    public static final int MODE_TEXT_FIELD_NUMBER = 7;
    public static final int PAGINATION_REPLY_FIELD_NUMBER = 8;
    private static volatile Parser<DetailListReply> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 9;
    public static final int SUBJECT_CONTROL_FIELD_NUMBER = 2;
    private Activity activity_;
    private CursorReply cursor_;
    private LikeInfo likes_;
    private int mode_;
    private FeedPaginationReply paginationReply_;
    private ReplyInfo root_;
    private SubjectControl subjectControl_;
    private String modeText_ = "";
    private String sessionId_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.DetailListReply$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14700a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21988xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21988xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21988xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21988xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21988xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.DetailListReply$b */
    /* loaded from: classes21.dex */
    public static final class C14701b extends GeneratedMessageLite.Builder<DetailListReply, C14701b> implements MessageLiteOrBuilder {
        /* synthetic */ C14701b(C14700a c14700a) {
            this();
        }

        public C14701b clearActivity() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearActivity();
            return this;
        }

        @Deprecated
        public C14701b clearCursor() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearCursor();
            return this;
        }

        public C14701b clearLikes() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearLikes();
            return this;
        }

        public C14701b clearMode() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearMode();
            return this;
        }

        public C14701b clearModeText() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearModeText();
            return this;
        }

        public C14701b clearPaginationReply() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearPaginationReply();
            return this;
        }

        public C14701b clearRoot() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearRoot();
            return this;
        }

        public C14701b clearSessionId() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearSessionId();
            return this;
        }

        public C14701b clearSubjectControl() {
            copyOnWrite();
            ((DetailListReply) this.instance).clearSubjectControl();
            return this;
        }

        public Activity getActivity() {
            return ((DetailListReply) this.instance).getActivity();
        }

        @Deprecated
        public CursorReply getCursor() {
            return ((DetailListReply) this.instance).getCursor();
        }

        public LikeInfo getLikes() {
            return ((DetailListReply) this.instance).getLikes();
        }

        public Mode getMode() {
            return ((DetailListReply) this.instance).getMode();
        }

        public String getModeText() {
            return ((DetailListReply) this.instance).getModeText();
        }

        public ByteString getModeTextBytes() {
            return ((DetailListReply) this.instance).getModeTextBytes();
        }

        public int getModeValue() {
            return ((DetailListReply) this.instance).getModeValue();
        }

        public FeedPaginationReply getPaginationReply() {
            return ((DetailListReply) this.instance).getPaginationReply();
        }

        public ReplyInfo getRoot() {
            return ((DetailListReply) this.instance).getRoot();
        }

        public String getSessionId() {
            return ((DetailListReply) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((DetailListReply) this.instance).getSessionIdBytes();
        }

        public SubjectControl getSubjectControl() {
            return ((DetailListReply) this.instance).getSubjectControl();
        }

        public boolean hasActivity() {
            return ((DetailListReply) this.instance).hasActivity();
        }

        @Deprecated
        public boolean hasCursor() {
            return ((DetailListReply) this.instance).hasCursor();
        }

        public boolean hasLikes() {
            return ((DetailListReply) this.instance).hasLikes();
        }

        public boolean hasPaginationReply() {
            return ((DetailListReply) this.instance).hasPaginationReply();
        }

        public boolean hasRoot() {
            return ((DetailListReply) this.instance).hasRoot();
        }

        public boolean hasSubjectControl() {
            return ((DetailListReply) this.instance).hasSubjectControl();
        }

        public C14701b mergeActivity(Activity activity) {
            copyOnWrite();
            ((DetailListReply) this.instance).mergeActivity(activity);
            return this;
        }

        @Deprecated
        public C14701b mergeCursor(CursorReply cursorReply) {
            copyOnWrite();
            ((DetailListReply) this.instance).mergeCursor(cursorReply);
            return this;
        }

        public C14701b mergeLikes(LikeInfo likeInfo) {
            copyOnWrite();
            ((DetailListReply) this.instance).mergeLikes(likeInfo);
            return this;
        }

        public C14701b mergePaginationReply(FeedPaginationReply feedPaginationReply) {
            copyOnWrite();
            ((DetailListReply) this.instance).mergePaginationReply(feedPaginationReply);
            return this;
        }

        public C14701b mergeRoot(ReplyInfo replyInfo) {
            copyOnWrite();
            ((DetailListReply) this.instance).mergeRoot(replyInfo);
            return this;
        }

        public C14701b mergeSubjectControl(SubjectControl subjectControl) {
            copyOnWrite();
            ((DetailListReply) this.instance).mergeSubjectControl(subjectControl);
            return this;
        }

        public C14701b setActivity(Activity activity) {
            copyOnWrite();
            ((DetailListReply) this.instance).setActivity(activity);
            return this;
        }

        @Deprecated
        public C14701b setCursor(CursorReply cursorReply) {
            copyOnWrite();
            ((DetailListReply) this.instance).setCursor(cursorReply);
            return this;
        }

        public C14701b setLikes(LikeInfo likeInfo) {
            copyOnWrite();
            ((DetailListReply) this.instance).setLikes(likeInfo);
            return this;
        }

        public C14701b setMode(Mode mode) {
            copyOnWrite();
            ((DetailListReply) this.instance).setMode(mode);
            return this;
        }

        public C14701b setModeText(String str) {
            copyOnWrite();
            ((DetailListReply) this.instance).setModeText(str);
            return this;
        }

        public C14701b setModeTextBytes(ByteString byteString) {
            copyOnWrite();
            ((DetailListReply) this.instance).setModeTextBytes(byteString);
            return this;
        }

        public C14701b setModeValue(int i) {
            copyOnWrite();
            ((DetailListReply) this.instance).setModeValue(i);
            return this;
        }

        public C14701b setPaginationReply(FeedPaginationReply feedPaginationReply) {
            copyOnWrite();
            ((DetailListReply) this.instance).setPaginationReply(feedPaginationReply);
            return this;
        }

        public C14701b setRoot(ReplyInfo replyInfo) {
            copyOnWrite();
            ((DetailListReply) this.instance).setRoot(replyInfo);
            return this;
        }

        public C14701b setSessionId(String str) {
            copyOnWrite();
            ((DetailListReply) this.instance).setSessionId(str);
            return this;
        }

        public C14701b setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((DetailListReply) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public C14701b setSubjectControl(SubjectControl subjectControl) {
            copyOnWrite();
            ((DetailListReply) this.instance).setSubjectControl(subjectControl);
            return this;
        }

        private C14701b() {
            super(DetailListReply.DEFAULT_INSTANCE);
        }

        public C14701b setActivity(Activity.C14674b c14674b) {
            copyOnWrite();
            ((DetailListReply) this.instance).setActivity(c14674b.build());
            return this;
        }

        @Deprecated
        public C14701b setCursor(CursorReply.C14697b c14697b) {
            copyOnWrite();
            ((DetailListReply) this.instance).setCursor(c14697b.build());
            return this;
        }

        public C14701b setLikes(LikeInfo.C14735b c14735b) {
            copyOnWrite();
            ((DetailListReply) this.instance).setLikes(c14735b.build());
            return this;
        }

        public C14701b setPaginationReply(FeedPaginationReply.C15554b c15554b) {
            copyOnWrite();
            ((DetailListReply) this.instance).setPaginationReply(c15554b.build());
            return this;
        }

        public C14701b setRoot(ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((DetailListReply) this.instance).setRoot(c14819b.build());
            return this;
        }
    }

    static {
        DetailListReply detailListReply = new DetailListReply();
        DEFAULT_INSTANCE = detailListReply;
        GeneratedMessageLite.registerDefaultInstance(DetailListReply.class, detailListReply);
    }

    private DetailListReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivity() {
        this.activity_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCursor() {
        this.cursor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikes() {
        this.likes_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModeText() {
        this.modeText_ = getDefaultInstance().getModeText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaginationReply() {
        this.paginationReply_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubjectControl() {
        this.subjectControl_ = null;
    }

    public static DetailListReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivity(Activity activity) {
        activity.getClass();
        Activity activity2 = this.activity_;
        if (activity2 != null && activity2 != Activity.getDefaultInstance()) {
            this.activity_ = Activity.newBuilder(this.activity_).mergeFrom((Activity) activity).buildPartial();
        } else {
            this.activity_ = activity;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCursor(CursorReply cursorReply) {
        cursorReply.getClass();
        CursorReply cursorReply2 = this.cursor_;
        if (cursorReply2 != null && cursorReply2 != CursorReply.getDefaultInstance()) {
            this.cursor_ = CursorReply.newBuilder(this.cursor_).mergeFrom((CursorReply) cursorReply).buildPartial();
        } else {
            this.cursor_ = cursorReply;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikes(LikeInfo likeInfo) {
        likeInfo.getClass();
        LikeInfo likeInfo2 = this.likes_;
        if (likeInfo2 != null && likeInfo2 != LikeInfo.getDefaultInstance()) {
            this.likes_ = LikeInfo.newBuilder(this.likes_).mergeFrom((LikeInfo) likeInfo).buildPartial();
        } else {
            this.likes_ = likeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePaginationReply(FeedPaginationReply feedPaginationReply) {
        feedPaginationReply.getClass();
        FeedPaginationReply feedPaginationReply2 = this.paginationReply_;
        if (feedPaginationReply2 != null && feedPaginationReply2 != FeedPaginationReply.getDefaultInstance()) {
            this.paginationReply_ = FeedPaginationReply.newBuilder(this.paginationReply_).mergeFrom((FeedPaginationReply) feedPaginationReply).buildPartial();
        } else {
            this.paginationReply_ = feedPaginationReply;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoot(ReplyInfo replyInfo) {
        replyInfo.getClass();
        ReplyInfo replyInfo2 = this.root_;
        if (replyInfo2 != null && replyInfo2 != ReplyInfo.getDefaultInstance()) {
            this.root_ = ReplyInfo.newBuilder(this.root_).mergeFrom((ReplyInfo) replyInfo).buildPartial();
        } else {
            this.root_ = replyInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubjectControl(SubjectControl subjectControl) {
        this.subjectControl_ = subjectControl;
    }

    public static C14701b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DetailListReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DetailListReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DetailListReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DetailListReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivity(Activity activity) {
        activity.getClass();
        this.activity_ = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCursor(CursorReply cursorReply) {
        cursorReply.getClass();
        this.cursor_ = cursorReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikes(LikeInfo likeInfo) {
        likeInfo.getClass();
        this.likes_ = likeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(Mode mode) {
        this.mode_ = mode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeText(String str) {
        str.getClass();
        this.modeText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.modeText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i) {
        this.mode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaginationReply(FeedPaginationReply feedPaginationReply) {
        feedPaginationReply.getClass();
        this.paginationReply_ = feedPaginationReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoot(ReplyInfo replyInfo) {
        replyInfo.getClass();
        this.root_ = replyInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectControl(SubjectControl subjectControl) {
        subjectControl.getClass();
        this.subjectControl_ = subjectControl;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14700a.f21988xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DetailListReply();
            case 2:
                return new C14701b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\f\u0007\u0208\b\t\t\u0208", new Object[]{"cursor_", "subjectControl_", "root_", "activity_", "likes_", "mode_", "modeText_", "paginationReply_", "sessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DetailListReply> parser = PARSER;
                if (parser == null) {
                    synchronized (DetailListReply.class) {
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

    public Activity getActivity() {
        Activity activity = this.activity_;
        return activity == null ? Activity.getDefaultInstance() : activity;
    }

    @Deprecated
    public CursorReply getCursor() {
        CursorReply cursorReply = this.cursor_;
        return cursorReply == null ? CursorReply.getDefaultInstance() : cursorReply;
    }

    public LikeInfo getLikes() {
        LikeInfo likeInfo = this.likes_;
        return likeInfo == null ? LikeInfo.getDefaultInstance() : likeInfo;
    }

    public Mode getMode() {
        Mode forNumber = Mode.forNumber(this.mode_);
        return forNumber == null ? Mode.UNRECOGNIZED : forNumber;
    }

    public String getModeText() {
        return this.modeText_;
    }

    public ByteString getModeTextBytes() {
        return ByteString.copyFromUtf8(this.modeText_);
    }

    public int getModeValue() {
        return this.mode_;
    }

    public FeedPaginationReply getPaginationReply() {
        FeedPaginationReply feedPaginationReply = this.paginationReply_;
        return feedPaginationReply == null ? FeedPaginationReply.getDefaultInstance() : feedPaginationReply;
    }

    public ReplyInfo getRoot() {
        ReplyInfo replyInfo = this.root_;
        return replyInfo == null ? ReplyInfo.getDefaultInstance() : replyInfo;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public SubjectControl getSubjectControl() {
        return this.subjectControl_;
    }

    public boolean hasActivity() {
        return this.activity_ != null;
    }

    @Deprecated
    public boolean hasCursor() {
        return this.cursor_ != null;
    }

    public boolean hasLikes() {
        return this.likes_ != null;
    }

    public boolean hasPaginationReply() {
        return this.paginationReply_ != null;
    }

    public boolean hasRoot() {
        return this.root_ != null;
    }

    public boolean hasSubjectControl() {
        return this.subjectControl_ != null;
    }

    public static C14701b newBuilder(DetailListReply detailListReply) {
        return DEFAULT_INSTANCE.createBuilder(detailListReply);
    }

    public static DetailListReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DetailListReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DetailListReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DetailListReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DetailListReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DetailListReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DetailListReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DetailListReply parseFrom(InputStream inputStream) throws IOException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DetailListReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DetailListReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DetailListReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DetailListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
