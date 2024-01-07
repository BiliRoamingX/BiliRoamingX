package com.bapis.bilibili.app.distribution.setting.search;

import com.bapis.bilibili.app.distribution.BoolValue;
import com.bapis.bilibili.app.distribution.Int64Value;
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
public final class SearchAutoPlay extends GeneratedMessageLite<SearchAutoPlay, SearchAutoPlay.C8395b> implements MessageLiteOrBuilder {
    public static final int AFFECTED_BY_SERVER_SIDE_FIELD_NUMBER = 2;
    private static final SearchAutoPlay DEFAULT_INSTANCE;
    private static volatile Parser<SearchAutoPlay> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private BoolValue affectedByServerSide_;
    private Int64Value value_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.search.SearchAutoPlay$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8394a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19951xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19951xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19951xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19951xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19951xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19951xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19951xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19951xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.search.SearchAutoPlay$b */
    /* loaded from: classes13.dex */
    public static final class C8395b extends GeneratedMessageLite.Builder<SearchAutoPlay, C8395b> implements MessageLiteOrBuilder {
        /* synthetic */ C8395b(C8394a c8394a) {
            this();
        }

        public C8395b clearAffectedByServerSide() {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).clearAffectedByServerSide();
            return this;
        }

        public C8395b clearValue() {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).clearValue();
            return this;
        }

        public BoolValue getAffectedByServerSide() {
            return ((SearchAutoPlay) this.instance).getAffectedByServerSide();
        }

        public Int64Value getValue() {
            return ((SearchAutoPlay) this.instance).getValue();
        }

        public boolean hasAffectedByServerSide() {
            return ((SearchAutoPlay) this.instance).hasAffectedByServerSide();
        }

        public boolean hasValue() {
            return ((SearchAutoPlay) this.instance).hasValue();
        }

        public C8395b mergeAffectedByServerSide(BoolValue boolValue) {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).mergeAffectedByServerSide(boolValue);
            return this;
        }

        public C8395b mergeValue(Int64Value int64Value) {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).mergeValue(int64Value);
            return this;
        }

        public C8395b setAffectedByServerSide(BoolValue boolValue) {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).setAffectedByServerSide(boolValue);
            return this;
        }

        public C8395b setValue(Int64Value int64Value) {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).setValue(int64Value);
            return this;
        }

        private C8395b() {
            super(SearchAutoPlay.DEFAULT_INSTANCE);
        }

        public C8395b setAffectedByServerSide(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).setAffectedByServerSide(c8307b.build());
            return this;
        }

        public C8395b setValue(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((SearchAutoPlay) this.instance).setValue(c8322b.build());
            return this;
        }
    }

    static {
        SearchAutoPlay searchAutoPlay = new SearchAutoPlay();
        DEFAULT_INSTANCE = searchAutoPlay;
        GeneratedMessageLite.registerDefaultInstance(SearchAutoPlay.class, searchAutoPlay);
    }

    private SearchAutoPlay() {
    }

    public void clearAffectedByServerSide() {
        this.affectedByServerSide_ = null;
    }

    public void clearValue() {
        this.value_ = null;
    }

    public static SearchAutoPlay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAffectedByServerSide(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.affectedByServerSide_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.affectedByServerSide_ = BoolValue.newBuilder(this.affectedByServerSide_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.affectedByServerSide_ = boolValue;
        }
    }

    public void mergeValue(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.value_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.value_ = Int64Value.newBuilder(this.value_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.value_ = int64Value;
        }
    }

    public static C8395b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchAutoPlay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchAutoPlay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAutoPlay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SearchAutoPlay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAffectedByServerSide(BoolValue boolValue) {
        boolValue.getClass();
        this.affectedByServerSide_ = boolValue;
    }

    public void setValue(Int64Value int64Value) {
        int64Value.getClass();
        this.value_ = int64Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8394a.f19951xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SearchAutoPlay();
            case 2:
                return new C8395b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"value_", "affectedByServerSide_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SearchAutoPlay> parser = PARSER;
                if (parser == null) {
                    synchronized (SearchAutoPlay.class) {
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

    public BoolValue getAffectedByServerSide() {
        BoolValue boolValue = this.affectedByServerSide_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public Int64Value getValue() {
        Int64Value int64Value = this.value_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public boolean hasAffectedByServerSide() {
        return this.affectedByServerSide_ != null;
    }

    public boolean hasValue() {
        return this.value_ != null;
    }

    public static C8395b newBuilder(SearchAutoPlay searchAutoPlay) {
        return DEFAULT_INSTANCE.createBuilder(searchAutoPlay);
    }

    public static SearchAutoPlay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAutoPlay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAutoPlay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SearchAutoPlay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SearchAutoPlay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SearchAutoPlay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchAutoPlay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SearchAutoPlay parseFrom(InputStream inputStream) throws IOException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchAutoPlay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SearchAutoPlay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SearchAutoPlay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SearchAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
