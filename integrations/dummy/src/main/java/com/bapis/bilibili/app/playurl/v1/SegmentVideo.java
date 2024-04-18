package com.bapis.bilibili.app.playurl.v1;

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
public final class SegmentVideo extends GeneratedMessageLite<SegmentVideo, SegmentVideo.Builder> implements MessageLiteOrBuilder {
    private static final SegmentVideo DEFAULT_INSTANCE;
    private static volatile Parser<SegmentVideo> PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ResponseUrl> segment_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.SegmentVideo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65161 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16546xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16546xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16546xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16546xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16546xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16546xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16546xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16546xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SegmentVideo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65161 c65161) {
            this();
        }

        public Builder addAllSegment(Iterable<? extends ResponseUrl> iterable) {
            copyOnWrite();
            ((SegmentVideo) this.instance).addAllSegment(iterable);
            return this;
        }

        public Builder addSegment(ResponseUrl responseUrl) {
            copyOnWrite();
            ((SegmentVideo) this.instance).addSegment(responseUrl);
            return this;
        }

        public Builder clearSegment() {
            copyOnWrite();
            ((SegmentVideo) this.instance).clearSegment();
            return this;
        }

        public ResponseUrl getSegment(int i) {
            return ((SegmentVideo) this.instance).getSegment(i);
        }

        public int getSegmentCount() {
            return ((SegmentVideo) this.instance).getSegmentCount();
        }

        public List<ResponseUrl> getSegmentList() {
            return Collections.unmodifiableList(((SegmentVideo) this.instance).getSegmentList());
        }

        public Builder removeSegment(int i) {
            copyOnWrite();
            ((SegmentVideo) this.instance).removeSegment(i);
            return this;
        }

        public Builder setSegment(int i, ResponseUrl responseUrl) {
            copyOnWrite();
            ((SegmentVideo) this.instance).setSegment(i, responseUrl);
            return this;
        }

        private Builder() {
            super(SegmentVideo.DEFAULT_INSTANCE);
        }

        public Builder addSegment(int i, ResponseUrl responseUrl) {
            copyOnWrite();
            ((SegmentVideo) this.instance).addSegment(i, responseUrl);
            return this;
        }

        public Builder setSegment(int i, ResponseUrl.Builder builder) {
            copyOnWrite();
            ((SegmentVideo) this.instance).setSegment(i, builder.build());
            return this;
        }

        public Builder addSegment(ResponseUrl.Builder builder) {
            copyOnWrite();
            ((SegmentVideo) this.instance).addSegment(builder.build());
            return this;
        }

        public Builder addSegment(int i, ResponseUrl.Builder builder) {
            copyOnWrite();
            ((SegmentVideo) this.instance).addSegment(i, builder.build());
            return this;
        }
    }

    static {
        SegmentVideo segmentVideo = new SegmentVideo();
        DEFAULT_INSTANCE = segmentVideo;
        GeneratedMessageLite.registerDefaultInstance(SegmentVideo.class, segmentVideo);
    }

    private SegmentVideo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegment(Iterable<? extends ResponseUrl> iterable) {
        ensureSegmentIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.segment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegment(ResponseUrl responseUrl) {
        responseUrl.getClass();
        ensureSegmentIsMutable();
        this.segment_.add(responseUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSegmentIsMutable() {
        Internal.ProtobufList<ResponseUrl> protobufList = this.segment_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.segment_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SegmentVideo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SegmentVideo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SegmentVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SegmentVideo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SegmentVideo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegment(int i) {
        ensureSegmentIsMutable();
        this.segment_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(int i, ResponseUrl responseUrl) {
        responseUrl.getClass();
        ensureSegmentIsMutable();
        this.segment_.set(i, responseUrl);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65161.f16546xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SegmentVideo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"segment_", ResponseUrl.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SegmentVideo> parser = PARSER;
                if (parser == null) {
                    synchronized (SegmentVideo.class) {
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

    public ResponseUrl getSegment(int i) {
        return this.segment_.get(i);
    }

    public int getSegmentCount() {
        return this.segment_.size();
    }

    public List<ResponseUrl> getSegmentList() {
        return this.segment_;
    }

    public ResponseUrlOrBuilder getSegmentOrBuilder(int i) {
        return this.segment_.get(i);
    }

    public List<? extends ResponseUrlOrBuilder> getSegmentOrBuilderList() {
        return this.segment_;
    }

    public static Builder newBuilder(SegmentVideo segmentVideo) {
        return DEFAULT_INSTANCE.createBuilder(segmentVideo);
    }

    public static SegmentVideo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SegmentVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SegmentVideo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SegmentVideo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegment(int i, ResponseUrl responseUrl) {
        responseUrl.getClass();
        ensureSegmentIsMutable();
        this.segment_.add(i, responseUrl);
    }

    public static SegmentVideo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SegmentVideo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SegmentVideo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SegmentVideo parseFrom(InputStream inputStream) throws IOException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SegmentVideo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SegmentVideo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SegmentVideo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SegmentVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
