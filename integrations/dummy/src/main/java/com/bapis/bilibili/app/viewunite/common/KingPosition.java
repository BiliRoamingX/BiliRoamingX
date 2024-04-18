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
public final class KingPosition extends GeneratedMessageLite<KingPosition, KingPosition.Builder> implements MessageLiteOrBuilder {
    private static final KingPosition DEFAULT_INSTANCE;
    public static final int EXTEND_FIELD_NUMBER = 2;
    public static final int KING_POS_FIELD_NUMBER = 1;
    private static volatile Parser<KingPosition> PARSER;
    private Internal.ProtobufList<KingPos> kingPos_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<KingPos> extend_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.KingPosition$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16991xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16991xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16991xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16991xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16991xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16991xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16991xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16991xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KingPosition, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70071 c70071) {
            this();
        }

        public Builder addAllExtend(Iterable<? extends KingPos> iterable) {
            copyOnWrite();
            ((KingPosition) this.instance).addAllExtend(iterable);
            return this;
        }

        public Builder addAllKingPos(Iterable<? extends KingPos> iterable) {
            copyOnWrite();
            ((KingPosition) this.instance).addAllKingPos(iterable);
            return this;
        }

        public Builder addExtend(KingPos kingPos) {
            copyOnWrite();
            ((KingPosition) this.instance).addExtend(kingPos);
            return this;
        }

        public Builder addKingPos(KingPos kingPos) {
            copyOnWrite();
            ((KingPosition) this.instance).addKingPos(kingPos);
            return this;
        }

        public Builder clearExtend() {
            copyOnWrite();
            ((KingPosition) this.instance).clearExtend();
            return this;
        }

        public Builder clearKingPos() {
            copyOnWrite();
            ((KingPosition) this.instance).clearKingPos();
            return this;
        }

        public KingPos getExtend(int i) {
            return ((KingPosition) this.instance).getExtend(i);
        }

        public int getExtendCount() {
            return ((KingPosition) this.instance).getExtendCount();
        }

        public List<KingPos> getExtendList() {
            return Collections.unmodifiableList(((KingPosition) this.instance).getExtendList());
        }

        public KingPos getKingPos(int i) {
            return ((KingPosition) this.instance).getKingPos(i);
        }

        public int getKingPosCount() {
            return ((KingPosition) this.instance).getKingPosCount();
        }

        public List<KingPos> getKingPosList() {
            return Collections.unmodifiableList(((KingPosition) this.instance).getKingPosList());
        }

        public Builder removeExtend(int i) {
            copyOnWrite();
            ((KingPosition) this.instance).removeExtend(i);
            return this;
        }

        public Builder removeKingPos(int i) {
            copyOnWrite();
            ((KingPosition) this.instance).removeKingPos(i);
            return this;
        }

        public Builder setExtend(int i, KingPos kingPos) {
            copyOnWrite();
            ((KingPosition) this.instance).setExtend(i, kingPos);
            return this;
        }

        public Builder setKingPos(int i, KingPos kingPos) {
            copyOnWrite();
            ((KingPosition) this.instance).setKingPos(i, kingPos);
            return this;
        }

        private Builder() {
            super(KingPosition.DEFAULT_INSTANCE);
        }

        public Builder addExtend(int i, KingPos kingPos) {
            copyOnWrite();
            ((KingPosition) this.instance).addExtend(i, kingPos);
            return this;
        }

        public Builder addKingPos(int i, KingPos kingPos) {
            copyOnWrite();
            ((KingPosition) this.instance).addKingPos(i, kingPos);
            return this;
        }

        public Builder setExtend(int i, KingPos.Builder builder) {
            copyOnWrite();
            ((KingPosition) this.instance).setExtend(i, builder.build());
            return this;
        }

        public Builder setKingPos(int i, KingPos.Builder builder) {
            copyOnWrite();
            ((KingPosition) this.instance).setKingPos(i, builder.build());
            return this;
        }

        public Builder addExtend(KingPos.Builder builder) {
            copyOnWrite();
            ((KingPosition) this.instance).addExtend(builder.build());
            return this;
        }

        public Builder addKingPos(KingPos.Builder builder) {
            copyOnWrite();
            ((KingPosition) this.instance).addKingPos(builder.build());
            return this;
        }

        public Builder addExtend(int i, KingPos.Builder builder) {
            copyOnWrite();
            ((KingPosition) this.instance).addExtend(i, builder.build());
            return this;
        }

        public Builder addKingPos(int i, KingPos.Builder builder) {
            copyOnWrite();
            ((KingPosition) this.instance).addKingPos(i, builder.build());
            return this;
        }
    }

    static {
        KingPosition kingPosition = new KingPosition();
        DEFAULT_INSTANCE = kingPosition;
        GeneratedMessageLite.registerDefaultInstance(KingPosition.class, kingPosition);
    }

    public KingPosition() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtend(Iterable<? extends KingPos> iterable) {
        ensureExtendIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.extend_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKingPos(Iterable<? extends KingPos> iterable) {
        ensureKingPosIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.kingPos_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtend(KingPos kingPos) {
        kingPos.getClass();
        ensureExtendIsMutable();
        this.extend_.add(kingPos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKingPos(KingPos kingPos) {
        kingPos.getClass();
        ensureKingPosIsMutable();
        this.kingPos_.add(kingPos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtend() {
        this.extend_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKingPos() {
        this.kingPos_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureExtendIsMutable() {
        Internal.ProtobufList<KingPos> protobufList = this.extend_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.extend_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureKingPosIsMutable() {
        Internal.ProtobufList<KingPos> protobufList = this.kingPos_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.kingPos_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static KingPosition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KingPosition parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KingPosition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KingPosition parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KingPosition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtend(int i) {
        ensureExtendIsMutable();
        this.extend_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKingPos(int i) {
        ensureKingPosIsMutable();
        this.kingPos_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtend(int i, KingPos kingPos) {
        kingPos.getClass();
        ensureExtendIsMutable();
        this.extend_.set(i, kingPos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKingPos(int i, KingPos kingPos) {
        kingPos.getClass();
        ensureKingPosIsMutable();
        this.kingPos_.set(i, kingPos);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70071.f16991xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new KingPosition();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"kingPos_", KingPos.class, "extend_", KingPos.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KingPosition> parser = PARSER;
                if (parser == null) {
                    synchronized (KingPosition.class) {
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

    public KingPos getExtend(int i) {
        return this.extend_.get(i);
    }

    public int getExtendCount() {
        return this.extend_.size();
    }

    public List<KingPos> getExtendList() {
        return this.extend_;
    }

    public KingPosOrBuilder getExtendOrBuilder(int i) {
        return this.extend_.get(i);
    }

    public List<? extends KingPosOrBuilder> getExtendOrBuilderList() {
        return this.extend_;
    }

    public KingPos getKingPos(int i) {
        return this.kingPos_.get(i);
    }

    public int getKingPosCount() {
        return this.kingPos_.size();
    }

    public List<KingPos> getKingPosList() {
        return this.kingPos_;
    }

    public KingPosOrBuilder getKingPosOrBuilder(int i) {
        return this.kingPos_.get(i);
    }

    public List<? extends KingPosOrBuilder> getKingPosOrBuilderList() {
        return this.kingPos_;
    }

    public static Builder newBuilder(KingPosition kingPosition) {
        return DEFAULT_INSTANCE.createBuilder(kingPosition);
    }

    public static KingPosition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KingPosition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KingPosition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KingPosition parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtend(int i, KingPos kingPos) {
        kingPos.getClass();
        ensureExtendIsMutable();
        this.extend_.add(i, kingPos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKingPos(int i, KingPos kingPos) {
        kingPos.getClass();
        ensureKingPosIsMutable();
        this.kingPos_.add(i, kingPos);
    }

    public static KingPosition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KingPosition parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KingPosition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KingPosition parseFrom(InputStream inputStream) throws IOException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KingPosition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KingPosition parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KingPosition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KingPosition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
