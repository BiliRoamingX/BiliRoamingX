package com.bapis.bilibili.app.listener.v1;

import com.google.protobuf.GeneratedMessageLite;

public class PlayDASH extends GeneratedMessageLite<PlayDASH, PlayDASH.Builder> {

    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public static class Builder extends GeneratedMessageLite.Builder<PlayDASH, Builder> {
        protected Builder(PlayDASH defaultInstance) {
            super(defaultInstance);
        }

        public Builder addAllAudio(Iterable<? extends DashItem> iterable) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder addAudio(DashItem dashItem) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setDuration(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setMinBufferTime(float f) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }
}
