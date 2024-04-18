package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
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
public final class CM extends GeneratedMessageLite<CM, CM.Builder> implements MessageLiteOrBuilder {
    public static final int ADS_CONTROL_FIELD_NUMBER = 2;
    public static final int CM_UNDER_PLAYER_FIELD_NUMBER = 1;
    private static final CM DEFAULT_INSTANCE;
    private static volatile Parser<CM> PARSER = null;
    public static final int SOURCE_CONTENT_FIELD_NUMBER = 3;
    private Any adsControl_;
    private Any cmUnderPlayer_;
    private Internal.ProtobufList<Any> sourceContent_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.CM$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17097xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17097xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17097xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17097xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17097xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17097xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17097xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17097xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CM, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71221 c71221) {
            this();
        }

        public Builder addAllSourceContent(Iterable<? extends Any> iterable) {
            copyOnWrite();
            ((CM) this.instance).addAllSourceContent(iterable);
            return this;
        }

        public Builder addSourceContent(Any any) {
            copyOnWrite();
            ((CM) this.instance).addSourceContent(any);
            return this;
        }

        public Builder clearAdsControl() {
            copyOnWrite();
            ((CM) this.instance).clearAdsControl();
            return this;
        }

        public Builder clearCmUnderPlayer() {
            copyOnWrite();
            ((CM) this.instance).clearCmUnderPlayer();
            return this;
        }

        public Builder clearSourceContent() {
            copyOnWrite();
            ((CM) this.instance).clearSourceContent();
            return this;
        }

        public Any getAdsControl() {
            return ((CM) this.instance).getAdsControl();
        }

        public Any getCmUnderPlayer() {
            return ((CM) this.instance).getCmUnderPlayer();
        }

        public Any getSourceContent(int i) {
            return ((CM) this.instance).getSourceContent(i);
        }

        public int getSourceContentCount() {
            return ((CM) this.instance).getSourceContentCount();
        }

        public List<Any> getSourceContentList() {
            return Collections.unmodifiableList(((CM) this.instance).getSourceContentList());
        }

        public boolean hasAdsControl() {
            return ((CM) this.instance).hasAdsControl();
        }

        public boolean hasCmUnderPlayer() {
            return ((CM) this.instance).hasCmUnderPlayer();
        }

        public Builder mergeAdsControl(Any any) {
            copyOnWrite();
            ((CM) this.instance).mergeAdsControl(any);
            return this;
        }

        public Builder mergeCmUnderPlayer(Any any) {
            copyOnWrite();
            ((CM) this.instance).mergeCmUnderPlayer(any);
            return this;
        }

        public Builder removeSourceContent(int i) {
            copyOnWrite();
            ((CM) this.instance).removeSourceContent(i);
            return this;
        }

        public Builder setAdsControl(Any any) {
            copyOnWrite();
            ((CM) this.instance).setAdsControl(any);
            return this;
        }

        public Builder setCmUnderPlayer(Any any) {
            copyOnWrite();
            ((CM) this.instance).setCmUnderPlayer(any);
            return this;
        }

        public Builder setSourceContent(int i, Any any) {
            copyOnWrite();
            ((CM) this.instance).setSourceContent(i, any);
            return this;
        }

        private Builder() {
            super(CM.DEFAULT_INSTANCE);
        }

        public Builder addSourceContent(int i, Any any) {
            copyOnWrite();
            ((CM) this.instance).addSourceContent(i, any);
            return this;
        }

        public Builder setAdsControl(Any.Builder builder) {
            copyOnWrite();
            ((CM) this.instance).setAdsControl(builder.build());
            return this;
        }

        public Builder setCmUnderPlayer(Any.Builder builder) {
            copyOnWrite();
            ((CM) this.instance).setCmUnderPlayer(builder.build());
            return this;
        }

        public Builder setSourceContent(int i, Any.Builder builder) {
            copyOnWrite();
            ((CM) this.instance).setSourceContent(i, builder.build());
            return this;
        }

        public Builder addSourceContent(Any.Builder builder) {
            copyOnWrite();
            ((CM) this.instance).addSourceContent(builder.build());
            return this;
        }

        public Builder addSourceContent(int i, Any.Builder builder) {
            copyOnWrite();
            ((CM) this.instance).addSourceContent(i, builder.build());
            return this;
        }
    }

    static {
        CM cm = new CM();
        DEFAULT_INSTANCE = cm;
        GeneratedMessageLite.registerDefaultInstance(CM.class, cm);
    }

    private CM() {
    }

    public void addAllSourceContent(Iterable<? extends Any> iterable) {
        ensureSourceContentIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sourceContent_);
    }

    public void addSourceContent(Any any) {
        any.getClass();
        ensureSourceContentIsMutable();
        this.sourceContent_.add(any);
    }

    public void clearAdsControl() {
        this.adsControl_ = null;
    }

    public void clearCmUnderPlayer() {
        this.cmUnderPlayer_ = null;
    }

    public void clearSourceContent() {
        this.sourceContent_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSourceContentIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.sourceContent_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sourceContent_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CM getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAdsControl(Any any) {
        any.getClass();
        Any any2 = this.adsControl_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.adsControl_ = Any.newBuilder(this.adsControl_).mergeFrom((Any) any).buildPartial();
        } else {
            this.adsControl_ = any;
        }
    }

    public void mergeCmUnderPlayer(Any any) {
        any.getClass();
        Any any2 = this.cmUnderPlayer_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.cmUnderPlayer_ = Any.newBuilder(this.cmUnderPlayer_).mergeFrom((Any) any).buildPartial();
        } else {
            this.cmUnderPlayer_ = any;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CM parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CM parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CM> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeSourceContent(int i) {
        ensureSourceContentIsMutable();
        this.sourceContent_.remove(i);
    }

    public void setAdsControl(Any any) {
        any.getClass();
        this.adsControl_ = any;
    }

    public void setCmUnderPlayer(Any any) {
        any.getClass();
        this.cmUnderPlayer_ = any;
    }

    public void setSourceContent(int i, Any any) {
        any.getClass();
        ensureSourceContentIsMutable();
        this.sourceContent_.set(i, any);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71221.f17097xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CM();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b", new Object[]{"cmUnderPlayer_", "adsControl_", "sourceContent_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CM> parser = PARSER;
                if (parser == null) {
                    synchronized (CM.class) {
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

    public Any getAdsControl() {
        Any any = this.adsControl_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public Any getCmUnderPlayer() {
        Any any = this.cmUnderPlayer_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public Any getSourceContent(int i) {
        return this.sourceContent_.get(i);
    }

    public int getSourceContentCount() {
        return this.sourceContent_.size();
    }

    public List<Any> getSourceContentList() {
        return this.sourceContent_;
    }

    public AnyOrBuilder getSourceContentOrBuilder(int i) {
        return this.sourceContent_.get(i);
    }

    public List<? extends AnyOrBuilder> getSourceContentOrBuilderList() {
        return this.sourceContent_;
    }

    public boolean hasAdsControl() {
        return this.adsControl_ != null;
    }

    public boolean hasCmUnderPlayer() {
        return this.cmUnderPlayer_ != null;
    }

    public static Builder newBuilder(CM cm) {
        return DEFAULT_INSTANCE.createBuilder(cm);
    }

    public static CM parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CM parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CM parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addSourceContent(int i, Any any) {
        any.getClass();
        ensureSourceContentIsMutable();
        this.sourceContent_.add(i, any);
    }

    public static CM parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CM parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CM parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CM parseFrom(InputStream inputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CM parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CM parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CM parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
