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
public final class Characters extends GeneratedMessageLite<Characters, Characters.Builder> implements MessageLiteOrBuilder {
    private static final Characters DEFAULT_INSTANCE;
    public static final int GROUPS_FIELD_NUMBER = 1;
    private static volatile Parser<Characters> PARSER;
    private Internal.ProtobufList<CharacterGroup> groups_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Characters$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69871 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16974xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16974xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16974xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16974xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16974xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16974xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16974xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16974xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Characters, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69871 c69871) {
            this();
        }

        public Builder addAllGroups(Iterable<? extends CharacterGroup> iterable) {
            copyOnWrite();
            ((Characters) this.instance).addAllGroups(iterable);
            return this;
        }

        public Builder addGroups(CharacterGroup characterGroup) {
            copyOnWrite();
            ((Characters) this.instance).addGroups(characterGroup);
            return this;
        }

        public Builder clearGroups() {
            copyOnWrite();
            ((Characters) this.instance).clearGroups();
            return this;
        }

        public CharacterGroup getGroups(int i) {
            return ((Characters) this.instance).getGroups(i);
        }

        public int getGroupsCount() {
            return ((Characters) this.instance).getGroupsCount();
        }

        public List<CharacterGroup> getGroupsList() {
            return Collections.unmodifiableList(((Characters) this.instance).getGroupsList());
        }

        public Builder removeGroups(int i) {
            copyOnWrite();
            ((Characters) this.instance).removeGroups(i);
            return this;
        }

        public Builder setGroups(int i, CharacterGroup characterGroup) {
            copyOnWrite();
            ((Characters) this.instance).setGroups(i, characterGroup);
            return this;
        }

        private Builder() {
            super(Characters.DEFAULT_INSTANCE);
        }

        public Builder addGroups(int i, CharacterGroup characterGroup) {
            copyOnWrite();
            ((Characters) this.instance).addGroups(i, characterGroup);
            return this;
        }

        public Builder setGroups(int i, CharacterGroup.Builder builder) {
            copyOnWrite();
            ((Characters) this.instance).setGroups(i, builder.build());
            return this;
        }

        public Builder addGroups(CharacterGroup.Builder builder) {
            copyOnWrite();
            ((Characters) this.instance).addGroups(builder.build());
            return this;
        }

        public Builder addGroups(int i, CharacterGroup.Builder builder) {
            copyOnWrite();
            ((Characters) this.instance).addGroups(i, builder.build());
            return this;
        }
    }

    static {
        Characters characters = new Characters();
        DEFAULT_INSTANCE = characters;
        GeneratedMessageLite.registerDefaultInstance(Characters.class, characters);
    }

    private Characters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGroups(Iterable<? extends CharacterGroup> iterable) {
        ensureGroupsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.groups_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroups(CharacterGroup characterGroup) {
        characterGroup.getClass();
        ensureGroupsIsMutable();
        this.groups_.add(characterGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroups() {
        this.groups_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureGroupsIsMutable() {
        Internal.ProtobufList<CharacterGroup> protobufList = this.groups_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.groups_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Characters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Characters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Characters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Characters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Characters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGroups(int i) {
        ensureGroupsIsMutable();
        this.groups_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroups(int i, CharacterGroup characterGroup) {
        characterGroup.getClass();
        ensureGroupsIsMutable();
        this.groups_.set(i, characterGroup);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69871.f16974xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Characters();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"groups_", CharacterGroup.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Characters> parser = PARSER;
                if (parser == null) {
                    synchronized (Characters.class) {
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

    public CharacterGroup getGroups(int i) {
        return this.groups_.get(i);
    }

    public int getGroupsCount() {
        return this.groups_.size();
    }

    public List<CharacterGroup> getGroupsList() {
        return this.groups_;
    }

    public CharacterGroupOrBuilder getGroupsOrBuilder(int i) {
        return this.groups_.get(i);
    }

    public List<? extends CharacterGroupOrBuilder> getGroupsOrBuilderList() {
        return this.groups_;
    }

    public static Builder newBuilder(Characters characters) {
        return DEFAULT_INSTANCE.createBuilder(characters);
    }

    public static Characters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Characters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Characters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Characters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroups(int i, CharacterGroup characterGroup) {
        characterGroup.getClass();
        ensureGroupsIsMutable();
        this.groups_.add(i, characterGroup);
    }

    public static Characters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Characters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Characters parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Characters parseFrom(InputStream inputStream) throws IOException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Characters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Characters parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Characters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Characters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
