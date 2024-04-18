package com.bapis.bilibili.app.archive.v1;

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
/* loaded from: classes12.dex */
public final class Rights extends GeneratedMessageLite<Rights, Rights.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_PAY_FIELD_NUMBER = 13;
    public static final int AUTOPLAY_FIELD_NUMBER = 8;
    public static final int BP_FIELD_NUMBER = 1;
    private static final Rights DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 3;
    public static final int ELEC_FIELD_NUMBER = 2;
    public static final int HD5_FIELD_NUMBER = 6;
    public static final int IS_COOPERATION_FIELD_NUMBER = 10;
    public static final int MOVIE_FIELD_NUMBER = 4;
    public static final int NO_BACKGROUND_FIELD_NUMBER = 12;
    public static final int NO_REPRINT_FIELD_NUMBER = 7;
    private static volatile Parser<Rights> PARSER = null;
    public static final int PAY_FIELD_NUMBER = 5;
    public static final int PAY_FREE_WATCH_FIELD_NUMBER = 14;
    public static final int UGC_PAY_FIELD_NUMBER = 9;
    public static final int UGC_PAY_PREVIEW_FIELD_NUMBER = 11;
    private int arcPay_;
    private int autoplay_;
    private int bp_;
    private int download_;
    private int elec_;
    private int hd5_;
    private int isCooperation_;
    private int movie_;
    private int noBackground_;
    private int noReprint_;
    private int payFreeWatch_;
    private int pay_;
    private int ugcPayPreview_;
    private int ugcPay_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.v1.Rights$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55191 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15729xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15729xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15729xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15729xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15729xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15729xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15729xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15729xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Rights, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C55191 c55191) {
            this();
        }

        public Builder clearArcPay() {
            copyOnWrite();
            ((Rights) this.instance).clearArcPay();
            return this;
        }

        public Builder clearAutoplay() {
            copyOnWrite();
            ((Rights) this.instance).clearAutoplay();
            return this;
        }

        public Builder clearBp() {
            copyOnWrite();
            ((Rights) this.instance).clearBp();
            return this;
        }

        public Builder clearDownload() {
            copyOnWrite();
            ((Rights) this.instance).clearDownload();
            return this;
        }

        public Builder clearElec() {
            copyOnWrite();
            ((Rights) this.instance).clearElec();
            return this;
        }

        public Builder clearHd5() {
            copyOnWrite();
            ((Rights) this.instance).clearHd5();
            return this;
        }

        public Builder clearIsCooperation() {
            copyOnWrite();
            ((Rights) this.instance).clearIsCooperation();
            return this;
        }

        public Builder clearMovie() {
            copyOnWrite();
            ((Rights) this.instance).clearMovie();
            return this;
        }

        public Builder clearNoBackground() {
            copyOnWrite();
            ((Rights) this.instance).clearNoBackground();
            return this;
        }

        public Builder clearNoReprint() {
            copyOnWrite();
            ((Rights) this.instance).clearNoReprint();
            return this;
        }

        public Builder clearPay() {
            copyOnWrite();
            ((Rights) this.instance).clearPay();
            return this;
        }

        public Builder clearPayFreeWatch() {
            copyOnWrite();
            ((Rights) this.instance).clearPayFreeWatch();
            return this;
        }

        public Builder clearUgcPay() {
            copyOnWrite();
            ((Rights) this.instance).clearUgcPay();
            return this;
        }

        public Builder clearUgcPayPreview() {
            copyOnWrite();
            ((Rights) this.instance).clearUgcPayPreview();
            return this;
        }

        public int getArcPay() {
            return ((Rights) this.instance).getArcPay();
        }

        public int getAutoplay() {
            return ((Rights) this.instance).getAutoplay();
        }

        public int getBp() {
            return ((Rights) this.instance).getBp();
        }

        public int getDownload() {
            return ((Rights) this.instance).getDownload();
        }

        public int getElec() {
            return ((Rights) this.instance).getElec();
        }

        public int getHd5() {
            return ((Rights) this.instance).getHd5();
        }

        public int getIsCooperation() {
            return ((Rights) this.instance).getIsCooperation();
        }

        public int getMovie() {
            return ((Rights) this.instance).getMovie();
        }

        public int getNoBackground() {
            return ((Rights) this.instance).getNoBackground();
        }

        public int getNoReprint() {
            return ((Rights) this.instance).getNoReprint();
        }

        public int getPay() {
            return ((Rights) this.instance).getPay();
        }

        public int getPayFreeWatch() {
            return ((Rights) this.instance).getPayFreeWatch();
        }

        public int getUgcPay() {
            return ((Rights) this.instance).getUgcPay();
        }

        public int getUgcPayPreview() {
            return ((Rights) this.instance).getUgcPayPreview();
        }

        public Builder setArcPay(int i) {
            copyOnWrite();
            ((Rights) this.instance).setArcPay(i);
            return this;
        }

        public Builder setAutoplay(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAutoplay(i);
            return this;
        }

        public Builder setBp(int i) {
            copyOnWrite();
            ((Rights) this.instance).setBp(i);
            return this;
        }

        public Builder setDownload(int i) {
            copyOnWrite();
            ((Rights) this.instance).setDownload(i);
            return this;
        }

        public Builder setElec(int i) {
            copyOnWrite();
            ((Rights) this.instance).setElec(i);
            return this;
        }

        public Builder setHd5(int i) {
            copyOnWrite();
            ((Rights) this.instance).setHd5(i);
            return this;
        }

        public Builder setIsCooperation(int i) {
            copyOnWrite();
            ((Rights) this.instance).setIsCooperation(i);
            return this;
        }

        public Builder setMovie(int i) {
            copyOnWrite();
            ((Rights) this.instance).setMovie(i);
            return this;
        }

        public Builder setNoBackground(int i) {
            copyOnWrite();
            ((Rights) this.instance).setNoBackground(i);
            return this;
        }

        public Builder setNoReprint(int i) {
            copyOnWrite();
            ((Rights) this.instance).setNoReprint(i);
            return this;
        }

        public Builder setPay(int i) {
            copyOnWrite();
            ((Rights) this.instance).setPay(i);
            return this;
        }

        public Builder setPayFreeWatch(int i) {
            copyOnWrite();
            ((Rights) this.instance).setPayFreeWatch(i);
            return this;
        }

        public Builder setUgcPay(int i) {
            copyOnWrite();
            ((Rights) this.instance).setUgcPay(i);
            return this;
        }

        public Builder setUgcPayPreview(int i) {
            copyOnWrite();
            ((Rights) this.instance).setUgcPayPreview(i);
            return this;
        }

        private Builder() {
            super(Rights.DEFAULT_INSTANCE);
        }
    }

    static {
        Rights rights = new Rights();
        DEFAULT_INSTANCE = rights;
        GeneratedMessageLite.registerDefaultInstance(Rights.class, rights);
    }

    private Rights() {
    }

    public void clearArcPay() {
        this.arcPay_ = 0;
    }

    public void clearAutoplay() {
        this.autoplay_ = 0;
    }

    public void clearBp() {
        this.bp_ = 0;
    }

    public void clearDownload() {
        this.download_ = 0;
    }

    public void clearElec() {
        this.elec_ = 0;
    }

    public void clearHd5() {
        this.hd5_ = 0;
    }

    public void clearIsCooperation() {
        this.isCooperation_ = 0;
    }

    public void clearMovie() {
        this.movie_ = 0;
    }

    public void clearNoBackground() {
        this.noBackground_ = 0;
    }

    public void clearNoReprint() {
        this.noReprint_ = 0;
    }

    public void clearPay() {
        this.pay_ = 0;
    }

    public void clearPayFreeWatch() {
        this.payFreeWatch_ = 0;
    }

    public void clearUgcPay() {
        this.ugcPay_ = 0;
    }

    public void clearUgcPayPreview() {
        this.ugcPayPreview_ = 0;
    }

    public static Rights getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Rights parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rights parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Rights> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setArcPay(int i) {
        this.arcPay_ = i;
    }

    public void setAutoplay(int i) {
        this.autoplay_ = i;
    }

    public void setBp(int i) {
        this.bp_ = i;
    }

    public void setDownload(int i) {
        this.download_ = i;
    }

    public void setElec(int i) {
        this.elec_ = i;
    }

    public void setHd5(int i) {
        this.hd5_ = i;
    }

    public void setIsCooperation(int i) {
        this.isCooperation_ = i;
    }

    public void setMovie(int i) {
        this.movie_ = i;
    }

    public void setNoBackground(int i) {
        this.noBackground_ = i;
    }

    public void setNoReprint(int i) {
        this.noReprint_ = i;
    }

    public void setPay(int i) {
        this.pay_ = i;
    }

    public void setPayFreeWatch(int i) {
        this.payFreeWatch_ = i;
    }

    public void setUgcPay(int i) {
        this.ugcPay_ = i;
    }

    public void setUgcPayPreview(int i) {
        this.ugcPayPreview_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55191.f15729xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Rights();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0004\f\u0004\r\u0004\u000e\u0004", new Object[]{"bp_", "elec_", "download_", "movie_", "pay_", "hd5_", "noReprint_", "autoplay_", "ugcPay_", "isCooperation_", "ugcPayPreview_", "noBackground_", "arcPay_", "payFreeWatch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Rights> parser = PARSER;
                if (parser == null) {
                    synchronized (Rights.class) {
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

    public int getArcPay() {
        return this.arcPay_;
    }

    public int getAutoplay() {
        return this.autoplay_;
    }

    public int getBp() {
        return this.bp_;
    }

    public int getDownload() {
        return this.download_;
    }

    public int getElec() {
        return this.elec_;
    }

    public int getHd5() {
        return this.hd5_;
    }

    public int getIsCooperation() {
        return this.isCooperation_;
    }

    public int getMovie() {
        return this.movie_;
    }

    public int getNoBackground() {
        return this.noBackground_;
    }

    public int getNoReprint() {
        return this.noReprint_;
    }

    public int getPay() {
        return this.pay_;
    }

    public int getPayFreeWatch() {
        return this.payFreeWatch_;
    }

    public int getUgcPay() {
        return this.ugcPay_;
    }

    public int getUgcPayPreview() {
        return this.ugcPayPreview_;
    }

    public static Builder newBuilder(Rights rights) {
        return DEFAULT_INSTANCE.createBuilder(rights);
    }

    public static Rights parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rights parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Rights parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Rights parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Rights parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Rights parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Rights parseFrom(InputStream inputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rights parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rights parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Rights parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
