package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class LabelV2 extends GeneratedMessageLite<LabelV2, LabelV2.Builder> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final LabelV2 DEFAULT_INSTANCE;
    public static final int EXPOSURE_ONCE_FIELD_NUMBER = 3;
    public static final int EXPOSURE_TYPE_FIELD_NUMBER = 4;
    private static volatile Parser<LabelV2> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean exposureOnce_;
    private int exposureType_;
    private String title_ = "";
    private Internal.ProtobufList<String> content_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.LabelV2$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17074xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17074xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LabelV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72341 c72341) {
            this();
        }

        public Builder addAllContent(Iterable<String> iterable) {
            copyOnWrite();
            ((LabelV2) this.instance).addAllContent(iterable);
            return this;
        }

        public Builder addContent(String str) {
            copyOnWrite();
            ((LabelV2) this.instance).addContent(str);
            return this;
        }

        public Builder addContentBytes(ByteString byteString) {
            copyOnWrite();
            ((LabelV2) this.instance).addContentBytes(byteString);
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((LabelV2) this.instance).clearContent();
            return this;
        }

        public Builder clearExposureOnce() {
            copyOnWrite();
            ((LabelV2) this.instance).clearExposureOnce();
            return this;
        }

        public Builder clearExposureType() {
            copyOnWrite();
            ((LabelV2) this.instance).clearExposureType();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((LabelV2) this.instance).clearTitle();
            return this;
        }

        public String getContent(int i) {
            return ((LabelV2) this.instance).getContent(i);
        }

        public ByteString getContentBytes(int i) {
            return ((LabelV2) this.instance).getContentBytes(i);
        }

        public int getContentCount() {
            return ((LabelV2) this.instance).getContentCount();
        }

        public List<String> getContentList() {
            return Collections.unmodifiableList(((LabelV2) this.instance).getContentList());
        }

        public boolean getExposureOnce() {
            return ((LabelV2) this.instance).getExposureOnce();
        }

        public ExposureType getExposureType() {
            return ((LabelV2) this.instance).getExposureType();
        }

        public int getExposureTypeValue() {
            return ((LabelV2) this.instance).getExposureTypeValue();
        }

        public String getTitle() {
            return ((LabelV2) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((LabelV2) this.instance).getTitleBytes();
        }

        public Builder setContent(int i, String str) {
            copyOnWrite();
            ((LabelV2) this.instance).setContent(i, str);
            return this;
        }

        public Builder setExposureOnce(boolean z) {
            copyOnWrite();
            ((LabelV2) this.instance).setExposureOnce(z);
            return this;
        }

        public Builder setExposureType(ExposureType exposureType) {
            copyOnWrite();
            ((LabelV2) this.instance).setExposureType(exposureType);
            return this;
        }

        public Builder setExposureTypeValue(int i) {
            copyOnWrite();
            ((LabelV2) this.instance).setExposureTypeValue(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((LabelV2) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((LabelV2) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(LabelV2.DEFAULT_INSTANCE);
        }
    }

    static {
        LabelV2 labelV2 = new LabelV2();
        DEFAULT_INSTANCE = labelV2;
        GeneratedMessageLite.registerDefaultInstance(LabelV2.class, labelV2);
    }

    private LabelV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllContent(Iterable<String> iterable) {
        ensureContentIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.content_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(String str) {
        str.getClass();
        ensureContentIsMutable();
        this.content_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureContentIsMutable();
        this.content_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExposureOnce() {
        this.exposureOnce_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExposureType() {
        this.exposureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureContentIsMutable() {
        Internal.ProtobufList<String> protobufList = this.content_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.content_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LabelV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LabelV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LabelV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LabelV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(int i, String str) {
        str.getClass();
        ensureContentIsMutable();
        this.content_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureOnce(boolean z) {
        this.exposureOnce_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureType(ExposureType exposureType) {
        this.exposureType_ = exposureType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureTypeValue(int i) {
        this.exposureType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72341.f17074xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LabelV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u021a\u0003\u0007\u0004\f", new Object[]{"title_", "content_", "exposureOnce_", "exposureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LabelV2> parser = PARSER;
                if (parser == null) {
                    synchronized (LabelV2.class) {
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

    public String getContent(int i) {
        return this.content_.get(i);
    }

    public ByteString getContentBytes(int i) {
        return ByteString.copyFromUtf8(this.content_.get(i));
    }

    public int getContentCount() {
        return this.content_.size();
    }

    public List<String> getContentList() {
        return this.content_;
    }

    public boolean getExposureOnce() {
        return this.exposureOnce_;
    }

    public ExposureType getExposureType() {
        ExposureType forNumber = ExposureType.forNumber(this.exposureType_);
        return forNumber == null ? ExposureType.UNRECOGNIZED : forNumber;
    }

    public int getExposureTypeValue() {
        return this.exposureType_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(LabelV2 labelV2) {
        return DEFAULT_INSTANCE.createBuilder(labelV2);
    }

    public static LabelV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LabelV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LabelV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LabelV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LabelV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LabelV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LabelV2 parseFrom(InputStream inputStream) throws IOException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LabelV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LabelV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
