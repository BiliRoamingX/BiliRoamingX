package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class ClipInfo extends GeneratedMessageLite<ClipInfo, ClipInfo.Builder> implements ClipInfoOrBuilder {
    public static final int CLIP_TYPE_FIELD_NUMBER = 4;
    private static final ClipInfo DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 3;
    public static final int MATERIAL_NO_FIELD_NUMBER = 1;
    public static final int MULTI_VIEW_FIELD_NUMBER = 6;
    private static volatile Parser<ClipInfo> PARSER = null;
    public static final int START_FIELD_NUMBER = 2;
    public static final int TOAST_TEXT_FIELD_NUMBER = 5;
    private int clipType_;
    private int end_;
    private long materialNo_;
    private MultiView multiView_;
    private int start_;
    private String toastText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.ClipInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17550xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17550xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17550xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17550xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17550xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17550xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17550xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17550xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ClipInfo, Builder> implements ClipInfoOrBuilder {
        /* synthetic */ Builder(C78231 c78231) {
            this();
        }

        public Builder clearClipType() {
            copyOnWrite();
            ((ClipInfo) this.instance).clearClipType();
            return this;
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((ClipInfo) this.instance).clearEnd();
            return this;
        }

        public Builder clearMaterialNo() {
            copyOnWrite();
            ((ClipInfo) this.instance).clearMaterialNo();
            return this;
        }

        public Builder clearMultiView() {
            copyOnWrite();
            ((ClipInfo) this.instance).clearMultiView();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((ClipInfo) this.instance).clearStart();
            return this;
        }

        public Builder clearToastText() {
            copyOnWrite();
            ((ClipInfo) this.instance).clearToastText();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public ClipType getClipType() {
            return ((ClipInfo) this.instance).getClipType();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public int getClipTypeValue() {
            return ((ClipInfo) this.instance).getClipTypeValue();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public int getEnd() {
            return ((ClipInfo) this.instance).getEnd();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public long getMaterialNo() {
            return ((ClipInfo) this.instance).getMaterialNo();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public MultiView getMultiView() {
            return ((ClipInfo) this.instance).getMultiView();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public int getStart() {
            return ((ClipInfo) this.instance).getStart();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public String getToastText() {
            return ((ClipInfo) this.instance).getToastText();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public ByteString getToastTextBytes() {
            return ((ClipInfo) this.instance).getToastTextBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
        public boolean hasMultiView() {
            return ((ClipInfo) this.instance).hasMultiView();
        }

        public Builder mergeMultiView(MultiView multiView) {
            copyOnWrite();
            ((ClipInfo) this.instance).mergeMultiView(multiView);
            return this;
        }

        public Builder setClipType(ClipType clipType) {
            copyOnWrite();
            ((ClipInfo) this.instance).setClipType(clipType);
            return this;
        }

        public Builder setClipTypeValue(int i) {
            copyOnWrite();
            ((ClipInfo) this.instance).setClipTypeValue(i);
            return this;
        }

        public Builder setEnd(int i) {
            copyOnWrite();
            ((ClipInfo) this.instance).setEnd(i);
            return this;
        }

        public Builder setMaterialNo(long j) {
            copyOnWrite();
            ((ClipInfo) this.instance).setMaterialNo(j);
            return this;
        }

        public Builder setMultiView(MultiView multiView) {
            copyOnWrite();
            ((ClipInfo) this.instance).setMultiView(multiView);
            return this;
        }

        public Builder setStart(int i) {
            copyOnWrite();
            ((ClipInfo) this.instance).setStart(i);
            return this;
        }

        public Builder setToastText(String str) {
            copyOnWrite();
            ((ClipInfo) this.instance).setToastText(str);
            return this;
        }

        public Builder setToastTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ClipInfo) this.instance).setToastTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(ClipInfo.DEFAULT_INSTANCE);
        }

        public Builder setMultiView(MultiView.Builder builder) {
            copyOnWrite();
            ((ClipInfo) this.instance).setMultiView(builder.build());
            return this;
        }
    }

    static {
        ClipInfo clipInfo = new ClipInfo();
        DEFAULT_INSTANCE = clipInfo;
        GeneratedMessageLite.registerDefaultInstance(ClipInfo.class, clipInfo);
    }

    public ClipInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClipType() {
        this.clipType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialNo() {
        this.materialNo_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultiView() {
        this.multiView_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastText() {
        this.toastText_ = getDefaultInstance().getToastText();
    }

    public static ClipInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMultiView(MultiView multiView) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClipInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClipInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClipInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClipInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipType(ClipType clipType) {
        this.clipType_ = clipType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipTypeValue(int i) {
        this.clipType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(int i) {
        this.end_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialNo(long j) {
        this.materialNo_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultiView(MultiView multiView) {
        multiView.getClass();
        this.multiView_ = multiView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(int i) {
        this.start_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastText(String str) {
        str.getClass();
        this.toastText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toastText_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78231.f17550xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ClipInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\f\u0005\u0208\u0006\t", new Object[]{"materialNo_", "start_", "end_", "clipType_", "toastText_", "multiView_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClipInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (ClipInfo.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public ClipType getClipType() {
        ClipType forNumber = ClipType.forNumber(this.clipType_);
        return forNumber == null ? ClipType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public int getClipTypeValue() {
        return this.clipType_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public int getEnd() {
        return this.end_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public long getMaterialNo() {
        return this.materialNo_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public MultiView getMultiView() {
        MultiView multiView = this.multiView_;
        return multiView == null ? MultiView.getDefaultInstance() : multiView;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public int getStart() {
        return this.start_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public String getToastText() {
        return this.toastText_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public ByteString getToastTextBytes() {
        return ByteString.copyFromUtf8(this.toastText_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.ClipInfoOrBuilder
    public boolean hasMultiView() {
        return this.multiView_ != null;
    }

    public static Builder newBuilder(ClipInfo clipInfo) {
        return DEFAULT_INSTANCE.createBuilder(clipInfo);
    }

    public static ClipInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClipInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClipInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClipInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClipInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClipInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClipInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClipInfo parseFrom(InputStream inputStream) throws IOException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClipInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClipInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClipInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClipInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
