package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes20.dex */
public final class DanmakuElem extends GeneratedMessageLite<DanmakuElem, DanmakuElem.C13134b> implements InterfaceC13298e {
    public static final int ACTION_FIELD_NUMBER = 10;
    public static final int ANIMATION_FIELD_NUMBER = 22;
    public static final int ATTR_FIELD_NUMBER = 13;
    public static final int COLORFUL_FIELD_NUMBER = 24;
    public static final int COLOR_FIELD_NUMBER = 5;
    public static final int CONTENT_FIELD_NUMBER = 7;
    public static final int CTIME_FIELD_NUMBER = 8;
    private static final DanmakuElem DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 23;
    public static final int FONTSIZE_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ID_STR_FIELD_NUMBER = 12;
    public static final int MID_HASH_FIELD_NUMBER = 6;
    public static final int MODE_FIELD_NUMBER = 3;
    public static final int OID_FIELD_NUMBER = 26;
    private static volatile Parser<DanmakuElem> PARSER = null;
    public static final int POOL_FIELD_NUMBER = 11;
    public static final int PROGRESS_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 25;
    public static final int WEIGHT_FIELD_NUMBER = 9;
    private int attr_;
    private int color_;
    private int colorful_;
    private long ctime_;
    private int fontsize_;
    private long id_;
    private int mode_;
    private long oid_;
    private int pool_;
    private int progress_;
    private int type_;
    private int weight_;
    private String midHash_ = "";
    private String content_ = "";
    private String action_ = "";
    private String idStr_ = "";
    private String animation_ = "";
    private String extra_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmakuElem$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C13133a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21501xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21501xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21501xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21501xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21501xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21501xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21501xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21501xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmakuElem$b */
    /* loaded from: classes20.dex */
    public static final class C13134b extends GeneratedMessageLite.Builder<DanmakuElem, C13134b> implements InterfaceC13298e {
        /* synthetic */ C13134b(C13133a c13133a) {
            this();
        }

        public C13134b clearAction() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearAction();
            return this;
        }

