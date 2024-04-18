package com.bapis.bilibili.pgc.gateway.player.v2;

import com.bapis.bilibili.pgc.gateway.player.v2.DashItem;
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
/* loaded from: classes14.dex */
public final class AudioMaterialProto extends GeneratedMessageLite<AudioMaterialProto, AudioMaterialProto.Builder> implements AudioMaterialProtoOrBuilder {
    public static final int AUDIO_FIELD_NUMBER = 7;
    public static final int AUDIO_ID_FIELD_NUMBER = 1;
    private static final AudioMaterialProto DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 3;
    private static volatile Parser<AudioMaterialProto> PARSER = null;
    public static final int PERSON_AVATAR_FIELD_NUMBER = 6;
    public static final int PERSON_ID_FIELD_NUMBER = 4;
    public static final int PERSON_NAME_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private long personId_;
    private String audioId_ = "";
    private String title_ = "";
    private String edition_ = "";
    private String personName_ = "";
    private String personAvatar_ = "";
    private Internal.ProtobufList<DashItem> audio_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProto$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17545xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17545xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17545xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17545xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17545xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17545xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17545xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17545xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AudioMaterialProto, Builder> implements AudioMaterialProtoOrBuilder {
        /* synthetic */ Builder(C78181 c78181) {
            this();
        }

        public Builder addAllAudio(Iterable<? extends DashItem> iterable) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).addAllAudio(iterable);
            return this;
        }

        public Builder addAudio(DashItem dashItem) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).addAudio(dashItem);
            return this;
        }

        public Builder clearAudio() {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).clearAudio();
            return this;
        }

        public Builder clearAudioId() {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).clearAudioId();
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).clearEdition();
            return this;
        }

        public Builder clearPersonAvatar() {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).clearPersonAvatar();
            return this;
        }

        public Builder clearPersonId() {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).clearPersonId();
            return this;
        }

        public Builder clearPersonName() {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).clearPersonName();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public DashItem getAudio(int i) {
            return ((AudioMaterialProto) this.instance).getAudio(i);
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public int getAudioCount() {
            return ((AudioMaterialProto) this.instance).getAudioCount();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public String getAudioId() {
            return ((AudioMaterialProto) this.instance).getAudioId();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public ByteString getAudioIdBytes() {
            return ((AudioMaterialProto) this.instance).getAudioIdBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public List<DashItem> getAudioList() {
            return Collections.unmodifiableList(((AudioMaterialProto) this.instance).getAudioList());
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public String getEdition() {
            return ((AudioMaterialProto) this.instance).getEdition();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public ByteString getEditionBytes() {
            return ((AudioMaterialProto) this.instance).getEditionBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public String getPersonAvatar() {
            return ((AudioMaterialProto) this.instance).getPersonAvatar();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public ByteString getPersonAvatarBytes() {
            return ((AudioMaterialProto) this.instance).getPersonAvatarBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public long getPersonId() {
            return ((AudioMaterialProto) this.instance).getPersonId();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public String getPersonName() {
            return ((AudioMaterialProto) this.instance).getPersonName();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public ByteString getPersonNameBytes() {
            return ((AudioMaterialProto) this.instance).getPersonNameBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public String getTitle() {
            return ((AudioMaterialProto) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
        public ByteString getTitleBytes() {
            return ((AudioMaterialProto) this.instance).getTitleBytes();
        }

        public Builder removeAudio(int i) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).removeAudio(i);
            return this;
        }

        public Builder setAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setAudio(i, dashItem);
            return this;
        }

        public Builder setAudioId(String str) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setAudioId(str);
            return this;
        }

        public Builder setAudioIdBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setAudioIdBytes(byteString);
            return this;
        }

        public Builder setEdition(String str) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setEdition(str);
            return this;
        }

        public Builder setEditionBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setEditionBytes(byteString);
            return this;
        }

        public Builder setPersonAvatar(String str) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setPersonAvatar(str);
            return this;
        }

        public Builder setPersonAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setPersonAvatarBytes(byteString);
            return this;
        }

        public Builder setPersonId(long j) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setPersonId(j);
            return this;
        }

        public Builder setPersonName(String str) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setPersonName(str);
            return this;
        }

        public Builder setPersonNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setPersonNameBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(AudioMaterialProto.DEFAULT_INSTANCE);
        }

        public Builder addAudio(int i, DashItem dashItem) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).addAudio(i, dashItem);
            return this;
        }

        public Builder setAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).setAudio(i, builder.build());
            return this;
        }

        public Builder addAudio(DashItem.Builder builder) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).addAudio(builder.build());
            return this;
        }

        public Builder addAudio(int i, DashItem.Builder builder) {
            copyOnWrite();
            ((AudioMaterialProto) this.instance).addAudio(i, builder.build());
            return this;
        }
    }

    static {
        AudioMaterialProto audioMaterialProto = new AudioMaterialProto();
        DEFAULT_INSTANCE = audioMaterialProto;
        GeneratedMessageLite.registerDefaultInstance(AudioMaterialProto.class, audioMaterialProto);
    }

    private AudioMaterialProto() {
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
    public void clearAudioId() {
        this.audioId_ = getDefaultInstance().getAudioId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersonAvatar() {
        this.personAvatar_ = getDefaultInstance().getPersonAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersonId() {
        this.personId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersonName() {
        this.personName_ = getDefaultInstance().getPersonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureAudioIsMutable() {
        Internal.ProtobufList<DashItem> protobufList = this.audio_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.audio_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AudioMaterialProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AudioMaterialProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AudioMaterialProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioMaterialProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AudioMaterialProto> parser() {
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
    public void setAudioId(String str) {
        str.getClass();
        this.audioId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.audioId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(String str) {
        str.getClass();
        this.edition_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.edition_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonAvatar(String str) {
        str.getClass();
        this.personAvatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonAvatarBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.personAvatar_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonId(long j) {
        this.personId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonName(String str) {
        str.getClass();
        this.personName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.personName_ = byteString.toStringUtf8();
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
        switch (C78181.f17545xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AudioMaterialProto();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u001b", new Object[]{"audioId_", "title_", "edition_", "personId_", "personName_", "personAvatar_", "audio_", DashItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AudioMaterialProto> parser = PARSER;
                if (parser == null) {
                    synchronized (AudioMaterialProto.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public DashItem getAudio(int i) {
        return this.audio_.get(i);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public int getAudioCount() {
        return this.audio_.size();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public String getAudioId() {
        return this.audioId_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public ByteString getAudioIdBytes() {
        return ByteString.copyFromUtf8(this.audioId_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public List<DashItem> getAudioList() {
        return this.audio_;
    }

    public DashItemOrBuilder getAudioOrBuilder(int i) {
        return this.audio_.get(i);
    }

    public List<? extends DashItemOrBuilder> getAudioOrBuilderList() {
        return this.audio_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public String getEdition() {
        return this.edition_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public String getPersonAvatar() {
        return this.personAvatar_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public ByteString getPersonAvatarBytes() {
        return ByteString.copyFromUtf8(this.personAvatar_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public long getPersonId() {
        return this.personId_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public String getPersonName() {
        return this.personName_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public ByteString getPersonNameBytes() {
        return ByteString.copyFromUtf8(this.personName_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.AudioMaterialProtoOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(AudioMaterialProto audioMaterialProto) {
        return DEFAULT_INSTANCE.createBuilder(audioMaterialProto);
    }

    public static AudioMaterialProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioMaterialProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioMaterialProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AudioMaterialProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudio(int i, DashItem dashItem) {
        dashItem.getClass();
        ensureAudioIsMutable();
        this.audio_.add(i, dashItem);
    }

    public static AudioMaterialProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AudioMaterialProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AudioMaterialProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AudioMaterialProto parseFrom(InputStream inputStream) throws IOException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AudioMaterialProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AudioMaterialProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AudioMaterialProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AudioMaterialProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
