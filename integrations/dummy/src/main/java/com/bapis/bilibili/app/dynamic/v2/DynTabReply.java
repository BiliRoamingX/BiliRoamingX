package com.bapis.bilibili.app.dynamic.v2;

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
public final class DynTabReply extends GeneratedMessageLite<DynTabReply, DynTabReply.Builder> implements MessageLiteOrBuilder {
    private static final DynTabReply DEFAULT_INSTANCE;
    public static final int DYN_TAB_FIELD_NUMBER = 1;
    private static volatile Parser<DynTabReply> PARSER = null;
    public static final int SCREEN_TAB_FIELD_NUMBER = 2;
    private Internal.ProtobufList<DynTab> dynTab_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DynScreenTab> screenTab_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynTabReply$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C59661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16144xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16144xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16144xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16144xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16144xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16144xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16144xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16144xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DynTabReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C59661 c59661) {
            this();
        }

        public Builder addAllDynTab(Iterable<? extends DynTab> iterable) {
            copyOnWrite();
            ((DynTabReply) this.instance).addAllDynTab(iterable);
            return this;
        }

        public Builder addAllScreenTab(Iterable<? extends DynScreenTab> iterable) {
            copyOnWrite();
            ((DynTabReply) this.instance).addAllScreenTab(iterable);
            return this;
        }

        public Builder addDynTab(DynTab dynTab) {
            copyOnWrite();
            ((DynTabReply) this.instance).addDynTab(dynTab);
            return this;
        }

        public Builder addScreenTab(DynScreenTab dynScreenTab) {
            copyOnWrite();
            ((DynTabReply) this.instance).addScreenTab(dynScreenTab);
            return this;
        }

        public Builder clearDynTab() {
            copyOnWrite();
            ((DynTabReply) this.instance).clearDynTab();
            return this;
        }

        public Builder clearScreenTab() {
            copyOnWrite();
            ((DynTabReply) this.instance).clearScreenTab();
            return this;
        }

        public DynTab getDynTab(int i) {
            return ((DynTabReply) this.instance).getDynTab(i);
        }

        public int getDynTabCount() {
            return ((DynTabReply) this.instance).getDynTabCount();
        }

        public List<DynTab> getDynTabList() {
            return Collections.unmodifiableList(((DynTabReply) this.instance).getDynTabList());
        }

        public DynScreenTab getScreenTab(int i) {
            return ((DynTabReply) this.instance).getScreenTab(i);
        }

        public int getScreenTabCount() {
            return ((DynTabReply) this.instance).getScreenTabCount();
        }

        public List<DynScreenTab> getScreenTabList() {
            return Collections.unmodifiableList(((DynTabReply) this.instance).getScreenTabList());
        }

        public Builder removeDynTab(int i) {
            copyOnWrite();
            ((DynTabReply) this.instance).removeDynTab(i);
            return this;
        }

        public Builder removeScreenTab(int i) {
            copyOnWrite();
            ((DynTabReply) this.instance).removeScreenTab(i);
            return this;
        }

        public Builder setDynTab(int i, DynTab dynTab) {
            copyOnWrite();
            ((DynTabReply) this.instance).setDynTab(i, dynTab);
            return this;
        }

        public Builder setScreenTab(int i, DynScreenTab dynScreenTab) {
            copyOnWrite();
            ((DynTabReply) this.instance).setScreenTab(i, dynScreenTab);
            return this;
        }

        private Builder() {
            super(DynTabReply.DEFAULT_INSTANCE);
        }

        public Builder addDynTab(int i, DynTab dynTab) {
            copyOnWrite();
            ((DynTabReply) this.instance).addDynTab(i, dynTab);
            return this;
        }

        public Builder addScreenTab(int i, DynScreenTab dynScreenTab) {
            copyOnWrite();
            ((DynTabReply) this.instance).addScreenTab(i, dynScreenTab);
            return this;
        }

        public Builder setDynTab(int i, DynTab.Builder builder) {
            copyOnWrite();
            ((DynTabReply) this.instance).setDynTab(i, builder.build());
            return this;
        }

        public Builder setScreenTab(int i, DynScreenTab.Builder builder) {
            copyOnWrite();
            ((DynTabReply) this.instance).setScreenTab(i, builder.build());
            return this;
        }

        public Builder addDynTab(DynTab.Builder builder) {
            copyOnWrite();
            ((DynTabReply) this.instance).addDynTab(builder.build());
            return this;
        }

        public Builder addScreenTab(DynScreenTab.Builder builder) {
            copyOnWrite();
            ((DynTabReply) this.instance).addScreenTab(builder.build());
            return this;
        }

        public Builder addDynTab(int i, DynTab.Builder builder) {
            copyOnWrite();
            ((DynTabReply) this.instance).addDynTab(i, builder.build());
            return this;
        }

        public Builder addScreenTab(int i, DynScreenTab.Builder builder) {
            copyOnWrite();
            ((DynTabReply) this.instance).addScreenTab(i, builder.build());
            return this;
        }
    }

    static {
        DynTabReply dynTabReply = new DynTabReply();
        DEFAULT_INSTANCE = dynTabReply;
        GeneratedMessageLite.registerDefaultInstance(DynTabReply.class, dynTabReply);
    }

    private DynTabReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDynTab(Iterable<? extends DynTab> iterable) {
        ensureDynTabIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dynTab_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllScreenTab(Iterable<? extends DynScreenTab> iterable) {
        ensureScreenTabIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.screenTab_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDynTab(DynTab dynTab) {
        dynTab.getClass();
        ensureDynTabIsMutable();
        this.dynTab_.add(dynTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addScreenTab(DynScreenTab dynScreenTab) {
        dynScreenTab.getClass();
        ensureScreenTabIsMutable();
        this.screenTab_.add(dynScreenTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynTab() {
        this.dynTab_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenTab() {
        this.screenTab_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDynTabIsMutable() {
        Internal.ProtobufList<DynTab> protobufList = this.dynTab_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dynTab_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureScreenTabIsMutable() {
        Internal.ProtobufList<DynScreenTab> protobufList = this.screenTab_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.screenTab_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DynTabReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynTabReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynTabReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynTabReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynTabReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDynTab(int i) {
        ensureDynTabIsMutable();
        this.dynTab_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeScreenTab(int i) {
        ensureScreenTabIsMutable();
        this.screenTab_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynTab(int i, DynTab dynTab) {
        dynTab.getClass();
        ensureDynTabIsMutable();
        this.dynTab_.set(i, dynTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenTab(int i, DynScreenTab dynScreenTab) {
        dynScreenTab.getClass();
        ensureScreenTabIsMutable();
        this.screenTab_.set(i, dynScreenTab);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C59661.f16144xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynTabReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"dynTab_", DynTab.class, "screenTab_", DynScreenTab.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynTabReply> parser = PARSER;
                if (parser == null) {
                    synchronized (DynTabReply.class) {
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

    public DynTab getDynTab(int i) {
        return this.dynTab_.get(i);
    }

    public int getDynTabCount() {
        return this.dynTab_.size();
    }

    public List<DynTab> getDynTabList() {
        return this.dynTab_;
    }

    public DynTabOrBuilder getDynTabOrBuilder(int i) {
        return this.dynTab_.get(i);
    }

    public List<? extends DynTabOrBuilder> getDynTabOrBuilderList() {
        return this.dynTab_;
    }

    public DynScreenTab getScreenTab(int i) {
        return this.screenTab_.get(i);
    }

    public int getScreenTabCount() {
        return this.screenTab_.size();
    }

    public List<DynScreenTab> getScreenTabList() {
        return this.screenTab_;
    }

    public DynScreenTabOrBuilder getScreenTabOrBuilder(int i) {
        return this.screenTab_.get(i);
    }

    public List<? extends DynScreenTabOrBuilder> getScreenTabOrBuilderList() {
        return this.screenTab_;
    }

    public static Builder newBuilder(DynTabReply dynTabReply) {
        return DEFAULT_INSTANCE.createBuilder(dynTabReply);
    }

    public static DynTabReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTabReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynTabReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynTabReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDynTab(int i, DynTab dynTab) {
        dynTab.getClass();
        ensureDynTabIsMutable();
        this.dynTab_.add(i, dynTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addScreenTab(int i, DynScreenTab dynScreenTab) {
        dynScreenTab.getClass();
        ensureScreenTabIsMutable();
        this.screenTab_.add(i, dynScreenTab);
    }

    public static DynTabReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynTabReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynTabReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynTabReply parseFrom(InputStream inputStream) throws IOException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynTabReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynTabReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynTabReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTabReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * removeDynTab
     */
    static void access$600(DynTabReply reply, int index) {
    }
}
