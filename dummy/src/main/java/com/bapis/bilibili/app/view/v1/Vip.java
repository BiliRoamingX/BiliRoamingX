package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class Vip extends GeneratedMessageLite<Vip, Vip.Builder> implements MessageLiteOrBuilder {
    public static final int ACCESS_STATUS_FIELD_NUMBER = 4;
    private static final Vip DEFAULT_INSTANCE;
    public static final int DUE_DATE_FIELD_NUMBER = 2;
    public static final int DUE_REMARK_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 8;
    private static volatile Parser<Vip> PARSER = null;
    public static final int THEME_TYPE_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VIP_STATUS_FIELD_NUMBER = 5;
    public static final int VIP_STATUS_WARN_FIELD_NUMBER = 6;
    private int accessStatus_;
    private long dueDate_;
    private VipLabel label_;
    private int themeType_;
    private int type_;
    private int vipStatus_;
    private String dueRemark_ = "";
    private String vipStatusWarn_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Vip$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16861xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16861xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16861xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16861xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16861xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16861xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16861xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16861xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Vip, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69091 c69091) {
            this();
        }

        public Builder clearAccessStatus() {
            copyOnWrite();
            ((Vip) this.instance).clearAccessStatus();
            return this;
        }

        public Builder clearDueDate() {
            copyOnWrite();
            ((Vip) this.instance).clearDueDate();
            return this;
        }

        public Builder clearDueRemark() {
            copyOnWrite();
            ((Vip) this.instance).clearDueRemark();
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

        public Builder clearVipStatusWarn() {
            copyOnWrite();
            ((Vip) this.instance).clearVipStatusWarn();
            return this;
        }

        public int getAccessStatus() {
            return ((Vip) this.instance).getAccessStatus();
        }

        public long getDueDate() {
            return ((Vip) this.instance).getDueDate();
        }

        public String getDueRemark() {
            return ((Vip) this.instance).getDueRemark();
        }

        public ByteString getDueRemarkBytes() {
            return ((Vip) this.instance).getDueRemarkBytes();
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

        public String getVipStatusWarn() {
            return ((Vip) this.instance).getVipStatusWarn();
        }

        public ByteString getVipStatusWarnBytes() {
            return ((Vip) this.instance).getVipStatusWarnBytes();
        }

        public boolean hasLabel() {
            return ((Vip) this.instance).hasLabel();
        }

        public Builder mergeLabel(VipLabel vipLabel) {
            copyOnWrite();
            ((Vip) this.instance).mergeLabel(vipLabel);
            return this;
        }

        public Builder setAccessStatus(int i) {
            copyOnWrite();
            ((Vip) this.instance).setAccessStatus(i);
            return this;
        }

        public Builder setDueDate(long j) {
            copyOnWrite();
            ((Vip) this.instance).setDueDate(j);
            return this;
        }

        public Builder setDueRemark(String str) {
            copyOnWrite();
            ((Vip) this.instance).setDueRemark(str);
            return this;
        }

        public Builder setDueRemarkBytes(ByteString byteString) {
            copyOnWrite();
            ((Vip) this.instance).setDueRemarkBytes(byteString);
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

        public Builder setVipStatusWarn(String str) {
            copyOnWrite();
            ((Vip) this.instance).setVipStatusWarn(str);
            return this;
        }

        public Builder setVipStatusWarnBytes(ByteString byteString) {
            copyOnWrite();
            ((Vip) this.instance).setVipStatusWarnBytes(byteString);
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
    public void clearAccessStatus() {
        this.accessStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDueDate() {
        this.dueDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDueRemark() {
        this.dueRemark_ = getDefaultInstance().getDueRemark();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipStatusWarn() {
        this.vipStatusWarn_ = getDefaultInstance().getVipStatusWarn();
    }

    public static Vip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(VipLabel vipLabel) {
        vipLabel.getClass();
        VipLabel vipLabel2 = this.label_;
        if (vipLabel2 != null && vipLabel2 != VipLabel.getDefaultInstance()) {
            this.label_ = VipLabel.newBuilder(this.label_).mergeFrom(vipLabel).buildPartial();
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
    public void setAccessStatus(int i) {
        this.accessStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDueDate(long j) {
        this.dueDate_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDueRemark(String str) {
        str.getClass();
        this.dueRemark_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDueRemarkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dueRemark_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipStatusWarn(String str) {
        str.getClass();
        this.vipStatusWarn_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipStatusWarnBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vipStatusWarn_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69091.f16861xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Vip();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0208\u0004\u0004\u0005\u0004\u0006\u0208\u0007\u0004\b\t", new Object[]{"type_", "dueDate_", "dueRemark_", "accessStatus_", "vipStatus_", "vipStatusWarn_", "themeType_", "label_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Vip> parser = PARSER;
                if (parser == null) {
                    synchronized (Vip.class) {
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

    public int getAccessStatus() {
        return this.accessStatus_;
    }

    public long getDueDate() {
        return this.dueDate_;
    }

    public String getDueRemark() {
        return this.dueRemark_;
    }

    public ByteString getDueRemarkBytes() {
        return ByteString.copyFromUtf8(this.dueRemark_);
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

    public String getVipStatusWarn() {
        return this.vipStatusWarn_;
    }

    public ByteString getVipStatusWarnBytes() {
        return ByteString.copyFromUtf8(this.vipStatusWarn_);
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
