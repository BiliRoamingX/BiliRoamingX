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
public final class ViewTagReply extends GeneratedMessageLite<ViewTagReply, ViewTagReply.Builder> implements MessageLiteOrBuilder {
    private static final ViewTagReply DEFAULT_INSTANCE;
    public static final int MATERIAL_LEFT_FIELD_NUMBER = 2;
    private static volatile Parser<ViewTagReply> PARSER = null;
    public static final int SPECIAL_CELL_NEW_FIELD_NUMBER = 1;
    private MaterialLeft materialLeft_;
    private Internal.ProtobufList<SpecialCell> specialCellNew_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewTagReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16859xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16859xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16859xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16859xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16859xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16859xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16859xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16859xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewTagReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69071 c69071) {
            this();
        }

        public Builder addAllSpecialCellNew(Iterable<? extends SpecialCell> iterable) {
            copyOnWrite();
            ((ViewTagReply) this.instance).addAllSpecialCellNew(iterable);
            return this;
        }

        public Builder addSpecialCellNew(SpecialCell specialCell) {
            copyOnWrite();
            ((ViewTagReply) this.instance).addSpecialCellNew(specialCell);
            return this;
        }

        public Builder clearMaterialLeft() {
            copyOnWrite();
            ((ViewTagReply) this.instance).clearMaterialLeft();
            return this;
        }

        public Builder clearSpecialCellNew() {
            copyOnWrite();
            ((ViewTagReply) this.instance).clearSpecialCellNew();
            return this;
        }

        public MaterialLeft getMaterialLeft() {
            return ((ViewTagReply) this.instance).getMaterialLeft();
        }

        public SpecialCell getSpecialCellNew(int i) {
            return ((ViewTagReply) this.instance).getSpecialCellNew(i);
        }

        public int getSpecialCellNewCount() {
            return ((ViewTagReply) this.instance).getSpecialCellNewCount();
        }

        public List<SpecialCell> getSpecialCellNewList() {
            return Collections.unmodifiableList(((ViewTagReply) this.instance).getSpecialCellNewList());
        }

        public boolean hasMaterialLeft() {
            return ((ViewTagReply) this.instance).hasMaterialLeft();
        }

        public Builder mergeMaterialLeft(MaterialLeft materialLeft) {
            copyOnWrite();
            ((ViewTagReply) this.instance).mergeMaterialLeft(materialLeft);
            return this;
        }

        public Builder removeSpecialCellNew(int i) {
            copyOnWrite();
            ((ViewTagReply) this.instance).removeSpecialCellNew(i);
            return this;
        }

        public Builder setMaterialLeft(MaterialLeft materialLeft) {
            copyOnWrite();
            ((ViewTagReply) this.instance).setMaterialLeft(materialLeft);
            return this;
        }

        public Builder setSpecialCellNew(int i, SpecialCell specialCell) {
            copyOnWrite();
            ((ViewTagReply) this.instance).setSpecialCellNew(i, specialCell);
            return this;
        }

        private Builder() {
            super(ViewTagReply.DEFAULT_INSTANCE);
        }

        public Builder addSpecialCellNew(int i, SpecialCell specialCell) {
            copyOnWrite();
            ((ViewTagReply) this.instance).addSpecialCellNew(i, specialCell);
            return this;
        }

        public Builder setMaterialLeft(MaterialLeft.Builder builder) {
            copyOnWrite();
            ((ViewTagReply) this.instance).setMaterialLeft(builder.build());
            return this;
        }

        public Builder setSpecialCellNew(int i, SpecialCell.Builder builder) {
            copyOnWrite();
            ((ViewTagReply) this.instance).setSpecialCellNew(i, builder.build());
            return this;
        }

        public Builder addSpecialCellNew(SpecialCell.Builder builder) {
            copyOnWrite();
            ((ViewTagReply) this.instance).addSpecialCellNew(builder.build());
            return this;
        }

        public Builder addSpecialCellNew(int i, SpecialCell.Builder builder) {
            copyOnWrite();
            ((ViewTagReply) this.instance).addSpecialCellNew(i, builder.build());
            return this;
        }
    }

    static {
        ViewTagReply viewTagReply = new ViewTagReply();
        DEFAULT_INSTANCE = viewTagReply;
        GeneratedMessageLite.registerDefaultInstance(ViewTagReply.class, viewTagReply);
    }

    private ViewTagReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpecialCellNew(Iterable<? extends SpecialCell> iterable) {
        ensureSpecialCellNewIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.specialCellNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpecialCellNew(SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.add(specialCell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialLeft() {
        this.materialLeft_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpecialCellNew() {
        this.specialCellNew_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSpecialCellNewIsMutable() {
        Internal.ProtobufList<SpecialCell> protobufList = this.specialCellNew_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.specialCellNew_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ViewTagReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMaterialLeft(MaterialLeft materialLeft) {
        materialLeft.getClass();
        MaterialLeft materialLeft2 = this.materialLeft_;
        if (materialLeft2 != null && materialLeft2 != MaterialLeft.getDefaultInstance()) {
            this.materialLeft_ = MaterialLeft.newBuilder(this.materialLeft_).mergeFrom(materialLeft).buildPartial();
        } else {
            this.materialLeft_ = materialLeft;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewTagReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewTagReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewTagReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewTagReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpecialCellNew(int i) {
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialLeft(MaterialLeft materialLeft) {
        materialLeft.getClass();
        this.materialLeft_ = materialLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecialCellNew(int i, SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.set(i, specialCell);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69071.f16859xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewTagReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"specialCellNew_", SpecialCell.class, "materialLeft_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewTagReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewTagReply.class) {
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

    public SpecialCell getSpecialCellNew(int i) {
        return this.specialCellNew_.get(i);
    }

    public int getSpecialCellNewCount() {
        return this.specialCellNew_.size();
    }

    public List<SpecialCell> getSpecialCellNewList() {
        return this.specialCellNew_;
    }

    public SpecialCellOrBuilder getSpecialCellNewOrBuilder(int i) {
        return this.specialCellNew_.get(i);
    }

    public List<? extends SpecialCellOrBuilder> getSpecialCellNewOrBuilderList() {
        return this.specialCellNew_;
    }

    public boolean hasMaterialLeft() {
        return this.materialLeft_ != null;
    }

    public static Builder newBuilder(ViewTagReply viewTagReply) {
        return DEFAULT_INSTANCE.createBuilder(viewTagReply);
    }

    public static ViewTagReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewTagReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewTagReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewTagReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpecialCellNew(int i, SpecialCell specialCell) {
        specialCell.getClass();
        ensureSpecialCellNewIsMutable();
        this.specialCellNew_.add(i, specialCell);
    }

    public static ViewTagReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewTagReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewTagReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewTagReply parseFrom(InputStream inputStream) throws IOException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewTagReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewTagReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewTagReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewTagReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
