package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class SeasonReply extends GeneratedMessageLite<SeasonReply, SeasonReply.Builder> implements MessageLiteOrBuilder {
    private static final SeasonReply DEFAULT_INSTANCE;
    private static volatile Parser<SeasonReply> PARSER = null;
    public static final int SEASON_FIELD_NUMBER = 1;
    private UgcSeason season_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SeasonReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68541 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16814xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16814xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16814xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16814xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16814xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16814xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16814xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16814xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68541 c68541) {
            this();
        }

        public Builder clearSeason() {
            copyOnWrite();
            ((SeasonReply) this.instance).clearSeason();
            return this;
        }

        public UgcSeason getSeason() {
            return ((SeasonReply) this.instance).getSeason();
        }

        public boolean hasSeason() {
            return ((SeasonReply) this.instance).hasSeason();
        }

        public Builder mergeSeason(UgcSeason ugcSeason) {
            copyOnWrite();
            ((SeasonReply) this.instance).mergeSeason(ugcSeason);
            return this;
        }

        public Builder setSeason(UgcSeason ugcSeason) {
            copyOnWrite();
            ((SeasonReply) this.instance).setSeason(ugcSeason);
            return this;
        }

        private Builder() {
            super(SeasonReply.DEFAULT_INSTANCE);
        }

        public Builder setSeason(UgcSeason.Builder builder) {
            copyOnWrite();
            ((SeasonReply) this.instance).setSeason(builder.build());
            return this;
        }
    }

    static {
        SeasonReply seasonReply = new SeasonReply();
        DEFAULT_INSTANCE = seasonReply;
        GeneratedMessageLite.registerDefaultInstance(SeasonReply.class, seasonReply);
    }

    private SeasonReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeason() {
        this.season_ = null;
    }

    public static SeasonReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeason(UgcSeason ugcSeason) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeason(UgcSeason ugcSeason) {
        ugcSeason.getClass();
        this.season_ = ugcSeason;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68541.f16814xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"season_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonReply> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonReply.class) {
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

    public UgcSeason getSeason() {
        UgcSeason ugcSeason = this.season_;
        return ugcSeason == null ? UgcSeason.getDefaultInstance() : ugcSeason;
    }

    public boolean hasSeason() {
        return this.season_ != null;
    }

    public static Builder newBuilder(SeasonReply seasonReply) {
        return DEFAULT_INSTANCE.createBuilder(seasonReply);
    }

    public static SeasonReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonReply parseFrom(InputStream inputStream) throws IOException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
