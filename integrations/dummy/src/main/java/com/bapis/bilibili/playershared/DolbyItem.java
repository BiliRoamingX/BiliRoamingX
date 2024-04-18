package com.bapis.bilibili.playershared;

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
/* loaded from: classes14.dex */
public final class DolbyItem extends GeneratedMessageLite<DolbyItem, DolbyItem.Builder> implements MessageLiteOrBuilder {
    public static final int AUDIO_FIELD_NUMBER = 2;
    private static final DolbyItem DEFAULT_INSTANCE;
    private static volatile Parser<DolbyItem> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Internal.ProtobufList<DashItem> audio_ = GeneratedMessageLite.emptyProtobufList();
    private int type_;

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DolbyItem, Builder> implements MessageLiteOrBuilder {

        public Builder addAllAudio(Iterable<? extends DashItem> iterable) {
            copyOnWrite();
            ((DolbyItem) this.instance).addAllAudio(iterable);
            return this;
        }

        public Builder addAudio(DashItem dashItem) {
            copyOnWrite();
            ((DolbyItem) this.instance).addAudio(dashItem);
            return this;
        }

        public Builder clearAudio() {
            copyOnWrite();
            ((DolbyItem) this.instance).clearAudio();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((DolbyItem) this.instance).clearType();
            return this;
        }

        public DashItem getAudio(int i) {
            return ((DolbyItem) this.instance).getAudio(i);
        }

        public int getAudioCount() {
            return ((DolbyItem) this.instance).getAudioCount();
        }

        public List<DashItem> getAudioList() {
            return Collections.unmodifiableList(((DolbyItem) this.instance).getAudioList());
        }

        public Type getType() {
            return ((DolbyItem) this.instance).getType();
        }

        public int getTypeValue() {
            return ((DolbyItem) this.instance).getTypeValue();
        }

        public Builder removeAudio(int i) {
            copyOnWrite();
            ((DolbyItem) this.instance).removeAudio(i);
            return this;
        }

        public Builder setAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((DolbyItem) this.instance).setAudio(i, dashItem);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((DolbyItem) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((DolbyItem) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(DolbyItem.DEFAULT_INSTANCE);
        }

        public Builder addAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((DolbyItem) this.instance).addAudio(i, dashItem);
            return this;
        }

        public Builder setAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((DolbyItem) this.instance).setAudio(i, builder.build());
            return this;
        }

        public Builder addAudio(DashItem.Builder builder) {
            copyOnWrite();
            ((DolbyItem) this.instance).addAudio(builder.build());
            return this;
        }

        public Builder addAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((DolbyItem) this.instance).addAudio(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public enum Type implements Internal.EnumLite {
        NONE(0),
        COMMON(1),
        ATMOS(2),
        UNRECOGNIZED(-1);

        public static final int ATMOS_VALUE = 2;
        public static final int COMMON_VALUE = 1;
        public static final int NONE_VALUE = 0;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.bapis.bilibili.playershared.DolbyItem.Type.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes14.dex */
        private static final class TypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Type.forNumber(i) != null;
            }
        }

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return ATMOS;
                }
                return COMMON;
            }
            return NONE;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        DolbyItem dolbyItem = new DolbyItem();
        DEFAULT_INSTANCE = dolbyItem;
        GeneratedMessageLite.registerDefaultInstance(DolbyItem.class, dolbyItem);
    }

    private DolbyItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAudio(Iterable<? extends DashItem> iterable) {
        ensureAudioIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.audio_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudio(DashItem dashItem) {
        dashItem.getClass();
        ensureAudioIsMutable();
        this.audio_.add(dashItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        this.audio_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureAudioIsMutable() {
        Internal.ProtobufList<DashItem> protobufList = this.audio_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.audio_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DolbyItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DolbyItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DolbyItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DolbyItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DolbyItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAudio(int i) {
        ensureAudioIsMutable();
        this.audio_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(int i, DashItem dashItem) {
        dashItem.getClass();
        ensureAudioIsMutable();
        this.audio_.set(i, dashItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        return null;
    }

    public DashItem getAudio(int i) {
        return this.audio_.get(i);
    }

    public int getAudioCount() {
        return this.audio_.size();
    }

    public List<DashItem> getAudioList() {
        return this.audio_;
    }

    public DashItemOrBuilder getAudioOrBuilder(int i) {
        return this.audio_.get(i);
    }

    public List<? extends DashItemOrBuilder> getAudioOrBuilderList() {
        return this.audio_;
    }

    public Type getType() {
        Type forNumber = Type.forNumber(this.type_);
        return forNumber == null ? Type.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(DolbyItem dolbyItem) {
        return DEFAULT_INSTANCE.createBuilder(dolbyItem);
    }

    public static DolbyItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DolbyItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DolbyItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DolbyItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudio(int i, DashItem dashItem) {
        dashItem.getClass();
        ensureAudioIsMutable();
        this.audio_.add(i, dashItem);
    }

    public static DolbyItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DolbyItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DolbyItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DolbyItem parseFrom(InputStream inputStream) throws IOException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DolbyItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DolbyItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DolbyItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DolbyItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
