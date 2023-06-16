package com.bapis.bilibili.app.listener.v1;

import com.google.protobuf.GeneratedMessageLite;

import java.util.Map;

public class PlayURLResp extends GeneratedMessageLite<PlayURLResp, PlayURLResp.Builder> {
    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public static class Builder extends GeneratedMessageLite.Builder<PlayURLResp, Builder> {

        protected Builder(PlayURLResp defaultInstance) {
            super(defaultInstance);
        }

        public Builder putAllPlayerInfo(Map<Long, PlayInfo> map) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setItem(PlayItem playItem) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setMessage(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setPlayable(int i) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public int getPlayable() {
        throw new UnsupportedOperationException("Stub");
    }

    public Map<Long, PlayInfo> getPlayerInfoMap() {
        throw new UnsupportedOperationException("Stub");
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }
}
