package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class Event extends GeneratedMessageLite<Event, Event.Builder> implements MessageLiteOrBuilder {
    private static final Event DEFAULT_INSTANCE;
    private static volatile Parser<Event> PARSER = null;
    public static final int SHAKE_FIELD_NUMBER = 1;
    private Shake shake_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.Event$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81761 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17899xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17899xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17899xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17899xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17899xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17899xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17899xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17899xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Event, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81761 c81761) {
            this();
        }

        public Builder clearShake() {
            copyOnWrite();
            ((Event) this.instance).clearShake();
            return this;
        }

        public Shake getShake() {
            return ((Event) this.instance).getShake();
        }

        public boolean hasShake() {
            return ((Event) this.instance).hasShake();
        }

        public Builder mergeShake(Shake shake) {
            copyOnWrite();
            ((Event) this.instance).mergeShake(shake);
            return this;
        }

        public Builder setShake(Shake shake) {
            copyOnWrite();
            ((Event) this.instance).setShake(shake);
            return this;
        }

        private Builder() {
            super(Event.DEFAULT_INSTANCE);
        }

        public Builder setShake(Shake.Builder builder) {
            copyOnWrite();
            ((Event) this.instance).setShake(builder.build());
            return this;
        }
    }

    static {
        Event event = new Event();
        DEFAULT_INSTANCE = event;
        GeneratedMessageLite.registerDefaultInstance(Event.class, event);
    }

    private Event() {
    }

    public void clearShake() {
        this.shake_ = null;
    }

    public static Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeShake(Shake shake) {
        shake.getClass();
        Shake shake2 = this.shake_;
        if (shake2 != null && shake2 != Shake.getDefaultInstance()) {
            this.shake_ = Shake.newBuilder(this.shake_).mergeFrom((Shake) shake).buildPartial();
        } else {
            this.shake_ = shake;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Event> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setShake(Shake shake) {
        shake.getClass();
        this.shake_ = shake;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81761.f17899xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Event();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"shake_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Event> parser = PARSER;
                if (parser == null) {
                    synchronized (Event.class) {
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

    public Shake getShake() {
        Shake shake = this.shake_;
        return shake == null ? Shake.getDefaultInstance() : shake;
    }

    public boolean hasShake() {
        return this.shake_ != null;
    }

    public static Builder newBuilder(Event event) {
        return DEFAULT_INSTANCE.createBuilder(event);
    }

    public static Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Event parseFrom(InputStream inputStream) throws IOException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Event parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
