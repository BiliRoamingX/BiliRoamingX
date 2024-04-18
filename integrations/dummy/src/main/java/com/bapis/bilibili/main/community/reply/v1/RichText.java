package com.bapis.bilibili.main.community.reply.v1;

import com.bapis.bilibili.app.dynamic.v2.OpusItem;
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
public final class RichText extends GeneratedMessageLite<RichText, RichText.C14829b> implements MessageLiteOrBuilder {
    private static final RichText DEFAULT_INSTANCE;
    public static final int NOTE_FIELD_NUMBER = 1;
    public static final int OPUS_FIELD_NUMBER = 2;
    private static volatile Parser<RichText> PARSER;
    private int itemCase_ = 0;
    private Object item_;

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public enum ItemCase {
        NOTE(1),
        OPUS(2),
        ITEM_NOT_SET(0);
        
        private final int value;

        ItemCase(int i) {
            this.value = i;
        }

        public static ItemCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return OPUS;
                }
                return NOTE;
            }
            return ITEM_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ItemCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.RichText$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14828a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22025xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22025xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22025xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22025xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22025xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22025xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22025xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22025xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.RichText$b */
    /* loaded from: classes21.dex */
    public static final class C14829b extends GeneratedMessageLite.Builder<RichText, C14829b> implements MessageLiteOrBuilder {
        /* synthetic */ C14829b(C14828a c14828a) {
            this();
        }

        public C14829b clearItem() {
            copyOnWrite();
            ((RichText) this.instance).clearItem();
            return this;
        }

        public C14829b clearNote() {
            copyOnWrite();
            ((RichText) this.instance).clearNote();
            return this;
        }

        public C14829b clearOpus() {
            copyOnWrite();
            ((RichText) this.instance).clearOpus();
            return this;
        }

        public ItemCase getItemCase() {
            return ((RichText) this.instance).getItemCase();
        }

        public RichTextNote getNote() {
            return ((RichText) this.instance).getNote();
        }

        public OpusItem getOpus() {
            return ((RichText) this.instance).getOpus();
        }

        public boolean hasNote() {
            return ((RichText) this.instance).hasNote();
        }

        public boolean hasOpus() {
            return ((RichText) this.instance).hasOpus();
        }

        public C14829b mergeNote(RichTextNote richTextNote) {
            copyOnWrite();
            ((RichText) this.instance).mergeNote(richTextNote);
            return this;
        }

        public C14829b mergeOpus(OpusItem opusItem) {
            copyOnWrite();
            ((RichText) this.instance).mergeOpus(opusItem);
            return this;
        }

        public C14829b setNote(RichTextNote richTextNote) {
            copyOnWrite();
            ((RichText) this.instance).setNote(richTextNote);
            return this;
        }

        public C14829b setOpus(OpusItem opusItem) {
            copyOnWrite();
            ((RichText) this.instance).setOpus(opusItem);
            return this;
        }

        private C14829b() {
            super(RichText.DEFAULT_INSTANCE);
        }

        public C14829b setNote(RichTextNote.C14831b c14831b) {
            copyOnWrite();
            ((RichText) this.instance).setNote(c14831b.build());
            return this;
        }

        public C14829b setOpus(OpusItem.C9417b c9417b) {
            copyOnWrite();
            ((RichText) this.instance).setOpus(c9417b.build());
            return this;
        }
    }

    static {
        RichText richText = new RichText();
        DEFAULT_INSTANCE = richText;
        GeneratedMessageLite.registerDefaultInstance(RichText.class, richText);
    }

    private RichText() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.itemCase_ = 0;
        this.item_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNote() {
        if (this.itemCase_ == 1) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpus() {
        if (this.itemCase_ == 2) {
            this.itemCase_ = 0;
            this.item_ = null;
        }
    }

    public static RichText getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNote(RichTextNote richTextNote) {
        richTextNote.getClass();
        if (this.itemCase_ == 1 && this.item_ != RichTextNote.getDefaultInstance()) {
            this.item_ = RichTextNote.newBuilder((RichTextNote) this.item_).mergeFrom((RichTextNote) richTextNote).buildPartial();
        } else {
            this.item_ = richTextNote;
        }
        this.itemCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOpus(OpusItem opusItem) {
        opusItem.getClass();
        if (this.itemCase_ == 2 && this.item_ != OpusItem.getDefaultInstance()) {
            this.item_ = OpusItem.newBuilder((OpusItem) this.item_).mergeFrom((OpusItem) opusItem).buildPartial();
        } else {
            this.item_ = opusItem;
        }
        this.itemCase_ = 2;
    }

    public static C14829b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RichText parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RichText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichText parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RichText> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNote(RichTextNote richTextNote) {
        richTextNote.getClass();
        this.item_ = richTextNote;
        this.itemCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpus(OpusItem opusItem) {
        opusItem.getClass();
        this.item_ = opusItem;
        this.itemCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14828a.f22025xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RichText();
            case 2:
                return new C14829b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"item_", "itemCase_", RichTextNote.class, OpusItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RichText> parser = PARSER;
                if (parser == null) {
                    synchronized (RichText.class) {
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

    public ItemCase getItemCase() {
        return ItemCase.forNumber(this.itemCase_);
    }

    public RichTextNote getNote() {
        if (this.itemCase_ == 1) {
            return (RichTextNote) this.item_;
        }
        return RichTextNote.getDefaultInstance();
    }

    public OpusItem getOpus() {
        if (this.itemCase_ == 2) {
            return (OpusItem) this.item_;
        }
        return OpusItem.getDefaultInstance();
    }

    public boolean hasNote() {
        return this.itemCase_ == 1;
    }

    public boolean hasOpus() {
        return this.itemCase_ == 2;
    }

    public static C14829b newBuilder(RichText richText) {
        return DEFAULT_INSTANCE.createBuilder(richText);
    }

    public static RichText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RichText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RichText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RichText parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RichText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RichText parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RichText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RichText parseFrom(InputStream inputStream) throws IOException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RichText parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RichText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RichText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
