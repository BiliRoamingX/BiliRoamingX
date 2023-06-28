package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class Staff extends GeneratedMessageLite<Staff, Staff.Builder> implements StaffOrBuilder {
    public static final int ATTENTION_FIELD_NUMBER = 7;
    private static final Staff DEFAULT_INSTANCE;
    public static final int FACE_FIELD_NUMBER = 3;
    public static final int LABEL_STYLE_FIELD_NUMBER = 8;
    public static final int MID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int OFFICIAL_VERIFY_FIELD_NUMBER = 5;
    private static volatile Parser<Staff> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VIP_FIELD_NUMBER = 6;
    private int attention_;
    private int labelStyle_;
    private long mid_;
    private OfficialVerify officialVerify_;
    private Vip vip_;
    private String title_ = "";
    private String face_ = "";
    private String name_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Staff$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16824xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16824xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16824xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16824xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16824xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16824xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16824xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16824xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Staff, Builder> implements StaffOrBuilder {
        /* synthetic */ Builder(C68651 c68651) {
            this();
        }

        public Builder clearAttention() {
            copyOnWrite();
            ((Staff) this.instance).clearAttention();
            return this;
        }

        public Builder clearFace() {
            copyOnWrite();
            ((Staff) this.instance).clearFace();
            return this;
        }

        public Builder clearLabelStyle() {
            copyOnWrite();
            ((Staff) this.instance).clearLabelStyle();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((Staff) this.instance).clearMid();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Staff) this.instance).clearName();
            return this;
        }

        public Builder clearOfficialVerify() {
            copyOnWrite();
            ((Staff) this.instance).clearOfficialVerify();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Staff) this.instance).clearTitle();
            return this;
        }

        public Builder clearVip() {
            copyOnWrite();
            ((Staff) this.instance).clearVip();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public int getAttention() {
            return ((Staff) this.instance).getAttention();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public String getFace() {
            return ((Staff) this.instance).getFace();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public ByteString getFaceBytes() {
            return ((Staff) this.instance).getFaceBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public int getLabelStyle() {
            return ((Staff) this.instance).getLabelStyle();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public long getMid() {
            return ((Staff) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public String getName() {
            return ((Staff) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public ByteString getNameBytes() {
            return ((Staff) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public OfficialVerify getOfficialVerify() {
            return ((Staff) this.instance).getOfficialVerify();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public String getTitle() {
            return ((Staff) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public ByteString getTitleBytes() {
            return ((Staff) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public Vip getVip() {
            return ((Staff) this.instance).getVip();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public boolean hasOfficialVerify() {
            return ((Staff) this.instance).hasOfficialVerify();
        }

        @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
        public boolean hasVip() {
            return ((Staff) this.instance).hasVip();
        }

        public Builder mergeOfficialVerify(OfficialVerify officialVerify) {
            copyOnWrite();
            ((Staff) this.instance).mergeOfficialVerify(officialVerify);
            return this;
        }

        public Builder mergeVip(Vip vip) {
            copyOnWrite();
            ((Staff) this.instance).mergeVip(vip);
            return this;
        }

        public Builder setAttention(int i) {
            copyOnWrite();
            ((Staff) this.instance).setAttention(i);
            return this;
        }

        public Builder setFace(String str) {
            copyOnWrite();
            ((Staff) this.instance).setFace(str);
            return this;
        }

        public Builder setFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((Staff) this.instance).setFaceBytes(byteString);
            return this;
        }

        public Builder setLabelStyle(int i) {
            copyOnWrite();
            ((Staff) this.instance).setLabelStyle(i);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((Staff) this.instance).setMid(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Staff) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Staff) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOfficialVerify(OfficialVerify officialVerify) {
            copyOnWrite();
            ((Staff) this.instance).setOfficialVerify(officialVerify);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Staff) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Staff) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setVip(Vip vip) {
            copyOnWrite();
            ((Staff) this.instance).setVip(vip);
            return this;
        }

        private Builder() {
            super(Staff.DEFAULT_INSTANCE);
        }

        public Builder setOfficialVerify(OfficialVerify.Builder builder) {
            copyOnWrite();
            ((Staff) this.instance).setOfficialVerify(builder.build());
            return this;
        }

        public Builder setVip(Vip.Builder builder) {
            copyOnWrite();
            ((Staff) this.instance).setVip(builder.build());
            return this;
        }
    }

    static {
        Staff staff = new Staff();
        DEFAULT_INSTANCE = staff;
        GeneratedMessageLite.registerDefaultInstance(Staff.class, staff);
    }

    private Staff() {
    }

    public void clearAttention() {
        this.attention_ = 0;
    }

    public void clearFace() {
        this.face_ = getDefaultInstance().getFace();
    }

    public void clearLabelStyle() {
        this.labelStyle_ = 0;
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearOfficialVerify() {
        this.officialVerify_ = null;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearVip() {
        this.vip_ = null;
    }

    public static Staff getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeOfficialVerify(OfficialVerify officialVerify) {
    }

    public void mergeVip(Vip vip) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Staff parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Staff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Staff parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Staff> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAttention(int i) {
        this.attention_ = i;
    }

    public void setFace(String str) {
        str.getClass();
        this.face_ = str;
    }

    public void setFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.face_ = byteString.toStringUtf8();
    }

    public void setLabelStyle(int i) {
        this.labelStyle_ = i;
    }

    public void setMid(long j) {
        this.mid_ = j;
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public void setOfficialVerify(OfficialVerify officialVerify) {
        officialVerify.getClass();
        this.officialVerify_ = officialVerify;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setVip(Vip vip) {
        vip.getClass();
        this.vip_ = vip;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68651.f16824xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Staff();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t\u0006\t\u0007\u0004\b\u0004", new Object[]{"mid_", "title_", "face_", "name_", "officialVerify_", "vip_", "attention_", "labelStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Staff> parser = PARSER;
                if (parser == null) {
                    synchronized (Staff.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public int getAttention() {
        return this.attention_;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public String getFace() {
        return this.face_;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public ByteString getFaceBytes() {
        return ByteString.copyFromUtf8(this.face_);
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public int getLabelStyle() {
        return this.labelStyle_;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public OfficialVerify getOfficialVerify() {
        OfficialVerify officialVerify = this.officialVerify_;
        return officialVerify == null ? OfficialVerify.getDefaultInstance() : officialVerify;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public Vip getVip() {
        Vip vip = this.vip_;
        return vip == null ? Vip.getDefaultInstance() : vip;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public boolean hasOfficialVerify() {
        return this.officialVerify_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.StaffOrBuilder
    public boolean hasVip() {
        return this.vip_ != null;
    }

    public static Builder newBuilder(Staff staff) {
        return DEFAULT_INSTANCE.createBuilder(staff);
    }

    public static Staff parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Staff) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Staff parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Staff parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Staff parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Staff parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Staff parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Staff parseFrom(InputStream inputStream) throws IOException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Staff parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Staff parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Staff parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Staff) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
