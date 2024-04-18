package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.Stat;
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
/* loaded from: classes20.dex */
public final class ArcRefreshReply extends GeneratedMessageLite<ArcRefreshReply, ArcRefreshReply.C8198b> implements MessageLiteOrBuilder {
    public static final int ARC_FIELD_NUMBER = 3;
    private static final ArcRefreshReply DEFAULT_INSTANCE;
    public static final int LIKE_CONFIG_FIELD_NUMBER = 5;
    public static final int ONLINE_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 6;
    private static volatile Parser<ArcRefreshReply> PARSER = null;
    public static final int REPLY_STYLE_FIELD_NUMBER = 7;
    public static final int REQ_USER_FIELD_NUMBER = 2;
    public static final int STAT_FIELD_NUMBER = 1;
    private SimpleArc arc_;
    private LikeConfig likeConfig_;
    private Online online_;
    private SimpleOwner owner_;
    private ReplyStyle replyStyle_;
    private SimpleReqUser reqUser_;
    private Stat stat_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ArcRefreshReply$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C8197a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18325xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18325xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18325xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18325xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18325xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18325xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18325xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18325xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ArcRefreshReply$b */
    /* loaded from: classes20.dex */
    public static final class C8198b extends GeneratedMessageLite.Builder<ArcRefreshReply, C8198b> implements MessageLiteOrBuilder {
        /* synthetic */ C8198b(C8197a c8197a) {
            this();
        }

        public C8198b clearArc() {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).clearArc();
            return this;
        }

