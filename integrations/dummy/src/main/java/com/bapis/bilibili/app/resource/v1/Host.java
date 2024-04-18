package com.bapis.bilibili.app.resource.v1;

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
/* loaded from: classes15.dex */
public final class Host extends GeneratedMessageLite<Host, Host.Builder> implements MessageLiteOrBuilder {
    public static final int BFS_FIELD_NUMBER = 2;
    public static final int BOSS_FIELD_NUMBER = 1;
    private static final Host DEFAULT_INSTANCE;
    private static volatile Parser<Host> PARSER;
    private String boss_ = "";
    private String bfs_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.resource.v1.Host$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C65621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16587xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16587xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16587xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16587xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16587xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16587xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16587xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16587xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Host, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65621 c65621) {
            this();
        }

        public Builder clearBfs() {
            copyOnWrite();
            ((Host) this.instance).clearBfs();
            return this;
        }

        public Builder clearBoss() {
            copyOnWrite();
            ((Host) this.instance).clearBoss();
            return this;
        }

        public String getBfs() {
            return ((Host) this.instance).getBfs();
        }

        public ByteString getBfsBytes() {
            return ((Host) this.instance).getBfsBytes();
        }

        public String getBoss() {
            return ((Host) this.instance).getBoss();
        }

        public ByteString getBossBytes() {
            return ((Host) this.instance).getBossBytes();
        }

        public Builder setBfs(String str) {
            copyOnWrite();
            ((Host) this.instance).setBfs(str);
            return this;
        }

        public Builder setBfsBytes(ByteString byteString) {
            copyOnWrite();
            ((Host) this.instance).setBfsBytes(byteString);
            return this;
        }

        public Builder setBoss(String str) {
            copyOnWrite();
            ((Host) this.instance).setBoss(str);
            return this;
        }

        public Builder setBossBytes(ByteString byteString) {
            copyOnWrite();
            ((Host) this.instance).setBossBytes(byteString);
            return this;
        }

        private Builder() {
            super(Host.DEFAULT_INSTANCE);
        }
    }

    static {
        Host host2 = new Host();
        DEFAULT_INSTANCE = host2;
        GeneratedMessageLite.registerDefaultInstance(Host.class, host2);
    }

    private Host() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBfs() {
        this.bfs_ = getDefaultInstance().getBfs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoss() {
        this.boss_ = getDefaultInstance().getBoss();
    }

    public static Host getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Host parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Host) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Host parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Host> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBfs(String str) {
        str.getClass();
        this.bfs_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBfsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bfs_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoss(String str) {
        str.getClass();
        this.boss_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBossBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.boss_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65621.f16587xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Host();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"boss_", "bfs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Host> parser = PARSER;
                if (parser == null) {
                    synchronized (Host.class) {
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

    public String getBfs() {
        return this.bfs_;
    }

    public ByteString getBfsBytes() {
        return ByteString.copyFromUtf8(this.bfs_);
    }

    public String getBoss() {
        return this.boss_;
    }

    public ByteString getBossBytes() {
        return ByteString.copyFromUtf8(this.boss_);
    }

    public static Builder newBuilder(Host host2) {
        return DEFAULT_INSTANCE.createBuilder(host2);
    }

    public static Host parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Host) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Host parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Host parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Host parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Host parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Host parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Host parseFrom(InputStream inputStream) throws IOException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Host parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Host parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Host parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Host) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
