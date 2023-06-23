package com.bapis.bilibili.app.playerunite.v1;

import com.bapis.bilibili.playershared.VideoVod;
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
public final class PlayViewUniteReq extends GeneratedMessageLite<PlayViewUniteReq, PlayViewUniteReq.Builder> implements MessageLiteOrBuilder {
    public static final int BVID_FIELD_NUMBER = 5;
    private static final PlayViewUniteReq DEFAULT_INSTANCE;
    public static final int EXTRA_CONTENT_FIELD_NUMBER = 4;
    public static final int FROM_SPMID_FIELD_NUMBER = 3;
    private static volatile Parser<PlayViewUniteReq> PARSER = null;
    public static final int SPMID_FIELD_NUMBER = 2;
    public static final int VOD_FIELD_NUMBER = 1;
    private VideoVod vod_;
    private MapFieldLite<String, String> extraContent_ = MapFieldLite.emptyMapField();
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String bvid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16510xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16510xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16510xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16510xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16510xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16510xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16510xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16510xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayViewUniteReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64691 c64691) {
            this();
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearExtraContent() {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).getMutableExtraContentMap().clear();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearVod() {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).clearVod();
            return this;
        }

        public boolean containsExtraContent(String str) {
            str.getClass();
            return ((PlayViewUniteReq) this.instance).getExtraContentMap().containsKey(str);
        }

        public String getBvid() {
            return ((PlayViewUniteReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((PlayViewUniteReq) this.instance).getBvidBytes();
        }

        @Deprecated
        public Map<String, String> getExtraContent() {
            return getExtraContentMap();
        }

        public int getExtraContentCount() {
            return ((PlayViewUniteReq) this.instance).getExtraContentMap().size();
        }

        public Map<String, String> getExtraContentMap() {
            return Collections.unmodifiableMap(((PlayViewUniteReq) this.instance).getExtraContentMap());
        }

        public String getExtraContentOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> extraContentMap = ((PlayViewUniteReq) this.instance).getExtraContentMap();
            return extraContentMap.containsKey(str) ? extraContentMap.get(str) : str2;
        }

        public String getExtraContentOrThrow(String str) {
            str.getClass();
            Map<String, String> extraContentMap = ((PlayViewUniteReq) this.instance).getExtraContentMap();
            if (extraContentMap.containsKey(str)) {
                return extraContentMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getFromSpmid() {
            return ((PlayViewUniteReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((PlayViewUniteReq) this.instance).getFromSpmidBytes();
        }

        public String getSpmid() {
            return ((PlayViewUniteReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((PlayViewUniteReq) this.instance).getSpmidBytes();
        }

        public VideoVod getVod() {
            return ((PlayViewUniteReq) this.instance).getVod();
        }

        public boolean hasVod() {
            return ((PlayViewUniteReq) this.instance).hasVod();
        }

        public Builder mergeVod(VideoVod videoVod) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).mergeVod(videoVod);
            return this;
        }

        public Builder putAllExtraContent(Map<String, String> map) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).getMutableExtraContentMap().putAll(map);
            return this;
        }

        public Builder putExtraContent(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).getMutableExtraContentMap().put(str, str2);
            return this;
        }

        public Builder removeExtraContent(String str) {
            str.getClass();
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).getMutableExtraContentMap().remove(str);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setVod(VideoVod videoVod) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setVod(videoVod);
            return this;
        }

        private Builder() {
            super(PlayViewUniteReq.DEFAULT_INSTANCE);
        }

        public Builder setVod(VideoVod.Builder builder) {
            copyOnWrite();
            ((PlayViewUniteReq) this.instance).setVod(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class ExtraContentDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private ExtraContentDefaultEntryHolder() {
        }
    }

    static {
        PlayViewUniteReq playViewUniteReq = new PlayViewUniteReq();
        DEFAULT_INSTANCE = playViewUniteReq;
        GeneratedMessageLite.registerDefaultInstance(PlayViewUniteReq.class, playViewUniteReq);
    }

    private PlayViewUniteReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmid() {
        this.fromSpmid_ = getDefaultInstance().getFromSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVod() {
        this.vod_ = null;
    }

    public static PlayViewUniteReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableExtraContentMap() {
        return internalGetMutableExtraContent();
    }

    private MapFieldLite<String, String> internalGetExtraContent() {
        return this.extraContent_;
    }

    private MapFieldLite<String, String> internalGetMutableExtraContent() {
        if (!this.extraContent_.isMutable()) {
            this.extraContent_ = this.extraContent_.mutableCopy();
        }
        return this.extraContent_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVod(VideoVod videoVod) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayViewUniteReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewUniteReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayViewUniteReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setFromSpmid(String str) {
        str.getClass();
        this.fromSpmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSpmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVod(VideoVod videoVod) {
        videoVod.getClass();
        this.vod_ = videoVod;
    }

    public boolean containsExtraContent(String str) {
        str.getClass();
        return internalGetExtraContent().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64691.f16510xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayViewUniteReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\t\u0002\u0208\u0003\u0208\u00042\u0005\u0208", new Object[]{"vod_", "spmid_", "fromSpmid_", "extraContent_", ExtraContentDefaultEntryHolder.defaultEntry, "bvid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayViewUniteReq> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayViewUniteReq.class) {
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

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    @Deprecated
    public Map<String, String> getExtraContent() {
        return getExtraContentMap();
    }

    public int getExtraContentCount() {
        return internalGetExtraContent().size();
    }

    public Map<String, String> getExtraContentMap() {
        return Collections.unmodifiableMap(internalGetExtraContent());
    }

    public String getExtraContentOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetExtraContent = internalGetExtraContent();
        return internalGetExtraContent.containsKey(str) ? internalGetExtraContent.get(str) : str2;
    }

    public String getExtraContentOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetExtraContent = internalGetExtraContent();
        if (internalGetExtraContent.containsKey(str)) {
            return internalGetExtraContent.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getFromSpmid() {
        return this.fromSpmid_;
    }

    public ByteString getFromSpmidBytes() {
        return ByteString.copyFromUtf8(this.fromSpmid_);
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public VideoVod getVod() {
        VideoVod videoVod = this.vod_;
        return videoVod == null ? VideoVod.getDefaultInstance() : videoVod;
    }

    public boolean hasVod() {
        return this.vod_ != null;
    }

    public static Builder newBuilder(PlayViewUniteReq playViewUniteReq) {
        return DEFAULT_INSTANCE.createBuilder(playViewUniteReq);
    }

    public static PlayViewUniteReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewUniteReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayViewUniteReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayViewUniteReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayViewUniteReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayViewUniteReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayViewUniteReq parseFrom(InputStream inputStream) throws IOException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewUniteReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewUniteReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayViewUniteReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
