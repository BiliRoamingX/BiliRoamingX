package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class CharacterGroup extends GeneratedMessageLite<CharacterGroup, CharacterGroup.Builder> implements CharacterGroupOrBuilder {
    public static final int CHARACTERS_FIELD_NUMBER = 2;
    private static final CharacterGroup DEFAULT_INSTANCE;
    private static volatile Parser<CharacterGroup> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private Internal.ProtobufList<Celebrity> characters_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.CharacterGroup$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69861 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16973xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16973xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16973xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16973xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16973xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16973xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16973xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16973xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CharacterGroup, Builder> implements CharacterGroupOrBuilder {
        /* synthetic */ Builder(C69861 c69861) {
            this();
        }

        public Builder addAllCharacters(Iterable<? extends Celebrity> iterable) {
            copyOnWrite();
            ((CharacterGroup) this.instance).addAllCharacters(iterable);
            return this;
        }

        public Builder addCharacters(Celebrity celebrity) {
            copyOnWrite();
            ((CharacterGroup) this.instance).addCharacters(celebrity);
            return this;
        }

        public Builder clearCharacters() {
            copyOnWrite();
            ((CharacterGroup) this.instance).clearCharacters();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((CharacterGroup) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
        public Celebrity getCharacters(int i) {
            return ((CharacterGroup) this.instance).getCharacters(i);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
        public int getCharactersCount() {
            return ((CharacterGroup) this.instance).getCharactersCount();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
        public List<Celebrity> getCharactersList() {
            return Collections.unmodifiableList(((CharacterGroup) this.instance).getCharactersList());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
        public String getTitle() {
            return ((CharacterGroup) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
        public ByteString getTitleBytes() {
            return ((CharacterGroup) this.instance).getTitleBytes();
        }

        public Builder removeCharacters(int i) {
            copyOnWrite();
            ((CharacterGroup) this.instance).removeCharacters(i);
            return this;
        }

        public Builder setCharacters(int i, Celebrity celebrity) {
            copyOnWrite();
            ((CharacterGroup) this.instance).setCharacters(i, celebrity);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((CharacterGroup) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((CharacterGroup) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(CharacterGroup.DEFAULT_INSTANCE);
        }

        public Builder addCharacters(int i, Celebrity celebrity) {
            copyOnWrite();
            ((CharacterGroup) this.instance).addCharacters(i, celebrity);
            return this;
        }

        public Builder setCharacters(int i, Celebrity.Builder builder) {
            copyOnWrite();
            ((CharacterGroup) this.instance).setCharacters(i, builder.build());
            return this;
        }

        public Builder addCharacters(Celebrity.Builder builder) {
            copyOnWrite();
            ((CharacterGroup) this.instance).addCharacters(builder.build());
            return this;
        }

        public Builder addCharacters(int i, Celebrity.Builder builder) {
            copyOnWrite();
            ((CharacterGroup) this.instance).addCharacters(i, builder.build());
            return this;
        }
    }

    static {
        CharacterGroup characterGroup = new CharacterGroup();
        DEFAULT_INSTANCE = characterGroup;
        GeneratedMessageLite.registerDefaultInstance(CharacterGroup.class, characterGroup);
    }

    private CharacterGroup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCharacters(Iterable<? extends Celebrity> iterable) {
        ensureCharactersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.characters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCharacters(Celebrity celebrity) {
        celebrity.getClass();
        ensureCharactersIsMutable();
        this.characters_.add(celebrity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCharacters() {
        this.characters_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureCharactersIsMutable() {
        Internal.ProtobufList<Celebrity> protobufList = this.characters_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.characters_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CharacterGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CharacterGroup parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CharacterGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CharacterGroup parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CharacterGroup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCharacters(int i) {
        ensureCharactersIsMutable();
        this.characters_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCharacters(int i, Celebrity celebrity) {
        celebrity.getClass();
        ensureCharactersIsMutable();
        this.characters_.set(i, celebrity);
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
        switch (C69861.f16973xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CharacterGroup();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"title_", "characters_", Celebrity.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CharacterGroup> parser = PARSER;
                if (parser == null) {
                    synchronized (CharacterGroup.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
    public Celebrity getCharacters(int i) {
        return this.characters_.get(i);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
    public int getCharactersCount() {
        return this.characters_.size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
    public List<Celebrity> getCharactersList() {
        return this.characters_;
    }

    public CelebrityOrBuilder getCharactersOrBuilder(int i) {
        return this.characters_.get(i);
    }

    public List<? extends CelebrityOrBuilder> getCharactersOrBuilderList() {
        return this.characters_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CharacterGroupOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(CharacterGroup characterGroup) {
        return DEFAULT_INSTANCE.createBuilder(characterGroup);
    }

    public static CharacterGroup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CharacterGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CharacterGroup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CharacterGroup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCharacters(int i, Celebrity celebrity) {
        celebrity.getClass();
        ensureCharactersIsMutable();
        this.characters_.add(i, celebrity);
    }

    public static CharacterGroup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CharacterGroup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CharacterGroup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CharacterGroup parseFrom(InputStream inputStream) throws IOException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CharacterGroup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CharacterGroup parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CharacterGroup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CharacterGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