        public C13134b clearAnimation() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearAnimation();
            return this;
        }

        public C13134b clearAttr() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearAttr();
            return this;
        }

        public C13134b clearColor() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearColor();
            return this;
        }

        public C13134b clearColorful() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearColorful();
            return this;
        }

        public C13134b clearContent() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearContent();
            return this;
        }

        public C13134b clearCtime() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearCtime();
            return this;
        }

        public C13134b clearExtra() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearExtra();
            return this;
        }

        public C13134b clearFontsize() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearFontsize();
            return this;
        }

        public C13134b clearId() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearId();
            return this;
        }

        public C13134b clearIdStr() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearIdStr();
            return this;
        }

        public C13134b clearMidHash() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearMidHash();
            return this;
        }

        public C13134b clearMode() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearMode();
            return this;
        }

        public C13134b clearOid() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearOid();
            return this;
        }

        public C13134b clearPool() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearPool();
            return this;
        }

        public C13134b clearProgress() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearProgress();
            return this;
        }

        public C13134b clearType() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearType();
            return this;
        }

        public C13134b clearWeight() {
            copyOnWrite();
            ((DanmakuElem) this.instance).clearWeight();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public String getAction() {
            return ((DanmakuElem) this.instance).getAction();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public ByteString getActionBytes() {
            return ((DanmakuElem) this.instance).getActionBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public String getAnimation() {
            return ((DanmakuElem) this.instance).getAnimation();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public ByteString getAnimationBytes() {
            return ((DanmakuElem) this.instance).getAnimationBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getAttr() {
            return ((DanmakuElem) this.instance).getAttr();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getColor() {
            return ((DanmakuElem) this.instance).getColor();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public DmColorfulType getColorful() {
            return ((DanmakuElem) this.instance).getColorful();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getColorfulValue() {
            return ((DanmakuElem) this.instance).getColorfulValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public String getContent() {
            return ((DanmakuElem) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public ByteString getContentBytes() {
            return ((DanmakuElem) this.instance).getContentBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public long getCtime() {
            return ((DanmakuElem) this.instance).getCtime();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public String getExtra() {
            return ((DanmakuElem) this.instance).getExtra();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public ByteString getExtraBytes() {
            return ((DanmakuElem) this.instance).getExtraBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getFontsize() {
            return ((DanmakuElem) this.instance).getFontsize();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public long getId() {
            return ((DanmakuElem) this.instance).getId();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public String getIdStr() {
            return ((DanmakuElem) this.instance).getIdStr();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public ByteString getIdStrBytes() {
            return ((DanmakuElem) this.instance).getIdStrBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public String getMidHash() {
            return ((DanmakuElem) this.instance).getMidHash();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public ByteString getMidHashBytes() {
            return ((DanmakuElem) this.instance).getMidHashBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getMode() {
            return ((DanmakuElem) this.instance).getMode();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public long getOid() {
            return ((DanmakuElem) this.instance).getOid();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getPool() {
            return ((DanmakuElem) this.instance).getPool();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getProgress() {
            return ((DanmakuElem) this.instance).getProgress();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getType() {
            return ((DanmakuElem) this.instance).getType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
        public int getWeight() {
            return ((DanmakuElem) this.instance).getWeight();
        }

        public C13134b setAction(String str) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setAction(str);
            return this;
        }

        public C13134b setActionBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setActionBytes(byteString);
            return this;
        }

        public C13134b setAnimation(String str) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setAnimation(str);
            return this;
        }

        public C13134b setAnimationBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setAnimationBytes(byteString);
            return this;
        }

        public C13134b setAttr(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setAttr(i);
            return this;
        }

        public C13134b setColor(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setColor(i);
            return this;
        }

        public C13134b setColorful(DmColorfulType dmColorfulType) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setColorful(dmColorfulType);
            return this;
        }

        public C13134b setColorfulValue(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setColorfulValue(i);
            return this;
        }

        public C13134b setContent(String str) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setContent(str);
            return this;
        }

        public C13134b setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setContentBytes(byteString);
            return this;
        }

        public C13134b setCtime(long j) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setCtime(j);
            return this;
        }

        public C13134b setExtra(String str) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setExtra(str);
            return this;
        }

        public C13134b setExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setExtraBytes(byteString);
            return this;
        }

        public C13134b setFontsize(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setFontsize(i);
            return this;
        }

        public C13134b setId(long j) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setId(j);
            return this;
        }

        public C13134b setIdStr(String str) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setIdStr(str);
            return this;
        }

        public C13134b setIdStrBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setIdStrBytes(byteString);
            return this;
        }

        public C13134b setMidHash(String str) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setMidHash(str);
            return this;
        }

        public C13134b setMidHashBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setMidHashBytes(byteString);
            return this;
        }

        public C13134b setMode(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setMode(i);
            return this;
        }

        public C13134b setOid(long j) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setOid(j);
            return this;
        }

        public C13134b setPool(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setPool(i);
            return this;
        }

        public C13134b setProgress(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setProgress(i);
            return this;
        }

        public C13134b setType(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setType(i);
            return this;
        }

        public C13134b setWeight(int i) {
            copyOnWrite();
            ((DanmakuElem) this.instance).setWeight(i);
            return this;
        }

        private C13134b() {
            super(DanmakuElem.DEFAULT_INSTANCE);
        }
    }

    static {
        DanmakuElem danmakuElem = new DanmakuElem();
        DEFAULT_INSTANCE = danmakuElem;
        GeneratedMessageLite.registerDefaultInstance(DanmakuElem.class, danmakuElem);
    }

    private DanmakuElem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = getDefaultInstance().getAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimation() {
        this.animation_ = getDefaultInstance().getAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttr() {
        this.attr_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorful() {
        this.colorful_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtime() {
        this.ctime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFontsize() {
        this.fontsize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdStr() {
        this.idStr_ = getDefaultInstance().getIdStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMidHash() {
        this.midHash_ = getDefaultInstance().getMidHash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPool() {
        this.pool_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProgress() {
        this.progress_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.weight_ = 0;
    }

    public static DanmakuElem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13134b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmakuElem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmakuElem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuElem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmakuElem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(String str) {
        str.getClass();
        this.action_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimation(String str) {
        str.getClass();
        this.animation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.animation_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttr(int i) {
        this.attr_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i) {
        this.color_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorful(DmColorfulType dmColorfulType) {
        this.colorful_ = dmColorfulType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorfulValue(int i) {
        this.colorful_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtime(long j) {
        this.ctime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(String str) {
        str.getClass();
        this.extra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontsize(int i) {
        this.fontsize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdStr(String str) {
        str.getClass();
        this.idStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdStrBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idStr_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMidHash(String str) {
        str.getClass();
        this.midHash_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMidHashBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.midHash_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(int i) {
        this.mode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPool(int i) {
        this.pool_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i) {
        this.progress_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13133a.f21501xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmakuElem();
            case 2:
                return new C13134b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u001a\u0012\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u000b\u0006\u0208\u0007\u0208\b\u0002\t\u0004\n\u0208\u000b\u0004\f\u0208\r\u0004\u0016\u0208\u0017\u0208\u0018\f\u0019\u0004\u001a\u0002", new Object[]{"id_", "progress_", "mode_", "fontsize_", "color_", "midHash_", "content_", "ctime_", "weight_", "action_", "pool_", "idStr_", "attr_", "animation_", "extra_", "colorful_", "type_", "oid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmakuElem> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmakuElem.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public String getAction() {
        return this.action_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public ByteString getActionBytes() {
        return ByteString.copyFromUtf8(this.action_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public String getAnimation() {
        return this.animation_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public ByteString getAnimationBytes() {
        return ByteString.copyFromUtf8(this.animation_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getAttr() {
        return this.attr_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getColor() {
        return this.color_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public DmColorfulType getColorful() {
        DmColorfulType forNumber = DmColorfulType.forNumber(this.colorful_);
        return forNumber == null ? DmColorfulType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getColorfulValue() {
        return this.colorful_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public String getContent() {
        return this.content_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public long getCtime() {
        return this.ctime_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public String getExtra() {
        return this.extra_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public ByteString getExtraBytes() {
        return ByteString.copyFromUtf8(this.extra_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getFontsize() {
        return this.fontsize_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public String getIdStr() {
        return this.idStr_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public ByteString getIdStrBytes() {
        return ByteString.copyFromUtf8(this.idStr_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public String getMidHash() {
        return this.midHash_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public ByteString getMidHashBytes() {
        return ByteString.copyFromUtf8(this.midHash_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getMode() {
        return this.mode_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public long getOid() {
        return this.oid_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getPool() {
        return this.pool_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getProgress() {
        return this.progress_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13298e
    public int getWeight() {
        return this.weight_;
    }

    public static C13134b newBuilder(DanmakuElem danmakuElem) {
        return DEFAULT_INSTANCE.createBuilder(danmakuElem);
    }

    public static DanmakuElem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuElem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuElem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmakuElem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DanmakuElem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmakuElem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmakuElem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmakuElem parseFrom(InputStream inputStream) throws IOException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuElem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuElem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmakuElem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuElem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
