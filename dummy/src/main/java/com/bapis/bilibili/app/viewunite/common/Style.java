package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class Style extends GeneratedMessageLite<Style, Style.Builder> implements MessageLiteOrBuilder {
    private static final Style DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 2;
    public static final int LINE_FIELD_NUMBER = 1;
    private static volatile Parser<Style> PARSER = null;
    public static final int SHOW_PAGES_FIELD_NUMBER = 3;
    private int hidden_;
    private int line_;
    private Internal.ProtobufList<String> showPages_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Style$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17044xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17044xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17044xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17044xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17044xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17044xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17044xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17044xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Style, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70671 c70671) {
            this();
        }

        public Builder addAllShowPages(Iterable<String> iterable) {
            copyOnWrite();
            ((Style) this.instance).addAllShowPages(iterable);
            return this;
        }

        public Builder addShowPages(String str) {
            copyOnWrite();
            ((Style) this.instance).addShowPages(str);
            return this;
        }

        public Builder addShowPagesBytes(ByteString byteString) {
            copyOnWrite();
            ((Style) this.instance).addShowPagesBytes(byteString);
            return this;
        }

        public Builder clearHidden() {
            copyOnWrite();
            ((Style) this.instance).clearHidden();
            return this;
        }

        public Builder clearLine() {
            copyOnWrite();
            ((Style) this.instance).clearLine();
            return this;
        }

        public Builder clearShowPages() {
            copyOnWrite();
            ((Style) this.instance).clearShowPages();
            return this;
        }

        public int getHidden() {
            return ((Style) this.instance).getHidden();
        }

        public int getLine() {
            return ((Style) this.instance).getLine();
        }

        public String getShowPages(int i) {
            return ((Style) this.instance).getShowPages(i);
        }

        public ByteString getShowPagesBytes(int i) {
            return ((Style) this.instance).getShowPagesBytes(i);
        }

        public int getShowPagesCount() {
            return ((Style) this.instance).getShowPagesCount();
        }

        public List<String> getShowPagesList() {
            return Collections.unmodifiableList(((Style) this.instance).getShowPagesList());
        }

        public Builder setHidden(int i) {
            copyOnWrite();
            ((Style) this.instance).setHidden(i);
            return this;
        }

        public Builder setLine(int i) {
            copyOnWrite();
            ((Style) this.instance).setLine(i);
            return this;
        }

        public Builder setShowPages(int i, String str) {
            copyOnWrite();
            ((Style) this.instance).setShowPages(i, str);
            return this;
        }

        private Builder() {
            super(Style.DEFAULT_INSTANCE);
        }
    }

    static {
        Style style = new Style();
        DEFAULT_INSTANCE = style;
        GeneratedMessageLite.registerDefaultInstance(Style.class, style);
    }

    public Style() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllShowPages(Iterable<String> iterable) {
        ensureShowPagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.showPages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addShowPages(String str) {
        str.getClass();
        ensureShowPagesIsMutable();
        this.showPages_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addShowPagesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureShowPagesIsMutable();
        this.showPages_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        this.hidden_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLine() {
        this.line_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowPages() {
        this.showPages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureShowPagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.showPages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.showPages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Style getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Style parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Style) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Style parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Style> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(int i) {
        this.hidden_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLine(int i) {
        this.line_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowPages(int i, String str) {
        str.getClass();
        ensureShowPagesIsMutable();
        this.showPages_.set(i, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70671.f17044xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Style();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u021a", new Object[]{"line_", "hidden_", "showPages_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Style> parser = PARSER;
                if (parser == null) {
                    synchronized (Style.class) {
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

    public int getHidden() {
        return this.hidden_;
    }

    public int getLine() {
        return this.line_;
    }

    public String getShowPages(int i) {
        return this.showPages_.get(i);
    }

    public ByteString getShowPagesBytes(int i) {
        return ByteString.copyFromUtf8(this.showPages_.get(i));
    }

    public int getShowPagesCount() {
        return this.showPages_.size();
    }

    public List<String> getShowPagesList() {
        return this.showPages_;
    }

    public static Builder newBuilder(Style style) {
        return DEFAULT_INSTANCE.createBuilder(style);
    }

    public static Style parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Style) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Style parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Style parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Style parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Style parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Style parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Style parseFrom(InputStream inputStream) throws IOException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Style parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Style parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Style parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Style) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
