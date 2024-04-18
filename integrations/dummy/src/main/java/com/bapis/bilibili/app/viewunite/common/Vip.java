package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class Vip extends GeneratedMessageLite<Vip, Vip.Builder> implements MessageLiteOrBuilder {
    private static final Vip DEFAULT_INSTANCE;
    public static final int IS_VIP_FIELD_NUMBER = 5;
    public static final int LABEL_FIELD_NUMBER = 4;
    private static volatile Parser<Vip> PARSER = null;
    public static final int THEME_TYPE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VIP_STATUS_FIELD_NUMBER = 2;
    private int isVip_;
    private VipLabel label_;
    private int themeType_;
    private int type_;
    private int vipStatus_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Vip$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70841 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17061xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17061xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17061xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17061xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17061xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17061xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17061xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17061xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Vip, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70841 c70841) {
            this();
        }

        public Builder clearIsVip() {
            copyOnWrite();
            ((Vip) this.instance).clearIsVip();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((Vip) this.instance).clearLabel();
            return this;
        }

        public Builder clearThemeType() {
            copyOnWrite();
            ((Vip) this.instance).clearThemeType();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Vip) this.instance).clearType();
            return this;
        }

        public Builder clearVipStatus() {
            copyOnWrite();
            ((Vip) this.instance).clearVipStatus();
            return this;
        }

        public int getIsVip() {
            return ((Vip) this.instance).getIsVip();
        }

        public VipLabel getLabel() {
            return ((Vip) this.instance).getLabel();
        }

        public int getThemeType() {
            return ((Vip) this.instance).getThemeType();
        }

        public int getType() {
            return ((Vip) this.instance).getType();
        }

        public int getVipStatus() {
            return ((Vip) this.instance).getVipStatus();
        }

        public boolean hasLabel() {
            return ((Vip) this.instance).hasLabel();
        }

        public Builder mergeLabel(VipLabel vipLabel) {
            copyOnWrite();
            ((Vip) this.instance).mergeLabel(vipLabel);
            return this;
        }

        public Builder setIsVip(int i) {
            copyOnWrite();
            ((Vip) this.instance).setIsVip(i);
            return this;
        }

        public Builder setLabel(VipLabel vipLabel) {
            copyOnWrite();
            ((Vip) this.instance).setLabel(vipLabel);
            return this;
        }

        public Builder setThemeType(int i) {
            copyOnWrite();
            ((Vip) this.instance).setThemeType(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((Vip) this.instance).setType(i);
            return this;
        }

        public Builder setVipStatus(int i) {
            copyOnWrite();
            ((Vip) this.instance).setVipStatus(i);
            return this;
        }

        private Builder() {
            super(Vip.DEFAULT_INSTANCE);
        }

        public Builder setLabel(VipLabel.Builder builder) {
            copyOnWrite();
            ((Vip) this.instance).setLabel(builder.build());
            return this;
        }
    }

    static {
        Vip vip = new Vip();
        DEFAULT_INSTANCE = vip;
        GeneratedMessageLite.registerDefaultInstance(Vip.class, vip);
    }

    private Vip() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVip() {
        this.isVip_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThemeType() {
        this.themeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipStatus() {
        this.vipStatus_ = 0;
    }

    public static Vip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(VipLabel vipLabel) {
        vipLabel.getClass();
        VipLabel vipLabel2 = this.label_;
        if (vipLabel2 != null && vipLabel2 != VipLabel.getDefaultInstance()) {
            this.label_ = VipLabel.newBuilder(this.label_).mergeFrom((VipLabel) vipLabel).buildPartial();
        } else {
            this.label_ = vipLabel;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Vip parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Vip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Vip parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Vip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVip(int i) {
        this.isVip_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(VipLabel vipLabel) {
        vipLabel.getClass();
        this.label_ = vipLabel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThemeType(int i) {
        this.themeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipStatus(int i) {
        this.vipStatus_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70841.f17061xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Vip();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\t\u0005\u0004", new Object[]{"type_", "vipStatus_", "themeType_", "label_", "isVip_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Vip> parser = PARSER;
                if (parser == null) {
                    synchronized (Vip.class) {
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

    public int getIsVip() {
        return this.isVip_;
    }

    public VipLabel getLabel() {
        VipLabel vipLabel = this.label_;
        return vipLabel == null ? VipLabel.getDefaultInstance() : vipLabel;
    }

    public int getThemeType() {
        return this.themeType_;
    }

    public int getType() {
        return this.type_;
    }

    public int getVipStatus() {
        return this.vipStatus_;
    }

    public boolean hasLabel() {
        return this.label_ != null;
    }

    public static Builder newBuilder(Vip vip) {
        return DEFAULT_INSTANCE.createBuilder(vip);
    }

    public static Vip parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Vip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Vip parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Vip parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Vip parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Vip parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Vip parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Vip parseFrom(InputStream inputStream) throws IOException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Vip parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Vip parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Vip parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
