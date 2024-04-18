package com.bapis.bilibili.dagw.component.avatar.v1;

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
/* loaded from: classes17.dex */
public final class GeneralConfig extends GeneratedMessageLite<GeneralConfig, GeneralConfig.Builder> implements MessageLiteOrBuilder {
    private static final GeneralConfig DEFAULT_INSTANCE;
    private static volatile Parser<GeneralConfig> PARSER = null;
    public static final int WEB_CSS_STYLE_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> webCssStyle_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.GeneralConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17373xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17373xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17373xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17373xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17373xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17373xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17373xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17373xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GeneralConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75301 c75301) {
            this();
        }

        public Builder clearWebCssStyle() {
            copyOnWrite();
            ((GeneralConfig) this.instance).getMutableWebCssStyleMap().clear();
            return this;
        }

        public boolean containsWebCssStyle(String str) {
            str.getClass();
            return ((GeneralConfig) this.instance).getWebCssStyleMap().containsKey(str);
        }

        @Deprecated
        public Map<String, String> getWebCssStyle() {
            return getWebCssStyleMap();
        }

        public int getWebCssStyleCount() {
            return ((GeneralConfig) this.instance).getWebCssStyleMap().size();
        }

        public Map<String, String> getWebCssStyleMap() {
            return Collections.unmodifiableMap(((GeneralConfig) this.instance).getWebCssStyleMap());
        }

        public String getWebCssStyleOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> webCssStyleMap = ((GeneralConfig) this.instance).getWebCssStyleMap();
            return webCssStyleMap.containsKey(str) ? webCssStyleMap.get(str) : str2;
        }

        public String getWebCssStyleOrThrow(String str) {
            str.getClass();
            Map<String, String> webCssStyleMap = ((GeneralConfig) this.instance).getWebCssStyleMap();
            if (webCssStyleMap.containsKey(str)) {
                return webCssStyleMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllWebCssStyle(Map<String, String> map) {
            copyOnWrite();
            ((GeneralConfig) this.instance).getMutableWebCssStyleMap().putAll(map);
            return this;
        }

        public Builder putWebCssStyle(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((GeneralConfig) this.instance).getMutableWebCssStyleMap().put(str, str2);
            return this;
        }

        public Builder removeWebCssStyle(String str) {
            str.getClass();
            copyOnWrite();
            ((GeneralConfig) this.instance).getMutableWebCssStyleMap().remove(str);
            return this;
        }

        private Builder() {
            super(GeneralConfig.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class WebCssStyleDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private WebCssStyleDefaultEntryHolder() {
        }
    }

    static {
        GeneralConfig generalConfig = new GeneralConfig();
        DEFAULT_INSTANCE = generalConfig;
        GeneratedMessageLite.registerDefaultInstance(GeneralConfig.class, generalConfig);
    }

    private GeneralConfig() {
    }

    public static GeneralConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableWebCssStyleMap() {
        return internalGetMutableWebCssStyle();
    }

    private MapFieldLite<String, String> internalGetMutableWebCssStyle() {
        if (!this.webCssStyle_.isMutable()) {
            this.webCssStyle_ = this.webCssStyle_.mutableCopy();
        }
        return this.webCssStyle_;
    }

    private MapFieldLite<String, String> internalGetWebCssStyle() {
        return this.webCssStyle_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GeneralConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GeneralConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeneralConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GeneralConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsWebCssStyle(String str) {
        str.getClass();
        return internalGetWebCssStyle().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75301.f17373xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GeneralConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"webCssStyle_", WebCssStyleDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GeneralConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (GeneralConfig.class) {
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

    @Deprecated
    public Map<String, String> getWebCssStyle() {
        return getWebCssStyleMap();
    }

    public int getWebCssStyleCount() {
        return internalGetWebCssStyle().size();
    }

    public Map<String, String> getWebCssStyleMap() {
        return Collections.unmodifiableMap(internalGetWebCssStyle());
    }

    public String getWebCssStyleOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetWebCssStyle = internalGetWebCssStyle();
        return internalGetWebCssStyle.containsKey(str) ? internalGetWebCssStyle.get(str) : str2;
    }

    public String getWebCssStyleOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetWebCssStyle = internalGetWebCssStyle();
        if (internalGetWebCssStyle.containsKey(str)) {
            return internalGetWebCssStyle.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(GeneralConfig generalConfig) {
        return DEFAULT_INSTANCE.createBuilder(generalConfig);
    }

    public static GeneralConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GeneralConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GeneralConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GeneralConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GeneralConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GeneralConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GeneralConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GeneralConfig parseFrom(InputStream inputStream) throws IOException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeneralConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GeneralConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GeneralConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GeneralConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
