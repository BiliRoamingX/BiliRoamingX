package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes17.dex */
public final class ViewBase extends GeneratedMessageLite<ViewBase, ViewBase.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_RESOURCE_FIELD_NUMBER = 4;
    public static final int BIZ_TYPE_FIELD_NUMBER = 1;
    public static final int CONFIG_FIELD_NUMBER = 5;
    public static final int CONTROL_FIELD_NUMBER = 3;
    private static final ViewBase DEFAULT_INSTANCE;
    public static final int PAGE_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<ViewBase> PARSER;
    private ActivityResource activityResource_;
    private int bizType_;
    private Config config_;
    private PageControl control_;
    private int pageType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ViewBase$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17138xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17138xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17138xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17138xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17138xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17138xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17138xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17138xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewBase, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71721 c71721) {
            this();
        }

        public Builder clearActivityResource() {
            copyOnWrite();
            ((ViewBase) this.instance).clearActivityResource();
            return this;
        }

        public Builder clearBizType() {
            copyOnWrite();
            ((ViewBase) this.instance).clearBizType();
            return this;
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((ViewBase) this.instance).clearConfig();
            return this;
        }

        public Builder clearControl() {
            copyOnWrite();
            ((ViewBase) this.instance).clearControl();
            return this;
        }

        public Builder clearPageType() {
            copyOnWrite();
            ((ViewBase) this.instance).clearPageType();
            return this;
        }

        public ActivityResource getActivityResource() {
            return ((ViewBase) this.instance).getActivityResource();
        }

        public com.bapis.bilibili.playershared.BizType getBizType() {
            return ((ViewBase) this.instance).getBizType();
        }

        public int getBizTypeValue() {
            return ((ViewBase) this.instance).getBizTypeValue();
        }

        public Config getConfig() {
            return ((ViewBase) this.instance).getConfig();
        }

        public PageControl getControl() {
            return ((ViewBase) this.instance).getControl();
        }

        public PageCategory getPageType() {
            return ((ViewBase) this.instance).getPageType();
        }

        public int getPageTypeValue() {
            return ((ViewBase) this.instance).getPageTypeValue();
        }

        public boolean hasActivityResource() {
            return ((ViewBase) this.instance).hasActivityResource();
        }

        public boolean hasConfig() {
            return ((ViewBase) this.instance).hasConfig();
        }

        public boolean hasControl() {
            return ((ViewBase) this.instance).hasControl();
        }

        public Builder mergeActivityResource(ActivityResource activityResource) {
            copyOnWrite();
            ((ViewBase) this.instance).mergeActivityResource(activityResource);
            return this;
        }

        public Builder mergeConfig(Config config) {
            copyOnWrite();
            ((ViewBase) this.instance).mergeConfig(config);
            return this;
        }

        public Builder mergeControl(PageControl pageControl) {
            copyOnWrite();
            ((ViewBase) this.instance).mergeControl(pageControl);
            return this;
        }

        public Builder setActivityResource(ActivityResource activityResource) {
            copyOnWrite();
            ((ViewBase) this.instance).setActivityResource(activityResource);
            return this;
        }

        public Builder setBizType(com.bapis.bilibili.playershared.BizType bizType) {
            copyOnWrite();
            ((ViewBase) this.instance).setBizType(bizType);
            return this;
        }

        public Builder setBizTypeValue(int i) {
            copyOnWrite();
            ((ViewBase) this.instance).setBizTypeValue(i);
            return this;
        }

        public Builder setConfig(Config config) {
            copyOnWrite();
            ((ViewBase) this.instance).setConfig(config);
            return this;
        }

        public Builder setControl(PageControl pageControl) {
            copyOnWrite();
            ((ViewBase) this.instance).setControl(pageControl);
            return this;
        }

        public Builder setPageType(PageCategory pageCategory) {
            copyOnWrite();
            ((ViewBase) this.instance).setPageType(pageCategory);
            return this;
        }

        public Builder setPageTypeValue(int i) {
            copyOnWrite();
            ((ViewBase) this.instance).setPageTypeValue(i);
            return this;
        }

        private Builder() {
            super(ViewBase.DEFAULT_INSTANCE);
        }

        public Builder setActivityResource(ActivityResource.Builder builder) {
            copyOnWrite();
            ((ViewBase) this.instance).setActivityResource(builder.build());
            return this;
        }

        public Builder setConfig(Config.Builder builder) {
            copyOnWrite();
            ((ViewBase) this.instance).setConfig(builder.build());
            return this;
        }

        public Builder setControl(PageControl.Builder builder) {
            copyOnWrite();
            ((ViewBase) this.instance).setControl(builder.build());
            return this;
        }
    }

    static {
        ViewBase viewBase = new ViewBase();
        DEFAULT_INSTANCE = viewBase;
        GeneratedMessageLite.registerDefaultInstance(ViewBase.class, viewBase);
    }

    private ViewBase() {
    }

    public void clearActivityResource() {
        this.activityResource_ = null;
    }

    public void clearBizType() {
        this.bizType_ = 0;
    }

    public void clearConfig() {
        this.config_ = null;
    }

    public void clearControl() {
        this.control_ = null;
    }

    public void clearPageType() {
        this.pageType_ = 0;
    }

    public static ViewBase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeActivityResource(ActivityResource activityResource) {
        activityResource.getClass();
        ActivityResource activityResource2 = this.activityResource_;
        if (activityResource2 != null && activityResource2 != ActivityResource.getDefaultInstance()) {
            this.activityResource_ = ActivityResource.newBuilder(this.activityResource_).mergeFrom((ActivityResource) activityResource).buildPartial();
        } else {
            this.activityResource_ = activityResource;
        }
    }

    public void mergeConfig(Config config) {
        config.getClass();
        Config config2 = this.config_;
        if (config2 != null && config2 != Config.getDefaultInstance()) {
            this.config_ = Config.newBuilder(this.config_).mergeFrom((Config) config).buildPartial();
        } else {
            this.config_ = config;
        }
    }

    public void mergeControl(PageControl pageControl) {
        pageControl.getClass();
        PageControl pageControl2 = this.control_;
        if (pageControl2 != null && pageControl2 != PageControl.getDefaultInstance()) {
            this.control_ = PageControl.newBuilder(this.control_).mergeFrom((PageControl) pageControl).buildPartial();
        } else {
            this.control_ = pageControl;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewBase parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewBase) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewBase parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewBase> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setActivityResource(ActivityResource activityResource) {
        activityResource.getClass();
        this.activityResource_ = activityResource;
    }

    public void setBizType(com.bapis.bilibili.playershared.BizType bizType) {
        this.bizType_ = bizType.getNumber();
    }

    public void setBizTypeValue(int i) {
        this.bizType_ = i;
    }

    public void setConfig(Config config) {
        config.getClass();
        this.config_ = config;
    }

    public void setControl(PageControl pageControl) {
        pageControl.getClass();
        this.control_ = pageControl;
    }

    public void setPageType(PageCategory pageCategory) {
        this.pageType_ = pageCategory.getNumber();
    }

    public void setPageTypeValue(int i) {
        this.pageType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71721.f17138xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewBase();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\t\u0004\t\u0005\t", new Object[]{"bizType_", "pageType_", "control_", "activityResource_", "config_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewBase> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewBase.class) {
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

    public ActivityResource getActivityResource() {
        ActivityResource activityResource = this.activityResource_;
        return activityResource == null ? ActivityResource.getDefaultInstance() : activityResource;
    }

    public com.bapis.bilibili.playershared.BizType getBizType() {
        com.bapis.bilibili.playershared.BizType forNumber = com.bapis.bilibili.playershared.BizType.forNumber(this.bizType_);
        return forNumber == null ? com.bapis.bilibili.playershared.BizType.UNRECOGNIZED : forNumber;
    }

    public int getBizTypeValue() {
        return this.bizType_;
    }

    public Config getConfig() {
        Config config = this.config_;
        return config == null ? Config.getDefaultInstance() : config;
    }

    public PageControl getControl() {
        PageControl pageControl = this.control_;
        return pageControl == null ? PageControl.getDefaultInstance() : pageControl;
    }

    public PageCategory getPageType() {
        PageCategory forNumber = PageCategory.forNumber(this.pageType_);
        return forNumber == null ? PageCategory.UNRECOGNIZED : forNumber;
    }

    public int getPageTypeValue() {
        return this.pageType_;
    }

    public boolean hasActivityResource() {
        return this.activityResource_ != null;
    }

    public boolean hasConfig() {
        return this.config_ != null;
    }

    public boolean hasControl() {
        return this.control_ != null;
    }

    public static Builder newBuilder(ViewBase viewBase) {
        return DEFAULT_INSTANCE.createBuilder(viewBase);
    }

    public static ViewBase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewBase) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewBase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewBase parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewBase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewBase parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewBase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewBase parseFrom(InputStream inputStream) throws IOException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewBase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewBase parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewBase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewBase) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
