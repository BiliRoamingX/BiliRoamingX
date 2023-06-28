package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class TFPanelCustomized extends GeneratedMessageLite<TFPanelCustomized, TFPanelCustomized.Builder> implements MessageLiteOrBuilder {
    private static final TFPanelCustomized DEFAULT_INSTANCE;
    public static final int MAIN_LABEL_FIELD_NUMBER = 5;
    public static final int OPERATOR_FIELD_NUMBER = 6;
    private static volatile Parser<TFPanelCustomized> PARSER = null;
    public static final int RIGHT_BTN_IMG_FIELD_NUMBER = 1;
    public static final int RIGHT_BTN_LINK_FIELD_NUMBER = 4;
    public static final int RIGHT_BTN_TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int RIGHT_BTN_TEXT_FIELD_NUMBER = 2;
    public static final int SUB_PANEL_FIELD_NUMBER = 7;
    private MapFieldLite<String, subTFPanel> subPanel_ = MapFieldLite.emptyMapField();
    private String rightBtnImg_ = "";
    private String rightBtnText_ = "";
    private String rightBtnTextColor_ = "";
    private String rightBtnLink_ = "";
    private String mainLabel_ = "";
    private String operator_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.TFPanelCustomized$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16829xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16829xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16829xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16829xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16829xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16829xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16829xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16829xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TFPanelCustomized, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68701 c68701) {
            this();
        }

        public Builder clearMainLabel() {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).clearMainLabel();
            return this;
        }

        public Builder clearOperator() {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).clearOperator();
            return this;
        }

        public Builder clearRightBtnImg() {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).clearRightBtnImg();
            return this;
        }

        public Builder clearRightBtnLink() {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).clearRightBtnLink();
            return this;
        }

        public Builder clearRightBtnText() {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).clearRightBtnText();
            return this;
        }

        public Builder clearRightBtnTextColor() {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).clearRightBtnTextColor();
            return this;
        }

        public Builder clearSubPanel() {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).getMutableSubPanelMap().clear();
            return this;
        }

        public boolean containsSubPanel(String str) {
            str.getClass();
            return ((TFPanelCustomized) this.instance).getSubPanelMap().containsKey(str);
        }

        public String getMainLabel() {
            return ((TFPanelCustomized) this.instance).getMainLabel();
        }

        public ByteString getMainLabelBytes() {
            return ((TFPanelCustomized) this.instance).getMainLabelBytes();
        }

        public String getOperator() {
            return ((TFPanelCustomized) this.instance).getOperator();
        }

        public ByteString getOperatorBytes() {
            return ((TFPanelCustomized) this.instance).getOperatorBytes();
        }

        public String getRightBtnImg() {
            return ((TFPanelCustomized) this.instance).getRightBtnImg();
        }

        public ByteString getRightBtnImgBytes() {
            return ((TFPanelCustomized) this.instance).getRightBtnImgBytes();
        }

        public String getRightBtnLink() {
            return ((TFPanelCustomized) this.instance).getRightBtnLink();
        }

        public ByteString getRightBtnLinkBytes() {
            return ((TFPanelCustomized) this.instance).getRightBtnLinkBytes();
        }

        public String getRightBtnText() {
            return ((TFPanelCustomized) this.instance).getRightBtnText();
        }

        public ByteString getRightBtnTextBytes() {
            return ((TFPanelCustomized) this.instance).getRightBtnTextBytes();
        }

        public String getRightBtnTextColor() {
            return ((TFPanelCustomized) this.instance).getRightBtnTextColor();
        }

        public ByteString getRightBtnTextColorBytes() {
            return ((TFPanelCustomized) this.instance).getRightBtnTextColorBytes();
        }

        @Deprecated
        public Map<String, subTFPanel> getSubPanel() {
            return getSubPanelMap();
        }

        public int getSubPanelCount() {
            return ((TFPanelCustomized) this.instance).getSubPanelMap().size();
        }

        public Map<String, subTFPanel> getSubPanelMap() {
            return Collections.unmodifiableMap(((TFPanelCustomized) this.instance).getSubPanelMap());
        }

        public subTFPanel getSubPanelOrDefault(String str, subTFPanel subtfpanel) {
            str.getClass();
            Map<String, subTFPanel> subPanelMap = ((TFPanelCustomized) this.instance).getSubPanelMap();
            return subPanelMap.containsKey(str) ? subPanelMap.get(str) : subtfpanel;
        }

        public subTFPanel getSubPanelOrThrow(String str) {
            str.getClass();
            Map<String, subTFPanel> subPanelMap = ((TFPanelCustomized) this.instance).getSubPanelMap();
            if (subPanelMap.containsKey(str)) {
                return subPanelMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllSubPanel(Map<String, subTFPanel> map) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).getMutableSubPanelMap().putAll(map);
            return this;
        }

        public Builder putSubPanel(String str, subTFPanel subtfpanel) {
            str.getClass();
            subtfpanel.getClass();
            copyOnWrite();
            ((TFPanelCustomized) this.instance).getMutableSubPanelMap().put(str, subtfpanel);
            return this;
        }

        public Builder removeSubPanel(String str) {
            str.getClass();
            copyOnWrite();
            ((TFPanelCustomized) this.instance).getMutableSubPanelMap().remove(str);
            return this;
        }

        public Builder setMainLabel(String str) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setMainLabel(str);
            return this;
        }

        public Builder setMainLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setMainLabelBytes(byteString);
            return this;
        }

        public Builder setOperator(String str) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setOperator(str);
            return this;
        }

        public Builder setOperatorBytes(ByteString byteString) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setOperatorBytes(byteString);
            return this;
        }

        public Builder setRightBtnImg(String str) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnImg(str);
            return this;
        }

        public Builder setRightBtnImgBytes(ByteString byteString) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnImgBytes(byteString);
            return this;
        }

        public Builder setRightBtnLink(String str) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnLink(str);
            return this;
        }

        public Builder setRightBtnLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnLinkBytes(byteString);
            return this;
        }

        public Builder setRightBtnText(String str) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnText(str);
            return this;
        }

        public Builder setRightBtnTextBytes(ByteString byteString) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnTextBytes(byteString);
            return this;
        }

        public Builder setRightBtnTextColor(String str) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnTextColor(str);
            return this;
        }

        public Builder setRightBtnTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((TFPanelCustomized) this.instance).setRightBtnTextColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(TFPanelCustomized.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class SubPanelDefaultEntryHolder {
        static final MapEntryLite<String, subTFPanel> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, subTFPanel.getDefaultInstance());

        private SubPanelDefaultEntryHolder() {
        }
    }

    static {
        TFPanelCustomized tFPanelCustomized = new TFPanelCustomized();
        DEFAULT_INSTANCE = tFPanelCustomized;
        GeneratedMessageLite.registerDefaultInstance(TFPanelCustomized.class, tFPanelCustomized);
    }

    private TFPanelCustomized() {
    }

    public void clearMainLabel() {
        this.mainLabel_ = getDefaultInstance().getMainLabel();
    }

    public void clearOperator() {
        this.operator_ = getDefaultInstance().getOperator();
    }

    public void clearRightBtnImg() {
        this.rightBtnImg_ = getDefaultInstance().getRightBtnImg();
    }

    public void clearRightBtnLink() {
        this.rightBtnLink_ = getDefaultInstance().getRightBtnLink();
    }

    public void clearRightBtnText() {
        this.rightBtnText_ = getDefaultInstance().getRightBtnText();
    }

    public void clearRightBtnTextColor() {
        this.rightBtnTextColor_ = getDefaultInstance().getRightBtnTextColor();
    }

    public static TFPanelCustomized getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, subTFPanel> getMutableSubPanelMap() {
        return internalGetMutableSubPanel();
    }

    private MapFieldLite<String, subTFPanel> internalGetMutableSubPanel() {
        if (!this.subPanel_.isMutable()) {
            this.subPanel_ = this.subPanel_.mutableCopy();
        }
        return this.subPanel_;
    }

    private MapFieldLite<String, subTFPanel> internalGetSubPanel() {
        return this.subPanel_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TFPanelCustomized parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TFPanelCustomized) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TFPanelCustomized parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TFPanelCustomized> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setMainLabel(String str) {
        str.getClass();
        this.mainLabel_ = str;
    }

    public void setMainLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mainLabel_ = byteString.toStringUtf8();
    }

    public void setOperator(String str) {
        str.getClass();
        this.operator_ = str;
    }

    public void setOperatorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.operator_ = byteString.toStringUtf8();
    }

    public void setRightBtnImg(String str) {
        str.getClass();
        this.rightBtnImg_ = str;
    }

    public void setRightBtnImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnImg_ = byteString.toStringUtf8();
    }

    public void setRightBtnLink(String str) {
        str.getClass();
        this.rightBtnLink_ = str;
    }

    public void setRightBtnLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnLink_ = byteString.toStringUtf8();
    }

    public void setRightBtnText(String str) {
        str.getClass();
        this.rightBtnText_ = str;
    }

    public void setRightBtnTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnText_ = byteString.toStringUtf8();
    }

    public void setRightBtnTextColor(String str) {
        str.getClass();
        this.rightBtnTextColor_ = str;
    }

    public void setRightBtnTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnTextColor_ = byteString.toStringUtf8();
    }

    public boolean containsSubPanel(String str) {
        str.getClass();
        return internalGetSubPanel().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68701.f16829xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TFPanelCustomized();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u00072", new Object[]{"rightBtnImg_", "rightBtnText_", "rightBtnTextColor_", "rightBtnLink_", "mainLabel_", "operator_", "subPanel_", SubPanelDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TFPanelCustomized> parser = PARSER;
                if (parser == null) {
                    synchronized (TFPanelCustomized.class) {
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

    public String getMainLabel() {
        return this.mainLabel_;
    }

    public ByteString getMainLabelBytes() {
        return ByteString.copyFromUtf8(this.mainLabel_);
    }

    public String getOperator() {
        return this.operator_;
    }

    public ByteString getOperatorBytes() {
        return ByteString.copyFromUtf8(this.operator_);
    }

    public String getRightBtnImg() {
        return this.rightBtnImg_;
    }

    public ByteString getRightBtnImgBytes() {
        return ByteString.copyFromUtf8(this.rightBtnImg_);
    }

    public String getRightBtnLink() {
        return this.rightBtnLink_;
    }

    public ByteString getRightBtnLinkBytes() {
        return ByteString.copyFromUtf8(this.rightBtnLink_);
    }

    public String getRightBtnText() {
        return this.rightBtnText_;
    }

    public ByteString getRightBtnTextBytes() {
        return ByteString.copyFromUtf8(this.rightBtnText_);
    }

    public String getRightBtnTextColor() {
        return this.rightBtnTextColor_;
    }

    public ByteString getRightBtnTextColorBytes() {
        return ByteString.copyFromUtf8(this.rightBtnTextColor_);
    }

    @Deprecated
    public Map<String, subTFPanel> getSubPanel() {
        return getSubPanelMap();
    }

    public int getSubPanelCount() {
        return internalGetSubPanel().size();
    }

    public Map<String, subTFPanel> getSubPanelMap() {
        return Collections.unmodifiableMap(internalGetSubPanel());
    }

    public subTFPanel getSubPanelOrDefault(String str, subTFPanel subtfpanel) {
        str.getClass();
        MapFieldLite<String, subTFPanel> internalGetSubPanel = internalGetSubPanel();
        return internalGetSubPanel.containsKey(str) ? internalGetSubPanel.get(str) : subtfpanel;
    }

    public subTFPanel getSubPanelOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, subTFPanel> internalGetSubPanel = internalGetSubPanel();
        if (internalGetSubPanel.containsKey(str)) {
            return internalGetSubPanel.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(TFPanelCustomized tFPanelCustomized) {
        return DEFAULT_INSTANCE.createBuilder(tFPanelCustomized);
    }

    public static TFPanelCustomized parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFPanelCustomized) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TFPanelCustomized parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TFPanelCustomized parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TFPanelCustomized parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TFPanelCustomized parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TFPanelCustomized parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TFPanelCustomized parseFrom(InputStream inputStream) throws IOException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TFPanelCustomized parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TFPanelCustomized parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TFPanelCustomized parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFPanelCustomized) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
