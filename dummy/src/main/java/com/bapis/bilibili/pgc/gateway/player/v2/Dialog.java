package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class Dialog extends GeneratedMessageLite<Dialog, Dialog.Builder> implements MessageLiteOrBuilder {
    public static final int BOTTOM_DESC_FIELD_NUMBER = 10;
    public static final int BOTTOM_DISPLAY_FIELD_NUMBER = 14;
    public static final int BUTTON_FIELD_NUMBER = 9;
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int CONFIG_FIELD_NUMBER = 5;
    public static final int COUNT_DOWN_SEC_FIELD_NUMBER = 12;
    private static final Dialog DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 8;
    public static final int MSG_FIELD_NUMBER = 2;
    private static volatile Parser<Dialog> PARSER = null;
    public static final int PLAY_LIST_FIELD_NUMBER = 15;
    public static final int REPORT_FIELD_NUMBER = 11;
    public static final int RIGHT_BOTTOM_DESC_FIELD_NUMBER = 13;
    public static final int STYLE_TYPE_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 3;
    private ButtonInfo bottomDesc_;
    private long code_;
    private DialogConfig config_;
    private int countDownSec_;
    private ImageInfo image_;
    private Report report_;
    private TextInfo rightBottomDesc_;
    private TextInfo subtitle_;
    private TextInfo title_;
    private String msg_ = "";
    private String type_ = "";
    private String styleType_ = "";
    private Internal.ProtobufList<ButtonInfo> button_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<BottomDisplay> bottomDisplay_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Playlist> playList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.Dialog$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17559xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17559xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17559xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17559xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17559xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17559xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17559xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17559xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Dialog, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78341 c78341) {
            this();
        }

        public Builder addAllBottomDisplay(Iterable<? extends BottomDisplay> iterable) {
            copyOnWrite();
            ((Dialog) this.instance).addAllBottomDisplay(iterable);
            return this;
        }

        public Builder addAllButton(Iterable<? extends ButtonInfo> iterable) {
            copyOnWrite();
            ((Dialog) this.instance).addAllButton(iterable);
            return this;
        }

        public Builder addAllPlayList(Iterable<? extends Playlist> iterable) {
            copyOnWrite();
            ((Dialog) this.instance).addAllPlayList(iterable);
            return this;
        }

        public Builder addBottomDisplay(BottomDisplay bottomDisplay) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(bottomDisplay);
            return this;
        }

        public Builder addButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(buttonInfo);
            return this;
        }

        public Builder addPlayList(Playlist playlist) {
            copyOnWrite();
            ((Dialog) this.instance).addPlayList(playlist);
            return this;
        }

        public Builder clearBottomDesc() {
            copyOnWrite();
            ((Dialog) this.instance).clearBottomDesc();
            return this;
        }

        public Builder clearBottomDisplay() {
            copyOnWrite();
            ((Dialog) this.instance).clearBottomDisplay();
            return this;
        }

        public Builder clearButton() {
            copyOnWrite();
            ((Dialog) this.instance).clearButton();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((Dialog) this.instance).clearCode();
            return this;
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((Dialog) this.instance).clearConfig();
            return this;
        }

        public Builder clearCountDownSec() {
            copyOnWrite();
            ((Dialog) this.instance).clearCountDownSec();
            return this;
        }

        public Builder clearImage() {
            copyOnWrite();
            ((Dialog) this.instance).clearImage();
            return this;
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((Dialog) this.instance).clearMsg();
            return this;
        }

        public Builder clearPlayList() {
            copyOnWrite();
            ((Dialog) this.instance).clearPlayList();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((Dialog) this.instance).clearReport();
            return this;
        }

        public Builder clearRightBottomDesc() {
            copyOnWrite();
            ((Dialog) this.instance).clearRightBottomDesc();
            return this;
        }

        public Builder clearStyleType() {
            copyOnWrite();
            ((Dialog) this.instance).clearStyleType();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((Dialog) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Dialog) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Dialog) this.instance).clearType();
            return this;
        }

        public ButtonInfo getBottomDesc() {
            return ((Dialog) this.instance).getBottomDesc();
        }

        public BottomDisplay getBottomDisplay(int i) {
            return ((Dialog) this.instance).getBottomDisplay(i);
        }

        public int getBottomDisplayCount() {
            return ((Dialog) this.instance).getBottomDisplayCount();
        }

        public List<BottomDisplay> getBottomDisplayList() {
            return Collections.unmodifiableList(((Dialog) this.instance).getBottomDisplayList());
        }

        public ButtonInfo getButton(int i) {
            return ((Dialog) this.instance).getButton(i);
        }

        public int getButtonCount() {
            return ((Dialog) this.instance).getButtonCount();
        }

        public List<ButtonInfo> getButtonList() {
            return Collections.unmodifiableList(((Dialog) this.instance).getButtonList());
        }

        public long getCode() {
            return ((Dialog) this.instance).getCode();
        }

        public DialogConfig getConfig() {
            return ((Dialog) this.instance).getConfig();
        }

        public int getCountDownSec() {
            return ((Dialog) this.instance).getCountDownSec();
        }

        public ImageInfo getImage() {
            return ((Dialog) this.instance).getImage();
        }

        public String getMsg() {
            return ((Dialog) this.instance).getMsg();
        }

        public ByteString getMsgBytes() {
            return ((Dialog) this.instance).getMsgBytes();
        }

        public Playlist getPlayList(int i) {
            return ((Dialog) this.instance).getPlayList(i);
        }

        public int getPlayListCount() {
            return ((Dialog) this.instance).getPlayListCount();
        }

        public List<Playlist> getPlayListList() {
            return Collections.unmodifiableList(((Dialog) this.instance).getPlayListList());
        }

        public Report getReport() {
            return ((Dialog) this.instance).getReport();
        }

        public TextInfo getRightBottomDesc() {
            return ((Dialog) this.instance).getRightBottomDesc();
        }

        public String getStyleType() {
            return ((Dialog) this.instance).getStyleType();
        }

        public ByteString getStyleTypeBytes() {
            return ((Dialog) this.instance).getStyleTypeBytes();
        }

        public TextInfo getSubtitle() {
            return ((Dialog) this.instance).getSubtitle();
        }

        public TextInfo getTitle() {
            return ((Dialog) this.instance).getTitle();
        }

        public String getType() {
            return ((Dialog) this.instance).getType();
        }

        public ByteString getTypeBytes() {
            return ((Dialog) this.instance).getTypeBytes();
        }

        public boolean hasBottomDesc() {
            return ((Dialog) this.instance).hasBottomDesc();
        }

        public boolean hasConfig() {
            return ((Dialog) this.instance).hasConfig();
        }

        public boolean hasImage() {
            return ((Dialog) this.instance).hasImage();
        }

        public boolean hasReport() {
            return ((Dialog) this.instance).hasReport();
        }

        public boolean hasRightBottomDesc() {
            return ((Dialog) this.instance).hasRightBottomDesc();
        }

        public boolean hasSubtitle() {
            return ((Dialog) this.instance).hasSubtitle();
        }

        public boolean hasTitle() {
            return ((Dialog) this.instance).hasTitle();
        }

        public Builder mergeBottomDesc(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeBottomDesc(buttonInfo);
            return this;
        }

        public Builder mergeConfig(DialogConfig dialogConfig) {
            copyOnWrite();
            ((Dialog) this.instance).mergeConfig(dialogConfig);
            return this;
        }

        public Builder mergeImage(ImageInfo imageInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeImage(imageInfo);
            return this;
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((Dialog) this.instance).mergeReport(report);
            return this;
        }

        public Builder mergeRightBottomDesc(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeRightBottomDesc(textInfo);
            return this;
        }

        public Builder mergeSubtitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeSubtitle(textInfo);
            return this;
        }

        public Builder mergeTitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeTitle(textInfo);
            return this;
        }

        public Builder removeBottomDisplay(int i) {
            copyOnWrite();
            ((Dialog) this.instance).removeBottomDisplay(i);
            return this;
        }

        public Builder removeButton(int i) {
            copyOnWrite();
            ((Dialog) this.instance).removeButton(i);
            return this;
        }

        public Builder removePlayList(int i) {
            copyOnWrite();
            ((Dialog) this.instance).removePlayList(i);
            return this;
        }

        public Builder setBottomDesc(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDesc(buttonInfo);
            return this;
        }

        public Builder setBottomDisplay(int i, BottomDisplay bottomDisplay) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDisplay(i, bottomDisplay);
            return this;
        }

        public Builder setButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setButton(i, buttonInfo);
            return this;
        }

        public Builder setCode(long j) {
            copyOnWrite();
            ((Dialog) this.instance).setCode(j);
            return this;
        }

        public Builder setConfig(DialogConfig dialogConfig) {
            copyOnWrite();
            ((Dialog) this.instance).setConfig(dialogConfig);
            return this;
        }

        public Builder setCountDownSec(int i) {
            copyOnWrite();
            ((Dialog) this.instance).setCountDownSec(i);
            return this;
        }

        public Builder setImage(ImageInfo imageInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setImage(imageInfo);
            return this;
        }

        public Builder setMsg(String str) {
            copyOnWrite();
            ((Dialog) this.instance).setMsg(str);
            return this;
        }

        public Builder setMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((Dialog) this.instance).setMsgBytes(byteString);
            return this;
        }

        public Builder setPlayList(int i, Playlist playlist) {
            copyOnWrite();
            ((Dialog) this.instance).setPlayList(i, playlist);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((Dialog) this.instance).setReport(report);
            return this;
        }

        public Builder setRightBottomDesc(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setRightBottomDesc(textInfo);
            return this;
        }

        public Builder setStyleType(String str) {
            copyOnWrite();
            ((Dialog) this.instance).setStyleType(str);
            return this;
        }

        public Builder setStyleTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Dialog) this.instance).setStyleTypeBytes(byteString);
            return this;
        }

        public Builder setSubtitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setSubtitle(textInfo);
            return this;
        }

        public Builder setTitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setTitle(textInfo);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((Dialog) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Dialog) this.instance).setTypeBytes(byteString);
            return this;
        }

        private Builder() {
            super(Dialog.DEFAULT_INSTANCE);
        }

        public Builder addBottomDisplay(int i, BottomDisplay bottomDisplay) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(i, bottomDisplay);
            return this;
        }

        public Builder addButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(i, buttonInfo);
            return this;
        }

        public Builder addPlayList(int i, Playlist playlist) {
            copyOnWrite();
            ((Dialog) this.instance).addPlayList(i, playlist);
            return this;
        }

        public Builder setBottomDesc(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDesc(builder.build());
            return this;
        }

        public Builder setBottomDisplay(int i, BottomDisplay.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDisplay(i, builder.build());
            return this;
        }

        public Builder setButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setButton(i, builder.build());
            return this;
        }

        public Builder setConfig(DialogConfig.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setConfig(builder.build());
            return this;
        }

        public Builder setImage(ImageInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setImage(builder.build());
            return this;
        }

        public Builder setPlayList(int i, Playlist.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setPlayList(i, builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setReport(builder.build());
            return this;
        }

        public Builder setRightBottomDesc(TextInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setRightBottomDesc(builder.build());
            return this;
        }

        public Builder setSubtitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setSubtitle(builder.build());
            return this;
        }

        public Builder setTitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setTitle(builder.build());
            return this;
        }

        public Builder addBottomDisplay(BottomDisplay.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(builder.build());
            return this;
        }

        public Builder addButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(builder.build());
            return this;
        }

        public Builder addPlayList(Playlist.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addPlayList(builder.build());
            return this;
        }

        public Builder addBottomDisplay(int i, BottomDisplay.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(i, builder.build());
            return this;
        }

        public Builder addButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(i, builder.build());
            return this;
        }

        public Builder addPlayList(int i, Playlist.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addPlayList(i, builder.build());
            return this;
        }
    }

    static {
        Dialog dialog = new Dialog();
        DEFAULT_INSTANCE = dialog;
        GeneratedMessageLite.registerDefaultInstance(Dialog.class, dialog);
    }

    private Dialog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBottomDisplay(Iterable<? extends BottomDisplay> iterable) {
        ensureBottomDisplayIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bottomDisplay_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllButton(Iterable<? extends ButtonInfo> iterable) {
        ensureButtonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.button_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPlayList(Iterable<? extends Playlist> iterable) {
        ensurePlayListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.playList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBottomDisplay(BottomDisplay bottomDisplay) {
        bottomDisplay.getClass();
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.add(bottomDisplay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayList(Playlist playlist) {
        playlist.getClass();
        ensurePlayListIsMutable();
        this.playList_.add(playlist);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomDesc() {
        this.bottomDesc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomDisplay() {
        this.bottomDisplay_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountDownSec() {
        this.countDownSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayList() {
        this.playList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightBottomDesc() {
        this.rightBottomDesc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleType() {
        this.styleType_ = getDefaultInstance().getStyleType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureBottomDisplayIsMutable() {
        Internal.ProtobufList<BottomDisplay> protobufList = this.bottomDisplay_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bottomDisplay_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureButtonIsMutable() {
        Internal.ProtobufList<ButtonInfo> protobufList = this.button_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.button_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePlayListIsMutable() {
        Internal.ProtobufList<Playlist> protobufList = this.playList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.playList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Dialog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBottomDesc(ButtonInfo buttonInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfig(DialogConfig dialogConfig) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImage(ImageInfo imageInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(Report report) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRightBottomDesc(TextInfo textInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitle(TextInfo textInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitle(TextInfo textInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Dialog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dialog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Dialog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBottomDisplay(int i) {
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeButton(int i) {
        ensureButtonIsMutable();
        this.button_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePlayList(int i) {
        ensurePlayListIsMutable();
        this.playList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomDesc(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        this.bottomDesc_ = buttonInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomDisplay(int i, BottomDisplay bottomDisplay) {
        bottomDisplay.getClass();
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.set(i, bottomDisplay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.set(i, buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(long j) {
        this.code_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(DialogConfig dialogConfig) {
        dialogConfig.getClass();
        this.config_ = dialogConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownSec(int i) {
        this.countDownSec_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(ImageInfo imageInfo) {
        imageInfo.getClass();
        this.image_ = imageInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayList(int i, Playlist playlist) {
        playlist.getClass();
        ensurePlayListIsMutable();
        this.playList_.set(i, playlist);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(Report report) {
        report.getClass();
        this.report_ = report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBottomDesc(TextInfo textInfo) {
        textInfo.getClass();
        this.rightBottomDesc_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleType(String str) {
        str.getClass();
        this.styleType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.styleType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(TextInfo textInfo) {
        textInfo.getClass();
        this.subtitle_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(TextInfo textInfo) {
        textInfo.getClass();
        this.title_ = textInfo;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78341.f17559xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Dialog();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0003\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t\u0006\t\u0007\t\b\t\t\u001b\n\t\u000b\t\f\u0004\r\t\u000e\u001b\u000f\u001b", new Object[]{"code_", "msg_", "type_", "styleType_", "config_", "title_", "subtitle_", "image_", "button_", ButtonInfo.class, "bottomDesc_", "report_", "countDownSec_", "rightBottomDesc_", "bottomDisplay_", BottomDisplay.class, "playList_", Playlist.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Dialog> parser = PARSER;
                if (parser == null) {
                    synchronized (Dialog.class) {
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

    public ButtonInfo getBottomDesc() {
        ButtonInfo buttonInfo = this.bottomDesc_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    public BottomDisplay getBottomDisplay(int i) {
        return this.bottomDisplay_.get(i);
    }

    public int getBottomDisplayCount() {
        return this.bottomDisplay_.size();
    }

    public List<BottomDisplay> getBottomDisplayList() {
        return this.bottomDisplay_;
    }

    public BottomDisplayOrBuilder getBottomDisplayOrBuilder(int i) {
        return this.bottomDisplay_.get(i);
    }

    public List<? extends BottomDisplayOrBuilder> getBottomDisplayOrBuilderList() {
        return this.bottomDisplay_;
    }

    public ButtonInfo getButton(int i) {
        return this.button_.get(i);
    }

    public int getButtonCount() {
        return this.button_.size();
    }

    public List<ButtonInfo> getButtonList() {
        return this.button_;
    }

    public ButtonInfoOrBuilder getButtonOrBuilder(int i) {
        return this.button_.get(i);
    }

    public List<? extends ButtonInfoOrBuilder> getButtonOrBuilderList() {
        return this.button_;
    }

    public long getCode() {
        return this.code_;
    }

    public DialogConfig getConfig() {
        DialogConfig dialogConfig = this.config_;
        return dialogConfig == null ? DialogConfig.getDefaultInstance() : dialogConfig;
    }

    public int getCountDownSec() {
        return this.countDownSec_;
    }

    public ImageInfo getImage() {
        ImageInfo imageInfo = this.image_;
        return imageInfo == null ? ImageInfo.getDefaultInstance() : imageInfo;
    }

    public String getMsg() {
        return this.msg_;
    }

    public ByteString getMsgBytes() {
        return ByteString.copyFromUtf8(this.msg_);
    }

    public Playlist getPlayList(int i) {
        return this.playList_.get(i);
    }

    public int getPlayListCount() {
        return this.playList_.size();
    }

    public List<Playlist> getPlayListList() {
        return this.playList_;
    }

    public PlaylistOrBuilder getPlayListOrBuilder(int i) {
        return this.playList_.get(i);
    }

    public List<? extends PlaylistOrBuilder> getPlayListOrBuilderList() {
        return this.playList_;
    }

    public Report getReport() {
        Report report = this.report_;
        return report == null ? Report.getDefaultInstance() : report;
    }

    public TextInfo getRightBottomDesc() {
        TextInfo textInfo = this.rightBottomDesc_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public String getStyleType() {
        return this.styleType_;
    }

    public ByteString getStyleTypeBytes() {
        return ByteString.copyFromUtf8(this.styleType_);
    }

    public TextInfo getSubtitle() {
        TextInfo textInfo = this.subtitle_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public TextInfo getTitle() {
        TextInfo textInfo = this.title_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public boolean hasBottomDesc() {
        return this.bottomDesc_ != null;
    }

    public boolean hasConfig() {
        return this.config_ != null;
    }

    public boolean hasImage() {
        return this.image_ != null;
    }

    public boolean hasReport() {
        return this.report_ != null;
    }

    public boolean hasRightBottomDesc() {
        return this.rightBottomDesc_ != null;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static Builder newBuilder(Dialog dialog) {
        return DEFAULT_INSTANCE.createBuilder(dialog);
    }

    public static Dialog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dialog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Dialog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBottomDisplay(int i, BottomDisplay bottomDisplay) {
        bottomDisplay.getClass();
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.add(i, bottomDisplay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(i, buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayList(int i, Playlist playlist) {
        playlist.getClass();
        ensurePlayListIsMutable();
        this.playList_.add(i, playlist);
    }

    public static Dialog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Dialog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Dialog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Dialog parseFrom(InputStream inputStream) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dialog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dialog parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Dialog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
