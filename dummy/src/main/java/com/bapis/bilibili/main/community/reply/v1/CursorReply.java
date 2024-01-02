package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class CursorReply extends GeneratedMessageLite<CursorReply, CursorReply.C14697b> implements MessageLiteOrBuilder {
    private static final CursorReply DEFAULT_INSTANCE;
    public static final int IS_BEGIN_FIELD_NUMBER = 3;
    public static final int IS_END_FIELD_NUMBER = 4;
    public static final int MODE_FIELD_NUMBER = 5;
    public static final int MODE_TEXT_FIELD_NUMBER = 6;
    public static final int NEXT_FIELD_NUMBER = 1;
    private static volatile Parser<CursorReply> PARSER = null;
    public static final int PREV_FIELD_NUMBER = 2;
    private boolean isBegin_;
    private boolean isEnd_;
    private String modeText_ = "";
    private int mode_;
    private long next_;
    private long prev_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.CursorReply$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14696a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21986xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21986xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21986xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21986xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21986xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21986xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.CursorReply$b */
    /* loaded from: classes21.dex */
    public static final class C14697b extends GeneratedMessageLite.Builder<CursorReply, C14697b> implements MessageLiteOrBuilder {
        /* synthetic */ C14697b(C14696a c14696a) {
            this();
        }

        public C14697b clearIsBegin() {
            copyOnWrite();
            ((CursorReply) this.instance).clearIsBegin();
            return this;
        }

        public C14697b clearIsEnd() {
            copyOnWrite();
            ((CursorReply) this.instance).clearIsEnd();
            return this;
        }

        public C14697b clearMode() {
            copyOnWrite();
            ((CursorReply) this.instance).clearMode();
            return this;
        }

        public C14697b clearModeText() {
            copyOnWrite();
            ((CursorReply) this.instance).clearModeText();
            return this;
        }

        public C14697b clearNext() {
            copyOnWrite();
            ((CursorReply) this.instance).clearNext();
            return this;
        }

        public C14697b clearPrev() {
            copyOnWrite();
            ((CursorReply) this.instance).clearPrev();
            return this;
        }

        public boolean getIsBegin() {
            return ((CursorReply) this.instance).getIsBegin();
        }

        public boolean getIsEnd() {
            return ((CursorReply) this.instance).getIsEnd();
        }

        public Mode getMode() {
            return ((CursorReply) this.instance).getMode();
        }

        public String getModeText() {
            return ((CursorReply) this.instance).getModeText();
        }

        public ByteString getModeTextBytes() {
            return ((CursorReply) this.instance).getModeTextBytes();
        }

        public int getModeValue() {
            return ((CursorReply) this.instance).getModeValue();
        }

        public long getNext() {
            return ((CursorReply) this.instance).getNext();
        }

        public long getPrev() {
            return ((CursorReply) this.instance).getPrev();
        }

        public C14697b setIsBegin(boolean z) {
            copyOnWrite();
            ((CursorReply) this.instance).setIsBegin(z);
            return this;
        }

        public C14697b setIsEnd(boolean z) {
            copyOnWrite();
            ((CursorReply) this.instance).setIsEnd(z);
            return this;
        }

        public C14697b setMode(Mode mode) {
            copyOnWrite();
            ((CursorReply) this.instance).setMode(mode);
            return this;
        }

        public C14697b setModeText(String str) {
            copyOnWrite();
            ((CursorReply) this.instance).setModeText(str);
            return this;
        }

        public C14697b setModeTextBytes(ByteString byteString) {
            copyOnWrite();
            ((CursorReply) this.instance).setModeTextBytes(byteString);
            return this;
        }

        public C14697b setModeValue(int i) {
            copyOnWrite();
            ((CursorReply) this.instance).setModeValue(i);
            return this;
        }

        public C14697b setNext(long j) {
            copyOnWrite();
            ((CursorReply) this.instance).setNext(j);
            return this;
        }

        public C14697b setPrev(long j) {
            copyOnWrite();
            ((CursorReply) this.instance).setPrev(j);
            return this;
        }

        private C14697b() {
            super(CursorReply.DEFAULT_INSTANCE);
        }
    }

    static {
        CursorReply cursorReply = new CursorReply();
        DEFAULT_INSTANCE = cursorReply;
        GeneratedMessageLite.registerDefaultInstance(CursorReply.class, cursorReply);
    }

    private CursorReply() {
    }

    public void clearIsBegin() {
        this.isBegin_ = false;
    }

    public void clearIsEnd() {
        this.isEnd_ = false;
    }

    public void clearMode() {
        this.mode_ = 0;
    }

    public void clearModeText() {
        this.modeText_ = getDefaultInstance().getModeText();
    }

    public void clearNext() {
        this.next_ = 0L;
    }

    public void clearPrev() {
        this.prev_ = 0L;
    }

    public static CursorReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14697b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CursorReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CursorReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CursorReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CursorReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIsBegin(boolean z) {
        this.isBegin_ = z;
    }

    public void setIsEnd(boolean z) {
        this.isEnd_ = z;
    }

    public void setMode(Mode mode) {
        this.mode_ = mode.getNumber();
    }

    public void setModeText(String str) {
        str.getClass();
        this.modeText_ = str;
    }

    public void setModeTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.modeText_ = byteString.toStringUtf8();
    }

    public void setModeValue(int i) {
        this.mode_ = i;
    }

    public void setNext(long j) {
        this.next_ = j;
    }

    public void setPrev(long j) {
        this.prev_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14696a.f21986xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CursorReply();
            case 2:
                return new C14697b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0007\u0004\u0007\u0005\f\u0006\u0208", new Object[]{"next_", "prev_", "isBegin_", "isEnd_", "mode_", "modeText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CursorReply> parser = PARSER;
                if (parser == null) {
                    synchronized (CursorReply.class) {
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

    public boolean getIsBegin() {
        return this.isBegin_;
    }

    public boolean getIsEnd() {
        return this.isEnd_;
    }

    public Mode getMode() {
        Mode forNumber = Mode.forNumber(this.mode_);
        return forNumber == null ? Mode.UNRECOGNIZED : forNumber;
    }

    public String getModeText() {
        return this.modeText_;
    }

    public ByteString getModeTextBytes() {
        return ByteString.copyFromUtf8(this.modeText_);
    }

    public int getModeValue() {
        return this.mode_;
    }

    public long getNext() {
        return this.next_;
    }

    public long getPrev() {
        return this.prev_;
    }

    public static C14697b newBuilder(CursorReply cursorReply) {
        return DEFAULT_INSTANCE.createBuilder(cursorReply);
    }

    public static CursorReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CursorReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CursorReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CursorReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CursorReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CursorReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CursorReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CursorReply parseFrom(InputStream inputStream) throws IOException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CursorReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CursorReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CursorReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CursorReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
