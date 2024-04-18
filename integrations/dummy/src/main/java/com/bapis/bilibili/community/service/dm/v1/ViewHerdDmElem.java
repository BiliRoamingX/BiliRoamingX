package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes14.dex */
public final class ViewHerdDmElem extends GeneratedMessageLite<ViewHerdDmElem, ViewHerdDmElem.Builder> implements ViewHerdDmElemOrBuilder {
    private static final ViewHerdDmElem DEFAULT_INSTANCE;
    public static final int END_PROGRESS_FIELD_NUMBER = 6;
    public static final int HERD_END_CNT_FIELD_NUMBER = 3;
    public static final int HERD_MSG_FIELD_NUMBER = 1;
    public static final int HERD_START_CNT_FIELD_NUMBER = 2;
    private static volatile Parser<ViewHerdDmElem> PARSER = null;
    public static final int REGEX_RULE_FIELD_NUMBER = 4;
    public static final int START_PROGRESS_FIELD_NUMBER = 5;
    private int endProgress_;
    private int herdEndCnt_;
    private int herdStartCnt_;
    private int startProgress_;
    private String herdMsg_ = "";
    private String regexRule_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElem$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17107xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17107xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17107xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewHerdDmElem, Builder> implements ViewHerdDmElemOrBuilder {
        /* synthetic */ Builder(C72741 c72741) {
            this();
        }

        public Builder clearEndProgress() {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).clearEndProgress();
            return this;
        }

        public Builder clearHerdEndCnt() {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).clearHerdEndCnt();
            return this;
        }

        public Builder clearHerdMsg() {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).clearHerdMsg();
            return this;
        }

        public Builder clearHerdStartCnt() {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).clearHerdStartCnt();
            return this;
        }

        public Builder clearRegexRule() {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).clearRegexRule();
            return this;
        }

        public Builder clearStartProgress() {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).clearStartProgress();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public int getEndProgress() {
            return ((ViewHerdDmElem) this.instance).getEndProgress();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public int getHerdEndCnt() {
            return ((ViewHerdDmElem) this.instance).getHerdEndCnt();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public String getHerdMsg() {
            return ((ViewHerdDmElem) this.instance).getHerdMsg();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public ByteString getHerdMsgBytes() {
            return ((ViewHerdDmElem) this.instance).getHerdMsgBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public int getHerdStartCnt() {
            return ((ViewHerdDmElem) this.instance).getHerdStartCnt();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public String getRegexRule() {
            return ((ViewHerdDmElem) this.instance).getRegexRule();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public ByteString getRegexRuleBytes() {
            return ((ViewHerdDmElem) this.instance).getRegexRuleBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
        public int getStartProgress() {
            return ((ViewHerdDmElem) this.instance).getStartProgress();
        }

        public Builder setEndProgress(int i) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setEndProgress(i);
            return this;
        }

        public Builder setHerdEndCnt(int i) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setHerdEndCnt(i);
            return this;
        }

        public Builder setHerdMsg(String str) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setHerdMsg(str);
            return this;
        }

        public Builder setHerdMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setHerdMsgBytes(byteString);
            return this;
        }

        public Builder setHerdStartCnt(int i) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setHerdStartCnt(i);
            return this;
        }

        public Builder setRegexRule(String str) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setRegexRule(str);
            return this;
        }

        public Builder setRegexRuleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setRegexRuleBytes(byteString);
            return this;
        }

        public Builder setStartProgress(int i) {
            copyOnWrite();
            ((ViewHerdDmElem) this.instance).setStartProgress(i);
            return this;
        }

        private Builder() {
            super(ViewHerdDmElem.DEFAULT_INSTANCE);
        }
    }

    static {
        ViewHerdDmElem viewHerdDmElem = new ViewHerdDmElem();
        DEFAULT_INSTANCE = viewHerdDmElem;
        GeneratedMessageLite.registerDefaultInstance(ViewHerdDmElem.class, viewHerdDmElem);
    }

    private ViewHerdDmElem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndProgress() {
        this.endProgress_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHerdEndCnt() {
        this.herdEndCnt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHerdMsg() {
        this.herdMsg_ = getDefaultInstance().getHerdMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHerdStartCnt() {
        this.herdStartCnt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegexRule() {
        this.regexRule_ = getDefaultInstance().getRegexRule();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartProgress() {
        this.startProgress_ = 0;
    }

    public static ViewHerdDmElem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewHerdDmElem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewHerdDmElem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewHerdDmElem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndProgress(int i) {
        this.endProgress_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHerdEndCnt(int i) {
        this.herdEndCnt_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHerdMsg(String str) {
        str.getClass();
        this.herdMsg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHerdMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.herdMsg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHerdStartCnt(int i) {
        this.herdStartCnt_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegexRule(String str) {
        str.getClass();
        this.regexRule_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegexRuleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.regexRule_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartProgress(int i) {
        this.startProgress_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72741.f17107xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewHerdDmElem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0004\u0004\u0208\u0005\u0004\u0006\u0004", new Object[]{"herdMsg_", "herdStartCnt_", "herdEndCnt_", "regexRule_", "startProgress_", "endProgress_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewHerdDmElem> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewHerdDmElem.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public int getEndProgress() {
        return this.endProgress_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public int getHerdEndCnt() {
        return this.herdEndCnt_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public String getHerdMsg() {
        return this.herdMsg_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public ByteString getHerdMsgBytes() {
        return ByteString.copyFromUtf8(this.herdMsg_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public int getHerdStartCnt() {
        return this.herdStartCnt_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public String getRegexRule() {
        return this.regexRule_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public ByteString getRegexRuleBytes() {
        return ByteString.copyFromUtf8(this.regexRule_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElemOrBuilder
    public int getStartProgress() {
        return this.startProgress_;
    }

    public static Builder newBuilder(ViewHerdDmElem viewHerdDmElem) {
        return DEFAULT_INSTANCE.createBuilder(viewHerdDmElem);
    }

    public static ViewHerdDmElem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewHerdDmElem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewHerdDmElem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewHerdDmElem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewHerdDmElem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewHerdDmElem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewHerdDmElem parseFrom(InputStream inputStream) throws IOException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewHerdDmElem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewHerdDmElem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewHerdDmElem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewHerdDmElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
