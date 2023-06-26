package com.bapis.bilibili.community.service.dm.v1;

import com.bapis.bilibili.community.service.dm.v1.ViewHerdDmElem;
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
public final class DmHerdView extends GeneratedMessageLite<DmHerdView, DmHerdView.Builder> implements MessageLiteOrBuilder {
    private static final DmHerdView DEFAULT_INSTANCE;
    public static final int DISPLAY_HERD_DM_NUM_FIELD_NUMBER = 1;
    public static final int HERD_DMS_FIELD_NUMBER = 2;
    private static volatile Parser<DmHerdView> PARSER;
    private int displayHerdDmNum_;
    private Internal.ProtobufList<ViewHerdDmElem> herdDms_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmHerdView$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72141 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17056xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17056xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DmHerdView, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72141 c72141) {
            this();
        }

        public Builder addAllHerdDms(Iterable<? extends ViewHerdDmElem> iterable) {
            copyOnWrite();
            ((DmHerdView) this.instance).addAllHerdDms(iterable);
            return this;
        }

        public Builder addHerdDms(ViewHerdDmElem viewHerdDmElem) {
            copyOnWrite();
            ((DmHerdView) this.instance).addHerdDms(viewHerdDmElem);
            return this;
        }

        public Builder clearDisplayHerdDmNum() {
            copyOnWrite();
            ((DmHerdView) this.instance).clearDisplayHerdDmNum();
            return this;
        }

        public Builder clearHerdDms() {
            copyOnWrite();
            ((DmHerdView) this.instance).clearHerdDms();
            return this;
        }

        public int getDisplayHerdDmNum() {
            return ((DmHerdView) this.instance).getDisplayHerdDmNum();
        }

        public ViewHerdDmElem getHerdDms(int i) {
            return ((DmHerdView) this.instance).getHerdDms(i);
        }

        public int getHerdDmsCount() {
            return ((DmHerdView) this.instance).getHerdDmsCount();
        }

        public List<ViewHerdDmElem> getHerdDmsList() {
            return Collections.unmodifiableList(((DmHerdView) this.instance).getHerdDmsList());
        }

        public Builder removeHerdDms(int i) {
            copyOnWrite();
            ((DmHerdView) this.instance).removeHerdDms(i);
            return this;
        }

        public Builder setDisplayHerdDmNum(int i) {
            copyOnWrite();
            ((DmHerdView) this.instance).setDisplayHerdDmNum(i);
            return this;
        }

        public Builder setHerdDms(int i, ViewHerdDmElem viewHerdDmElem) {
            copyOnWrite();
            ((DmHerdView) this.instance).setHerdDms(i, viewHerdDmElem);
            return this;
        }

        private Builder() {
            super(DmHerdView.DEFAULT_INSTANCE);
        }

        public Builder addHerdDms(int i, ViewHerdDmElem viewHerdDmElem) {
            copyOnWrite();
            ((DmHerdView) this.instance).addHerdDms(i, viewHerdDmElem);
            return this;
        }

        public Builder setHerdDms(int i, ViewHerdDmElem.Builder builder) {
            copyOnWrite();
            ((DmHerdView) this.instance).setHerdDms(i, builder.build());
            return this;
        }

        public Builder addHerdDms(ViewHerdDmElem.Builder builder) {
            copyOnWrite();
            ((DmHerdView) this.instance).addHerdDms(builder.build());
            return this;
        }

        public Builder addHerdDms(int i, ViewHerdDmElem.Builder builder) {
            copyOnWrite();
            ((DmHerdView) this.instance).addHerdDms(i, builder.build());
            return this;
        }
    }

    static {
        DmHerdView dmHerdView = new DmHerdView();
        DEFAULT_INSTANCE = dmHerdView;
        GeneratedMessageLite.registerDefaultInstance(DmHerdView.class, dmHerdView);
    }

    private DmHerdView() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHerdDms(Iterable<? extends ViewHerdDmElem> iterable) {
        ensureHerdDmsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.herdDms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHerdDms(ViewHerdDmElem viewHerdDmElem) {
        viewHerdDmElem.getClass();
        ensureHerdDmsIsMutable();
        this.herdDms_.add(viewHerdDmElem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayHerdDmNum() {
        this.displayHerdDmNum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHerdDms() {
        this.herdDms_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureHerdDmsIsMutable() {
        Internal.ProtobufList<ViewHerdDmElem> protobufList = this.herdDms_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.herdDms_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DmHerdView getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmHerdView parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmHerdView) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmHerdView parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmHerdView> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHerdDms(int i) {
        ensureHerdDmsIsMutable();
        this.herdDms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayHerdDmNum(int i) {
        this.displayHerdDmNum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHerdDms(int i, ViewHerdDmElem viewHerdDmElem) {
        viewHerdDmElem.getClass();
        ensureHerdDmsIsMutable();
        this.herdDms_.set(i, viewHerdDmElem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72141.f17056xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmHerdView();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"displayHerdDmNum_", "herdDms_", ViewHerdDmElem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmHerdView> parser = PARSER;
                if (parser == null) {
                    synchronized (DmHerdView.class) {
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

    public int getDisplayHerdDmNum() {
        return this.displayHerdDmNum_;
    }

    public ViewHerdDmElem getHerdDms(int i) {
        return this.herdDms_.get(i);
    }

    public int getHerdDmsCount() {
        return this.herdDms_.size();
    }

    public List<ViewHerdDmElem> getHerdDmsList() {
        return this.herdDms_;
    }

    public ViewHerdDmElemOrBuilder getHerdDmsOrBuilder(int i) {
        return this.herdDms_.get(i);
    }

    public List<? extends ViewHerdDmElemOrBuilder> getHerdDmsOrBuilderList() {
        return this.herdDms_;
    }

    public static Builder newBuilder(DmHerdView dmHerdView) {
        return DEFAULT_INSTANCE.createBuilder(dmHerdView);
    }

    public static DmHerdView parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmHerdView) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmHerdView parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmHerdView parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHerdDms(int i, ViewHerdDmElem viewHerdDmElem) {
        viewHerdDmElem.getClass();
        ensureHerdDmsIsMutable();
        this.herdDms_.add(i, viewHerdDmElem);
    }

    public static DmHerdView parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmHerdView parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmHerdView parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmHerdView parseFrom(InputStream inputStream) throws IOException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmHerdView parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmHerdView parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmHerdView parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmHerdView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
