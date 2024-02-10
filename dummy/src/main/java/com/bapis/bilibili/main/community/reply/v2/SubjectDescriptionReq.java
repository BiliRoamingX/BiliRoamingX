package com.bapis.bilibili.main.community.reply.v2;

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
public final class SubjectDescriptionReq extends GeneratedMessageLite<SubjectDescriptionReq, SubjectDescriptionReq.C10709b> implements MessageLiteOrBuilder {
    private static final SubjectDescriptionReq DEFAULT_INSTANCE;
    private static volatile Parser<SubjectDescriptionReq> PARSER = null;
    public static final int PLAYER_PARAMS_FIELD_NUMBER = 2;
    public static final int SUBJECT_ID_FIELD_NUMBER = 1;
    private PlayerParams playerParams_;
    private SubjectID subjectId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReq$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C10708a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19167xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19167xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19167xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19167xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19167xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19167xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19167xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19167xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReq$b */
    /* loaded from: classes21.dex */
    public static final class C10709b extends GeneratedMessageLite.Builder<SubjectDescriptionReq, C10709b> implements MessageLiteOrBuilder {
        /* synthetic */ C10709b(C10708a c10708a) {
            this();
        }

        public C10709b clearPlayerParams() {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).clearPlayerParams();
            return this;
        }

        public C10709b clearSubjectId() {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).clearSubjectId();
            return this;
        }

        public PlayerParams getPlayerParams() {
            return ((SubjectDescriptionReq) this.instance).getPlayerParams();
        }

        public SubjectID getSubjectId() {
            return ((SubjectDescriptionReq) this.instance).getSubjectId();
        }

        public boolean hasPlayerParams() {
            return ((SubjectDescriptionReq) this.instance).hasPlayerParams();
        }

        public boolean hasSubjectId() {
            return ((SubjectDescriptionReq) this.instance).hasSubjectId();
        }

        public C10709b mergePlayerParams(PlayerParams playerParams) {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).mergePlayerParams(playerParams);
            return this;
        }

        public C10709b mergeSubjectId(SubjectID subjectID) {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).mergeSubjectId(subjectID);
            return this;
        }

        public C10709b setPlayerParams(PlayerParams playerParams) {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).setPlayerParams(playerParams);
            return this;
        }

        public C10709b setSubjectId(SubjectID subjectID) {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).setSubjectId(subjectID);
            return this;
        }

        private C10709b() {
            super(SubjectDescriptionReq.DEFAULT_INSTANCE);
        }

        public C10709b setPlayerParams(PlayerParams.C10693b c10693b) {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).setPlayerParams(c10693b.build());
            return this;
        }

        public C10709b setSubjectId(SubjectID.C10711b c10711b) {
            copyOnWrite();
            ((SubjectDescriptionReq) this.instance).setSubjectId(c10711b.build());
            return this;
        }
    }

    static {
        SubjectDescriptionReq subjectDescriptionReq = new SubjectDescriptionReq();
        DEFAULT_INSTANCE = subjectDescriptionReq;
        GeneratedMessageLite.registerDefaultInstance(SubjectDescriptionReq.class, subjectDescriptionReq);
    }

    private SubjectDescriptionReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerParams() {
        this.playerParams_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubjectId() {
        this.subjectId_ = null;
    }

    public static SubjectDescriptionReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerParams(PlayerParams playerParams) {
        playerParams.getClass();
        PlayerParams playerParams2 = this.playerParams_;
        if (playerParams2 != null && playerParams2 != PlayerParams.getDefaultInstance()) {
            this.playerParams_ = PlayerParams.newBuilder(this.playerParams_).mergeFrom((PlayerParams) playerParams).buildPartial();
        } else {
            this.playerParams_ = playerParams;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubjectId(SubjectID subjectID) {
        subjectID.getClass();
        SubjectID subjectID2 = this.subjectId_;
        if (subjectID2 != null && subjectID2 != SubjectID.getDefaultInstance()) {
            this.subjectId_ = SubjectID.newBuilder(this.subjectId_).mergeFrom((SubjectID) subjectID).buildPartial();
        } else {
            this.subjectId_ = subjectID;
        }
    }

    public static C10709b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SubjectDescriptionReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubjectDescriptionReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SubjectDescriptionReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerParams(PlayerParams playerParams) {
        playerParams.getClass();
        this.playerParams_ = playerParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectId(SubjectID subjectID) {
        subjectID.getClass();
        this.subjectId_ = subjectID;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C10708a c10708a = null;
        switch (C10708a.f19167xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SubjectDescriptionReq();
            case 2:
                return new C10709b(c10708a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"subjectId_", "playerParams_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SubjectDescriptionReq> parser = PARSER;
                if (parser == null) {
                    synchronized (SubjectDescriptionReq.class) {
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

    public PlayerParams getPlayerParams() {
        PlayerParams playerParams = this.playerParams_;
        return playerParams == null ? PlayerParams.getDefaultInstance() : playerParams;
    }

    public SubjectID getSubjectId() {
        SubjectID subjectID = this.subjectId_;
        return subjectID == null ? SubjectID.getDefaultInstance() : subjectID;
    }

    public boolean hasPlayerParams() {
        return this.playerParams_ != null;
    }

    public boolean hasSubjectId() {
        return this.subjectId_ != null;
    }

    public static C10709b newBuilder(SubjectDescriptionReq subjectDescriptionReq) {
        return DEFAULT_INSTANCE.createBuilder(subjectDescriptionReq);
    }

    public static SubjectDescriptionReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubjectDescriptionReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SubjectDescriptionReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SubjectDescriptionReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SubjectDescriptionReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubjectDescriptionReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SubjectDescriptionReq parseFrom(InputStream inputStream) throws IOException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubjectDescriptionReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubjectDescriptionReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SubjectDescriptionReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectDescriptionReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
