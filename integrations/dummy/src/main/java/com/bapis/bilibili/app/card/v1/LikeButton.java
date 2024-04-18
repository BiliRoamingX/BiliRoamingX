package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class LikeButton extends GeneratedMessageLite<LikeButton, LikeButton.C5831b> implements InterfaceC5933m {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final LikeButton DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 4;
    public static final int EVENT_V2_FIELD_NUMBER = 6;
    private static volatile Parser<LikeButton> PARSER = null;
    public static final int SELECTED_FIELD_NUMBER = 5;
    public static final int SHOW_COUNT_FIELD_NUMBER = 3;
    private long aid_;
    private int count_;
    private int selected_;
    private boolean showCount_;
    private String event_ = "";
    private String eventV2_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.LikeButton$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5830a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15964xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15964xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15964xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.LikeButton$b */
    /* loaded from: classes13.dex */
    public static final class C5831b extends GeneratedMessageLite.Builder<LikeButton, C5831b> implements InterfaceC5933m {
        /* synthetic */ C5831b(C5830a c5830a) {
            this();
        }

        public C5831b clearAid() {
            copyOnWrite();
            ((LikeButton) this.instance).clearAid();
            return this;
        }

        public C5831b clearCount() {
            copyOnWrite();
            ((LikeButton) this.instance).clearCount();
            return this;
        }

        public C5831b clearEvent() {
            copyOnWrite();
            ((LikeButton) this.instance).clearEvent();
            return this;
        }

        public C5831b clearEventV2() {
            copyOnWrite();
            ((LikeButton) this.instance).clearEventV2();
            return this;
        }

        public C5831b clearSelected() {
            copyOnWrite();
            ((LikeButton) this.instance).clearSelected();
            return this;
        }

        public C5831b clearShowCount() {
            copyOnWrite();
            ((LikeButton) this.instance).clearShowCount();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public long getAid() {
            return ((LikeButton) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public int getCount() {
            return ((LikeButton) this.instance).getCount();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public String getEvent() {
            return ((LikeButton) this.instance).getEvent();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public ByteString getEventBytes() {
            return ((LikeButton) this.instance).getEventBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public String getEventV2() {
            return ((LikeButton) this.instance).getEventV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public ByteString getEventV2Bytes() {
            return ((LikeButton) this.instance).getEventV2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public int getSelected() {
            return ((LikeButton) this.instance).getSelected();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
        public boolean getShowCount() {
            return ((LikeButton) this.instance).getShowCount();
        }

        public C5831b setAid(long j) {
            copyOnWrite();
            ((LikeButton) this.instance).setAid(j);
            return this;
        }

        public C5831b setCount(int i) {
            copyOnWrite();
            ((LikeButton) this.instance).setCount(i);
            return this;
        }

        public C5831b setEvent(String str) {
            copyOnWrite();
            ((LikeButton) this.instance).setEvent(str);
            return this;
        }

        public C5831b setEventBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeButton) this.instance).setEventBytes(byteString);
            return this;
        }

        public C5831b setEventV2(String str) {
            copyOnWrite();
            ((LikeButton) this.instance).setEventV2(str);
            return this;
        }

        public C5831b setEventV2Bytes(ByteString byteString) {
            copyOnWrite();
            ((LikeButton) this.instance).setEventV2Bytes(byteString);
            return this;
        }

        public C5831b setSelected(int i) {
            copyOnWrite();
            ((LikeButton) this.instance).setSelected(i);
            return this;
        }

        public C5831b setShowCount(boolean z) {
            copyOnWrite();
            ((LikeButton) this.instance).setShowCount(z);
            return this;
        }

        private C5831b() {
            super(LikeButton.DEFAULT_INSTANCE);
        }
    }

    static {
        LikeButton likeButton = new LikeButton();
        DEFAULT_INSTANCE = likeButton;
        GeneratedMessageLite.registerDefaultInstance(LikeButton.class, likeButton);
    }

    private LikeButton() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = getDefaultInstance().getEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventV2() {
        this.eventV2_ = getDefaultInstance().getEventV2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelected() {
        this.selected_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowCount() {
        this.showCount_ = false;
    }

    public static LikeButton getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5831b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeButton parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeButton parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeButton> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i) {
        this.count_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(String str) {
        str.getClass();
        this.event_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.event_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventV2(String str) {
        str.getClass();
        this.eventV2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventV2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventV2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelected(int i) {
        this.selected_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowCount(boolean z) {
        this.showCount_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5830a.f15964xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeButton();
            case 2:
                return new C5831b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0007\u0004\u0208\u0005\u0004\u0006\u0208", new Object[]{"aid_", "count_", "showCount_", "event_", "selected_", "eventV2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeButton> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeButton.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public int getCount() {
        return this.count_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public String getEvent() {
        return this.event_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public ByteString getEventBytes() {
        return ByteString.copyFromUtf8(this.event_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public String getEventV2() {
        return this.eventV2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public ByteString getEventV2Bytes() {
        return ByteString.copyFromUtf8(this.eventV2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public int getSelected() {
        return this.selected_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5933m
    public boolean getShowCount() {
        return this.showCount_;
    }

    public static C5831b newBuilder(LikeButton likeButton) {
        return DEFAULT_INSTANCE.createBuilder(likeButton);
    }

    public static LikeButton parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeButton parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeButton parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeButton parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeButton parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeButton parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeButton parseFrom(InputStream inputStream) throws IOException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeButton parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeButton parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeButton parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
