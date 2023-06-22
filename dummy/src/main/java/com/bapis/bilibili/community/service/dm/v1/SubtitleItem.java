package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.GeneratedMessageLite;

public class SubtitleItem extends GeneratedMessageLite<SubtitleItem, SubtitleItem.Builder> {
    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public static class Builder extends GeneratedMessageLite.Builder<SubtitleItem, Builder> {

        protected Builder(SubtitleItem defaultInstance) {
            super(defaultInstance);
        }

        public Builder setId(long j) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setIdStr(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setLan(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setLanDoc(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setLanDocBrief(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setSubtitleUrl(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setType(SubtitleType subtitleType) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setTypeValue(int i) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public long getId() {
        return 0;
    }

    public String getIdStr() {
        return "";
    }

    public String getLan() {
        return "";
    }

    public String getLanDoc() {
        return "";
    }

    public String getLanDocBrief() {
        return "";
    }

    public String getSubtitleUrl() {
        return "";
    }

    public SubtitleType getType() {
        return SubtitleType.CC;
    }

    public int getTypeValue() {
        return 0;
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }
}
