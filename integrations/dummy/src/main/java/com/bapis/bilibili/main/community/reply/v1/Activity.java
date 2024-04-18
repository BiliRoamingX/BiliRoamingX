package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class Activity extends GeneratedMessageLite<Activity, Activity.C14674b> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_ID_FIELD_NUMBER = 1;
    public static final int ACTIVITY_PLACEHOLDER_FIELD_NUMBER = 3;
    public static final int ACTIVITY_STATE_FIELD_NUMBER = 2;
    private static final Activity DEFAULT_INSTANCE;
    private static volatile Parser<Activity> PARSER;
    private long activityId_;
    private String activityPlaceholder_ = "";
    private long activityState_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Activity$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14673a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21978xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21978xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21978xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21978xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21978xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21978xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Activity$b */
    /* loaded from: classes21.dex */
    public static final class C14674b extends GeneratedMessageLite.Builder<Activity, C14674b> implements MessageLiteOrBuilder {
        /* synthetic */ C14674b(C14673a c14673a) {
            this();
        }

        public C14674b clearActivityId() {
            copyOnWrite();
            ((Activity) this.instance).clearActivityId();
            return this;
        }

        public C14674b clearActivityPlaceholder() {
            copyOnWrite();
            ((Activity) this.instance).clearActivityPlaceholder();
            return this;
        }

        public C14674b clearActivityState() {
            copyOnWrite();
            ((Activity) this.instance).clearActivityState();
            return this;
        }

        public long getActivityId() {
            return ((Activity) this.instance).getActivityId();
        }

        public String getActivityPlaceholder() {
            return ((Activity) this.instance).getActivityPlaceholder();
        }

        public ByteString getActivityPlaceholderBytes() {
            return ((Activity) this.instance).getActivityPlaceholderBytes();
        }

        public long getActivityState() {
            return ((Activity) this.instance).getActivityState();
        }

        public C14674b setActivityId(long j) {
            copyOnWrite();
            ((Activity) this.instance).setActivityId(j);
            return this;
        }

        public C14674b setActivityPlaceholder(String str) {
            copyOnWrite();
            ((Activity) this.instance).setActivityPlaceholder(str);
            return this;
        }

        public C14674b setActivityPlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setActivityPlaceholderBytes(byteString);
            return this;
        }

        public C14674b setActivityState(long j) {
            copyOnWrite();
            ((Activity) this.instance).setActivityState(j);
            return this;
        }

        private C14674b() {
            super(Activity.DEFAULT_INSTANCE);
        }
    }

    static {
        Activity activity = new Activity();
        DEFAULT_INSTANCE = activity;
        GeneratedMessageLite.registerDefaultInstance(Activity.class, activity);
    }

    private Activity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityId() {
        this.activityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityPlaceholder() {
        this.activityPlaceholder_ = getDefaultInstance().getActivityPlaceholder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityState() {
        this.activityState_ = 0L;
    }

    public static Activity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14674b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Activity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Activity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Activity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Activity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityId(long j) {
        this.activityId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityPlaceholder(String str) {
        str.getClass();
        this.activityPlaceholder_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityPlaceholderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.activityPlaceholder_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityState(long j) {
        this.activityState_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14673a.f21978xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Activity();
            case 2:
                return new C14674b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208", new Object[]{"activityId_", "activityState_", "activityPlaceholder_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Activity> parser = PARSER;
                if (parser == null) {
                    synchronized (Activity.class) {
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

    public long getActivityId() {
        return this.activityId_;
    }

    public String getActivityPlaceholder() {
        return this.activityPlaceholder_;
    }

    public ByteString getActivityPlaceholderBytes() {
        return ByteString.copyFromUtf8(this.activityPlaceholder_);
    }

    public long getActivityState() {
        return this.activityState_;
    }

    public static C14674b newBuilder(Activity activity) {
        return DEFAULT_INSTANCE.createBuilder(activity);
    }

    public static Activity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Activity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Activity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Activity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Activity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Activity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Activity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Activity parseFrom(InputStream inputStream) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Activity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Activity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Activity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
