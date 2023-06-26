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
public final class ClickButtonV2 extends GeneratedMessageLite<ClickButtonV2, ClickButtonV2.Builder> implements MessageLiteOrBuilder {
    private static final ClickButtonV2 DEFAULT_INSTANCE;
    public static final int EXPOSURE_ONCE_FIELD_NUMBER = 7;
    public static final int EXPOSURE_TYPE_FIELD_NUMBER = 8;
    public static final int LANDSCAPE_TEXT_FIELD_NUMBER = 2;
    public static final int LANDSCAPE_TEXT_FOCUS_FIELD_NUMBER = 4;
    private static volatile Parser<ClickButtonV2> PARSER = null;
    public static final int PORTRAIT_TEXT_FIELD_NUMBER = 1;
    public static final int PORTRAIT_TEXT_FOCUS_FIELD_NUMBER = 3;
    public static final int RENDER_TYPE_FIELD_NUMBER = 5;
    public static final int TEXT_INPUT_POST_FIELD_NUMBER = 6;
    private boolean exposureOnce_;
    private int exposureType_;
    private int renderType_;
    private boolean textInputPost_;
    private Internal.ProtobufList<String> portraitText_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> landscapeText_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> portraitTextFocus_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> landscapeTextFocus_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.ClickButtonV2$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17040xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17040xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17040xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17040xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17040xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17040xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17040xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17040xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ClickButtonV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71941 c71941) {
            this();
        }

        public Builder addAllLandscapeText(Iterable<String> iterable) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addAllLandscapeText(iterable);
            return this;
        }

        public Builder addAllLandscapeTextFocus(Iterable<String> iterable) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addAllLandscapeTextFocus(iterable);
            return this;
        }

        public Builder addAllPortraitText(Iterable<String> iterable) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addAllPortraitText(iterable);
            return this;
        }

        public Builder addAllPortraitTextFocus(Iterable<String> iterable) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addAllPortraitTextFocus(iterable);
            return this;
        }

        public Builder addLandscapeText(String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addLandscapeText(str);
            return this;
        }

        public Builder addLandscapeTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addLandscapeTextBytes(byteString);
            return this;
        }

        public Builder addLandscapeTextFocus(String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addLandscapeTextFocus(str);
            return this;
        }

        public Builder addLandscapeTextFocusBytes(ByteString byteString) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addLandscapeTextFocusBytes(byteString);
            return this;
        }

        public Builder addPortraitText(String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addPortraitText(str);
            return this;
        }

        public Builder addPortraitTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addPortraitTextBytes(byteString);
            return this;
        }

        public Builder addPortraitTextFocus(String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addPortraitTextFocus(str);
            return this;
        }

        public Builder addPortraitTextFocusBytes(ByteString byteString) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).addPortraitTextFocusBytes(byteString);
            return this;
        }

        public Builder clearExposureOnce() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearExposureOnce();
            return this;
        }

        public Builder clearExposureType() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearExposureType();
            return this;
        }

        public Builder clearLandscapeText() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearLandscapeText();
            return this;
        }

        public Builder clearLandscapeTextFocus() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearLandscapeTextFocus();
            return this;
        }

        public Builder clearPortraitText() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearPortraitText();
            return this;
        }

        public Builder clearPortraitTextFocus() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearPortraitTextFocus();
            return this;
        }

        public Builder clearRenderType() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearRenderType();
            return this;
        }

        public Builder clearTextInputPost() {
            copyOnWrite();
            ((ClickButtonV2) this.instance).clearTextInputPost();
            return this;
        }

        public boolean getExposureOnce() {
            return ((ClickButtonV2) this.instance).getExposureOnce();
        }

        public ExposureType getExposureType() {
            return ((ClickButtonV2) this.instance).getExposureType();
        }

        public int getExposureTypeValue() {
            return ((ClickButtonV2) this.instance).getExposureTypeValue();
        }

        public String getLandscapeText(int i) {
            return ((ClickButtonV2) this.instance).getLandscapeText(i);
        }

        public ByteString getLandscapeTextBytes(int i) {
            return ((ClickButtonV2) this.instance).getLandscapeTextBytes(i);
        }

        public int getLandscapeTextCount() {
            return ((ClickButtonV2) this.instance).getLandscapeTextCount();
        }

        public String getLandscapeTextFocus(int i) {
            return ((ClickButtonV2) this.instance).getLandscapeTextFocus(i);
        }

        public ByteString getLandscapeTextFocusBytes(int i) {
            return ((ClickButtonV2) this.instance).getLandscapeTextFocusBytes(i);
        }

        public int getLandscapeTextFocusCount() {
            return ((ClickButtonV2) this.instance).getLandscapeTextFocusCount();
        }

        public List<String> getLandscapeTextFocusList() {
            return Collections.unmodifiableList(((ClickButtonV2) this.instance).getLandscapeTextFocusList());
        }

        public List<String> getLandscapeTextList() {
            return Collections.unmodifiableList(((ClickButtonV2) this.instance).getLandscapeTextList());
        }

        public String getPortraitText(int i) {
            return ((ClickButtonV2) this.instance).getPortraitText(i);
        }

        public ByteString getPortraitTextBytes(int i) {
            return ((ClickButtonV2) this.instance).getPortraitTextBytes(i);
        }

        public int getPortraitTextCount() {
            return ((ClickButtonV2) this.instance).getPortraitTextCount();
        }

        public String getPortraitTextFocus(int i) {
            return ((ClickButtonV2) this.instance).getPortraitTextFocus(i);
        }

        public ByteString getPortraitTextFocusBytes(int i) {
            return ((ClickButtonV2) this.instance).getPortraitTextFocusBytes(i);
        }

        public int getPortraitTextFocusCount() {
            return ((ClickButtonV2) this.instance).getPortraitTextFocusCount();
        }

        public List<String> getPortraitTextFocusList() {
            return Collections.unmodifiableList(((ClickButtonV2) this.instance).getPortraitTextFocusList());
        }

        public List<String> getPortraitTextList() {
            return Collections.unmodifiableList(((ClickButtonV2) this.instance).getPortraitTextList());
        }

        public RenderType getRenderType() {
            return ((ClickButtonV2) this.instance).getRenderType();
        }

        public int getRenderTypeValue() {
            return ((ClickButtonV2) this.instance).getRenderTypeValue();
        }

        public boolean getTextInputPost() {
            return ((ClickButtonV2) this.instance).getTextInputPost();
        }

        public Builder setExposureOnce(boolean z) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setExposureOnce(z);
            return this;
        }

        public Builder setExposureType(ExposureType exposureType) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setExposureType(exposureType);
            return this;
        }

        public Builder setExposureTypeValue(int i) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setExposureTypeValue(i);
            return this;
        }

        public Builder setLandscapeText(int i, String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setLandscapeText(i, str);
            return this;
        }

        public Builder setLandscapeTextFocus(int i, String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setLandscapeTextFocus(i, str);
            return this;
        }

        public Builder setPortraitText(int i, String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setPortraitText(i, str);
            return this;
        }

        public Builder setPortraitTextFocus(int i, String str) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setPortraitTextFocus(i, str);
            return this;
        }

        public Builder setRenderType(RenderType renderType) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setRenderType(renderType);
            return this;
        }

        public Builder setRenderTypeValue(int i) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setRenderTypeValue(i);
            return this;
        }

        public Builder setTextInputPost(boolean z) {
            copyOnWrite();
            ((ClickButtonV2) this.instance).setTextInputPost(z);
            return this;
        }

        private Builder() {
            super(ClickButtonV2.DEFAULT_INSTANCE);
        }
    }

    static {
        ClickButtonV2 clickButtonV2 = new ClickButtonV2();
        DEFAULT_INSTANCE = clickButtonV2;
        GeneratedMessageLite.registerDefaultInstance(ClickButtonV2.class, clickButtonV2);
    }

    private ClickButtonV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLandscapeText(Iterable<String> iterable) {
        ensureLandscapeTextIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.landscapeText_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLandscapeTextFocus(Iterable<String> iterable) {
        ensureLandscapeTextFocusIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.landscapeTextFocus_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPortraitText(Iterable<String> iterable) {
        ensurePortraitTextIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.portraitText_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPortraitTextFocus(Iterable<String> iterable) {
        ensurePortraitTextFocusIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.portraitTextFocus_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandscapeText(String str) {
        str.getClass();
        ensureLandscapeTextIsMutable();
        this.landscapeText_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandscapeTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureLandscapeTextIsMutable();
        this.landscapeText_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandscapeTextFocus(String str) {
        str.getClass();
        ensureLandscapeTextFocusIsMutable();
        this.landscapeTextFocus_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandscapeTextFocusBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureLandscapeTextFocusIsMutable();
        this.landscapeTextFocus_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPortraitText(String str) {
        str.getClass();
        ensurePortraitTextIsMutable();
        this.portraitText_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPortraitTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePortraitTextIsMutable();
        this.portraitText_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPortraitTextFocus(String str) {
        str.getClass();
        ensurePortraitTextFocusIsMutable();
        this.portraitTextFocus_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPortraitTextFocusBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePortraitTextFocusIsMutable();
        this.portraitTextFocus_.add(byteString.toStringUtf8());
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
    public void clearLandscapeText() {
        this.landscapeText_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLandscapeTextFocus() {
        this.landscapeTextFocus_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortraitText() {
        this.portraitText_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortraitTextFocus() {
        this.portraitTextFocus_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderType() {
        this.renderType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextInputPost() {
        this.textInputPost_ = false;
    }

    private void ensureLandscapeTextFocusIsMutable() {
        Internal.ProtobufList<String> protobufList = this.landscapeTextFocus_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.landscapeTextFocus_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureLandscapeTextIsMutable() {
        Internal.ProtobufList<String> protobufList = this.landscapeText_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.landscapeText_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePortraitTextFocusIsMutable() {
        Internal.ProtobufList<String> protobufList = this.portraitTextFocus_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.portraitTextFocus_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePortraitTextIsMutable() {
        Internal.ProtobufList<String> protobufList = this.portraitText_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.portraitText_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ClickButtonV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClickButtonV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClickButtonV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickButtonV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClickButtonV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setLandscapeText(int i, String str) {
        str.getClass();
        ensureLandscapeTextIsMutable();
        this.landscapeText_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandscapeTextFocus(int i, String str) {
        str.getClass();
        ensureLandscapeTextFocusIsMutable();
        this.landscapeTextFocus_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitText(int i, String str) {
        str.getClass();
        ensurePortraitTextIsMutable();
        this.portraitText_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitTextFocus(int i, String str) {
        str.getClass();
        ensurePortraitTextFocusIsMutable();
        this.portraitTextFocus_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderType(RenderType renderType) {
        this.renderType_ = renderType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderTypeValue(int i) {
        this.renderType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextInputPost(boolean z) {
        this.textInputPost_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71941.f17040xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ClickButtonV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0004\u0000\u0001\u021a\u0002\u021a\u0003\u021a\u0004\u021a\u0005\f\u0006\u0007\u0007\u0007\b\f", new Object[]{"portraitText_", "landscapeText_", "portraitTextFocus_", "landscapeTextFocus_", "renderType_", "textInputPost_", "exposureOnce_", "exposureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClickButtonV2> parser = PARSER;
                if (parser == null) {
                    synchronized (ClickButtonV2.class) {
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

    public String getLandscapeText(int i) {
        return this.landscapeText_.get(i);
    }

    public ByteString getLandscapeTextBytes(int i) {
        return ByteString.copyFromUtf8(this.landscapeText_.get(i));
    }

    public int getLandscapeTextCount() {
        return this.landscapeText_.size();
    }

    public String getLandscapeTextFocus(int i) {
        return this.landscapeTextFocus_.get(i);
    }

    public ByteString getLandscapeTextFocusBytes(int i) {
        return ByteString.copyFromUtf8(this.landscapeTextFocus_.get(i));
    }

    public int getLandscapeTextFocusCount() {
        return this.landscapeTextFocus_.size();
    }

    public List<String> getLandscapeTextFocusList() {
        return this.landscapeTextFocus_;
    }

    public List<String> getLandscapeTextList() {
        return this.landscapeText_;
    }

    public String getPortraitText(int i) {
        return this.portraitText_.get(i);
    }

    public ByteString getPortraitTextBytes(int i) {
        return ByteString.copyFromUtf8(this.portraitText_.get(i));
    }

    public int getPortraitTextCount() {
        return this.portraitText_.size();
    }

    public String getPortraitTextFocus(int i) {
        return this.portraitTextFocus_.get(i);
    }

    public ByteString getPortraitTextFocusBytes(int i) {
        return ByteString.copyFromUtf8(this.portraitTextFocus_.get(i));
    }

    public int getPortraitTextFocusCount() {
        return this.portraitTextFocus_.size();
    }

    public List<String> getPortraitTextFocusList() {
        return this.portraitTextFocus_;
    }

    public List<String> getPortraitTextList() {
        return this.portraitText_;
    }

    public RenderType getRenderType() {
        RenderType forNumber = RenderType.forNumber(this.renderType_);
        return forNumber == null ? RenderType.UNRECOGNIZED : forNumber;
    }

    public int getRenderTypeValue() {
        return this.renderType_;
    }

    public boolean getTextInputPost() {
        return this.textInputPost_;
    }

    public static Builder newBuilder(ClickButtonV2 clickButtonV2) {
        return DEFAULT_INSTANCE.createBuilder(clickButtonV2);
    }

    public static ClickButtonV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickButtonV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickButtonV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClickButtonV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClickButtonV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClickButtonV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClickButtonV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClickButtonV2 parseFrom(InputStream inputStream) throws IOException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClickButtonV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClickButtonV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClickButtonV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClickButtonV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
