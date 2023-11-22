package com.bapis.bilibili.app.card.v1;

import com.bapis.bilibili.app.card.v1.DislikeReason;
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
public final class ThreePoint extends GeneratedMessageLite<ThreePoint, ThreePoint.C5894b> implements MessageLiteOrBuilder {
    private static final ThreePoint DEFAULT_INSTANCE;
    public static final int DISLIKE_REASONS_FIELD_NUMBER = 1;
    public static final int FEEDBACKS_FIELD_NUMBER = 2;
    private static volatile Parser<ThreePoint> PARSER = null;
    public static final int WATCH_LATER_FIELD_NUMBER = 3;
    private Internal.ProtobufList<DislikeReason> dislikeReasons_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DislikeReason> feedbacks_ = GeneratedMessageLite.emptyProtobufList();
    private int watchLater_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePoint$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5893a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15995xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15995xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15995xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15995xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15995xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15995xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15995xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15995xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePoint$b */
    /* loaded from: classes13.dex */
    public static final class C5894b extends GeneratedMessageLite.Builder<ThreePoint, C5894b> implements MessageLiteOrBuilder {
        /* synthetic */ C5894b(C5893a c5893a) {
            this();
        }

        public C5894b addAllDislikeReasons(Iterable<? extends DislikeReason> iterable) {
            copyOnWrite();
            ((ThreePoint) this.instance).addAllDislikeReasons(iterable);
            return this;
        }

        public C5894b addAllFeedbacks(Iterable<? extends DislikeReason> iterable) {
            copyOnWrite();
            ((ThreePoint) this.instance).addAllFeedbacks(iterable);
            return this;
        }

