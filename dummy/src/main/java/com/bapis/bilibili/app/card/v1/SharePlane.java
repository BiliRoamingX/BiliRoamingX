package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class SharePlane extends GeneratedMessageLite<SharePlane, SharePlane.C5857b> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 5;
    public static final int AUTHOR_FIELD_NUMBER = 8;
    public static final int AUTHOR_ID_FIELD_NUMBER = 9;
    public static final int BVID_FIELD_NUMBER = 6;
    public static final int COVER_FIELD_NUMBER = 4;
    private static final SharePlane DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 3;
    public static final int FIRST_CID_FIELD_NUMBER = 12;
    private static volatile Parser<SharePlane> PARSER = null;
    public static final int PLAY_NUMBER_FIELD_NUMBER = 11;
    public static final int SHARE_SUBTITLE_FIELD_NUMBER = 2;
    public static final int SHARE_TO_FIELD_NUMBER = 7;
    public static final int SHORT_LINK_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 1;
    private long aid_;
    private long authorId_;
    private long firstCid_;
    private MapFieldLite<String, Boolean> shareTo_ = MapFieldLite.emptyMapField();
    private String title_ = "";
    private String shareSubtitle_ = "";
    private String desc_ = "";
    private String cover_ = "";
    private String bvid_ = "";
    private String author_ = "";
    private String shortLink_ = "";
    private String playNumber_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.SharePlane$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5856a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15977xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15977xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15977xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15977xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15977xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15977xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15977xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15977xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.SharePlane$b */
    /* loaded from: classes13.dex */
    public static final class C5857b extends GeneratedMessageLite.Builder<SharePlane, C5857b> implements MessageLiteOrBuilder {
        /* synthetic */ C5857b(C5856a c5856a) {
            this();
        }

        public C5857b clearAid() {
            copyOnWrite();
            ((SharePlane) this.instance).clearAid();
            return this;
        }

        public C5857b clearAuthor() {
            copyOnWrite();
            ((SharePlane) this.instance).clearAuthor();
            return this;
        }

        public C5857b clearAuthorId() {
            copyOnWrite();
            ((SharePlane) this.instance).clearAuthorId();
            return this;
        }

        public C5857b clearBvid() {
            copyOnWrite();
            ((SharePlane) this.instance).clearBvid();
            return this;
        }

        public C5857b clearCover() {
            copyOnWrite();
            ((SharePlane) this.instance).clearCover();
            return this;
        }

        public C5857b clearDesc() {
            copyOnWrite();
            ((SharePlane) this.instance).clearDesc();
            return this;
        }

        public C5857b clearFirstCid() {
            copyOnWrite();
            ((SharePlane) this.instance).clearFirstCid();
            return this;
        }

        public C5857b clearPlayNumber() {
            copyOnWrite();
            ((SharePlane) this.instance).clearPlayNumber();
            return this;
        }

        public C5857b clearShareSubtitle() {
            copyOnWrite();
            ((SharePlane) this.instance).clearShareSubtitle();
            return this;
        }

        public C5857b clearShareTo() {
            copyOnWrite();
            ((SharePlane) this.instance).getMutableShareToMap().clear();
            return this;
        }

        public C5857b clearShortLink() {
            copyOnWrite();
            ((SharePlane) this.instance).clearShortLink();
            return this;
        }

        public C5857b clearTitle() {
            copyOnWrite();
            ((SharePlane) this.instance).clearTitle();
            return this;
        }

        public boolean containsShareTo(String str) {
            str.getClass();
            return ((SharePlane) this.instance).getShareToMap().containsKey(str);
        }

        public long getAid() {
            return ((SharePlane) this.instance).getAid();
        }

        public String getAuthor() {
            return ((SharePlane) this.instance).getAuthor();
        }

        public ByteString getAuthorBytes() {
            return ((SharePlane) this.instance).getAuthorBytes();
        }

        public long getAuthorId() {
            return ((SharePlane) this.instance).getAuthorId();
        }

        public String getBvid() {
            return ((SharePlane) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((SharePlane) this.instance).getBvidBytes();
        }

        public String getCover() {
            return ((SharePlane) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((SharePlane) this.instance).getCoverBytes();
        }

        public String getDesc() {
            return ((SharePlane) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((SharePlane) this.instance).getDescBytes();
        }

        public long getFirstCid() {
            return ((SharePlane) this.instance).getFirstCid();
        }

        public String getPlayNumber() {
            return ((SharePlane) this.instance).getPlayNumber();
        }

        public ByteString getPlayNumberBytes() {
            return ((SharePlane) this.instance).getPlayNumberBytes();
        }

        public String getShareSubtitle() {
            return ((SharePlane) this.instance).getShareSubtitle();
        }

        public ByteString getShareSubtitleBytes() {
            return ((SharePlane) this.instance).getShareSubtitleBytes();
        }

        @Deprecated
        public Map<String, Boolean> getShareTo() {
            return getShareToMap();
        }

        public int getShareToCount() {
            return ((SharePlane) this.instance).getShareToMap().size();
        }

        public Map<String, Boolean> getShareToMap() {
            return Collections.unmodifiableMap(((SharePlane) this.instance).getShareToMap());
        }

        public boolean getShareToOrDefault(String str, boolean z) {
            str.getClass();
            Map<String, Boolean> shareToMap = ((SharePlane) this.instance).getShareToMap();
            return shareToMap.containsKey(str) ? shareToMap.get(str).booleanValue() : z;
        }

        public boolean getShareToOrThrow(String str) {
            str.getClass();
            Map<String, Boolean> shareToMap = ((SharePlane) this.instance).getShareToMap();
            if (shareToMap.containsKey(str)) {
                return shareToMap.get(str).booleanValue();
            }
            throw new IllegalArgumentException();
        }

        public String getShortLink() {
            return ((SharePlane) this.instance).getShortLink();
        }

        public ByteString getShortLinkBytes() {
            return ((SharePlane) this.instance).getShortLinkBytes();
        }

        public String getTitle() {
            return ((SharePlane) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((SharePlane) this.instance).getTitleBytes();
        }

        public C5857b putAllShareTo(Map<String, Boolean> map) {
            copyOnWrite();
            ((SharePlane) this.instance).getMutableShareToMap().putAll(map);
            return this;
        }

        public C5857b putShareTo(String str, boolean z) {
            str.getClass();
            copyOnWrite();
            ((SharePlane) this.instance).getMutableShareToMap().put(str, Boolean.valueOf(z));
            return this;
        }

        public C5857b removeShareTo(String str) {
            str.getClass();
            copyOnWrite();
            ((SharePlane) this.instance).getMutableShareToMap().remove(str);
            return this;
        }

        public C5857b setAid(long j) {
            copyOnWrite();
            ((SharePlane) this.instance).setAid(j);
            return this;
        }

        public C5857b setAuthor(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setAuthor(str);
            return this;
        }

        public C5857b setAuthorBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setAuthorBytes(byteString);
            return this;
        }

        public C5857b setAuthorId(long j) {
            copyOnWrite();
            ((SharePlane) this.instance).setAuthorId(j);
            return this;
        }

        public C5857b setBvid(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setBvid(str);
            return this;
        }

        public C5857b setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setBvidBytes(byteString);
            return this;
        }

        public C5857b setCover(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setCover(str);
            return this;
        }

        public C5857b setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setCoverBytes(byteString);
            return this;
        }

        public C5857b setDesc(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setDesc(str);
            return this;
        }

        public C5857b setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setDescBytes(byteString);
            return this;
        }

        public C5857b setFirstCid(long j) {
            copyOnWrite();
            ((SharePlane) this.instance).setFirstCid(j);
            return this;
        }

        public C5857b setPlayNumber(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setPlayNumber(str);
            return this;
        }

        public C5857b setPlayNumberBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setPlayNumberBytes(byteString);
            return this;
        }

        public C5857b setShareSubtitle(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setShareSubtitle(str);
            return this;
        }

        public C5857b setShareSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setShareSubtitleBytes(byteString);
            return this;
        }

        public C5857b setShortLink(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setShortLink(str);
            return this;
        }

        public C5857b setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public C5857b setTitle(String str) {
            copyOnWrite();
            ((SharePlane) this.instance).setTitle(str);
            return this;
        }

        public C5857b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SharePlane) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C5857b() {
            super(SharePlane.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.SharePlane$c */
    /* loaded from: classes13.dex */
    private static final class C5858c {
        static final MapEntryLite<String, Boolean> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BOOL, Boolean.FALSE);

        private C5858c() {
        }
    }

    static {
        SharePlane sharePlane = new SharePlane();
        DEFAULT_INSTANCE = sharePlane;
        GeneratedMessageLite.registerDefaultInstance(SharePlane.class, sharePlane);
    }

    private SharePlane() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthor() {
        this.author_ = getDefaultInstance().getAuthor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorId() {
        this.authorId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstCid() {
        this.firstCid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayNumber() {
        this.playNumber_ = getDefaultInstance().getPlayNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareSubtitle() {
        this.shareSubtitle_ = getDefaultInstance().getShareSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortLink() {
        this.shortLink_ = getDefaultInstance().getShortLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static SharePlane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Boolean> getMutableShareToMap() {
        return internalGetMutableShareTo();
    }

    private MapFieldLite<String, Boolean> internalGetMutableShareTo() {
        if (!this.shareTo_.isMutable()) {
            this.shareTo_ = this.shareTo_.mutableCopy();
        }
        return this.shareTo_;
    }

    private MapFieldLite<String, Boolean> internalGetShareTo() {
        return this.shareTo_;
    }

    public static C5857b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SharePlane parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SharePlane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharePlane parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SharePlane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthor(String str) {
        str.getClass();
        this.author_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.author_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorId(long j) {
        this.authorId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstCid(long j) {
        this.firstCid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayNumber(String str) {
        str.getClass();
        this.playNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playNumber_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitle(String str) {
        str.getClass();
        this.shareSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareSubtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLink(String str) {
        str.getClass();
        this.shortLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public boolean containsShareTo(String str) {
        str.getClass();
        return internalGetShareTo().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5856a.f15977xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SharePlane();
            case 2:
                return new C5857b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0208\u00072\b\u0208\t\u0002\n\u0208\u000b\u0208\f\u0002", new Object[]{"title_", "shareSubtitle_", "desc_", "cover_", "aid_", "bvid_", "shareTo_", C5858c.defaultEntry, "author_", "authorId_", "shortLink_", "playNumber_", "firstCid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SharePlane> parser = PARSER;
                if (parser == null) {
                    synchronized (SharePlane.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public String getAuthor() {
        return this.author_;
    }

    public ByteString getAuthorBytes() {
        return ByteString.copyFromUtf8(this.author_);
    }

    public long getAuthorId() {
        return this.authorId_;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public long getFirstCid() {
        return this.firstCid_;
    }

    public String getPlayNumber() {
        return this.playNumber_;
    }

    public ByteString getPlayNumberBytes() {
        return ByteString.copyFromUtf8(this.playNumber_);
    }

    public String getShareSubtitle() {
        return this.shareSubtitle_;
    }

    public ByteString getShareSubtitleBytes() {
        return ByteString.copyFromUtf8(this.shareSubtitle_);
    }

    @Deprecated
    public Map<String, Boolean> getShareTo() {
        return getShareToMap();
    }

    public int getShareToCount() {
        return internalGetShareTo().size();
    }

    public Map<String, Boolean> getShareToMap() {
        return Collections.unmodifiableMap(internalGetShareTo());
    }

    public boolean getShareToOrDefault(String str, boolean z) {
        str.getClass();
        MapFieldLite<String, Boolean> internalGetShareTo = internalGetShareTo();
        return internalGetShareTo.containsKey(str) ? internalGetShareTo.get(str).booleanValue() : z;
    }

    public boolean getShareToOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Boolean> internalGetShareTo = internalGetShareTo();
        if (internalGetShareTo.containsKey(str)) {
            return internalGetShareTo.get(str).booleanValue();
        }
        throw new IllegalArgumentException();
    }

    public String getShortLink() {
        return this.shortLink_;
    }

    public ByteString getShortLinkBytes() {
        return ByteString.copyFromUtf8(this.shortLink_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static C5857b newBuilder(SharePlane sharePlane) {
        return DEFAULT_INSTANCE.createBuilder(sharePlane);
    }

    public static SharePlane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SharePlane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SharePlane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SharePlane parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SharePlane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SharePlane parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SharePlane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SharePlane parseFrom(InputStream inputStream) throws IOException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharePlane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SharePlane parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SharePlane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SharePlane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
