package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.view.v1.ViewReply;
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
public final class FeedViewItem extends GeneratedMessageLite<FeedViewItem, FeedViewItem.Builder> implements FeedViewItemOrBuilder {
    private static final FeedViewItem DEFAULT_INSTANCE;
    public static final int GOTO_FIELD_NUMBER = 2;
    private static volatile Parser<FeedViewItem> PARSER = null;
    public static final int TRACK_ID_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 3;
    public static final int VIEW_FIELD_NUMBER = 1;
    private ViewReply view_;
    private String goto_ = "";
    private String uri_ = "";
    private String trackId_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.FeedViewItem$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16736xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16736xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16736xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16736xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16736xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16736xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16736xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16736xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FeedViewItem, Builder> implements FeedViewItemOrBuilder {
        /* synthetic */ Builder(C67651 c67651) {
            this();
        }

        public Builder clearGoto() {
            copyOnWrite();
            ((FeedViewItem) this.instance).clearGoto();
            return this;
        }

        public Builder clearTrackId() {
            copyOnWrite();
            ((FeedViewItem) this.instance).clearTrackId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((FeedViewItem) this.instance).clearUri();
            return this;
        }

        public Builder clearView() {
            copyOnWrite();
            ((FeedViewItem) this.instance).clearView();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public String getGoto() {
            return ((FeedViewItem) this.instance).getGoto();
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public ByteString getGotoBytes() {
            return ((FeedViewItem) this.instance).getGotoBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public String getTrackId() {
            return ((FeedViewItem) this.instance).getTrackId();
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public ByteString getTrackIdBytes() {
            return ((FeedViewItem) this.instance).getTrackIdBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public String getUri() {
            return ((FeedViewItem) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public ByteString getUriBytes() {
            return ((FeedViewItem) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public ViewReply getView() {
            return ((FeedViewItem) this.instance).getView();
        }

        @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
        public boolean hasView() {
            return ((FeedViewItem) this.instance).hasView();
        }

        public Builder mergeView(ViewReply viewReply) {
            copyOnWrite();
            ((FeedViewItem) this.instance).mergeView(viewReply);
            return this;
        }

        public Builder setGoto(String str) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setGoto(str);
            return this;
        }

        public Builder setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setGotoBytes(byteString);
            return this;
        }

        public Builder setTrackId(String str) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setTrackId(str);
            return this;
        }

        public Builder setTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setTrackIdBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setUriBytes(byteString);
            return this;
        }

        public Builder setView(ViewReply viewReply) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setView(viewReply);
            return this;
        }

        private Builder() {
            super(FeedViewItem.DEFAULT_INSTANCE);
        }

        public Builder setView(ViewReply.Builder builder) {
            copyOnWrite();
            ((FeedViewItem) this.instance).setView(builder.build());
            return this;
        }
    }

    static {
        FeedViewItem feedViewItem = new FeedViewItem();
        DEFAULT_INSTANCE = feedViewItem;
        GeneratedMessageLite.registerDefaultInstance(FeedViewItem.class, feedViewItem);
    }

    private FeedViewItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearView() {
        this.view_ = null;
    }

    public static FeedViewItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeView(ViewReply viewReply) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FeedViewItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FeedViewItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedViewItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FeedViewItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoto(String str) {
        str.getClass();
        this.goto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goto_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setView(ViewReply viewReply) {
        viewReply.getClass();
        this.view_ = viewReply;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67651.f16736xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FeedViewItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"view_", "goto_", "uri_", "trackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FeedViewItem> parser = PARSER;
                if (parser == null) {
                    synchronized (FeedViewItem.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public String getGoto() {
        return this.goto_;
    }

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public String getTrackId() {
        return this.trackId_;
    }

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public ByteString getTrackIdBytes() {
        return ByteString.copyFromUtf8(this.trackId_);
    }

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public ViewReply getView() {
        ViewReply viewReply = this.view_;
        return viewReply == null ? ViewReply.getDefaultInstance() : viewReply;
    }

    @Override // com.bapis.bilibili.app.view.v1.FeedViewItemOrBuilder
    public boolean hasView() {
        return this.view_ != null;
    }

    public static Builder newBuilder(FeedViewItem feedViewItem) {
        return DEFAULT_INSTANCE.createBuilder(feedViewItem);
    }

    public static FeedViewItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedViewItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FeedViewItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FeedViewItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FeedViewItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeedViewItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FeedViewItem parseFrom(InputStream inputStream) throws IOException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedViewItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedViewItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FeedViewItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedViewItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
