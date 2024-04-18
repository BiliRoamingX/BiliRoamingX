package com.bapis.bilibili.dagw.component.avatar.common;

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

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class PositionSpec extends GeneratedMessageLite<PositionSpec, PositionSpec.Builder> implements PositionSpecOrBuilder {
    public static final int AXIS_X_FIELD_NUMBER = 2;
    public static final int AXIS_Y_FIELD_NUMBER = 3;
    public static final int COORDINATE_POS_FIELD_NUMBER = 1;
    private static final PositionSpec DEFAULT_INSTANCE;
    private static volatile Parser<PositionSpec> PARSER;
    private double axisX_;
    private double axisY_;
    private int coordinatePos_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.PositionSpec$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75201 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17367xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17367xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17367xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17367xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17367xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17367xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17367xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17367xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PositionSpec, Builder> implements PositionSpecOrBuilder {
        /* synthetic */ Builder(C75201 c75201) {
            this();
        }

        public Builder clearAxisX() {
            copyOnWrite();
            ((PositionSpec) this.instance).clearAxisX();
            return this;
        }

        public Builder clearAxisY() {
            copyOnWrite();
            ((PositionSpec) this.instance).clearAxisY();
            return this;
        }

        public Builder clearCoordinatePos() {
            copyOnWrite();
            ((PositionSpec) this.instance).clearCoordinatePos();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
        public double getAxisX() {
            return ((PositionSpec) this.instance).getAxisX();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
        public double getAxisY() {
            return ((PositionSpec) this.instance).getAxisY();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
        public CoordinatePos getCoordinatePos() {
            return ((PositionSpec) this.instance).getCoordinatePos();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
        public int getCoordinatePosValue() {
            return ((PositionSpec) this.instance).getCoordinatePosValue();
        }

        public Builder setAxisX(double d) {
            copyOnWrite();
            ((PositionSpec) this.instance).setAxisX(d);
            return this;
        }

        public Builder setAxisY(double d) {
            copyOnWrite();
            ((PositionSpec) this.instance).setAxisY(d);
            return this;
        }

        public Builder setCoordinatePos(CoordinatePos coordinatePos) {
            copyOnWrite();
            ((PositionSpec) this.instance).setCoordinatePos(coordinatePos);
            return this;
        }

        public Builder setCoordinatePosValue(int i) {
            copyOnWrite();
            ((PositionSpec) this.instance).setCoordinatePosValue(i);
            return this;
        }

        private Builder() {
            super(PositionSpec.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum CoordinatePos implements Internal.EnumLite {
        INVALID_COORDINATE(0),
        DEFAULT_COORDINATE(1),
        CENTRAL_COORDINATE(2),
        UNRECOGNIZED(-1);
        
        public static final int CENTRAL_COORDINATE_VALUE = 2;
        public static final int DEFAULT_COORDINATE_VALUE = 1;
        public static final int INVALID_COORDINATE_VALUE = 0;
        private static final Internal.EnumLiteMap<CoordinatePos> internalValueMap = new Internal.EnumLiteMap<CoordinatePos>() { // from class: com.bapis.bilibili.dagw.component.avatar.common.PositionSpec.CoordinatePos.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CoordinatePos findValueByNumber(int i) {
                return CoordinatePos.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes17.dex */
        private static final class CoordinatePosVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new CoordinatePosVerifier();

            private CoordinatePosVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return CoordinatePos.forNumber(i) != null;
            }
        }

        CoordinatePos(int i) {
            this.value = i;
        }

        public static CoordinatePos forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return CENTRAL_COORDINATE;
                }
                return DEFAULT_COORDINATE;
            }
            return INVALID_COORDINATE;
        }

        public static Internal.EnumLiteMap<CoordinatePos> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return CoordinatePosVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static CoordinatePos valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        PositionSpec positionSpec = new PositionSpec();
        DEFAULT_INSTANCE = positionSpec;
        GeneratedMessageLite.registerDefaultInstance(PositionSpec.class, positionSpec);
    }

    private PositionSpec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAxisX() {
        this.axisX_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAxisY() {
        this.axisY_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinatePos() {
        this.coordinatePos_ = 0;
    }

    public static PositionSpec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PositionSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PositionSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PositionSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PositionSpec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAxisX(double d) {
        this.axisX_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAxisY(double d) {
        this.axisY_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinatePos(CoordinatePos coordinatePos) {
        this.coordinatePos_ = coordinatePos.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinatePosValue(int i) {
        this.coordinatePos_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75201.f17367xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PositionSpec();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0000", new Object[]{"coordinatePos_", "axisX_", "axisY_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PositionSpec> parser = PARSER;
                if (parser == null) {
                    synchronized (PositionSpec.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
    public double getAxisX() {
        return this.axisX_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
    public double getAxisY() {
        return this.axisY_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
    public CoordinatePos getCoordinatePos() {
        CoordinatePos forNumber = CoordinatePos.forNumber(this.coordinatePos_);
        return forNumber == null ? CoordinatePos.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.PositionSpecOrBuilder
    public int getCoordinatePosValue() {
        return this.coordinatePos_;
    }

    public static Builder newBuilder(PositionSpec positionSpec) {
        return DEFAULT_INSTANCE.createBuilder(positionSpec);
    }

    public static PositionSpec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PositionSpec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PositionSpec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PositionSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PositionSpec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PositionSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PositionSpec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PositionSpec parseFrom(InputStream inputStream) throws IOException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PositionSpec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PositionSpec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PositionSpec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PositionSpec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
