package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class TopicListItem extends GeneratedMessageLite<TopicListItem, TopicListItem.C5906b> implements InterfaceC5946z {
    private static final TopicListItem DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int ICON_TITLE_FIELD_NUMBER = 2;
    private static volatile Parser<TopicListItem> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 7;
    public static final int TOPIC_ID_FIELD_NUMBER = 3;
    public static final int TOPIC_NAME_FIELD_NUMBER = 4;
    public static final int UP_MID_FIELD_NUMBER = 6;
    public static final int URL_FIELD_NUMBER = 5;
    private long position_;
    private long topicId_;
    private long upMid_;
    private String icon_ = "";
    private String iconTitle_ = "";
    private String topicName_ = "";
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TopicListItem$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5905a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16001xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16001xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16001xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TopicListItem$b */
    /* loaded from: classes13.dex */
    public static final class C5906b extends GeneratedMessageLite.Builder<TopicListItem, C5906b> implements InterfaceC5946z {
        /* synthetic */ C5906b(C5905a c5905a) {
            this();
        }

        public C5906b clearIcon() {
            copyOnWrite();
            ((TopicListItem) this.instance).clearIcon();
            return this;
        }

        public C5906b clearIconTitle() {
            copyOnWrite();
            ((TopicListItem) this.instance).clearIconTitle();
            return this;
        }

        public C5906b clearPosition() {
            copyOnWrite();
            ((TopicListItem) this.instance).clearPosition();
            return this;
        }

        public C5906b clearTopicId() {
            copyOnWrite();
            ((TopicListItem) this.instance).clearTopicId();
            return this;
        }

        public C5906b clearTopicName() {
            copyOnWrite();
            ((TopicListItem) this.instance).clearTopicName();
            return this;
        }

        public C5906b clearUpMid() {
            copyOnWrite();
            ((TopicListItem) this.instance).clearUpMid();
            return this;
        }

        public C5906b clearUrl() {
            copyOnWrite();
            ((TopicListItem) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public String getIcon() {
            return ((TopicListItem) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public ByteString getIconBytes() {
            return ((TopicListItem) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public String getIconTitle() {
            return ((TopicListItem) this.instance).getIconTitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public ByteString getIconTitleBytes() {
            return ((TopicListItem) this.instance).getIconTitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public long getPosition() {
            return ((TopicListItem) this.instance).getPosition();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public long getTopicId() {
            return ((TopicListItem) this.instance).getTopicId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public String getTopicName() {
            return ((TopicListItem) this.instance).getTopicName();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public ByteString getTopicNameBytes() {
            return ((TopicListItem) this.instance).getTopicNameBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public long getUpMid() {
            return ((TopicListItem) this.instance).getUpMid();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public String getUrl() {
            return ((TopicListItem) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
        public ByteString getUrlBytes() {
            return ((TopicListItem) this.instance).getUrlBytes();
        }

        public C5906b setIcon(String str) {
            copyOnWrite();
            ((TopicListItem) this.instance).setIcon(str);
            return this;
        }

        public C5906b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicListItem) this.instance).setIconBytes(byteString);
            return this;
        }

        public C5906b setIconTitle(String str) {
            copyOnWrite();
            ((TopicListItem) this.instance).setIconTitle(str);
            return this;
        }

        public C5906b setIconTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicListItem) this.instance).setIconTitleBytes(byteString);
            return this;
        }

        public C5906b setPosition(long j) {
            copyOnWrite();
            ((TopicListItem) this.instance).setPosition(j);
            return this;
        }

        public C5906b setTopicId(long j) {
            copyOnWrite();
            ((TopicListItem) this.instance).setTopicId(j);
            return this;
        }

        public C5906b setTopicName(String str) {
            copyOnWrite();
            ((TopicListItem) this.instance).setTopicName(str);
            return this;
        }

        public C5906b setTopicNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicListItem) this.instance).setTopicNameBytes(byteString);
            return this;
        }

        public C5906b setUpMid(long j) {
            copyOnWrite();
            ((TopicListItem) this.instance).setUpMid(j);
            return this;
        }

        public C5906b setUrl(String str) {
            copyOnWrite();
            ((TopicListItem) this.instance).setUrl(str);
            return this;
        }

        public C5906b setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicListItem) this.instance).setUrlBytes(byteString);
            return this;
        }

        private C5906b() {
            super(TopicListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        TopicListItem topicListItem = new TopicListItem();
        DEFAULT_INSTANCE = topicListItem;
        GeneratedMessageLite.registerDefaultInstance(TopicListItem.class, topicListItem);
    }

    private TopicListItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconTitle() {
        this.iconTitle_ = getDefaultInstance().getIconTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopicId() {
        this.topicId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopicName() {
        this.topicName_ = getDefaultInstance().getTopicName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpMid() {
        this.upMid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static TopicListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5906b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TopicListItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TopicListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopicListItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TopicListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconTitle(String str) {
        str.getClass();
        this.iconTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(long j) {
        this.position_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicId(long j) {
        this.topicId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicName(String str) {
        str.getClass();
        this.topicName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topicName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpMid(long j) {
        this.upMid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5905a.f16001xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TopicListItem();
            case 2:
                return new C5906b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0002\u0007\u0002", new Object[]{"icon_", "iconTitle_", "topicId_", "topicName_", "url_", "upMid_", "position_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TopicListItem> parser = PARSER;
                if (parser == null) {
                    synchronized (TopicListItem.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public String getIconTitle() {
        return this.iconTitle_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public ByteString getIconTitleBytes() {
        return ByteString.copyFromUtf8(this.iconTitle_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public long getPosition() {
        return this.position_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public long getTopicId() {
        return this.topicId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public String getTopicName() {
        return this.topicName_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public ByteString getTopicNameBytes() {
        return ByteString.copyFromUtf8(this.topicName_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public long getUpMid() {
        return this.upMid_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5946z
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static C5906b newBuilder(TopicListItem topicListItem) {
        return DEFAULT_INSTANCE.createBuilder(topicListItem);
    }

    public static TopicListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopicListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TopicListItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TopicListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TopicListItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TopicListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TopicListItem parseFrom(InputStream inputStream) throws IOException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopicListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopicListItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TopicListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
