package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class ReplyTab extends GeneratedMessageLite<ReplyTab, ReplyTab.Builder> implements MessageLiteOrBuilder {
    public static final int CONTROL_FIELD_NUMBER = 3;
    private static final ReplyTab DEFAULT_INSTANCE;
    private static volatile Parser<ReplyTab> PARSER = null;
    public static final int REPLY_STYLE_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private TabControl control_;
    private ReplyStyle replyStyle_;
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ReplyTab$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17123xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17123xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17123xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17123xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17123xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17123xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17123xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17123xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ReplyTab, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71551 c71551) {
            this();
        }

        public Builder clearControl() {
            copyOnWrite();
            ((ReplyTab) this.instance).clearControl();
            return this;
        }

        public Builder clearReplyStyle() {
            copyOnWrite();
            ((ReplyTab) this.instance).clearReplyStyle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ReplyTab) this.instance).clearTitle();
            return this;
        }

        public TabControl getControl() {
            return ((ReplyTab) this.instance).getControl();
        }

        public ReplyStyle getReplyStyle() {
            return ((ReplyTab) this.instance).getReplyStyle();
        }

        public String getTitle() {
            return ((ReplyTab) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((ReplyTab) this.instance).getTitleBytes();
        }

        public boolean hasControl() {
            return ((ReplyTab) this.instance).hasControl();
        }

        public boolean hasReplyStyle() {
            return ((ReplyTab) this.instance).hasReplyStyle();
        }

        public Builder mergeControl(TabControl tabControl) {
            copyOnWrite();
            ((ReplyTab) this.instance).mergeControl(tabControl);
            return this;
        }

        public Builder mergeReplyStyle(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ReplyTab) this.instance).mergeReplyStyle(replyStyle);
            return this;
        }

        public Builder setControl(TabControl tabControl) {
            copyOnWrite();
            ((ReplyTab) this.instance).setControl(tabControl);
            return this;
        }

        public Builder setReplyStyle(ReplyStyle replyStyle) {
            copyOnWrite();
            ((ReplyTab) this.instance).setReplyStyle(replyStyle);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ReplyTab) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyTab) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(ReplyTab.DEFAULT_INSTANCE);
        }

        public Builder setControl(TabControl.Builder builder) {
            copyOnWrite();
            ((ReplyTab) this.instance).setControl(builder.build());
            return this;
        }

        public Builder setReplyStyle(ReplyStyle.Builder builder) {
            copyOnWrite();
            ((ReplyTab) this.instance).setReplyStyle(builder.build());
            return this;
        }
    }

    static {
        ReplyTab replyTab = new ReplyTab();
        DEFAULT_INSTANCE = replyTab;
        GeneratedMessageLite.registerDefaultInstance(ReplyTab.class, replyTab);
    }

    private ReplyTab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplyStyle() {
        this.replyStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ReplyTab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControl(TabControl tabControl) {
        tabControl.getClass();
        TabControl tabControl2 = this.control_;
        if (tabControl2 != null && tabControl2 != TabControl.getDefaultInstance()) {
            this.control_ = TabControl.newBuilder(this.control_).mergeFrom((TabControl) tabControl).buildPartial();
        } else {
            this.control_ = tabControl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReplyStyle(ReplyStyle replyStyle) {
        replyStyle.getClass();
        ReplyStyle replyStyle2 = this.replyStyle_;
        if (replyStyle2 != null && replyStyle2 != ReplyStyle.getDefaultInstance()) {
            this.replyStyle_ = ReplyStyle.newBuilder(this.replyStyle_).mergeFrom((ReplyStyle) replyStyle).buildPartial();
        } else {
            this.replyStyle_ = replyStyle;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReplyTab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReplyTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyTab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReplyTab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControl(TabControl tabControl) {
        tabControl.getClass();
        this.control_ = tabControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyStyle(ReplyStyle replyStyle) {
        replyStyle.getClass();
        this.replyStyle_ = replyStyle;
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
        switch (C71551.f17123xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReplyTab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t", new Object[]{"replyStyle_", "title_", "control_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReplyTab> parser = PARSER;
                if (parser == null) {
                    synchronized (ReplyTab.class) {
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

    public TabControl getControl() {
        TabControl tabControl = this.control_;
        return tabControl == null ? TabControl.getDefaultInstance() : tabControl;
    }

    public ReplyStyle getReplyStyle() {
        ReplyStyle replyStyle = this.replyStyle_;
        return replyStyle == null ? ReplyStyle.getDefaultInstance() : replyStyle;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasControl() {
        return this.control_ != null;
    }

    public boolean hasReplyStyle() {
        return this.replyStyle_ != null;
    }

    public static Builder newBuilder(ReplyTab replyTab) {
        return DEFAULT_INSTANCE.createBuilder(replyTab);
    }

    public static ReplyTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReplyTab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReplyTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReplyTab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReplyTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReplyTab parseFrom(InputStream inputStream) throws IOException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyTab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReplyTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
