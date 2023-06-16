package com.bapis.bilibili.playershared;

import java.util.Map;

public class PlayArcConfEx {
    public static Map<Integer, ArcConf> getMutableArcConfsMap(PlayArcConf conf) {
        return PlayArcConf.access$100(conf);
    }
}
