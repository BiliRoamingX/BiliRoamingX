package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class ElecRank extends GeneratedMessageLite<ElecRank, ElecRank.Builder> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ElecRank DEFAULT_INSTANCE;
    public static final int LIST_FIELD_NUMBER = 1;
    private static volatile Parser<ElecRank> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    private long count_;
    private Internal.ProtobufList<ElecRankItem> list_ = GeneratedMessageLite.emptyProtobufList();
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ElecRank$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16731xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16731xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16731xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16731xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16731xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16731xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16731xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16731xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ElecRank, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67591 c67591) {
            this();
        }

        public Builder addAllList(Iterable<? extends ElecRankItem> iterable) {
            copyOnWrite();
            ((ElecRank) this.instance).addAllList(iterable);
            return this;
        }

        public Builder addList(ElecRankItem elecRankItem) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(elecRankItem);
            return this;
        }

        public Builder clearCount() {
            copyOnWrite();
            ((ElecRank) this.instance).clearCount();
            return this;
        }

        public Builder clearList() {
            copyOnWrite();
            ((ElecRank) this.instance).clearList();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ElecRank) this.instance).clearText();
            return this;
        }

        public long getCount() {
            return ((ElecRank) this.instance).getCount();
        }

        public ElecRankItem getList(int i) {
            return ((ElecRank) this.instance).getList(i);
        }

        public int getListCount() {
            return ((ElecRank) this.instance).getListCount();
        }

        public List<ElecRankItem> getListList() {
            return Collections.unmodifiableList(((ElecRank) this.instance).getListList());
        }

        public String getText() {
            return ((ElecRank) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((ElecRank) this.instance).getTextBytes();
        }

        public Builder removeList(int i) {
            copyOnWrite();
            ((ElecRank) this.instance).removeList(i);
            return this;
        }

        public Builder setCount(long j) {
            copyOnWrite();
            ((ElecRank) this.instance).setCount(j);
            return this;
        }

        public Builder setList(int i, ElecRankItem elecRankItem) {
            copyOnWrite();
            ((ElecRank) this.instance).setList(i, elecRankItem);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ElecRank) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRank) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(ElecRank.DEFAULT_INSTANCE);
        }

        public Builder addList(int i, ElecRankItem elecRankItem) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(i, elecRankItem);
            return this;
        }

        public Builder setList(int i, ElecRankItem.Builder builder) {
            copyOnWrite();
            ((ElecRank) this.instance).setList(i, builder.build());
            return this;
        }

        public Builder addList(ElecRankItem.Builder builder) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(builder.build());
            return this;
        }

        public Builder addList(int i, ElecRankItem.Builder builder) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(i, builder.build());
            return this;
        }
    }

    static {
        ElecRank elecRank = new ElecRank();
        DEFAULT_INSTANCE = elecRank;
        GeneratedMessageLite.registerDefaultInstance(ElecRank.class, elecRank);
    }

    private ElecRank() {
    }

    public void addAllList(Iterable<? extends ElecRankItem> iterable) {
        ensureListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.list_);
    }

    public void addList(ElecRankItem elecRankItem) {
        elecRankItem.getClass();
        ensureListIsMutable();
        this.list_.add(elecRankItem);
    }

    public void clearCount() {
        this.count_ = 0L;
    }

    public void clearList() {
        this.list_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    private void ensureListIsMutable() {
        Internal.ProtobufList<ElecRankItem> protobufList = this.list_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ElecRank getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ElecRank parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ElecRank) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ElecRank parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ElecRank> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeList(int i) {
        ensureListIsMutable();
        this.list_.remove(i);
    }

    public void setCount(long j) {
        this.count_ = j;
    }

    public void setList(int i, ElecRankItem elecRankItem) {
        elecRankItem.getClass();
        ensureListIsMutable();
        this.list_.set(i, elecRankItem);
    }

    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67591.f16731xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ElecRank();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003\u0208", new Object[]{"list_", ElecRankItem.class, "count_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ElecRank> parser = PARSER;
                if (parser == null) {
                    synchronized (ElecRank.class) {
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

    public long getCount() {
        return this.count_;
    }

    public ElecRankItem getList(int i) {
        return this.list_.get(i);
    }

    public int getListCount() {
        return this.list_.size();
    }

    public List<ElecRankItem> getListList() {
        return this.list_;
    }

    public ElecRankItemOrBuilder getListOrBuilder(int i) {
        return this.list_.get(i);
    }

    public List<? extends ElecRankItemOrBuilder> getListOrBuilderList() {
        return this.list_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(ElecRank elecRank) {
        return DEFAULT_INSTANCE.createBuilder(elecRank);
    }

    public static ElecRank parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ElecRank) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ElecRank parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ElecRank parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addList(int i, ElecRankItem elecRankItem) {
        elecRankItem.getClass();
        ensureListIsMutable();
        this.list_.add(i, elecRankItem);
    }

    public static ElecRank parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ElecRank parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ElecRank parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ElecRank parseFrom(InputStream inputStream) throws IOException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ElecRank parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ElecRank parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ElecRank parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ElecRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
