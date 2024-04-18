package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class DislikeReasons extends GeneratedMessageLite<DislikeReasons, DislikeReasons.Builder> implements DislikeReasonsOrBuilder {
    private static final DislikeReasons DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MID_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile Parser<DislikeReasons> PARSER = null;
    public static final int RID_FIELD_NUMBER = 3;
    public static final int TAG_ID_FIELD_NUMBER = 4;
    private long id_;
    private long mid_;
    private String name_ = "";
    private int rid_;
    private long tagId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.DislikeReasons$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67561 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16729xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16729xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16729xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16729xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16729xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16729xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16729xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16729xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DislikeReasons, Builder> implements DislikeReasonsOrBuilder {
        /* synthetic */ Builder(C67561 c67561) {
            this();
        }

        public Builder clearId() {
            copyOnWrite();
            ((DislikeReasons) this.instance).clearId();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((DislikeReasons) this.instance).clearMid();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DislikeReasons) this.instance).clearName();
            return this;
        }

        public Builder clearRid() {
            copyOnWrite();
            ((DislikeReasons) this.instance).clearRid();
            return this;
        }

        public Builder clearTagId() {
            copyOnWrite();
            ((DislikeReasons) this.instance).clearTagId();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
        public long getId() {
            return ((DislikeReasons) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
        public long getMid() {
            return ((DislikeReasons) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
        public String getName() {
            return ((DislikeReasons) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
        public ByteString getNameBytes() {
            return ((DislikeReasons) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
        public int getRid() {
            return ((DislikeReasons) this.instance).getRid();
        }

        @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
        public long getTagId() {
            return ((DislikeReasons) this.instance).getTagId();
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((DislikeReasons) this.instance).setId(j);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((DislikeReasons) this.instance).setMid(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DislikeReasons) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DislikeReasons) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setRid(int i) {
            copyOnWrite();
            ((DislikeReasons) this.instance).setRid(i);
            return this;
        }

        public Builder setTagId(long j) {
            copyOnWrite();
            ((DislikeReasons) this.instance).setTagId(j);
            return this;
        }

        private Builder() {
            super(DislikeReasons.DEFAULT_INSTANCE);
        }
    }

    static {
        DislikeReasons dislikeReasons = new DislikeReasons();
        DEFAULT_INSTANCE = dislikeReasons;
        GeneratedMessageLite.registerDefaultInstance(DislikeReasons.class, dislikeReasons);
    }

    private DislikeReasons() {
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

    public static DislikeReasons getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DislikeReasons parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DislikeReasons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DislikeReasons parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DislikeReasons> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
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
    public void setRid(int i) {
        this.rid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagId(long j) {
        this.tagId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67561.f16729xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DislikeReasons();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0004\u0004\u0002\u0005\u0208", new Object[]{"id_", "mid_", "rid_", "tagId_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DislikeReasons> parser = PARSER;
                if (parser == null) {
                    synchronized (DislikeReasons.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
    public int getRid() {
        return this.rid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.DislikeReasonsOrBuilder
    public long getTagId() {
        return this.tagId_;
    }

    public static Builder newBuilder(DislikeReasons dislikeReasons) {
        return DEFAULT_INSTANCE.createBuilder(dislikeReasons);
    }

    public static DislikeReasons parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReasons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DislikeReasons parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DislikeReasons parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DislikeReasons parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DislikeReasons parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DislikeReasons parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DislikeReasons parseFrom(InputStream inputStream) throws IOException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DislikeReasons parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DislikeReasons parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DislikeReasons parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
