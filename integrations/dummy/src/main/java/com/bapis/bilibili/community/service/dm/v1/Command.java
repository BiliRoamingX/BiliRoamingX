package com.bapis.bilibili.community.service.dm.v1;

import com.bapis.bilibili.community.service.dm.v1.CommandDm;
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
/* loaded from: classes14.dex */
public final class Command extends GeneratedMessageLite<Command, Command.Builder> implements MessageLiteOrBuilder {
    public static final int COMMAND_DMS_FIELD_NUMBER = 1;
    private static final Command DEFAULT_INSTANCE;
    private static volatile Parser<Command> PARSER;
    private Internal.ProtobufList<CommandDm> commandDms_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Command$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17041xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17041xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Command, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71951 c71951) {
            this();
        }

        public Builder addAllCommandDms(Iterable<? extends CommandDm> iterable) {
            copyOnWrite();
            ((Command) this.instance).addAllCommandDms(iterable);
            return this;
        }

        public Builder addCommandDms(CommandDm commandDm) {
            copyOnWrite();
            ((Command) this.instance).addCommandDms(commandDm);
            return this;
        }

        public Builder clearCommandDms() {
            copyOnWrite();
            ((Command) this.instance).clearCommandDms();
            return this;
        }

        public CommandDm getCommandDms(int i) {
            return ((Command) this.instance).getCommandDms(i);
        }

        public int getCommandDmsCount() {
            return ((Command) this.instance).getCommandDmsCount();
        }

        public List<CommandDm> getCommandDmsList() {
            return Collections.unmodifiableList(((Command) this.instance).getCommandDmsList());
        }

        public Builder removeCommandDms(int i) {
            copyOnWrite();
            ((Command) this.instance).removeCommandDms(i);
            return this;
        }

        public Builder setCommandDms(int i, CommandDm commandDm) {
            copyOnWrite();
            ((Command) this.instance).setCommandDms(i, commandDm);
            return this;
        }

        private Builder() {
            super(Command.DEFAULT_INSTANCE);
        }

        public Builder addCommandDms(int i, CommandDm commandDm) {
            copyOnWrite();
            ((Command) this.instance).addCommandDms(i, commandDm);
            return this;
        }

        public Builder setCommandDms(int i, CommandDm.Builder builder) {
            copyOnWrite();
            ((Command) this.instance).setCommandDms(i, builder.build());
            return this;
        }

        public Builder addCommandDms(CommandDm.Builder builder) {
            copyOnWrite();
            ((Command) this.instance).addCommandDms(builder.build());
            return this;
        }

        public Builder addCommandDms(int i, CommandDm.Builder builder) {
            copyOnWrite();
            ((Command) this.instance).addCommandDms(i, builder.build());
            return this;
        }
    }

    static {
        Command command = new Command();
        DEFAULT_INSTANCE = command;
        GeneratedMessageLite.registerDefaultInstance(Command.class, command);
    }

    private Command() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommandDms(Iterable<? extends CommandDm> iterable) {
        ensureCommandDmsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.commandDms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandDms(CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.add(commandDm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommandDms() {
        this.commandDms_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCommandDmsIsMutable() {
        Internal.ProtobufList<CommandDm> protobufList = this.commandDms_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.commandDms_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Command getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Command parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Command) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Command parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Command> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCommandDms(int i) {
        ensureCommandDmsIsMutable();
        this.commandDms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandDms(int i, CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.set(i, commandDm);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71951.f17041xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Command();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"commandDms_", CommandDm.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Command> parser = PARSER;
                if (parser == null) {
                    synchronized (Command.class) {
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

    public CommandDm getCommandDms(int i) {
        return this.commandDms_.get(i);
    }

    public int getCommandDmsCount() {
        return this.commandDms_.size();
    }

    public List<CommandDm> getCommandDmsList() {
        return this.commandDms_;
    }

    public CommandDmOrBuilder getCommandDmsOrBuilder(int i) {
        return this.commandDms_.get(i);
    }

    public List<? extends CommandDmOrBuilder> getCommandDmsOrBuilderList() {
        return this.commandDms_;
    }

    public static Builder newBuilder(Command command) {
        return DEFAULT_INSTANCE.createBuilder(command);
    }

    public static Command parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Command) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Command parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Command parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandDms(int i, CommandDm commandDm) {
        commandDm.getClass();
        ensureCommandDmsIsMutable();
        this.commandDms_.add(i, commandDm);
    }

    public static Command parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Command parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Command parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Command parseFrom(InputStream inputStream) throws IOException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Command parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Command parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Command parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Command) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
