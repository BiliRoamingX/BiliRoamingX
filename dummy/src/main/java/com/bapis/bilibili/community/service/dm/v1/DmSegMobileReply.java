package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes20.dex */
public final class DmSegMobileReply extends GeneratedMessageLite<DmSegMobileReply, DmSegMobileReply.C13173b> implements MessageLiteOrBuilder {
    public static final int AI_FLAG_FIELD_NUMBER = 3;
    public static final int COLORFUL_SRC_FIELD_NUMBER = 5;
    public static final int CONTEXT_SRC_FIELD_NUMBER = 6;
    private static final DmSegMobileReply DEFAULT_INSTANCE;
    public static final int ELEMS_FIELD_NUMBER = 1;
    private static volatile Parser<DmSegMobileReply> PARSER = null;
    public static final int SEGMENT_RULES_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 2;
    private DanmakuAIFlag aiFlag_;
    private int state_;
    private int segmentRulesMemoizedSerializedSize = -1;
    private Internal.ProtobufList<DanmakuElem> elems_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.LongList segmentRules_ = GeneratedMessageLite.emptyLongList();
    private Internal.ProtobufList<DmColorful> colorfulSrc_ = GeneratedMessageLite.emptyProtobufList();
    private String contextSrc_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmSegMobileReply$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C13172a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21517xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21517xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21517xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21517xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21517xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21517xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21517xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21517xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmSegMobileReply$b */
    /* loaded from: classes20.dex */
    public static final class C13173b extends GeneratedMessageLite.Builder<DmSegMobileReply, C13173b> implements MessageLiteOrBuilder {
        /* synthetic */ C13173b(C13172a c13172a) {
            this();
        }

        public C13173b addAllColorfulSrc(Iterable<? extends DmColorful> iterable) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addAllColorfulSrc(iterable);
            return this;
        }

