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
/* loaded from: classes17.dex */
public final class OgvSwitch extends GeneratedMessageLite<OgvSwitch, OgvSwitch.Builder> implements MessageLiteOrBuilder {
    private static final OgvSwitch DEFAULT_INSTANCE;
    public static final int ENABLE_SHOW_VT_INFO_FIELD_NUMBER = 4;
    public static final int MERGE_POSITION_SECTION_FOR_CINEMA_FIELD_NUMBER = 2;
    public static final int MERGE_PREVIEW_SECTION_FIELD_NUMBER = 3;
    private static volatile Parser<OgvSwitch> PARSER = null;
    public static final int REDUCE_SHORT_TITLE_SPACING_FIELD_NUMBER = 1;
    private int enableShowVtInfo_;
    private int mergePositionSectionForCinema_;
    private int mergePreviewSection_;
    private int reduceShortTitleSpacing_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.OgvSwitch$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17068xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17068xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17068xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17068xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17068xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17068xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17068xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17068xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OgvSwitch, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70911 c70911) {
            this();
        }

        public Builder clearEnableShowVtInfo() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearEnableShowVtInfo();
            return this;
        }

        public Builder clearMergePositionSectionForCinema() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearMergePositionSectionForCinema();
            return this;
        }

        public Builder clearMergePreviewSection() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearMergePreviewSection();
            return this;
        }

        public Builder clearReduceShortTitleSpacing() {
            copyOnWrite();
            ((OgvSwitch) this.instance).clearReduceShortTitleSpacing();
            return this;
        }

        public int getEnableShowVtInfo() {
            return ((OgvSwitch) this.instance).getEnableShowVtInfo();
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

        public Builder setEnableShowVtInfo(int i) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setEnableShowVtInfo(i);
            return this;
        }

        public Builder setMergePositionSectionForCinema(int i) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setMergePositionSectionForCinema(i);
            return this;
        }

        public Builder setMergePreviewSection(int i) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setMergePreviewSection(i);
            return this;
        }

        public Builder setReduceShortTitleSpacing(int i) {
            copyOnWrite();
            ((OgvSwitch) this.instance).setReduceShortTitleSpacing(i);
            return this;
        }

        private Builder() {
            super(OgvSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        OgvSwitch ogvSwitch = new OgvSwitch();
        DEFAULT_INSTANCE = ogvSwitch;
        GeneratedMessageLite.registerDefaultInstance(OgvSwitch.class, ogvSwitch);
    }

    private OgvSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableShowVtInfo() {
        this.enableShowVtInfo_ = 0;
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

    public static Builder newBuilder() {
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
    public void setEnableShowVtInfo(int i) {
        this.enableShowVtInfo_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergePositionSectionForCinema(int i) {
        this.mergePositionSectionForCinema_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergePreviewSection(int i) {
        this.mergePreviewSection_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReduceShortTitleSpacing(int i) {
        this.reduceShortTitleSpacing_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70911.f17068xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OgvSwitch();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"reduceShortTitleSpacing_", "mergePositionSectionForCinema_", "mergePreviewSection_", "enableShowVtInfo_"});
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

    public int getMergePositionSectionForCinema() {
        return this.mergePositionSectionForCinema_;
    }

    public int getMergePreviewSection() {
        return this.mergePreviewSection_;
    }

    public int getReduceShortTitleSpacing() {
        return this.reduceShortTitleSpacing_;
    }

    public static Builder newBuilder(OgvSwitch ogvSwitch) {
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
