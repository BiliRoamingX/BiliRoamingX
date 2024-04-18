package com.bapis.bilibili.app.view.v1;

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
public final class Dislike extends GeneratedMessageLite<Dislike, Dislike.Builder> implements MessageLiteOrBuilder {
    private static final Dislike DEFAULT_INSTANCE;
    private static volatile Parser<Dislike> PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 3;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String subtitle_ = "";
    private Internal.ProtobufList<DislikeReasons> reasons_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Dislike$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16728xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16728xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16728xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16728xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16728xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16728xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16728xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16728xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Dislike, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67551 c67551) {
            this();
        }

        public Builder addAllReasons(Iterable<? extends DislikeReasons> iterable) {
            copyOnWrite();
            ((Dislike) this.instance).addAllReasons(iterable);
            return this;
        }

        public Builder addReasons(DislikeReasons dislikeReasons) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(dislikeReasons);
            return this;
        }

        public Builder clearReasons() {
            copyOnWrite();
            ((Dislike) this.instance).clearReasons();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((Dislike) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Dislike) this.instance).clearTitle();
            return this;
        }

        public DislikeReasons getReasons(int i) {
            return ((Dislike) this.instance).getReasons(i);
        }

        public int getReasonsCount() {
            return ((Dislike) this.instance).getReasonsCount();
        }

        public List<DislikeReasons> getReasonsList() {
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

        public Builder removeReasons(int i) {
            copyOnWrite();
            ((Dislike) this.instance).removeReasons(i);
            return this;
        }

        public Builder setReasons(int i, DislikeReasons dislikeReasons) {
            copyOnWrite();
            ((Dislike) this.instance).setReasons(i, dislikeReasons);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((Dislike) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Dislike) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Dislike) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Dislike) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Dislike.DEFAULT_INSTANCE);
        }

        public Builder addReasons(int i, DislikeReasons dislikeReasons) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(i, dislikeReasons);
            return this;
        }

        public Builder setReasons(int i, DislikeReasons.Builder builder) {
            copyOnWrite();
            ((Dislike) this.instance).setReasons(i, builder.build());
            return this;
        }

        public Builder addReasons(DislikeReasons.Builder builder) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(builder.build());
            return this;
        }

        public Builder addReasons(int i, DislikeReasons.Builder builder) {
            copyOnWrite();
            ((Dislike) this.instance).addReasons(i, builder.build());
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

    public void addAllReasons(Iterable<? extends DislikeReasons> iterable) {
        ensureReasonsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.reasons_);
    }

    public void addReasons(DislikeReasons dislikeReasons) {
        dislikeReasons.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(dislikeReasons);
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
        Internal.ProtobufList<DislikeReasons> protobufList = this.reasons_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.reasons_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Dislike getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
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

    public void removeReasons(int i) {
        ensureReasonsIsMutable();
        this.reasons_.remove(i);
    }

    public void setReasons(int i, DislikeReasons dislikeReasons) {
        dislikeReasons.getClass();
        ensureReasonsIsMutable();
        this.reasons_.set(i, dislikeReasons);
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67551.f16728xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Dislike();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b", new Object[]{"title_", "subtitle_", "reasons_", DislikeReasons.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Dislike> parser = PARSER;
                if (parser == null) {
                    synchronized (Dislike.class) {
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

    public DislikeReasons getReasons(int i) {
        return this.reasons_.get(i);
    }

    public int getReasonsCount() {
        return this.reasons_.size();
    }

    public List<DislikeReasons> getReasonsList() {
        return this.reasons_;
    }

    public DislikeReasonsOrBuilder getReasonsOrBuilder(int i) {
        return this.reasons_.get(i);
    }

    public List<? extends DislikeReasonsOrBuilder> getReasonsOrBuilderList() {
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

    public static Builder newBuilder(Dislike dislike) {
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

    public void addReasons(int i, DislikeReasons dislikeReasons) {
        dislikeReasons.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(i, dislikeReasons);
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
