package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class UpArgs extends GeneratedMessageLite<UpArgs, UpArgs.C5916b> implements MessageLiteOrBuilder {
    private static final UpArgs DEFAULT_INSTANCE;
    private static volatile Parser<UpArgs> PARSER = null;
    public static final int SELECTED_FIELD_NUMBER = 4;
    public static final int UP_FACE_FIELD_NUMBER = 3;
    public static final int UP_ID_FIELD_NUMBER = 1;
    public static final int UP_NAME_FIELD_NUMBER = 2;
    private long selected_;
    private long upId_;
    private String upName_ = "";
    private String upFace_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.UpArgs$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5915a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16006xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16006xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16006xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.UpArgs$b */
    /* loaded from: classes13.dex */
    public static final class C5916b extends GeneratedMessageLite.Builder<UpArgs, C5916b> implements MessageLiteOrBuilder {
        /* synthetic */ C5916b(C5915a c5915a) {
            this();
        }

        public C5916b clearSelected() {
            copyOnWrite();
            ((UpArgs) this.instance).clearSelected();
            return this;
        }

        public C5916b clearUpFace() {
            copyOnWrite();
            ((UpArgs) this.instance).clearUpFace();
            return this;
        }

        public C5916b clearUpId() {
            copyOnWrite();
            ((UpArgs) this.instance).clearUpId();
            return this;
        }

        public C5916b clearUpName() {
            copyOnWrite();
            ((UpArgs) this.instance).clearUpName();
            return this;
        }

        public long getSelected() {
            return ((UpArgs) this.instance).getSelected();
        }

        public String getUpFace() {
            return ((UpArgs) this.instance).getUpFace();
        }

        public ByteString getUpFaceBytes() {
            return ((UpArgs) this.instance).getUpFaceBytes();
        }

        public long getUpId() {
            return ((UpArgs) this.instance).getUpId();
        }

        public String getUpName() {
            return ((UpArgs) this.instance).getUpName();
        }

        public ByteString getUpNameBytes() {
            return ((UpArgs) this.instance).getUpNameBytes();
        }

        public C5916b setSelected(long j) {
            copyOnWrite();
            ((UpArgs) this.instance).setSelected(j);
            return this;
        }

        public C5916b setUpFace(String str) {
            copyOnWrite();
            ((UpArgs) this.instance).setUpFace(str);
            return this;
        }

        public C5916b setUpFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((UpArgs) this.instance).setUpFaceBytes(byteString);
            return this;
        }

        public C5916b setUpId(long j) {
            copyOnWrite();
            ((UpArgs) this.instance).setUpId(j);
            return this;
        }

        public C5916b setUpName(String str) {
            copyOnWrite();
            ((UpArgs) this.instance).setUpName(str);
            return this;
        }

        public C5916b setUpNameBytes(ByteString byteString) {
            copyOnWrite();
            ((UpArgs) this.instance).setUpNameBytes(byteString);
            return this;
        }

        private C5916b() {
            super(UpArgs.DEFAULT_INSTANCE);
        }
    }

    static {
        UpArgs upArgs = new UpArgs();
        DEFAULT_INSTANCE = upArgs;
        GeneratedMessageLite.registerDefaultInstance(UpArgs.class, upArgs);
    }

    private UpArgs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelected() {
        this.selected_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpFace() {
        this.upFace_ = getDefaultInstance().getUpFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpId() {
        this.upId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpName() {
        this.upName_ = getDefaultInstance().getUpName();
    }

    public static UpArgs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5916b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UpArgs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpArgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpArgs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UpArgs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelected(long j) {
        this.selected_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpFace(String str) {
        str.getClass();
        this.upFace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.upFace_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpId(long j) {
        this.upId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpName(String str) {
        str.getClass();
        this.upName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.upName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5915a.f16006xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UpArgs();
            case 2:
                return new C5916b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0002", new Object[]{"upId_", "upName_", "upFace_", "selected_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UpArgs> parser = PARSER;
                if (parser == null) {
                    synchronized (UpArgs.class) {
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

    public long getSelected() {
        return this.selected_;
    }

    public String getUpFace() {
        return this.upFace_;
    }

    public ByteString getUpFaceBytes() {
        return ByteString.copyFromUtf8(this.upFace_);
    }

    public long getUpId() {
        return this.upId_;
    }

    public String getUpName() {
        return this.upName_;
    }

    public ByteString getUpNameBytes() {
        return ByteString.copyFromUtf8(this.upName_);
    }

    public static C5916b newBuilder(UpArgs upArgs) {
        return DEFAULT_INSTANCE.createBuilder(upArgs);
    }

    public static UpArgs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpArgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpArgs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UpArgs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UpArgs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UpArgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpArgs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UpArgs parseFrom(InputStream inputStream) throws IOException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpArgs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpArgs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UpArgs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
