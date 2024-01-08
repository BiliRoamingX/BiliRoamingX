package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes20.dex */
public final class VideoGuide extends GeneratedMessageLite<VideoGuide, VideoGuide.C12390b> implements MessageLiteOrBuilder {
    public static final int CONTRACT_CARD_FIELD_NUMBER = 3;
    private static final VideoGuide DEFAULT_INSTANCE;
    public static final int MATERIAL_FIELD_NUMBER = 1;
    private static volatile Parser<VideoGuide> PARSER = null;
    public static final int RIGHT_MATERIAL_FIELD_NUMBER = 4;
    public static final int VIDEO_POINT_FIELD_NUMBER = 2;
    private ContractCard contractCard_;
    private Internal.ProtobufList<Material> material_ = GeneratedMessageLite.emptyProtobufList();
    private Material rightMaterial_;
    private VideoViewPoint videoPoint_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.VideoGuide$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12389a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21303xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21303xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21303xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21303xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21303xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21303xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21303xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21303xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.VideoGuide$b */
    /* loaded from: classes20.dex */
    public static final class C12390b extends GeneratedMessageLite.Builder<VideoGuide, C12390b> implements MessageLiteOrBuilder {
        /* synthetic */ C12390b(C12389a c12389a) {
            this();
        }

        public C12390b addAllMaterial(Iterable<? extends Material> iterable) {
            copyOnWrite();
            ((VideoGuide) this.instance).addAllMaterial(iterable);
            return this;
        }

        public C12390b addMaterial(Material material) {
            copyOnWrite();
            ((VideoGuide) this.instance).addMaterial(material);
            return this;
        }

        public C12390b clearContractCard() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearContractCard();
            return this;
        }

