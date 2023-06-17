package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

public class TextStyle extends GeneratedMessageLite<TextStyle, TextStyle.Builder> {
    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public static class Builder extends GeneratedMessageLite.Builder<TextStyle, Builder> {
        protected Builder(TextStyle defaultInstance) {
            super(defaultInstance);
        }

        public Builder setFontSize(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setFontStyle(FontStyle fontStyle) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setFontStyleValue(int i) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setTextDayColor(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder setTextNightColor(String str) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }

    public enum FontStyle implements Internal.EnumLite {
        NORMAL(0),
        BOLD(1),
        UNRECOGNIZED(-1);

        public static final int BOLD_VALUE = 1;
        public static final int NORMAL_VALUE = 0;
        // from class: com.bapis.bilibili.main.community.reply.v1.TextStyle.FontStyle.1
        /* JADX WARN: Can't rename method to resolve collision */// com.google.protobuf.Internal.EnumLiteMap
        private static final Internal.EnumLiteMap<FontStyle> internalValueMap = FontStyle::forNumber;
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes14.dex */
        private static final class FontStyleVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new FontStyleVerifier();

            private FontStyleVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return FontStyle.forNumber(i) != null;
            }
        }

        FontStyle(int i) {
            this.value = i;
        }

        public static FontStyle forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return BOLD;
            }
            return NORMAL;
        }

        public static Internal.EnumLiteMap<FontStyle> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return FontStyleVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static FontStyle valueOf(int i) {
            return forNumber(i);
        }
    }
}
