package com.bapis.bilibili.app.interfaces.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class UserModel extends GeneratedMessageLite<UserModel, UserModel.C6358b> implements InterfaceC6386x {
    private static final UserModel DEFAULT_INSTANCE;
    public static final int IS_FORCED_FIELD_NUMBER = 6;
    public static final int IS_PARENT_CONTROL_FIELD_NUMBER = 9;
    public static final int MID_FIELD_NUMBER = 1;
    public static final int MODE_FIELD_NUMBER = 2;
    public static final int MUST_REAL_NAME_FIELD_NUMBER = 8;
    public static final int MUST_TEEN_FIELD_NUMBER = 7;
    private static volatile Parser<UserModel> PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 5;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int WSXCDE_FIELD_NUMBER = 3;
    private boolean isForced_;
    private boolean isParentControl_;
    private long mid_;
    private boolean mustRealName_;
    private boolean mustTeen_;
    private Policy policy_;
    private int status_;
    private String mode_ = "";
    private String wsxcde_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.UserModel$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C6357a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17603xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17603xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17603xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.UserModel$b */
    /* loaded from: classes19.dex */
    public static final class C6358b extends GeneratedMessageLite.Builder<UserModel, C6358b> implements InterfaceC6386x {
        /* synthetic */ C6358b(C6357a c6357a) {
            this();
        }

        public C6358b clearIsForced() {
            copyOnWrite();
            ((UserModel) this.instance).clearIsForced();
            return this;
        }

        public C6358b clearIsParentControl() {
            copyOnWrite();
            ((UserModel) this.instance).clearIsParentControl();
            return this;
        }

        public C6358b clearMid() {
            copyOnWrite();
            ((UserModel) this.instance).clearMid();
            return this;
        }

        public C6358b clearMode() {
            copyOnWrite();
            ((UserModel) this.instance).clearMode();
            return this;
        }

        public C6358b clearMustRealName() {
            copyOnWrite();
            ((UserModel) this.instance).clearMustRealName();
            return this;
        }

        public C6358b clearMustTeen() {
            copyOnWrite();
            ((UserModel) this.instance).clearMustTeen();
            return this;
        }

        public C6358b clearPolicy() {
            copyOnWrite();
            ((UserModel) this.instance).clearPolicy();
            return this;
        }

        public C6358b clearStatus() {
            copyOnWrite();
            ((UserModel) this.instance).clearStatus();
            return this;
        }

        public C6358b clearWsxcde() {
            copyOnWrite();
            ((UserModel) this.instance).clearWsxcde();
            return this;
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public boolean getIsForced() {
            return ((UserModel) this.instance).getIsForced();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public boolean getIsParentControl() {
            return ((UserModel) this.instance).getIsParentControl();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public long getMid() {
            return ((UserModel) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public String getMode() {
            return ((UserModel) this.instance).getMode();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public ByteString getModeBytes() {
            return ((UserModel) this.instance).getModeBytes();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public boolean getMustRealName() {
            return ((UserModel) this.instance).getMustRealName();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public boolean getMustTeen() {
            return ((UserModel) this.instance).getMustTeen();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public Policy getPolicy() {
            return ((UserModel) this.instance).getPolicy();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public ModelStatus getStatus() {
            return ((UserModel) this.instance).getStatus();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public int getStatusValue() {
            return ((UserModel) this.instance).getStatusValue();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public String getWsxcde() {
            return ((UserModel) this.instance).getWsxcde();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public ByteString getWsxcdeBytes() {
            return ((UserModel) this.instance).getWsxcdeBytes();
        }

        @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
        public boolean hasPolicy() {
            return ((UserModel) this.instance).hasPolicy();
        }

        public C6358b mergePolicy(Policy policy) {
            copyOnWrite();
            ((UserModel) this.instance).mergePolicy(policy);
            return this;
        }

        public C6358b setIsForced(boolean z) {
            copyOnWrite();
            ((UserModel) this.instance).setIsForced(z);
            return this;
        }

        public C6358b setIsParentControl(boolean z) {
            copyOnWrite();
            ((UserModel) this.instance).setIsParentControl(z);
            return this;
        }

        public C6358b setMid(long j2) {
            copyOnWrite();
            ((UserModel) this.instance).setMid(j2);
            return this;
        }

        public C6358b setMode(String str) {
            copyOnWrite();
            ((UserModel) this.instance).setMode(str);
            return this;
        }

        public C6358b setModeBytes(ByteString byteString) {
            copyOnWrite();
            ((UserModel) this.instance).setModeBytes(byteString);
            return this;
        }

        public C6358b setMustRealName(boolean z) {
            copyOnWrite();
            ((UserModel) this.instance).setMustRealName(z);
            return this;
        }

        public C6358b setMustTeen(boolean z) {
            copyOnWrite();
            ((UserModel) this.instance).setMustTeen(z);
            return this;
        }

        public C6358b setPolicy(Policy policy) {
            copyOnWrite();
            ((UserModel) this.instance).setPolicy(policy);
            return this;
        }

        public C6358b setStatus(ModelStatus modelStatus) {
            copyOnWrite();
            ((UserModel) this.instance).setStatus(modelStatus);
            return this;
        }

        public C6358b setStatusValue(int i2) {
            copyOnWrite();
            ((UserModel) this.instance).setStatusValue(i2);
            return this;
        }

        public C6358b setWsxcde(String str) {
            copyOnWrite();
            ((UserModel) this.instance).setWsxcde(str);
            return this;
        }

        public C6358b setWsxcdeBytes(ByteString byteString) {
            copyOnWrite();
            ((UserModel) this.instance).setWsxcdeBytes(byteString);
            return this;
        }

        private C6358b() {
            super(UserModel.DEFAULT_INSTANCE);
        }

        public C6358b setPolicy(Policy.C6308b c6308b) {
            copyOnWrite();
            ((UserModel) this.instance).setPolicy(c6308b.build());
            return this;
        }
    }

    static {
        UserModel userModel = new UserModel();
        DEFAULT_INSTANCE = userModel;
        GeneratedMessageLite.registerDefaultInstance(UserModel.class, userModel);
    }

    private UserModel() {
    }

    public void clearIsForced() {
        this.isForced_ = false;
    }

    public void clearIsParentControl() {
        this.isParentControl_ = false;
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearMode() {
        this.mode_ = getDefaultInstance().getMode();
    }

    public void clearMustRealName() {
        this.mustRealName_ = false;
    }

    public void clearMustTeen() {
        this.mustTeen_ = false;
    }

    public void clearPolicy() {
        this.policy_ = null;
    }

    public void clearStatus() {
        this.status_ = 0;
    }

    public void clearWsxcde() {
        this.wsxcde_ = getDefaultInstance().getWsxcde();
    }

    public static UserModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergePolicy(Policy policy) {
        policy.getClass();
        Policy policy2 = this.policy_;
        if (policy2 != null && policy2 != Policy.getDefaultInstance()) {
            this.policy_ = Policy.newBuilder(this.policy_).mergeFrom((Policy) policy).buildPartial();
        } else {
            this.policy_ = policy;
        }
    }

    public static C6358b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIsForced(boolean z) {
        this.isForced_ = z;
    }

    public void setIsParentControl(boolean z) {
        this.isParentControl_ = z;
    }

    public void setMid(long j2) {
        this.mid_ = j2;
    }

    public void setMode(String str) {
        str.getClass();
        this.mode_ = str;
    }

    public void setModeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mode_ = byteString.toStringUtf8();
    }

    public void setMustRealName(boolean z) {
        this.mustRealName_ = z;
    }

    public void setMustTeen(boolean z) {
        this.mustTeen_ = z;
    }

    public void setPolicy(Policy policy) {
        policy.getClass();
        this.policy_ = policy;
    }

    public void setStatus(ModelStatus modelStatus) {
        this.status_ = modelStatus.getNumber();
    }

    public void setStatusValue(int i2) {
        this.status_ = i2;
    }

    public void setWsxcde(String str) {
        str.getClass();
        this.wsxcde_ = str;
    }

    public void setWsxcdeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wsxcde_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6357a c6357a = null;
        switch (C6357a.f17603xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserModel();
            case 2:
                return new C6358b(c6357a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\f\u0005\t\u0006\u0007\u0007\u0007\b\u0007\t\u0007", new Object[]{"mid_", "mode_", "wsxcde_", "status_", "policy_", "isForced_", "mustTeen_", "mustRealName_", "isParentControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserModel> parser = PARSER;
                if (parser == null) {
                    synchronized (UserModel.class) {
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

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public boolean getIsForced() {
        return this.isForced_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public boolean getIsParentControl() {
        return this.isParentControl_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public String getMode() {
        return this.mode_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public ByteString getModeBytes() {
        return ByteString.copyFromUtf8(this.mode_);
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public boolean getMustRealName() {
        return this.mustRealName_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public boolean getMustTeen() {
        return this.mustTeen_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public Policy getPolicy() {
        Policy policy = this.policy_;
        return policy == null ? Policy.getDefaultInstance() : policy;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public ModelStatus getStatus() {
        ModelStatus forNumber = ModelStatus.forNumber(this.status_);
        return forNumber == null ? ModelStatus.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public int getStatusValue() {
        return this.status_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public String getWsxcde() {
        return this.wsxcde_;
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public ByteString getWsxcdeBytes() {
        return ByteString.copyFromUtf8(this.wsxcde_);
    }

    @Override // com.bapis.bilibili.app.interfaces.v1.InterfaceC6386x
    public boolean hasPolicy() {
        return this.policy_ != null;
    }

    public static C6358b newBuilder(UserModel userModel) {
        return DEFAULT_INSTANCE.createBuilder(userModel);
    }

    public static UserModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserModel parseFrom(InputStream inputStream) throws IOException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
