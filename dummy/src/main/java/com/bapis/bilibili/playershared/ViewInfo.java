package com.bapis.bilibili.playershared;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
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
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes18.dex */
public final class ViewInfo extends GeneratedMessageLite<ViewInfo, ViewInfo.Builder> implements MessageLiteOrBuilder {
    private static final ViewInfo DEFAULT_INSTANCE;
    public static final int DIALOG_MAP_FIELD_NUMBER = 1;
    private static volatile Parser<ViewInfo> PARSER = null;
    public static final int PROMPT_BAR_FIELD_NUMBER = 2;
    public static final int TOASTS_FIELD_NUMBER = 3;
    private PromptBar promptBar_;
    private MapFieldLite<String, Dialog> dialogMap_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<ComprehensiveToast> toasts_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.ViewInfo$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C82141 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17929xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17929xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17929xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17929xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17929xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17929xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17929xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17929xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C82141 c82141) {
            this();
        }

        public Builder addAllToasts(Iterable<? extends ComprehensiveToast> iterable) {
            copyOnWrite();
            ((ViewInfo) this.instance).addAllToasts(iterable);
            return this;
        }

        public Builder addToasts(ComprehensiveToast comprehensiveToast) {
            copyOnWrite();
            ((ViewInfo) this.instance).addToasts(comprehensiveToast);
            return this;
        }

        public Builder clearDialogMap() {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableDialogMapMap().clear();
            return this;
        }

        public Builder clearPromptBar() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearPromptBar();
            return this;
        }

        public Builder clearToasts() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearToasts();
            return this;
        }

        public boolean containsDialogMap(String str) {
            str.getClass();
            return ((ViewInfo) this.instance).getDialogMapMap().containsKey(str);
        }

        @Deprecated
        public Map<String, Dialog> getDialogMap() {
            return getDialogMapMap();
        }

        public int getDialogMapCount() {
            return ((ViewInfo) this.instance).getDialogMapMap().size();
        }

        public Map<String, Dialog> getDialogMapMap() {
            return Collections.unmodifiableMap(((ViewInfo) this.instance).getDialogMapMap());
        }

        public Dialog getDialogMapOrDefault(String str, Dialog dialog) {
            str.getClass();
            Map<String, Dialog> dialogMapMap = ((ViewInfo) this.instance).getDialogMapMap();
            return dialogMapMap.containsKey(str) ? dialogMapMap.get(str) : dialog;
        }

        public Dialog getDialogMapOrThrow(String str) {
            str.getClass();
            Map<String, Dialog> dialogMapMap = ((ViewInfo) this.instance).getDialogMapMap();
            if (dialogMapMap.containsKey(str)) {
                return dialogMapMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public PromptBar getPromptBar() {
            return ((ViewInfo) this.instance).getPromptBar();
        }

        public ComprehensiveToast getToasts(int i) {
            return ((ViewInfo) this.instance).getToasts(i);
        }

        public int getToastsCount() {
            return ((ViewInfo) this.instance).getToastsCount();
        }

        public List<ComprehensiveToast> getToastsList() {
            return Collections.unmodifiableList(((ViewInfo) this.instance).getToastsList());
        }

        public boolean hasPromptBar() {
            return ((ViewInfo) this.instance).hasPromptBar();
        }

        public Builder mergePromptBar(PromptBar promptBar) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergePromptBar(promptBar);
            return this;
        }

        public Builder putAllDialogMap(Map<String, Dialog> map) {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableDialogMapMap().putAll(map);
            return this;
        }

        public Builder putDialogMap(String str, Dialog dialog) {
            str.getClass();
            dialog.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableDialogMapMap().put(str, dialog);
            return this;
        }

        public Builder removeDialogMap(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableDialogMapMap().remove(str);
            return this;
        }

        public Builder removeToasts(int i) {
            copyOnWrite();
            ((ViewInfo) this.instance).removeToasts(i);
            return this;
        }

        public Builder setPromptBar(PromptBar promptBar) {
            copyOnWrite();
            ((ViewInfo) this.instance).setPromptBar(promptBar);
            return this;
        }

        public Builder setToasts(int i, ComprehensiveToast comprehensiveToast) {
            copyOnWrite();
            ((ViewInfo) this.instance).setToasts(i, comprehensiveToast);
            return this;
        }

        private Builder() {
            super(ViewInfo.DEFAULT_INSTANCE);
        }

        public Builder addToasts(int i, ComprehensiveToast comprehensiveToast) {
            copyOnWrite();
            ((ViewInfo) this.instance).addToasts(i, comprehensiveToast);
            return this;
        }

        public Builder setPromptBar(PromptBar.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setPromptBar(builder.build());
            return this;
        }

        public Builder setToasts(int i, ComprehensiveToast.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setToasts(i, builder.build());
            return this;
        }

        public Builder addToasts(ComprehensiveToast.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).addToasts(builder.build());
            return this;
        }

        public Builder addToasts(int i, ComprehensiveToast.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).addToasts(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class DialogMapDefaultEntryHolder {
        static final MapEntryLite<String, Dialog> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Dialog.getDefaultInstance());

        private DialogMapDefaultEntryHolder() {
        }
    }

    static {
        ViewInfo viewInfo = new ViewInfo();
        DEFAULT_INSTANCE = viewInfo;
        GeneratedMessageLite.registerDefaultInstance(ViewInfo.class, viewInfo);
    }

    public ViewInfo() {
    }

    public void addAllToasts(Iterable<? extends ComprehensiveToast> iterable) {
        ensureToastsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.toasts_);
    }

    public void addToasts(ComprehensiveToast comprehensiveToast) {
        comprehensiveToast.getClass();
        ensureToastsIsMutable();
        this.toasts_.add(comprehensiveToast);
    }

    public void clearPromptBar() {
        this.promptBar_ = null;
    }

    public void clearToasts() {
        this.toasts_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureToastsIsMutable() {
        Internal.ProtobufList<ComprehensiveToast> protobufList = this.toasts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.toasts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ViewInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, Dialog> getMutableDialogMapMap() {
        return internalGetMutableDialogMap();
    }

    private MapFieldLite<String, Dialog> internalGetDialogMap() {
        return this.dialogMap_;
    }

    private MapFieldLite<String, Dialog> internalGetMutableDialogMap() {
        if (!this.dialogMap_.isMutable()) {
            this.dialogMap_ = this.dialogMap_.mutableCopy();
        }
        return this.dialogMap_;
    }

    public void mergePromptBar(PromptBar promptBar) {
        promptBar.getClass();
        PromptBar promptBar2 = this.promptBar_;
        if (promptBar2 != null && promptBar2 != PromptBar.getDefaultInstance()) {
            this.promptBar_ = PromptBar.newBuilder(this.promptBar_).mergeFrom((PromptBar) promptBar).buildPartial();
        } else {
            this.promptBar_ = promptBar;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeToasts(int i) {
        ensureToastsIsMutable();
        this.toasts_.remove(i);
    }

    public void setPromptBar(PromptBar promptBar) {
        promptBar.getClass();
        this.promptBar_ = promptBar;
    }

    public void setToasts(int i, ComprehensiveToast comprehensiveToast) {
        comprehensiveToast.getClass();
        ensureToastsIsMutable();
        this.toasts_.set(i, comprehensiveToast);
    }

    public boolean containsDialogMap(String str) {
        str.getClass();
        return internalGetDialogMap().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C82141.f17929xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u00012\u0002\t\u0003\u001b", new Object[]{"dialogMap_", DialogMapDefaultEntryHolder.defaultEntry, "promptBar_", "toasts_", ComprehensiveToast.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewInfo.class) {
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
    public Map<String, Dialog> getDialogMap() {
        return getDialogMapMap();
    }

    public int getDialogMapCount() {
        return internalGetDialogMap().size();
    }

    public Map<String, Dialog> getDialogMapMap() {
        return Collections.unmodifiableMap(internalGetDialogMap());
    }

    public Dialog getDialogMapOrDefault(String str, Dialog dialog) {
        str.getClass();
        MapFieldLite<String, Dialog> internalGetDialogMap = internalGetDialogMap();
        return internalGetDialogMap.containsKey(str) ? internalGetDialogMap.get(str) : dialog;
    }

    public Dialog getDialogMapOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Dialog> internalGetDialogMap = internalGetDialogMap();
        if (internalGetDialogMap.containsKey(str)) {
            return internalGetDialogMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public PromptBar getPromptBar() {
        PromptBar promptBar = this.promptBar_;
        return promptBar == null ? PromptBar.getDefaultInstance() : promptBar;
    }

    public ComprehensiveToast getToasts(int i) {
        return this.toasts_.get(i);
    }

    public int getToastsCount() {
        return this.toasts_.size();
    }

    public List<ComprehensiveToast> getToastsList() {
        return this.toasts_;
    }

    public ComprehensiveToastOrBuilder getToastsOrBuilder(int i) {
        return this.toasts_.get(i);
    }

    public List<? extends ComprehensiveToastOrBuilder> getToastsOrBuilderList() {
        return this.toasts_;
    }

    public boolean hasPromptBar() {
        return this.promptBar_ != null;
    }

    public static Builder newBuilder(ViewInfo viewInfo) {
        return DEFAULT_INSTANCE.createBuilder(viewInfo);
    }

    public static ViewInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addToasts(int i, ComprehensiveToast comprehensiveToast) {
        comprehensiveToast.getClass();
        ensureToastsIsMutable();
        this.toasts_.add(i, comprehensiveToast);
    }

    public static ViewInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(InputStream inputStream) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
