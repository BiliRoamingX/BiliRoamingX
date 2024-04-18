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
public final class Restriction extends GeneratedMessageLite<Restriction, Restriction.Builder> implements MessageLiteOrBuilder {
    private static final Restriction DEFAULT_INSTANCE;
    public static final int DISABLERCMD_FIELD_NUMBER = 4;
    public static final int ISLESSONS_FIELD_NUMBER = 2;
    public static final int ISREVIEW_FIELD_NUMBER = 3;
    public static final int ISTEENAGERS_FIELD_NUMBER = 1;
    private static volatile Parser<Restriction> PARSER;
    private boolean disableRcmd_;
    private boolean isLessons_;
    private boolean isReview_;
    private boolean isTeenagers_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Restriction$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68491 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16809xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16809xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16809xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16809xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16809xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16809xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16809xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16809xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Restriction, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68491 c68491) {
            this();
        }

        public Builder clearDisableRcmd() {
            copyOnWrite();
            ((Restriction) this.instance).clearDisableRcmd();
            return this;
        }

        public Builder clearIsLessons() {
            copyOnWrite();
            ((Restriction) this.instance).clearIsLessons();
            return this;
        }

        public Builder clearIsReview() {
            copyOnWrite();
            ((Restriction) this.instance).clearIsReview();
            return this;
        }

        public Builder clearIsTeenagers() {
            copyOnWrite();
            ((Restriction) this.instance).clearIsTeenagers();
            return this;
        }

        public boolean getDisableRcmd() {
            return ((Restriction) this.instance).getDisableRcmd();
        }

        public boolean getIsLessons() {
            return ((Restriction) this.instance).getIsLessons();
        }

        public boolean getIsReview() {
            return ((Restriction) this.instance).getIsReview();
        }

        public boolean getIsTeenagers() {
            return ((Restriction) this.instance).getIsTeenagers();
        }

        public Builder setDisableRcmd(boolean z) {
            copyOnWrite();
            ((Restriction) this.instance).setDisableRcmd(z);
            return this;
        }

        public Builder setIsLessons(boolean z) {
            copyOnWrite();
            ((Restriction) this.instance).setIsLessons(z);
            return this;
        }

        public Builder setIsReview(boolean z) {
            copyOnWrite();
            ((Restriction) this.instance).setIsReview(z);
            return this;
        }

        public Builder setIsTeenagers(boolean z) {
            copyOnWrite();
            ((Restriction) this.instance).setIsTeenagers(z);
            return this;
        }

        private Builder() {
            super(Restriction.DEFAULT_INSTANCE);
        }
    }

    static {
        Restriction restriction = new Restriction();
        DEFAULT_INSTANCE = restriction;
        GeneratedMessageLite.registerDefaultInstance(Restriction.class, restriction);
    }

    private Restriction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableRcmd() {
        this.disableRcmd_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLessons() {
        this.isLessons_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsReview() {
        this.isReview_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTeenagers() {
        this.isTeenagers_ = false;
    }

    public static Restriction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Restriction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Restriction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Restriction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Restriction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableRcmd(boolean z) {
        this.disableRcmd_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLessons(boolean z) {
        this.isLessons_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsReview(boolean z) {
        this.isReview_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTeenagers(boolean z) {
        this.isTeenagers_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68491.f16809xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Restriction();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"isTeenagers_", "isLessons_", "isReview_", "disableRcmd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Restriction> parser = PARSER;
                if (parser == null) {
                    synchronized (Restriction.class) {
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

    public boolean getDisableRcmd() {
        return this.disableRcmd_;
    }

    public boolean getIsLessons() {
        return this.isLessons_;
    }

    public boolean getIsReview() {
        return this.isReview_;
    }

    public boolean getIsTeenagers() {
        return this.isTeenagers_;
    }

    public static Builder newBuilder(Restriction restriction) {
        return DEFAULT_INSTANCE.createBuilder(restriction);
    }

    public static Restriction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Restriction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Restriction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Restriction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Restriction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Restriction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Restriction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Restriction parseFrom(InputStream inputStream) throws IOException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Restriction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Restriction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Restriction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Restriction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
