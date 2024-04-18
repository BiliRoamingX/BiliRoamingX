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
public final class PhysicalOrientationAnimation extends GeneratedMessageLite<PhysicalOrientationAnimation, PhysicalOrientationAnimation.Builder> implements PhysicalOrientationAnimationOrBuilder {
    public static final int BEZIER_FIELD_NUMBER = 3;
    private static final PhysicalOrientationAnimation DEFAULT_INSTANCE;
    private static volatile Parser<PhysicalOrientationAnimation> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int valueMemoizedSerializedSize = -1;
    private String type_ = "";
    private Internal.FloatList value_ = GeneratedMessageLite.emptyFloatList();
    private String bezier_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimation$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75491 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17391xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17391xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17391xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17391xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17391xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17391xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17391xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17391xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PhysicalOrientationAnimation, Builder> implements PhysicalOrientationAnimationOrBuilder {
        /* synthetic */ Builder(C75491 c75491) {
            this();
        }

        public Builder addAllValue(Iterable<? extends Float> iterable) {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).addAllValue(iterable);
            return this;
        }

        public Builder addValue(float f) {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).addValue(f);
            return this;
        }

        public Builder clearBezier() {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).clearBezier();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).clearValue();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
        public String getBezier() {
            return ((PhysicalOrientationAnimation) this.instance).getBezier();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
        public ByteString getBezierBytes() {
            return ((PhysicalOrientationAnimation) this.instance).getBezierBytes();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
        public String getType() {
            return ((PhysicalOrientationAnimation) this.instance).getType();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
        public ByteString getTypeBytes() {
            return ((PhysicalOrientationAnimation) this.instance).getTypeBytes();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
        public float getValue(int i) {
            return ((PhysicalOrientationAnimation) this.instance).getValue(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
        public int getValueCount() {
            return ((PhysicalOrientationAnimation) this.instance).getValueCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
        public List<Float> getValueList() {
            return Collections.unmodifiableList(((PhysicalOrientationAnimation) this.instance).getValueList());
        }

        public Builder setBezier(String str) {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).setBezier(str);
            return this;
        }

        public Builder setBezierBytes(ByteString byteString) {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).setBezierBytes(byteString);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).setTypeBytes(byteString);
            return this;
        }

        public Builder setValue(int i, float f) {
            copyOnWrite();
            ((PhysicalOrientationAnimation) this.instance).setValue(i, f);
            return this;
        }

        private Builder() {
            super(PhysicalOrientationAnimation.DEFAULT_INSTANCE);
        }
    }

    static {
        PhysicalOrientationAnimation physicalOrientationAnimation = new PhysicalOrientationAnimation();
        DEFAULT_INSTANCE = physicalOrientationAnimation;
        GeneratedMessageLite.registerDefaultInstance(PhysicalOrientationAnimation.class, physicalOrientationAnimation);
    }

    private PhysicalOrientationAnimation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends Float> iterable) {
        ensureValueIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(float f) {
        ensureValueIsMutable();
        this.value_.addFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBezier() {
        this.bezier_ = getDefaultInstance().getBezier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = GeneratedMessageLite.emptyFloatList();
    }

    private void ensureValueIsMutable() {
        Internal.FloatList floatList = this.value_;
        if (floatList.isModifiable()) {
            return;
        }
        this.value_ = GeneratedMessageLite.mutableCopy(floatList);
    }

    public static PhysicalOrientationAnimation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PhysicalOrientationAnimation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PhysicalOrientationAnimation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PhysicalOrientationAnimation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBezier(String str) {
        str.getClass();
        this.bezier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBezierBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bezier_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, float f) {
        ensureValueIsMutable();
        this.value_.setFloat(i, f);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75491.f17391xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PhysicalOrientationAnimation();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002$\u0003\u0208", new Object[]{"type_", "value_", "bezier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PhysicalOrientationAnimation> parser = PARSER;
                if (parser == null) {
                    synchronized (PhysicalOrientationAnimation.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
    public String getBezier() {
        return this.bezier_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
    public ByteString getBezierBytes() {
        return ByteString.copyFromUtf8(this.bezier_);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
    public float getValue(int i) {
        return this.value_.getFloat(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.PhysicalOrientationAnimationOrBuilder
    public List<Float> getValueList() {
        return this.value_;
    }

    public static Builder newBuilder(PhysicalOrientationAnimation physicalOrientationAnimation) {
        return DEFAULT_INSTANCE.createBuilder(physicalOrientationAnimation);
    }

    public static PhysicalOrientationAnimation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PhysicalOrientationAnimation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PhysicalOrientationAnimation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PhysicalOrientationAnimation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PhysicalOrientationAnimation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PhysicalOrientationAnimation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PhysicalOrientationAnimation parseFrom(InputStream inputStream) throws IOException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PhysicalOrientationAnimation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PhysicalOrientationAnimation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PhysicalOrientationAnimation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhysicalOrientationAnimation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
