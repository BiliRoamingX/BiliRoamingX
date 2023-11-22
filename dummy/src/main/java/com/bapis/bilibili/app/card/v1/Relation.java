package com.bapis.bilibili.app.card.v1;

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
/* loaded from: classes13.dex */
public final class Relation extends GeneratedMessageLite<Relation, Relation.C5855b> implements MessageLiteOrBuilder {
    private static final Relation DEFAULT_INSTANCE;
    public static final int IS_FOLLOWED_FIELD_NUMBER = 3;
    public static final int IS_FOLLOW_FIELD_NUMBER = 2;
    private static volatile Parser<Relation> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int isFollow_;
    private int isFollowed_;
    private int status_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Relation$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5854a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15976xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15976xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15976xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Relation$b */
    /* loaded from: classes13.dex */
    public static final class C5855b extends GeneratedMessageLite.Builder<Relation, C5855b> implements MessageLiteOrBuilder {
        /* synthetic */ C5855b(C5854a c5854a) {
            this();
        }

        public C5855b clearIsFollow() {
            copyOnWrite();
            ((Relation) this.instance).clearIsFollow();
            return this;
        }

        public C5855b clearIsFollowed() {
            copyOnWrite();
            ((Relation) this.instance).clearIsFollowed();
            return this;
        }

        public C5855b clearStatus() {
            copyOnWrite();
            ((Relation) this.instance).clearStatus();
            return this;
        }

        public int getIsFollow() {
            return ((Relation) this.instance).getIsFollow();
        }

        public int getIsFollowed() {
            return ((Relation) this.instance).getIsFollowed();
        }

        public int getStatus() {
            return ((Relation) this.instance).getStatus();
        }

        public C5855b setIsFollow(int i) {
            copyOnWrite();
            ((Relation) this.instance).setIsFollow(i);
            return this;
        }

        public C5855b setIsFollowed(int i) {
            copyOnWrite();
            ((Relation) this.instance).setIsFollowed(i);
            return this;
        }

        public C5855b setStatus(int i) {
            copyOnWrite();
            ((Relation) this.instance).setStatus(i);
            return this;
        }

        private C5855b() {
            super(Relation.DEFAULT_INSTANCE);
        }
    }

    static {
        Relation relation = new Relation();
        DEFAULT_INSTANCE = relation;
        GeneratedMessageLite.registerDefaultInstance(Relation.class, relation);
    }

    private Relation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollow() {
        this.isFollow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollowed() {
        this.isFollowed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static Relation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5855b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Relation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Relation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Relation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollow(int i) {
        this.isFollow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollowed(int i) {
        this.isFollowed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5854a.f15976xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Relation();
            case 2:
                return new C5855b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"status_", "isFollow_", "isFollowed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Relation> parser = PARSER;
                if (parser == null) {
                    synchronized (Relation.class) {
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

    public int getIsFollow() {
        return this.isFollow_;
    }

    public int getIsFollowed() {
        return this.isFollowed_;
    }

    public int getStatus() {
        return this.status_;
    }

    public static C5855b newBuilder(Relation relation) {
        return DEFAULT_INSTANCE.createBuilder(relation);
    }

    public static Relation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Relation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Relation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Relation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Relation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Relation parseFrom(InputStream inputStream) throws IOException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Relation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
