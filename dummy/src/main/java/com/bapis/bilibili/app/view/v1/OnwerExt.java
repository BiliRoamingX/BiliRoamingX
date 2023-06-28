package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class OnwerExt extends GeneratedMessageLite<OnwerExt, OnwerExt.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_COUNT_FIELD_NUMBER = 6;
    public static final int ASSISTS_FIELD_NUMBER = 4;
    private static final OnwerExt DEFAULT_INSTANCE;
    public static final int FANS_FIELD_NUMBER = 5;
    public static final int LIVE_FIELD_NUMBER = 2;
    public static final int NFT_FACE_ICON_FIELD_NUMBER = 7;
    public static final int OFFICIAL_VERIFY_FIELD_NUMBER = 1;
    private static volatile Parser<OnwerExt> PARSER = null;
    public static final int VIP_FIELD_NUMBER = 3;
    private long fans_;
    private Live live_;
    private NftFaceIcon nftFaceIcon_;
    private OfficialVerify officialVerify_;
    private Vip vip_;
    private int assistsMemoizedSerializedSize = -1;
    private Internal.LongList assists_ = GeneratedMessageLite.emptyLongList();
    private String arcCount_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.OnwerExt$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16769xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16769xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16769xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16769xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16769xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16769xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16769xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16769xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OnwerExt, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68031 c68031) {
            this();
        }

        public Builder addAllAssists(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((OnwerExt) this.instance).addAllAssists(iterable);
            return this;
        }

        public Builder addAssists(long j) {
            copyOnWrite();
            ((OnwerExt) this.instance).addAssists(j);
            return this;
        }

        public Builder clearArcCount() {
            copyOnWrite();
            ((OnwerExt) this.instance).clearArcCount();
            return this;
        }

        public Builder clearAssists() {
            copyOnWrite();
            ((OnwerExt) this.instance).clearAssists();
            return this;
        }

        public Builder clearFans() {
            copyOnWrite();
            ((OnwerExt) this.instance).clearFans();
            return this;
        }

        public Builder clearLive() {
            copyOnWrite();
            ((OnwerExt) this.instance).clearLive();
            return this;
        }

        public Builder clearNftFaceIcon() {
            copyOnWrite();
            ((OnwerExt) this.instance).clearNftFaceIcon();
            return this;
        }

        public Builder clearOfficialVerify() {
            copyOnWrite();
            ((OnwerExt) this.instance).clearOfficialVerify();
            return this;
        }

        public Builder clearVip() {
            copyOnWrite();
            ((OnwerExt) this.instance).clearVip();
            return this;
        }

        public String getArcCount() {
            return ((OnwerExt) this.instance).getArcCount();
        }

        public ByteString getArcCountBytes() {
            return ((OnwerExt) this.instance).getArcCountBytes();
        }

        public long getAssists(int i) {
            return ((OnwerExt) this.instance).getAssists(i);
        }

        public int getAssistsCount() {
            return ((OnwerExt) this.instance).getAssistsCount();
        }

        public List<Long> getAssistsList() {
            return Collections.unmodifiableList(((OnwerExt) this.instance).getAssistsList());
        }

        public long getFans() {
            return ((OnwerExt) this.instance).getFans();
        }

        public Live getLive() {
            return ((OnwerExt) this.instance).getLive();
        }

        public NftFaceIcon getNftFaceIcon() {
            return ((OnwerExt) this.instance).getNftFaceIcon();
        }

        public OfficialVerify getOfficialVerify() {
            return ((OnwerExt) this.instance).getOfficialVerify();
        }

        public Vip getVip() {
            return ((OnwerExt) this.instance).getVip();
        }

        public boolean hasLive() {
            return ((OnwerExt) this.instance).hasLive();
        }

        public boolean hasNftFaceIcon() {
            return ((OnwerExt) this.instance).hasNftFaceIcon();
        }

        public boolean hasOfficialVerify() {
            return ((OnwerExt) this.instance).hasOfficialVerify();
        }

        public boolean hasVip() {
            return ((OnwerExt) this.instance).hasVip();
        }

        public Builder mergeLive(Live live) {
            copyOnWrite();
            ((OnwerExt) this.instance).mergeLive(live);
            return this;
        }

        public Builder mergeNftFaceIcon(NftFaceIcon nftFaceIcon) {
            copyOnWrite();
            ((OnwerExt) this.instance).mergeNftFaceIcon(nftFaceIcon);
            return this;
        }

        public Builder mergeOfficialVerify(OfficialVerify officialVerify) {
            copyOnWrite();
            ((OnwerExt) this.instance).mergeOfficialVerify(officialVerify);
            return this;
        }

        public Builder mergeVip(Vip vip) {
            copyOnWrite();
            ((OnwerExt) this.instance).mergeVip(vip);
            return this;
        }

        public Builder setArcCount(String str) {
            copyOnWrite();
            ((OnwerExt) this.instance).setArcCount(str);
            return this;
        }

        public Builder setArcCountBytes(ByteString byteString) {
            copyOnWrite();
            ((OnwerExt) this.instance).setArcCountBytes(byteString);
            return this;
        }

        public Builder setAssists(int i, long j) {
            copyOnWrite();
            ((OnwerExt) this.instance).setAssists(i, j);
            return this;
        }

        public Builder setFans(long j) {
            copyOnWrite();
            ((OnwerExt) this.instance).setFans(j);
            return this;
        }

        public Builder setLive(Live live) {
            copyOnWrite();
            ((OnwerExt) this.instance).setLive(live);
            return this;
        }

        public Builder setNftFaceIcon(NftFaceIcon nftFaceIcon) {
            copyOnWrite();
            ((OnwerExt) this.instance).setNftFaceIcon(nftFaceIcon);
            return this;
        }

        public Builder setOfficialVerify(OfficialVerify officialVerify) {
            copyOnWrite();
            ((OnwerExt) this.instance).setOfficialVerify(officialVerify);
            return this;
        }

        public Builder setVip(Vip vip) {
            copyOnWrite();
            ((OnwerExt) this.instance).setVip(vip);
            return this;
        }

        private Builder() {
            super(OnwerExt.DEFAULT_INSTANCE);
        }

        public Builder setLive(Live.Builder builder) {
            copyOnWrite();
            ((OnwerExt) this.instance).setLive(builder.build());
            return this;
        }

        public Builder setNftFaceIcon(NftFaceIcon.Builder builder) {
            copyOnWrite();
            ((OnwerExt) this.instance).setNftFaceIcon(builder.build());
            return this;
        }

        public Builder setOfficialVerify(OfficialVerify.Builder builder) {
            copyOnWrite();
            ((OnwerExt) this.instance).setOfficialVerify(builder.build());
            return this;
        }

        public Builder setVip(Vip.Builder builder) {
            copyOnWrite();
            ((OnwerExt) this.instance).setVip(builder.build());
            return this;
        }
    }

    static {
        OnwerExt onwerExt = new OnwerExt();
        DEFAULT_INSTANCE = onwerExt;
        GeneratedMessageLite.registerDefaultInstance(OnwerExt.class, onwerExt);
    }

    private OnwerExt() {
    }

    public void addAllAssists(Iterable<? extends Long> iterable) {
        ensureAssistsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.assists_);
    }

    public void addAssists(long j) {
        ensureAssistsIsMutable();
        this.assists_.addLong(j);
    }

    public void clearArcCount() {
        this.arcCount_ = getDefaultInstance().getArcCount();
    }

    public void clearAssists() {
        this.assists_ = GeneratedMessageLite.emptyLongList();
    }

    public void clearFans() {
        this.fans_ = 0L;
    }

    public void clearLive() {
        this.live_ = null;
    }

    public void clearNftFaceIcon() {
        this.nftFaceIcon_ = null;
    }

    public void clearOfficialVerify() {
        this.officialVerify_ = null;
    }

    public void clearVip() {
        this.vip_ = null;
    }

    private void ensureAssistsIsMutable() {
        Internal.LongList longList = this.assists_;
        if (longList.isModifiable()) {
            return;
        }
        this.assists_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static OnwerExt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeLive(Live live) {
    }

    public void mergeNftFaceIcon(NftFaceIcon nftFaceIcon) {
    }

    public void mergeOfficialVerify(OfficialVerify officialVerify) {
    }

    public void mergeVip(Vip vip) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OnwerExt parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OnwerExt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OnwerExt parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OnwerExt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setArcCount(String str) {
        str.getClass();
        this.arcCount_ = str;
    }

    public void setArcCountBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.arcCount_ = byteString.toStringUtf8();
    }

    public void setAssists(int i, long j) {
        ensureAssistsIsMutable();
        this.assists_.setLong(i, j);
    }

    public void setFans(long j) {
        this.fans_ = j;
    }

    public void setLive(Live live) {
        live.getClass();
        this.live_ = live;
    }

    public void setNftFaceIcon(NftFaceIcon nftFaceIcon) {
        nftFaceIcon.getClass();
        this.nftFaceIcon_ = nftFaceIcon;
    }

    public void setOfficialVerify(OfficialVerify officialVerify) {
        officialVerify.getClass();
        this.officialVerify_ = officialVerify;
    }

    public void setVip(Vip vip) {
        vip.getClass();
        this.vip_ = vip;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68031.f16769xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OnwerExt();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004%\u0005\u0002\u0006\u0208\u0007\t", new Object[]{"officialVerify_", "live_", "vip_", "assists_", "fans_", "arcCount_", "nftFaceIcon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OnwerExt> parser = PARSER;
                if (parser == null) {
                    synchronized (OnwerExt.class) {
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

    public String getArcCount() {
        return this.arcCount_;
    }

    public ByteString getArcCountBytes() {
        return ByteString.copyFromUtf8(this.arcCount_);
    }

    public long getAssists(int i) {
        return this.assists_.getLong(i);
    }

    public int getAssistsCount() {
        return this.assists_.size();
    }

    public List<Long> getAssistsList() {
        return this.assists_;
    }

    public long getFans() {
        return this.fans_;
    }

    public Live getLive() {
        Live live = this.live_;
        return live == null ? Live.getDefaultInstance() : live;
    }

    public NftFaceIcon getNftFaceIcon() {
        NftFaceIcon nftFaceIcon = this.nftFaceIcon_;
        return nftFaceIcon == null ? NftFaceIcon.getDefaultInstance() : nftFaceIcon;
    }

    public OfficialVerify getOfficialVerify() {
        OfficialVerify officialVerify = this.officialVerify_;
        return officialVerify == null ? OfficialVerify.getDefaultInstance() : officialVerify;
    }

    public Vip getVip() {
        Vip vip = this.vip_;
        return vip == null ? Vip.getDefaultInstance() : vip;
    }

    public boolean hasLive() {
        return this.live_ != null;
    }

    public boolean hasNftFaceIcon() {
        return this.nftFaceIcon_ != null;
    }

    public boolean hasOfficialVerify() {
        return this.officialVerify_ != null;
    }

    public boolean hasVip() {
        return this.vip_ != null;
    }

    public static Builder newBuilder(OnwerExt onwerExt) {
        return DEFAULT_INSTANCE.createBuilder(onwerExt);
    }

    public static OnwerExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OnwerExt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OnwerExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OnwerExt parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OnwerExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OnwerExt parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OnwerExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OnwerExt parseFrom(InputStream inputStream) throws IOException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OnwerExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OnwerExt parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OnwerExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OnwerExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
