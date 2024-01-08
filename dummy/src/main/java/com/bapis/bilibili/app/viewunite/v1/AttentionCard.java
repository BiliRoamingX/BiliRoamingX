package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class AttentionCard extends GeneratedMessageLite<AttentionCard, AttentionCard.C12270b> implements MessageLiteOrBuilder {
    private static final AttentionCard DEFAULT_INSTANCE;
    private static volatile Parser<AttentionCard> PARSER = null;
    public static final int SHOW_TIME_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ShowTime> showTime_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.AttentionCard$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12269a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21254xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21254xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21254xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21254xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21254xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21254xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21254xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21254xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.AttentionCard$b */
    /* loaded from: classes20.dex */
    public static final class C12270b extends GeneratedMessageLite.Builder<AttentionCard, C12270b> implements MessageLiteOrBuilder {
        /* synthetic */ C12270b(C12269a c12269a) {
            this();
        }

        public C12270b addAllShowTime(Iterable<? extends ShowTime> iterable) {
            copyOnWrite();
            ((AttentionCard) this.instance).addAllShowTime(iterable);
            return this;
        }

        public C12270b addShowTime(ShowTime showTime) {
            copyOnWrite();
            ((AttentionCard) this.instance).addShowTime(showTime);
            return this;
        }

        public C12270b clearShowTime() {
            copyOnWrite();
            ((AttentionCard) this.instance).clearShowTime();
            return this;
        }

        public ShowTime getShowTime(int i) {
            return ((AttentionCard) this.instance).getShowTime(i);
        }

        public int getShowTimeCount() {
            return ((AttentionCard) this.instance).getShowTimeCount();
        }

        public List<ShowTime> getShowTimeList() {
            return Collections.unmodifiableList(((AttentionCard) this.instance).getShowTimeList());
        }

        public C12270b removeShowTime(int i) {
            copyOnWrite();
            ((AttentionCard) this.instance).removeShowTime(i);
            return this;
        }

        public C12270b setShowTime(int i, ShowTime showTime) {
            copyOnWrite();
            ((AttentionCard) this.instance).setShowTime(i, showTime);
            return this;
        }

        private C12270b() {
            super(AttentionCard.DEFAULT_INSTANCE);
        }

        public C12270b addShowTime(int i, ShowTime showTime) {
            copyOnWrite();
            ((AttentionCard) this.instance).addShowTime(i, showTime);
            return this;
        }

        public C12270b setShowTime(int i, ShowTime.C12368b c12368b) {
            copyOnWrite();
            ((AttentionCard) this.instance).setShowTime(i, c12368b.build());
            return this;
        }

        public C12270b addShowTime(ShowTime.C12368b c12368b) {
            copyOnWrite();
            ((AttentionCard) this.instance).addShowTime(c12368b.build());
            return this;
        }

        public C12270b addShowTime(int i, ShowTime.C12368b c12368b) {
            copyOnWrite();
            ((AttentionCard) this.instance).addShowTime(i, c12368b.build());
            return this;
        }
    }

    static {
        AttentionCard attentionCard = new AttentionCard();
        DEFAULT_INSTANCE = attentionCard;
        GeneratedMessageLite.registerDefaultInstance(AttentionCard.class, attentionCard);
    }

    private AttentionCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllShowTime(Iterable<? extends ShowTime> iterable) {
        ensureShowTimeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.showTime_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addShowTime(ShowTime showTime) {
        showTime.getClass();
        ensureShowTimeIsMutable();
        this.showTime_.add(showTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTime() {
        this.showTime_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureShowTimeIsMutable() {
        Internal.ProtobufList<ShowTime> protobufList = this.showTime_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.showTime_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AttentionCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12270b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AttentionCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AttentionCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttentionCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AttentionCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeShowTime(int i) {
        ensureShowTimeIsMutable();
        this.showTime_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTime(int i, ShowTime showTime) {
        showTime.getClass();
        ensureShowTimeIsMutable();
        this.showTime_.set(i, showTime);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12269a.f21254xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AttentionCard();
            case 2:
                return new C12270b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"showTime_", ShowTime.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AttentionCard> parser = PARSER;
                if (parser == null) {
                    synchronized (AttentionCard.class) {
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

    public ShowTime getShowTime(int i) {
        return this.showTime_.get(i);
    }

    public int getShowTimeCount() {
        return this.showTime_.size();
    }

    public List<ShowTime> getShowTimeList() {
        return this.showTime_;
    }

    public InterfaceC12414f getShowTimeOrBuilder(int i) {
        return this.showTime_.get(i);
    }

    public List<? extends InterfaceC12414f> getShowTimeOrBuilderList() {
        return this.showTime_;
    }

    public static C12270b newBuilder(AttentionCard attentionCard) {
        return DEFAULT_INSTANCE.createBuilder(attentionCard);
    }

    public static AttentionCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttentionCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttentionCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttentionCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addShowTime(int i, ShowTime showTime) {
        showTime.getClass();
        ensureShowTimeIsMutable();
        this.showTime_.add(i, showTime);
    }

    public static AttentionCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttentionCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AttentionCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AttentionCard parseFrom(InputStream inputStream) throws IOException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttentionCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttentionCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttentionCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttentionCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
