package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes17.dex */
public final class DynScreenTab extends GeneratedMessageLite<DynScreenTab, DynScreenTab.Builder> implements DynScreenTabOrBuilder {
    private static final DynScreenTab DEFAULT_INSTANCE;
    public static final int DEFAULT_TAB_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<DynScreenTab> PARSER = null;
    public static final int STRATEGY_SHOW_ON_ENTRANCE_FIELD_NUMBER = 4;
    public static final int STRATEGY_SHOW_ON_PULL_UP_FIELD_NUMBER = 6;
    public static final int STRATEGY_SHOW_ON_REFRESH_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean defaultTab_;
    private boolean strategyShowOnEntrance_;
    private boolean strategyShowOnPullUp_;
    private boolean strategyShowOnRefresh_;
    private String title_ = "";
    private String name_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynScreenTab$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C59561 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16134xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16134xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16134xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16134xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16134xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16134xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16134xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16134xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DynScreenTab, Builder> implements DynScreenTabOrBuilder {
        /* synthetic */ Builder(C59561 c59561) {
            this();
        }

        public Builder clearDefaultTab() {
            copyOnWrite();
            ((DynScreenTab) this.instance).clearDefaultTab();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DynScreenTab) this.instance).clearName();
            return this;
        }

        public Builder clearStrategyShowOnEntrance() {
            copyOnWrite();
            ((DynScreenTab) this.instance).clearStrategyShowOnEntrance();
            return this;
        }

        public Builder clearStrategyShowOnPullUp() {
            copyOnWrite();
            ((DynScreenTab) this.instance).clearStrategyShowOnPullUp();
            return this;
        }

        public Builder clearStrategyShowOnRefresh() {
            copyOnWrite();
            ((DynScreenTab) this.instance).clearStrategyShowOnRefresh();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((DynScreenTab) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public boolean getDefaultTab() {
            return ((DynScreenTab) this.instance).getDefaultTab();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public String getName() {
            return ((DynScreenTab) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public ByteString getNameBytes() {
            return ((DynScreenTab) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public boolean getStrategyShowOnEntrance() {
            return ((DynScreenTab) this.instance).getStrategyShowOnEntrance();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public boolean getStrategyShowOnPullUp() {
            return ((DynScreenTab) this.instance).getStrategyShowOnPullUp();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public boolean getStrategyShowOnRefresh() {
            return ((DynScreenTab) this.instance).getStrategyShowOnRefresh();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public String getTitle() {
            return ((DynScreenTab) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
        public ByteString getTitleBytes() {
            return ((DynScreenTab) this.instance).getTitleBytes();
        }

        public Builder setDefaultTab(boolean z) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setDefaultTab(z);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setStrategyShowOnEntrance(boolean z) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setStrategyShowOnEntrance(z);
            return this;
        }

        public Builder setStrategyShowOnPullUp(boolean z) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setStrategyShowOnPullUp(z);
            return this;
        }

        public Builder setStrategyShowOnRefresh(boolean z) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setStrategyShowOnRefresh(z);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((DynScreenTab) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(DynScreenTab.DEFAULT_INSTANCE);
        }
    }

    static {
        DynScreenTab dynScreenTab = new DynScreenTab();
        DEFAULT_INSTANCE = dynScreenTab;
        GeneratedMessageLite.registerDefaultInstance(DynScreenTab.class, dynScreenTab);
    }

    private DynScreenTab() {
    }

    public void clearDefaultTab() {
        this.defaultTab_ = false;
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearStrategyShowOnEntrance() {
        this.strategyShowOnEntrance_ = false;
    }

    public void clearStrategyShowOnPullUp() {
        this.strategyShowOnPullUp_ = false;
    }

    public void clearStrategyShowOnRefresh() {
        this.strategyShowOnRefresh_ = false;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static DynScreenTab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynScreenTab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynScreenTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynScreenTab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynScreenTab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDefaultTab(boolean z) {
        this.defaultTab_ = z;
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public void setStrategyShowOnEntrance(boolean z) {
        this.strategyShowOnEntrance_ = z;
    }

    public void setStrategyShowOnPullUp(boolean z) {
        this.strategyShowOnPullUp_ = z;
    }

    public void setStrategyShowOnRefresh(boolean z) {
        this.strategyShowOnRefresh_ = z;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C59561.f16134xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynScreenTab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"title_", "name_", "defaultTab_", "strategyShowOnEntrance_", "strategyShowOnRefresh_", "strategyShowOnPullUp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynScreenTab> parser = PARSER;
                if (parser == null) {
                    synchronized (DynScreenTab.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public boolean getDefaultTab() {
        return this.defaultTab_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public boolean getStrategyShowOnEntrance() {
        return this.strategyShowOnEntrance_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public boolean getStrategyShowOnPullUp() {
        return this.strategyShowOnPullUp_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public boolean getStrategyShowOnRefresh() {
        return this.strategyShowOnRefresh_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.DynScreenTabOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(DynScreenTab dynScreenTab) {
        return DEFAULT_INSTANCE.createBuilder(dynScreenTab);
    }

    public static DynScreenTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynScreenTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynScreenTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynScreenTab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynScreenTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynScreenTab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynScreenTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynScreenTab parseFrom(InputStream inputStream) throws IOException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynScreenTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynScreenTab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynScreenTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynScreenTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setDefaultTab
     */
    static void access$700(DynScreenTab tab, boolean defaultTab) {
    }
}