        public C8198b clearLikeConfig() {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).clearLikeConfig();
            return this;
        }

        public C8198b clearOnline() {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).clearOnline();
            return this;
        }

        public C8198b clearOwner() {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).clearOwner();
            return this;
        }

        public C8198b clearReplyStyle() {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).clearReplyStyle();
            return this;
        }

        public C8198b clearReqUser() {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).clearReqUser();
            return this;
        }

        public C8198b clearStat() {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).clearStat();
            return this;
        }

        public SimpleArc getArc() {
            return ((ArcRefreshReply) this.instance).getArc();
        }

        public LikeConfig getLikeConfig() {
            return ((ArcRefreshReply) this.instance).getLikeConfig();
        }

        public Online getOnline() {
            return ((ArcRefreshReply) this.instance).getOnline();
        }

        public SimpleOwner getOwner() {
            return ((ArcRefreshReply) this.instance).getOwner();
        }

        public ReplyStyle getReplyStyle() {
            return ((ArcRefreshReply) this.instance).getReplyStyle();
        }

        public SimpleReqUser getReqUser() {
            return ((ArcRefreshReply) this.instance).getReqUser();
        }

        public Stat getStat() {
            return ((ArcRefreshReply) this.instance).getStat();
        }

        public boolean hasArc() {
            return ((ArcRefreshReply) this.instance).hasArc();
        }

        public boolean hasLikeConfig() {
            return ((ArcRefreshReply) this.instance).hasLikeConfig();
        }

        public boolean hasOnline() {
            return ((ArcRefreshReply) this.instance).hasOnline();
        }

        public boolean hasOwner() {
            return ((ArcRefreshReply) this.instance).hasOwner();
        }

        public boolean hasReplyStyle() {
            return ((ArcRefreshReply) this.instance).hasReplyStyle();
        }

        public boolean hasReqUser() {
            return ((ArcRefreshReply) this.instance).hasReqUser();
        }

        public boolean hasStat() {
            return ((ArcRefreshReply) this.instance).hasStat();
        }

        public C8198b mergeArc(SimpleArc simpleArc) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).mergeArc(simpleArc);
            return this;
        }

        public C8198b mergeLikeConfig(LikeConfig likeConfig) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).mergeLikeConfig(likeConfig);
            return this;
        }

        public C8198b mergeOnline(Online online) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).mergeOnline(online);
            return this;
        }

        public C8198b mergeOwner(SimpleOwner simpleOwner) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).mergeOwner(simpleOwner);
            return this;
        }

        public C8198b mergeReplyStyle(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).mergeReplyStyle(replyStyle);
            return this;
        }

        public C8198b mergeReqUser(SimpleReqUser simpleReqUser) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).mergeReqUser(simpleReqUser);
            return this;
        }

        public C8198b mergeStat(Stat stat) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).mergeStat(stat);
            return this;
        }

        public C8198b setArc(SimpleArc simpleArc) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setArc(simpleArc);
            return this;
        }

        public C8198b setLikeConfig(LikeConfig likeConfig) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setLikeConfig(likeConfig);
            return this;
        }

        public C8198b setOnline(Online online) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setOnline(online);
            return this;
        }

        public C8198b setOwner(SimpleOwner simpleOwner) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setOwner(simpleOwner);
            return this;
        }

        public C8198b setReplyStyle(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setReplyStyle(replyStyle);
            return this;
        }

        public C8198b setReqUser(SimpleReqUser simpleReqUser) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setReqUser(simpleReqUser);
            return this;
        }

        public C8198b setStat(Stat stat) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setStat(stat);
            return this;
        }

        private C8198b() {
            super(ArcRefreshReply.DEFAULT_INSTANCE);
        }

        public C8198b setArc(SimpleArc.C8302b c8302b) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setArc(c8302b.build());
            return this;
        }

        public C8198b setLikeConfig(LikeConfig.C8255b c8255b) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setLikeConfig(c8255b.build());
            return this;
        }

        public C8198b setOnline(Online.Builder c8264b) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setOnline(c8264b.build());
            return this;
        }

        public C8198b setOwner(SimpleOwner.C8304b c8304b) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setOwner(c8304b.build());
            return this;
        }

        public C8198b setReplyStyle(ReplyStyle.Builder c8290b) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setReplyStyle(c8290b.build());
            return this;
        }

        public C8198b setReqUser(SimpleReqUser.C8306b c8306b) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setReqUser(c8306b.build());
            return this;
        }

        public C8198b setStat(Stat.Builder c7974b) {
            copyOnWrite();
            ((ArcRefreshReply) this.instance).setStat(c7974b.build());
            return this;
        }
    }

    static {
        ArcRefreshReply arcRefreshReply = new ArcRefreshReply();
        DEFAULT_INSTANCE = arcRefreshReply;
        GeneratedMessageLite.registerDefaultInstance(ArcRefreshReply.class, arcRefreshReply);
    }

    private ArcRefreshReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArc() {
        this.arc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeConfig() {
        this.likeConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnline() {
        this.online_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplyStyle() {
        this.replyStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqUser() {
        this.reqUser_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
    }

    public static ArcRefreshReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArc(SimpleArc simpleArc) {
        simpleArc.getClass();
        SimpleArc simpleArc2 = this.arc_;
        if (simpleArc2 != null && simpleArc2 != SimpleArc.getDefaultInstance()) {
            this.arc_ = SimpleArc.newBuilder(this.arc_).mergeFrom((SimpleArc) simpleArc).buildPartial();
        } else {
            this.arc_ = simpleArc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLikeConfig(LikeConfig likeConfig) {
        likeConfig.getClass();
        LikeConfig likeConfig2 = this.likeConfig_;
        if (likeConfig2 != null && likeConfig2 != LikeConfig.getDefaultInstance()) {
            this.likeConfig_ = LikeConfig.newBuilder(this.likeConfig_).mergeFrom((LikeConfig) likeConfig).buildPartial();
        } else {
            this.likeConfig_ = likeConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnline(Online online) {
        online.getClass();
        Online online2 = this.online_;
        if (online2 != null && online2 != Online.getDefaultInstance()) {
            this.online_ = Online.newBuilder(this.online_).mergeFrom((Online) online).buildPartial();
        } else {
            this.online_ = online;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOwner(SimpleOwner simpleOwner) {
        simpleOwner.getClass();
        SimpleOwner simpleOwner2 = this.owner_;
        if (simpleOwner2 != null && simpleOwner2 != SimpleOwner.getDefaultInstance()) {
            this.owner_ = SimpleOwner.newBuilder(this.owner_).mergeFrom((SimpleOwner) simpleOwner).buildPartial();
        } else {
            this.owner_ = simpleOwner;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReplyStyle(ReplyStyle replyStyle) {
        replyStyle.getClass();
        ReplyStyle replyStyle2 = this.replyStyle_;
        if (replyStyle2 != null && replyStyle2 != ReplyStyle.getDefaultInstance()) {
            this.replyStyle_ = ReplyStyle.newBuilder(this.replyStyle_).mergeFrom((ReplyStyle) replyStyle).buildPartial();
        } else {
            this.replyStyle_ = replyStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReqUser(SimpleReqUser simpleReqUser) {
        simpleReqUser.getClass();
        SimpleReqUser simpleReqUser2 = this.reqUser_;
        if (simpleReqUser2 != null && simpleReqUser2 != SimpleReqUser.getDefaultInstance()) {
            this.reqUser_ = SimpleReqUser.newBuilder(this.reqUser_).mergeFrom((SimpleReqUser) simpleReqUser).buildPartial();
        } else {
            this.reqUser_ = simpleReqUser;
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

    public static C8198b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArcRefreshReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArcRefreshReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcRefreshReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArcRefreshReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArc(SimpleArc simpleArc) {
        simpleArc.getClass();
        this.arc_ = simpleArc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeConfig(LikeConfig likeConfig) {
        likeConfig.getClass();
        this.likeConfig_ = likeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnline(Online online) {
        online.getClass();
        this.online_ = online;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwner(SimpleOwner simpleOwner) {
        simpleOwner.getClass();
        this.owner_ = simpleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyStyle(ReplyStyle replyStyle) {
        replyStyle.getClass();
        this.replyStyle_ = replyStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqUser(SimpleReqUser simpleReqUser) {
        simpleReqUser.getClass();
        this.reqUser_ = simpleReqUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(Stat stat) {
        stat.getClass();
        this.stat_ = stat;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C8197a c8197a = null;
        switch (C8197a.f18325xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArcRefreshReply();
            case 2:
                return new C8198b(c8197a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"stat_", "reqUser_", "arc_", "online_", "likeConfig_", "owner_", "replyStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArcRefreshReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ArcRefreshReply.class) {
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

    public SimpleArc getArc() {
        SimpleArc simpleArc = this.arc_;
        return simpleArc == null ? SimpleArc.getDefaultInstance() : simpleArc;
    }

    public LikeConfig getLikeConfig() {
        LikeConfig likeConfig = this.likeConfig_;
        return likeConfig == null ? LikeConfig.getDefaultInstance() : likeConfig;
    }

    public Online getOnline() {
        Online online = this.online_;
        return online == null ? Online.getDefaultInstance() : online;
    }

    public SimpleOwner getOwner() {
        SimpleOwner simpleOwner = this.owner_;
        return simpleOwner == null ? SimpleOwner.getDefaultInstance() : simpleOwner;
    }

    public ReplyStyle getReplyStyle() {
        ReplyStyle replyStyle = this.replyStyle_;
        return replyStyle == null ? ReplyStyle.getDefaultInstance() : replyStyle;
    }

    public SimpleReqUser getReqUser() {
        SimpleReqUser simpleReqUser = this.reqUser_;
        return simpleReqUser == null ? SimpleReqUser.getDefaultInstance() : simpleReqUser;
    }

    public Stat getStat() {
        Stat stat = this.stat_;
        return stat == null ? Stat.getDefaultInstance() : stat;
    }

    public boolean hasArc() {
        return this.arc_ != null;
    }

    public boolean hasLikeConfig() {
        return this.likeConfig_ != null;
    }

    public boolean hasOnline() {
        return this.online_ != null;
    }

    public boolean hasOwner() {
        return this.owner_ != null;
    }

    public boolean hasReplyStyle() {
        return this.replyStyle_ != null;
    }

    public boolean hasReqUser() {
        return this.reqUser_ != null;
    }

    public boolean hasStat() {
        return this.stat_ != null;
    }

    public static C8198b newBuilder(ArcRefreshReply arcRefreshReply) {
        return DEFAULT_INSTANCE.createBuilder(arcRefreshReply);
    }

    public static ArcRefreshReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcRefreshReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcRefreshReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArcRefreshReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArcRefreshReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArcRefreshReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArcRefreshReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArcRefreshReply parseFrom(InputStream inputStream) throws IOException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcRefreshReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcRefreshReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArcRefreshReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcRefreshReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
