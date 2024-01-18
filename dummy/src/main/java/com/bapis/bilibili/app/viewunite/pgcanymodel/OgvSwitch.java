package com.bapis.bilibili.app.viewunite.pgcanymodel;

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
/* loaded from: classes20.dex */
public final class OgvSwitch extends GeneratedMessageLite<OgvSwitch, OgvSwitch.C8065b> implements MessageLiteOrBuilder {
    private static final OgvSwitch DEFAULT_INSTANCE;
    public static final int ENABLE_SHOW_VT_INFO_FIELD_NUMBER = 4;
    public static final int HIDE_EP_VV_VT_DM_FIELD_NUMBER = 5;
    public static final int MERGE_POSITION_SECTION_FOR_CINEMA_FIELD_NUMBER = 2;
    public static final int MERGE_PREVIEW_SECTION_FIELD_NUMBER = 3;
    private static volatile Parser<OgvSwitch> PARSER = null;
    public static final int REDUCE_SHORT_TITLE_SPACING_FIELD_NUMBER = 1;
    private int enableShowVtInfo_;
    private int hideEpVvVtDm_;
    private int mergePositionSectionForCinema_;
    private int mergePreviewSection_;
    private int reduceShortTitleSpacing_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.OgvSwitch$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C8064a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18274xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18274xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18274xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18274xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18274xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18274xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18274xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18274xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.OgvSwitch$b */
    /* loaded from: classes20.dex */
    public static final class C8065b extends GeneratedMessageLite.Builder<OgvSwitch, C8065b> implements MessageLiteOrBuilder {
        /* synthetic */ C8065b(C8064a c8064a) {
            this();
        }

        public C8065b clearEnableShowVtInfo() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearEnableShowVtInfo();
            return this;
        }

        public C8065b clearHideEpVvVtDm() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearHideEpVvVtDm();
            return this;
        }

        public C8065b clearMergePositionSectionForCinema() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearMergePositionSectionForCinema();
            return this;
        }

        public C8065b clearMergePreviewSection() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearMergePreviewSection();
            return this;
        }

        public C8065b clearReduceShortTitleSpacing() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearReduceShortTitleSpacing();
            return this;
        }

        public int getEnableShowVtInfo() {
            return ((OgvSwitch) this.instance).getEnableShowVtInfo();
        }

        public int getHideEpVvVtDm() {
            return ((OgvSwitch) this.instance).getHideEpVvVtDm();
        }

        public int getMergePositionSectionForCinema() {
            return ((OgvSwitch) this.instance).getMergePositionSectionForCinema();
        }

        public int getMergePreviewSection() {
            return ((OgvSwitch) this.instance).getMergePreviewSection();
        }

        public int getReduceShortTitleSpacing() {
            return ((OgvSwitch) this.instance).getReduceShortTitleSpacing();
        }

        public C8065b setEnableShowVtInfo(int i2) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setEnableShowVtInfo(i2);
            return this;
        }

        public C8065b setHideEpVvVtDm(int i2) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setHideEpVvVtDm(i2);
            return this;
        }

        public C8065b setMergePositionSectionForCinema(int i2) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setMergePositionSectionForCinema(i2);
            return this;
        }

        public C8065b setMergePreviewSection(int i2) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setMergePreviewSection(i2);
            return this;
        }

        public C8065b setReduceShortTitleSpacing(int i2) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setReduceShortTitleSpacing(i2);
            return this;
        }

        private C8065b() {
            super(OgvSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        OgvSwitch ogvSwitch = new OgvSwitch();
        DEFAULT_INSTANCE = ogvSwitch;
        GeneratedMessageLite.registerDefaultInstance(OgvSwitch.class, ogvSwitch);
    }

    public OgvSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableShowVtInfo() {
        this.enableShowVtInfo_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideEpVvVtDm() {
        this.hideEpVvVtDm_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergePositionSectionForCinema() {
        this.mergePositionSectionForCinema_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergePreviewSection() {
        this.mergePreviewSection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReduceShortTitleSpacing() {
        this.reduceShortTitleSpacing_ = 0;
    }

    public static OgvSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8065b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OgvSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OgvSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OgvSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableShowVtInfo(int i2) {
        this.enableShowVtInfo_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideEpVvVtDm(int i2) {
        this.hideEpVvVtDm_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergePositionSectionForCinema(int i2) {
        this.mergePositionSectionForCinema_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergePreviewSection(int i2) {
        this.mergePreviewSection_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReduceShortTitleSpacing(int i2) {
        this.reduceShortTitleSpacing_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C8064a c8064a = null;
        switch (C8064a.f18274xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OgvSwitch();
            case 2:
                return new C8065b(c8064a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"reduceShortTitleSpacing_", "mergePositionSectionForCinema_", "mergePreviewSection_", "enableShowVtInfo_", "hideEpVvVtDm_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OgvSwitch> parser = PARSER;
                if (parser == null) {
                    synchronized (OgvSwitch.class) {
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

    public int getEnableShowVtInfo() {
        return this.enableShowVtInfo_;
    }

    public int getHideEpVvVtDm() {
        return this.hideEpVvVtDm_;
    }

    public int getMergePositionSectionForCinema() {
        return this.mergePositionSectionForCinema_;
    }

    public int getMergePreviewSection() {
        return this.mergePreviewSection_;
    }

    public int getReduceShortTitleSpacing() {
        return this.reduceShortTitleSpacing_;
    }

    public static C8065b newBuilder(OgvSwitch ogvSwitch) {
        return DEFAULT_INSTANCE.createBuilder(ogvSwitch);
    }

    public static OgvSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OgvSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OgvSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OgvSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OgvSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OgvSwitch parseFrom(InputStream inputStream) throws IOException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OgvSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
