package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.ModuleOrBuilder;
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
public final class IntroductionTab extends GeneratedMessageLite<IntroductionTab, IntroductionTab.Builder> implements MessageLiteOrBuilder {
    private static final IntroductionTab DEFAULT_INSTANCE;
    public static final int MODULES_FIELD_NUMBER = 2;
    private static volatile Parser<IntroductionTab> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private Internal.ProtobufList<Module> modules_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.IntroductionTab$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71351 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17109xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17109xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17109xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17109xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17109xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17109xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17109xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17109xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<IntroductionTab, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71351 c71351) {
            this();
        }

        public Builder addAllModules(Iterable<? extends Module> iterable) {
            copyOnWrite();
            ((IntroductionTab) this.instance).addAllModules(iterable);
            return this;
        }

        public Builder addModules(Module module) {
            copyOnWrite();
            ((IntroductionTab) this.instance).addModules(module);
            return this;
        }

        public Builder clearModules() {
            copyOnWrite();
            ((IntroductionTab) this.instance).clearModules();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((IntroductionTab) this.instance).clearTitle();
            return this;
        }

        public Module getModules(int i) {
            return ((IntroductionTab) this.instance).getModules(i);
        }

        public int getModulesCount() {
            return ((IntroductionTab) this.instance).getModulesCount();
        }

        public List<Module> getModulesList() {
            return Collections.unmodifiableList(((IntroductionTab) this.instance).getModulesList());
        }

        public String getTitle() {
            return ((IntroductionTab) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((IntroductionTab) this.instance).getTitleBytes();
        }

        public Builder removeModules(int i) {
            copyOnWrite();
            ((IntroductionTab) this.instance).removeModules(i);
            return this;
        }

        public Builder setModules(int i, Module module) {
            copyOnWrite();
            ((IntroductionTab) this.instance).setModules(i, module);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((IntroductionTab) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((IntroductionTab) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(IntroductionTab.DEFAULT_INSTANCE);
        }

        public Builder addModules(int i, Module module) {
            copyOnWrite();
            ((IntroductionTab) this.instance).addModules(i, module);
            return this;
        }

        public Builder setModules(int i, Module.Builder builder) {
            copyOnWrite();
            ((IntroductionTab) this.instance).setModules(i, builder.build());
            return this;
        }

        public Builder addModules(Module.Builder builder) {
            copyOnWrite();
            ((IntroductionTab) this.instance).addModules(builder.build());
            return this;
        }

        public Builder addModules(int i, Module.Builder builder) {
            copyOnWrite();
            ((IntroductionTab) this.instance).addModules(i, builder.build());
            return this;
        }
    }

    static {
        IntroductionTab introductionTab = new IntroductionTab();
        DEFAULT_INSTANCE = introductionTab;
        GeneratedMessageLite.registerDefaultInstance(IntroductionTab.class, introductionTab);
    }

    private IntroductionTab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllModules(Iterable<? extends Module> iterable) {
        ensureModulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.modules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModules(Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.add(module);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModules() {
        this.modules_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureModulesIsMutable() {
        Internal.ProtobufList<Module> protobufList = this.modules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.modules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static IntroductionTab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IntroductionTab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IntroductionTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntroductionTab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IntroductionTab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeModules(int i) {
        ensureModulesIsMutable();
        this.modules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModules(int i, Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.set(i, module);
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
        switch (C71351.f17109xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new IntroductionTab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"title_", "modules_", Module.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IntroductionTab> parser = PARSER;
                if (parser == null) {
                    synchronized (IntroductionTab.class) {
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

    public Module getModules(int i) {
        return this.modules_.get(i);
    }

    public int getModulesCount() {
        return this.modules_.size();
    }

    public List<Module> getModulesList() {
        return this.modules_;
    }

    public ModuleOrBuilder getModulesOrBuilder(int i) {
        return this.modules_.get(i);
    }

    public List<? extends ModuleOrBuilder> getModulesOrBuilderList() {
        return this.modules_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(IntroductionTab introductionTab) {
        return DEFAULT_INSTANCE.createBuilder(introductionTab);
    }

    public static IntroductionTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntroductionTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntroductionTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IntroductionTab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModules(int i, Module module) {
        module.getClass();
        ensureModulesIsMutable();
        this.modules_.add(i, module);
    }

    public static IntroductionTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IntroductionTab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IntroductionTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IntroductionTab parseFrom(InputStream inputStream) throws IOException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntroductionTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntroductionTab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IntroductionTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntroductionTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
