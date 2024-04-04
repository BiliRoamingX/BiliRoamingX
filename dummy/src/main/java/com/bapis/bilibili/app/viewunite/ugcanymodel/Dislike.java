package com.bapis.bilibili.app.viewunite.ugcanymodel;

import com.bapis.bilibili.app.viewunite.ugcanymodel.DislikeReason;
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
public final class Dislike extends GeneratedMessageLite<Dislike, Dislike.b> implements MessageLiteOrBuilder {
    private static final Dislike DEFAULT_INSTANCE;
    private static volatile Parser<Dislike> PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 3;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String subtitle_ = "";
    private Internal.ProtobufList<DislikeReason> reasons_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<Dislike, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b addAllReasons(Iterable<? extends DislikeReason> iterable) {
            copyOnWrite();
            ((Dislike) this.instance).addAllReasons(iterable);
            return this;
        }

        public b addReasons(DislikeReason dislikeReason) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(dislikeReason);
            return this;
        }

        public b clearReasons() {
            copyOnWrite();
            ((Dislike) this.instance).clearReasons();
            return this;
        }

        public b clearSubtitle() {
            copyOnWrite();
            ((Dislike) this.instance).clearSubtitle();
            return this;
        }

        public b clearTitle() {
            copyOnWrite();
            ((Dislike) this.instance).clearTitle();
            return this;
        }

        public DislikeReason getReasons(int i2) {
            return ((Dislike) this.instance).getReasons(i2);
        }

        public int getReasonsCount() {
            return ((Dislike) this.instance).getReasonsCount();
        }

        public List<DislikeReason> getReasonsList() {
            return Collections.unmodifiableList(((Dislike) this.instance).getReasonsList());
        }

        public String getSubtitle() {
            return ((Dislike) this.instance).getSubtitle();
        }

        public ByteString getSubtitleBytes() {
            return ((Dislike) this.instance).getSubtitleBytes();
        }

        public String getTitle() {
            return ((Dislike) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Dislike) this.instance).getTitleBytes();
        }

        public b removeReasons(int i2) {
            copyOnWrite();
            ((Dislike) this.instance).removeReasons(i2);
            return this;
        }

        public b setReasons(int i2, DislikeReason dislikeReason) {
            copyOnWrite();
            ((Dislike) this.instance).setReasons(i2, dislikeReason);
            return this;
        }

        public b setSubtitle(String str) {
            copyOnWrite();
            ((Dislike) this.instance).setSubtitle(str);
            return this;
        }

        public b setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Dislike) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public b setTitle(String str) {
            copyOnWrite();
            ((Dislike) this.instance).setTitle(str);
            return this;
        }

        public b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Dislike) this.instance).setTitleBytes(byteString);
            return this;
        }

        private b() {
            super(Dislike.DEFAULT_INSTANCE);
        }

        public b addReasons(int i2, DislikeReason dislikeReason) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(i2, dislikeReason);
            return this;
        }

        public b setReasons(int i2, DislikeReason.b bVar) {
            copyOnWrite();
            ((Dislike) this.instance).setReasons(i2, bVar.build());
            return this;
        }

        public b addReasons(DislikeReason.b bVar) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(bVar.build());
            return this;
        }

        public b addReasons(int i2, DislikeReason.b bVar) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(i2, bVar.build());
            return this;
        }
    }

    static {
        Dislike dislike = new Dislike();
        DEFAULT_INSTANCE = dislike;
        GeneratedMessageLite.registerDefaultInstance(Dislike.class, dislike);
    }

    private Dislike() {
    }

    public void addAllReasons(Iterable<? extends DislikeReason> iterable) {
        ensureReasonsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.reasons_);
    }

    public void addReasons(DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(dislikeReason);
    }

    public void clearReasons() {
        this.reasons_ = GeneratedMessageLite.emptyProtobufList();
    }

    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureReasonsIsMutable() {
        Internal.ProtobufList<DislikeReason> protobufList = this.reasons_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.reasons_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Dislike getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Dislike parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Dislike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dislike parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Dislike> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeReasons(int i2) {
        ensureReasonsIsMutable();
        this.reasons_.remove(i2);
    }

    public void setReasons(int i2, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.set(i2, dislikeReason);
    }

    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Dislike();
            case 2:
                return new b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b", new Object[]{"title_", "subtitle_", "reasons_", DislikeReason.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Dislike> parser = PARSER;
                if (parser == null) {
                    synchronized (Dislike.class) {
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

    public DislikeReason getReasons(int i2) {
        return this.reasons_.get(i2);
    }

    public int getReasonsCount() {
        return this.reasons_.size();
    }

    public List<DislikeReason> getReasonsList() {
        return this.reasons_;
    }

    public com.bapis.bilibili.app.viewunite.ugcanymodel.a getReasonsOrBuilder(int i2) {
        return this.reasons_.get(i2);
    }

    public List<? extends com.bapis.bilibili.app.viewunite.ugcanymodel.a> getReasonsOrBuilderList() {
        return this.reasons_;
    }

    public String getSubtitle() {
        return this.subtitle_;
    }

    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static b newBuilder(Dislike dislike) {
        return DEFAULT_INSTANCE.createBuilder(dislike);
    }

    public static Dislike parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dislike) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dislike parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Dislike parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addReasons(int i2, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(i2, dislikeReason);
    }

    public static Dislike parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Dislike parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Dislike parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Dislike parseFrom(InputStream inputStream) throws IOException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dislike parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dislike parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Dislike parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dislike) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
