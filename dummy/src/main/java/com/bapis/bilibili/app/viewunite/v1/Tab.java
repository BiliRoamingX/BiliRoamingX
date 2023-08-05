package com.bapis.bilibili.app.viewunite.v1;

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
public final class Tab extends GeneratedMessageLite<Tab, Tab.Builder> implements MessageLiteOrBuilder {
    public static final int DANMAKU_ENTRANCE_FIELD_NUMBER = 3;
    private static final Tab DEFAULT_INSTANCE;
    private static volatile Parser<Tab> PARSER = null;
    public static final int TAB_BG_FIELD_NUMBER = 2;
    public static final int TAB_MODULE_FIELD_NUMBER = 1;
    private TabControl danmakuEntrance_;
    private Internal.ProtobufList<TabModule> tabModule_ = GeneratedMessageLite.emptyProtobufList();
    private String tabBg_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Tab$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17130xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17130xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17130xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17130xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17130xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17130xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17130xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17130xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Tab, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71621 c71621) {
            this();
        }

        public Builder addAllTabModule(Iterable<? extends TabModule> iterable) {
            copyOnWrite();
            ((Tab) this.instance).addAllTabModule(iterable);
            return this;
        }

        public Builder addTabModule(TabModule tabModule) {
            copyOnWrite();
            ((Tab) this.instance).addTabModule(tabModule);
            return this;
        }

        public Builder clearDanmakuEntrance() {
            copyOnWrite();
            ((Tab) this.instance).clearDanmakuEntrance();
            return this;
        }

        public Builder clearTabBg() {
            copyOnWrite();
            ((Tab) this.instance).clearTabBg();
            return this;
        }

        public Builder clearTabModule() {
            copyOnWrite();
            ((Tab) this.instance).clearTabModule();
            return this;
        }

        public TabControl getDanmakuEntrance() {
            return ((Tab) this.instance).getDanmakuEntrance();
        }

        public String getTabBg() {
            return ((Tab) this.instance).getTabBg();
        }

        public ByteString getTabBgBytes() {
            return ((Tab) this.instance).getTabBgBytes();
        }

        public TabModule getTabModule(int i) {
            return ((Tab) this.instance).getTabModule(i);
        }

        public int getTabModuleCount() {
            return ((Tab) this.instance).getTabModuleCount();
        }

        public List<TabModule> getTabModuleList() {
            return Collections.unmodifiableList(((Tab) this.instance).getTabModuleList());
        }

        public boolean hasDanmakuEntrance() {
            return ((Tab) this.instance).hasDanmakuEntrance();
        }

        public Builder mergeDanmakuEntrance(TabControl tabControl) {
            copyOnWrite();
            ((Tab) this.instance).mergeDanmakuEntrance(tabControl);
            return this;
        }

        public Builder removeTabModule(int i) {
            copyOnWrite();
            ((Tab) this.instance).removeTabModule(i);
            return this;
        }

        public Builder setDanmakuEntrance(TabControl tabControl) {
            copyOnWrite();
            ((Tab) this.instance).setDanmakuEntrance(tabControl);
            return this;
        }

        public Builder setTabBg(String str) {
            copyOnWrite();
            ((Tab) this.instance).setTabBg(str);
            return this;
        }

        public Builder setTabBgBytes(ByteString byteString) {
            copyOnWrite();
            ((Tab) this.instance).setTabBgBytes(byteString);
            return this;
        }

        public Builder setTabModule(int i, TabModule tabModule) {
            copyOnWrite();
            ((Tab) this.instance).setTabModule(i, tabModule);
            return this;
        }

        private Builder() {
            super(Tab.DEFAULT_INSTANCE);
        }

        public Builder addTabModule(int i, TabModule tabModule) {
            copyOnWrite();
            ((Tab) this.instance).addTabModule(i, tabModule);
            return this;
        }

        public Builder setDanmakuEntrance(TabControl.Builder builder) {
            copyOnWrite();
            ((Tab) this.instance).setDanmakuEntrance(builder.build());
            return this;
        }

        public Builder setTabModule(int i, TabModule.Builder builder) {
            copyOnWrite();
            ((Tab) this.instance).setTabModule(i, builder.build());
            return this;
        }

        public Builder addTabModule(TabModule.Builder builder) {
            copyOnWrite();
            ((Tab) this.instance).addTabModule(builder.build());
            return this;
        }

        public Builder addTabModule(int i, TabModule.Builder builder) {
            copyOnWrite();
            ((Tab) this.instance).addTabModule(i, builder.build());
            return this;
        }
    }

    static {
        Tab tab = new Tab();
        DEFAULT_INSTANCE = tab;
        GeneratedMessageLite.registerDefaultInstance(Tab.class, tab);
    }

    private Tab() {
    }

    public void addAllTabModule(Iterable<? extends TabModule> iterable) {
        ensureTabModuleIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tabModule_);
    }

    public void addTabModule(TabModule tabModule) {
        tabModule.getClass();
        ensureTabModuleIsMutable();
        this.tabModule_.add(tabModule);
    }

    public void clearDanmakuEntrance() {
        this.danmakuEntrance_ = null;
    }

    public void clearTabBg() {
        this.tabBg_ = getDefaultInstance().getTabBg();
    }

    public void clearTabModule() {
        this.tabModule_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTabModuleIsMutable() {
        Internal.ProtobufList<TabModule> protobufList = this.tabModule_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tabModule_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Tab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeDanmakuEntrance(TabControl tabControl) {
        tabControl.getClass();
        TabControl tabControl2 = this.danmakuEntrance_;
        if (tabControl2 != null && tabControl2 != TabControl.getDefaultInstance()) {
            this.danmakuEntrance_ = TabControl.newBuilder(this.danmakuEntrance_).mergeFrom((TabControl) tabControl).buildPartial();
        } else {
            this.danmakuEntrance_ = tabControl;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Tab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Tab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Tab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Tab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeTabModule(int i) {
        ensureTabModuleIsMutable();
        this.tabModule_.remove(i);
    }

    public void setDanmakuEntrance(TabControl tabControl) {
        tabControl.getClass();
        this.danmakuEntrance_ = tabControl;
    }

    public void setTabBg(String str) {
        str.getClass();
        this.tabBg_ = str;
    }

    public void setTabBgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tabBg_ = byteString.toStringUtf8();
    }

    public void setTabModule(int i, TabModule tabModule) {
        tabModule.getClass();
        ensureTabModuleIsMutable();
        this.tabModule_.set(i, tabModule);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71621.f17130xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Tab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0208\u0003\t", new Object[]{"tabModule_", TabModule.class, "tabBg_", "danmakuEntrance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Tab> parser = PARSER;
                if (parser == null) {
                    synchronized (Tab.class) {
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

    public TabControl getDanmakuEntrance() {
        TabControl tabControl = this.danmakuEntrance_;
        return tabControl == null ? TabControl.getDefaultInstance() : tabControl;
    }

    public String getTabBg() {
        return this.tabBg_;
    }

    public ByteString getTabBgBytes() {
        return ByteString.copyFromUtf8(this.tabBg_);
    }

    public TabModule getTabModule(int i) {
        return this.tabModule_.get(i);
    }

    public int getTabModuleCount() {
        return this.tabModule_.size();
    }

    public List<TabModule> getTabModuleList() {
        return this.tabModule_;
    }

    public TabModuleOrBuilder getTabModuleOrBuilder(int i) {
        return this.tabModule_.get(i);
    }

    public List<? extends TabModuleOrBuilder> getTabModuleOrBuilderList() {
        return this.tabModule_;
    }

    public boolean hasDanmakuEntrance() {
        return this.danmakuEntrance_ != null;
    }

    public static Builder newBuilder(Tab tab) {
        return DEFAULT_INSTANCE.createBuilder(tab);
    }

    public static Tab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Tab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Tab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addTabModule(int i, TabModule tabModule) {
        tabModule.getClass();
        ensureTabModuleIsMutable();
        this.tabModule_.add(i, tabModule);
    }

    public static Tab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Tab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Tab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Tab parseFrom(InputStream inputStream) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Tab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Tab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Tab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
