package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimation;
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
public final class PhysicalOrientationV2 extends GeneratedMessageLite<PhysicalOrientationV2, PhysicalOrientationV2.Builder> implements PhysicalOrientationV2OrBuilder {
    public static final int ANGLE_FIELD_NUMBER = 2;
    public static final int ANIMATIONS_FIELD_NUMBER = 3;
    private static final PhysicalOrientationV2 DEFAULT_INSTANCE;
    private static volatile Parser<PhysicalOrientationV2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int angleMemoizedSerializedSize = -1;
    private String type_ = "";
    private Internal.FloatList angle_ = GeneratedMessageLite.emptyFloatList();
    private Internal.ProtobufList<PhysicalOrientationAnimation> animations_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17392xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17392xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17392xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17392xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17392xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17392xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17392xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17392xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PhysicalOrientationV2, Builder> implements PhysicalOrientationV2OrBuilder {
        /* synthetic */ Builder(C75501 c75501) {
            this();
        }

        public Builder addAllAngle(Iterable<? extends Float> iterable) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).addAllAngle(iterable);
            return this;
        }

        public Builder addAllAnimations(Iterable<? extends PhysicalOrientationAnimation> iterable) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).addAllAnimations(iterable);
            return this;
        }

        public Builder addAngle(float f) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).addAngle(f);
            return this;
        }

        public Builder addAnimations(PhysicalOrientationAnimation physicalOrientationAnimation) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).addAnimations(physicalOrientationAnimation);
            return this;
        }

        public Builder clearAngle() {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).clearAngle();
            return this;
        }

        public Builder clearAnimations() {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).clearAnimations();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public float getAngle(int i) {
            return ((PhysicalOrientationV2) this.instance).getAngle(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public int getAngleCount() {
            return ((PhysicalOrientationV2) this.instance).getAngleCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public List<Float> getAngleList() {
            return Collections.unmodifiableList(((PhysicalOrientationV2) this.instance).getAngleList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public PhysicalOrientationAnimation getAnimations(int i) {
            return ((PhysicalOrientationV2) this.instance).getAnimations(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public int getAnimationsCount() {
            return ((PhysicalOrientationV2) this.instance).getAnimationsCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public List<PhysicalOrientationAnimation> getAnimationsList() {
            return Collections.unmodifiableList(((PhysicalOrientationV2) this.instance).getAnimationsList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public String getType() {
            return ((PhysicalOrientationV2) this.instance).getType();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
        public ByteString getTypeBytes() {
            return ((PhysicalOrientationV2) this.instance).getTypeBytes();
        }

        public Builder removeAnimations(int i) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).removeAnimations(i);
            return this;
        }

        public Builder setAngle(int i, float f) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).setAngle(i, f);
            return this;
        }

        public Builder setAnimations(int i, PhysicalOrientationAnimation physicalOrientationAnimation) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).setAnimations(i, physicalOrientationAnimation);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).setTypeBytes(byteString);
            return this;
        }

        private Builder() {
            super(PhysicalOrientationV2.DEFAULT_INSTANCE);
        }

        public Builder addAnimations(int i, PhysicalOrientationAnimation physicalOrientationAnimation) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).addAnimations(i, physicalOrientationAnimation);
            return this;
        }

        public Builder setAnimations(int i, PhysicalOrientationAnimation.Builder builder) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).setAnimations(i, builder.build());
            return this;
        }

        public Builder addAnimations(PhysicalOrientationAnimation.Builder builder) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).addAnimations(builder.build());
            return this;
        }

        public Builder addAnimations(int i, PhysicalOrientationAnimation.Builder builder) {
            copyOnWrite();
            ((PhysicalOrientationV2) this.instance).addAnimations(i, builder.build());
            return this;
        }
    }

    static {
        PhysicalOrientationV2 physicalOrientationV2 = new PhysicalOrientationV2();
        DEFAULT_INSTANCE = physicalOrientationV2;
        GeneratedMessageLite.registerDefaultInstance(PhysicalOrientationV2.class, physicalOrientationV2);
    }

    private PhysicalOrientationV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAngle(Iterable<? extends Float> iterable) {
        ensureAngleIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.angle_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnimations(Iterable<? extends PhysicalOrientationAnimation> iterable) {
        ensureAnimationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.animations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAngle(float f) {
        ensureAngleIsMutable();
        this.angle_.addFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnimations(PhysicalOrientationAnimation physicalOrientationAnimation) {
        physicalOrientationAnimation.getClass();
        ensureAnimationsIsMutable();
        this.animations_.add(physicalOrientationAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAngle() {
        this.angle_ = GeneratedMessageLite.emptyFloatList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimations() {
        this.animations_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureAngleIsMutable() {
        Internal.FloatList floatList = this.angle_;
        if (floatList.isModifiable()) {
            return;
        }
        this.angle_ = GeneratedMessageLite.mutableCopy(floatList);
    }

    private void ensureAnimationsIsMutable() {
        Internal.ProtobufList<PhysicalOrientationAnimation> protobufList = this.animations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.animations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PhysicalOrientationV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PhysicalOrientationV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PhysicalOrientationV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PhysicalOrientationV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnimations(int i) {
        ensureAnimationsIsMutable();
        this.animations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngle(int i, float f) {
        ensureAngleIsMutable();
        this.angle_.setFloat(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimations(int i, PhysicalOrientationAnimation physicalOrientationAnimation) {
        physicalOrientationAnimation.getClass();
        ensureAnimationsIsMutable();
        this.animations_.set(i, physicalOrientationAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75501.f17392xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PhysicalOrientationV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0208\u0002$\u0003\u001b", new Object[]{"type_", "angle_", "animations_", PhysicalOrientationAnimation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PhysicalOrientationV2> parser = PARSER;
                if (parser == null) {
                    synchronized (PhysicalOrientationV2.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public float getAngle(int i) {
        return this.angle_.getFloat(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public int getAngleCount() {
        return this.angle_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public List<Float> getAngleList() {
        return this.angle_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public PhysicalOrientationAnimation getAnimations(int i) {
        return this.animations_.get(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public int getAnimationsCount() {
        return this.animations_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public List<PhysicalOrientationAnimation> getAnimationsList() {
        return this.animations_;
    }

    public PhysicalOrientationAnimationOrBuilder getAnimationsOrBuilder(int i) {
        return this.animations_.get(i);
    }

    public List<? extends PhysicalOrientationAnimationOrBuilder> getAnimationsOrBuilderList() {
        return this.animations_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationV2OrBuilder
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public static Builder newBuilder(PhysicalOrientationV2 physicalOrientationV2) {
        return DEFAULT_INSTANCE.createBuilder(physicalOrientationV2);
    }

    public static PhysicalOrientationV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PhysicalOrientationV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PhysicalOrientationV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnimations(int i, PhysicalOrientationAnimation physicalOrientationAnimation) {
        physicalOrientationAnimation.getClass();
        ensureAnimationsIsMutable();
        this.animations_.add(i, physicalOrientationAnimation);
    }

    public static PhysicalOrientationV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PhysicalOrientationV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PhysicalOrientationV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PhysicalOrientationV2 parseFrom(InputStream inputStream) throws IOException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PhysicalOrientationV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PhysicalOrientationV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PhysicalOrientationV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhysicalOrientationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
