package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.viewunite.common.ActivityTab;
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
public final class TabModule extends GeneratedMessageLite<TabModule, TabModule.Builder> implements TabModuleOrBuilder {
    public static final int ACTIVITY_TAB_FIELD_NUMBER = 4;
    private static final TabModule DEFAULT_INSTANCE;
    public static final int INTRODUCTION_FIELD_NUMBER = 2;
    private static volatile Parser<TabModule> PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 3;
    public static final int TAB_TYPE_FIELD_NUMBER = 1;
    private int tabCase_ = 0;
    private int tabType_;
    private Object tab_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.TabModule$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71641 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17132xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17132xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17132xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17132xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17132xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17132xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17132xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17132xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TabModule, Builder> implements TabModuleOrBuilder {
        /* synthetic */ Builder(C71641 c71641) {
            this();
        }

        public Builder clearActivityTab() {
            copyOnWrite();
            ((TabModule) this.instance).clearActivityTab();
            return this;
        }

        public Builder clearIntroduction() {
            copyOnWrite();
            ((TabModule) this.instance).clearIntroduction();
            return this;
        }

        public Builder clearReply() {
            copyOnWrite();
            ((TabModule) this.instance).clearReply();
            return this;
        }

        public Builder clearTab() {
            copyOnWrite();
            ((TabModule) this.instance).clearTab();
            return this;
        }

        public Builder clearTabType() {
            copyOnWrite();
            ((TabModule) this.instance).clearTabType();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public ActivityTab getActivityTab() {
            return ((TabModule) this.instance).getActivityTab();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public IntroductionTab getIntroduction() {
            return ((TabModule) this.instance).getIntroduction();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public ReplyTab getReply() {
            return ((TabModule) this.instance).getReply();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public TabCase getTabCase() {
            return ((TabModule) this.instance).getTabCase();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public TabType getTabType() {
            return ((TabModule) this.instance).getTabType();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public int getTabTypeValue() {
            return ((TabModule) this.instance).getTabTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public boolean hasActivityTab() {
            return ((TabModule) this.instance).hasActivityTab();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public boolean hasIntroduction() {
            return ((TabModule) this.instance).hasIntroduction();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
        public boolean hasReply() {
            return ((TabModule) this.instance).hasReply();
        }

        public Builder mergeActivityTab(ActivityTab activityTab) {
            copyOnWrite();
            ((TabModule) this.instance).mergeActivityTab(activityTab);
            return this;
        }

        public Builder mergeIntroduction(IntroductionTab introductionTab) {
            copyOnWrite();
            ((TabModule) this.instance).mergeIntroduction(introductionTab);
            return this;
        }

        public Builder mergeReply(ReplyTab replyTab) {
            copyOnWrite();
            ((TabModule) this.instance).mergeReply(replyTab);
            return this;
        }

        public Builder setActivityTab(ActivityTab activityTab) {
            copyOnWrite();
            ((TabModule) this.instance).setActivityTab(activityTab);
            return this;
        }

        public Builder setIntroduction(IntroductionTab introductionTab) {
            copyOnWrite();
            ((TabModule) this.instance).setIntroduction(introductionTab);
            return this;
        }

        public Builder setReply(ReplyTab replyTab) {
            copyOnWrite();
            ((TabModule) this.instance).setReply(replyTab);
            return this;
        }

        public Builder setTabType(TabType tabType) {
            copyOnWrite();
            ((TabModule) this.instance).setTabType(tabType);
            return this;
        }

        public Builder setTabTypeValue(int i) {
            copyOnWrite();
            ((TabModule) this.instance).setTabTypeValue(i);
            return this;
        }

        private Builder() {
            super(TabModule.DEFAULT_INSTANCE);
        }

        public Builder setActivityTab(ActivityTab.Builder builder) {
            copyOnWrite();
            ((TabModule) this.instance).setActivityTab(builder.build());
            return this;
        }

        public Builder setIntroduction(IntroductionTab.Builder builder) {
            copyOnWrite();
            ((TabModule) this.instance).setIntroduction(builder.build());
            return this;
        }

        public Builder setReply(ReplyTab.Builder builder) {
            copyOnWrite();
            ((TabModule) this.instance).setReply(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum TabCase {
        INTRODUCTION(2),
        REPLY(3),
        ACTIVITY_TAB(4),
        TAB_NOT_SET(0);
        
        private final int value;

        TabCase(int i) {
            this.value = i;
        }

        public static TabCase forNumber(int i) {
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ACTIVITY_TAB;
                    }
                    return REPLY;
                }
                return INTRODUCTION;
            }
            return TAB_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TabCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TabModule tabModule = new TabModule();
        DEFAULT_INSTANCE = tabModule;
        GeneratedMessageLite.registerDefaultInstance(TabModule.class, tabModule);
    }

    private TabModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityTab() {
        if (this.tabCase_ == 4) {
            this.tabCase_ = 0;
            this.tab_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroduction() {
        if (this.tabCase_ == 2) {
            this.tabCase_ = 0;
            this.tab_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReply() {
        if (this.tabCase_ == 3) {
            this.tabCase_ = 0;
            this.tab_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTab() {
        this.tabCase_ = 0;
        this.tab_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTabType() {
        this.tabType_ = 0;
    }

    public static TabModule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivityTab(ActivityTab activityTab) {
        activityTab.getClass();
        if (this.tabCase_ == 4 && this.tab_ != ActivityTab.getDefaultInstance()) {
            this.tab_ = ActivityTab.newBuilder((ActivityTab) this.tab_).mergeFrom((ActivityTab) activityTab).buildPartial();
        } else {
            this.tab_ = activityTab;
        }
        this.tabCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntroduction(IntroductionTab introductionTab) {
        introductionTab.getClass();
        if (this.tabCase_ == 2 && this.tab_ != IntroductionTab.getDefaultInstance()) {
            this.tab_ = IntroductionTab.newBuilder((IntroductionTab) this.tab_).mergeFrom((IntroductionTab) introductionTab).buildPartial();
        } else {
            this.tab_ = introductionTab;
        }
        this.tabCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReply(ReplyTab replyTab) {
        replyTab.getClass();
        if (this.tabCase_ == 3 && this.tab_ != ReplyTab.getDefaultInstance()) {
            this.tab_ = ReplyTab.newBuilder((ReplyTab) this.tab_).mergeFrom((ReplyTab) replyTab).buildPartial();
        } else {
            this.tab_ = replyTab;
        }
        this.tabCase_ = 3;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TabModule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TabModule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TabModule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TabModule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityTab(ActivityTab activityTab) {
        activityTab.getClass();
        this.tab_ = activityTab;
        this.tabCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroduction(IntroductionTab introductionTab) {
        introductionTab.getClass();
        this.tab_ = introductionTab;
        this.tabCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReply(ReplyTab replyTab) {
        replyTab.getClass();
        this.tab_ = replyTab;
        this.tabCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTabType(TabType tabType) {
        this.tabType_ = tabType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTabTypeValue(int i) {
        this.tabType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71641.f17132xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TabModule();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"tab_", "tabCase_", "tabType_", IntroductionTab.class, ReplyTab.class, ActivityTab.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TabModule> parser = PARSER;
                if (parser == null) {
                    synchronized (TabModule.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public ActivityTab getActivityTab() {
        if (this.tabCase_ == 4) {
            return (ActivityTab) this.tab_;
        }
        return ActivityTab.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public IntroductionTab getIntroduction() {
        if (this.tabCase_ == 2) {
            return (IntroductionTab) this.tab_;
        }
        return IntroductionTab.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public ReplyTab getReply() {
        if (this.tabCase_ == 3) {
            return (ReplyTab) this.tab_;
        }
        return ReplyTab.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public TabCase getTabCase() {
        return TabCase.forNumber(this.tabCase_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public TabType getTabType() {
        TabType forNumber = TabType.forNumber(this.tabType_);
        return forNumber == null ? TabType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public int getTabTypeValue() {
        return this.tabType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public boolean hasActivityTab() {
        return this.tabCase_ == 4;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public boolean hasIntroduction() {
        return this.tabCase_ == 2;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.TabModuleOrBuilder
    public boolean hasReply() {
        return this.tabCase_ == 3;
    }

    public static Builder newBuilder(TabModule tabModule) {
        return DEFAULT_INSTANCE.createBuilder(tabModule);
    }

    public static TabModule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TabModule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TabModule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TabModule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TabModule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TabModule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TabModule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TabModule parseFrom(InputStream inputStream) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TabModule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TabModule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TabModule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TabModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
