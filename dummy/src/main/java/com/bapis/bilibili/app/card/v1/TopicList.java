package com.bapis.bilibili.app.card.v1;

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
public final class TopicList extends GeneratedMessageLite<TopicList, TopicList.C5904b> implements MessageLiteOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final TopicList DEFAULT_INSTANCE;
    public static final int MORE_BUTTON_FIELD_NUMBER = 4;
    private static volatile Parser<TopicList> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TITLE_ICON_FIELD_NUMBER = 3;
    public static final int TOPIC_LIST_ITEM_FIELD_NUMBER = 5;
    private Base base_;
    private TopicButton moreButton_;
    private String title_ = "";
    private String titleIcon_ = "";
    private Internal.ProtobufList<TopicListItem> topicListItem_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TopicList$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5903a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16000xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16000xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16000xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16000xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16000xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TopicList$b */
    /* loaded from: classes13.dex */
    public static final class C5904b extends GeneratedMessageLite.Builder<TopicList, C5904b> implements MessageLiteOrBuilder {
        /* synthetic */ C5904b(C5903a c5903a) {
            this();
        }

        public C5904b addAllTopicListItem(Iterable<? extends TopicListItem> iterable) {
            copyOnWrite();
            ((TopicList) this.instance).addAllTopicListItem(iterable);
            return this;
        }

        public C5904b addTopicListItem(TopicListItem topicListItem) {
            copyOnWrite();
            ((TopicList) this.instance).addTopicListItem(topicListItem);
            return this;
        }

        public C5904b clearBase() {
            copyOnWrite();
            ((TopicList) this.instance).clearBase();
            return this;
        }

        public C5904b clearMoreButton() {
            copyOnWrite();
            ((TopicList) this.instance).clearMoreButton();
            return this;
        }

        public C5904b clearTitle() {
            copyOnWrite();
            ((TopicList) this.instance).clearTitle();
            return this;
        }

        public C5904b clearTitleIcon() {
            copyOnWrite();
            ((TopicList) this.instance).clearTitleIcon();
            return this;
        }

        public C5904b clearTopicListItem() {
            copyOnWrite();
            ((TopicList) this.instance).clearTopicListItem();
            return this;
        }

        public Base getBase() {
            return ((TopicList) this.instance).getBase();
        }

        public TopicButton getMoreButton() {
            return ((TopicList) this.instance).getMoreButton();
        }

        public String getTitle() {
            return ((TopicList) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((TopicList) this.instance).getTitleBytes();
        }

        public String getTitleIcon() {
            return ((TopicList) this.instance).getTitleIcon();
        }

        public ByteString getTitleIconBytes() {
            return ((TopicList) this.instance).getTitleIconBytes();
        }

        public TopicListItem getTopicListItem(int i) {
            return ((TopicList) this.instance).getTopicListItem(i);
        }

        public int getTopicListItemCount() {
            return ((TopicList) this.instance).getTopicListItemCount();
        }

        public List<TopicListItem> getTopicListItemList() {
            return Collections.unmodifiableList(((TopicList) this.instance).getTopicListItemList());
        }

        public boolean hasBase() {
            return ((TopicList) this.instance).hasBase();
        }

        public boolean hasMoreButton() {
            return ((TopicList) this.instance).hasMoreButton();
        }

        public C5904b mergeBase(Base base2) {
            copyOnWrite();
            ((TopicList) this.instance).mergeBase(base2);
            return this;
        }

        public C5904b mergeMoreButton(TopicButton topicButton) {
            copyOnWrite();
            ((TopicList) this.instance).mergeMoreButton(topicButton);
            return this;
        }

        public C5904b removeTopicListItem(int i) {
            copyOnWrite();
            ((TopicList) this.instance).removeTopicListItem(i);
            return this;
        }

        public C5904b setBase(Base base2) {
            copyOnWrite();
            ((TopicList) this.instance).setBase(base2);
            return this;
        }

        public C5904b setMoreButton(TopicButton topicButton) {
            copyOnWrite();
            ((TopicList) this.instance).setMoreButton(topicButton);
            return this;
        }

        public C5904b setTitle(String str) {
            copyOnWrite();
            ((TopicList) this.instance).setTitle(str);
            return this;
        }

        public C5904b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicList) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5904b setTitleIcon(String str) {
            copyOnWrite();
            ((TopicList) this.instance).setTitleIcon(str);
            return this;
        }

        public C5904b setTitleIconBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicList) this.instance).setTitleIconBytes(byteString);
            return this;
        }

        public C5904b setTopicListItem(int i, TopicListItem topicListItem) {
            copyOnWrite();
            ((TopicList) this.instance).setTopicListItem(i, topicListItem);
            return this;
        }

        private C5904b() {
            super(TopicList.DEFAULT_INSTANCE);
        }

        public C5904b addTopicListItem(int i, TopicListItem topicListItem) {
            copyOnWrite();
            ((TopicList) this.instance).addTopicListItem(i, topicListItem);
            return this;
        }

        public C5904b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((TopicList) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5904b setMoreButton(TopicButton.C5902b c5902b) {
            copyOnWrite();
            ((TopicList) this.instance).setMoreButton(c5902b.build());
            return this;
        }

        public C5904b setTopicListItem(int i, TopicListItem.C5906b c5906b) {
            copyOnWrite();
            ((TopicList) this.instance).setTopicListItem(i, c5906b.build());
            return this;
        }

        public C5904b addTopicListItem(TopicListItem.C5906b c5906b) {
            copyOnWrite();
            ((TopicList) this.instance).addTopicListItem(c5906b.build());
            return this;
        }

        public C5904b addTopicListItem(int i, TopicListItem.C5906b c5906b) {
            copyOnWrite();
            ((TopicList) this.instance).addTopicListItem(i, c5906b.build());
            return this;
        }
    }

    static {
        TopicList topicList = new TopicList();
        DEFAULT_INSTANCE = topicList;
        GeneratedMessageLite.registerDefaultInstance(TopicList.class, topicList);
    }

    private TopicList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTopicListItem(Iterable<? extends TopicListItem> iterable) {
        ensureTopicListItemIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.topicListItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopicListItem(TopicListItem topicListItem) {
        topicListItem.getClass();
        ensureTopicListItemIsMutable();
        this.topicListItem_.add(topicListItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoreButton() {
        this.moreButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleIcon() {
        this.titleIcon_ = getDefaultInstance().getTitleIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopicListItem() {
        this.topicListItem_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTopicListItemIsMutable() {
        Internal.ProtobufList<TopicListItem> protobufList = this.topicListItem_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.topicListItem_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TopicList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBase(Base base2) {
        base2.getClass();
        Base base3 = this.base_;
        if (base3 != null && base3 != Base.getDefaultInstance()) {
            this.base_ = Base.newBuilder(this.base_).mergeFrom((Base) base2).buildPartial();
        } else {
            this.base_ = base2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMoreButton(TopicButton topicButton) {
        topicButton.getClass();
        TopicButton topicButton2 = this.moreButton_;
        if (topicButton2 != null && topicButton2 != TopicButton.getDefaultInstance()) {
            this.moreButton_ = TopicButton.newBuilder(this.moreButton_).mergeFrom((TopicButton) topicButton).buildPartial();
        } else {
            this.moreButton_ = topicButton;
        }
    }

    public static C5904b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TopicList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TopicList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopicList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TopicList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTopicListItem(int i) {
        ensureTopicListItemIsMutable();
        this.topicListItem_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoreButton(TopicButton topicButton) {
        topicButton.getClass();
        this.moreButton_ = topicButton;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleIcon(String str) {
        str.getClass();
        this.titleIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.titleIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicListItem(int i, TopicListItem topicListItem) {
        topicListItem.getClass();
        ensureTopicListItemIsMutable();
        this.topicListItem_.set(i, topicListItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5903a.f16000xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TopicList();
            case 2:
                return new C5904b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\t\u0005\u001b", new Object[]{"base_", "title_", "titleIcon_", "moreButton_", "topicListItem_", TopicListItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TopicList> parser = PARSER;
                if (parser == null) {
                    synchronized (TopicList.class) {
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

    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    public TopicButton getMoreButton() {
        TopicButton topicButton = this.moreButton_;
        return topicButton == null ? TopicButton.getDefaultInstance() : topicButton;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getTitleIcon() {
        return this.titleIcon_;
    }

    public ByteString getTitleIconBytes() {
        return ByteString.copyFromUtf8(this.titleIcon_);
    }

    public TopicListItem getTopicListItem(int i) {
        return this.topicListItem_.get(i);
    }

    public int getTopicListItemCount() {
        return this.topicListItem_.size();
    }

    public List<TopicListItem> getTopicListItemList() {
        return this.topicListItem_;
    }

    public InterfaceC5946z getTopicListItemOrBuilder(int i) {
        return this.topicListItem_.get(i);
    }

    public List<? extends InterfaceC5946z> getTopicListItemOrBuilderList() {
        return this.topicListItem_;
    }

    public boolean hasBase() {
        return this.base_ != null;
    }

    public boolean hasMoreButton() {
        return this.moreButton_ != null;
    }

    public static C5904b newBuilder(TopicList topicList) {
        return DEFAULT_INSTANCE.createBuilder(topicList);
    }

    public static TopicList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopicList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TopicList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopicListItem(int i, TopicListItem topicListItem) {
        topicListItem.getClass();
        ensureTopicListItemIsMutable();
        this.topicListItem_.add(i, topicListItem);
    }

    public static TopicList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TopicList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TopicList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TopicList parseFrom(InputStream inputStream) throws IOException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopicList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopicList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TopicList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
