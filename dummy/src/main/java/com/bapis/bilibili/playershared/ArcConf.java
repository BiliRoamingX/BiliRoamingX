package com.bapis.bilibili.playershared;

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
/* loaded from: classes14.dex */
public final class ArcConf extends GeneratedMessageLite<ArcConf, ArcConf.Builder> implements MessageLiteOrBuilder {
    private static final ArcConf DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 2;
    public static final int EXTRA_CONTENT_FIELD_NUMBER = 3;
    public static final int IS_SUPPORT_FIELD_NUMBER = 1;
    private static volatile Parser<ArcConf> PARSER = null;
    public static final int UNSUPPORT_SCENE_FIELD_NUMBER = 4;
    private static final Internal.ListAdapter.Converter<Integer, UnsupportScene> unsupportScene_converter_ = new Internal.ListAdapter.Converter<Integer, UnsupportScene>() { // from class: com.bapis.bilibili.playershared.ArcConf.1
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public UnsupportScene convert(Integer num) {
            UnsupportScene forNumber = UnsupportScene.forNumber(num.intValue());
            return forNumber == null ? UnsupportScene.UNRECOGNIZED : forNumber;
        }
    };
    private boolean disabled_;
    private ExtraContent extraContent_;
    private boolean isSupport_;
    private int unsupportSceneMemoizedSerializedSize;
    private Internal.IntList unsupportScene_ = GeneratedMessageLite.emptyIntList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.ArcConf$2 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78972 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17609xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17609xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17609xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17609xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17609xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17609xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17609xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17609xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ArcConf, Builder> implements MessageLiteOrBuilder {
        public Builder addAllUnsupportScene(Iterable<? extends UnsupportScene> iterable) {
            copyOnWrite();
            ((ArcConf) this.instance).addAllUnsupportScene(iterable);
            return this;
        }

        public Builder addAllUnsupportSceneValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((ArcConf) this.instance).addAllUnsupportSceneValue(iterable);
            return this;
        }

        public Builder addUnsupportScene(UnsupportScene unsupportScene) {
            copyOnWrite();
            ((ArcConf) this.instance).addUnsupportScene(unsupportScene);
            return this;
        }

        public Builder addUnsupportSceneValue(int i) {
            ((ArcConf) this.instance).addUnsupportSceneValue(i);
            return this;
        }

        public Builder clearDisabled() {
            copyOnWrite();
            ((ArcConf) this.instance).clearDisabled();
            return this;
        }

        public Builder clearExtraContent() {
            copyOnWrite();
            ((ArcConf) this.instance).clearExtraContent();
            return this;
        }

        public Builder clearIsSupport() {
            copyOnWrite();
            ((ArcConf) this.instance).clearIsSupport();
            return this;
        }

        public Builder clearUnsupportScene() {
            copyOnWrite();
            ((ArcConf) this.instance).clearUnsupportScene();
            return this;
        }

        public boolean getDisabled() {
            return ((ArcConf) this.instance).getDisabled();
        }

        public ExtraContent getExtraContent() {
            return ((ArcConf) this.instance).getExtraContent();
        }

        public boolean getIsSupport() {
            return ((ArcConf) this.instance).getIsSupport();
        }

        public UnsupportScene getUnsupportScene(int i) {
            return ((ArcConf) this.instance).getUnsupportScene(i);
        }

        public int getUnsupportSceneCount() {
            return ((ArcConf) this.instance).getUnsupportSceneCount();
        }

        public List<UnsupportScene> getUnsupportSceneList() {
            return ((ArcConf) this.instance).getUnsupportSceneList();
        }

        public int getUnsupportSceneValue(int i) {
            return ((ArcConf) this.instance).getUnsupportSceneValue(i);
        }

        public List<Integer> getUnsupportSceneValueList() {
            return Collections.unmodifiableList(((ArcConf) this.instance).getUnsupportSceneValueList());
        }

        public boolean hasExtraContent() {
            return ((ArcConf) this.instance).hasExtraContent();
        }

        public Builder mergeExtraContent(ExtraContent extraContent) {
            copyOnWrite();
            ((ArcConf) this.instance).mergeExtraContent(extraContent);
            return this;
        }

        public Builder setDisabled(boolean z) {
            copyOnWrite();
            ((ArcConf) this.instance).setDisabled(z);
            return this;
        }

        public Builder setExtraContent(ExtraContent extraContent) {
            copyOnWrite();
            ((ArcConf) this.instance).setExtraContent(extraContent);
            return this;
        }

