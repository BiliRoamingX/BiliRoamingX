package com.bapis.bilibili.app.viewunite.common;

import com.bapis.bilibili.app.view.v1.RelateItemOrBuilder;
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
public final class Banner extends GeneratedMessageLite<Banner, Banner.Builder> implements MessageLiteOrBuilder {
    private static final Banner DEFAULT_INSTANCE;
    private static volatile Parser<Banner> PARSER = null;
    public static final int RELATE_ITEM_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private Internal.ProtobufList<RelateItem> relateItem_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Banner$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16966xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16966xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16966xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16966xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16966xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16966xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16966xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16966xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Banner, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69791 c69791) {
            this();
        }

        public Builder addAllRelateItem(Iterable<? extends RelateItem> iterable) {
            copyOnWrite();
            ((Banner) this.instance).addAllRelateItem(iterable);
            return this;
        }

        public Builder addRelateItem(RelateItem relateItem) {
            copyOnWrite();
            ((Banner) this.instance).addRelateItem(relateItem);
            return this;
        }

        public Builder clearRelateItem() {
            copyOnWrite();
            ((Banner) this.instance).clearRelateItem();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Banner) this.instance).clearTitle();
            return this;
        }

        public RelateItem getRelateItem(int i) {
            return ((Banner) this.instance).getRelateItem(i);
        }

        public int getRelateItemCount() {
            return ((Banner) this.instance).getRelateItemCount();
        }

        public List<RelateItem> getRelateItemList() {
            return Collections.unmodifiableList(((Banner) this.instance).getRelateItemList());
        }

        public String getTitle() {
            return ((Banner) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Banner) this.instance).getTitleBytes();
        }

        public Builder removeRelateItem(int i) {
            copyOnWrite();
            ((Banner) this.instance).removeRelateItem(i);
            return this;
        }

        public Builder setRelateItem(int i, RelateItem relateItem) {
            copyOnWrite();
            ((Banner) this.instance).setRelateItem(i, relateItem);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Banner) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Banner) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Banner.DEFAULT_INSTANCE);
        }

        public Builder addRelateItem(int i, RelateItem relateItem) {
            copyOnWrite();
            ((Banner) this.instance).addRelateItem(i, relateItem);
            return this;
        }

        public Builder setRelateItem(int i, RelateItem.Builder builder) {
            copyOnWrite();
            ((Banner) this.instance).setRelateItem(i, builder.build());
            return this;
        }

        public Builder addRelateItem(RelateItem.Builder builder) {
            copyOnWrite();
            ((Banner) this.instance).addRelateItem(builder.build());
            return this;
        }

        public Builder addRelateItem(int i, RelateItem.Builder builder) {
            copyOnWrite();
            ((Banner) this.instance).addRelateItem(i, builder.build());
            return this;
        }
    }

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        GeneratedMessageLite.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
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
    public void clearRelateItem() {
        this.relateItem_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureRelateItemIsMutable() {
        Internal.ProtobufList<RelateItem> protobufList = this.relateItem_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.relateItem_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Banner getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Banner> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelateItem(int i) {
        ensureRelateItemIsMutable();
        this.relateItem_.remove(i);
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69791.f16966xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Banner();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"title_", "relateItem_", RelateItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Banner> parser = PARSER;
                if (parser == null) {
                    synchronized (Banner.class) {
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

    public static Builder newBuilder(Banner banner) {
        return DEFAULT_INSTANCE.createBuilder(banner);
    }

    public static Banner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Banner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelateItem(int i, RelateItem relateItem) {
        relateItem.getClass();
        ensureRelateItemIsMutable();
        this.relateItem_.add(i, relateItem);
    }

    public static Banner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Banner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Banner parseFrom(InputStream inputStream) throws IOException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Banner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Banner parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Banner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