        public C5894b addDislikeReasons(DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePoint) this.instance).addDislikeReasons(dislikeReason);
            return this;
        }

        public C5894b addFeedbacks(DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePoint) this.instance).addFeedbacks(dislikeReason);
            return this;
        }

        public C5894b clearDislikeReasons() {
            copyOnWrite();
            ((ThreePoint) this.instance).clearDislikeReasons();
            return this;
        }

        public C5894b clearFeedbacks() {
            copyOnWrite();
            ((ThreePoint) this.instance).clearFeedbacks();
            return this;
        }

        public C5894b clearWatchLater() {
            copyOnWrite();
            ((ThreePoint) this.instance).clearWatchLater();
            return this;
        }

        public DislikeReason getDislikeReasons(int i) {
            return ((ThreePoint) this.instance).getDislikeReasons(i);
        }

        public int getDislikeReasonsCount() {
            return ((ThreePoint) this.instance).getDislikeReasonsCount();
        }

        public List<DislikeReason> getDislikeReasonsList() {
            return Collections.unmodifiableList(((ThreePoint) this.instance).getDislikeReasonsList());
        }

        public DislikeReason getFeedbacks(int i) {
            return ((ThreePoint) this.instance).getFeedbacks(i);
        }

        public int getFeedbacksCount() {
            return ((ThreePoint) this.instance).getFeedbacksCount();
        }

        public List<DislikeReason> getFeedbacksList() {
            return Collections.unmodifiableList(((ThreePoint) this.instance).getFeedbacksList());
        }

        public int getWatchLater() {
            return ((ThreePoint) this.instance).getWatchLater();
        }

        public C5894b removeDislikeReasons(int i) {
            copyOnWrite();
            ((ThreePoint) this.instance).removeDislikeReasons(i);
            return this;
        }

        public C5894b removeFeedbacks(int i) {
            copyOnWrite();
            ((ThreePoint) this.instance).removeFeedbacks(i);
            return this;
        }

        public C5894b setDislikeReasons(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePoint) this.instance).setDislikeReasons(i, dislikeReason);
            return this;
        }

        public C5894b setFeedbacks(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePoint) this.instance).setFeedbacks(i, dislikeReason);
            return this;
        }

        public C5894b setWatchLater(int i) {
            copyOnWrite();
            ((ThreePoint) this.instance).setWatchLater(i);
            return this;
        }

        private C5894b() {
            super(ThreePoint.DEFAULT_INSTANCE);
        }

        public C5894b addDislikeReasons(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePoint) this.instance).addDislikeReasons(i, dislikeReason);
            return this;
        }

        public C5894b addFeedbacks(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePoint) this.instance).addFeedbacks(i, dislikeReason);
            return this;
        }

        public C5894b setDislikeReasons(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePoint) this.instance).setDislikeReasons(i, c5803b.build());
            return this;
        }

        public C5894b setFeedbacks(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePoint) this.instance).setFeedbacks(i, c5803b.build());
            return this;
        }

        public C5894b addDislikeReasons(DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePoint) this.instance).addDislikeReasons(c5803b.build());
            return this;
        }

        public C5894b addFeedbacks(DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePoint) this.instance).addFeedbacks(c5803b.build());
            return this;
        }

        public C5894b addDislikeReasons(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePoint) this.instance).addDislikeReasons(i, c5803b.build());
            return this;
        }

        public C5894b addFeedbacks(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePoint) this.instance).addFeedbacks(i, c5803b.build());
            return this;
        }
    }

    static {
        ThreePoint threePoint = new ThreePoint();
        DEFAULT_INSTANCE = threePoint;
        GeneratedMessageLite.registerDefaultInstance(ThreePoint.class, threePoint);
    }

    private ThreePoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDislikeReasons(Iterable<? extends DislikeReason> iterable) {
        ensureDislikeReasonsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dislikeReasons_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeedbacks(Iterable<? extends DislikeReason> iterable) {
        ensureFeedbacksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.feedbacks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDislikeReasons(DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureDislikeReasonsIsMutable();
        this.dislikeReasons_.add(dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeedbacks(DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureFeedbacksIsMutable();
        this.feedbacks_.add(dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislikeReasons() {
        this.dislikeReasons_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbacks() {
        this.feedbacks_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchLater() {
        this.watchLater_ = 0;
    }

    private void ensureDislikeReasonsIsMutable() {
        Internal.ProtobufList<DislikeReason> protobufList = this.dislikeReasons_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dislikeReasons_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureFeedbacksIsMutable() {
        Internal.ProtobufList<DislikeReason> protobufList = this.feedbacks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.feedbacks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ThreePoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5894b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ThreePoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ThreePoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ThreePoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDislikeReasons(int i) {
        ensureDislikeReasonsIsMutable();
        this.dislikeReasons_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFeedbacks(int i) {
        ensureFeedbacksIsMutable();
        this.feedbacks_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislikeReasons(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureDislikeReasonsIsMutable();
        this.dislikeReasons_.set(i, dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbacks(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureFeedbacksIsMutable();
        this.feedbacks_.set(i, dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchLater(int i) {
        this.watchLater_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5893a.f15995xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ThreePoint();
            case 2:
                return new C5894b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0004", new Object[]{"dislikeReasons_", DislikeReason.class, "feedbacks_", DislikeReason.class, "watchLater_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ThreePoint> parser = PARSER;
                if (parser == null) {
                    synchronized (ThreePoint.class) {
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

    public DislikeReason getDislikeReasons(int i) {
        return this.dislikeReasons_.get(i);
    }

    public int getDislikeReasonsCount() {
        return this.dislikeReasons_.size();
    }

    public List<DislikeReason> getDislikeReasonsList() {
        return this.dislikeReasons_;
    }

    public InterfaceC5926f getDislikeReasonsOrBuilder(int i) {
        return this.dislikeReasons_.get(i);
    }

    public List<? extends InterfaceC5926f> getDislikeReasonsOrBuilderList() {
        return this.dislikeReasons_;
    }

    public DislikeReason getFeedbacks(int i) {
        return this.feedbacks_.get(i);
    }

    public int getFeedbacksCount() {
        return this.feedbacks_.size();
    }

    public List<DislikeReason> getFeedbacksList() {
        return this.feedbacks_;
    }

    public InterfaceC5926f getFeedbacksOrBuilder(int i) {
        return this.feedbacks_.get(i);
    }

    public List<? extends InterfaceC5926f> getFeedbacksOrBuilderList() {
        return this.feedbacks_;
    }

    public int getWatchLater() {
        return this.watchLater_;
    }

    public static C5894b newBuilder(ThreePoint threePoint) {
        return DEFAULT_INSTANCE.createBuilder(threePoint);
    }

    public static ThreePoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ThreePoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDislikeReasons(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureDislikeReasonsIsMutable();
        this.dislikeReasons_.add(i, dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeedbacks(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureFeedbacksIsMutable();
        this.feedbacks_.add(i, dislikeReason);
    }

    public static ThreePoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ThreePoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ThreePoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ThreePoint parseFrom(InputStream inputStream) throws IOException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ThreePoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
