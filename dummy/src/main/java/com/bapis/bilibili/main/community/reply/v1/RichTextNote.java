package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class RichTextNote extends GeneratedMessageLite<RichTextNote, RichTextNote.C14831b> implements MessageLiteOrBuilder {
    public static final int CLICK_URL_FIELD_NUMBER = 3;
    private static final RichTextNote DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 2;
    public static final int LAST_MTIME_TEXT_FIELD_NUMBER = 4;
    private static volatile Parser<RichTextNote> PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String summary_ = "";
    private Internal.ProtobufList<String> images_ = GeneratedMessageLite.emptyProtobufList();
    private String clickUrl_ = "";
    private String lastMtimeText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.RichTextNote$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14830a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22026xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22026xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22026xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22026xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22026xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22026xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22026xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22026xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.RichTextNote$b */
    /* loaded from: classes21.dex */
    public static final class C14831b extends GeneratedMessageLite.Builder<RichTextNote, C14831b> implements MessageLiteOrBuilder {
        /* synthetic */ C14831b(C14830a c14830a) {
            this();
        }

        public C14831b addAllImages(Iterable<String> iterable) {
            copyOnWrite();
            ((RichTextNote) this.instance).addAllImages(iterable);
            return this;
        }

        public C14831b addImages(String str) {
            copyOnWrite();
            ((RichTextNote) this.instance).addImages(str);
            return this;
        }

        public C14831b addImagesBytes(ByteString byteString) {
            copyOnWrite();
            ((RichTextNote) this.instance).addImagesBytes(byteString);
            return this;
        }

        public C14831b clearClickUrl() {
            copyOnWrite();
            ((RichTextNote) this.instance).clearClickUrl();
            return this;
        }

        public C14831b clearImages() {
            copyOnWrite();
            ((RichTextNote) this.instance).clearImages();
            return this;
        }

        public C14831b clearLastMtimeText() {
            copyOnWrite();
            ((RichTextNote) this.instance).clearLastMtimeText();
            return this;
        }

        public C14831b clearSummary() {
            copyOnWrite();
            ((RichTextNote) this.instance).clearSummary();
            return this;
        }

        public String getClickUrl() {
            return ((RichTextNote) this.instance).getClickUrl();
        }

        public ByteString getClickUrlBytes() {
            return ((RichTextNote) this.instance).getClickUrlBytes();
        }

        public String getImages(int i) {
            return ((RichTextNote) this.instance).getImages(i);
        }

        public ByteString getImagesBytes(int i) {
            return ((RichTextNote) this.instance).getImagesBytes(i);
        }

        public int getImagesCount() {
            return ((RichTextNote) this.instance).getImagesCount();
        }

        public List<String> getImagesList() {
            return Collections.unmodifiableList(((RichTextNote) this.instance).getImagesList());
        }

        public String getLastMtimeText() {
            return ((RichTextNote) this.instance).getLastMtimeText();
        }

        public ByteString getLastMtimeTextBytes() {
            return ((RichTextNote) this.instance).getLastMtimeTextBytes();
        }

        public String getSummary() {
            return ((RichTextNote) this.instance).getSummary();
        }

        public ByteString getSummaryBytes() {
            return ((RichTextNote) this.instance).getSummaryBytes();
        }

        public C14831b setClickUrl(String str) {
            copyOnWrite();
            ((RichTextNote) this.instance).setClickUrl(str);
            return this;
        }

        public C14831b setClickUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((RichTextNote) this.instance).setClickUrlBytes(byteString);
            return this;
        }

        public C14831b setImages(int i, String str) {
            copyOnWrite();
            ((RichTextNote) this.instance).setImages(i, str);
            return this;
        }

        public C14831b setLastMtimeText(String str) {
            copyOnWrite();
            ((RichTextNote) this.instance).setLastMtimeText(str);
            return this;
        }

        public C14831b setLastMtimeTextBytes(ByteString byteString) {
            copyOnWrite();
            ((RichTextNote) this.instance).setLastMtimeTextBytes(byteString);
            return this;
        }

        public C14831b setSummary(String str) {
            copyOnWrite();
            ((RichTextNote) this.instance).setSummary(str);
            return this;
        }

        public C14831b setSummaryBytes(ByteString byteString) {
            copyOnWrite();
            ((RichTextNote) this.instance).setSummaryBytes(byteString);
            return this;
        }

        private C14831b() {
            super(RichTextNote.DEFAULT_INSTANCE);
        }
    }

    static {
        RichTextNote richTextNote = new RichTextNote();
        DEFAULT_INSTANCE = richTextNote;
        GeneratedMessageLite.registerDefaultInstance(RichTextNote.class, richTextNote);
    }

    private RichTextNote() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImages(Iterable<String> iterable) {
        ensureImagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.images_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImages(String str) {
        str.getClass();
        ensureImagesIsMutable();
        this.images_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImagesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureImagesIsMutable();
        this.images_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickUrl() {
        this.clickUrl_ = getDefaultInstance().getClickUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImages() {
        this.images_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastMtimeText() {
        this.lastMtimeText_ = getDefaultInstance().getLastMtimeText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = getDefaultInstance().getSummary();
    }

    private void ensureImagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.images_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.images_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RichTextNote getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14831b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RichTextNote parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RichTextNote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichTextNote parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RichTextNote> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrl(String str) {
        str.getClass();
        this.clickUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clickUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImages(int i, String str) {
        str.getClass();
        ensureImagesIsMutable();
        this.images_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastMtimeText(String str) {
        str.getClass();
        this.lastMtimeText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastMtimeTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastMtimeText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummary(String str) {
        str.getClass();
        this.summary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummaryBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.summary_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14830a.f22026xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RichTextNote();
            case 2:
                return new C14831b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u021a\u0003\u0208\u0004\u0208", new Object[]{"summary_", "images_", "clickUrl_", "lastMtimeText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RichTextNote> parser = PARSER;
                if (parser == null) {
                    synchronized (RichTextNote.class) {
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

    public String getClickUrl() {
        return this.clickUrl_;
    }

    public ByteString getClickUrlBytes() {
        return ByteString.copyFromUtf8(this.clickUrl_);
    }

    public String getImages(int i) {
        return this.images_.get(i);
    }

    public ByteString getImagesBytes(int i) {
        return ByteString.copyFromUtf8(this.images_.get(i));
    }

    public int getImagesCount() {
        return this.images_.size();
    }

    public List<String> getImagesList() {
        return this.images_;
    }

    public String getLastMtimeText() {
        return this.lastMtimeText_;
    }

    public ByteString getLastMtimeTextBytes() {
        return ByteString.copyFromUtf8(this.lastMtimeText_);
    }

    public String getSummary() {
        return this.summary_;
    }

    public ByteString getSummaryBytes() {
        return ByteString.copyFromUtf8(this.summary_);
    }

    public static C14831b newBuilder(RichTextNote richTextNote) {
        return DEFAULT_INSTANCE.createBuilder(richTextNote);
    }

    public static RichTextNote parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RichTextNote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RichTextNote parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RichTextNote parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RichTextNote parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RichTextNote parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RichTextNote parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RichTextNote parseFrom(InputStream inputStream) throws IOException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichTextNote parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RichTextNote parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RichTextNote parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RichTextNote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
