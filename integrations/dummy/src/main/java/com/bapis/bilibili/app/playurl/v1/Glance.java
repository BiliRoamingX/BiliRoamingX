package com.bapis.bilibili.app.playurl.v1;

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
public final class Glance extends GeneratedMessageLite<Glance, Glance.Builder> implements MessageLiteOrBuilder {
    public static final int CAN_WATCH_FIELD_NUMBER = 1;
    private static final Glance DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile Parser<Glance> PARSER = null;
    public static final int TIMES_FIELD_NUMBER = 2;
    private boolean canWatch_;
    private long duration_;
    private long times_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.Glance$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16524xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16524xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16524xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16524xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16524xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16524xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16524xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16524xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Glance, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64901 c64901) {
            this();
        }

        public Builder clearCanWatch() {
            copyOnWrite();
            ((Glance) this.instance).clearCanWatch();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((Glance) this.instance).clearDuration();
            return this;
        }

        public Builder clearTimes() {
            copyOnWrite();
            ((Glance) this.instance).clearTimes();
            return this;
        }

        public boolean getCanWatch() {
            return ((Glance) this.instance).getCanWatch();
        }

        public long getDuration() {
            return ((Glance) this.instance).getDuration();
        }

        public long getTimes() {
            return ((Glance) this.instance).getTimes();
        }

        public Builder setCanWatch(boolean z) {
            copyOnWrite();
            ((Glance) this.instance).setCanWatch(z);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((Glance) this.instance).setDuration(j);
            return this;
        }

        public Builder setTimes(long j) {
            copyOnWrite();
            ((Glance) this.instance).setTimes(j);
            return this;
        }

        private Builder() {
            super(Glance.DEFAULT_INSTANCE);
        }
    }

    static {
        Glance glance = new Glance();
        DEFAULT_INSTANCE = glance;
        GeneratedMessageLite.registerDefaultInstance(Glance.class, glance);
    }

    private Glance() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanWatch() {
        this.canWatch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimes() {
        this.times_ = 0L;
    }

    public static Glance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Glance parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Glance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Glance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Glance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanWatch(boolean z) {
        this.canWatch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimes(long j) {
        this.times_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64901.f16524xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Glance();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0002", new Object[]{"canWatch_", "times_", "duration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Glance> parser = PARSER;
                if (parser == null) {
                    synchronized (Glance.class) {
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

    public boolean getCanWatch() {
        return this.canWatch_;
    }

    public long getDuration() {
        return this.duration_;
    }

    public long getTimes() {
        return this.times_;
    }

    public static Builder newBuilder(Glance glance) {
        return DEFAULT_INSTANCE.createBuilder(glance);
    }

    public static Glance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Glance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Glance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Glance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Glance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Glance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Glance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Glance parseFrom(InputStream inputStream) throws IOException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Glance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Glance parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Glance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Glance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
