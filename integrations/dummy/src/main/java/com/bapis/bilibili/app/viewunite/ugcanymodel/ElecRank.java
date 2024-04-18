package com.bapis.bilibili.app.viewunite.ugcanymodel;

import com.bapis.bilibili.app.viewunite.ugcanymodel.ElecRankItem;
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
public final class ElecRank extends GeneratedMessageLite<ElecRank, ElecRank.b> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ElecRank DEFAULT_INSTANCE;
    public static final int LIST_FIELD_NUMBER = 1;
    private static volatile Parser<ElecRank> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    private long count_;
    private Internal.ProtobufList<ElecRankItem> list_ = GeneratedMessageLite.emptyProtobufList();
    private String text_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<ElecRank, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b addAllList(Iterable<? extends ElecRankItem> iterable) {
            copyOnWrite();
            ((ElecRank) this.instance).addAllList(iterable);
            return this;
        }

        public b addList(ElecRankItem elecRankItem) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(elecRankItem);
            return this;
        }

        public b clearCount() {
            copyOnWrite();
            ((ElecRank) this.instance).clearCount();
            return this;
        }

        public b clearList() {
            copyOnWrite();
            ((ElecRank) this.instance).clearList();
            return this;
        }

        public b clearText() {
            copyOnWrite();
            ((ElecRank) this.instance).clearText();
            return this;
        }

        public long getCount() {
            return ((ElecRank) this.instance).getCount();
        }

        public ElecRankItem getList(int i2) {
            return ((ElecRank) this.instance).getList(i2);
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

        public b removeList(int i2) {
            copyOnWrite();
            ((ElecRank) this.instance).removeList(i2);
            return this;
        }

        public b setCount(long j2) {
            copyOnWrite();
            ((ElecRank) this.instance).setCount(j2);
            return this;
        }

        public b setList(int i2, ElecRankItem elecRankItem) {
            copyOnWrite();
            ((ElecRank) this.instance).setList(i2, elecRankItem);
            return this;
        }

        public b setText(String str) {
            copyOnWrite();
            ((ElecRank) this.instance).setText(str);
            return this;
        }

        public b setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRank) this.instance).setTextBytes(byteString);
            return this;
        }

        private b() {
            super(ElecRank.DEFAULT_INSTANCE);
        }

        public b addList(int i2, ElecRankItem elecRankItem) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(i2, elecRankItem);
            return this;
        }

        public b setList(int i2, ElecRankItem.b bVar) {
            copyOnWrite();
            ((ElecRank) this.instance).setList(i2, bVar.build());
            return this;
        }

        public b addList(ElecRankItem.b bVar) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(bVar.build());
            return this;
        }

        public b addList(int i2, ElecRankItem.b bVar) {
            copyOnWrite();
            ((ElecRank) this.instance).addList(i2, bVar.build());
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

    public static b newBuilder() {
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

    public void removeList(int i2) {
        ensureListIsMutable();
        this.list_.remove(i2);
    }

    public void setCount(long j2) {
        this.count_ = j2;
    }

    public void setList(int i2, ElecRankItem elecRankItem) {
        elecRankItem.getClass();
        ensureListIsMutable();
        this.list_.set(i2, elecRankItem);
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ElecRank();
            case 2:
                return new b(null);
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

    public long getCount() {
        return this.count_;
    }

    public ElecRankItem getList(int i2) {
        return this.list_.get(i2);
    }

    public int getListCount() {
        return this.list_.size();
    }

    public List<ElecRankItem> getListList() {
        return this.list_;
    }

    public com.bapis.bilibili.app.viewunite.ugcanymodel.b getListOrBuilder(int i2) {
        return this.list_.get(i2);
    }

    public List<? extends com.bapis.bilibili.app.viewunite.ugcanymodel.b> getListOrBuilderList() {
        return this.list_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static b newBuilder(ElecRank elecRank) {
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

    public void addList(int i2, ElecRankItem elecRankItem) {
        elecRankItem.getClass();
        ensureListIsMutable();
        this.list_.add(i2, elecRankItem);
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
