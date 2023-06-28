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
public final class ViewMaterialReply extends GeneratedMessageLite<ViewMaterialReply, ViewMaterialReply.Builder> implements MessageLiteOrBuilder {
    private static final ViewMaterialReply DEFAULT_INSTANCE;
    public static final int MATERIAL_LEFT_FIELD_NUMBER = 2;
    public static final int MATERIAL_RES_FIELD_NUMBER = 1;
    private static volatile Parser<ViewMaterialReply> PARSER;
    private MaterialLeft materialLeft_;
    private Internal.ProtobufList<MaterialRes> materialRes_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewMaterialReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16852xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16852xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16852xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16852xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16852xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16852xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16852xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16852xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewMaterialReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68981 c68981) {
            this();
        }

        public Builder addAllMaterialRes(Iterable<? extends MaterialRes> iterable) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).addAllMaterialRes(iterable);
            return this;
        }

        public Builder addMaterialRes(MaterialRes materialRes) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).addMaterialRes(materialRes);
            return this;
        }

        public Builder clearMaterialLeft() {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).clearMaterialLeft();
            return this;
        }

        public Builder clearMaterialRes() {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).clearMaterialRes();
            return this;
        }

        public MaterialLeft getMaterialLeft() {
            return ((ViewMaterialReply) this.instance).getMaterialLeft();
        }

        public MaterialRes getMaterialRes(int i) {
            return ((ViewMaterialReply) this.instance).getMaterialRes(i);
        }

        public int getMaterialResCount() {
            return ((ViewMaterialReply) this.instance).getMaterialResCount();
        }

        public List<MaterialRes> getMaterialResList() {
            return Collections.unmodifiableList(((ViewMaterialReply) this.instance).getMaterialResList());
        }

        public boolean hasMaterialLeft() {
            return ((ViewMaterialReply) this.instance).hasMaterialLeft();
        }

        public Builder mergeMaterialLeft(MaterialLeft materialLeft) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).mergeMaterialLeft(materialLeft);
            return this;
        }

        public Builder removeMaterialRes(int i) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).removeMaterialRes(i);
            return this;
        }

        public Builder setMaterialLeft(MaterialLeft materialLeft) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).setMaterialLeft(materialLeft);
            return this;
        }

        public Builder setMaterialRes(int i, MaterialRes materialRes) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).setMaterialRes(i, materialRes);
            return this;
        }

        private Builder() {
            super(ViewMaterialReply.DEFAULT_INSTANCE);
        }

        public Builder addMaterialRes(int i, MaterialRes materialRes) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).addMaterialRes(i, materialRes);
            return this;
        }

        public Builder setMaterialLeft(MaterialLeft.Builder builder) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).setMaterialLeft(builder.build());
            return this;
        }

        public Builder setMaterialRes(int i, MaterialRes.Builder builder) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).setMaterialRes(i, builder.build());
            return this;
        }

        public Builder addMaterialRes(MaterialRes.Builder builder) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).addMaterialRes(builder.build());
            return this;
        }

        public Builder addMaterialRes(int i, MaterialRes.Builder builder) {
            copyOnWrite();
            ((ViewMaterialReply) this.instance).addMaterialRes(i, builder.build());
            return this;
        }
    }

    static {
        ViewMaterialReply viewMaterialReply = new ViewMaterialReply();
        DEFAULT_INSTANCE = viewMaterialReply;
        GeneratedMessageLite.registerDefaultInstance(ViewMaterialReply.class, viewMaterialReply);
    }

    private ViewMaterialReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaterialRes(Iterable<? extends MaterialRes> iterable) {
        ensureMaterialResIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.materialRes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterialRes(MaterialRes materialRes) {
        materialRes.getClass();
        ensureMaterialResIsMutable();
        this.materialRes_.add(materialRes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialLeft() {
        this.materialLeft_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialRes() {
        this.materialRes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureMaterialResIsMutable() {
        Internal.ProtobufList<MaterialRes> protobufList = this.materialRes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.materialRes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ViewMaterialReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMaterialLeft(MaterialLeft materialLeft) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewMaterialReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewMaterialReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewMaterialReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewMaterialReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMaterialRes(int i) {
        ensureMaterialResIsMutable();
        this.materialRes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialLeft(MaterialLeft materialLeft) {
        materialLeft.getClass();
        this.materialLeft_ = materialLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialRes(int i, MaterialRes materialRes) {
        materialRes.getClass();
        ensureMaterialResIsMutable();
        this.materialRes_.set(i, materialRes);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68981.f16852xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewMaterialReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"materialRes_", MaterialRes.class, "materialLeft_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewMaterialReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewMaterialReply.class) {
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

    public MaterialLeft getMaterialLeft() {
        MaterialLeft materialLeft = this.materialLeft_;
        return materialLeft == null ? MaterialLeft.getDefaultInstance() : materialLeft;
    }

    public MaterialRes getMaterialRes(int i) {
        return this.materialRes_.get(i);
    }

    public int getMaterialResCount() {
        return this.materialRes_.size();
    }

    public List<MaterialRes> getMaterialResList() {
        return this.materialRes_;
    }

    public MaterialResOrBuilder getMaterialResOrBuilder(int i) {
        return this.materialRes_.get(i);
    }

    public List<? extends MaterialResOrBuilder> getMaterialResOrBuilderList() {
        return this.materialRes_;
    }

    public boolean hasMaterialLeft() {
        return this.materialLeft_ != null;
    }

    public static Builder newBuilder(ViewMaterialReply viewMaterialReply) {
        return DEFAULT_INSTANCE.createBuilder(viewMaterialReply);
    }

    public static ViewMaterialReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterialReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewMaterialReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewMaterialReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterialRes(int i, MaterialRes materialRes) {
        materialRes.getClass();
        ensureMaterialResIsMutable();
        this.materialRes_.add(i, materialRes);
    }

    public static ViewMaterialReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewMaterialReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewMaterialReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewMaterialReply parseFrom(InputStream inputStream) throws IOException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewMaterialReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewMaterialReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewMaterialReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterialReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
