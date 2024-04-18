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
public final class AB extends GeneratedMessageLite<AB, AB.Builder> implements MessageLiteOrBuilder {
    private static final AB DEFAULT_INSTANCE;
    public static final int GLANCE_FIELD_NUMBER = 1;
    public static final int GROUP_FIELD_NUMBER = 2;
    private static volatile Parser<AB> PARSER;
    private Glance glance_;
    private int group_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.AB$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16511xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16511xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16511xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16511xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16511xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16511xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16511xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16511xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AB, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64731 c64731) {
            this();
        }

        public Builder clearGlance() {
            copyOnWrite();
            ((AB) this.instance).clearGlance();
            return this;
        }

        public Builder clearGroup() {
            copyOnWrite();
            ((AB) this.instance).clearGroup();
            return this;
        }

        public Glance getGlance() {
            return ((AB) this.instance).getGlance();
        }

        public Group getGroup() {
            return ((AB) this.instance).getGroup();
        }

        public int getGroupValue() {
            return ((AB) this.instance).getGroupValue();
        }

        public boolean hasGlance() {
            return ((AB) this.instance).hasGlance();
        }

        public Builder mergeGlance(Glance glance) {
            copyOnWrite();
            ((AB) this.instance).mergeGlance(glance);
            return this;
        }

        public Builder setGlance(Glance glance) {
            copyOnWrite();
            ((AB) this.instance).setGlance(glance);
            return this;
        }

        public Builder setGroup(Group group) {
            copyOnWrite();
            ((AB) this.instance).setGroup(group);
            return this;
        }

        public Builder setGroupValue(int i) {
            copyOnWrite();
            ((AB) this.instance).setGroupValue(i);
            return this;
        }

        private Builder() {
            super(AB.DEFAULT_INSTANCE);
        }

        public Builder setGlance(Glance.Builder builder) {
            copyOnWrite();
            ((AB) this.instance).setGlance(builder.build());
            return this;
        }
    }

    static {
        AB ab = new AB();
        DEFAULT_INSTANCE = ab;
        GeneratedMessageLite.registerDefaultInstance(AB.class, ab);
    }

    private AB() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGlance() {
        this.glance_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroup() {
        this.group_ = 0;
    }

    public static AB getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGlance(Glance glance) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AB parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AB) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AB parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AB> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlance(Glance glance) {
        glance.getClass();
        this.glance_ = glance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroup(Group group) {
        this.group_ = group.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupValue(int i) {
        this.group_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64731.f16511xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AB();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"glance_", "group_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AB> parser = PARSER;
                if (parser == null) {
                    synchronized (AB.class) {
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

    public Glance getGlance() {
        Glance glance = this.glance_;
        return glance == null ? Glance.getDefaultInstance() : glance;
    }

    public Group getGroup() {
        Group forNumber = Group.forNumber(this.group_);
        return forNumber == null ? Group.UNRECOGNIZED : forNumber;
    }

    public int getGroupValue() {
        return this.group_;
    }

    public boolean hasGlance() {
        return this.glance_ != null;
    }

    public static Builder newBuilder(AB ab) {
        return DEFAULT_INSTANCE.createBuilder(ab);
    }

    public static AB parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AB) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AB parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AB parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AB parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AB parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AB parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AB parseFrom(InputStream inputStream) throws IOException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AB parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AB parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AB parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AB) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
