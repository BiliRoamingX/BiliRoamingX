package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class DmSummon extends GeneratedMessageLite<DmSummon, DmSummon.Builder> implements MessageLiteOrBuilder {
    private static final DmSummon DEFAULT_INSTANCE;
    public static final int ERR_MSG_FIELD_NUMBER = 3;
    public static final int LONG_CONTENT_FIELD_NUMBER = 4;
    private static volatile Parser<DmSummon> PARSER = null;
    public static final int SHORT_CONTENT_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private Internal.ProtobufList<String> title_ = GeneratedMessageLite.emptyProtobufList();
    private String url_ = "";
    private String errMsg_ = "";
    private String longContent_ = "";
    private String shortContent_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.DmSummon$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16730xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16730xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16730xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16730xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16730xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16730xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16730xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16730xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DmSummon, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67571 c67571) {
            this();
        }

        public Builder addAllTitle(Iterable<String> iterable) {
            copyOnWrite();
            ((DmSummon) this.instance).addAllTitle(iterable);
            return this;
        }

        public Builder addTitle(String str) {
            copyOnWrite();
            ((DmSummon) this.instance).addTitle(str);
            return this;
        }

        public Builder addTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSummon) this.instance).addTitleBytes(byteString);
            return this;
        }

        public Builder clearErrMsg() {
            copyOnWrite();
            ((DmSummon) this.instance).clearErrMsg();
            return this;
        }

        public Builder clearLongContent() {
            copyOnWrite();
            ((DmSummon) this.instance).clearLongContent();
            return this;
        }

        public Builder clearShortContent() {
            copyOnWrite();
            ((DmSummon) this.instance).clearShortContent();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((DmSummon) this.instance).clearTitle();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((DmSummon) this.instance).clearUrl();
            return this;
        }

        public String getErrMsg() {
            return ((DmSummon) this.instance).getErrMsg();
        }

        public ByteString getErrMsgBytes() {
            return ((DmSummon) this.instance).getErrMsgBytes();
        }

        public String getLongContent() {
            return ((DmSummon) this.instance).getLongContent();
        }

        public ByteString getLongContentBytes() {
            return ((DmSummon) this.instance).getLongContentBytes();
        }

        public String getShortContent() {
            return ((DmSummon) this.instance).getShortContent();
        }

        public ByteString getShortContentBytes() {
            return ((DmSummon) this.instance).getShortContentBytes();
        }

        public String getTitle(int i) {
            return ((DmSummon) this.instance).getTitle(i);
        }

        public ByteString getTitleBytes(int i) {
            return ((DmSummon) this.instance).getTitleBytes(i);
        }

        public int getTitleCount() {
            return ((DmSummon) this.instance).getTitleCount();
        }

        public List<String> getTitleList() {
            return Collections.unmodifiableList(((DmSummon) this.instance).getTitleList());
        }

        public String getUrl() {
            return ((DmSummon) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((DmSummon) this.instance).getUrlBytes();
        }

        public Builder setErrMsg(String str) {
            copyOnWrite();
            ((DmSummon) this.instance).setErrMsg(str);
            return this;
        }

        public Builder setErrMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSummon) this.instance).setErrMsgBytes(byteString);
            return this;
        }

        public Builder setLongContent(String str) {
            copyOnWrite();
            ((DmSummon) this.instance).setLongContent(str);
            return this;
        }

        public Builder setLongContentBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSummon) this.instance).setLongContentBytes(byteString);
            return this;
        }

        public Builder setShortContent(String str) {
            copyOnWrite();
            ((DmSummon) this.instance).setShortContent(str);
            return this;
        }

        public Builder setShortContentBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSummon) this.instance).setShortContentBytes(byteString);
            return this;
        }

        public Builder setTitle(int i, String str) {
            copyOnWrite();
            ((DmSummon) this.instance).setTitle(i, str);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((DmSummon) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSummon) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(DmSummon.DEFAULT_INSTANCE);
        }
    }

    static {
        DmSummon dmSummon = new DmSummon();
        DEFAULT_INSTANCE = dmSummon;
        GeneratedMessageLite.registerDefaultInstance(DmSummon.class, dmSummon);
    }

    private DmSummon() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTitle(Iterable<String> iterable) {
        ensureTitleIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.title_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTitle(String str) {
        str.getClass();
        ensureTitleIsMutable();
        this.title_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureTitleIsMutable();
        this.title_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrMsg() {
        this.errMsg_ = getDefaultInstance().getErrMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongContent() {
        this.longContent_ = getDefaultInstance().getLongContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortContent() {
        this.shortContent_ = getDefaultInstance().getShortContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensureTitleIsMutable() {
        Internal.ProtobufList<String> protobufList = this.title_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.title_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DmSummon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmSummon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmSummon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSummon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmSummon> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrMsg(String str) {
        str.getClass();
        this.errMsg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errMsg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongContent(String str) {
        str.getClass();
        this.longContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.longContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortContent(String str) {
        str.getClass();
        this.shortContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(int i, String str) {
        str.getClass();
        ensureTitleIsMutable();
        this.title_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67571.f16730xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmSummon();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u021a\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208", new Object[]{"title_", "url_", "errMsg_", "longContent_", "shortContent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmSummon> parser = PARSER;
                if (parser == null) {
                    synchronized (DmSummon.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public String getErrMsg() {
        return this.errMsg_;
    }

    public ByteString getErrMsgBytes() {
        return ByteString.copyFromUtf8(this.errMsg_);
    }

    public String getLongContent() {
        return this.longContent_;
    }

    public ByteString getLongContentBytes() {
        return ByteString.copyFromUtf8(this.longContent_);
    }

    public String getShortContent() {
        return this.shortContent_;
    }

    public ByteString getShortContentBytes() {
        return ByteString.copyFromUtf8(this.shortContent_);
    }

    public String getTitle(int i) {
        return this.title_.get(i);
    }

    public ByteString getTitleBytes(int i) {
        return ByteString.copyFromUtf8(this.title_.get(i));
    }

    public int getTitleCount() {
        return this.title_.size();
    }

    public List<String> getTitleList() {
        return this.title_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(DmSummon dmSummon) {
        return DEFAULT_INSTANCE.createBuilder(dmSummon);
    }

    public static DmSummon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSummon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSummon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmSummon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DmSummon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmSummon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmSummon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmSummon parseFrom(InputStream inputStream) throws IOException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSummon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSummon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmSummon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSummon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
