package app.revanced.bilibili.meta;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class CouponInfo {

    @JSONField(name = "list")
    public List<Item> list;

    public CouponInfo(List<Item> list) {
        this.list = list;
    }

    public static class Item {
        @JSONField(name = "type")
        public int type;
        @JSONField(name = "state")
        public int state;
        @JSONField(name = "next_receive_days")
        public long nextReceiveDays;

        public Item(int type, int state, long nextReceiveDays) {
            this.type = type;
            this.state = state;
            this.nextReceiveDays = nextReceiveDays;
        }
    }
}
