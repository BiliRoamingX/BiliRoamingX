package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class GyroscopeContentV2 extends GeneratedMessageLite<GyroscopeContentV2, GyroscopeContentV2.Builder> implements GyroscopeContentV2OrBuilder {
    private static final GyroscopeContentV2 DEFAULT_INSTANCE;
    public static final int FILE_URL_FIELD_NUMBER = 1;
    private static volatile Parser<GyroscopeContentV2> PARSER = null;
    public static final int PHYSICAL_ORIENTATION_FIELD_NUMBER = 3;
    public static final int SCALE_FIELD_NUMBER = 2;
    private String fileUrl_ = "";
    private Internal.ProtobufList<PhysicalOrientationV2> physicalOrientation_ = GeneratedMessageLite.emptyProtobufList();
    private float scale_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75421 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17384xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17384xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17384xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17384xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17384xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17384xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17384xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17384xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GyroscopeContentV2, Builder> implements GyroscopeContentV2OrBuilder {
        /* synthetic */ Builder(C75421 c75421) {
            this();
        }

        public Builder addAllPhysicalOrientation(Iterable<? extends PhysicalOrientationV2> iterable) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).addAllPhysicalOrientation(iterable);
            return this;
        }

        public Builder addPhysicalOrientation(PhysicalOrientationV2 physicalOrientationV2) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).addPhysicalOrientation(physicalOrientationV2);
            return this;
        }

        public Builder clearFileUrl() {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).clearFileUrl();
            return this;
        }

        public Builder clearPhysicalOrientation() {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).clearPhysicalOrientation();
            return this;
        }

        public Builder clearScale() {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).clearScale();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
        public String getFileUrl() {
            return ((GyroscopeContentV2) this.instance).getFileUrl();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
        public ByteString getFileUrlBytes() {
            return ((GyroscopeContentV2) this.instance).getFileUrlBytes();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
        public PhysicalOrientationV2 getPhysicalOrientation(int i) {
            return ((GyroscopeContentV2) this.instance).getPhysicalOrientation(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
        public int getPhysicalOrientationCount() {
            return ((GyroscopeContentV2) this.instance).getPhysicalOrientationCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
        public List<PhysicalOrientationV2> getPhysicalOrientationList() {
            return Collections.unmodifiableList(((GyroscopeContentV2) this.instance).getPhysicalOrientationList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
        public float getScale() {
            return ((GyroscopeContentV2) this.instance).getScale();
        }

        public Builder removePhysicalOrientation(int i) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).removePhysicalOrientation(i);
            return this;
        }

        public Builder setFileUrl(String str) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).setFileUrl(str);
            return this;
        }

        public Builder setFileUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).setFileUrlBytes(byteString);
            return this;
        }

        public Builder setPhysicalOrientation(int i, PhysicalOrientationV2 physicalOrientationV2) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).setPhysicalOrientation(i, physicalOrientationV2);
            return this;
        }

        public Builder setScale(float f) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).setScale(f);
            return this;
        }

        private Builder() {
            super(GyroscopeContentV2.DEFAULT_INSTANCE);
        }

        public Builder addPhysicalOrientation(int i, PhysicalOrientationV2 physicalOrientationV2) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).addPhysicalOrientation(i, physicalOrientationV2);
            return this;
        }

        public Builder setPhysicalOrientation(int i, PhysicalOrientationV2.Builder builder) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).setPhysicalOrientation(i, builder.build());
            return this;
        }

        public Builder addPhysicalOrientation(PhysicalOrientationV2.Builder builder) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).addPhysicalOrientation(builder.build());
            return this;
        }

        public Builder addPhysicalOrientation(int i, PhysicalOrientationV2.Builder builder) {
            copyOnWrite();
            ((GyroscopeContentV2) this.instance).addPhysicalOrientation(i, builder.build());
            return this;
        }
    }

    static {
        GyroscopeContentV2 gyroscopeContentV2 = new GyroscopeContentV2();
        DEFAULT_INSTANCE = gyroscopeContentV2;
        GeneratedMessageLite.registerDefaultInstance(GyroscopeContentV2.class, gyroscopeContentV2);
    }

    private GyroscopeContentV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPhysicalOrientation(Iterable<? extends PhysicalOrientationV2> iterable) {
        ensurePhysicalOrientationIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.physicalOrientation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPhysicalOrientation(PhysicalOrientationV2 physicalOrientationV2) {
        physicalOrientationV2.getClass();
        ensurePhysicalOrientationIsMutable();
        this.physicalOrientation_.add(physicalOrientationV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileUrl() {
        this.fileUrl_ = getDefaultInstance().getFileUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhysicalOrientation() {
        this.physicalOrientation_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.scale_ = 0.0f;
    }

    private void ensurePhysicalOrientationIsMutable() {
        Internal.ProtobufList<PhysicalOrientationV2> protobufList = this.physicalOrientation_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.physicalOrientation_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GyroscopeContentV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GyroscopeContentV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GyroscopeContentV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GyroscopeContentV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePhysicalOrientation(int i) {
        ensurePhysicalOrientationIsMutable();
        this.physicalOrientation_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileUrl(String str) {
        str.getClass();
        this.fileUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhysicalOrientation(int i, PhysicalOrientationV2 physicalOrientationV2) {
        physicalOrientationV2.getClass();
        ensurePhysicalOrientationIsMutable();
        this.physicalOrientation_.set(i, physicalOrientationV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f) {
        this.scale_ = f;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75421.f17384xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GyroscopeContentV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0001\u0003\u001b", new Object[]{"fileUrl_", "scale_", "physicalOrientation_", PhysicalOrientationV2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GyroscopeContentV2> parser = PARSER;
                if (parser == null) {
                    synchronized (GyroscopeContentV2.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
    public String getFileUrl() {
        return this.fileUrl_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
    public ByteString getFileUrlBytes() {
        return ByteString.copyFromUtf8(this.fileUrl_);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
    public PhysicalOrientationV2 getPhysicalOrientation(int i) {
        return this.physicalOrientation_.get(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
    public int getPhysicalOrientationCount() {
        return this.physicalOrientation_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
    public List<PhysicalOrientationV2> getPhysicalOrientationList() {
        return this.physicalOrientation_;
    }

    public PhysicalOrientationV2OrBuilder getPhysicalOrientationOrBuilder(int i) {
        return this.physicalOrientation_.get(i);
    }

    public List<? extends PhysicalOrientationV2OrBuilder> getPhysicalOrientationOrBuilderList() {
        return this.physicalOrientation_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2OrBuilder
    public float getScale() {
        return this.scale_;
    }

    public static Builder newBuilder(GyroscopeContentV2 gyroscopeContentV2) {
        return DEFAULT_INSTANCE.createBuilder(gyroscopeContentV2);
    }

    public static GyroscopeContentV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GyroscopeContentV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GyroscopeContentV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPhysicalOrientation(int i, PhysicalOrientationV2 physicalOrientationV2) {
        physicalOrientationV2.getClass();
        ensurePhysicalOrientationIsMutable();
        this.physicalOrientation_.add(i, physicalOrientationV2);
    }

    public static GyroscopeContentV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GyroscopeContentV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GyroscopeContentV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GyroscopeContentV2 parseFrom(InputStream inputStream) throws IOException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GyroscopeContentV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GyroscopeContentV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GyroscopeContentV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroscopeContentV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
