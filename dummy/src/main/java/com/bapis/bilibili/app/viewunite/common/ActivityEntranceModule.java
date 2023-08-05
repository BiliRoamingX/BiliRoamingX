package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class ActivityEntranceModule extends GeneratedMessageLite<ActivityEntranceModule, ActivityEntranceModule.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_ENTRANCE_FIELD_NUMBER = 1;
    private static final ActivityEntranceModule DEFAULT_INSTANCE;
    private static volatile Parser<ActivityEntranceModule> PARSER;
    private Internal.ProtobufList<ActivityEntrance> activityEntrance_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.ActivityEntranceModule$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16956xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16956xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16956xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16956xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16956xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16956xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16956xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16956xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ActivityEntranceModule, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69681 c69681) {
            this();
        }

        public Builder addActivityEntrance(ActivityEntrance activityEntrance) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).addActivityEntrance(activityEntrance);
            return this;
        }

        public Builder addAllActivityEntrance(Iterable<? extends ActivityEntrance> iterable) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).addAllActivityEntrance(iterable);
            return this;
        }

        public Builder clearActivityEntrance() {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).clearActivityEntrance();
            return this;
        }

        public ActivityEntrance getActivityEntrance(int i) {
            return ((ActivityEntranceModule) this.instance).getActivityEntrance(i);
        }

        public int getActivityEntranceCount() {
            return ((ActivityEntranceModule) this.instance).getActivityEntranceCount();
        }

        public List<ActivityEntrance> getActivityEntranceList() {
            return Collections.unmodifiableList(((ActivityEntranceModule) this.instance).getActivityEntranceList());
        }

        public Builder removeActivityEntrance(int i) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).removeActivityEntrance(i);
            return this;
        }

        public Builder setActivityEntrance(int i, ActivityEntrance activityEntrance) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).setActivityEntrance(i, activityEntrance);
            return this;
        }

        private Builder() {
            super(ActivityEntranceModule.DEFAULT_INSTANCE);
        }

        public Builder addActivityEntrance(int i, ActivityEntrance activityEntrance) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).addActivityEntrance(i, activityEntrance);
            return this;
        }

        public Builder setActivityEntrance(int i, ActivityEntrance.Builder builder) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).setActivityEntrance(i, builder.build());
            return this;
        }

        public Builder addActivityEntrance(ActivityEntrance.Builder builder) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).addActivityEntrance(builder.build());
            return this;
        }

        public Builder addActivityEntrance(int i, ActivityEntrance.Builder builder) {
            copyOnWrite();
            ((ActivityEntranceModule) this.instance).addActivityEntrance(i, builder.build());
            return this;
        }
    }

    static {
        ActivityEntranceModule activityEntranceModule = new ActivityEntranceModule();
        DEFAULT_INSTANCE = activityEntranceModule;
        GeneratedMessageLite.registerDefaultInstance(ActivityEntranceModule.class, activityEntranceModule);
    }

    private ActivityEntranceModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityEntrance(ActivityEntrance activityEntrance) {
        activityEntrance.getClass();
        ensureActivityEntranceIsMutable();
        this.activityEntrance_.add(activityEntrance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActivityEntrance(Iterable<? extends ActivityEntrance> iterable) {
        ensureActivityEntranceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.activityEntrance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityEntrance() {
        this.activityEntrance_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureActivityEntranceIsMutable() {
        Internal.ProtobufList<ActivityEntrance> protobufList = this.activityEntrance_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.activityEntrance_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ActivityEntranceModule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivityEntranceModule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityEntranceModule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ActivityEntranceModule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActivityEntrance(int i) {
        ensureActivityEntranceIsMutable();
        this.activityEntrance_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityEntrance(int i, ActivityEntrance activityEntrance) {
        activityEntrance.getClass();
        ensureActivityEntranceIsMutable();
        this.activityEntrance_.set(i, activityEntrance);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69681.f16956xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ActivityEntranceModule();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"activityEntrance_", ActivityEntrance.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ActivityEntranceModule> parser = PARSER;
                if (parser == null) {
                    synchronized (ActivityEntranceModule.class) {
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

    public ActivityEntrance getActivityEntrance(int i) {
        return this.activityEntrance_.get(i);
    }

    public int getActivityEntranceCount() {
        return this.activityEntrance_.size();
    }

    public List<ActivityEntrance> getActivityEntranceList() {
        return this.activityEntrance_;
    }

    public ActivityEntranceOrBuilder getActivityEntranceOrBuilder(int i) {
        return this.activityEntrance_.get(i);
    }

    public List<? extends ActivityEntranceOrBuilder> getActivityEntranceOrBuilderList() {
        return this.activityEntrance_;
    }

    public static Builder newBuilder(ActivityEntranceModule activityEntranceModule) {
        return DEFAULT_INSTANCE.createBuilder(activityEntranceModule);
    }

    public static ActivityEntranceModule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityEntranceModule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ActivityEntranceModule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityEntrance(int i, ActivityEntrance activityEntrance) {
        activityEntrance.getClass();
        ensureActivityEntranceIsMutable();
        this.activityEntrance_.add(i, activityEntrance);
    }

    public static ActivityEntranceModule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ActivityEntranceModule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityEntranceModule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ActivityEntranceModule parseFrom(InputStream inputStream) throws IOException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityEntranceModule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityEntranceModule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ActivityEntranceModule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityEntranceModule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
