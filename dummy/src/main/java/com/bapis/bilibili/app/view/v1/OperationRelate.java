package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.view.v1.Relate;
import com.bapis.bilibili.app.view.v1.RelateItem;
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
public final class OperationRelate extends GeneratedMessageLite<OperationRelate, OperationRelate.Builder> implements MessageLiteOrBuilder {
    public static final int AI_RELATE_ITEM_FIELD_NUMBER = 3;
    private static final OperationRelate DEFAULT_INSTANCE;
    private static volatile Parser<OperationRelate> PARSER = null;
    public static final int RELATE_ITEM_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private Internal.ProtobufList<RelateItem> relateItem_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Relate> aiRelateItem_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.OperationRelate$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16774xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16774xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16774xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16774xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16774xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16774xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16774xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16774xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OperationRelate, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68091 c68091) {
            this();
        }

        public Builder addAiRelateItem(Relate relate) {
            copyOnWrite();
            ((OperationRelate) this.instance).addAiRelateItem(relate);
            return this;
        }

        public Builder addAllAiRelateItem(Iterable<? extends Relate> iterable) {
            copyOnWrite();
            ((OperationRelate) this.instance).addAllAiRelateItem(iterable);
            return this;
        }

        public Builder addAllRelateItem(Iterable<? extends RelateItem> iterable) {
            copyOnWrite();
            ((OperationRelate) this.instance).addAllRelateItem(iterable);
            return this;
        }

        public Builder addRelateItem(RelateItem relateItem) {
            copyOnWrite();
            ((OperationRelate) this.instance).addRelateItem(relateItem);
            return this;
        }

        public Builder clearAiRelateItem() {
            copyOnWrite();
            ((OperationRelate) this.instance).clearAiRelateItem();
            return this;
        }

        public Builder clearRelateItem() {
            copyOnWrite();
            ((OperationRelate) this.instance).clearRelateItem();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((OperationRelate) this.instance).clearTitle();
            return this;
        }

        public Relate getAiRelateItem(int i) {
            return ((OperationRelate) this.instance).getAiRelateItem(i);
        }

        public int getAiRelateItemCount() {
            return ((OperationRelate) this.instance).getAiRelateItemCount();
        }

        public List<Relate> getAiRelateItemList() {
            return Collections.unmodifiableList(((OperationRelate) this.instance).getAiRelateItemList());
        }

        public RelateItem getRelateItem(int i) {
            return ((OperationRelate) this.instance).getRelateItem(i);
        }

        public int getRelateItemCount() {
            return ((OperationRelate) this.instance).getRelateItemCount();
        }

        public List<RelateItem> getRelateItemList() {
            return Collections.unmodifiableList(((OperationRelate) this.instance).getRelateItemList());
        }

        public String getTitle() {
            return ((OperationRelate) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OperationRelate) this.instance).getTitleBytes();
        }

        public Builder removeAiRelateItem(int i) {
            copyOnWrite();
            ((OperationRelate) this.instance).removeAiRelateItem(i);
            return this;
        }

        public Builder removeRelateItem(int i) {
            copyOnWrite();
            ((OperationRelate) this.instance).removeRelateItem(i);
            return this;
        }

        public Builder setAiRelateItem(int i, Relate relate) {
            copyOnWrite();
            ((OperationRelate) this.instance).setAiRelateItem(i, relate);
            return this;
        }

        public Builder setRelateItem(int i, RelateItem relateItem) {
            copyOnWrite();
            ((OperationRelate) this.instance).setRelateItem(i, relateItem);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((OperationRelate) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationRelate) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(OperationRelate.DEFAULT_INSTANCE);
        }

        public Builder addAiRelateItem(int i, Relate relate) {
            copyOnWrite();
            ((OperationRelate) this.instance).addAiRelateItem(i, relate);
            return this;
        }

        public Builder addRelateItem(int i, RelateItem relateItem) {
            copyOnWrite();
            ((OperationRelate) this.instance).addRelateItem(i, relateItem);
            return this;
        }

        public Builder setAiRelateItem(int i, Relate.Builder builder) {
            copyOnWrite();
            ((OperationRelate) this.instance).setAiRelateItem(i, builder.build());
            return this;
        }

        public Builder setRelateItem(int i, RelateItem.Builder builder) {
            copyOnWrite();
            ((OperationRelate) this.instance).setRelateItem(i, builder.build());
            return this;
        }

        public Builder addAiRelateItem(Relate.Builder builder) {
            copyOnWrite();
            ((OperationRelate) this.instance).addAiRelateItem(builder.build());
            return this;
        }

        public Builder addRelateItem(RelateItem.Builder builder) {
            copyOnWrite();
            ((OperationRelate) this.instance).addRelateItem(builder.build());
            return this;
        }

        public Builder addAiRelateItem(int i, Relate.Builder builder) {
            copyOnWrite();
            ((OperationRelate) this.instance).addAiRelateItem(i, builder.build());
            return this;
        }

        public Builder addRelateItem(int i, RelateItem.Builder builder) {
            copyOnWrite();
            ((OperationRelate) this.instance).addRelateItem(i, builder.build());
            return this;
        }
    }

    static {
        OperationRelate operationRelate = new OperationRelate();
        DEFAULT_INSTANCE = operationRelate;
        GeneratedMessageLite.registerDefaultInstance(OperationRelate.class, operationRelate);
    }

    private OperationRelate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAiRelateItem(Relate relate) {
        relate.getClass();
        ensureAiRelateItemIsMutable();
        this.aiRelateItem_.add(relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAiRelateItem(Iterable<? extends Relate> iterable) {
        ensureAiRelateItemIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.aiRelateItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelateItem(Iterable<? extends RelateItem> iterable) {
        ensureRelateItemIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.relateItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelateItem(RelateItem relateItem) {
        relateItem.getClass();
        ensureRelateItemIsMutable();
        this.relateItem_.add(relateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiRelateItem() {
        this.aiRelateItem_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelateItem() {
        this.relateItem_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureAiRelateItemIsMutable() {
        Internal.ProtobufList<Relate> protobufList = this.aiRelateItem_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.aiRelateItem_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRelateItemIsMutable() {
        Internal.ProtobufList<RelateItem> protobufList = this.relateItem_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.relateItem_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static OperationRelate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationRelate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationRelate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationRelate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationRelate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAiRelateItem(int i) {
        ensureAiRelateItemIsMutable();
        this.aiRelateItem_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelateItem(int i) {
        ensureRelateItemIsMutable();
        this.relateItem_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiRelateItem(int i, Relate relate) {
        relate.getClass();
        ensureAiRelateItemIsMutable();
        this.aiRelateItem_.set(i, relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelateItem(int i, RelateItem relateItem) {
        relateItem.getClass();
        ensureRelateItemIsMutable();
        this.relateItem_.set(i, relateItem);
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68091.f16774xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationRelate();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0208\u0002\u001b\u0003\u001b", new Object[]{"title_", "relateItem_", RelateItem.class, "aiRelateItem_", Relate.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationRelate> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationRelate.class) {
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

    public Relate getAiRelateItem(int i) {
        return this.aiRelateItem_.get(i);
    }

    public int getAiRelateItemCount() {
        return this.aiRelateItem_.size();
    }

    public List<Relate> getAiRelateItemList() {
        return this.aiRelateItem_;
    }

    public RelateOrBuilder getAiRelateItemOrBuilder(int i) {
        return this.aiRelateItem_.get(i);
    }

    public List<? extends RelateOrBuilder> getAiRelateItemOrBuilderList() {
        return this.aiRelateItem_;
    }

    public RelateItem getRelateItem(int i) {
        return this.relateItem_.get(i);
    }

    public int getRelateItemCount() {
        return this.relateItem_.size();
    }

    public List<RelateItem> getRelateItemList() {
        return this.relateItem_;
    }

    public RelateItemOrBuilder getRelateItemOrBuilder(int i) {
        return this.relateItem_.get(i);
    }

    public List<? extends RelateItemOrBuilder> getRelateItemOrBuilderList() {
        return this.relateItem_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(OperationRelate operationRelate) {
        return DEFAULT_INSTANCE.createBuilder(operationRelate);
    }

    public static OperationRelate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationRelate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationRelate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationRelate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAiRelateItem(int i, Relate relate) {
        relate.getClass();
        ensureAiRelateItemIsMutable();
        this.aiRelateItem_.add(i, relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelateItem(int i, RelateItem relateItem) {
        relateItem.getClass();
        ensureRelateItemIsMutable();
        this.relateItem_.add(i, relateItem);
    }

    public static OperationRelate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationRelate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationRelate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationRelate parseFrom(InputStream inputStream) throws IOException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationRelate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationRelate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationRelate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationRelate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
