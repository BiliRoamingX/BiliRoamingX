package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes14.dex */
public final class DanmuPlayerConfigPanel extends GeneratedMessageLite<DanmuPlayerConfigPanel, DanmuPlayerConfigPanel.Builder> implements MessageLiteOrBuilder {
    private static final DanmuPlayerConfigPanel DEFAULT_INSTANCE;
    private static volatile Parser<DanmuPlayerConfigPanel> PARSER = null;
    public static final int SELECTION_TEXT_FIELD_NUMBER = 1;
    private String selectionText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmuPlayerConfigPanel$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17049xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17049xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17049xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DanmuPlayerConfigPanel, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72061 c72061) {
            this();
        }

        public Builder clearSelectionText() {
            copyOnWrite();
            ((DanmuPlayerConfigPanel) this.instance).clearSelectionText();
            return this;
        }

        public String getSelectionText() {
            return ((DanmuPlayerConfigPanel) this.instance).getSelectionText();
        }

        public ByteString getSelectionTextBytes() {
            return ((DanmuPlayerConfigPanel) this.instance).getSelectionTextBytes();
        }

        public Builder setSelectionText(String str) {
            copyOnWrite();
            ((DanmuPlayerConfigPanel) this.instance).setSelectionText(str);
            return this;
        }

        public Builder setSelectionTextBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmuPlayerConfigPanel) this.instance).setSelectionTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(DanmuPlayerConfigPanel.DEFAULT_INSTANCE);
        }
    }

    static {
        DanmuPlayerConfigPanel danmuPlayerConfigPanel = new DanmuPlayerConfigPanel();
        DEFAULT_INSTANCE = danmuPlayerConfigPanel;
        GeneratedMessageLite.registerDefaultInstance(DanmuPlayerConfigPanel.class, danmuPlayerConfigPanel);
    }

    private DanmuPlayerConfigPanel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectionText() {
        this.selectionText_ = getDefaultInstance().getSelectionText();
    }

    public static DanmuPlayerConfigPanel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmuPlayerConfigPanel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerConfigPanel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmuPlayerConfigPanel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionText(String str) {
        str.getClass();
        this.selectionText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectionText_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72061.f17049xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmuPlayerConfigPanel();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"selectionText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmuPlayerConfigPanel> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmuPlayerConfigPanel.class) {
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

    public String getSelectionText() {
        return this.selectionText_;
    }

    public ByteString getSelectionTextBytes() {
        return ByteString.copyFromUtf8(this.selectionText_);
    }

    public static Builder newBuilder(DanmuPlayerConfigPanel danmuPlayerConfigPanel) {
        return DEFAULT_INSTANCE.createBuilder(danmuPlayerConfigPanel);
    }

    public static DanmuPlayerConfigPanel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerConfigPanel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmuPlayerConfigPanel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DanmuPlayerConfigPanel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmuPlayerConfigPanel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmuPlayerConfigPanel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmuPlayerConfigPanel parseFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerConfigPanel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerConfigPanel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmuPlayerConfigPanel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerConfigPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
