package com.bapis.bilibili.app.viewunite.v1;

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
public final class ChargingPlus extends GeneratedMessageLite<ChargingPlus, ChargingPlus.Builder> implements MessageLiteOrBuilder {
    private static final ChargingPlus DEFAULT_INSTANCE;
    private static volatile Parser<ChargingPlus> PARSER = null;
    public static final int PASS_FIELD_NUMBER = 1;
    public static final int PLAY_TOAST_FIELD_NUMBER = 2;
    private boolean pass_;
    private Internal.ProtobufList<PlayToast> playToast_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ChargingPlus$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17098xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17098xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ChargingPlus, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71231 c71231) {
            this();
        }

        public Builder addAllPlayToast(Iterable<? extends PlayToast> iterable) {
            copyOnWrite();
            ((ChargingPlus) this.instance).addAllPlayToast(iterable);
            return this;
        }

        public Builder addPlayToast(PlayToast playToast) {
            copyOnWrite();
            ((ChargingPlus) this.instance).addPlayToast(playToast);
            return this;
        }

        public Builder clearPass() {
            copyOnWrite();
            ((ChargingPlus) this.instance).clearPass();
            return this;
        }

        public Builder clearPlayToast() {
            copyOnWrite();
            ((ChargingPlus) this.instance).clearPlayToast();
            return this;
        }

        public boolean getPass() {
            return ((ChargingPlus) this.instance).getPass();
        }

        public PlayToast getPlayToast(int i) {
            return ((ChargingPlus) this.instance).getPlayToast(i);
        }

        public int getPlayToastCount() {
            return ((ChargingPlus) this.instance).getPlayToastCount();
        }

        public List<PlayToast> getPlayToastList() {
            return Collections.unmodifiableList(((ChargingPlus) this.instance).getPlayToastList());
        }

        public Builder removePlayToast(int i) {
            copyOnWrite();
            ((ChargingPlus) this.instance).removePlayToast(i);
            return this;
        }

        public Builder setPass(boolean z) {
            copyOnWrite();
            ((ChargingPlus) this.instance).setPass(z);
            return this;
        }

        public Builder setPlayToast(int i, PlayToast playToast) {
            copyOnWrite();
            ((ChargingPlus) this.instance).setPlayToast(i, playToast);
            return this;
        }

        private Builder() {
            super(ChargingPlus.DEFAULT_INSTANCE);
        }

        public Builder addPlayToast(int i, PlayToast playToast) {
            copyOnWrite();
            ((ChargingPlus) this.instance).addPlayToast(i, playToast);
            return this;
        }

        public Builder setPlayToast(int i, PlayToast.Builder builder) {
            copyOnWrite();
            ((ChargingPlus) this.instance).setPlayToast(i, builder.build());
            return this;
        }

        public Builder addPlayToast(PlayToast.Builder builder) {
            copyOnWrite();
            ((ChargingPlus) this.instance).addPlayToast(builder.build());
            return this;
        }

        public Builder addPlayToast(int i, PlayToast.Builder builder) {
            copyOnWrite();
            ((ChargingPlus) this.instance).addPlayToast(i, builder.build());
            return this;
        }
    }

    static {
        ChargingPlus chargingPlus = new ChargingPlus();
        DEFAULT_INSTANCE = chargingPlus;
        GeneratedMessageLite.registerDefaultInstance(ChargingPlus.class, chargingPlus);
    }

    private ChargingPlus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPlayToast(Iterable<? extends PlayToast> iterable) {
        ensurePlayToastIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.playToast_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayToast(PlayToast playToast) {
        playToast.getClass();
        ensurePlayToastIsMutable();
        this.playToast_.add(playToast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPass() {
        this.pass_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayToast() {
        this.playToast_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePlayToastIsMutable() {
        Internal.ProtobufList<PlayToast> protobufList = this.playToast_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.playToast_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ChargingPlus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChargingPlus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChargingPlus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ChargingPlus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePlayToast(int i) {
        ensurePlayToastIsMutable();
        this.playToast_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPass(boolean z) {
        this.pass_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayToast(int i, PlayToast playToast) {
        playToast.getClass();
        ensurePlayToastIsMutable();
        this.playToast_.set(i, playToast);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71231.f17098xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ChargingPlus();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002\u001b", new Object[]{"pass_", "playToast_", PlayToast.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChargingPlus> parser = PARSER;
                if (parser == null) {
                    synchronized (ChargingPlus.class) {
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

    public boolean getPass() {
        return this.pass_;
    }

    public PlayToast getPlayToast(int i) {
        return this.playToast_.get(i);
    }

    public int getPlayToastCount() {
        return this.playToast_.size();
    }

    public List<PlayToast> getPlayToastList() {
        return this.playToast_;
    }

    public PlayToastOrBuilder getPlayToastOrBuilder(int i) {
        return this.playToast_.get(i);
    }

    public List<? extends PlayToastOrBuilder> getPlayToastOrBuilderList() {
        return this.playToast_;
    }

    public static Builder newBuilder(ChargingPlus chargingPlus) {
        return DEFAULT_INSTANCE.createBuilder(chargingPlus);
    }

    public static ChargingPlus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayToast(int i, PlayToast playToast) {
        playToast.getClass();
        ensurePlayToastIsMutable();
        this.playToast_.add(i, playToast);
    }

    public static ChargingPlus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChargingPlus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(InputStream inputStream) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChargingPlus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChargingPlus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
