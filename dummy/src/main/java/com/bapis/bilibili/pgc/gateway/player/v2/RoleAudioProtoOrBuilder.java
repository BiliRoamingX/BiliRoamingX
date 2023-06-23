package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface RoleAudioProtoOrBuilder extends MessageLiteOrBuilder {
    AudioMaterialProto getAudioMaterialList(int i);

    int getAudioMaterialListCount();

    List<AudioMaterialProto> getAudioMaterialListList();

    String getRoleAvatar();

    ByteString getRoleAvatarBytes();

    long getRoleId();

    String getRoleName();

    ByteString getRoleNameBytes();
}
