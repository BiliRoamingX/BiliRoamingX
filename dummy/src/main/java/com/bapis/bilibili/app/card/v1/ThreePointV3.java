package com.bapis.bilibili.app.card.v1;

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
/* loaded from: classes13.dex */
public final class ThreePointV3 extends GeneratedMessageLite<ThreePointV3, ThreePointV3.C5898b> implements InterfaceC5944x {
    public static final int DEFAULT_ID_FIELD_NUMBER = 11;
    private static final ThreePointV3 DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 6;
    private static volatile Parser<ThreePointV3> PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 4;
    public static final int SELECTED_FIELD_NUMBER = 7;
    public static final int SELECTED_ICON_FIELD_NUMBER = 9;
    public static final int SELECTED_TITLE_FIELD_NUMBER = 2;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 10;
    private int defaultId_;
    private long id_;
    private int selected_;
    private String title_ = "";
    private String selectedTitle_ = "";
    private String subtitle_ = "";
    private Internal.ProtobufList<DislikeReason> reasons_ = GeneratedMessageLite.emptyProtobufList();
    private String type_ = "";
    private String icon_ = "";
    private String selectedIcon_ = "";
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePointV3$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5897a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15997xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15997xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15997xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15997xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15997xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15997xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15997xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15997xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePointV3$b */
    /* loaded from: classes13.dex */
    public static final class C5898b extends GeneratedMessageLite.Builder<ThreePointV3, C5898b> implements InterfaceC5944x {
        /* synthetic */ C5898b(C5897a c5897a) {
            this();
        }

        public C5898b addAllReasons(Iterable<? extends DislikeReason> iterable) {
            copyOnWrite();
            ((ThreePointV3) this.instance).addAllReasons(iterable);
            return this;
        }

