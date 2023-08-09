package com.bapis.bilibili.playershared;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes18.dex */
public final class Button extends GeneratedMessageLite<Button, Button.Builder> implements MessageLiteOrBuilder {
    private static final Button DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 2;
    private static volatile Parser<Button> PARSER = null;
    public static final int REPORT_PARAMS_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> reportParams_ = MapFieldLite.emptyMapField();
    private String text_ = "";
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.Button$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81601 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17889xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17889xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17889xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17889xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17889xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17889xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17889xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17889xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Button, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81601 c81601) {
            this();
        }

        public Builder clearLink() {
            copyOnWrite();
            ((Button) this.instance).clearLink();
            return this;
        }

        public Builder clearReportParams() {
            copyOnWrite();
            ((Button) this.instance).getMutableReportParamsMap().clear();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Button) this.instance).clearText();
            return this;
        }

        public boolean containsReportParams(String str) {
            str.getClass();
            return ((Button) this.instance).getReportParamsMap().containsKey(str);
        }

        public String getLink() {
            return ((Button) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((Button) this.instance).getLinkBytes();
        }

        @Deprecated
        public Map<String, String> getReportParams() {
            return getReportParamsMap();
        }

        public int getReportParamsCount() {
            return ((Button) this.instance).getReportParamsMap().size();
        }

        public Map<String, String> getReportParamsMap() {
            return Collections.unmodifiableMap(((Button) this.instance).getReportParamsMap());
        }

        public String getReportParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportParamsMap = ((Button) this.instance).getReportParamsMap();
            return reportParamsMap.containsKey(str) ? reportParamsMap.get(str) : str2;
        }

        public String getReportParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> reportParamsMap = ((Button) this.instance).getReportParamsMap();
            if (reportParamsMap.containsKey(str)) {
                return reportParamsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getText() {
            return ((Button) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Button) this.instance).getTextBytes();
        }

        public Builder putAllReportParams(Map<String, String> map) {
            copyOnWrite();
            ((Button) this.instance).getMutableReportParamsMap().putAll(map);
            return this;
        }

        public Builder putReportParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((Button) this.instance).getMutableReportParamsMap().put(str, str2);
            return this;
        }

        public Builder removeReportParams(String str) {
            str.getClass();
            copyOnWrite();
            ((Button) this.instance).getMutableReportParamsMap().remove(str);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((Button) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Button) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(Button.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class ReportParamsDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private ReportParamsDefaultEntryHolder() {
        }
    }

    static {
        Button button = new Button();
        DEFAULT_INSTANCE = button;
        GeneratedMessageLite.registerDefaultInstance(Button.class, button);
    }

    private Button() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static Button getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableReportParamsMap() {
        return internalGetMutableReportParams();
    }

    private MapFieldLite<String, String> internalGetMutableReportParams() {
        if (!this.reportParams_.isMutable()) {
            this.reportParams_ = this.reportParams_.mutableCopy();
        }
        return this.reportParams_;
    }

    private MapFieldLite<String, String> internalGetReportParams() {
        return this.reportParams_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Button parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Button> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    public boolean containsReportParams(String str) {
        str.getClass();
        return internalGetReportParams().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81601.f17889xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Button();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u00032", new Object[]{"text_", "link_", "reportParams_", ReportParamsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Button> parser = PARSER;
                if (parser == null) {
                    synchronized (Button.class) {
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

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Deprecated
    public Map<String, String> getReportParams() {
        return getReportParamsMap();
    }

    public int getReportParamsCount() {
        return internalGetReportParams().size();
    }

    public Map<String, String> getReportParamsMap() {
        return Collections.unmodifiableMap(internalGetReportParams());
    }

    public String getReportParamsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetReportParams = internalGetReportParams();
        return internalGetReportParams.containsKey(str) ? internalGetReportParams.get(str) : str2;
    }

    public String getReportParamsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetReportParams = internalGetReportParams();
        if (internalGetReportParams.containsKey(str)) {
            return internalGetReportParams.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(Button button) {
        return DEFAULT_INSTANCE.createBuilder(button);
    }

    public static Button parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Button parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Button parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Button parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Button parseFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Button parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
