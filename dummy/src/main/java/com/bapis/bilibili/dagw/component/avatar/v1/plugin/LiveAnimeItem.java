package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.bapis.bilibili.dagw.component.avatar.common.ColorConfig;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class LiveAnimeItem extends GeneratedMessageLite<LiveAnimeItem, LiveAnimeItem.Builder> implements LiveAnimeItemOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final LiveAnimeItem DEFAULT_INSTANCE;
    public static final int END_RATIO_FIELD_NUMBER = 3;
    private static volatile Parser<LiveAnimeItem> PARSER = null;
    public static final int PHASE_FIELD_NUMBER = 6;
    public static final int START_OPACITY_FIELD_NUMBER = 5;
    public static final int START_RATIO_FIELD_NUMBER = 2;
    public static final int START_STROKE_FIELD_NUMBER = 4;
    private ColorConfig color_;
    private double endRatio_;
    private long phase_;
    private double startOpacity_;
    private double startRatio_;
    private double startStroke_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItem$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75461 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17388xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17388xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17388xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17388xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17388xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17388xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17388xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17388xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LiveAnimeItem, Builder> implements LiveAnimeItemOrBuilder {
        /* synthetic */ Builder(C75461 c75461) {
            this();
        }

        public Builder clearColor() {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).clearColor();
            return this;
        }

        public Builder clearEndRatio() {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).clearEndRatio();
            return this;
        }

        public Builder clearPhase() {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).clearPhase();
            return this;
        }

        public Builder clearStartOpacity() {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).clearStartOpacity();
            return this;
        }

        public Builder clearStartRatio() {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).clearStartRatio();
            return this;
        }

        public Builder clearStartStroke() {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).clearStartStroke();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
        public ColorConfig getColor() {
            return ((LiveAnimeItem) this.instance).getColor();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
        public double getEndRatio() {
            return ((LiveAnimeItem) this.instance).getEndRatio();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
        public long getPhase() {
            return ((LiveAnimeItem) this.instance).getPhase();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
        public double getStartOpacity() {
            return ((LiveAnimeItem) this.instance).getStartOpacity();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
        public double getStartRatio() {
            return ((LiveAnimeItem) this.instance).getStartRatio();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
        public double getStartStroke() {
            return ((LiveAnimeItem) this.instance).getStartStroke();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
        public boolean hasColor() {
            return ((LiveAnimeItem) this.instance).hasColor();
        }

        public Builder mergeColor(ColorConfig colorConfig) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).mergeColor(colorConfig);
            return this;
        }

        public Builder setColor(ColorConfig colorConfig) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).setColor(colorConfig);
            return this;
        }

        public Builder setEndRatio(double d) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).setEndRatio(d);
            return this;
        }

        public Builder setPhase(long j) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).setPhase(j);
            return this;
        }

        public Builder setStartOpacity(double d) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).setStartOpacity(d);
            return this;
        }

        public Builder setStartRatio(double d) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).setStartRatio(d);
            return this;
        }

        public Builder setStartStroke(double d) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).setStartStroke(d);
            return this;
        }

        private Builder() {
            super(LiveAnimeItem.DEFAULT_INSTANCE);
        }

        public Builder setColor(ColorConfig.Builder builder) {
            copyOnWrite();
            ((LiveAnimeItem) this.instance).setColor(builder.build());
            return this;
        }
    }

    static {
        LiveAnimeItem liveAnimeItem = new LiveAnimeItem();
        DEFAULT_INSTANCE = liveAnimeItem;
        GeneratedMessageLite.registerDefaultInstance(LiveAnimeItem.class, liveAnimeItem);
    }

    private LiveAnimeItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndRatio() {
        this.endRatio_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhase() {
        this.phase_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartOpacity() {
        this.startOpacity_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartRatio() {
        this.startRatio_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartStroke() {
        this.startStroke_ = 0.0d;
    }

    public static LiveAnimeItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColor(ColorConfig colorConfig) {
        colorConfig.getClass();
        ColorConfig colorConfig2 = this.color_;
        if (colorConfig2 != null && colorConfig2 != ColorConfig.getDefaultInstance()) {
            this.color_ = ColorConfig.newBuilder(this.color_).mergeFrom((ColorConfig) colorConfig).buildPartial();
        } else {
            this.color_ = colorConfig;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LiveAnimeItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LiveAnimeItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveAnimeItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LiveAnimeItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(ColorConfig colorConfig) {
        colorConfig.getClass();
        this.color_ = colorConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndRatio(double d) {
        this.endRatio_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhase(long j) {
        this.phase_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartOpacity(double d) {
        this.startOpacity_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartRatio(double d) {
        this.startRatio_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartStroke(double d) {
        this.startStroke_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75461.f17388xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LiveAnimeItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0000\u0006\u0002", new Object[]{"color_", "startRatio_", "endRatio_", "startStroke_", "startOpacity_", "phase_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LiveAnimeItem> parser = PARSER;
                if (parser == null) {
                    synchronized (LiveAnimeItem.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
    public ColorConfig getColor() {
        ColorConfig colorConfig = this.color_;
        return colorConfig == null ? ColorConfig.getDefaultInstance() : colorConfig;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
    public double getEndRatio() {
        return this.endRatio_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
    public long getPhase() {
        return this.phase_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
    public double getStartOpacity() {
        return this.startOpacity_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
    public double getStartRatio() {
        return this.startRatio_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
    public double getStartStroke() {
        return this.startStroke_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveAnimeItemOrBuilder
    public boolean hasColor() {
        return this.color_ != null;
    }

    public static Builder newBuilder(LiveAnimeItem liveAnimeItem) {
        return DEFAULT_INSTANCE.createBuilder(liveAnimeItem);
    }

    public static LiveAnimeItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveAnimeItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveAnimeItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LiveAnimeItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LiveAnimeItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LiveAnimeItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LiveAnimeItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LiveAnimeItem parseFrom(InputStream inputStream) throws IOException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveAnimeItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveAnimeItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LiveAnimeItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveAnimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
