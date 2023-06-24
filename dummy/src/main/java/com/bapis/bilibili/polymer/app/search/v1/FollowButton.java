package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class FollowButton extends GeneratedMessageLite<FollowButton, FollowButton.Builder> implements MessageLiteOrBuilder {
    private static final FollowButton DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile Parser<FollowButton> PARSER = null;
    public static final int STATUS_REPORT_FIELD_NUMBER = 3;
    public static final int TEXTS_FIELD_NUMBER = 2;
    private MapFieldLite<String, String> texts_ = MapFieldLite.emptyMapField();
    private String icon_ = "";
    private String statusReport_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.FollowButton$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17667xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17667xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17667xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17667xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17667xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17667xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17667xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17667xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FollowButton, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79651 c79651) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((FollowButton) this.instance).clearIcon();
            return this;
        }

        public Builder clearStatusReport() {
            copyOnWrite();
            ((FollowButton) this.instance).clearStatusReport();
            return this;
        }

        public Builder clearTexts() {
            copyOnWrite();
            ((FollowButton) this.instance).getMutableTextsMap().clear();
            return this;
        }

        public boolean containsTexts(String str) {
            str.getClass();
            return ((FollowButton) this.instance).getTextsMap().containsKey(str);
        }

        public String getIcon() {
            return ((FollowButton) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((FollowButton) this.instance).getIconBytes();
        }

        public String getStatusReport() {
            return ((FollowButton) this.instance).getStatusReport();
        }

        public ByteString getStatusReportBytes() {
            return ((FollowButton) this.instance).getStatusReportBytes();
        }

        @Deprecated
        public Map<String, String> getTexts() {
            return getTextsMap();
        }

        public int getTextsCount() {
            return ((FollowButton) this.instance).getTextsMap().size();
        }

        public Map<String, String> getTextsMap() {
            return Collections.unmodifiableMap(((FollowButton) this.instance).getTextsMap());
        }

        public String getTextsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> textsMap = ((FollowButton) this.instance).getTextsMap();
            return textsMap.containsKey(str) ? textsMap.get(str) : str2;
        }

        public String getTextsOrThrow(String str) {
            str.getClass();
            Map<String, String> textsMap = ((FollowButton) this.instance).getTextsMap();
            if (textsMap.containsKey(str)) {
                return textsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllTexts(Map<String, String> map) {
            copyOnWrite();
            ((FollowButton) this.instance).getMutableTextsMap().putAll(map);
            return this;
        }

        public Builder putTexts(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((FollowButton) this.instance).getMutableTextsMap().put(str, str2);
            return this;
        }

        public Builder removeTexts(String str) {
            str.getClass();
            copyOnWrite();
            ((FollowButton) this.instance).getMutableTextsMap().remove(str);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((FollowButton) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((FollowButton) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setStatusReport(String str) {
            copyOnWrite();
            ((FollowButton) this.instance).setStatusReport(str);
            return this;
        }

        public Builder setStatusReportBytes(ByteString byteString) {
            copyOnWrite();
            ((FollowButton) this.instance).setStatusReportBytes(byteString);
            return this;
        }

        private Builder() {
            super(FollowButton.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    private static final class TextsDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private TextsDefaultEntryHolder() {
        }
    }

    static {
        FollowButton followButton = new FollowButton();
        DEFAULT_INSTANCE = followButton;
        GeneratedMessageLite.registerDefaultInstance(FollowButton.class, followButton);
    }

    private FollowButton() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusReport() {
        this.statusReport_ = getDefaultInstance().getStatusReport();
    }

    public static FollowButton getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableTextsMap() {
        return internalGetMutableTexts();
    }

    private MapFieldLite<String, String> internalGetMutableTexts() {
        if (!this.texts_.isMutable()) {
            this.texts_ = this.texts_.mutableCopy();
        }
        return this.texts_;
    }

    private MapFieldLite<String, String> internalGetTexts() {
        return this.texts_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FollowButton parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FollowButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FollowButton parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FollowButton> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusReport(String str) {
        str.getClass();
        this.statusReport_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusReportBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.statusReport_ = byteString.toStringUtf8();
    }

    public boolean containsTexts(String str) {
        str.getClass();
        return internalGetTexts().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79651.f17667xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FollowButton();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0208\u00022\u0003\u0208", new Object[]{"icon_", "texts_", TextsDefaultEntryHolder.defaultEntry, "statusReport_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FollowButton> parser = PARSER;
                if (parser == null) {
                    synchronized (FollowButton.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public String getStatusReport() {
        return this.statusReport_;
    }

    public ByteString getStatusReportBytes() {
        return ByteString.copyFromUtf8(this.statusReport_);
    }

    @Deprecated
    public Map<String, String> getTexts() {
        return getTextsMap();
    }

    public int getTextsCount() {
        return internalGetTexts().size();
    }

    public Map<String, String> getTextsMap() {
        return Collections.unmodifiableMap(internalGetTexts());
    }

    public String getTextsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetTexts = internalGetTexts();
        return internalGetTexts.containsKey(str) ? internalGetTexts.get(str) : str2;
    }

    public String getTextsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetTexts = internalGetTexts();
        if (internalGetTexts.containsKey(str)) {
            return internalGetTexts.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(FollowButton followButton) {
        return DEFAULT_INSTANCE.createBuilder(followButton);
    }

    public static FollowButton parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FollowButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FollowButton parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FollowButton parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FollowButton parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FollowButton parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FollowButton parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FollowButton parseFrom(InputStream inputStream) throws IOException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FollowButton parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FollowButton parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FollowButton parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FollowButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
