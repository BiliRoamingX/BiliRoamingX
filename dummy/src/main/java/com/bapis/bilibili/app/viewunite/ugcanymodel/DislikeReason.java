package com.bapis.bilibili.app.viewunite.ugcanymodel;

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
/* loaded from: classes21.dex */
public final class DislikeReason extends GeneratedMessageLite<DislikeReason, DislikeReason.b> implements com.bapis.bilibili.app.viewunite.ugcanymodel.a {
    private static final DislikeReason DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MID_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile Parser<DislikeReason> PARSER = null;
    public static final int RID_FIELD_NUMBER = 3;
    public static final int TAG_ID_FIELD_NUMBER = 4;
    private long id_;
    private long mid_;
    private String name_ = "";
    private int rid_;
    private long tagId_;

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<DislikeReason, b> implements com.bapis.bilibili.app.viewunite.ugcanymodel.a {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearId() {
            copyOnWrite();
            ((DislikeReason) this.instance).clearId();
            return this;
        }

        public b clearMid() {
            copyOnWrite();
            ((DislikeReason) this.instance).clearMid();
            return this;
        }

        public b clearName() {
            copyOnWrite();
            ((DislikeReason) this.instance).clearName();
            return this;
        }

        public b clearRid() {
            copyOnWrite();
            ((DislikeReason) this.instance).clearRid();
            return this;
        }

        public b clearTagId() {
            copyOnWrite();
            ((DislikeReason) this.instance).clearTagId();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
        public long getId() {
            return ((DislikeReason) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
        public long getMid() {
            return ((DislikeReason) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
        public String getName() {
            return ((DislikeReason) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
        public ByteString getNameBytes() {
            return ((DislikeReason) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
        public int getRid() {
            return ((DislikeReason) this.instance).getRid();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
        public long getTagId() {
            return ((DislikeReason) this.instance).getTagId();
        }

        public b setId(long j2) {
            copyOnWrite();
            ((DislikeReason) this.instance).setId(j2);
            return this;
        }

        public b setMid(long j2) {
            copyOnWrite();
            ((DislikeReason) this.instance).setMid(j2);
            return this;
        }

        public b setName(String str) {
            copyOnWrite();
            ((DislikeReason) this.instance).setName(str);
            return this;
        }

        public b setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DislikeReason) this.instance).setNameBytes(byteString);
            return this;
        }

        public b setRid(int i2) {
            copyOnWrite();
            ((DislikeReason) this.instance).setRid(i2);
            return this;
        }

        public b setTagId(long j2) {
            copyOnWrite();
            ((DislikeReason) this.instance).setTagId(j2);
            return this;
        }

        private b() {
            super(DislikeReason.DEFAULT_INSTANCE);
        }
    }

    static {
        DislikeReason dislikeReason = new DislikeReason();
        DEFAULT_INSTANCE = dislikeReason;
        GeneratedMessageLite.registerDefaultInstance(DislikeReason.class, dislikeReason);
    }

    private DislikeReason() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRid() {
        this.rid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagId() {
        this.tagId_ = 0L;
    }

    public static DislikeReason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DislikeReason parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DislikeReason parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DislikeReason> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j2) {
        this.mid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRid(int i2) {
        this.rid_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagId(long j2) {
        this.tagId_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new DislikeReason();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0004\u0004\u0002\u0005\u0208", new Object[]{"id_", "mid_", "rid_", "tagId_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DislikeReason> parser = PARSER;
                if (parser == null) {
                    synchronized (DislikeReason.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
    public int getRid() {
        return this.rid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.a
    public long getTagId() {
        return this.tagId_;
    }

    public static b newBuilder(DislikeReason dislikeReason) {
        return DEFAULT_INSTANCE.createBuilder(dislikeReason);
    }

    public static DislikeReason parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DislikeReason parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DislikeReason parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(InputStream inputStream) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DislikeReason parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DislikeReason parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
