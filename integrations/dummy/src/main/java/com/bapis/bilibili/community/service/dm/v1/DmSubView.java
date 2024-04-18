package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes20.dex */
public final class DmSubView extends GeneratedMessageLite<DmSubView, DmSubView.C9023b> implements InterfaceC9135j {
    private static final DmSubView DEFAULT_INSTANCE;
    public static final int OID_FIELD_NUMBER = 2;
    private static volatile Parser<DmSubView> PARSER = null;
    public static final int PID_FIELD_NUMBER = 3;
    public static final int POST_PANEL_2_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    private long oid_;
    private long pid_;
    private Internal.ProtobufList<PostPanelV2> postPanel2_ = GeneratedMessageLite.emptyProtobufList();
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmSubView$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C9022a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18607xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18607xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18607xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18607xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18607xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18607xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18607xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18607xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmSubView$b */
    /* loaded from: classes20.dex */
    public static final class C9023b extends GeneratedMessageLite.Builder<DmSubView, C9023b> implements InterfaceC9135j {
        /* synthetic */ C9023b(C9022a c9022a) {
            this();
        }

        public C9023b addAllPostPanel2(Iterable<? extends PostPanelV2> iterable) {
            copyOnWrite();
            ((DmSubView) this.instance).addAllPostPanel2(iterable);
            return this;
        }

        public C9023b addPostPanel2(PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmSubView) this.instance).addPostPanel2(postPanelV2);
            return this;
        }

        public C9023b clearOid() {
            copyOnWrite();
            ((DmSubView) this.instance).clearOid();
            return this;
        }

        public C9023b clearPid() {
            copyOnWrite();
            ((DmSubView) this.instance).clearPid();
            return this;
        }

        public C9023b clearPostPanel2() {
            copyOnWrite();
            ((DmSubView) this.instance).clearPostPanel2();
            return this;
        }

        public C9023b clearType() {
            copyOnWrite();
            ((DmSubView) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
        public long getOid() {
            return ((DmSubView) this.instance).getOid();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
        public long getPid() {
            return ((DmSubView) this.instance).getPid();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
        public PostPanelV2 getPostPanel2(int i2) {
            return ((DmSubView) this.instance).getPostPanel2(i2);
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
        public int getPostPanel2Count() {
            return ((DmSubView) this.instance).getPostPanel2Count();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
        public List<PostPanelV2> getPostPanel2List() {
            return Collections.unmodifiableList(((DmSubView) this.instance).getPostPanel2List());
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
        public int getType() {
            return ((DmSubView) this.instance).getType();
        }

        public C9023b removePostPanel2(int i2) {
            copyOnWrite();
            ((DmSubView) this.instance).removePostPanel2(i2);
            return this;
        }

        public C9023b setOid(long j2) {
            copyOnWrite();
            ((DmSubView) this.instance).setOid(j2);
            return this;
        }

        public C9023b setPid(long j2) {
            copyOnWrite();
            ((DmSubView) this.instance).setPid(j2);
            return this;
        }

        public C9023b setPostPanel2(int i2, PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmSubView) this.instance).setPostPanel2(i2, postPanelV2);
            return this;
        }

        public C9023b setType(int i2) {
            copyOnWrite();
            ((DmSubView) this.instance).setType(i2);
            return this;
        }

        private C9023b() {
            super(DmSubView.DEFAULT_INSTANCE);
        }

        public C9023b addPostPanel2(int i2, PostPanelV2 postPanelV2) {
            copyOnWrite();
            ((DmSubView) this.instance).addPostPanel2(i2, postPanelV2);
            return this;
        }

        public C9023b setPostPanel2(int i2, PostPanelV2.Builder c9089b) {
            copyOnWrite();
            ((DmSubView) this.instance).setPostPanel2(i2, c9089b.build());
            return this;
        }

        public C9023b addPostPanel2(PostPanelV2.Builder c9089b) {
            copyOnWrite();
            ((DmSubView) this.instance).addPostPanel2(c9089b.build());
            return this;
        }

        public C9023b addPostPanel2(int i2, PostPanelV2.Builder c9089b) {
            copyOnWrite();
            ((DmSubView) this.instance).addPostPanel2(i2, c9089b.build());
            return this;
        }
    }

    static {
        DmSubView dmSubView = new DmSubView();
        DEFAULT_INSTANCE = dmSubView;
        GeneratedMessageLite.registerDefaultInstance(DmSubView.class, dmSubView);
    }

    private DmSubView() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPostPanel2(Iterable<? extends PostPanelV2> iterable) {
        ensurePostPanel2IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.postPanel2_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel2(PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.add(postPanelV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostPanel2() {
        this.postPanel2_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensurePostPanel2IsMutable() {
        Internal.ProtobufList<PostPanelV2> protobufList = this.postPanel2_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.postPanel2_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DmSubView getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9023b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmSubView parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmSubView) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSubView parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmSubView> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePostPanel2(int i2) {
        ensurePostPanel2IsMutable();
        this.postPanel2_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j2) {
        this.oid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(long j2) {
        this.pid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostPanel2(int i2, PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.set(i2, postPanelV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C9022a c9022a = null;
        switch (C9022a.f18607xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmSubView();
            case 2:
                return new C9023b(c9022a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\u001b", new Object[]{"type_", "oid_", "pid_", "postPanel2_", PostPanelV2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmSubView> parser = PARSER;
                if (parser == null) {
                    synchronized (DmSubView.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
    public long getOid() {
        return this.oid_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
    public long getPid() {
        return this.pid_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
    public PostPanelV2 getPostPanel2(int i2) {
        return this.postPanel2_.get(i2);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
    public int getPostPanel2Count() {
        return this.postPanel2_.size();
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
    public List<PostPanelV2> getPostPanel2List() {
        return this.postPanel2_;
    }

    public PostPanelV2OrBuilder getPostPanel2OrBuilder(int i2) {
        return this.postPanel2_.get(i2);
    }

    public List<? extends PostPanelV2OrBuilder> getPostPanel2OrBuilderList() {
        return this.postPanel2_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC9135j
    public int getType() {
        return this.type_;
    }

    public static C9023b newBuilder(DmSubView dmSubView) {
        return DEFAULT_INSTANCE.createBuilder(dmSubView);
    }

    public static DmSubView parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSubView) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSubView parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmSubView parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPostPanel2(int i2, PostPanelV2 postPanelV2) {
        postPanelV2.getClass();
        ensurePostPanel2IsMutable();
        this.postPanel2_.add(i2, postPanelV2);
    }

    public static DmSubView parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmSubView parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmSubView parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmSubView parseFrom(InputStream inputStream) throws IOException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSubView parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSubView parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmSubView parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSubView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
