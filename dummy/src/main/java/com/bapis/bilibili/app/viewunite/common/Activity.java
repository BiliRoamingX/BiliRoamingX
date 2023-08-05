package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class Activity extends GeneratedMessageLite<Activity, Activity.Builder> implements MessageLiteOrBuilder {
    public static final int AB_FIELD_NUMBER = 6;
    public static final int COVER_FIELD_NUMBER = 4;
    private static final Activity DEFAULT_INSTANCE;
    public static final int H5_LINK_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 12;
    public static final int JUMP_MODE_FIELD_NUMBER = 11;
    public static final int LINK_FIELD_NUMBER = 3;
    private static volatile Parser<Activity> PARSER = null;
    public static final int PICURL_FIELD_NUMBER = 8;
    public static final int PICURL_SELECTED_FIELD_NUMBER = 9;
    public static final int SHOW_NAME_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 5;
    private int id_;
    private int type_;
    private String title_ = "";
    private String link_ = "";
    private String cover_ = "";
    private String ab_ = "";
    private String showName_ = "";
    private String picurl_ = "";
    private String picurlSelected_ = "";
    private String h5Link_ = "";
    private String jumpMode_ = "";
    private Internal.ProtobufList<Item> items_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Activity$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16954xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16954xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16954xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16954xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16954xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16954xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16954xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16954xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Activity, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69661 c69661) {
            this();
        }

        public Builder addAllItems(Iterable<? extends Item> iterable) {
            copyOnWrite();
            ((Activity) this.instance).addAllItems(iterable);
            return this;
        }

        public Builder addItems(Item item) {
            copyOnWrite();
            ((Activity) this.instance).addItems(item);
            return this;
        }

        public Builder clearAb() {
            copyOnWrite();
            ((Activity) this.instance).clearAb();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Activity) this.instance).clearCover();
            return this;
        }

        public Builder clearH5Link() {
            copyOnWrite();
            ((Activity) this.instance).clearH5Link();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Activity) this.instance).clearId();
            return this;
        }

        public Builder clearItems() {
            copyOnWrite();
            ((Activity) this.instance).clearItems();
            return this;
        }

        public Builder clearJumpMode() {
            copyOnWrite();
            ((Activity) this.instance).clearJumpMode();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((Activity) this.instance).clearLink();
            return this;
        }

        public Builder clearPicurl() {
            copyOnWrite();
            ((Activity) this.instance).clearPicurl();
            return this;
        }

        public Builder clearPicurlSelected() {
            copyOnWrite();
            ((Activity) this.instance).clearPicurlSelected();
            return this;
        }

        public Builder clearShowName() {
            copyOnWrite();
            ((Activity) this.instance).clearShowName();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Activity) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Activity) this.instance).clearType();
            return this;
        }

        public String getAb() {
            return ((Activity) this.instance).getAb();
        }

        public ByteString getAbBytes() {
            return ((Activity) this.instance).getAbBytes();
        }

        public String getCover() {
            return ((Activity) this.instance).getCover();
        }

        public ByteString getCoverBytes() {
            return ((Activity) this.instance).getCoverBytes();
        }

        public String getH5Link() {
            return ((Activity) this.instance).getH5Link();
        }

        public ByteString getH5LinkBytes() {
            return ((Activity) this.instance).getH5LinkBytes();
        }

        public int getId() {
            return ((Activity) this.instance).getId();
        }

        public Item getItems(int i) {
            return ((Activity) this.instance).getItems(i);
        }

        public int getItemsCount() {
            return ((Activity) this.instance).getItemsCount();
        }

        public List<Item> getItemsList() {
            return Collections.unmodifiableList(((Activity) this.instance).getItemsList());
        }

        public String getJumpMode() {
            return ((Activity) this.instance).getJumpMode();
        }

        public ByteString getJumpModeBytes() {
            return ((Activity) this.instance).getJumpModeBytes();
        }

        public String getLink() {
            return ((Activity) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((Activity) this.instance).getLinkBytes();
        }

        public String getPicurl() {
            return ((Activity) this.instance).getPicurl();
        }

        public ByteString getPicurlBytes() {
            return ((Activity) this.instance).getPicurlBytes();
        }

        public String getPicurlSelected() {
            return ((Activity) this.instance).getPicurlSelected();
        }

        public ByteString getPicurlSelectedBytes() {
            return ((Activity) this.instance).getPicurlSelectedBytes();
        }

        public String getShowName() {
            return ((Activity) this.instance).getShowName();
        }

        public ByteString getShowNameBytes() {
            return ((Activity) this.instance).getShowNameBytes();
        }

        public String getTitle() {
            return ((Activity) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Activity) this.instance).getTitleBytes();
        }

        public int getType() {
            return ((Activity) this.instance).getType();
        }

        public Builder removeItems(int i) {
            copyOnWrite();
            ((Activity) this.instance).removeItems(i);
            return this;
        }

        public Builder setAb(String str) {
            copyOnWrite();
            ((Activity) this.instance).setAb(str);
            return this;
        }

        public Builder setAbBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setAbBytes(byteString);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Activity) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setH5Link(String str) {
            copyOnWrite();
            ((Activity) this.instance).setH5Link(str);
            return this;
        }

        public Builder setH5LinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setH5LinkBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((Activity) this.instance).setId(i);
            return this;
        }

        public Builder setItems(int i, Item item) {
            copyOnWrite();
            ((Activity) this.instance).setItems(i, item);
            return this;
        }

        public Builder setJumpMode(String str) {
            copyOnWrite();
            ((Activity) this.instance).setJumpMode(str);
            return this;
        }

        public Builder setJumpModeBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setJumpModeBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((Activity) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setPicurl(String str) {
            copyOnWrite();
            ((Activity) this.instance).setPicurl(str);
            return this;
        }

        public Builder setPicurlBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setPicurlBytes(byteString);
            return this;
        }

        public Builder setPicurlSelected(String str) {
            copyOnWrite();
            ((Activity) this.instance).setPicurlSelected(str);
            return this;
        }

        public Builder setPicurlSelectedBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setPicurlSelectedBytes(byteString);
            return this;
        }

        public Builder setShowName(String str) {
            copyOnWrite();
            ((Activity) this.instance).setShowName(str);
            return this;
        }

        public Builder setShowNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setShowNameBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Activity) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Activity) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((Activity) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(Activity.DEFAULT_INSTANCE);
        }

        public Builder addItems(int i, Item item) {
            copyOnWrite();
            ((Activity) this.instance).addItems(i, item);
            return this;
        }

        public Builder setItems(int i, Item.Builder builder) {
            copyOnWrite();
            ((Activity) this.instance).setItems(i, builder.build());
            return this;
        }

        public Builder addItems(Item.Builder builder) {
            copyOnWrite();
            ((Activity) this.instance).addItems(builder.build());
            return this;
        }

        public Builder addItems(int i, Item.Builder builder) {
            copyOnWrite();
            ((Activity) this.instance).addItems(i, builder.build());
            return this;
        }
    }

    static {
        Activity activity = new Activity();
        DEFAULT_INSTANCE = activity;
        GeneratedMessageLite.registerDefaultInstance(Activity.class, activity);
    }

    private Activity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends Item> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.add(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAb() {
        this.ab_ = getDefaultInstance().getAb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearH5Link() {
        this.h5Link_ = getDefaultInstance().getH5Link();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpMode() {
        this.jumpMode_ = getDefaultInstance().getJumpMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicurl() {
        this.picurl_ = getDefaultInstance().getPicurl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicurlSelected() {
        this.picurlSelected_ = getDefaultInstance().getPicurlSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowName() {
        this.showName_ = getDefaultInstance().getShowName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Item> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Activity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Activity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Activity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Activity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Activity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAb(String str) {
        str.getClass();
        this.ab_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ab_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setH5Link(String str) {
        str.getClass();
        this.h5Link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setH5LinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.h5Link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i, Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpMode(String str) {
        str.getClass();
        this.jumpMode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpModeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpMode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurl(String str) {
        str.getClass();
        this.picurl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picurl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurlSelected(String str) {
        str.getClass();
        this.picurlSelected_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicurlSelectedBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picurlSelected_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowName(String str) {
        str.getClass();
        this.showName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.showName_ = byteString.toStringUtf8();
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
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69661.f16954xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Activity();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0004\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u001b", new Object[]{"id_", "title_", "link_", "cover_", "type_", "ab_", "showName_", "picurl_", "picurlSelected_", "h5Link_", "jumpMode_", "items_", Item.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Activity> parser = PARSER;
                if (parser == null) {
                    synchronized (Activity.class) {
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

    public String getAb() {
        return this.ab_;
    }

    public ByteString getAbBytes() {
        return ByteString.copyFromUtf8(this.ab_);
    }

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getH5Link() {
        return this.h5Link_;
    }

    public ByteString getH5LinkBytes() {
        return ByteString.copyFromUtf8(this.h5Link_);
    }

    public int getId() {
        return this.id_;
    }

    public Item getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<Item> getItemsList() {
        return this.items_;
    }

    public ItemOrBuilder getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends ItemOrBuilder> getItemsOrBuilderList() {
        return this.items_;
    }

    public String getJumpMode() {
        return this.jumpMode_;
    }

    public ByteString getJumpModeBytes() {
        return ByteString.copyFromUtf8(this.jumpMode_);
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getPicurl() {
        return this.picurl_;
    }

    public ByteString getPicurlBytes() {
        return ByteString.copyFromUtf8(this.picurl_);
    }

    public String getPicurlSelected() {
        return this.picurlSelected_;
    }

    public ByteString getPicurlSelectedBytes() {
        return ByteString.copyFromUtf8(this.picurlSelected_);
    }

    public String getShowName() {
        return this.showName_;
    }

    public ByteString getShowNameBytes() {
        return ByteString.copyFromUtf8(this.showName_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(Activity activity) {
        return DEFAULT_INSTANCE.createBuilder(activity);
    }

    public static Activity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Activity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Activity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Activity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i, Item item) {
        item.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, item);
    }

    public static Activity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Activity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Activity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Activity parseFrom(InputStream inputStream) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Activity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Activity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Activity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Activity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
