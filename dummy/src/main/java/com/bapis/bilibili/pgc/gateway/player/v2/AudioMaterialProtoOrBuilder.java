package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public interface AudioMaterialProtoOrBuilder extends MessageLiteOrBuilder {
    DashItem getAudio(int i);

    int getAudioCount();

    String getAudioId();

    ByteString getAudioIdBytes();

    List<DashItem> getAudioList();

    String getEdition();

    ByteString getEditionBytes();

    String getPersonAvatar();

    ByteString getPersonAvatarBytes();

    long getPersonId();

    String getPersonName();

    ByteString getPersonNameBytes();

    String getTitle();

    ByteString getTitleBytes();
}