        public Builder setIsSupport(boolean z) {
            copyOnWrite();
            ((ArcConf) this.instance).setIsSupport(z);
            return this;
        }

        public Builder setUnsupportScene(int i, UnsupportScene unsupportScene) {
            copyOnWrite();
            ((ArcConf) this.instance).setUnsupportScene(i, unsupportScene);
            return this;
        }

        public Builder setUnsupportSceneValue(int i, int i2) {
            copyOnWrite();
            ((ArcConf) this.instance).setUnsupportSceneValue(i, i2);
            return this;
        }

        private Builder() {
            super(ArcConf.DEFAULT_INSTANCE);
        }

        public Builder setExtraContent(ExtraContent.Builder builder) {
            copyOnWrite();
            ((ArcConf) this.instance).setExtraContent(builder.build());
            return this;
        }
    }

    static {
        ArcConf arcConf = new ArcConf();
        DEFAULT_INSTANCE = arcConf;
        GeneratedMessageLite.registerDefaultInstance(ArcConf.class, arcConf);
    }

    public ArcConf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnsupportScene(Iterable<? extends UnsupportScene> iterable) {
        ensureUnsupportSceneIsMutable();
        for (UnsupportScene unsupportScene : iterable) {
            this.unsupportScene_.addInt(unsupportScene.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnsupportSceneValue(Iterable<Integer> iterable) {
        ensureUnsupportSceneIsMutable();
        for (Integer num : iterable) {
            this.unsupportScene_.addInt(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnsupportScene(UnsupportScene unsupportScene) {
        unsupportScene.getClass();
        ensureUnsupportSceneIsMutable();
        this.unsupportScene_.addInt(unsupportScene.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnsupportSceneValue(int i) {
        ensureUnsupportSceneIsMutable();
        this.unsupportScene_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabled() {
        this.disabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraContent() {
        this.extraContent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupport() {
        this.isSupport_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnsupportScene() {
        this.unsupportScene_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureUnsupportSceneIsMutable() {
        Internal.IntList intList = this.unsupportScene_;
        if (intList.isModifiable()) {
            return;
        }
        this.unsupportScene_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static ArcConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtraContent(ExtraContent extraContent) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArcConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArcConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArcConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabled(boolean z) {
        this.disabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraContent(ExtraContent extraContent) {
        extraContent.getClass();
        this.extraContent_ = extraContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupport(boolean z) {
        this.isSupport_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnsupportScene(int i, UnsupportScene unsupportScene) {
        unsupportScene.getClass();
        ensureUnsupportSceneIsMutable();
        this.unsupportScene_.setInt(i, unsupportScene.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnsupportSceneValue(int i, int i2) {
        ensureUnsupportSceneIsMutable();
        this.unsupportScene_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78972.f17609xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArcConf();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\t\u0004,", new Object[]{"isSupport_", "disabled_", "extraContent_", "unsupportScene_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArcConf> parser = PARSER;
                if (parser == null) {
                    synchronized (ArcConf.class) {
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

    public boolean getDisabled() {
        return this.disabled_;
    }

    public ExtraContent getExtraContent() {
        ExtraContent extraContent = this.extraContent_;
        return extraContent == null ? ExtraContent.getDefaultInstance() : extraContent;
    }

    public boolean getIsSupport() {
        return this.isSupport_;
    }

    public UnsupportScene getUnsupportScene(int i) {
        UnsupportScene forNumber = UnsupportScene.forNumber(this.unsupportScene_.getInt(i));
        return forNumber == null ? UnsupportScene.UNRECOGNIZED : forNumber;
    }

    public int getUnsupportSceneCount() {
        return this.unsupportScene_.size();
    }

    public List<UnsupportScene> getUnsupportSceneList() {
        return new Internal.ListAdapter(this.unsupportScene_, unsupportScene_converter_);
    }

    public int getUnsupportSceneValue(int i) {
        return this.unsupportScene_.getInt(i);
    }

    public List<Integer> getUnsupportSceneValueList() {
        return this.unsupportScene_;
    }

    public boolean hasExtraContent() {
        return this.extraContent_ != null;
    }

    public static Builder newBuilder(ArcConf arcConf) {
        return DEFAULT_INSTANCE.createBuilder(arcConf);
    }

    public static ArcConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArcConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArcConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArcConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArcConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArcConf parseFrom(InputStream inputStream) throws IOException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArcConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setIsSupport
     */
    static void access$100(ArcConf conf, boolean isSupport) {
    }

    /**
     * setDisabled
     */
    static void access$300(ArcConf conf, boolean disabled) {
    }
}
