package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class SeasonInfo extends GeneratedMessageLite<SeasonInfo, SeasonInfo.Builder> implements MessageLiteOrBuilder {
    public static final int COVER_FIELD_NUMBER = 4;
    private static final SeasonInfo DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 7;
    private static volatile Parser<SeasonInfo> PARSER = null;
    public static final int RIGHTS_FIELD_NUMBER = 6;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    public static final int SEASON_STATUS_FIELD_NUMBER = 3;
    public static final int SEASON_TYPE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 5;
    private int mode_;
    private Rights rights_;
    private int seasonId_;
    private int seasonStatus_;
    private int seasonType_;
    private String cover_ = "";
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.SeasonInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17596xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17596xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17596xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17596xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17596xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17596xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17596xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17596xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78821 c78821) {
            this();
        }

        public Builder clearCover() {
            copyOnWrite();
            ((SeasonInfo) this.instance).clearCover();
            return this;
        }

        public Builder clearMode() {
            copyOnWrite();
            ((SeasonInfo) this.instance).clearMode();
            return this;
        }

        public Builder clearRights() {
            copyOnWrite();
            ((SeasonInfo) this.instance).clearRights();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((SeasonInfo) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSeasonStatus() {
            copyOnWrite();
            ((SeasonInfo) this.instance).clearSeasonStatus();
            return this;
        }

        public Builder clearSeasonType() {
            copyOnWrite();
            ((SeasonInfo) this.instance).clearSeasonType();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((SeasonInfo) this.instance).clearTitle();
            return this;
        }

        public String getCover() {
            return ((SeasonInfo) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((SeasonInfo) this.instance).getCoverBytes();
        }

        public int getMode() {
            return ((SeasonInfo) this.instance).getMode();
        }

        public Rights getRights() {
            return ((SeasonInfo) this.instance).getRights();
        }

        public int getSeasonId() {
            return ((SeasonInfo) this.instance).getSeasonId();
        }

        public int getSeasonStatus() {
            return ((SeasonInfo) this.instance).getSeasonStatus();
        }

        public int getSeasonType() {
            return ((SeasonInfo) this.instance).getSeasonType();
        }

        public String getTitle() {
            return ((SeasonInfo) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((SeasonInfo) this.instance).getTitleBytes();
        }

        public boolean hasRights() {
            return ((SeasonInfo) this.instance).hasRights();
        }

        public Builder mergeRights(Rights rights) {
            copyOnWrite();
            ((SeasonInfo) this.instance).mergeRights(rights);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setMode(int i) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setMode(i);
            return this;
        }

        public Builder setRights(Rights rights) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setRights(rights);
            return this;
        }

        public Builder setSeasonId(int i) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setSeasonId(i);
            return this;
        }

        public Builder setSeasonStatus(int i) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setSeasonStatus(i);
            return this;
        }

        public Builder setSeasonType(int i) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setSeasonType(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(SeasonInfo.DEFAULT_INSTANCE);
        }

        public Builder setRights(Rights.Builder builder) {
            copyOnWrite();
            ((SeasonInfo) this.instance).setRights(builder.build());
            return this;
        }
    }

    static {
        SeasonInfo seasonInfo = new SeasonInfo();
        DEFAULT_INSTANCE = seasonInfo;
        GeneratedMessageLite.registerDefaultInstance(SeasonInfo.class, seasonInfo);
    }

    public SeasonInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRights() {
        this.rights_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonStatus() {
        this.seasonStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonType() {
        this.seasonType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static SeasonInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRights(Rights rights) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMode(int i) {
        this.mode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRights(Rights rights) {
        rights.getClass();
        this.rights_ = rights;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(int i) {
        this.seasonId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonStatus(int i) {
        this.seasonStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonType(int i) {
        this.seasonType_ = i;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78821.f17596xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0208\u0005\u0208\u0006\t\u0007\u0004", new Object[]{"seasonId_", "seasonType_", "seasonStatus_", "cover_", "title_", "rights_", "mode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonInfo.class) {
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

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public int getMode() {
        return this.mode_;
    }

    public Rights getRights() {
        Rights rights = this.rights_;
        return rights == null ? Rights.getDefaultInstance() : rights;
    }

    public int getSeasonId() {
        return this.seasonId_;
    }

    public int getSeasonStatus() {
        return this.seasonStatus_;
    }

    public int getSeasonType() {
        return this.seasonType_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public boolean hasRights() {
        return this.rights_ != null;
    }

    public static Builder newBuilder(SeasonInfo seasonInfo) {
        return DEFAULT_INSTANCE.createBuilder(seasonInfo);
    }

    public static SeasonInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonInfo parseFrom(InputStream inputStream) throws IOException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
