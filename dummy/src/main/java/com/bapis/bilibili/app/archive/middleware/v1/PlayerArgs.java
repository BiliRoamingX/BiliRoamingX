package com.bapis.bilibili.app.archive.middleware.v1;

import com.google.protobuf.GeneratedMessageLite;

public class PlayerArgs extends GeneratedMessageLite<PlayerArgs, PlayerArgs.Builder> {
    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public static class Builder extends GeneratedMessageLite.Builder<PlayerArgs, Builder> {

        protected Builder(PlayerArgs defaultInstance) {
            super(defaultInstance);
        }

        public Builder setFnval(long j) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setFnver(long j) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setForceHost(long j) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setQn(long j) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setVoiceBalance(long j) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }

    public long getFnval() {
        return 0;
    }

    public long getFnver() {
        return 0;
    }

    public long getForceHost() {
        return 0;
    }

    public long getQn() {
        return 0;
    }

    public long getVoiceBalance() {
        return 0;
    }
}