        public C13173b addAllElems(Iterable<? extends DanmakuElem> iterable) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addAllElems(iterable);
            return this;
        }

        public C13173b addAllSegmentRules(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addAllSegmentRules(iterable);
            return this;
        }

        public C13173b addColorfulSrc(DmColorful dmColorful) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addColorfulSrc(dmColorful);
            return this;
        }

        public C13173b addElems(DanmakuElem danmakuElem) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addElems(danmakuElem);
            return this;
        }

        public C13173b addSegmentRules(long j) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addSegmentRules(j);
            return this;
        }

        public C13173b clearAiFlag() {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).clearAiFlag();
            return this;
        }

        public C13173b clearColorfulSrc() {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).clearColorfulSrc();
            return this;
        }

        public C13173b clearContextSrc() {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).clearContextSrc();
            return this;
        }

        public C13173b clearElems() {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).clearElems();
            return this;
        }

        public C13173b clearSegmentRules() {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).clearSegmentRules();
            return this;
        }

        public C13173b clearState() {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).clearState();
            return this;
        }

        public DanmakuAIFlag getAiFlag() {
            return ((DmSegMobileReply) this.instance).getAiFlag();
        }

        public DmColorful getColorfulSrc(int i) {
            return ((DmSegMobileReply) this.instance).getColorfulSrc(i);
        }

        public int getColorfulSrcCount() {
            return ((DmSegMobileReply) this.instance).getColorfulSrcCount();
        }

        public List<DmColorful> getColorfulSrcList() {
            return Collections.unmodifiableList(((DmSegMobileReply) this.instance).getColorfulSrcList());
        }

        public String getContextSrc() {
            return ((DmSegMobileReply) this.instance).getContextSrc();
        }

        public ByteString getContextSrcBytes() {
            return ((DmSegMobileReply) this.instance).getContextSrcBytes();
        }

        public DanmakuElem getElems(int i) {
            return ((DmSegMobileReply) this.instance).getElems(i);
        }

        public int getElemsCount() {
            return ((DmSegMobileReply) this.instance).getElemsCount();
        }

        public List<DanmakuElem> getElemsList() {
            return Collections.unmodifiableList(((DmSegMobileReply) this.instance).getElemsList());
        }

        public long getSegmentRules(int i) {
            return ((DmSegMobileReply) this.instance).getSegmentRules(i);
        }

        public int getSegmentRulesCount() {
            return ((DmSegMobileReply) this.instance).getSegmentRulesCount();
        }

        public List<Long> getSegmentRulesList() {
            return Collections.unmodifiableList(((DmSegMobileReply) this.instance).getSegmentRulesList());
        }

        public int getState() {
            return ((DmSegMobileReply) this.instance).getState();
        }

        public boolean hasAiFlag() {
            return ((DmSegMobileReply) this.instance).hasAiFlag();
        }

        public C13173b mergeAiFlag(DanmakuAIFlag danmakuAIFlag) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).mergeAiFlag(danmakuAIFlag);
            return this;
        }

        public C13173b removeColorfulSrc(int i) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).removeColorfulSrc(i);
            return this;
        }

        public C13173b removeElems(int i) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).removeElems(i);
            return this;
        }

        public C13173b setAiFlag(DanmakuAIFlag danmakuAIFlag) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setAiFlag(danmakuAIFlag);
            return this;
        }

        public C13173b setColorfulSrc(int i, DmColorful dmColorful) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setColorfulSrc(i, dmColorful);
            return this;
        }

        public C13173b setContextSrc(String str) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setContextSrc(str);
            return this;
        }

        public C13173b setContextSrcBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setContextSrcBytes(byteString);
            return this;
        }

        public C13173b setElems(int i, DanmakuElem danmakuElem) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setElems(i, danmakuElem);
            return this;
        }

        public C13173b setSegmentRules(int i, long j) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setSegmentRules(i, j);
            return this;
        }

        public C13173b setState(int i) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setState(i);
            return this;
        }

        private C13173b() {
            super(DmSegMobileReply.DEFAULT_INSTANCE);
        }

        public C13173b addColorfulSrc(int i, DmColorful dmColorful) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addColorfulSrc(i, dmColorful);
            return this;
        }

        public C13173b addElems(int i, DanmakuElem danmakuElem) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addElems(i, danmakuElem);
            return this;
        }

        public C13173b setAiFlag(DanmakuAIFlag.C13132b c13132b) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setAiFlag(c13132b.build());
            return this;
        }

        public C13173b setColorfulSrc(int i, DmColorful.C13155b c13155b) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setColorfulSrc(i, c13155b.build());
            return this;
        }

        public C13173b setElems(int i, DanmakuElem.C13134b c13134b) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).setElems(i, c13134b.build());
            return this;
        }

        public C13173b addColorfulSrc(DmColorful.C13155b c13155b) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addColorfulSrc(c13155b.build());
            return this;
        }

        public C13173b addElems(DanmakuElem.C13134b c13134b) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addElems(c13134b.build());
            return this;
        }

        public C13173b addColorfulSrc(int i, DmColorful.C13155b c13155b) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addColorfulSrc(i, c13155b.build());
            return this;
        }

        public C13173b addElems(int i, DanmakuElem.C13134b c13134b) {
            copyOnWrite();
            ((DmSegMobileReply) this.instance).addElems(i, c13134b.build());
            return this;
        }
    }

    static {
        DmSegMobileReply dmSegMobileReply = new DmSegMobileReply();
        DEFAULT_INSTANCE = dmSegMobileReply;
        GeneratedMessageLite.registerDefaultInstance(DmSegMobileReply.class, dmSegMobileReply);
    }

    private DmSegMobileReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllColorfulSrc(Iterable<? extends DmColorful> iterable) {
        ensureColorfulSrcIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.colorfulSrc_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllElems(Iterable<? extends DanmakuElem> iterable) {
        ensureElemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.elems_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentRules(Iterable<? extends Long> iterable) {
        ensureSegmentRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.segmentRules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addColorfulSrc(DmColorful dmColorful) {
        dmColorful.getClass();
        ensureColorfulSrcIsMutable();
        this.colorfulSrc_.add(dmColorful);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addElems(DanmakuElem danmakuElem) {
        danmakuElem.getClass();
        ensureElemsIsMutable();
        this.elems_.add(danmakuElem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentRules(long j) {
        ensureSegmentRulesIsMutable();
        this.segmentRules_.addLong(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiFlag() {
        this.aiFlag_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorfulSrc() {
        this.colorfulSrc_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextSrc() {
        this.contextSrc_ = getDefaultInstance().getContextSrc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElems() {
        this.elems_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentRules() {
        this.segmentRules_ = GeneratedMessageLite.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    private void ensureColorfulSrcIsMutable() {
        Internal.ProtobufList<DmColorful> protobufList = this.colorfulSrc_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.colorfulSrc_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureElemsIsMutable() {
        Internal.ProtobufList<DanmakuElem> protobufList = this.elems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.elems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSegmentRulesIsMutable() {
        Internal.LongList longList = this.segmentRules_;
        if (longList.isModifiable()) {
            return;
        }
        this.segmentRules_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static DmSegMobileReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAiFlag(DanmakuAIFlag danmakuAIFlag) {
        danmakuAIFlag.getClass();
        DanmakuAIFlag danmakuAIFlag2 = this.aiFlag_;
        if (danmakuAIFlag2 != null && danmakuAIFlag2 != DanmakuAIFlag.getDefaultInstance()) {
            this.aiFlag_ = DanmakuAIFlag.newBuilder(this.aiFlag_).mergeFrom((DanmakuAIFlag) danmakuAIFlag).buildPartial();
        } else {
            this.aiFlag_ = danmakuAIFlag;
        }
    }

    public static C13173b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmSegMobileReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmSegMobileReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSegMobileReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmSegMobileReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeColorfulSrc(int i) {
        ensureColorfulSrcIsMutable();
        this.colorfulSrc_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeElems(int i) {
        ensureElemsIsMutable();
        this.elems_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiFlag(DanmakuAIFlag danmakuAIFlag) {
        danmakuAIFlag.getClass();
        this.aiFlag_ = danmakuAIFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorfulSrc(int i, DmColorful dmColorful) {
        dmColorful.getClass();
        ensureColorfulSrcIsMutable();
        this.colorfulSrc_.set(i, dmColorful);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextSrc(String str) {
        str.getClass();
        this.contextSrc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextSrcBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextSrc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElems(int i, DanmakuElem danmakuElem) {
        danmakuElem.getClass();
        ensureElemsIsMutable();
        this.elems_.set(i, danmakuElem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentRules(int i, long j) {
        ensureSegmentRulesIsMutable();
        this.segmentRules_.setLong(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13172a.f21517xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmSegMobileReply();
            case 2:
                return new C13173b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001b\u0002\u0004\u0003\t\u0004%\u0005\u001b\u0006\u0208", new Object[]{"elems_", DanmakuElem.class, "state_", "aiFlag_", "segmentRules_", "colorfulSrc_", DmColorful.class, "contextSrc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmSegMobileReply> parser = PARSER;
                if (parser == null) {
                    synchronized (DmSegMobileReply.class) {
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

    public DanmakuAIFlag getAiFlag() {
        DanmakuAIFlag danmakuAIFlag = this.aiFlag_;
        return danmakuAIFlag == null ? DanmakuAIFlag.getDefaultInstance() : danmakuAIFlag;
    }

    public DmColorful getColorfulSrc(int i) {
        return this.colorfulSrc_.get(i);
    }

    public int getColorfulSrcCount() {
        return this.colorfulSrc_.size();
    }

    public List<DmColorful> getColorfulSrcList() {
        return this.colorfulSrc_;
    }

    public InterfaceC13301h getColorfulSrcOrBuilder(int i) {
        return this.colorfulSrc_.get(i);
    }

    public List<? extends InterfaceC13301h> getColorfulSrcOrBuilderList() {
        return this.colorfulSrc_;
    }

    public String getContextSrc() {
        return this.contextSrc_;
    }

    public ByteString getContextSrcBytes() {
        return ByteString.copyFromUtf8(this.contextSrc_);
    }

    public DanmakuElem getElems(int i) {
        return this.elems_.get(i);
    }

    public int getElemsCount() {
        return this.elems_.size();
    }

    public List<DanmakuElem> getElemsList() {
        return this.elems_;
    }

    public InterfaceC13298e getElemsOrBuilder(int i) {
        return this.elems_.get(i);
    }

    public List<? extends InterfaceC13298e> getElemsOrBuilderList() {
        return this.elems_;
    }

    public long getSegmentRules(int i) {
        return this.segmentRules_.getLong(i);
    }

    public int getSegmentRulesCount() {
        return this.segmentRules_.size();
    }

    public List<Long> getSegmentRulesList() {
        return this.segmentRules_;
    }

    public int getState() {
        return this.state_;
    }

    public boolean hasAiFlag() {
        return this.aiFlag_ != null;
    }

    public static C13173b newBuilder(DmSegMobileReply dmSegMobileReply) {
        return DEFAULT_INSTANCE.createBuilder(dmSegMobileReply);
    }

    public static DmSegMobileReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSegMobileReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSegMobileReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmSegMobileReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addColorfulSrc(int i, DmColorful dmColorful) {
        dmColorful.getClass();
        ensureColorfulSrcIsMutable();
        this.colorfulSrc_.add(i, dmColorful);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addElems(int i, DanmakuElem danmakuElem) {
        danmakuElem.getClass();
        ensureElemsIsMutable();
        this.elems_.add(i, danmakuElem);
    }

    public static DmSegMobileReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmSegMobileReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmSegMobileReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmSegMobileReply parseFrom(InputStream inputStream) throws IOException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSegMobileReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSegMobileReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmSegMobileReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSegMobileReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