        public C12390b clearMaterial() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearMaterial();
            return this;
        }

        public C12390b clearRightMaterial() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearRightMaterial();
            return this;
        }

        public C12390b clearVideoPoint() {
            copyOnWrite();
            ((VideoGuide) this.instance).clearVideoPoint();
            return this;
        }

        public ContractCard getContractCard() {
            return ((VideoGuide) this.instance).getContractCard();
        }

        public Material getMaterial(int i) {
            return ((VideoGuide) this.instance).getMaterial(i);
        }

        public int getMaterialCount() {
            return ((VideoGuide) this.instance).getMaterialCount();
        }

        public List<Material> getMaterialList() {
            return Collections.unmodifiableList(((VideoGuide) this.instance).getMaterialList());
        }

        public Material getRightMaterial() {
            return ((VideoGuide) this.instance).getRightMaterial();
        }

        public VideoViewPoint getVideoPoint() {
            return ((VideoGuide) this.instance).getVideoPoint();
        }

        public boolean hasContractCard() {
            return ((VideoGuide) this.instance).hasContractCard();
        }

        public boolean hasRightMaterial() {
            return ((VideoGuide) this.instance).hasRightMaterial();
        }

        public boolean hasVideoPoint() {
            return ((VideoGuide) this.instance).hasVideoPoint();
        }

        public C12390b mergeContractCard(ContractCard contractCard) {
            copyOnWrite();
            ((VideoGuide) this.instance).mergeContractCard(contractCard);
            return this;
        }

        public C12390b mergeRightMaterial(Material material) {
            copyOnWrite();
            ((VideoGuide) this.instance).mergeRightMaterial(material);
            return this;
        }

        public C12390b mergeVideoPoint(VideoViewPoint videoViewPoint) {
            copyOnWrite();
            ((VideoGuide) this.instance).mergeVideoPoint(videoViewPoint);
            return this;
        }

        public C12390b removeMaterial(int i) {
            copyOnWrite();
            ((VideoGuide) this.instance).removeMaterial(i);
            return this;
        }

        public C12390b setContractCard(ContractCard contractCard) {
            copyOnWrite();
            ((VideoGuide) this.instance).setContractCard(contractCard);
            return this;
        }

        public C12390b setMaterial(int i, Material material) {
            copyOnWrite();
            ((VideoGuide) this.instance).setMaterial(i, material);
            return this;
        }

        public C12390b setRightMaterial(Material material) {
            copyOnWrite();
            ((VideoGuide) this.instance).setRightMaterial(material);
            return this;
        }

        public C12390b setVideoPoint(VideoViewPoint videoViewPoint) {
            copyOnWrite();
            ((VideoGuide) this.instance).setVideoPoint(videoViewPoint);
            return this;
        }

        private C12390b() {
            super(VideoGuide.DEFAULT_INSTANCE);
        }

        public C12390b addMaterial(int i, Material material) {
            copyOnWrite();
            ((VideoGuide) this.instance).addMaterial(i, material);
            return this;
        }

        public C12390b setContractCard(ContractCard.C12298b c12298b) {
            copyOnWrite();
            ((VideoGuide) this.instance).setContractCard(c12298b.build());
            return this;
        }

        public C12390b setMaterial(int i, Material.C12325b c12325b) {
            copyOnWrite();
            ((VideoGuide) this.instance).setMaterial(i, c12325b.build());
            return this;
        }

        public C12390b setRightMaterial(Material.C12325b c12325b) {
            copyOnWrite();
            ((VideoGuide) this.instance).setRightMaterial(c12325b.build());
            return this;
        }

        public C12390b setVideoPoint(VideoViewPoint.C12396b c12396b) {
            copyOnWrite();
            ((VideoGuide) this.instance).setVideoPoint(c12396b.build());
            return this;
        }

        public C12390b addMaterial(Material.C12325b c12325b) {
            copyOnWrite();
            ((VideoGuide) this.instance).addMaterial(c12325b.build());
            return this;
        }

        public C12390b addMaterial(int i, Material.C12325b c12325b) {
            copyOnWrite();
            ((VideoGuide) this.instance).addMaterial(i, c12325b.build());
            return this;
        }
    }

    static {
        VideoGuide videoGuide = new VideoGuide();
        DEFAULT_INSTANCE = videoGuide;
        GeneratedMessageLite.registerDefaultInstance(VideoGuide.class, videoGuide);
    }

    private VideoGuide() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaterial(Iterable<? extends Material> iterable) {
        ensureMaterialIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.material_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterial(Material material) {
        material.getClass();
        ensureMaterialIsMutable();
        this.material_.add(material);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContractCard() {
        this.contractCard_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterial() {
        this.material_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightMaterial() {
        this.rightMaterial_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoPoint() {
        this.videoPoint_ = null;
    }

    private void ensureMaterialIsMutable() {
        Internal.ProtobufList<Material> protobufList = this.material_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.material_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoGuide getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContractCard(ContractCard contractCard) {
        contractCard.getClass();
        ContractCard contractCard2 = this.contractCard_;
        if (contractCard2 != null && contractCard2 != ContractCard.getDefaultInstance()) {
            this.contractCard_ = ContractCard.newBuilder(this.contractCard_).mergeFrom((ContractCard) contractCard).buildPartial();
        } else {
            this.contractCard_ = contractCard;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRightMaterial(Material material) {
        material.getClass();
        Material material2 = this.rightMaterial_;
        if (material2 != null && material2 != Material.getDefaultInstance()) {
            this.rightMaterial_ = Material.newBuilder(this.rightMaterial_).mergeFrom((Material) material).buildPartial();
        } else {
            this.rightMaterial_ = material;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideoPoint(VideoViewPoint videoViewPoint) {
        videoViewPoint.getClass();
        VideoViewPoint videoViewPoint2 = this.videoPoint_;
        if (videoViewPoint2 != null && videoViewPoint2 != VideoViewPoint.getDefaultInstance()) {
            this.videoPoint_ = VideoViewPoint.newBuilder(this.videoPoint_).mergeFrom((VideoViewPoint) videoViewPoint).buildPartial();
        } else {
            this.videoPoint_ = videoViewPoint;
        }
    }

    public static C12390b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoGuide parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoGuide parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoGuide> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMaterial(int i) {
        ensureMaterialIsMutable();
        this.material_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContractCard(ContractCard contractCard) {
        contractCard.getClass();
        this.contractCard_ = contractCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterial(int i, Material material) {
        material.getClass();
        ensureMaterialIsMutable();
        this.material_.set(i, material);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightMaterial(Material material) {
        material.getClass();
        this.rightMaterial_ = material;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoPoint(VideoViewPoint videoViewPoint) {
        videoViewPoint.getClass();
        this.videoPoint_ = videoViewPoint;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12389a.f21303xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoGuide();
            case 2:
                return new C12390b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t", new Object[]{"material_", Material.class, "videoPoint_", "contractCard_", "rightMaterial_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoGuide> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoGuide.class) {
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

    public ContractCard getContractCard() {
        ContractCard contractCard = this.contractCard_;
        return contractCard == null ? ContractCard.getDefaultInstance() : contractCard;
    }

    public Material getMaterial(int i) {
        return this.material_.get(i);
    }

    public int getMaterialCount() {
        return this.material_.size();
    }

    public List<Material> getMaterialList() {
        return this.material_;
    }

    public InterfaceC12411c getMaterialOrBuilder(int i) {
        return this.material_.get(i);
    }

    public List<? extends InterfaceC12411c> getMaterialOrBuilderList() {
        return this.material_;
    }

    public Material getRightMaterial() {
        Material material = this.rightMaterial_;
        return material == null ? Material.getDefaultInstance() : material;
    }

    public VideoViewPoint getVideoPoint() {
        VideoViewPoint videoViewPoint = this.videoPoint_;
        return videoViewPoint == null ? VideoViewPoint.getDefaultInstance() : videoViewPoint;
    }

    public boolean hasContractCard() {
        return this.contractCard_ != null;
    }

    public boolean hasRightMaterial() {
        return this.rightMaterial_ != null;
    }

    public boolean hasVideoPoint() {
        return this.videoPoint_ != null;
    }

    public static C12390b newBuilder(VideoGuide videoGuide) {
        return DEFAULT_INSTANCE.createBuilder(videoGuide);
    }

    public static VideoGuide parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterial(int i, Material material) {
        material.getClass();
        ensureMaterialIsMutable();
        this.material_.add(i, material);
    }

    public static VideoGuide parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoGuide parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(InputStream inputStream) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoGuide parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoGuide parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoGuide parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoGuide) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
