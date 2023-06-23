package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class PlayDubbingInfo extends GeneratedMessageLite<PlayDubbingInfo, PlayDubbingInfo.Builder> implements MessageLiteOrBuilder {
    public static final int BACKGROUND_AUDIO_FIELD_NUMBER = 1;
    private static final PlayDubbingInfo DEFAULT_INSTANCE;
    public static final int GUIDE_TEXT_FIELD_NUMBER = 3;
    private static volatile Parser<PlayDubbingInfo> PARSER = null;
    public static final int ROLE_AUDIO_LIST_FIELD_NUMBER = 2;
    private AudioMaterialProto backgroundAudio_;
    private Internal.ProtobufList<RoleAudioProto> roleAudioList_ = GeneratedMessageLite.emptyProtobufList();
    private String guideText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17580xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17580xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17580xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayDubbingInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78611 c78611) {
            this();
        }

        public Builder addAllRoleAudioList(Iterable<? extends RoleAudioProto> iterable) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).addAllRoleAudioList(iterable);
            return this;
        }

        public Builder addRoleAudioList(RoleAudioProto roleAudioProto) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).addRoleAudioList(roleAudioProto);
            return this;
        }

        public Builder clearBackgroundAudio() {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).clearBackgroundAudio();
            return this;
        }

        public Builder clearGuideText() {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).clearGuideText();
            return this;
        }

        public Builder clearRoleAudioList() {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).clearRoleAudioList();
            return this;
        }

        public AudioMaterialProto getBackgroundAudio() {
            return ((PlayDubbingInfo) this.instance).getBackgroundAudio();
        }

        public String getGuideText() {
            return ((PlayDubbingInfo) this.instance).getGuideText();
        }

        public ByteString getGuideTextBytes() {
            return ((PlayDubbingInfo) this.instance).getGuideTextBytes();
        }

        public RoleAudioProto getRoleAudioList(int i) {
            return ((PlayDubbingInfo) this.instance).getRoleAudioList(i);
        }

        public int getRoleAudioListCount() {
            return ((PlayDubbingInfo) this.instance).getRoleAudioListCount();
        }

        public List<RoleAudioProto> getRoleAudioListList() {
            return Collections.unmodifiableList(((PlayDubbingInfo) this.instance).getRoleAudioListList());
        }

        public boolean hasBackgroundAudio() {
            return ((PlayDubbingInfo) this.instance).hasBackgroundAudio();
        }

        public Builder mergeBackgroundAudio(AudioMaterialProto audioMaterialProto) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).mergeBackgroundAudio(audioMaterialProto);
            return this;
        }

        public Builder removeRoleAudioList(int i) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).removeRoleAudioList(i);
            return this;
        }

        public Builder setBackgroundAudio(AudioMaterialProto audioMaterialProto) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).setBackgroundAudio(audioMaterialProto);
            return this;
        }

        public Builder setGuideText(String str) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).setGuideText(str);
            return this;
        }

        public Builder setGuideTextBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).setGuideTextBytes(byteString);
            return this;
        }

        public Builder setRoleAudioList(int i, RoleAudioProto roleAudioProto) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).setRoleAudioList(i, roleAudioProto);
            return this;
        }

        private Builder() {
            super(PlayDubbingInfo.DEFAULT_INSTANCE);
        }

        public Builder addRoleAudioList(int i, RoleAudioProto roleAudioProto) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).addRoleAudioList(i, roleAudioProto);
            return this;
        }

        public Builder setBackgroundAudio(AudioMaterialProto.Builder builder) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).setBackgroundAudio(builder.build());
            return this;
        }

        public Builder setRoleAudioList(int i, RoleAudioProto.Builder builder) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).setRoleAudioList(i, builder.build());
            return this;
        }

        public Builder addRoleAudioList(RoleAudioProto.Builder builder) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).addRoleAudioList(builder.build());
            return this;
        }

        public Builder addRoleAudioList(int i, RoleAudioProto.Builder builder) {
            copyOnWrite();
            ((PlayDubbingInfo) this.instance).addRoleAudioList(i, builder.build());
            return this;
        }
    }

    static {
        PlayDubbingInfo playDubbingInfo = new PlayDubbingInfo();
        DEFAULT_INSTANCE = playDubbingInfo;
        GeneratedMessageLite.registerDefaultInstance(PlayDubbingInfo.class, playDubbingInfo);
    }

    private PlayDubbingInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoleAudioList(Iterable<? extends RoleAudioProto> iterable) {
        ensureRoleAudioListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.roleAudioList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoleAudioList(RoleAudioProto roleAudioProto) {
        roleAudioProto.getClass();
        ensureRoleAudioListIsMutable();
        this.roleAudioList_.add(roleAudioProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundAudio() {
        this.backgroundAudio_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuideText() {
        this.guideText_ = getDefaultInstance().getGuideText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoleAudioList() {
        this.roleAudioList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRoleAudioListIsMutable() {
        Internal.ProtobufList<RoleAudioProto> protobufList = this.roleAudioList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.roleAudioList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlayDubbingInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackgroundAudio(AudioMaterialProto audioMaterialProto) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayDubbingInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayDubbingInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayDubbingInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoleAudioList(int i) {
        ensureRoleAudioListIsMutable();
        this.roleAudioList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundAudio(AudioMaterialProto audioMaterialProto) {
        audioMaterialProto.getClass();
        this.backgroundAudio_ = audioMaterialProto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuideText(String str) {
        str.getClass();
        this.guideText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuideTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.guideText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleAudioList(int i, RoleAudioProto roleAudioProto) {
        roleAudioProto.getClass();
        ensureRoleAudioListIsMutable();
        this.roleAudioList_.set(i, roleAudioProto);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78611.f17580xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayDubbingInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\u0208", new Object[]{"backgroundAudio_", "roleAudioList_", RoleAudioProto.class, "guideText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayDubbingInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayDubbingInfo.class) {
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

    public AudioMaterialProto getBackgroundAudio() {
        AudioMaterialProto audioMaterialProto = this.backgroundAudio_;
        return audioMaterialProto == null ? AudioMaterialProto.getDefaultInstance() : audioMaterialProto;
    }

    public String getGuideText() {
        return this.guideText_;
    }

    public ByteString getGuideTextBytes() {
        return ByteString.copyFromUtf8(this.guideText_);
    }

    public RoleAudioProto getRoleAudioList(int i) {
        return this.roleAudioList_.get(i);
    }

    public int getRoleAudioListCount() {
        return this.roleAudioList_.size();
    }

    public List<RoleAudioProto> getRoleAudioListList() {
        return this.roleAudioList_;
    }

    public RoleAudioProtoOrBuilder getRoleAudioListOrBuilder(int i) {
        return this.roleAudioList_.get(i);
    }

    public List<? extends RoleAudioProtoOrBuilder> getRoleAudioListOrBuilderList() {
        return this.roleAudioList_;
    }

    public boolean hasBackgroundAudio() {
        return this.backgroundAudio_ != null;
    }

    public static Builder newBuilder(PlayDubbingInfo playDubbingInfo) {
        return DEFAULT_INSTANCE.createBuilder(playDubbingInfo);
    }

    public static PlayDubbingInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayDubbingInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayDubbingInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoleAudioList(int i, RoleAudioProto roleAudioProto) {
        roleAudioProto.getClass();
        ensureRoleAudioListIsMutable();
        this.roleAudioList_.add(i, roleAudioProto);
    }

    public static PlayDubbingInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayDubbingInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayDubbingInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayDubbingInfo parseFrom(InputStream inputStream) throws IOException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayDubbingInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayDubbingInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayDubbingInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayDubbingInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
