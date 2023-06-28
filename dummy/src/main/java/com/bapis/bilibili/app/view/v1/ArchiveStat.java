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
public final class ArchiveStat extends GeneratedMessageLite<ArchiveStat, ArchiveStat.Builder> implements MessageLiteOrBuilder {
    private static final ArchiveStat DEFAULT_INSTANCE;
    private static volatile Parser<ArchiveStat> PARSER = null;
    public static final int VIEW_VT_FIELD_NUMBER = 11;
    private StatInfo viewVt_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ArchiveStat$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16685xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16685xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16685xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16685xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16685xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16685xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16685xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16685xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ArchiveStat, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67091 c67091) {
            this();
        }

        public Builder clearViewVt() {
            copyOnWrite();
            ((ArchiveStat) this.instance).clearViewVt();
            return this;
        }

        public StatInfo getViewVt() {
            return ((ArchiveStat) this.instance).getViewVt();
        }

        public boolean hasViewVt() {
            return ((ArchiveStat) this.instance).hasViewVt();
        }

        public Builder mergeViewVt(StatInfo statInfo) {
            copyOnWrite();
            ((ArchiveStat) this.instance).mergeViewVt(statInfo);
            return this;
        }

        public Builder setViewVt(StatInfo statInfo) {
            copyOnWrite();
            ((ArchiveStat) this.instance).setViewVt(statInfo);
            return this;
        }

        private Builder() {
            super(ArchiveStat.DEFAULT_INSTANCE);
        }

        public Builder setViewVt(StatInfo.Builder builder) {
            copyOnWrite();
            ((ArchiveStat) this.instance).setViewVt(builder.build());
            return this;
        }
    }

    static {
        ArchiveStat archiveStat = new ArchiveStat();
        DEFAULT_INSTANCE = archiveStat;
        GeneratedMessageLite.registerDefaultInstance(ArchiveStat.class, archiveStat);
    }

    private ArchiveStat() {
    }

    public void clearViewVt() {
        this.viewVt_ = null;
    }

    public static ArchiveStat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeViewVt(StatInfo statInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArchiveStat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArchiveStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArchiveStat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArchiveStat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setViewVt(StatInfo statInfo) {
        statInfo.getClass();
        this.viewVt_ = statInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67091.f16685xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArchiveStat();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u000b\u000b\u0001\u0000\u0000\u0000\u000b\t", new Object[]{"viewVt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArchiveStat> parser = PARSER;
                if (parser == null) {
                    synchronized (ArchiveStat.class) {
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

    public StatInfo getViewVt() {
        StatInfo statInfo = this.viewVt_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public boolean hasViewVt() {
        return this.viewVt_ != null;
    }

    public static Builder newBuilder(ArchiveStat archiveStat) {
        return DEFAULT_INSTANCE.createBuilder(archiveStat);
    }

    public static ArchiveStat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArchiveStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArchiveStat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArchiveStat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArchiveStat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArchiveStat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArchiveStat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArchiveStat parseFrom(InputStream inputStream) throws IOException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArchiveStat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArchiveStat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArchiveStat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArchiveStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
