package com.bapis.bilibili.app.listener.v1;

public class DetailItemEx {
    public static void setPlayable(DetailItem item, int playable) {
        DetailItem.access$2300(item, playable);
    }

    public static void addAllParts(DetailItem item, Iterable<? extends BKArcPart> parts) {
        DetailItem.access$1000(item, parts);
    }
}
