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
public final class SubjectID extends GeneratedMessageLite<SubjectID, SubjectID.C10711b> implements MessageLiteOrBuilder {
    private static final SubjectID DEFAULT_INSTANCE;
    public static final int OID_FIELD_NUMBER = 1;
    private static volatile Parser<SubjectID> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private long oid_;
    private long type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.SubjectID$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C10710a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19168xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19168xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19168xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19168xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19168xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19168xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19168xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19168xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.SubjectID$b */
    /* loaded from: classes21.dex */
    public static final class C10711b extends GeneratedMessageLite.Builder<SubjectID, C10711b> implements MessageLiteOrBuilder {
        /* synthetic */ C10711b(C10710a c10710a) {
            this();
        }

        public C10711b clearOid() {
            copyOnWrite();
            ((SubjectID) this.instance).clearOid();
            return this;
        }

        public C10711b clearType() {
            copyOnWrite();
            ((SubjectID) this.instance).clearType();
            return this;
        }

        public long getOid() {
            return ((SubjectID) this.instance).getOid();
        }

        public long getType() {
            return ((SubjectID) this.instance).getType();
        }

        public C10711b setOid(long j2) {
            copyOnWrite();
            ((SubjectID) this.instance).setOid(j2);
            return this;
        }

        public C10711b setType(long j2) {
            copyOnWrite();
            ((SubjectID) this.instance).setType(j2);
            return this;
        }

        private C10711b() {
            super(SubjectID.DEFAULT_INSTANCE);
        }
    }

    static {
        SubjectID subjectID = new SubjectID();
        DEFAULT_INSTANCE = subjectID;
        GeneratedMessageLite.registerDefaultInstance(SubjectID.class, subjectID);
    }

    private SubjectID() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0L;
    }

    public static SubjectID getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10711b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SubjectID parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SubjectID) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubjectID parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SubjectID> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j2) {
        this.oid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j2) {
        this.type_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C10710a c10710a = null;
        switch (C10710a.f19168xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SubjectID();
            case 2:
                return new C10711b(c10710a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"oid_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SubjectID> parser = PARSER;
                if (parser == null) {
                    synchronized (SubjectID.class) {
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

    public long getOid() {
        return this.oid_;
    }

    public long getType() {
        return this.type_;
    }

    public static C10711b newBuilder(SubjectID subjectID) {
        return DEFAULT_INSTANCE.createBuilder(subjectID);
    }

    public static SubjectID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectID) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubjectID parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SubjectID parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SubjectID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SubjectID parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubjectID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SubjectID parseFrom(InputStream inputStream) throws IOException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubjectID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubjectID parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SubjectID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectID) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
