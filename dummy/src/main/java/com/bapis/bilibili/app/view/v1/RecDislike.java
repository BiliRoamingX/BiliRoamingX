package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.view.v1.DislikeReasons;
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
public final class RecDislike extends GeneratedMessageLite<RecDislike, RecDislike.Builder> implements MessageLiteOrBuilder {
    public static final int CLOSED_PASTE_TEXT_FIELD_NUMBER = 5;
    public static final int CLOSED_SUB_TITLE_FIELD_NUMBER = 3;
    public static final int CLOSED_TOAST_FIELD_NUMBER = 8;
    private static final RecDislike DEFAULT_INSTANCE;
    public static final int DISLIKE_REASON_FIELD_NUMBER = 6;
    private static volatile Parser<RecDislike> PARSER = null;
    public static final int PASTE_TEXT_FIELD_NUMBER = 4;
    public static final int SUB_TITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TOAST_FIELD_NUMBER = 7;
    private String title_ = "";
    private String subTitle_ = "";
    private String closedSubTitle_ = "";
    private String pasteText_ = "";
    private String closedPasteText_ = "";
    private Internal.ProtobufList<DislikeReasons> dislikeReason_ = GeneratedMessageLite.emptyProtobufList();
    private String toast_ = "";
    private String closedToast_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RecDislike$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68351 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16796xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16796xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16796xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16796xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16796xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16796xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16796xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16796xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RecDislike, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68351 c68351) {
            this();
        }

        public Builder addAllDislikeReason(Iterable<? extends DislikeReasons> iterable) {
            copyOnWrite();
            ((RecDislike) this.instance).addAllDislikeReason(iterable);
            return this;
        }

        public Builder addDislikeReason(DislikeReasons dislikeReasons) {
            copyOnWrite();
            ((RecDislike) this.instance).addDislikeReason(dislikeReasons);
            return this;
        }

        public Builder clearClosedPasteText() {
            copyOnWrite();
            ((RecDislike) this.instance).clearClosedPasteText();
            return this;
        }

        public Builder clearClosedSubTitle() {
            copyOnWrite();
            ((RecDislike) this.instance).clearClosedSubTitle();
            return this;
        }

        public Builder clearClosedToast() {
            copyOnWrite();
            ((RecDislike) this.instance).clearClosedToast();
            return this;
        }

        public Builder clearDislikeReason() {
            copyOnWrite();
            ((RecDislike) this.instance).clearDislikeReason();
            return this;
        }

        public Builder clearPasteText() {
            copyOnWrite();
            ((RecDislike) this.instance).clearPasteText();
            return this;
        }

        public Builder clearSubTitle() {
            copyOnWrite();
            ((RecDislike) this.instance).clearSubTitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((RecDislike) this.instance).clearTitle();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((RecDislike) this.instance).clearToast();
            return this;
        }

        public String getClosedPasteText() {
            return ((RecDislike) this.instance).getClosedPasteText();
        }

        public ByteString getClosedPasteTextBytes() {
            return ((RecDislike) this.instance).getClosedPasteTextBytes();
        }

        public String getClosedSubTitle() {
            return ((RecDislike) this.instance).getClosedSubTitle();
        }

        public ByteString getClosedSubTitleBytes() {
            return ((RecDislike) this.instance).getClosedSubTitleBytes();
        }

        public String getClosedToast() {
            return ((RecDislike) this.instance).getClosedToast();
        }

        public ByteString getClosedToastBytes() {
            return ((RecDislike) this.instance).getClosedToastBytes();
        }

        public DislikeReasons getDislikeReason(int i) {
            return ((RecDislike) this.instance).getDislikeReason(i);
        }

        public int getDislikeReasonCount() {
            return ((RecDislike) this.instance).getDislikeReasonCount();
        }

        public List<DislikeReasons> getDislikeReasonList() {
            return Collections.unmodifiableList(((RecDislike) this.instance).getDislikeReasonList());
        }

        public String getPasteText() {
            return ((RecDislike) this.instance).getPasteText();
        }

        public ByteString getPasteTextBytes() {
            return ((RecDislike) this.instance).getPasteTextBytes();
        }

        public String getSubTitle() {
            return ((RecDislike) this.instance).getSubTitle();
        }

        public ByteString getSubTitleBytes() {
            return ((RecDislike) this.instance).getSubTitleBytes();
        }

        public String getTitle() {
            return ((RecDislike) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((RecDislike) this.instance).getTitleBytes();
        }

        public String getToast() {
            return ((RecDislike) this.instance).getToast();
        }

        public ByteString getToastBytes() {
            return ((RecDislike) this.instance).getToastBytes();
        }

        public Builder removeDislikeReason(int i) {
            copyOnWrite();
            ((RecDislike) this.instance).removeDislikeReason(i);
            return this;
        }

        public Builder setClosedPasteText(String str) {
            copyOnWrite();
            ((RecDislike) this.instance).setClosedPasteText(str);
            return this;
        }

        public Builder setClosedPasteTextBytes(ByteString byteString) {
            copyOnWrite();
            ((RecDislike) this.instance).setClosedPasteTextBytes(byteString);
            return this;
        }

        public Builder setClosedSubTitle(String str) {
            copyOnWrite();
            ((RecDislike) this.instance).setClosedSubTitle(str);
            return this;
        }

        public Builder setClosedSubTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((RecDislike) this.instance).setClosedSubTitleBytes(byteString);
            return this;
        }

        public Builder setClosedToast(String str) {
            copyOnWrite();
            ((RecDislike) this.instance).setClosedToast(str);
            return this;
        }

        public Builder setClosedToastBytes(ByteString byteString) {
            copyOnWrite();
            ((RecDislike) this.instance).setClosedToastBytes(byteString);
            return this;
        }

        public Builder setDislikeReason(int i, DislikeReasons dislikeReasons) {
            copyOnWrite();
            ((RecDislike) this.instance).setDislikeReason(i, dislikeReasons);
            return this;
        }

        public Builder setPasteText(String str) {
            copyOnWrite();
            ((RecDislike) this.instance).setPasteText(str);
            return this;
        }

        public Builder setPasteTextBytes(ByteString byteString) {
            copyOnWrite();
            ((RecDislike) this.instance).setPasteTextBytes(byteString);
            return this;
        }

        public Builder setSubTitle(String str) {
            copyOnWrite();
            ((RecDislike) this.instance).setSubTitle(str);
            return this;
        }

        public Builder setSubTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((RecDislike) this.instance).setSubTitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((RecDislike) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((RecDislike) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setToast(String str) {
            copyOnWrite();
            ((RecDislike) this.instance).setToast(str);
            return this;
        }

        public Builder setToastBytes(ByteString byteString) {
            copyOnWrite();
            ((RecDislike) this.instance).setToastBytes(byteString);
            return this;
        }

        private Builder() {
            super(RecDislike.DEFAULT_INSTANCE);
        }

        public Builder addDislikeReason(int i, DislikeReasons dislikeReasons) {
            copyOnWrite();
            ((RecDislike) this.instance).addDislikeReason(i, dislikeReasons);
            return this;
        }

        public Builder setDislikeReason(int i, DislikeReasons.Builder builder) {
            copyOnWrite();
            ((RecDislike) this.instance).setDislikeReason(i, builder.build());
            return this;
        }

        public Builder addDislikeReason(DislikeReasons.Builder builder) {
            copyOnWrite();
            ((RecDislike) this.instance).addDislikeReason(builder.build());
            return this;
        }

        public Builder addDislikeReason(int i, DislikeReasons.Builder builder) {
            copyOnWrite();
            ((RecDislike) this.instance).addDislikeReason(i, builder.build());
            return this;
        }
    }

    static {
        RecDislike recDislike = new RecDislike();
        DEFAULT_INSTANCE = recDislike;
        GeneratedMessageLite.registerDefaultInstance(RecDislike.class, recDislike);
    }

    private RecDislike() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDislikeReason(Iterable<? extends DislikeReasons> iterable) {
        ensureDislikeReasonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dislikeReason_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDislikeReason(DislikeReasons dislikeReasons) {
        dislikeReasons.getClass();
        ensureDislikeReasonIsMutable();
        this.dislikeReason_.add(dislikeReasons);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosedPasteText() {
        this.closedPasteText_ = getDefaultInstance().getClosedPasteText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosedSubTitle() {
        this.closedSubTitle_ = getDefaultInstance().getClosedSubTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosedToast() {
        this.closedToast_ = getDefaultInstance().getClosedToast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislikeReason() {
        this.dislikeReason_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPasteText() {
        this.pasteText_ = getDefaultInstance().getPasteText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitle() {
        this.subTitle_ = getDefaultInstance().getSubTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToast() {
        this.toast_ = getDefaultInstance().getToast();
    }

    private void ensureDislikeReasonIsMutable() {
        Internal.ProtobufList<DislikeReasons> protobufList = this.dislikeReason_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dislikeReason_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecDislike getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecDislike parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecDislike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecDislike parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecDislike> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDislikeReason(int i) {
        ensureDislikeReasonIsMutable();
        this.dislikeReason_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedPasteText(String str) {
        str.getClass();
        this.closedPasteText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedPasteTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.closedPasteText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedSubTitle(String str) {
        str.getClass();
        this.closedSubTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedSubTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.closedSubTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedToast(String str) {
        str.getClass();
        this.closedToast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.closedToast_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislikeReason(int i, DislikeReasons dislikeReasons) {
        dislikeReasons.getClass();
        ensureDislikeReasonIsMutable();
        this.dislikeReason_.set(i, dislikeReasons);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasteText(String str) {
        str.getClass();
        this.pasteText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasteTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pasteText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitle(String str) {
        str.getClass();
        this.subTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subTitle_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(String str) {
        str.getClass();
        this.toast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toast_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68351.f16796xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RecDislike();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u001b\u0007\u0208\b\u0208", new Object[]{"title_", "subTitle_", "closedSubTitle_", "pasteText_", "closedPasteText_", "dislikeReason_", DislikeReasons.class, "toast_", "closedToast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecDislike> parser = PARSER;
                if (parser == null) {
                    synchronized (RecDislike.class) {
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

    public String getClosedPasteText() {
        return this.closedPasteText_;
    }

    public ByteString getClosedPasteTextBytes() {
        return ByteString.copyFromUtf8(this.closedPasteText_);
    }

    public String getClosedSubTitle() {
        return this.closedSubTitle_;
    }

    public ByteString getClosedSubTitleBytes() {
        return ByteString.copyFromUtf8(this.closedSubTitle_);
    }

    public String getClosedToast() {
        return this.closedToast_;
    }

    public ByteString getClosedToastBytes() {
        return ByteString.copyFromUtf8(this.closedToast_);
    }

    public DislikeReasons getDislikeReason(int i) {
        return this.dislikeReason_.get(i);
    }

    public int getDislikeReasonCount() {
        return this.dislikeReason_.size();
    }

    public List<DislikeReasons> getDislikeReasonList() {
        return this.dislikeReason_;
    }

    public DislikeReasonsOrBuilder getDislikeReasonOrBuilder(int i) {
        return this.dislikeReason_.get(i);
    }

    public List<? extends DislikeReasonsOrBuilder> getDislikeReasonOrBuilderList() {
        return this.dislikeReason_;
    }

    public String getPasteText() {
        return this.pasteText_;
    }

    public ByteString getPasteTextBytes() {
        return ByteString.copyFromUtf8(this.pasteText_);
    }

    public String getSubTitle() {
        return this.subTitle_;
    }

    public ByteString getSubTitleBytes() {
        return ByteString.copyFromUtf8(this.subTitle_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getToast() {
        return this.toast_;
    }

    public ByteString getToastBytes() {
        return ByteString.copyFromUtf8(this.toast_);
    }

    public static Builder newBuilder(RecDislike recDislike) {
        return DEFAULT_INSTANCE.createBuilder(recDislike);
    }

    public static RecDislike parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecDislike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecDislike parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecDislike parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDislikeReason(int i, DislikeReasons dislikeReasons) {
        dislikeReasons.getClass();
        ensureDislikeReasonIsMutable();
        this.dislikeReason_.add(i, dislikeReasons);
    }

    public static RecDislike parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecDislike parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecDislike parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecDislike parseFrom(InputStream inputStream) throws IOException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecDislike parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecDislike parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecDislike parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecDislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
