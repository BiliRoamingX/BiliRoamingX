package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class ListenerGuideBar extends GeneratedMessageLite<ListenerGuideBar, ListenerGuideBar.Builder> implements MessageLiteOrBuilder {
    public static final int BACKGROUND_TIME_FIELD_NUMBER = 6;
    public static final int BTN_TEXT_FIELD_NUMBER = 4;
    private static final ListenerGuideBar DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile Parser<ListenerGuideBar> PARSER = null;
    public static final int SHOW_STRATEGY_FIELD_NUMBER = 1;
    public static final int SHOW_TIME_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 3;
    private long backgroundTime_;
    private long showStrategy_;
    private long showTime_;
    private String icon_ = "";
    private String text_ = "";
    private String btnText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ListenerGuideBar$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16757xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16757xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16757xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16757xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16757xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16757xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16757xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16757xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ListenerGuideBar, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67901 c67901) {
            this();
        }

        public Builder clearBackgroundTime() {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).clearBackgroundTime();
            return this;
        }

        public Builder clearBtnText() {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).clearBtnText();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).clearIcon();
            return this;
        }

        public Builder clearShowStrategy() {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).clearShowStrategy();
            return this;
        }

        public Builder clearShowTime() {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).clearShowTime();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).clearText();
            return this;
        }

        public long getBackgroundTime() {
            return ((ListenerGuideBar) this.instance).getBackgroundTime();
        }

        public String getBtnText() {
            return ((ListenerGuideBar) this.instance).getBtnText();
        }

        public ByteString getBtnTextBytes() {
            return ((ListenerGuideBar) this.instance).getBtnTextBytes();
        }

        public String getIcon() {
            return ((ListenerGuideBar) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((ListenerGuideBar) this.instance).getIconBytes();
        }

        public long getShowStrategy() {
            return ((ListenerGuideBar) this.instance).getShowStrategy();
        }

        public long getShowTime() {
            return ((ListenerGuideBar) this.instance).getShowTime();
        }

        public String getText() {
            return ((ListenerGuideBar) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((ListenerGuideBar) this.instance).getTextBytes();
        }

        public Builder setBackgroundTime(long j) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setBackgroundTime(j);
            return this;
        }

        public Builder setBtnText(String str) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setBtnText(str);
            return this;
        }

        public Builder setBtnTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setBtnTextBytes(byteString);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setShowStrategy(long j) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setShowStrategy(j);
            return this;
        }

        public Builder setShowTime(long j) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setShowTime(j);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ListenerGuideBar) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(ListenerGuideBar.DEFAULT_INSTANCE);
        }
    }

    static {
        ListenerGuideBar listenerGuideBar = new ListenerGuideBar();
        DEFAULT_INSTANCE = listenerGuideBar;
        GeneratedMessageLite.registerDefaultInstance(ListenerGuideBar.class, listenerGuideBar);
    }

    private ListenerGuideBar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundTime() {
        this.backgroundTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtnText() {
        this.btnText_ = getDefaultInstance().getBtnText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowStrategy() {
        this.showStrategy_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTime() {
        this.showTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static ListenerGuideBar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ListenerGuideBar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenerGuideBar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenerGuideBar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ListenerGuideBar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundTime(long j) {
        this.backgroundTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnText(String str) {
        str.getClass();
        this.btnText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btnText_ = byteString.toStringUtf8();
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
    public void setShowStrategy(long j) {
        this.showStrategy_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTime(long j) {
        this.showTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67901.f16757xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ListenerGuideBar();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0002", new Object[]{"showStrategy_", "icon_", "text_", "btnText_", "showTime_", "backgroundTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListenerGuideBar> parser = PARSER;
                if (parser == null) {
                    synchronized (ListenerGuideBar.class) {
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

    public long getBackgroundTime() {
        return this.backgroundTime_;
    }

    public String getBtnText() {
        return this.btnText_;
    }

    public ByteString getBtnTextBytes() {
        return ByteString.copyFromUtf8(this.btnText_);
    }

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public long getShowStrategy() {
        return this.showStrategy_;
    }

    public long getShowTime() {
        return this.showTime_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(ListenerGuideBar listenerGuideBar) {
        return DEFAULT_INSTANCE.createBuilder(listenerGuideBar);
    }

    public static ListenerGuideBar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenerGuideBar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListenerGuideBar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListenerGuideBar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ListenerGuideBar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListenerGuideBar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListenerGuideBar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ListenerGuideBar parseFrom(InputStream inputStream) throws IOException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenerGuideBar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListenerGuideBar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListenerGuideBar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenerGuideBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
