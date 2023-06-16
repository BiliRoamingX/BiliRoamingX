package com.bapis.bilibili.app.listener.v1;

import com.google.protobuf.GeneratedMessageLite;

public class PlayInfo extends GeneratedMessageLite<PlayInfo, PlayInfo.Builder> {
    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public static class Builder extends GeneratedMessageLite.Builder<PlayInfo, Builder> {
        protected Builder(PlayInfo defaultInstance) {
            super(defaultInstance);
        }

        public Builder setCode(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setExpireTime(long j) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setFnval(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setFnver(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setFormat(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setLength(long j) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setMessage(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setPlayDash(PlayDASH playDASH) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setQn(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setQnType(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setVideoCodecid(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder addAllFormats(Iterable<? extends FormatDescription> iterable) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder addFormats(FormatDescription formatDescription) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }
}
