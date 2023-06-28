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
public final class TabModule extends GeneratedMessageLite<TabModule, TabModule.Builder> implements MessageLiteOrBuilder {
    private static final TabModule DEFAULT_INSTANCE;
    public static final int EXT_TABS_FIELD_NUMBER = 1;
    public static final int IDX_FIELD_NUMBER = 2;
    private static volatile Parser<TabModule> PARSER;
    private Internal.ProtobufList<ExtTab> extTabs_ = GeneratedMessageLite.emptyProtobufList();
    private int idx_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.TabModule$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16833xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16833xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16833xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16833xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16833xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16833xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16833xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16833xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TabModule, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68741 c68741) {
            this();
        }

        public Builder addAllExtTabs(Iterable<? extends ExtTab> iterable) {
            copyOnWrite();
            ((TabModule) this.instance).addAllExtTabs(iterable);
            return this;
        }

        public Builder addExtTabs(ExtTab extTab) {
            copyOnWrite();
            ((TabModule) this.instance).addExtTabs(extTab);
            return this;
        }

        public Builder clearExtTabs() {
            copyOnWrite();
            ((TabModule) this.instance).clearExtTabs();
            return this;
        }

        public Builder clearIdx() {
            copyOnWrite();
            ((TabModule) this.instance).clearIdx();
            return this;
        }

        public ExtTab getExtTabs(int i) {
            return ((TabModule) this.instance).getExtTabs(i);
        }

        public int getExtTabsCount() {
            return ((TabModule) this.instance).getExtTabsCount();
        }

        public List<ExtTab> getExtTabsList() {
            return Collections.unmodifiableList(((TabModule) this.instance).getExtTabsList());
        }

        public int getIdx() {
            return ((TabModule) this.instance).getIdx();
        }

        public Builder removeExtTabs(int i) {
            copyOnWrite();
            ((TabModule) this.instance).removeExtTabs(i);
            return this;
        }

        public Builder setExtTabs(int i, ExtTab extTab) {
            copyOnWrite();
            ((TabModule) this.instance).setExtTabs(i, extTab);
            return this;
        }

        public Builder setIdx(int i) {
            copyOnWrite();
            ((TabModule) this.instance).setIdx(i);
            return this;
        }

        private Builder() {
            super(TabModule.DEFAULT_INSTANCE);
        }

        public Builder addExtTabs(int i, ExtTab extTab) {
            copyOnWrite();
            ((TabModule) this.instance).addExtTabs(i, extTab);
            return this;
        }

        public Builder setExtTabs(int i, ExtTab.Builder builder) {
            copyOnWrite();
            ((TabModule) this.instance).setExtTabs(i, builder.build());
            return this;
        }

        public Builder addExtTabs(ExtTab.Builder builder) {
            copyOnWrite();
            ((TabModule) this.instance).addExtTabs(builder.build());
            return this;
        }

        public Builder addExtTabs(int i, ExtTab.Builder builder) {
            copyOnWrite();
            ((TabModule) this.instance).addExtTabs(i, builder.build());
            return this;
        }
    }

    static {
        TabModule tabModule = new TabModule();
        DEFAULT_INSTANCE = tabModule;
        GeneratedMessageLite.registerDefaultInstance(TabModule.class, tabModule);
    }

    private TabModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtTabs(Iterable<? extends ExtTab> iterable) {
        ensureExtTabsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.extTabs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtTabs(ExtTab extTab) {
        extTab.getClass();
        ensureExtTabsIsMutable();
        this.extTabs_.add(extTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtTabs() {
        this.extTabs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdx() {
        this.idx_ = 0;
    }

    private void ensureExtTabsIsMutable() {
        Internal.ProtobufList<ExtTab> protobufList = this.extTabs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.extTabs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TabModule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TabModule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TabModule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TabModule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TabModule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtTabs(int i) {
        ensureExtTabsIsMutable();
        this.extTabs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtTabs(int i, ExtTab extTab) {
        extTab.getClass();
        ensureExtTabsIsMutable();
        this.extTabs_.set(i, extTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdx(int i) {
        this.idx_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68741.f16833xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TabModule();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"extTabs_", ExtTab.class, "idx_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TabModule> parser = PARSER;
                if (parser == null) {
                    synchronized (TabModule.class) {
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

    public ExtTab getExtTabs(int i) {
        return this.extTabs_.get(i);
    }

    public int getExtTabsCount() {
        return this.extTabs_.size();
    }

    public List<ExtTab> getExtTabsList() {
        return this.extTabs_;
    }

    public ExtTabOrBuilder getExtTabsOrBuilder(int i) {
        return this.extTabs_.get(i);
    }

    public List<? extends ExtTabOrBuilder> getExtTabsOrBuilderList() {
        return this.extTabs_;
    }

    public int getIdx() {
        return this.idx_;
    }

    public static Builder newBuilder(TabModule tabModule) {
        return DEFAULT_INSTANCE.createBuilder(tabModule);
    }

    public static TabModule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TabModule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TabModule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TabModule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtTabs(int i, ExtTab extTab) {
        extTab.getClass();
        ensureExtTabsIsMutable();
        this.extTabs_.add(i, extTab);
    }

    public static TabModule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TabModule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TabModule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TabModule parseFrom(InputStream inputStream) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TabModule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TabModule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TabModule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
