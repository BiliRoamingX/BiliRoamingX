package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class Label extends GeneratedMessageLite<Label, Label.Builder> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Label DEFAULT_INSTANCE;
    private static volatile Parser<Label> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private Internal.ProtobufList<String> content_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Label$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17073xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17073xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Label, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72331 c72331) {
            this();
        }

        public Builder addAllContent(Iterable<String> iterable) {
            copyOnWrite();
            ((Label) this.instance).addAllContent(iterable);
            return this;
        }

        public Builder addContent(String str) {
            copyOnWrite();
            ((Label) this.instance).addContent(str);
            return this;
        }

        public Builder addContentBytes(ByteString byteString) {
            copyOnWrite();
            ((Label) this.instance).addContentBytes(byteString);
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((Label) this.instance).clearContent();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Label) this.instance).clearTitle();
            return this;
        }

        public String getContent(int i) {
            return ((Label) this.instance).getContent(i);
        }

        public ByteString getContentBytes(int i) {
            return ((Label) this.instance).getContentBytes(i);
        }

        public int getContentCount() {
            return ((Label) this.instance).getContentCount();
        }

        public List<String> getContentList() {
            return Collections.unmodifiableList(((Label) this.instance).getContentList());
        }

        public String getTitle() {
            return ((Label) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Label) this.instance).getTitleBytes();
        }

        public Builder setContent(int i, String str) {
            copyOnWrite();
            ((Label) this.instance).setContent(i, str);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Label) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Label) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Label.DEFAULT_INSTANCE);
        }
    }

    static {
        Label label = new Label();
        DEFAULT_INSTANCE = label;
        GeneratedMessageLite.registerDefaultInstance(Label.class, label);
    }

    private Label() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllContent(Iterable<String> iterable) {
        ensureContentIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.content_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(String str) {
        str.getClass();
        ensureContentIsMutable();
        this.content_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureContentIsMutable();
        this.content_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureContentIsMutable() {
        Internal.ProtobufList<String> protobufList = this.content_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.content_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Label getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Label parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Label) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Label parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Label> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(int i, String str) {
        str.getClass();
        ensureContentIsMutable();
        this.content_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72331.f17073xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Label();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", new Object[]{"title_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Label> parser = PARSER;
                if (parser == null) {
                    synchronized (Label.class) {
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

    public String getContent(int i) {
        return this.content_.get(i);
    }

    public ByteString getContentBytes(int i) {
        return ByteString.copyFromUtf8(this.content_.get(i));
    }

    public int getContentCount() {
        return this.content_.size();
    }

    public List<String> getContentList() {
        return this.content_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(Label label) {
        return DEFAULT_INSTANCE.createBuilder(label);
    }

    public static Label parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Label) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Label parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Label parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Label parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Label parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Label parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Label parseFrom(InputStream inputStream) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Label parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Label parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Label parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
