package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeContentV2;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class GyroscopeEntityV2 extends GeneratedMessageLite<GyroscopeEntityV2, GyroscopeEntityV2.Builder> implements GyroscopeEntityV2OrBuilder {
    public static final int CONTENTS_FIELD_NUMBER = 2;
    private static final GyroscopeEntityV2 DEFAULT_INSTANCE;
    public static final int DISPLAY_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<GyroscopeEntityV2> PARSER;
    private String displayType_ = "";
    private Internal.ProtobufList<GyroscopeContentV2> contents_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75431 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17385xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17385xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17385xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17385xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17385xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17385xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17385xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17385xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GyroscopeEntityV2, Builder> implements GyroscopeEntityV2OrBuilder {
        /* synthetic */ Builder(C75431 c75431) {
            this();
        }

        public Builder addAllContents(Iterable<? extends GyroscopeContentV2> iterable) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).addAllContents(iterable);
            return this;
        }

        public Builder addContents(GyroscopeContentV2 gyroscopeContentV2) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).addContents(gyroscopeContentV2);
            return this;
        }

        public Builder clearContents() {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).clearContents();
            return this;
        }

        public Builder clearDisplayType() {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).clearDisplayType();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
        public GyroscopeContentV2 getContents(int i) {
            return ((GyroscopeEntityV2) this.instance).getContents(i);
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
        public int getContentsCount() {
            return ((GyroscopeEntityV2) this.instance).getContentsCount();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
        public List<GyroscopeContentV2> getContentsList() {
            return Collections.unmodifiableList(((GyroscopeEntityV2) this.instance).getContentsList());
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
        public String getDisplayType() {
            return ((GyroscopeEntityV2) this.instance).getDisplayType();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
        public ByteString getDisplayTypeBytes() {
            return ((GyroscopeEntityV2) this.instance).getDisplayTypeBytes();
        }

        public Builder removeContents(int i) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).removeContents(i);
            return this;
        }

        public Builder setContents(int i, GyroscopeContentV2 gyroscopeContentV2) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).setContents(i, gyroscopeContentV2);
            return this;
        }

        public Builder setDisplayType(String str) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).setDisplayType(str);
            return this;
        }

        public Builder setDisplayTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).setDisplayTypeBytes(byteString);
            return this;
        }

        private Builder() {
            super(GyroscopeEntityV2.DEFAULT_INSTANCE);
        }

        public Builder addContents(int i, GyroscopeContentV2 gyroscopeContentV2) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).addContents(i, gyroscopeContentV2);
            return this;
        }

        public Builder setContents(int i, GyroscopeContentV2.Builder builder) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).setContents(i, builder.build());
            return this;
        }

        public Builder addContents(GyroscopeContentV2.Builder builder) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).addContents(builder.build());
            return this;
        }

        public Builder addContents(int i, GyroscopeContentV2.Builder builder) {
            copyOnWrite();
            ((GyroscopeEntityV2) this.instance).addContents(i, builder.build());
            return this;
        }
    }

    static {
        GyroscopeEntityV2 gyroscopeEntityV2 = new GyroscopeEntityV2();
        DEFAULT_INSTANCE = gyroscopeEntityV2;
        GeneratedMessageLite.registerDefaultInstance(GyroscopeEntityV2.class, gyroscopeEntityV2);
    }

    private GyroscopeEntityV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllContents(Iterable<? extends GyroscopeContentV2> iterable) {
        ensureContentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.contents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContents(GyroscopeContentV2 gyroscopeContentV2) {
        gyroscopeContentV2.getClass();
        ensureContentsIsMutable();
        this.contents_.add(gyroscopeContentV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContents() {
        this.contents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayType() {
        this.displayType_ = getDefaultInstance().getDisplayType();
    }

    private void ensureContentsIsMutable() {
        Internal.ProtobufList<GyroscopeContentV2> protobufList = this.contents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.contents_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GyroscopeEntityV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GyroscopeEntityV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GyroscopeEntityV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GyroscopeEntityV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeContents(int i) {
        ensureContentsIsMutable();
        this.contents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContents(int i, GyroscopeContentV2 gyroscopeContentV2) {
        gyroscopeContentV2.getClass();
        ensureContentsIsMutable();
        this.contents_.set(i, gyroscopeContentV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayType(String str) {
        str.getClass();
        this.displayType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.displayType_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75431.f17385xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GyroscopeEntityV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"displayType_", "contents_", GyroscopeContentV2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GyroscopeEntityV2> parser = PARSER;
                if (parser == null) {
                    synchronized (GyroscopeEntityV2.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
    public GyroscopeContentV2 getContents(int i) {
        return this.contents_.get(i);
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
    public int getContentsCount() {
        return this.contents_.size();
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
    public List<GyroscopeContentV2> getContentsList() {
        return this.contents_;
    }

    public GyroscopeContentV2OrBuilder getContentsOrBuilder(int i) {
        return this.contents_.get(i);
    }

    public List<? extends GyroscopeContentV2OrBuilder> getContentsOrBuilderList() {
        return this.contents_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
    public String getDisplayType() {
        return this.displayType_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2OrBuilder
    public ByteString getDisplayTypeBytes() {
        return ByteString.copyFromUtf8(this.displayType_);
    }

    public static Builder newBuilder(GyroscopeEntityV2 gyroscopeEntityV2) {
        return DEFAULT_INSTANCE.createBuilder(gyroscopeEntityV2);
    }

    public static GyroscopeEntityV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GyroscopeEntityV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GyroscopeEntityV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContents(int i, GyroscopeContentV2 gyroscopeContentV2) {
        gyroscopeContentV2.getClass();
        ensureContentsIsMutable();
        this.contents_.add(i, gyroscopeContentV2);
    }

    public static GyroscopeEntityV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GyroscopeEntityV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GyroscopeEntityV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GyroscopeEntityV2 parseFrom(InputStream inputStream) throws IOException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GyroscopeEntityV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GyroscopeEntityV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GyroscopeEntityV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GyroscopeEntityV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
