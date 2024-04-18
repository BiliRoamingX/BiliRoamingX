package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public interface CharacterGroupOrBuilder extends MessageLiteOrBuilder {
    Celebrity getCharacters(int i);

    int getCharactersCount();

    List<Celebrity> getCharactersList();

    String getTitle();

    ByteString getTitleBytes();
}
