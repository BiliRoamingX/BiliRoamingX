package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.AttentionRelationStatus;
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
public final class SimpleOwner extends GeneratedMessageLite<SimpleOwner, SimpleOwner.C8304b> implements MessageLiteOrBuilder {
    public static final int ATTENTION_RELATION_FIELD_NUMBER = 1;
    private static final SimpleOwner DEFAULT_INSTANCE;
    private static volatile Parser<SimpleOwner> PARSER;
    private int attentionRelation_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.SimpleOwner$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C8303a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18369xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18369xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18369xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18369xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18369xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18369xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18369xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18369xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.SimpleOwner$b */
    /* loaded from: classes20.dex */
    public static final class C8304b extends GeneratedMessageLite.Builder<SimpleOwner, C8304b> implements MessageLiteOrBuilder {
        /* synthetic */ C8304b(C8303a c8303a) {
            this();
        }

        public C8304b clearAttentionRelation() {
            copyOnWrite();
            ((SimpleOwner) this.instance).clearAttentionRelation();
            return this;
        }

        public AttentionRelationStatus getAttentionRelation() {
            return ((SimpleOwner) this.instance).getAttentionRelation();
        }

        public int getAttentionRelationValue() {
            return ((SimpleOwner) this.instance).getAttentionRelationValue();
        }

        public C8304b setAttentionRelation(AttentionRelationStatus attentionRelationStatus) {
            copyOnWrite();
            ((SimpleOwner) this.instance).setAttentionRelation(attentionRelationStatus);
            return this;
        }

        public C8304b setAttentionRelationValue(int i2) {
            copyOnWrite();
            ((SimpleOwner) this.instance).setAttentionRelationValue(i2);
            return this;
        }

        private C8304b() {
            super(SimpleOwner.DEFAULT_INSTANCE);
        }
    }

    static {
        SimpleOwner simpleOwner = new SimpleOwner();
        DEFAULT_INSTANCE = simpleOwner;
        GeneratedMessageLite.registerDefaultInstance(SimpleOwner.class, simpleOwner);
    }

    private SimpleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttentionRelation() {
        this.attentionRelation_ = 0;
    }

    public static SimpleOwner getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8304b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SimpleOwner parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SimpleOwner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleOwner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SimpleOwner> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttentionRelation(AttentionRelationStatus attentionRelationStatus) {
        this.attentionRelation_ = attentionRelationStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttentionRelationValue(int i2) {
        this.attentionRelation_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C8303a c8303a = null;
        switch (C8303a.f18369xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SimpleOwner();
            case 2:
                return new C8304b(c8303a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"attentionRelation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SimpleOwner> parser = PARSER;
                if (parser == null) {
                    synchronized (SimpleOwner.class) {
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

    public AttentionRelationStatus getAttentionRelation() {
        AttentionRelationStatus forNumber = AttentionRelationStatus.forNumber(this.attentionRelation_);
        return forNumber == null ? AttentionRelationStatus.UNRECOGNIZED : forNumber;
    }

    public int getAttentionRelationValue() {
        return this.attentionRelation_;
    }

    public static C8304b newBuilder(SimpleOwner simpleOwner) {
        return DEFAULT_INSTANCE.createBuilder(simpleOwner);
    }

    public static SimpleOwner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleOwner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleOwner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SimpleOwner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SimpleOwner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SimpleOwner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SimpleOwner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SimpleOwner parseFrom(InputStream inputStream) throws IOException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleOwner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleOwner parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SimpleOwner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleOwner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
