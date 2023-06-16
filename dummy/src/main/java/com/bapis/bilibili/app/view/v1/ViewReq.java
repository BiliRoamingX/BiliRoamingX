package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.google.protobuf.GeneratedMessageLite;

public class ViewReq extends GeneratedMessageLite<ViewReq, ViewReq.Builder> {
    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public static class Builder extends GeneratedMessageLite.Builder<ViewReq, Builder> {
        protected Builder(ViewReq defaultInstance) {
            super(defaultInstance);
        }

        public Builder setFnval(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setForceHost(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setFourk(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setQn(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setAid(long j) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }
}
