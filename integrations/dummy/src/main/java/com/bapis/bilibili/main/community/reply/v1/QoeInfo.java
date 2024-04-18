package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class QoeInfo extends GeneratedMessageLite<QoeInfo, QoeInfo.C14796b> implements MessageLiteOrBuilder {
    private static final QoeInfo DEFAULT_INSTANCE;
    public static final int DISPLAY_RANK_FIELD_NUMBER = 7;
    public static final int FEEDBACK_TITLE_FIELD_NUMBER = 5;
    public static final int FORM_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<QoeInfo> PARSER = null;
    public static final int SCORE_ITEMS_FIELD_NUMBER = 6;
    public static final int STYLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private long displayRank_;
    private Form form_;
    private long id_;
    private int style_;
    private int type_;
    private String title_ = "";
    private String feedbackTitle_ = "";
    private Internal.ProtobufList<QoeScoreItem> scoreItems_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.QoeInfo$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14795a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22014xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22014xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22014xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22014xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22014xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22014xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22014xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22014xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.QoeInfo$b */
    /* loaded from: classes21.dex */
    public static final class C14796b extends GeneratedMessageLite.Builder<QoeInfo, C14796b> implements MessageLiteOrBuilder {
        /* synthetic */ C14796b(C14795a c14795a) {
            this();
        }

        public C14796b addAllScoreItems(Iterable<? extends QoeScoreItem> iterable) {
            copyOnWrite();
            ((QoeInfo) this.instance).addAllScoreItems(iterable);
            return this;
        }

        public C14796b addScoreItems(QoeScoreItem qoeScoreItem) {
            copyOnWrite();
            ((QoeInfo) this.instance).addScoreItems(qoeScoreItem);
            return this;
        }

        public C14796b clearDisplayRank() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearDisplayRank();
            return this;
        }

        public C14796b clearFeedbackTitle() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearFeedbackTitle();
            return this;
        }

        public C14796b clearForm() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearForm();
            return this;
        }

        public C14796b clearId() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearId();
            return this;
        }

        public C14796b clearScoreItems() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearScoreItems();
            return this;
        }

        public C14796b clearStyle() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearStyle();
            return this;
        }

        public C14796b clearTitle() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearTitle();
            return this;
        }

        public C14796b clearType() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearType();
            return this;
        }

        public long getDisplayRank() {
            return ((QoeInfo) this.instance).getDisplayRank();
        }

        public String getFeedbackTitle() {
            return ((QoeInfo) this.instance).getFeedbackTitle();
        }

        public ByteString getFeedbackTitleBytes() {
            return ((QoeInfo) this.instance).getFeedbackTitleBytes();
        }

        public Form getForm() {
            return ((QoeInfo) this.instance).getForm();
        }

        public long getId() {
            return ((QoeInfo) this.instance).getId();
        }

        public QoeScoreItem getScoreItems(int i) {
            return ((QoeInfo) this.instance).getScoreItems(i);
        }

        public int getScoreItemsCount() {
            return ((QoeInfo) this.instance).getScoreItemsCount();
        }

        public List<QoeScoreItem> getScoreItemsList() {
            return Collections.unmodifiableList(((QoeInfo) this.instance).getScoreItemsList());
        }

        public int getStyle() {
            return ((QoeInfo) this.instance).getStyle();
        }

        public String getTitle() {
            return ((QoeInfo) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((QoeInfo) this.instance).getTitleBytes();
        }

        public int getType() {
            return ((QoeInfo) this.instance).getType();
        }

        public boolean hasForm() {
            return ((QoeInfo) this.instance).hasForm();
        }

        public C14796b mergeForm(Form form) {
            copyOnWrite();
            ((QoeInfo) this.instance).mergeForm(form);
            return this;
        }

        public C14796b removeScoreItems(int i) {
            copyOnWrite();
            ((QoeInfo) this.instance).removeScoreItems(i);
            return this;
        }

        public C14796b setDisplayRank(long j) {
            copyOnWrite();
            ((QoeInfo) this.instance).setDisplayRank(j);
            return this;
        }

        public C14796b setFeedbackTitle(String str) {
            copyOnWrite();
            ((QoeInfo) this.instance).setFeedbackTitle(str);
            return this;
        }

        public C14796b setFeedbackTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeInfo) this.instance).setFeedbackTitleBytes(byteString);
            return this;
        }

        public C14796b setForm(Form form) {
            copyOnWrite();
            ((QoeInfo) this.instance).setForm(form);
            return this;
        }

        public C14796b setId(long j) {
            copyOnWrite();
            ((QoeInfo) this.instance).setId(j);
            return this;
        }

        public C14796b setScoreItems(int i, QoeScoreItem qoeScoreItem) {
            copyOnWrite();
            ((QoeInfo) this.instance).setScoreItems(i, qoeScoreItem);
            return this;
        }

        public C14796b setStyle(int i) {
            copyOnWrite();
            ((QoeInfo) this.instance).setStyle(i);
            return this;
        }

        public C14796b setTitle(String str) {
            copyOnWrite();
            ((QoeInfo) this.instance).setTitle(str);
            return this;
        }

        public C14796b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeInfo) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C14796b setType(int i) {
            copyOnWrite();
            ((QoeInfo) this.instance).setType(i);
            return this;
        }

        private C14796b() {
            super(QoeInfo.DEFAULT_INSTANCE);
        }

        public C14796b addScoreItems(int i, QoeScoreItem qoeScoreItem) {
            copyOnWrite();
            ((QoeInfo) this.instance).addScoreItems(i, qoeScoreItem);
            return this;
        }

        public C14796b setForm(Form.C14730b c14730b) {
            copyOnWrite();
            ((QoeInfo) this.instance).setForm(c14730b.build());
            return this;
        }

        public C14796b setScoreItems(int i, QoeScoreItem.C14802b c14802b) {
            copyOnWrite();
            ((QoeInfo) this.instance).setScoreItems(i, c14802b.build());
            return this;
        }

        public C14796b addScoreItems(QoeScoreItem.C14802b c14802b) {
            copyOnWrite();
            ((QoeInfo) this.instance).addScoreItems(c14802b.build());
            return this;
        }

        public C14796b addScoreItems(int i, QoeScoreItem.C14802b c14802b) {
            copyOnWrite();
            ((QoeInfo) this.instance).addScoreItems(i, c14802b.build());
            return this;
        }
    }

    static {
        QoeInfo qoeInfo = new QoeInfo();
        DEFAULT_INSTANCE = qoeInfo;
        GeneratedMessageLite.registerDefaultInstance(QoeInfo.class, qoeInfo);
    }

    private QoeInfo() {
    }

    public void addAllScoreItems(Iterable<? extends QoeScoreItem> iterable) {
        ensureScoreItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.scoreItems_);
    }

    public void addScoreItems(QoeScoreItem qoeScoreItem) {
        qoeScoreItem.getClass();
        ensureScoreItemsIsMutable();
        this.scoreItems_.add(qoeScoreItem);
    }

    public void clearDisplayRank() {
        this.displayRank_ = 0L;
    }

    public void clearFeedbackTitle() {
        this.feedbackTitle_ = getDefaultInstance().getFeedbackTitle();
    }

    public void clearForm() {
        this.form_ = null;
    }

    public void clearId() {
        this.id_ = 0L;
    }

    public void clearScoreItems() {
        this.scoreItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearStyle() {
        this.style_ = 0;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearType() {
        this.type_ = 0;
    }

    private void ensureScoreItemsIsMutable() {
        Internal.ProtobufList<QoeScoreItem> protobufList = this.scoreItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.scoreItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static QoeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeForm(Form form) {
        form.getClass();
        Form form2 = this.form_;
        if (form2 != null && form2 != Form.getDefaultInstance()) {
            this.form_ = Form.newBuilder(this.form_).mergeFrom((Form) form).buildPartial();
        } else {
            this.form_ = form;
        }
    }

    public static C14796b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QoeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<QoeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeScoreItems(int i) {
        ensureScoreItemsIsMutable();
        this.scoreItems_.remove(i);
    }

    public void setDisplayRank(long j) {
        this.displayRank_ = j;
    }

    public void setFeedbackTitle(String str) {
        str.getClass();
        this.feedbackTitle_ = str;
    }

    public void setFeedbackTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.feedbackTitle_ = byteString.toStringUtf8();
    }

    public void setForm(Form form) {
        form.getClass();
        this.form_ = form;
    }

    public void setId(long j) {
        this.id_ = j;
    }

    public void setScoreItems(int i, QoeScoreItem qoeScoreItem) {
        qoeScoreItem.getClass();
        ensureScoreItemsIsMutable();
        this.scoreItems_.set(i, qoeScoreItem);
    }

    public void setStyle(int i) {
        this.style_ = i;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14795a.f22014xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new QoeInfo();
            case 2:
                return new C14796b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u001b\u0007\u0002\b\t", new Object[]{"id_", "type_", "style_", "title_", "feedbackTitle_", "scoreItems_", QoeScoreItem.class, "displayRank_", "form_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QoeInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (QoeInfo.class) {
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

    public long getDisplayRank() {
        return this.displayRank_;
    }

    public String getFeedbackTitle() {
        return this.feedbackTitle_;
    }

    public ByteString getFeedbackTitleBytes() {
        return ByteString.copyFromUtf8(this.feedbackTitle_);
    }

    public Form getForm() {
        Form form = this.form_;
        return form == null ? Form.getDefaultInstance() : form;
    }

    public long getId() {
        return this.id_;
    }

    public QoeScoreItem getScoreItems(int i) {
        return this.scoreItems_.get(i);
    }

    public int getScoreItemsCount() {
        return this.scoreItems_.size();
    }

    public List<QoeScoreItem> getScoreItemsList() {
        return this.scoreItems_;
    }

    public InterfaceC14918f getScoreItemsOrBuilder(int i) {
        return this.scoreItems_.get(i);
    }

    public List<? extends InterfaceC14918f> getScoreItemsOrBuilderList() {
        return this.scoreItems_;
    }

    public int getStyle() {
        return this.style_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getType() {
        return this.type_;
    }

    public boolean hasForm() {
        return this.form_ != null;
    }

    public static C14796b newBuilder(QoeInfo qoeInfo) {
        return DEFAULT_INSTANCE.createBuilder(qoeInfo);
    }

    public static QoeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addScoreItems(int i, QoeScoreItem qoeScoreItem) {
        qoeScoreItem.getClass();
        ensureScoreItemsIsMutable();
        this.scoreItems_.add(i, qoeScoreItem);
    }

    public static QoeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QoeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(InputStream inputStream) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QoeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
