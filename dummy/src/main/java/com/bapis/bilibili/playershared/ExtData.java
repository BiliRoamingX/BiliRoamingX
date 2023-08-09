package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class ExtData extends GeneratedMessageLite<ExtData, ExtData.Builder> implements MessageLiteOrBuilder {
    private static final ExtData DEFAULT_INSTANCE;
    private static volatile Parser<ExtData> PARSER = null;
    public static final int PLAY_LIST_INFO_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int dataCase_ = 0;
    private Object data_;
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.ExtData$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17900xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17900xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17900xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17900xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17900xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17900xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17900xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17900xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ExtData, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81771 c81771) {
            this();
        }

        public Builder clearData() {
            copyOnWrite();
            ((ExtData) this.instance).clearData();
            return this;
        }

        public Builder clearPlayListInfo() {
            copyOnWrite();
            ((ExtData) this.instance).clearPlayListInfo();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((ExtData) this.instance).clearType();
            return this;
        }

        public DataCase getDataCase() {
            return ((ExtData) this.instance).getDataCase();
        }

        public PlayListInfo getPlayListInfo() {
            return ((ExtData) this.instance).getPlayListInfo();
        }

        public ExtDataType getType() {
            return ((ExtData) this.instance).getType();
        }

        public int getTypeValue() {
            return ((ExtData) this.instance).getTypeValue();
        }

        public boolean hasPlayListInfo() {
            return ((ExtData) this.instance).hasPlayListInfo();
        }

        public Builder mergePlayListInfo(PlayListInfo playListInfo) {
            copyOnWrite();
            ((ExtData) this.instance).mergePlayListInfo(playListInfo);
            return this;
        }

        public Builder setPlayListInfo(PlayListInfo playListInfo) {
            copyOnWrite();
            ((ExtData) this.instance).setPlayListInfo(playListInfo);
            return this;
        }

        public Builder setType(ExtDataType extDataType) {
            copyOnWrite();
            ((ExtData) this.instance).setType(extDataType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((ExtData) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(ExtData.DEFAULT_INSTANCE);
        }

        public Builder setPlayListInfo(PlayListInfo.Builder builder) {
            copyOnWrite();
            ((ExtData) this.instance).setPlayListInfo(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public enum DataCase {
        PLAY_LIST_INFO(2),
        DATA_NOT_SET(0);
        
        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i != 0) {
                if (i != 2) {
                    return null;
                }
                return PLAY_LIST_INFO;
            }
            return DATA_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ExtData extData = new ExtData();
        DEFAULT_INSTANCE = extData;
        GeneratedMessageLite.registerDefaultInstance(ExtData.class, extData);
    }

    private ExtData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayListInfo() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static ExtData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayListInfo(PlayListInfo playListInfo) {
        playListInfo.getClass();
        if (this.dataCase_ == 2 && this.data_ != PlayListInfo.getDefaultInstance()) {
            this.data_ = PlayListInfo.newBuilder((PlayListInfo) this.data_).mergeFrom((PlayListInfo) playListInfo).buildPartial();
        } else {
            this.data_ = playListInfo;
        }
        this.dataCase_ = 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayListInfo(PlayListInfo playListInfo) {
        playListInfo.getClass();
        this.data_ = playListInfo;
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ExtDataType extDataType) {
        this.type_ = extDataType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81771.f17900xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExtData();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"data_", "dataCase_", "type_", PlayListInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtData> parser = PARSER;
                if (parser == null) {
                    synchronized (ExtData.class) {
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

    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    public PlayListInfo getPlayListInfo() {
        if (this.dataCase_ == 2) {
            return (PlayListInfo) this.data_;
        }
        return PlayListInfo.getDefaultInstance();
    }

    public ExtDataType getType() {
        ExtDataType forNumber = ExtDataType.forNumber(this.type_);
        return forNumber == null ? ExtDataType.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasPlayListInfo() {
        return this.dataCase_ == 2;
    }

    public static Builder newBuilder(ExtData extData) {
        return DEFAULT_INSTANCE.createBuilder(extData);
    }

    public static ExtData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtData parseFrom(InputStream inputStream) throws IOException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
