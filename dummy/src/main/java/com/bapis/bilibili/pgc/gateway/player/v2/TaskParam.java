package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class TaskParam extends GeneratedMessageLite<TaskParam, TaskParam.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_ID_FIELD_NUMBER = 2;
    private static final TaskParam DEFAULT_INSTANCE;
    private static volatile Parser<TaskParam> PARSER = null;
    public static final int TASK_TYPE_FIELD_NUMBER = 1;
    public static final int TIPS_ID_FIELD_NUMBER = 3;
    private long activityId_;
    private String taskType_ = "";
    private long tipsId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.TaskParam$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17602xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17602xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17602xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17602xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17602xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17602xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17602xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17602xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TaskParam, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78891 c78891) {
            this();
        }

        public Builder clearActivityId() {
            copyOnWrite();
            ((TaskParam) this.instance).clearActivityId();
            return this;
        }

        public Builder clearTaskType() {
            copyOnWrite();
            ((TaskParam) this.instance).clearTaskType();
            return this;
        }

        public Builder clearTipsId() {
            copyOnWrite();
            ((TaskParam) this.instance).clearTipsId();
            return this;
        }

        public long getActivityId() {
            return ((TaskParam) this.instance).getActivityId();
        }

        public String getTaskType() {
            return ((TaskParam) this.instance).getTaskType();
        }

        public ByteString getTaskTypeBytes() {
            return ((TaskParam) this.instance).getTaskTypeBytes();
        }

        public long getTipsId() {
            return ((TaskParam) this.instance).getTipsId();
        }

        public Builder setActivityId(long j) {
            copyOnWrite();
            ((TaskParam) this.instance).setActivityId(j);
            return this;
        }

        public Builder setTaskType(String str) {
            copyOnWrite();
            ((TaskParam) this.instance).setTaskType(str);
            return this;
        }

        public Builder setTaskTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((TaskParam) this.instance).setTaskTypeBytes(byteString);
            return this;
        }

        public Builder setTipsId(long j) {
            copyOnWrite();
            ((TaskParam) this.instance).setTipsId(j);
            return this;
        }

        private Builder() {
            super(TaskParam.DEFAULT_INSTANCE);
        }
    }

    static {
        TaskParam taskParam = new TaskParam();
        DEFAULT_INSTANCE = taskParam;
        GeneratedMessageLite.registerDefaultInstance(TaskParam.class, taskParam);
    }

    private TaskParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityId() {
        this.activityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaskType() {
        this.taskType_ = getDefaultInstance().getTaskType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTipsId() {
        this.tipsId_ = 0L;
    }

    public static TaskParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TaskParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TaskParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TaskParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TaskParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityId(long j) {
        this.activityId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaskType(String str) {
        str.getClass();
        this.taskType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaskTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.taskType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTipsId(long j) {
        this.tipsId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78891.f17602xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TaskParam();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0002", new Object[]{"taskType_", "activityId_", "tipsId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TaskParam> parser = PARSER;
                if (parser == null) {
                    synchronized (TaskParam.class) {
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

    public String getTaskType() {
        return this.taskType_;
    }

    public ByteString getTaskTypeBytes() {
        return ByteString.copyFromUtf8(this.taskType_);
    }

    public long getTipsId() {
        return this.tipsId_;
    }

    public static Builder newBuilder(TaskParam taskParam) {
        return DEFAULT_INSTANCE.createBuilder(taskParam);
    }

    public static TaskParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TaskParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TaskParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TaskParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TaskParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TaskParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TaskParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TaskParam parseFrom(InputStream inputStream) throws IOException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TaskParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TaskParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TaskParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TaskParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
