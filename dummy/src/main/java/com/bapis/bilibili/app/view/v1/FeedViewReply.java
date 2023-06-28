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
public final class FeedViewReply extends GeneratedMessageLite<FeedViewReply, FeedViewReply.Builder> implements MessageLiteOrBuilder {
    private static final FeedViewReply DEFAULT_INSTANCE;
    public static final int HAS_NEXT_FIELD_NUMBER = 2;
    public static final int LIST_FIELD_NUMBER = 1;
    private static volatile Parser<FeedViewReply> PARSER;
    private boolean hasNext_;
    private Internal.ProtobufList<FeedViewItem> list_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.FeedViewReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16737xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16737xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16737xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16737xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16737xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16737xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16737xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16737xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FeedViewReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67661 c67661) {
            this();
        }

        public Builder addAllList(Iterable<? extends FeedViewItem> iterable) {
            copyOnWrite();
            ((FeedViewReply) this.instance).addAllList(iterable);
            return this;
        }

        public Builder addList(FeedViewItem feedViewItem) {
            copyOnWrite();
            ((FeedViewReply) this.instance).addList(feedViewItem);
            return this;
        }

        public Builder clearHasNext() {
            copyOnWrite();
            ((FeedViewReply) this.instance).clearHasNext();
            return this;
        }

        public Builder clearList() {
            copyOnWrite();
            ((FeedViewReply) this.instance).clearList();
            return this;
        }

        public boolean getHasNext() {
            return ((FeedViewReply) this.instance).getHasNext();
        }

        public FeedViewItem getList(int i) {
            return ((FeedViewReply) this.instance).getList(i);
        }

        public int getListCount() {
            return ((FeedViewReply) this.instance).getListCount();
        }

        public List<FeedViewItem> getListList() {
            return Collections.unmodifiableList(((FeedViewReply) this.instance).getListList());
        }

        public Builder removeList(int i) {
            copyOnWrite();
            ((FeedViewReply) this.instance).removeList(i);
            return this;
        }

        public Builder setHasNext(boolean z) {
            copyOnWrite();
            ((FeedViewReply) this.instance).setHasNext(z);
            return this;
        }

        public Builder setList(int i, FeedViewItem feedViewItem) {
            copyOnWrite();
            ((FeedViewReply) this.instance).setList(i, feedViewItem);
            return this;
        }

        private Builder() {
            super(FeedViewReply.DEFAULT_INSTANCE);
        }

        public Builder addList(int i, FeedViewItem feedViewItem) {
            copyOnWrite();
            ((FeedViewReply) this.instance).addList(i, feedViewItem);
            return this;
        }

        public Builder setList(int i, FeedViewItem.Builder builder) {
            copyOnWrite();
            ((FeedViewReply) this.instance).setList(i, builder.build());
            return this;
        }

        public Builder addList(FeedViewItem.Builder builder) {
            copyOnWrite();
            ((FeedViewReply) this.instance).addList(builder.build());
            return this;
        }

        public Builder addList(int i, FeedViewItem.Builder builder) {
            copyOnWrite();
            ((FeedViewReply) this.instance).addList(i, builder.build());
            return this;
        }
    }

    static {
        FeedViewReply feedViewReply = new FeedViewReply();
        DEFAULT_INSTANCE = feedViewReply;
        GeneratedMessageLite.registerDefaultInstance(FeedViewReply.class, feedViewReply);
    }

    private FeedViewReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllList(Iterable<? extends FeedViewItem> iterable) {
        ensureListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.list_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(FeedViewItem feedViewItem) {
        feedViewItem.getClass();
        ensureListIsMutable();
        this.list_.add(feedViewItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasNext() {
        this.hasNext_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearList() {
        this.list_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureListIsMutable() {
        Internal.ProtobufList<FeedViewItem> protobufList = this.list_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FeedViewReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FeedViewReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FeedViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedViewReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FeedViewReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeList(int i) {
        ensureListIsMutable();
        this.list_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasNext(boolean z) {
        this.hasNext_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setList(int i, FeedViewItem feedViewItem) {
        feedViewItem.getClass();
        ensureListIsMutable();
        this.list_.set(i, feedViewItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67661.f16737xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FeedViewReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"list_", FeedViewItem.class, "hasNext_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FeedViewReply> parser = PARSER;
                if (parser == null) {
                    synchronized (FeedViewReply.class) {
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

    public boolean getHasNext() {
        return this.hasNext_;
    }

    public FeedViewItem getList(int i) {
        return this.list_.get(i);
    }

    public int getListCount() {
        return this.list_.size();
    }

    public List<FeedViewItem> getListList() {
        return this.list_;
    }

    public FeedViewItemOrBuilder getListOrBuilder(int i) {
        return this.list_.get(i);
    }

    public List<? extends FeedViewItemOrBuilder> getListOrBuilderList() {
        return this.list_;
    }

    public static Builder newBuilder(FeedViewReply feedViewReply) {
        return DEFAULT_INSTANCE.createBuilder(feedViewReply);
    }

    public static FeedViewReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedViewReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FeedViewReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(int i, FeedViewItem feedViewItem) {
        feedViewItem.getClass();
        ensureListIsMutable();
        this.list_.add(i, feedViewItem);
    }

    public static FeedViewReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FeedViewReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeedViewReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FeedViewReply parseFrom(InputStream inputStream) throws IOException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedViewReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedViewReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FeedViewReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
