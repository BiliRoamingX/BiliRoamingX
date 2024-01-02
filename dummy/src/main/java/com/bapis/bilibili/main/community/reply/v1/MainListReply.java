package com.bapis.bilibili.main.community.reply.v1;

import com.bapis.bilibili.pagination.FeedPaginationReply;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class MainListReply extends GeneratedMessageLite<MainListReply, MainListReply.C14740b> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_FIELD_NUMBER = 9;
    public static final int ADMIN_TOP_FIELD_NUMBER = 5;
    public static final int CALLBACKS_FIELD_NUMBER = 16;
    public static final int CM_FIELD_NUMBER = 11;
    public static final int CONTEXT_FEATURE_FIELD_NUMBER = 25;
    public static final int CURSOR_FIELD_NUMBER = 1;
    private static final MainListReply DEFAULT_INSTANCE;
    public static final int EFFECTS_FIELD_NUMBER = 12;
    public static final int ESPORTS_GRADE_CARD_FIELD_NUMBER = 24;
    public static final int LOTTERY_FIELD_NUMBER = 8;
    public static final int MODE_FIELD_NUMBER = 18;
    public static final int MODE_TEXT_FIELD_NUMBER = 19;
    public static final int NOTICE_FIELD_NUMBER = 7;
    public static final int OPERATION_FIELD_NUMBER = 13;
    public static final int OPERATION_V2_FIELD_NUMBER = 17;
    public static final int PAGINATION_END_TEXT_FIELD_NUMBER = 26;
    public static final int PAGINATION_REPLY_FIELD_NUMBER = 20;
    private static volatile Parser<MainListReply> PARSER = null;
    public static final int QOE_FIELD_NUMBER = 15;
    public static final int REPLIES_FIELD_NUMBER = 2;
    public static final int REPORT_PARAMS_FIELD_NUMBER = 22;
    public static final int SESSION_ID_FIELD_NUMBER = 21;
    public static final int SUBJECT_CONTROL_FIELD_NUMBER = 3;
    public static final int TOP_REPLIES_FIELD_NUMBER = 14;
    public static final int UP_SELECTION_FIELD_NUMBER = 10;
    public static final int UP_TOP_FIELD_NUMBER = 4;
    public static final int VOTE_CARD_FIELD_NUMBER = 23;
    public static final int VOTE_TOP_FIELD_NUMBER = 6;
    private static final Internal.MapAdapter.Converter<Integer, UserCallbackAction> callbacksValueConverter = Internal.MapAdapter.newEnumConverter(UserCallbackAction.internalGetValueMap(), UserCallbackAction.UNRECOGNIZED);
    private Activity activity_;
    private ReplyInfo adminTop_;
    private CM cm_;
    private CursorReply cursor_;
    private Effects effects_;
    private ESportsGradeCard esportsGradeCard_;
    private Lottery lottery_;
    private int mode_;
    private Notice notice_;
    private OperationV2 operationV2_;
    private Operation operation_;
    private FeedPaginationReply paginationReply_;
    private QoeInfo qoe_;
    private SubjectControl subjectControl_;
    private UpSelection upSelection_;
    private ReplyInfo upTop_;
    private VoteCard voteCard_;
    private ReplyInfo voteTop_;
    private MapFieldLite<String, Integer> callbacks_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<ReplyInfo> replies_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ReplyInfo> topReplies_ = GeneratedMessageLite.emptyProtobufList();
    private String modeText_ = "";
    private String sessionId_ = "";
    private String reportParams_ = "";
    private String contextFeature_ = "";
    private String paginationEndText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.MainListReply$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14739a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22002xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22002xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22002xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22002xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22002xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.MainListReply$b */
    /* loaded from: classes21.dex */
    public static final class C14740b extends GeneratedMessageLite.Builder<MainListReply, C14740b> implements MessageLiteOrBuilder {
        /* synthetic */ C14740b(C14739a c14739a) {
            this();
        }

        public C14740b addAllReplies(Iterable<? extends ReplyInfo> iterable) {
            copyOnWrite();
            ((MainListReply) this.instance).addAllReplies(iterable);
            return this;
        }

        public C14740b addAllTopReplies(Iterable<? extends ReplyInfo> iterable) {
            copyOnWrite();
            ((MainListReply) this.instance).addAllTopReplies(iterable);
            return this;
        }

        public C14740b addReplies(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).addReplies(replyInfo);
            return this;
        }

        public C14740b addTopReplies(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).addTopReplies(replyInfo);
            return this;
        }

        public C14740b clearActivity() {
            copyOnWrite();
            ((MainListReply) this.instance).clearActivity();
            return this;
        }

        public C14740b clearAdminTop() {
            copyOnWrite();
            ((MainListReply) this.instance).clearAdminTop();
            return this;
        }

        public C14740b clearCallbacks() {
            copyOnWrite();
            ((MainListReply) this.instance).getMutableCallbacksMap().clear();
            return this;
        }

        public C14740b clearCm() {
            copyOnWrite();
            ((MainListReply) this.instance).clearCm();
            return this;
        }

        public C14740b clearContextFeature() {
            copyOnWrite();
            ((MainListReply) this.instance).clearContextFeature();
            return this;
        }

        @Deprecated
        public C14740b clearCursor() {
            copyOnWrite();
            ((MainListReply) this.instance).clearCursor();
            return this;
        }

        public C14740b clearEffects() {
            copyOnWrite();
            ((MainListReply) this.instance).clearEffects();
            return this;
        }

        public C14740b clearEsportsGradeCard() {
            copyOnWrite();
            ((MainListReply) this.instance).clearEsportsGradeCard();
            return this;
        }

        public C14740b clearLottery() {
            copyOnWrite();
            ((MainListReply) this.instance).clearLottery();
            return this;
        }

        public C14740b clearMode() {
            copyOnWrite();
            ((MainListReply) this.instance).clearMode();
            return this;
        }

        public C14740b clearModeText() {
            copyOnWrite();
            ((MainListReply) this.instance).clearModeText();
            return this;
        }

        public C14740b clearNotice() {
            copyOnWrite();
            ((MainListReply) this.instance).clearNotice();
            return this;
        }

        public C14740b clearOperation() {
            copyOnWrite();
            ((MainListReply) this.instance).clearOperation();
            return this;
        }

        public C14740b clearOperationV2() {
            copyOnWrite();
            ((MainListReply) this.instance).clearOperationV2();
            return this;
        }

        public C14740b clearPaginationEndText() {
            copyOnWrite();
            ((MainListReply) this.instance).clearPaginationEndText();
            return this;
        }

        public C14740b clearPaginationReply() {
            copyOnWrite();
            ((MainListReply) this.instance).clearPaginationReply();
            return this;
        }

        public C14740b clearQoe() {
            copyOnWrite();
            ((MainListReply) this.instance).clearQoe();
            return this;
        }

        public C14740b clearReplies() {
            copyOnWrite();
            ((MainListReply) this.instance).clearReplies();
            return this;
        }

        public C14740b clearReportParams() {
            copyOnWrite();
            ((MainListReply) this.instance).clearReportParams();
            return this;
        }

        public C14740b clearSessionId() {
            copyOnWrite();
            ((MainListReply) this.instance).clearSessionId();
            return this;
        }

        public C14740b clearSubjectControl() {
            copyOnWrite();
            ((MainListReply) this.instance).clearSubjectControl();
            return this;
        }

        public C14740b clearTopReplies() {
            copyOnWrite();
            ((MainListReply) this.instance).clearTopReplies();
            return this;
        }

        public C14740b clearUpSelection() {
            copyOnWrite();
            ((MainListReply) this.instance).clearUpSelection();
            return this;
        }

        public C14740b clearUpTop() {
            copyOnWrite();
            ((MainListReply) this.instance).clearUpTop();
            return this;
        }

        public C14740b clearVoteCard() {
            copyOnWrite();
            ((MainListReply) this.instance).clearVoteCard();
            return this;
        }

        public C14740b clearVoteTop() {
            copyOnWrite();
            ((MainListReply) this.instance).clearVoteTop();
            return this;
        }

        public boolean containsCallbacks(String str) {
            str.getClass();
            return ((MainListReply) this.instance).getCallbacksMap().containsKey(str);
        }

        public Activity getActivity() {
            return ((MainListReply) this.instance).getActivity();
        }

        public ReplyInfo getAdminTop() {
            return ((MainListReply) this.instance).getAdminTop();
        }

        @Deprecated
        public Map<String, UserCallbackAction> getCallbacks() {
            return getCallbacksMap();
        }

        public int getCallbacksCount() {
            return ((MainListReply) this.instance).getCallbacksMap().size();
        }

        public Map<String, UserCallbackAction> getCallbacksMap() {
            return Collections.unmodifiableMap(((MainListReply) this.instance).getCallbacksMap());
        }

        public UserCallbackAction getCallbacksOrDefault(String str, UserCallbackAction userCallbackAction) {
            str.getClass();
            Map<String, UserCallbackAction> callbacksMap = ((MainListReply) this.instance).getCallbacksMap();
            return callbacksMap.containsKey(str) ? callbacksMap.get(str) : userCallbackAction;
        }

        public UserCallbackAction getCallbacksOrThrow(String str) {
            str.getClass();
            Map<String, UserCallbackAction> callbacksMap = ((MainListReply) this.instance).getCallbacksMap();
            if (callbacksMap.containsKey(str)) {
                return callbacksMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Integer> getCallbacksValue() {
            return getCallbacksValueMap();
        }

        public Map<String, Integer> getCallbacksValueMap() {
            return Collections.unmodifiableMap(((MainListReply) this.instance).getCallbacksValueMap());
        }

        public int getCallbacksValueOrDefault(String str, int i) {
            str.getClass();
            Map<String, Integer> callbacksValueMap = ((MainListReply) this.instance).getCallbacksValueMap();
            return callbacksValueMap.containsKey(str) ? callbacksValueMap.get(str).intValue() : i;
        }

        public int getCallbacksValueOrThrow(String str) {
            str.getClass();
            Map<String, Integer> callbacksValueMap = ((MainListReply) this.instance).getCallbacksValueMap();
            if (callbacksValueMap.containsKey(str)) {
                return callbacksValueMap.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        public CM getCm() {
            return ((MainListReply) this.instance).getCm();
        }

        public String getContextFeature() {
            return ((MainListReply) this.instance).getContextFeature();
        }

        public ByteString getContextFeatureBytes() {
            return ((MainListReply) this.instance).getContextFeatureBytes();
        }

        @Deprecated
        public CursorReply getCursor() {
            return ((MainListReply) this.instance).getCursor();
        }

        public Effects getEffects() {
            return ((MainListReply) this.instance).getEffects();
        }

        public ESportsGradeCard getEsportsGradeCard() {
            return ((MainListReply) this.instance).getEsportsGradeCard();
        }

        public Lottery getLottery() {
            return ((MainListReply) this.instance).getLottery();
        }

        public Mode getMode() {
            return ((MainListReply) this.instance).getMode();
        }

        public String getModeText() {
            return ((MainListReply) this.instance).getModeText();
        }

        public ByteString getModeTextBytes() {
            return ((MainListReply) this.instance).getModeTextBytes();
        }

        public int getModeValue() {
            return ((MainListReply) this.instance).getModeValue();
        }

        public Notice getNotice() {
            return ((MainListReply) this.instance).getNotice();
        }

        public Operation getOperation() {
            return ((MainListReply) this.instance).getOperation();
        }

        public OperationV2 getOperationV2() {
            return ((MainListReply) this.instance).getOperationV2();
        }

        public String getPaginationEndText() {
            return ((MainListReply) this.instance).getPaginationEndText();
        }

        public ByteString getPaginationEndTextBytes() {
            return ((MainListReply) this.instance).getPaginationEndTextBytes();
        }

        public FeedPaginationReply getPaginationReply() {
            return ((MainListReply) this.instance).getPaginationReply();
        }

        public QoeInfo getQoe() {
            return ((MainListReply) this.instance).getQoe();
        }

        public ReplyInfo getReplies(int i) {
            return ((MainListReply) this.instance).getReplies(i);
        }

        public int getRepliesCount() {
            return ((MainListReply) this.instance).getRepliesCount();
        }

        public List<ReplyInfo> getRepliesList() {
            return Collections.unmodifiableList(((MainListReply) this.instance).getRepliesList());
        }

        public String getReportParams() {
            return ((MainListReply) this.instance).getReportParams();
        }

        public ByteString getReportParamsBytes() {
            return ((MainListReply) this.instance).getReportParamsBytes();
        }

        public String getSessionId() {
            return ((MainListReply) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((MainListReply) this.instance).getSessionIdBytes();
        }

        public SubjectControl getSubjectControl() {
            return ((MainListReply) this.instance).getSubjectControl();
        }

        public ReplyInfo getTopReplies(int i) {
            return ((MainListReply) this.instance).getTopReplies(i);
        }

        public int getTopRepliesCount() {
            return ((MainListReply) this.instance).getTopRepliesCount();
        }

        public List<ReplyInfo> getTopRepliesList() {
            return Collections.unmodifiableList(((MainListReply) this.instance).getTopRepliesList());
        }

        public UpSelection getUpSelection() {
            return ((MainListReply) this.instance).getUpSelection();
        }

        public ReplyInfo getUpTop() {
            return ((MainListReply) this.instance).getUpTop();
        }

        public VoteCard getVoteCard() {
            return ((MainListReply) this.instance).getVoteCard();
        }

        public ReplyInfo getVoteTop() {
            return ((MainListReply) this.instance).getVoteTop();
        }

        public boolean hasActivity() {
            return ((MainListReply) this.instance).hasActivity();
        }

        public boolean hasAdminTop() {
            return ((MainListReply) this.instance).hasAdminTop();
        }

        public boolean hasCm() {
            return ((MainListReply) this.instance).hasCm();
        }

        @Deprecated
        public boolean hasCursor() {
            return ((MainListReply) this.instance).hasCursor();
        }

        public boolean hasEffects() {
            return ((MainListReply) this.instance).hasEffects();
        }

        public boolean hasEsportsGradeCard() {
            return ((MainListReply) this.instance).hasEsportsGradeCard();
        }

        public boolean hasLottery() {
            return ((MainListReply) this.instance).hasLottery();
        }

        public boolean hasNotice() {
            return ((MainListReply) this.instance).hasNotice();
        }

        public boolean hasOperation() {
            return ((MainListReply) this.instance).hasOperation();
        }

        public boolean hasOperationV2() {
            return ((MainListReply) this.instance).hasOperationV2();
        }

        public boolean hasPaginationReply() {
            return ((MainListReply) this.instance).hasPaginationReply();
        }

        public boolean hasQoe() {
            return ((MainListReply) this.instance).hasQoe();
        }

        public boolean hasSubjectControl() {
            return ((MainListReply) this.instance).hasSubjectControl();
        }

        public boolean hasUpSelection() {
            return ((MainListReply) this.instance).hasUpSelection();
        }

        public boolean hasUpTop() {
            return ((MainListReply) this.instance).hasUpTop();
        }

        public boolean hasVoteCard() {
            return ((MainListReply) this.instance).hasVoteCard();
        }

        public boolean hasVoteTop() {
            return ((MainListReply) this.instance).hasVoteTop();
        }

        public C14740b mergeActivity(Activity activity) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeActivity(activity);
            return this;
        }

        public C14740b mergeAdminTop(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeAdminTop(replyInfo);
            return this;
        }

        public C14740b mergeCm(CM cm3) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeCm(cm3);
            return this;
        }

        @Deprecated
        public C14740b mergeCursor(CursorReply cursorReply) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeCursor(cursorReply);
            return this;
        }

        public C14740b mergeEffects(Effects effects) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeEffects(effects);
            return this;
        }

        public C14740b mergeEsportsGradeCard(ESportsGradeCard eSportsGradeCard) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeEsportsGradeCard(eSportsGradeCard);
            return this;
        }

        public C14740b mergeLottery(Lottery lottery) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeLottery(lottery);
            return this;
        }

        public C14740b mergeNotice(Notice notice) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeNotice(notice);
            return this;
        }

        public C14740b mergeOperation(Operation operation) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeOperation(operation);
            return this;
        }

        public C14740b mergeOperationV2(OperationV2 operationV2) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeOperationV2(operationV2);
            return this;
        }

        public C14740b mergePaginationReply(FeedPaginationReply feedPaginationReply) {
            copyOnWrite();
            ((MainListReply) this.instance).mergePaginationReply(feedPaginationReply);
            return this;
        }

        public C14740b mergeQoe(QoeInfo qoeInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeQoe(qoeInfo);
            return this;
        }

        public C14740b mergeSubjectControl(SubjectControl subjectControl) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeSubjectControl(subjectControl);
            return this;
        }

        public C14740b mergeUpSelection(UpSelection upSelection) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeUpSelection(upSelection);
            return this;
        }

        public C14740b mergeUpTop(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeUpTop(replyInfo);
            return this;
        }

        public C14740b mergeVoteCard(VoteCard voteCard) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeVoteCard(voteCard);
            return this;
        }

        public C14740b mergeVoteTop(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).mergeVoteTop(replyInfo);
            return this;
        }

        public C14740b putAllCallbacks(Map<String, UserCallbackAction> map) {
            copyOnWrite();
            ((MainListReply) this.instance).getMutableCallbacksMap().putAll(map);
            return this;
        }

        public C14740b putAllCallbacksValue(Map<String, Integer> map) {
            copyOnWrite();
            ((MainListReply) this.instance).getMutableCallbacksValueMap().putAll(map);
            return this;
        }

        public C14740b putCallbacks(String str, UserCallbackAction userCallbackAction) {
            str.getClass();
            userCallbackAction.getClass();
            copyOnWrite();
            ((MainListReply) this.instance).getMutableCallbacksMap().put(str, userCallbackAction);
            return this;
        }

        public C14740b putCallbacksValue(String str, int i) {
            str.getClass();
            copyOnWrite();
            ((MainListReply) this.instance).getMutableCallbacksValueMap().put(str, Integer.valueOf(i));
            return this;
        }

        public C14740b removeCallbacks(String str) {
            str.getClass();
            copyOnWrite();
            ((MainListReply) this.instance).getMutableCallbacksMap().remove(str);
            return this;
        }

        public C14740b removeReplies(int i) {
            copyOnWrite();
            ((MainListReply) this.instance).removeReplies(i);
            return this;
        }

        public C14740b removeTopReplies(int i) {
            copyOnWrite();
            ((MainListReply) this.instance).removeTopReplies(i);
            return this;
        }

        public C14740b setActivity(Activity activity) {
            copyOnWrite();
            ((MainListReply) this.instance).setActivity(activity);
            return this;
        }

        public C14740b setAdminTop(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).setAdminTop(replyInfo);
            return this;
        }

        public C14740b setCm(CM cm3) {
            copyOnWrite();
            ((MainListReply) this.instance).setCm(cm3);
            return this;
        }

        public C14740b setContextFeature(String str) {
            copyOnWrite();
            ((MainListReply) this.instance).setContextFeature(str);
            return this;
        }

        public C14740b setContextFeatureBytes(ByteString byteString) {
            copyOnWrite();
            ((MainListReply) this.instance).setContextFeatureBytes(byteString);
            return this;
        }

        @Deprecated
        public C14740b setCursor(CursorReply cursorReply) {
            copyOnWrite();
            ((MainListReply) this.instance).setCursor(cursorReply);
            return this;
        }

        public C14740b setEffects(Effects effects) {
            copyOnWrite();
            ((MainListReply) this.instance).setEffects(effects);
            return this;
        }

        public C14740b setEsportsGradeCard(ESportsGradeCard eSportsGradeCard) {
            copyOnWrite();
            ((MainListReply) this.instance).setEsportsGradeCard(eSportsGradeCard);
            return this;
        }

        public C14740b setLottery(Lottery lottery) {
            copyOnWrite();
            ((MainListReply) this.instance).setLottery(lottery);
            return this;
        }

        public C14740b setMode(Mode mode) {
            copyOnWrite();
            ((MainListReply) this.instance).setMode(mode);
            return this;
        }

        public C14740b setModeText(String str) {
            copyOnWrite();
            ((MainListReply) this.instance).setModeText(str);
            return this;
        }

        public C14740b setModeTextBytes(ByteString byteString) {
            copyOnWrite();
            ((MainListReply) this.instance).setModeTextBytes(byteString);
            return this;
        }

        public C14740b setModeValue(int i) {
            copyOnWrite();
            ((MainListReply) this.instance).setModeValue(i);
            return this;
        }

        public C14740b setNotice(Notice notice) {
            copyOnWrite();
            ((MainListReply) this.instance).setNotice(notice);
            return this;
        }

        public C14740b setOperation(Operation operation) {
            copyOnWrite();
            ((MainListReply) this.instance).setOperation(operation);
            return this;
        }

        public C14740b setOperationV2(OperationV2 operationV2) {
            copyOnWrite();
            ((MainListReply) this.instance).setOperationV2(operationV2);
            return this;
        }

        public C14740b setPaginationEndText(String str) {
            copyOnWrite();
            ((MainListReply) this.instance).setPaginationEndText(str);
            return this;
        }

        public C14740b setPaginationEndTextBytes(ByteString byteString) {
            copyOnWrite();
            ((MainListReply) this.instance).setPaginationEndTextBytes(byteString);
            return this;
        }

        public C14740b setPaginationReply(FeedPaginationReply feedPaginationReply) {
            copyOnWrite();
            ((MainListReply) this.instance).setPaginationReply(feedPaginationReply);
            return this;
        }

        public C14740b setQoe(QoeInfo qoeInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).setQoe(qoeInfo);
            return this;
        }

        public C14740b setReplies(int i, ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).setReplies(i, replyInfo);
            return this;
        }

        public C14740b setReportParams(String str) {
            copyOnWrite();
            ((MainListReply) this.instance).setReportParams(str);
            return this;
        }

        public C14740b setReportParamsBytes(ByteString byteString) {
            copyOnWrite();
            ((MainListReply) this.instance).setReportParamsBytes(byteString);
            return this;
        }

        public C14740b setSessionId(String str) {
            copyOnWrite();
            ((MainListReply) this.instance).setSessionId(str);
            return this;
        }

        public C14740b setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((MainListReply) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public C14740b setSubjectControl(SubjectControl subjectControl) {
            copyOnWrite();
            ((MainListReply) this.instance).setSubjectControl(subjectControl);
            return this;
        }

        public C14740b setTopReplies(int i, ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).setTopReplies(i, replyInfo);
            return this;
        }

        public C14740b setUpSelection(UpSelection upSelection) {
            copyOnWrite();
            ((MainListReply) this.instance).setUpSelection(upSelection);
            return this;
        }

        public C14740b setUpTop(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).setUpTop(replyInfo);
            return this;
        }

        public C14740b setVoteCard(VoteCard voteCard) {
            copyOnWrite();
            ((MainListReply) this.instance).setVoteCard(voteCard);
            return this;
        }

        public C14740b setVoteTop(ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).setVoteTop(replyInfo);
            return this;
        }

        private C14740b() {
            super(MainListReply.DEFAULT_INSTANCE);
        }

        public C14740b addReplies(int i, ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).addReplies(i, replyInfo);
            return this;
        }

        public C14740b addTopReplies(int i, ReplyInfo replyInfo) {
            copyOnWrite();
            ((MainListReply) this.instance).addTopReplies(i, replyInfo);
            return this;
        }

        public C14740b setActivity(Activity.C14674b c14674b) {
            copyOnWrite();
            ((MainListReply) this.instance).setActivity(c14674b.build());
            return this;
        }

        public C14740b setAdminTop(ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).setAdminTop(c14819b.build());
            return this;
        }

        public C14740b setCm(CM.C14688b c14688b) {
            copyOnWrite();
            ((MainListReply) this.instance).setCm(c14688b.build());
            return this;
        }

        @Deprecated
        public C14740b setCursor(CursorReply.C14697b c14697b) {
            copyOnWrite();
            ((MainListReply) this.instance).setCursor(c14697b.build());
            return this;
        }

        public C14740b setEffects(Effects.C14719b c14719b) {
            copyOnWrite();
            ((MainListReply) this.instance).setEffects(c14719b.build());
            return this;
        }

        public C14740b setEsportsGradeCard(ESportsGradeCard.C14715b c14715b) {
            copyOnWrite();
            ((MainListReply) this.instance).setEsportsGradeCard(c14715b.build());
            return this;
        }

        public C14740b setLottery(Lottery.C14738b c14738b) {
            copyOnWrite();
            ((MainListReply) this.instance).setLottery(c14738b.build());
            return this;
        }

        public C14740b setNotice(Notice.C14773b c14773b) {
            copyOnWrite();
            ((MainListReply) this.instance).setNotice(c14773b.build());
            return this;
        }

        public C14740b setOperation(Operation.C14777b c14777b) {
            copyOnWrite();
            ((MainListReply) this.instance).setOperation(c14777b.build());
            return this;
        }

        public C14740b setOperationV2(OperationV2.C14786b c14786b) {
            copyOnWrite();
            ((MainListReply) this.instance).setOperationV2(c14786b.build());
            return this;
        }

        public C14740b setPaginationReply(FeedPaginationReply.C15554b c15554b) {
            copyOnWrite();
            ((MainListReply) this.instance).setPaginationReply(c15554b.build());
            return this;
        }

        public C14740b setQoe(QoeInfo.C14796b c14796b) {
            copyOnWrite();
            ((MainListReply) this.instance).setQoe(c14796b.build());
            return this;
        }

        public C14740b setReplies(int i, ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).setReplies(i, c14819b.build());
            return this;
        }

        public C14740b setTopReplies(int i, ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).setTopReplies(i, c14819b.build());
            return this;
        }

        public C14740b setUpSelection(UpSelection.C14889b c14889b) {
            copyOnWrite();
            ((MainListReply) this.instance).setUpSelection(c14889b.build());
            return this;
        }

        public C14740b setUpTop(ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).setUpTop(c14819b.build());
            return this;
        }

        public C14740b setVoteCard(VoteCard.C14911b c14911b) {
            copyOnWrite();
            ((MainListReply) this.instance).setVoteCard(c14911b.build());
            return this;
        }

        public C14740b setVoteTop(ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).setVoteTop(c14819b.build());
            return this;
        }

        public C14740b addReplies(ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).addReplies(c14819b.build());
            return this;
        }

        public C14740b addTopReplies(ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).addTopReplies(c14819b.build());
            return this;
        }

        public C14740b addReplies(int i, ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).addReplies(i, c14819b.build());
            return this;
        }

        public C14740b addTopReplies(int i, ReplyInfo.C14819b c14819b) {
            copyOnWrite();
            ((MainListReply) this.instance).addTopReplies(i, c14819b.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.MainListReply$c */
    /* loaded from: classes21.dex */
    private static final class C14741c {
        static final MapEntryLite<String, Integer> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.ENUM, Integer.valueOf(UserCallbackAction.Dismiss.getNumber()));

        private C14741c() {
        }
    }

    static {
        MainListReply mainListReply = new MainListReply();
        DEFAULT_INSTANCE = mainListReply;
        GeneratedMessageLite.registerDefaultInstance(MainListReply.class, mainListReply);
    }

    public MainListReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReplies(Iterable<? extends ReplyInfo> iterable) {
        ensureRepliesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.replies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTopReplies(Iterable<? extends ReplyInfo> iterable) {
        ensureTopRepliesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.topReplies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReplies(ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureRepliesIsMutable();
        this.replies_.add(replyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopReplies(ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureTopRepliesIsMutable();
        this.topReplies_.add(replyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivity() {
        this.activity_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdminTop() {
        this.adminTop_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCm() {
        this.cm_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextFeature() {
        this.contextFeature_ = getDefaultInstance().getContextFeature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCursor() {
        this.cursor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEffects() {
        this.effects_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEsportsGradeCard() {
        this.esportsGradeCard_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLottery() {
        this.lottery_ = null;
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
    public void clearNotice() {
        this.notice_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperation() {
        this.operation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationV2() {
        this.operationV2_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaginationEndText() {
        this.paginationEndText_ = getDefaultInstance().getPaginationEndText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaginationReply() {
        this.paginationReply_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQoe() {
        this.qoe_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplies() {
        this.replies_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportParams() {
        this.reportParams_ = getDefaultInstance().getReportParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubjectControl() {
        this.subjectControl_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopReplies() {
        this.topReplies_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpSelection() {
        this.upSelection_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpTop() {
        this.upTop_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoteCard() {
        this.voteCard_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoteTop() {
        this.voteTop_ = null;
    }

    private void ensureRepliesIsMutable() {
        Internal.ProtobufList<ReplyInfo> protobufList = this.replies_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.replies_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTopRepliesIsMutable() {
        Internal.ProtobufList<ReplyInfo> protobufList = this.topReplies_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.topReplies_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MainListReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, UserCallbackAction> getMutableCallbacksMap() {
        return new Internal.MapAdapter(internalGetMutableCallbacks(), callbacksValueConverter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Integer> getMutableCallbacksValueMap() {
        return internalGetMutableCallbacks();
    }

    private MapFieldLite<String, Integer> internalGetCallbacks() {
        return this.callbacks_;
    }

    private MapFieldLite<String, Integer> internalGetMutableCallbacks() {
        if (!this.callbacks_.isMutable()) {
            this.callbacks_ = this.callbacks_.mutableCopy();
        }
        return this.callbacks_;
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
    public void mergeAdminTop(ReplyInfo replyInfo) {
        replyInfo.getClass();
        ReplyInfo replyInfo2 = this.adminTop_;
        if (replyInfo2 != null && replyInfo2 != ReplyInfo.getDefaultInstance()) {
            this.adminTop_ = ReplyInfo.newBuilder(this.adminTop_).mergeFrom((ReplyInfo) replyInfo).buildPartial();
        } else {
            this.adminTop_ = replyInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCm(CM cm3) {
        cm3.getClass();
        CM cm4 = this.cm_;
        if (cm4 != null && cm4 != CM.getDefaultInstance()) {
            this.cm_ = CM.newBuilder(this.cm_).mergeFrom((CM) cm3).buildPartial();
        } else {
            this.cm_ = cm3;
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
    public void mergeEffects(Effects effects) {
        effects.getClass();
        Effects effects2 = this.effects_;
        if (effects2 != null && effects2 != Effects.getDefaultInstance()) {
            this.effects_ = Effects.newBuilder(this.effects_).mergeFrom((Effects) effects).buildPartial();
        } else {
            this.effects_ = effects;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEsportsGradeCard(ESportsGradeCard eSportsGradeCard) {
        eSportsGradeCard.getClass();
        ESportsGradeCard eSportsGradeCard2 = this.esportsGradeCard_;
        if (eSportsGradeCard2 != null && eSportsGradeCard2 != ESportsGradeCard.getDefaultInstance()) {
            this.esportsGradeCard_ = ESportsGradeCard.newBuilder(this.esportsGradeCard_).mergeFrom((ESportsGradeCard) eSportsGradeCard).buildPartial();
        } else {
            this.esportsGradeCard_ = eSportsGradeCard;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLottery(Lottery lottery) {
        lottery.getClass();
        Lottery lottery2 = this.lottery_;
        if (lottery2 != null && lottery2 != Lottery.getDefaultInstance()) {
            this.lottery_ = Lottery.newBuilder(this.lottery_).mergeFrom((Lottery) lottery).buildPartial();
        } else {
            this.lottery_ = lottery;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotice(Notice notice) {
        notice.getClass();
        Notice notice2 = this.notice_;
        if (notice2 != null && notice2 != Notice.getDefaultInstance()) {
            this.notice_ = Notice.newBuilder(this.notice_).mergeFrom((Notice) notice).buildPartial();
        } else {
            this.notice_ = notice;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOperation(Operation operation) {
        operation.getClass();
        Operation operation2 = this.operation_;
        if (operation2 != null && operation2 != Operation.getDefaultInstance()) {
            this.operation_ = Operation.newBuilder(this.operation_).mergeFrom((Operation) operation).buildPartial();
        } else {
            this.operation_ = operation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOperationV2(OperationV2 operationV2) {
        operationV2.getClass();
        OperationV2 operationV22 = this.operationV2_;
        if (operationV22 != null && operationV22 != OperationV2.getDefaultInstance()) {
            this.operationV2_ = OperationV2.newBuilder(this.operationV2_).mergeFrom((OperationV2) operationV2).buildPartial();
        } else {
            this.operationV2_ = operationV2;
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
    public void mergeQoe(QoeInfo qoeInfo) {
        qoeInfo.getClass();
        QoeInfo qoeInfo2 = this.qoe_;
        if (qoeInfo2 != null && qoeInfo2 != QoeInfo.getDefaultInstance()) {
            this.qoe_ = QoeInfo.newBuilder(this.qoe_).mergeFrom((QoeInfo) qoeInfo).buildPartial();
        } else {
            this.qoe_ = qoeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubjectControl(SubjectControl subjectControl) {
        this.subjectControl_ = subjectControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpSelection(UpSelection upSelection) {
        upSelection.getClass();
        UpSelection upSelection2 = this.upSelection_;
        if (upSelection2 != null && upSelection2 != UpSelection.getDefaultInstance()) {
            this.upSelection_ = UpSelection.newBuilder(this.upSelection_).mergeFrom((UpSelection) upSelection).buildPartial();
        } else {
            this.upSelection_ = upSelection;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpTop(ReplyInfo replyInfo) {
        replyInfo.getClass();
        ReplyInfo replyInfo2 = this.upTop_;
        if (replyInfo2 != null && replyInfo2 != ReplyInfo.getDefaultInstance()) {
            this.upTop_ = ReplyInfo.newBuilder(this.upTop_).mergeFrom((ReplyInfo) replyInfo).buildPartial();
        } else {
            this.upTop_ = replyInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoteCard(VoteCard voteCard) {
        voteCard.getClass();
        VoteCard voteCard2 = this.voteCard_;
        if (voteCard2 != null && voteCard2 != VoteCard.getDefaultInstance()) {
            this.voteCard_ = VoteCard.newBuilder(this.voteCard_).mergeFrom((VoteCard) voteCard).buildPartial();
        } else {
            this.voteCard_ = voteCard;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoteTop(ReplyInfo replyInfo) {
        replyInfo.getClass();
        ReplyInfo replyInfo2 = this.voteTop_;
        if (replyInfo2 != null && replyInfo2 != ReplyInfo.getDefaultInstance()) {
            this.voteTop_ = ReplyInfo.newBuilder(this.voteTop_).mergeFrom((ReplyInfo) replyInfo).buildPartial();
        } else {
            this.voteTop_ = replyInfo;
        }
    }

    public static C14740b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MainListReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MainListReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainListReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MainListReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReplies(int i) {
        ensureRepliesIsMutable();
        this.replies_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTopReplies(int i) {
        ensureTopRepliesIsMutable();
        this.topReplies_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivity(Activity activity) {
        activity.getClass();
        this.activity_ = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdminTop(ReplyInfo replyInfo) {
        replyInfo.getClass();
        this.adminTop_ = replyInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCm(CM cm3) {
        cm3.getClass();
        this.cm_ = cm3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextFeature(String str) {
        str.getClass();
        this.contextFeature_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextFeatureBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextFeature_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCursor(CursorReply cursorReply) {
        cursorReply.getClass();
        this.cursor_ = cursorReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEffects(Effects effects) {
        effects.getClass();
        this.effects_ = effects;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEsportsGradeCard(ESportsGradeCard eSportsGradeCard) {
        eSportsGradeCard.getClass();
        this.esportsGradeCard_ = eSportsGradeCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLottery(Lottery lottery) {
        lottery.getClass();
        this.lottery_ = lottery;
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
    public void setNotice(Notice notice) {
        notice.getClass();
        this.notice_ = notice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperation(Operation operation) {
        operation.getClass();
        this.operation_ = operation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationV2(OperationV2 operationV2) {
        operationV2.getClass();
        this.operationV2_ = operationV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaginationEndText(String str) {
        str.getClass();
        this.paginationEndText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaginationEndTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paginationEndText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaginationReply(FeedPaginationReply feedPaginationReply) {
        feedPaginationReply.getClass();
        this.paginationReply_ = feedPaginationReply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQoe(QoeInfo qoeInfo) {
        qoeInfo.getClass();
        this.qoe_ = qoeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplies(int i, ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureRepliesIsMutable();
        this.replies_.set(i, replyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportParams(String str) {
        str.getClass();
        this.reportParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportParamsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reportParams_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopReplies(int i, ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureTopRepliesIsMutable();
        this.topReplies_.set(i, replyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpSelection(UpSelection upSelection) {
        upSelection.getClass();
        this.upSelection_ = upSelection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpTop(ReplyInfo replyInfo) {
        replyInfo.getClass();
        this.upTop_ = replyInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoteCard(VoteCard voteCard) {
        voteCard.getClass();
        this.voteCard_ = voteCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoteTop(ReplyInfo replyInfo) {
        replyInfo.getClass();
        this.voteTop_ = replyInfo;
    }

    public boolean containsCallbacks(String str) {
        str.getClass();
        return internalGetCallbacks().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14739a.f22002xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MainListReply();
            case 2:
                return new C14740b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0000\u0001\u001a\u001a\u0001\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\u001b\u000f\t\u00102\u0011\t\u0012\f\u0013\u0208\u0014\t\u0015\u0208\u0016\u0208\u0017\t\u0018\t\u0019\u0208\u001a\u0208", new Object[]{"cursor_", "replies_", ReplyInfo.class, "subjectControl_", "upTop_", "adminTop_", "voteTop_", "notice_", "lottery_", "activity_", "upSelection_", "cm_", "effects_", "operation_", "topReplies_", ReplyInfo.class, "qoe_", "callbacks_", C14741c.defaultEntry, "operationV2_", "mode_", "modeText_", "paginationReply_", "sessionId_", "reportParams_", "voteCard_", "esportsGradeCard_", "contextFeature_", "paginationEndText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MainListReply> parser = PARSER;
                if (parser == null) {
                    synchronized (MainListReply.class) {
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

    public ReplyInfo getAdminTop() {
        ReplyInfo replyInfo = this.adminTop_;
        return replyInfo == null ? ReplyInfo.getDefaultInstance() : replyInfo;
    }

    @Deprecated
    public Map<String, UserCallbackAction> getCallbacks() {
        return getCallbacksMap();
    }

    public int getCallbacksCount() {
        return internalGetCallbacks().size();
    }

    public Map<String, UserCallbackAction> getCallbacksMap() {
        return Collections.unmodifiableMap(new Internal.MapAdapter(internalGetCallbacks(), callbacksValueConverter));
    }

    public UserCallbackAction getCallbacksOrDefault(String str, UserCallbackAction userCallbackAction) {
        str.getClass();
        MapFieldLite<String, Integer> internalGetCallbacks = internalGetCallbacks();
        return internalGetCallbacks.containsKey(str) ? callbacksValueConverter.doForward(internalGetCallbacks.get(str)) : userCallbackAction;
    }

    public UserCallbackAction getCallbacksOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Integer> internalGetCallbacks = internalGetCallbacks();
        if (internalGetCallbacks.containsKey(str)) {
            return callbacksValueConverter.doForward(internalGetCallbacks.get(str));
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, Integer> getCallbacksValue() {
        return getCallbacksValueMap();
    }

    public Map<String, Integer> getCallbacksValueMap() {
        return Collections.unmodifiableMap(internalGetCallbacks());
    }

    public int getCallbacksValueOrDefault(String str, int i) {
        str.getClass();
        MapFieldLite<String, Integer> internalGetCallbacks = internalGetCallbacks();
        return internalGetCallbacks.containsKey(str) ? internalGetCallbacks.get(str).intValue() : i;
    }

    public int getCallbacksValueOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Integer> internalGetCallbacks = internalGetCallbacks();
        if (internalGetCallbacks.containsKey(str)) {
            return internalGetCallbacks.get(str).intValue();
        }
        throw new IllegalArgumentException();
    }

    public CM getCm() {
        CM cm3 = this.cm_;
        return cm3 == null ? CM.getDefaultInstance() : cm3;
    }

    public String getContextFeature() {
        return this.contextFeature_;
    }

    public ByteString getContextFeatureBytes() {
        return ByteString.copyFromUtf8(this.contextFeature_);
    }

    @Deprecated
    public CursorReply getCursor() {
        CursorReply cursorReply = this.cursor_;
        return cursorReply == null ? CursorReply.getDefaultInstance() : cursorReply;
    }

    public Effects getEffects() {
        Effects effects = this.effects_;
        return effects == null ? Effects.getDefaultInstance() : effects;
    }

    public ESportsGradeCard getEsportsGradeCard() {
        ESportsGradeCard eSportsGradeCard = this.esportsGradeCard_;
        return eSportsGradeCard == null ? ESportsGradeCard.getDefaultInstance() : eSportsGradeCard;
    }

    public Lottery getLottery() {
        Lottery lottery = this.lottery_;
        return lottery == null ? Lottery.getDefaultInstance() : lottery;
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

    public Notice getNotice() {
        Notice notice = this.notice_;
        return notice == null ? Notice.getDefaultInstance() : notice;
    }

    public Operation getOperation() {
        Operation operation = this.operation_;
        return operation == null ? Operation.getDefaultInstance() : operation;
    }

    public OperationV2 getOperationV2() {
        OperationV2 operationV2 = this.operationV2_;
        return operationV2 == null ? OperationV2.getDefaultInstance() : operationV2;
    }

    public String getPaginationEndText() {
        return this.paginationEndText_;
    }

    public ByteString getPaginationEndTextBytes() {
        return ByteString.copyFromUtf8(this.paginationEndText_);
    }

    public FeedPaginationReply getPaginationReply() {
        FeedPaginationReply feedPaginationReply = this.paginationReply_;
        return feedPaginationReply == null ? FeedPaginationReply.getDefaultInstance() : feedPaginationReply;
    }

    public QoeInfo getQoe() {
        QoeInfo qoeInfo = this.qoe_;
        return qoeInfo == null ? QoeInfo.getDefaultInstance() : qoeInfo;
    }

    public ReplyInfo getReplies(int i) {
        return this.replies_.get(i);
    }

    public int getRepliesCount() {
        return this.replies_.size();
    }

    public List<ReplyInfo> getRepliesList() {
        return this.replies_;
    }

    public InterfaceC14927i getRepliesOrBuilder(int i) {
        return this.replies_.get(i);
    }

    public List<? extends InterfaceC14927i> getRepliesOrBuilderList() {
        return this.replies_;
    }

    public String getReportParams() {
        return this.reportParams_;
    }

    public ByteString getReportParamsBytes() {
        return ByteString.copyFromUtf8(this.reportParams_);
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

    public ReplyInfo getTopReplies(int i) {
        return this.topReplies_.get(i);
    }

    public int getTopRepliesCount() {
        return this.topReplies_.size();
    }

    public List<ReplyInfo> getTopRepliesList() {
        return this.topReplies_;
    }

    public InterfaceC14927i getTopRepliesOrBuilder(int i) {
        return this.topReplies_.get(i);
    }

    public List<? extends InterfaceC14927i> getTopRepliesOrBuilderList() {
        return this.topReplies_;
    }

    public UpSelection getUpSelection() {
        UpSelection upSelection = this.upSelection_;
        return upSelection == null ? UpSelection.getDefaultInstance() : upSelection;
    }

    public ReplyInfo getUpTop() {
        ReplyInfo replyInfo = this.upTop_;
        return replyInfo == null ? ReplyInfo.getDefaultInstance() : replyInfo;
    }

    public VoteCard getVoteCard() {
        VoteCard voteCard = this.voteCard_;
        return voteCard == null ? VoteCard.getDefaultInstance() : voteCard;
    }

    public ReplyInfo getVoteTop() {
        ReplyInfo replyInfo = this.voteTop_;
        return replyInfo == null ? ReplyInfo.getDefaultInstance() : replyInfo;
    }

    public boolean hasActivity() {
        return this.activity_ != null;
    }

    public boolean hasAdminTop() {
        return this.adminTop_ != null;
    }

    public boolean hasCm() {
        return this.cm_ != null;
    }

    @Deprecated
    public boolean hasCursor() {
        return this.cursor_ != null;
    }

    public boolean hasEffects() {
        return this.effects_ != null;
    }

    public boolean hasEsportsGradeCard() {
        return this.esportsGradeCard_ != null;
    }

    public boolean hasLottery() {
        return this.lottery_ != null;
    }

    public boolean hasNotice() {
        return this.notice_ != null;
    }

    public boolean hasOperation() {
        return this.operation_ != null;
    }

    public boolean hasOperationV2() {
        return this.operationV2_ != null;
    }

    public boolean hasPaginationReply() {
        return this.paginationReply_ != null;
    }

    public boolean hasQoe() {
        return this.qoe_ != null;
    }

    public boolean hasSubjectControl() {
        return this.subjectControl_ != null;
    }

    public boolean hasUpSelection() {
        return this.upSelection_ != null;
    }

    public boolean hasUpTop() {
        return this.upTop_ != null;
    }

    public boolean hasVoteCard() {
        return this.voteCard_ != null;
    }

    public boolean hasVoteTop() {
        return this.voteTop_ != null;
    }

    public static C14740b newBuilder(MainListReply mainListReply) {
        return DEFAULT_INSTANCE.createBuilder(mainListReply);
    }

    public static MainListReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainListReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MainListReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MainListReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReplies(int i, ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureRepliesIsMutable();
        this.replies_.add(i, replyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopReplies(int i, ReplyInfo replyInfo) {
        replyInfo.getClass();
        ensureTopRepliesIsMutable();
        this.topReplies_.add(i, replyInfo);
    }

    public static MainListReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MainListReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MainListReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MainListReply parseFrom(InputStream inputStream) throws IOException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainListReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MainListReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MainListReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainListReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
