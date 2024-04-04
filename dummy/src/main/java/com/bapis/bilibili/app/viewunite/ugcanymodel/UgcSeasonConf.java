package com.bapis.bilibili.app.viewunite.ugcanymodel;

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
/* loaded from: classes21.dex */
public final class UgcSeasonConf extends GeneratedMessageLite<UgcSeasonConf, UgcSeasonConf.b> implements MessageLiteOrBuilder {
    private static final UgcSeasonConf DEFAULT_INSTANCE;
    public static final int FOLD_TIME_FIELD_NUMBER = 2;
    private static volatile Parser<UgcSeasonConf> PARSER = null;
    public static final int SEASON_UNFOLD_FIELD_NUMBER = 1;
    private long foldTime_;
    private boolean seasonUnfold_;

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<UgcSeasonConf, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearFoldTime() {
            copyOnWrite();
            ((UgcSeasonConf) this.instance).clearFoldTime();
            return this;
        }

        public b clearSeasonUnfold() {
            copyOnWrite();
            ((UgcSeasonConf) this.instance).clearSeasonUnfold();
            return this;
        }

        public long getFoldTime() {
            return ((UgcSeasonConf) this.instance).getFoldTime();
        }

        public boolean getSeasonUnfold() {
            return ((UgcSeasonConf) this.instance).getSeasonUnfold();
        }

        public b setFoldTime(long j2) {
            copyOnWrite();
            ((UgcSeasonConf) this.instance).setFoldTime(j2);
            return this;
        }

        public b setSeasonUnfold(boolean z) {
            copyOnWrite();
            ((UgcSeasonConf) this.instance).setSeasonUnfold(z);
            return this;
        }

        private b() {
            super(UgcSeasonConf.DEFAULT_INSTANCE);
        }
    }

    static {
        UgcSeasonConf ugcSeasonConf = new UgcSeasonConf();
        DEFAULT_INSTANCE = ugcSeasonConf;
        GeneratedMessageLite.registerDefaultInstance(UgcSeasonConf.class, ugcSeasonConf);
    }

    private UgcSeasonConf() {
    }

    public void clearFoldTime() {
        this.foldTime_ = 0L;
    }

    public void clearSeasonUnfold() {
        this.seasonUnfold_ = false;
    }

    public static UgcSeasonConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcSeasonConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcSeasonConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setFoldTime(long j2) {
        this.foldTime_ = j2;
    }

    public void setSeasonUnfold(boolean z) {
        this.seasonUnfold_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcSeasonConf();
            case 2:
                return new b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0002", new Object[]{"seasonUnfold_", "foldTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcSeasonConf> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcSeasonConf.class) {
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

    public long getFoldTime() {
        return this.foldTime_;
    }

    public boolean getSeasonUnfold() {
        return this.seasonUnfold_;
    }

    public static b newBuilder(UgcSeasonConf ugcSeasonConf) {
        return DEFAULT_INSTANCE.createBuilder(ugcSeasonConf);
    }

    public static UgcSeasonConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcSeasonConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UgcSeasonConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcSeasonConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcSeasonConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcSeasonConf parseFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcSeasonConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
