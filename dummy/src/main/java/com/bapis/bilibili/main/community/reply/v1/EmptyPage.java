package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;

import java.util.List;

public class EmptyPage extends GeneratedMessageLite<EmptyPage, EmptyPage.Builder> {
    @Override
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
        return null;
    }

    public String getImageUrl() {
        throw new UnsupportedOperationException("Stub");
    }

    public void setImageUrl(String str) {
        throw new UnsupportedOperationException("Stub");
    }

    public void addTexts(Text text) {
        throw new UnsupportedOperationException("Stub");
    }

    public void addAllTexts(Iterable<? extends Text> iterable) {
        throw new UnsupportedOperationException("Stub");
    }

    public void clearLeftButton() {
    }

    public void clearRightButton() {
    }

    public void clearTexts() {
    }

    public static class Builder extends GeneratedMessageLite.Builder<EmptyPage, Builder> {
        protected Builder(EmptyPage defaultInstance) {
            super(defaultInstance);
        }

        public Builder setImageUrl(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder addAllTexts(Iterable<? extends Text> iterable) {
            throw new UnsupportedOperationException("Stub");
        }

        public Builder addTexts(Text text) {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public List<Text> getTextsList() {
        throw new UnsupportedOperationException("Stub");
    }

    /**
     * clearLeftButton
     */
    static void access$3100(EmptyPage emptyPage) {
    }

    /**
     * clearRightButton
     */
    static void access$3400(EmptyPage emptyPage) {
    }

    /**
     * clearTexts
     */
    static void access$2700(EmptyPage emptyPage) {
    }

    /**
     * addTexts
     */
    static void access$2400(EmptyPage emptyPage, Text text) {
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("Stub");
    }

    public static class Text extends GeneratedMessageLite<Text, Text.Builder> {
        @Override
        protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object o, Object o1) {
            return null;
        }

        public Action getAction() {
            throw new UnsupportedOperationException("Stub");
        }

        public void setAction(Action action) {
            throw new UnsupportedOperationException("Stub");
        }

        public String getRaw() {
            throw new UnsupportedOperationException("Stub");
        }

        public void setRaw(String str) {
            throw new UnsupportedOperationException("Stub");
        }

        public TextStyle getStyle() {
            throw new UnsupportedOperationException("Stub");
        }

        public void setStyle(TextStyle textStyle) {
            throw new UnsupportedOperationException("Stub");
        }

        public static class Builder extends GeneratedMessageLite.Builder<Text, Text.Builder> {
            protected Builder(Text defaultInstance) {
                super(defaultInstance);
            }

            public Builder setAction(Action action) {
                throw new UnsupportedOperationException("Stub");
            }

            public Builder setRaw(String str) {
                throw new UnsupportedOperationException("Stub");
            }

            public Builder setStyle(TextStyle textStyle) {
                throw new UnsupportedOperationException("Stub");
            }
        }

        public static Builder newBuilder() {
            throw new UnsupportedOperationException("Stub");
        }
    }

    public enum Action implements Internal.EnumLite {
        UNAVAILABLE(0),
        SHOW_KEYBOARD(1),
        SEND_REPLY_WITH_BOLD_TEXT(2),
        UNRECOGNIZED(-1);

        public static final int SEND_REPLY_WITH_BOLD_TEXT_VALUE = 2;
        public static final int SHOW_KEYBOARD_VALUE = 1;
        public static final int UNAVAILABLE_VALUE = 0;
        // from class: com.bapis.bilibili.main.community.reply.v1.EmptyPage.Action.1
        /* JADX WARN: Can't rename method to resolve collision */// com.google.protobuf.Internal.EnumLiteMap
        private static final Internal.EnumLiteMap<Action> internalValueMap = Action::forNumber;
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes14.dex */
        private static final class ActionVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ActionVerifier();

            private ActionVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Action.forNumber(i) != null;
            }
        }

        Action(int i) {
            this.value = i;
        }

        public static Action forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return SEND_REPLY_WITH_BOLD_TEXT;
                }
                return SHOW_KEYBOARD;
            }
            return UNAVAILABLE;
        }

        public static Internal.EnumLiteMap<Action> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ActionVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Action valueOf(int i) {
            return forNumber(i);
        }
    }
}