        public C5898b addReasons(DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePointV3) this.instance).addReasons(dislikeReason);
            return this;
        }

        public C5898b clearDefaultId() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearDefaultId();
            return this;
        }

        public C5898b clearIcon() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearIcon();
            return this;
        }

        public C5898b clearId() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearId();
            return this;
        }

        public C5898b clearReasons() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearReasons();
            return this;
        }

        public C5898b clearSelected() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearSelected();
            return this;
        }

        public C5898b clearSelectedIcon() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearSelectedIcon();
            return this;
        }

        public C5898b clearSelectedTitle() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearSelectedTitle();
            return this;
        }

        public C5898b clearSubtitle() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearSubtitle();
            return this;
        }

        public C5898b clearTitle() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearTitle();
            return this;
        }

        public C5898b clearType() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearType();
            return this;
        }

        public C5898b clearUrl() {
            copyOnWrite();
            ((ThreePointV3) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public int getDefaultId() {
            return ((ThreePointV3) this.instance).getDefaultId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public String getIcon() {
            return ((ThreePointV3) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public ByteString getIconBytes() {
            return ((ThreePointV3) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public long getId() {
            return ((ThreePointV3) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public DislikeReason getReasons(int i) {
            return ((ThreePointV3) this.instance).getReasons(i);
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public int getReasonsCount() {
            return ((ThreePointV3) this.instance).getReasonsCount();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public List<DislikeReason> getReasonsList() {
            return Collections.unmodifiableList(((ThreePointV3) this.instance).getReasonsList());
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public int getSelected() {
            return ((ThreePointV3) this.instance).getSelected();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public String getSelectedIcon() {
            return ((ThreePointV3) this.instance).getSelectedIcon();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public ByteString getSelectedIconBytes() {
            return ((ThreePointV3) this.instance).getSelectedIconBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public String getSelectedTitle() {
            return ((ThreePointV3) this.instance).getSelectedTitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public ByteString getSelectedTitleBytes() {
            return ((ThreePointV3) this.instance).getSelectedTitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public String getSubtitle() {
            return ((ThreePointV3) this.instance).getSubtitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public ByteString getSubtitleBytes() {
            return ((ThreePointV3) this.instance).getSubtitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public String getTitle() {
            return ((ThreePointV3) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public ByteString getTitleBytes() {
            return ((ThreePointV3) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public String getType() {
            return ((ThreePointV3) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public ByteString getTypeBytes() {
            return ((ThreePointV3) this.instance).getTypeBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public String getUrl() {
            return ((ThreePointV3) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
        public ByteString getUrlBytes() {
            return ((ThreePointV3) this.instance).getUrlBytes();
        }

        public C5898b removeReasons(int i) {
            copyOnWrite();
            ((ThreePointV3) this.instance).removeReasons(i);
            return this;
        }

        public C5898b setDefaultId(int i) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setDefaultId(i);
            return this;
        }

        public C5898b setIcon(String str) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setIcon(str);
            return this;
        }

        public C5898b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setIconBytes(byteString);
            return this;
        }

        public C5898b setId(long j) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setId(j);
            return this;
        }

        public C5898b setReasons(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setReasons(i, dislikeReason);
            return this;
        }

        public C5898b setSelected(int i) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setSelected(i);
            return this;
        }

        public C5898b setSelectedIcon(String str) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setSelectedIcon(str);
            return this;
        }

        public C5898b setSelectedIconBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setSelectedIconBytes(byteString);
            return this;
        }

        public C5898b setSelectedTitle(String str) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setSelectedTitle(str);
            return this;
        }

        public C5898b setSelectedTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setSelectedTitleBytes(byteString);
            return this;
        }

        public C5898b setSubtitle(String str) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setSubtitle(str);
            return this;
        }

        public C5898b setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public C5898b setTitle(String str) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setTitle(str);
            return this;
        }

        public C5898b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5898b setType(String str) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setType(str);
            return this;
        }

        public C5898b setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setTypeBytes(byteString);
            return this;
        }

        public C5898b setUrl(String str) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setUrl(str);
            return this;
        }

        public C5898b setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setUrlBytes(byteString);
            return this;
        }

        private C5898b() {
            super(ThreePointV3.DEFAULT_INSTANCE);
        }

        public C5898b addReasons(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePointV3) this.instance).addReasons(i, dislikeReason);
            return this;
        }

        public C5898b setReasons(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePointV3) this.instance).setReasons(i, c5803b.build());
            return this;
        }

        public C5898b addReasons(DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePointV3) this.instance).addReasons(c5803b.build());
            return this;
        }

        public C5898b addReasons(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePointV3) this.instance).addReasons(i, c5803b.build());
            return this;
        }
    }

    static {
        ThreePointV3 threePointV3 = new ThreePointV3();
        DEFAULT_INSTANCE = threePointV3;
        GeneratedMessageLite.registerDefaultInstance(ThreePointV3.class, threePointV3);
    }

    private ThreePointV3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReasons(Iterable<? extends DislikeReason> iterable) {
        ensureReasonsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.reasons_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasons(DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultId() {
        this.defaultId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReasons() {
        this.reasons_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelected() {
        this.selected_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedIcon() {
        this.selectedIcon_ = getDefaultInstance().getSelectedIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedTitle() {
        this.selectedTitle_ = getDefaultInstance().getSelectedTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensureReasonsIsMutable() {
        Internal.ProtobufList<DislikeReason> protobufList = this.reasons_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.reasons_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ThreePointV3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5898b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ThreePointV3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ThreePointV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePointV3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ThreePointV3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReasons(int i) {
        ensureReasonsIsMutable();
        this.reasons_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultId(int i) {
        this.defaultId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasons(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.set(i, dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelected(int i) {
        this.selected_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedIcon(String str) {
        str.getClass();
        this.selectedIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectedIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedTitle(String str) {
        str.getClass();
        this.selectedTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectedTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5897a.f15997xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ThreePointV3();
            case 2:
                return new C5898b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u001b\u0005\u0208\u0006\u0002\u0007\u0004\b\u0208\t\u0208\n\u0208\u000b\u0004", new Object[]{"title_", "selectedTitle_", "subtitle_", "reasons_", DislikeReason.class, "type_", "id_", "selected_", "icon_", "selectedIcon_", "url_", "defaultId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ThreePointV3> parser = PARSER;
                if (parser == null) {
                    synchronized (ThreePointV3.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public int getDefaultId() {
        return this.defaultId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public DislikeReason getReasons(int i) {
        return this.reasons_.get(i);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public int getReasonsCount() {
        return this.reasons_.size();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public List<DislikeReason> getReasonsList() {
        return this.reasons_;
    }

    public InterfaceC5926f getReasonsOrBuilder(int i) {
        return this.reasons_.get(i);
    }

    public List<? extends InterfaceC5926f> getReasonsOrBuilderList() {
        return this.reasons_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public int getSelected() {
        return this.selected_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public String getSelectedIcon() {
        return this.selectedIcon_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public ByteString getSelectedIconBytes() {
        return ByteString.copyFromUtf8(this.selectedIcon_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public String getSelectedTitle() {
        return this.selectedTitle_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public ByteString getSelectedTitleBytes() {
        return ByteString.copyFromUtf8(this.selectedTitle_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public String getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5944x
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static C5898b newBuilder(ThreePointV3 threePointV3) {
        return DEFAULT_INSTANCE.createBuilder(threePointV3);
    }

    public static ThreePointV3 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePointV3 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ThreePointV3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasons(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(i, dislikeReason);
    }

    public static ThreePointV3 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ThreePointV3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ThreePointV3 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ThreePointV3 parseFrom(InputStream inputStream) throws IOException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePointV3 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePointV3 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ThreePointV3 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
