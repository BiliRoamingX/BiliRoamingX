package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class OgvSeasons extends GeneratedMessageLite<OgvSeasons, OgvSeasons.Builder> implements MessageLiteOrBuilder {
    private static final OgvSeasons DEFAULT_INSTANCE;
    private static volatile Parser<OgvSeasons> PARSER = null;
    public static final int SERIAL_SEASON_FIELD_NUMBER = 2;
    public static final int STYLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int style_;
    private String title_ = "";
    private Internal.ProtobufList<SerialSeason> serialSeason_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.OgvSeasons$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17004xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17004xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17004xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17004xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17004xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OgvSeasons, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70231 c70231) {
            this();
        }

        public Builder addAllSerialSeason(Iterable<? extends SerialSeason> iterable) {
            copyOnWrite();
            ((OgvSeasons) this.instance).addAllSerialSeason(iterable);
            return this;
        }

        public Builder addSerialSeason(SerialSeason serialSeason) {
            copyOnWrite();
            ((OgvSeasons) this.instance).addSerialSeason(serialSeason);
            return this;
        }

        public Builder clearSerialSeason() {
            copyOnWrite();
            ((OgvSeasons) this.instance).clearSerialSeason();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((OgvSeasons) this.instance).clearStyle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((OgvSeasons) this.instance).clearTitle();
            return this;
        }

        public SerialSeason getSerialSeason(int i) {
            return ((OgvSeasons) this.instance).getSerialSeason(i);
        }

        public int getSerialSeasonCount() {
            return ((OgvSeasons) this.instance).getSerialSeasonCount();
        }

        public List<SerialSeason> getSerialSeasonList() {
            return Collections.unmodifiableList(((OgvSeasons) this.instance).getSerialSeasonList());
        }

        public SerialSeasonCoverStyle getStyle() {
            return ((OgvSeasons) this.instance).getStyle();
        }

        public int getStyleValue() {
            return ((OgvSeasons) this.instance).getStyleValue();
        }

        public String getTitle() {
            return ((OgvSeasons) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OgvSeasons) this.instance).getTitleBytes();
        }

        public Builder removeSerialSeason(int i) {
            copyOnWrite();
            ((OgvSeasons) this.instance).removeSerialSeason(i);
            return this;
        }

        public Builder setSerialSeason(int i, SerialSeason serialSeason) {
            copyOnWrite();
            ((OgvSeasons) this.instance).setSerialSeason(i, serialSeason);
            return this;
        }

        public Builder setStyle(SerialSeasonCoverStyle serialSeasonCoverStyle) {
            copyOnWrite();
            ((OgvSeasons) this.instance).setStyle(serialSeasonCoverStyle);
            return this;
        }

        public Builder setStyleValue(int i) {
            copyOnWrite();
            ((OgvSeasons) this.instance).setStyleValue(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((OgvSeasons) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvSeasons) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(OgvSeasons.DEFAULT_INSTANCE);
        }

        public Builder addSerialSeason(int i, SerialSeason serialSeason) {
            copyOnWrite();
            ((OgvSeasons) this.instance).addSerialSeason(i, serialSeason);
            return this;
        }

        public Builder setSerialSeason(int i, SerialSeason.Builder builder) {
            copyOnWrite();
            ((OgvSeasons) this.instance).setSerialSeason(i, builder.build());
            return this;
        }

        public Builder addSerialSeason(SerialSeason.Builder builder) {
            copyOnWrite();
            ((OgvSeasons) this.instance).addSerialSeason(builder.build());
            return this;
        }

        public Builder addSerialSeason(int i, SerialSeason.Builder builder) {
            copyOnWrite();
            ((OgvSeasons) this.instance).addSerialSeason(i, builder.build());
            return this;
        }
    }

    static {
        OgvSeasons ogvSeasons = new OgvSeasons();
        DEFAULT_INSTANCE = ogvSeasons;
        GeneratedMessageLite.registerDefaultInstance(OgvSeasons.class, ogvSeasons);
    }

    public OgvSeasons() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSerialSeason(Iterable<? extends SerialSeason> iterable) {
        ensureSerialSeasonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.serialSeason_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSerialSeason(SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSerialSeasonIsMutable();
        this.serialSeason_.add(serialSeason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSerialSeason() {
        this.serialSeason_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureSerialSeasonIsMutable() {
        Internal.ProtobufList<SerialSeason> protobufList = this.serialSeason_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.serialSeason_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static OgvSeasons getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OgvSeasons parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OgvSeasons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvSeasons parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OgvSeasons> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSerialSeason(int i) {
        ensureSerialSeasonIsMutable();
        this.serialSeason_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSerialSeason(int i, SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSerialSeasonIsMutable();
        this.serialSeason_.set(i, serialSeason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(SerialSeasonCoverStyle serialSeasonCoverStyle) {
        this.style_ = serialSeasonCoverStyle.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleValue(int i) {
        this.style_ = i;
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
        switch (C70231.f17004xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OgvSeasons();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\f", new Object[]{"title_", "serialSeason_", SerialSeason.class, "style_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OgvSeasons> parser = PARSER;
                if (parser == null) {
                    synchronized (OgvSeasons.class) {
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

    public SerialSeason getSerialSeason(int i) {
        return this.serialSeason_.get(i);
    }

    public int getSerialSeasonCount() {
        return this.serialSeason_.size();
    }

    public List<SerialSeason> getSerialSeasonList() {
        return this.serialSeason_;
    }

    public SerialSeasonOrBuilder getSerialSeasonOrBuilder(int i) {
        return this.serialSeason_.get(i);
    }

    public List<? extends SerialSeasonOrBuilder> getSerialSeasonOrBuilderList() {
        return this.serialSeason_;
    }

    public SerialSeasonCoverStyle getStyle() {
        SerialSeasonCoverStyle forNumber = SerialSeasonCoverStyle.forNumber(this.style_);
        return forNumber == null ? SerialSeasonCoverStyle.UNRECOGNIZED : forNumber;
    }

    public int getStyleValue() {
        return this.style_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(OgvSeasons ogvSeasons) {
        return DEFAULT_INSTANCE.createBuilder(ogvSeasons);
    }

    public static OgvSeasons parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvSeasons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvSeasons parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OgvSeasons parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSerialSeason(int i, SerialSeason serialSeason) {
        serialSeason.getClass();
        ensureSerialSeasonIsMutable();
        this.serialSeason_.add(i, serialSeason);
    }

    public static OgvSeasons parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OgvSeasons parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OgvSeasons parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OgvSeasons parseFrom(InputStream inputStream) throws IOException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvSeasons parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvSeasons parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OgvSeasons parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvSeasons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
