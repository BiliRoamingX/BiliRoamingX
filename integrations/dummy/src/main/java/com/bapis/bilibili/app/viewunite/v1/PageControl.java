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
public final class PageControl extends GeneratedMessageLite<PageControl, PageControl.Builder> implements MessageLiteOrBuilder {
    private static final PageControl DEFAULT_INSTANCE;
    public static final int MATERIAL_SHOW_FIELD_NUMBER = 2;
    private static volatile Parser<PageControl> PARSER = null;
    public static final int TOAST_SHOW_FIELD_NUMBER = 1;
    public static final int UP_SHOW_FIELD_NUMBER = 3;
    private Control materialShow_;
    private Control toastShow_;
    private Control upShow_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.PageControl$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71451 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17115xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17115xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17115xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17115xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17115xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17115xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17115xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17115xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PageControl, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71451 c71451) {
            this();
        }

        public Builder clearMaterialShow() {
            copyOnWrite();
            ((PageControl) this.instance).clearMaterialShow();
            return this;
        }

        public Builder clearToastShow() {
            copyOnWrite();
            ((PageControl) this.instance).clearToastShow();
            return this;
        }

        public Builder clearUpShow() {
            copyOnWrite();
            ((PageControl) this.instance).clearUpShow();
            return this;
        }

        public Control getMaterialShow() {
            return ((PageControl) this.instance).getMaterialShow();
        }

        public Control getToastShow() {
            return ((PageControl) this.instance).getToastShow();
        }

        public Control getUpShow() {
            return ((PageControl) this.instance).getUpShow();
        }

        public boolean hasMaterialShow() {
            return ((PageControl) this.instance).hasMaterialShow();
        }

        public boolean hasToastShow() {
            return ((PageControl) this.instance).hasToastShow();
        }

        public boolean hasUpShow() {
            return ((PageControl) this.instance).hasUpShow();
        }

        public Builder mergeMaterialShow(Control control) {
            copyOnWrite();
            ((PageControl) this.instance).mergeMaterialShow(control);
            return this;
        }

        public Builder mergeToastShow(Control control) {
            copyOnWrite();
            ((PageControl) this.instance).mergeToastShow(control);
            return this;
        }

        public Builder mergeUpShow(Control control) {
            copyOnWrite();
            ((PageControl) this.instance).mergeUpShow(control);
            return this;
        }

        public Builder setMaterialShow(Control control) {
            copyOnWrite();
            ((PageControl) this.instance).setMaterialShow(control);
            return this;
        }

        public Builder setToastShow(Control control) {
            copyOnWrite();
            ((PageControl) this.instance).setToastShow(control);
            return this;
        }

        public Builder setUpShow(Control control) {
            copyOnWrite();
            ((PageControl) this.instance).setUpShow(control);
            return this;
        }

        private Builder() {
            super(PageControl.DEFAULT_INSTANCE);
        }

        public Builder setMaterialShow(Control.Builder builder) {
            copyOnWrite();
            ((PageControl) this.instance).setMaterialShow(builder.build());
            return this;
        }

        public Builder setToastShow(Control.Builder builder) {
            copyOnWrite();
            ((PageControl) this.instance).setToastShow(builder.build());
            return this;
        }

        public Builder setUpShow(Control.Builder builder) {
            copyOnWrite();
            ((PageControl) this.instance).setUpShow(builder.build());
            return this;
        }
    }

    static {
        PageControl pageControl = new PageControl();
        DEFAULT_INSTANCE = pageControl;
        GeneratedMessageLite.registerDefaultInstance(PageControl.class, pageControl);
    }

    public PageControl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialShow() {
        this.materialShow_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastShow() {
        this.toastShow_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpShow() {
        this.upShow_ = null;
    }

    public static PageControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMaterialShow(Control control) {
        control.getClass();
        Control control2 = this.materialShow_;
        if (control2 != null && control2 != Control.getDefaultInstance()) {
            this.materialShow_ = Control.newBuilder(this.materialShow_).mergeFrom((Control) control).buildPartial();
        } else {
            this.materialShow_ = control;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToastShow(Control control) {
        control.getClass();
        Control control2 = this.toastShow_;
        if (control2 != null && control2 != Control.getDefaultInstance()) {
            this.toastShow_ = Control.newBuilder(this.toastShow_).mergeFrom((Control) control).buildPartial();
        } else {
            this.toastShow_ = control;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpShow(Control control) {
        control.getClass();
        Control control2 = this.upShow_;
        if (control2 != null && control2 != Control.getDefaultInstance()) {
            this.upShow_ = Control.newBuilder(this.upShow_).mergeFrom((Control) control).buildPartial();
        } else {
            this.upShow_ = control;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PageControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PageControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PageControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PageControl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialShow(Control control) {
        control.getClass();
        this.materialShow_ = control;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastShow(Control control) {
        control.getClass();
        this.toastShow_ = control;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpShow(Control control) {
        control.getClass();
        this.upShow_ = control;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71451.f17115xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PageControl();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"toastShow_", "materialShow_", "upShow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PageControl> parser = PARSER;
                if (parser == null) {
                    synchronized (PageControl.class) {
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

    public Control getMaterialShow() {
        Control control = this.materialShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getToastShow() {
        Control control = this.toastShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getUpShow() {
        Control control = this.upShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public boolean hasMaterialShow() {
        return this.materialShow_ != null;
    }

    public boolean hasToastShow() {
        return this.toastShow_ != null;
    }

    public boolean hasUpShow() {
        return this.upShow_ != null;
    }

    public static Builder newBuilder(PageControl pageControl) {
        return DEFAULT_INSTANCE.createBuilder(pageControl);
    }

    public static PageControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PageControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PageControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PageControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PageControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PageControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PageControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PageControl parseFrom(InputStream inputStream) throws IOException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PageControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PageControl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PageControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PageControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
