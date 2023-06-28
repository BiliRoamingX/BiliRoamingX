package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class SpecialDm extends GeneratedMessageLite<SpecialDm, SpecialDm.Builder> implements MessageLiteOrBuilder {
    private static final SpecialDm DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    public static final int IS_DISPLAY_FIELD_NUMBER = 3;
    private static volatile Parser<SpecialDm> PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private long end_;
    private boolean isDisplay_;
    private long start_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SpecialDm$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68641 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16823xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16823xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16823xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16823xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16823xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16823xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16823xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16823xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SpecialDm, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68641 c68641) {
            this();
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((SpecialDm) this.instance).clearEnd();
            return this;
        }

        public Builder clearIsDisplay() {
            copyOnWrite();
            ((SpecialDm) this.instance).clearIsDisplay();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((SpecialDm) this.instance).clearStart();
            return this;
        }

        public long getEnd() {
            return ((SpecialDm) this.instance).getEnd();
        }

        public boolean getIsDisplay() {
            return ((SpecialDm) this.instance).getIsDisplay();
        }

        public long getStart() {
            return ((SpecialDm) this.instance).getStart();
        }

        public Builder setEnd(long j) {
            copyOnWrite();
            ((SpecialDm) this.instance).setEnd(j);
            return this;
        }

        public Builder setIsDisplay(boolean z) {
            copyOnWrite();
            ((SpecialDm) this.instance).setIsDisplay(z);
            return this;
        }

        public Builder setStart(long j) {
            copyOnWrite();
            ((SpecialDm) this.instance).setStart(j);
            return this;
        }

        private Builder() {
            super(SpecialDm.DEFAULT_INSTANCE);
        }
    }

    static {
        SpecialDm specialDm = new SpecialDm();
        DEFAULT_INSTANCE = specialDm;
        GeneratedMessageLite.registerDefaultInstance(SpecialDm.class, specialDm);
    }

    private SpecialDm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDisplay() {
        this.isDisplay_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0L;
    }

    public static SpecialDm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SpecialDm parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpecialDm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpecialDm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SpecialDm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(long j) {
        this.end_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDisplay(boolean z) {
        this.isDisplay_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j) {
        this.start_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68641.f16823xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SpecialDm();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0007", new Object[]{"start_", "end_", "isDisplay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SpecialDm> parser = PARSER;
                if (parser == null) {
                    synchronized (SpecialDm.class) {
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

    public long getEnd() {
        return this.end_;
    }

    public boolean getIsDisplay() {
        return this.isDisplay_;
    }

    public long getStart() {
        return this.start_;
    }

    public static Builder newBuilder(SpecialDm specialDm) {
        return DEFAULT_INSTANCE.createBuilder(specialDm);
    }

    public static SpecialDm parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecialDm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SpecialDm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SpecialDm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SpecialDm parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SpecialDm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SpecialDm parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SpecialDm parseFrom(InputStream inputStream) throws IOException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpecialDm parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SpecialDm parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SpecialDm parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecialDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
