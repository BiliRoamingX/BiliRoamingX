package com.bapis.bilibili.app.distribution.setting.experimental;

import com.bapis.bilibili.app.distribution.Int64Value;
import com.bapis.bilibili.app.distribution.StringValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class TopLeft extends GeneratedMessageLite<TopLeft, TopLeft.C8362b> implements MessageLiteOrBuilder {
    public static final int BADGE_FIELD_NUMBER = 13;
    private static final TopLeft DEFAULT_INSTANCE;
    public static final int GOTOV2_FIELD_NUMBER = 12;
    public static final int GOTO_FIELD_NUMBER = 10;
    public static final int IOSLISTENBACKGROUNDIMAGE_FIELD_NUMBER = 9;
    public static final int IOSLISTENFOREGROUNDIMAGE_FIELD_NUMBER = 8;
    public static final int IOSSTORYBACKGROUNDIMAGE_FIELD_NUMBER = 7;
    public static final int IOSSTORYFOREGROUNDIMAGE_FIELD_NUMBER = 6;
    public static final int LISTENBACKGROUNDIMAGE_FIELD_NUMBER = 5;
    public static final int LISTENFOREGROUNDIMAGE_FIELD_NUMBER = 4;
    private static volatile Parser<TopLeft> PARSER = null;
    public static final int STORYBACKGROUNDIMAGE_FIELD_NUMBER = 3;
    public static final int STORYFOREGROUNDIMAGE_FIELD_NUMBER = 2;
    public static final int URLV2_FIELD_NUMBER = 11;
    public static final int URL_FIELD_NUMBER = 1;
    private StringValue badge_;
    private Int64Value gotoV2_;
    private StringValue goto_;
    private StringValue iosListenBackgroundImage_;
    private StringValue iosListenForegroundImage_;
    private StringValue iosStoryBackgroundImage_;
    private StringValue iosStoryForegroundImage_;
    private StringValue listenBackgroundImage_;
    private StringValue listenForegroundImage_;
    private StringValue storyBackgroundImage_;
    private StringValue storyForegroundImage_;
    private StringValue urlV2_;
    private StringValue url_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.TopLeft$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8361a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19937xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19937xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19937xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19937xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19937xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19937xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19937xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19937xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.TopLeft$b */
    /* loaded from: classes13.dex */
    public static final class C8362b extends GeneratedMessageLite.Builder<TopLeft, C8362b> implements MessageLiteOrBuilder {
        /* synthetic */ C8362b(C8361a c8361a) {
            this();
        }

        public C8362b clearBadge() {
            copyOnWrite();
            ((TopLeft) this.instance).clearBadge();
            return this;
        }

        public C8362b clearGoto() {
            copyOnWrite();
            ((TopLeft) this.instance).clearGoto();
            return this;
        }

        public C8362b clearGotoV2() {
            copyOnWrite();
            ((TopLeft) this.instance).clearGotoV2();
            return this;
        }

        public C8362b clearIosListenBackgroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearIosListenBackgroundImage();
            return this;
        }

        public C8362b clearIosListenForegroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearIosListenForegroundImage();
            return this;
        }

        public C8362b clearIosStoryBackgroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearIosStoryBackgroundImage();
            return this;
        }

        public C8362b clearIosStoryForegroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearIosStoryForegroundImage();
            return this;
        }

        public C8362b clearListenBackgroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearListenBackgroundImage();
            return this;
        }

        public C8362b clearListenForegroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearListenForegroundImage();
            return this;
        }

        public C8362b clearStoryBackgroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearStoryBackgroundImage();
            return this;
        }

        public C8362b clearStoryForegroundImage() {
            copyOnWrite();
            ((TopLeft) this.instance).clearStoryForegroundImage();
            return this;
        }

        public C8362b clearUrl() {
            copyOnWrite();
            ((TopLeft) this.instance).clearUrl();
            return this;
        }

        public C8362b clearUrlV2() {
            copyOnWrite();
            ((TopLeft) this.instance).clearUrlV2();
            return this;
        }

        public StringValue getBadge() {
            return ((TopLeft) this.instance).getBadge();
        }

        public StringValue getGoto() {
            return ((TopLeft) this.instance).getGoto();
        }

        public Int64Value getGotoV2() {
            return ((TopLeft) this.instance).getGotoV2();
        }

        public StringValue getIosListenBackgroundImage() {
            return ((TopLeft) this.instance).getIosListenBackgroundImage();
        }

        public StringValue getIosListenForegroundImage() {
            return ((TopLeft) this.instance).getIosListenForegroundImage();
        }

        public StringValue getIosStoryBackgroundImage() {
            return ((TopLeft) this.instance).getIosStoryBackgroundImage();
        }

        public StringValue getIosStoryForegroundImage() {
            return ((TopLeft) this.instance).getIosStoryForegroundImage();
        }

        public StringValue getListenBackgroundImage() {
            return ((TopLeft) this.instance).getListenBackgroundImage();
        }

        public StringValue getListenForegroundImage() {
            return ((TopLeft) this.instance).getListenForegroundImage();
        }

        public StringValue getStoryBackgroundImage() {
            return ((TopLeft) this.instance).getStoryBackgroundImage();
        }

        public StringValue getStoryForegroundImage() {
            return ((TopLeft) this.instance).getStoryForegroundImage();
        }

        public StringValue getUrl() {
            return ((TopLeft) this.instance).getUrl();
        }

        public StringValue getUrlV2() {
            return ((TopLeft) this.instance).getUrlV2();
        }

        public boolean hasBadge() {
            return ((TopLeft) this.instance).hasBadge();
        }

        public boolean hasGoto() {
            return ((TopLeft) this.instance).hasGoto();
        }

        public boolean hasGotoV2() {
            return ((TopLeft) this.instance).hasGotoV2();
        }

        public boolean hasIosListenBackgroundImage() {
            return ((TopLeft) this.instance).hasIosListenBackgroundImage();
        }

        public boolean hasIosListenForegroundImage() {
            return ((TopLeft) this.instance).hasIosListenForegroundImage();
        }

        public boolean hasIosStoryBackgroundImage() {
            return ((TopLeft) this.instance).hasIosStoryBackgroundImage();
        }

        public boolean hasIosStoryForegroundImage() {
            return ((TopLeft) this.instance).hasIosStoryForegroundImage();
        }

        public boolean hasListenBackgroundImage() {
            return ((TopLeft) this.instance).hasListenBackgroundImage();
        }

        public boolean hasListenForegroundImage() {
            return ((TopLeft) this.instance).hasListenForegroundImage();
        }

        public boolean hasStoryBackgroundImage() {
            return ((TopLeft) this.instance).hasStoryBackgroundImage();
        }

        public boolean hasStoryForegroundImage() {
            return ((TopLeft) this.instance).hasStoryForegroundImage();
        }

        public boolean hasUrl() {
            return ((TopLeft) this.instance).hasUrl();
        }

        public boolean hasUrlV2() {
            return ((TopLeft) this.instance).hasUrlV2();
        }

        public C8362b mergeBadge(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeBadge(stringValue);
            return this;
        }

        public C8362b mergeGoto(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeGoto(stringValue);
            return this;
        }

        public C8362b mergeGotoV2(Int64Value int64Value) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeGotoV2(int64Value);
            return this;
        }

        public C8362b mergeIosListenBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeIosListenBackgroundImage(stringValue);
            return this;
        }

        public C8362b mergeIosListenForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeIosListenForegroundImage(stringValue);
            return this;
        }

        public C8362b mergeIosStoryBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeIosStoryBackgroundImage(stringValue);
            return this;
        }

        public C8362b mergeIosStoryForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeIosStoryForegroundImage(stringValue);
            return this;
        }

        public C8362b mergeListenBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeListenBackgroundImage(stringValue);
            return this;
        }

        public C8362b mergeListenForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeListenForegroundImage(stringValue);
            return this;
        }

        public C8362b mergeStoryBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeStoryBackgroundImage(stringValue);
            return this;
        }

        public C8362b mergeStoryForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeStoryForegroundImage(stringValue);
            return this;
        }

        public C8362b mergeUrl(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeUrl(stringValue);
            return this;
        }

        public C8362b mergeUrlV2(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).mergeUrlV2(stringValue);
            return this;
        }

        public C8362b setBadge(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setBadge(stringValue);
            return this;
        }

        public C8362b setGoto(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setGoto(stringValue);
            return this;
        }

        public C8362b setGotoV2(Int64Value int64Value) {
            copyOnWrite();
            ((TopLeft) this.instance).setGotoV2(int64Value);
            return this;
        }

        public C8362b setIosListenBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosListenBackgroundImage(stringValue);
            return this;
        }

        public C8362b setIosListenForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosListenForegroundImage(stringValue);
            return this;
        }

        public C8362b setIosStoryBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosStoryBackgroundImage(stringValue);
            return this;
        }

        public C8362b setIosStoryForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosStoryForegroundImage(stringValue);
            return this;
        }

        public C8362b setListenBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setListenBackgroundImage(stringValue);
            return this;
        }

        public C8362b setListenForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setListenForegroundImage(stringValue);
            return this;
        }

        public C8362b setStoryBackgroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setStoryBackgroundImage(stringValue);
            return this;
        }

        public C8362b setStoryForegroundImage(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setStoryForegroundImage(stringValue);
            return this;
        }

        public C8362b setUrl(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setUrl(stringValue);
            return this;
        }

        public C8362b setUrlV2(StringValue stringValue) {
            copyOnWrite();
            ((TopLeft) this.instance).setUrlV2(stringValue);
            return this;
        }

        private C8362b() {
            super(TopLeft.DEFAULT_INSTANCE);
        }

        public C8362b setBadge(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setBadge(c8329b.build());
            return this;
        }

        public C8362b setGoto(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setGoto(c8329b.build());
            return this;
        }

        public C8362b setGotoV2(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((TopLeft) this.instance).setGotoV2(c8322b.build());
            return this;
        }

        public C8362b setIosListenBackgroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosListenBackgroundImage(c8329b.build());
            return this;
        }

        public C8362b setIosListenForegroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosListenForegroundImage(c8329b.build());
            return this;
        }

        public C8362b setIosStoryBackgroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosStoryBackgroundImage(c8329b.build());
            return this;
        }

        public C8362b setIosStoryForegroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setIosStoryForegroundImage(c8329b.build());
            return this;
        }

        public C8362b setListenBackgroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setListenBackgroundImage(c8329b.build());
            return this;
        }

        public C8362b setListenForegroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setListenForegroundImage(c8329b.build());
            return this;
        }

        public C8362b setStoryBackgroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setStoryBackgroundImage(c8329b.build());
            return this;
        }

        public C8362b setStoryForegroundImage(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setStoryForegroundImage(c8329b.build());
            return this;
        }

        public C8362b setUrl(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setUrl(c8329b.build());
            return this;
        }

        public C8362b setUrlV2(StringValue.C8329b c8329b) {
            copyOnWrite();
            ((TopLeft) this.instance).setUrlV2(c8329b.build());
            return this;
        }
    }

    static {
        TopLeft topLeft = new TopLeft();
        DEFAULT_INSTANCE = topLeft;
        GeneratedMessageLite.registerDefaultInstance(TopLeft.class, topLeft);
    }

    private TopLeft() {
    }

    public void clearBadge() {
        this.badge_ = null;
    }

    public void clearGoto() {
        this.goto_ = null;
    }

    public void clearGotoV2() {
        this.gotoV2_ = null;
    }

    public void clearIosListenBackgroundImage() {
        this.iosListenBackgroundImage_ = null;
    }

    public void clearIosListenForegroundImage() {
        this.iosListenForegroundImage_ = null;
    }

    public void clearIosStoryBackgroundImage() {
        this.iosStoryBackgroundImage_ = null;
    }

    public void clearIosStoryForegroundImage() {
        this.iosStoryForegroundImage_ = null;
    }

    public void clearListenBackgroundImage() {
        this.listenBackgroundImage_ = null;
    }

    public void clearListenForegroundImage() {
        this.listenForegroundImage_ = null;
    }

    public void clearStoryBackgroundImage() {
        this.storyBackgroundImage_ = null;
    }

    public void clearStoryForegroundImage() {
        this.storyForegroundImage_ = null;
    }

    public void clearUrl() {
        this.url_ = null;
    }

    public void clearUrlV2() {
        this.urlV2_ = null;
    }

    public static TopLeft getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeBadge(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.badge_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.badge_ = StringValue.newBuilder(this.badge_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.badge_ = stringValue;
        }
    }

    public void mergeGoto(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.goto_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.goto_ = StringValue.newBuilder(this.goto_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.goto_ = stringValue;
        }
    }

    public void mergeGotoV2(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.gotoV2_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.gotoV2_ = Int64Value.newBuilder(this.gotoV2_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.gotoV2_ = int64Value;
        }
    }

    public void mergeIosListenBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.iosListenBackgroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.iosListenBackgroundImage_ = StringValue.newBuilder(this.iosListenBackgroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.iosListenBackgroundImage_ = stringValue;
        }
    }

    public void mergeIosListenForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.iosListenForegroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.iosListenForegroundImage_ = StringValue.newBuilder(this.iosListenForegroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.iosListenForegroundImage_ = stringValue;
        }
    }

    public void mergeIosStoryBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.iosStoryBackgroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.iosStoryBackgroundImage_ = StringValue.newBuilder(this.iosStoryBackgroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.iosStoryBackgroundImage_ = stringValue;
        }
    }

    public void mergeIosStoryForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.iosStoryForegroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.iosStoryForegroundImage_ = StringValue.newBuilder(this.iosStoryForegroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.iosStoryForegroundImage_ = stringValue;
        }
    }

    public void mergeListenBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.listenBackgroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.listenBackgroundImage_ = StringValue.newBuilder(this.listenBackgroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.listenBackgroundImage_ = stringValue;
        }
    }

    public void mergeListenForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.listenForegroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.listenForegroundImage_ = StringValue.newBuilder(this.listenForegroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.listenForegroundImage_ = stringValue;
        }
    }

    public void mergeStoryBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.storyBackgroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.storyBackgroundImage_ = StringValue.newBuilder(this.storyBackgroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.storyBackgroundImage_ = stringValue;
        }
    }

    public void mergeStoryForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.storyForegroundImage_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.storyForegroundImage_ = StringValue.newBuilder(this.storyForegroundImage_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.storyForegroundImage_ = stringValue;
        }
    }

    public void mergeUrl(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.url_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.url_ = StringValue.newBuilder(this.url_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.url_ = stringValue;
        }
    }

    public void mergeUrlV2(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.urlV2_;
        if (stringValue2 != null && stringValue2 != StringValue.getDefaultInstance()) {
            this.urlV2_ = StringValue.newBuilder(this.urlV2_).mergeFrom((StringValue) stringValue).buildPartial();
        } else {
            this.urlV2_ = stringValue;
        }
    }

    public static C8362b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TopLeft parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TopLeft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopLeft parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TopLeft> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setBadge(StringValue stringValue) {
        stringValue.getClass();
        this.badge_ = stringValue;
    }

    public void setGoto(StringValue stringValue) {
        stringValue.getClass();
        this.goto_ = stringValue;
    }

    public void setGotoV2(Int64Value int64Value) {
        int64Value.getClass();
        this.gotoV2_ = int64Value;
    }

    public void setIosListenBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.iosListenBackgroundImage_ = stringValue;
    }

    public void setIosListenForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.iosListenForegroundImage_ = stringValue;
    }

    public void setIosStoryBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.iosStoryBackgroundImage_ = stringValue;
    }

    public void setIosStoryForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.iosStoryForegroundImage_ = stringValue;
    }

    public void setListenBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.listenBackgroundImage_ = stringValue;
    }

    public void setListenForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.listenForegroundImage_ = stringValue;
    }

    public void setStoryBackgroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.storyBackgroundImage_ = stringValue;
    }

    public void setStoryForegroundImage(StringValue stringValue) {
        stringValue.getClass();
        this.storyForegroundImage_ = stringValue;
    }

    public void setUrl(StringValue stringValue) {
        stringValue.getClass();
        this.url_ = stringValue;
    }

    public void setUrlV2(StringValue stringValue) {
        stringValue.getClass();
        this.urlV2_ = stringValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8361a.f19937xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TopLeft();
            case 2:
                return new C8362b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t", new Object[]{"url_", "storyForegroundImage_", "storyBackgroundImage_", "listenForegroundImage_", "listenBackgroundImage_", "iosStoryForegroundImage_", "iosStoryBackgroundImage_", "iosListenForegroundImage_", "iosListenBackgroundImage_", "goto_", "urlV2_", "gotoV2_", "badge_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TopLeft> parser = PARSER;
                if (parser == null) {
                    synchronized (TopLeft.class) {
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

    public StringValue getBadge() {
        StringValue stringValue = this.badge_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getGoto() {
        StringValue stringValue = this.goto_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public Int64Value getGotoV2() {
        Int64Value int64Value = this.gotoV2_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public StringValue getIosListenBackgroundImage() {
        StringValue stringValue = this.iosListenBackgroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getIosListenForegroundImage() {
        StringValue stringValue = this.iosListenForegroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getIosStoryBackgroundImage() {
        StringValue stringValue = this.iosStoryBackgroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getIosStoryForegroundImage() {
        StringValue stringValue = this.iosStoryForegroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getListenBackgroundImage() {
        StringValue stringValue = this.listenBackgroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getListenForegroundImage() {
        StringValue stringValue = this.listenForegroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getStoryBackgroundImage() {
        StringValue stringValue = this.storyBackgroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getStoryForegroundImage() {
        StringValue stringValue = this.storyForegroundImage_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getUrl() {
        StringValue stringValue = this.url_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValue getUrlV2() {
        StringValue stringValue = this.urlV2_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public boolean hasBadge() {
        return this.badge_ != null;
    }

    public boolean hasGoto() {
        return this.goto_ != null;
    }

    public boolean hasGotoV2() {
        return this.gotoV2_ != null;
    }

    public boolean hasIosListenBackgroundImage() {
        return this.iosListenBackgroundImage_ != null;
    }

    public boolean hasIosListenForegroundImage() {
        return this.iosListenForegroundImage_ != null;
    }

    public boolean hasIosStoryBackgroundImage() {
        return this.iosStoryBackgroundImage_ != null;
    }

    public boolean hasIosStoryForegroundImage() {
        return this.iosStoryForegroundImage_ != null;
    }

    public boolean hasListenBackgroundImage() {
        return this.listenBackgroundImage_ != null;
    }

    public boolean hasListenForegroundImage() {
        return this.listenForegroundImage_ != null;
    }

    public boolean hasStoryBackgroundImage() {
        return this.storyBackgroundImage_ != null;
    }

    public boolean hasStoryForegroundImage() {
        return this.storyForegroundImage_ != null;
    }

    public boolean hasUrl() {
        return this.url_ != null;
    }

    public boolean hasUrlV2() {
        return this.urlV2_ != null;
    }

    public static C8362b newBuilder(TopLeft topLeft) {
        return DEFAULT_INSTANCE.createBuilder(topLeft);
    }

    public static TopLeft parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopLeft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopLeft parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TopLeft parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TopLeft parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TopLeft parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TopLeft parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TopLeft parseFrom(InputStream inputStream) throws IOException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopLeft parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopLeft parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TopLeft parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
