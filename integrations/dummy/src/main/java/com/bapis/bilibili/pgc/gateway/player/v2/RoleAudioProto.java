package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class RoleAudioProto extends GeneratedMessageLite<RoleAudioProto, RoleAudioProto.Builder> implements RoleAudioProtoOrBuilder {
    public static final int AUDIO_MATERIAL_LIST_FIELD_NUMBER = 4;
    private static final RoleAudioProto DEFAULT_INSTANCE;
    private static volatile Parser<RoleAudioProto> PARSER = null;
    public static final int ROLE_AVATAR_FIELD_NUMBER = 3;
    public static final int ROLE_ID_FIELD_NUMBER = 1;
    public static final int ROLE_NAME_FIELD_NUMBER = 2;
    private long roleId_;
    private String roleName_ = "";
    private String roleAvatar_ = "";
    private Internal.ProtobufList<AudioMaterialProto> audioMaterialList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProto$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17593xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17593xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17593xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17593xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17593xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17593xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17593xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17593xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RoleAudioProto, Builder> implements RoleAudioProtoOrBuilder {
        /* synthetic */ Builder(C78781 c78781) {
            this();
        }

        public Builder addAllAudioMaterialList(Iterable<? extends AudioMaterialProto> iterable) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).addAllAudioMaterialList(iterable);
            return this;
        }

        public Builder addAudioMaterialList(AudioMaterialProto audioMaterialProto) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).addAudioMaterialList(audioMaterialProto);
            return this;
        }

        public Builder clearAudioMaterialList() {
            copyOnWrite();
            ((RoleAudioProto) this.instance).clearAudioMaterialList();
            return this;
        }

        public Builder clearRoleAvatar() {
            copyOnWrite();
            ((RoleAudioProto) this.instance).clearRoleAvatar();
            return this;
        }

        public Builder clearRoleId() {
            copyOnWrite();
            ((RoleAudioProto) this.instance).clearRoleId();
            return this;
        }

        public Builder clearRoleName() {
            copyOnWrite();
            ((RoleAudioProto) this.instance).clearRoleName();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public AudioMaterialProto getAudioMaterialList(int i) {
            return ((RoleAudioProto) this.instance).getAudioMaterialList(i);
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public int getAudioMaterialListCount() {
            return ((RoleAudioProto) this.instance).getAudioMaterialListCount();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public List<AudioMaterialProto> getAudioMaterialListList() {
            return Collections.unmodifiableList(((RoleAudioProto) this.instance).getAudioMaterialListList());
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public String getRoleAvatar() {
            return ((RoleAudioProto) this.instance).getRoleAvatar();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public ByteString getRoleAvatarBytes() {
            return ((RoleAudioProto) this.instance).getRoleAvatarBytes();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public long getRoleId() {
            return ((RoleAudioProto) this.instance).getRoleId();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public String getRoleName() {
            return ((RoleAudioProto) this.instance).getRoleName();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
        public ByteString getRoleNameBytes() {
            return ((RoleAudioProto) this.instance).getRoleNameBytes();
        }

        public Builder removeAudioMaterialList(int i) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).removeAudioMaterialList(i);
            return this;
        }

        public Builder setAudioMaterialList(int i, AudioMaterialProto audioMaterialProto) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).setAudioMaterialList(i, audioMaterialProto);
            return this;
        }

        public Builder setRoleAvatar(String str) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).setRoleAvatar(str);
            return this;
        }

        public Builder setRoleAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).setRoleAvatarBytes(byteString);
            return this;
        }

        public Builder setRoleId(long j) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).setRoleId(j);
            return this;
        }

        public Builder setRoleName(String str) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).setRoleName(str);
            return this;
        }

        public Builder setRoleNameBytes(ByteString byteString) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).setRoleNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(RoleAudioProto.DEFAULT_INSTANCE);
        }

        public Builder addAudioMaterialList(int i, AudioMaterialProto audioMaterialProto) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).addAudioMaterialList(i, audioMaterialProto);
            return this;
        }

        public Builder setAudioMaterialList(int i, AudioMaterialProto.Builder builder) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).setAudioMaterialList(i, builder.build());
            return this;
        }

        public Builder addAudioMaterialList(AudioMaterialProto.Builder builder) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).addAudioMaterialList(builder.build());
            return this;
        }

        public Builder addAudioMaterialList(int i, AudioMaterialProto.Builder builder) {
            copyOnWrite();
            ((RoleAudioProto) this.instance).addAudioMaterialList(i, builder.build());
            return this;
        }
    }

    static {
        RoleAudioProto roleAudioProto = new RoleAudioProto();
        DEFAULT_INSTANCE = roleAudioProto;
        GeneratedMessageLite.registerDefaultInstance(RoleAudioProto.class, roleAudioProto);
    }

    private RoleAudioProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAudioMaterialList(Iterable<? extends AudioMaterialProto> iterable) {
        ensureAudioMaterialListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.audioMaterialList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudioMaterialList(AudioMaterialProto audioMaterialProto) {
        audioMaterialProto.getClass();
        ensureAudioMaterialListIsMutable();
        this.audioMaterialList_.add(audioMaterialProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioMaterialList() {
        this.audioMaterialList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoleAvatar() {
        this.roleAvatar_ = getDefaultInstance().getRoleAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoleId() {
        this.roleId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoleName() {
        this.roleName_ = getDefaultInstance().getRoleName();
    }

    private void ensureAudioMaterialListIsMutable() {
        Internal.ProtobufList<AudioMaterialProto> protobufList = this.audioMaterialList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.audioMaterialList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RoleAudioProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RoleAudioProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RoleAudioProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoleAudioProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RoleAudioProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAudioMaterialList(int i) {
        ensureAudioMaterialListIsMutable();
        this.audioMaterialList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioMaterialList(int i, AudioMaterialProto audioMaterialProto) {
        audioMaterialProto.getClass();
        ensureAudioMaterialListIsMutable();
        this.audioMaterialList_.set(i, audioMaterialProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleAvatar(String str) {
        str.getClass();
        this.roleAvatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleAvatarBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.roleAvatar_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleId(long j) {
        this.roleId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleName(String str) {
        str.getClass();
        this.roleName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.roleName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78781.f17593xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RoleAudioProto();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u001b", new Object[]{"roleId_", "roleName_", "roleAvatar_", "audioMaterialList_", AudioMaterialProto.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RoleAudioProto> parser = PARSER;
                if (parser == null) {
                    synchronized (RoleAudioProto.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public AudioMaterialProto getAudioMaterialList(int i) {
        return this.audioMaterialList_.get(i);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public int getAudioMaterialListCount() {
        return this.audioMaterialList_.size();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public List<AudioMaterialProto> getAudioMaterialListList() {
        return this.audioMaterialList_;
    }

    public AudioMaterialProtoOrBuilder getAudioMaterialListOrBuilder(int i) {
        return this.audioMaterialList_.get(i);
    }

    public List<? extends AudioMaterialProtoOrBuilder> getAudioMaterialListOrBuilderList() {
        return this.audioMaterialList_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public String getRoleAvatar() {
        return this.roleAvatar_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public ByteString getRoleAvatarBytes() {
        return ByteString.copyFromUtf8(this.roleAvatar_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public long getRoleId() {
        return this.roleId_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public String getRoleName() {
        return this.roleName_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.RoleAudioProtoOrBuilder
    public ByteString getRoleNameBytes() {
        return ByteString.copyFromUtf8(this.roleName_);
    }

    public static Builder newBuilder(RoleAudioProto roleAudioProto) {
        return DEFAULT_INSTANCE.createBuilder(roleAudioProto);
    }

    public static RoleAudioProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RoleAudioProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RoleAudioProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RoleAudioProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudioMaterialList(int i, AudioMaterialProto audioMaterialProto) {
        audioMaterialProto.getClass();
        ensureAudioMaterialListIsMutable();
        this.audioMaterialList_.add(i, audioMaterialProto);
    }

    public static RoleAudioProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RoleAudioProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RoleAudioProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RoleAudioProto parseFrom(InputStream inputStream) throws IOException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoleAudioProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RoleAudioProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RoleAudioProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RoleAudioProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
