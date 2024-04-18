package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Page;
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
/* loaded from: classes13.dex */
public final class ViewPage extends GeneratedMessageLite<ViewPage, ViewPage.Builder> implements ViewPageOrBuilder {
    public static final int AUDIO_FIELD_NUMBER = 2;
    private static final ViewPage DEFAULT_INSTANCE;
    public static final int DM_FIELD_NUMBER = 3;
    public static final int DOWNLOAD_SUBTITLE_FIELD_NUMBER = 5;
    public static final int DOWNLOAD_TITLE_FIELD_NUMBER = 4;
    public static final int PAGE_FIELD_NUMBER = 1;
    private static volatile Parser<ViewPage> PARSER;
    private Audio audio_;
    private DM dm_;
    private Page page_;
    private String downloadTitle_ = "";
    private String downloadSubtitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewPage$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69011 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16854xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16854xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16854xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16854xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16854xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16854xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16854xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16854xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewPage, Builder> implements ViewPageOrBuilder {
        /* synthetic */ Builder(C69011 c69011) {
            this();
        }

        public Builder clearAudio() {
            copyOnWrite();
            ((ViewPage) this.instance).clearAudio();
            return this;
        }

        public Builder clearDm() {
            copyOnWrite();
            ((ViewPage) this.instance).clearDm();
            return this;
        }

        public Builder clearDownloadSubtitle() {
            copyOnWrite();
            ((ViewPage) this.instance).clearDownloadSubtitle();
            return this;
        }

        public Builder clearDownloadTitle() {
            copyOnWrite();
            ((ViewPage) this.instance).clearDownloadTitle();
            return this;
        }

        public Builder clearPage() {
            copyOnWrite();
            ((ViewPage) this.instance).clearPage();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public Audio getAudio() {
            return ((ViewPage) this.instance).getAudio();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public DM getDm() {
            return ((ViewPage) this.instance).getDm();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public String getDownloadSubtitle() {
            return ((ViewPage) this.instance).getDownloadSubtitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public ByteString getDownloadSubtitleBytes() {
            return ((ViewPage) this.instance).getDownloadSubtitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public String getDownloadTitle() {
            return ((ViewPage) this.instance).getDownloadTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public ByteString getDownloadTitleBytes() {
            return ((ViewPage) this.instance).getDownloadTitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public Page getPage() {
            return ((ViewPage) this.instance).getPage();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public boolean hasAudio() {
            return ((ViewPage) this.instance).hasAudio();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public boolean hasDm() {
            return ((ViewPage) this.instance).hasDm();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
        public boolean hasPage() {
            return ((ViewPage) this.instance).hasPage();
        }

        public Builder mergeAudio(Audio audio) {
            copyOnWrite();
            ((ViewPage) this.instance).mergeAudio(audio);
            return this;
        }

        public Builder mergeDm(DM dm) {
            copyOnWrite();
            ((ViewPage) this.instance).mergeDm(dm);
            return this;
        }

        public Builder mergePage(Page page) {
            copyOnWrite();
            ((ViewPage) this.instance).mergePage(page);
            return this;
        }

        public Builder setAudio(Audio audio) {
            copyOnWrite();
            ((ViewPage) this.instance).setAudio(audio);
            return this;
        }

        public Builder setDm(DM dm) {
            copyOnWrite();
            ((ViewPage) this.instance).setDm(dm);
            return this;
        }

        public Builder setDownloadSubtitle(String str) {
            copyOnWrite();
            ((ViewPage) this.instance).setDownloadSubtitle(str);
            return this;
        }

        public Builder setDownloadSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewPage) this.instance).setDownloadSubtitleBytes(byteString);
            return this;
        }

        public Builder setDownloadTitle(String str) {
            copyOnWrite();
            ((ViewPage) this.instance).setDownloadTitle(str);
            return this;
        }

        public Builder setDownloadTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewPage) this.instance).setDownloadTitleBytes(byteString);
            return this;
        }

        public Builder setPage(Page page) {
            copyOnWrite();
            ((ViewPage) this.instance).setPage(page);
            return this;
        }

        private Builder() {
            super(ViewPage.DEFAULT_INSTANCE);
        }

        public Builder setAudio(Audio.Builder builder) {
            copyOnWrite();
            ((ViewPage) this.instance).setAudio(builder.build());
            return this;
        }

        public Builder setDm(DM.Builder builder) {
            copyOnWrite();
            ((ViewPage) this.instance).setDm(builder.build());
            return this;
        }

        public Builder setPage(Page.Builder builder) {
            copyOnWrite();
            ((ViewPage) this.instance).setPage(builder.build());
            return this;
        }
    }

    static {
        ViewPage viewPage = new ViewPage();
        DEFAULT_INSTANCE = viewPage;
        GeneratedMessageLite.registerDefaultInstance(ViewPage.class, viewPage);
    }

    private ViewPage() {
    }

    public void clearAudio() {
        this.audio_ = null;
    }

    public void clearDm() {
        this.dm_ = null;
    }

    public void clearDownloadSubtitle() {
        this.downloadSubtitle_ = getDefaultInstance().getDownloadSubtitle();
    }

    public void clearDownloadTitle() {
        this.downloadTitle_ = getDefaultInstance().getDownloadTitle();
    }

    public void clearPage() {
        this.page_ = null;
    }

    public static ViewPage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAudio(Audio audio) {
    }

    public void mergeDm(DM dm) {
    }

    public void mergePage(Page page) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewPage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewPage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewPage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAudio(Audio audio) {
        audio.getClass();
        this.audio_ = audio;
    }

    public void setDm(DM dm) {
        dm.getClass();
        this.dm_ = dm;
    }

    public void setDownloadSubtitle(String str) {
        str.getClass();
        this.downloadSubtitle_ = str;
    }

    public void setDownloadSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.downloadSubtitle_ = byteString.toStringUtf8();
    }

    public void setDownloadTitle(String str) {
        str.getClass();
        this.downloadTitle_ = str;
    }

    public void setDownloadTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.downloadTitle_ = byteString.toStringUtf8();
    }

    public void setPage(Page page) {
        page.getClass();
        this.page_ = page;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69011.f16854xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewPage();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\u0208\u0005\u0208", new Object[]{"page_", "audio_", "dm_", "downloadTitle_", "downloadSubtitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewPage> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewPage.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public Audio getAudio() {
        Audio audio = this.audio_;
        return audio == null ? Audio.getDefaultInstance() : audio;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public DM getDm() {
        DM dm = this.dm_;
        return dm == null ? DM.getDefaultInstance() : dm;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public String getDownloadSubtitle() {
        return this.downloadSubtitle_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public ByteString getDownloadSubtitleBytes() {
        return ByteString.copyFromUtf8(this.downloadSubtitle_);
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public String getDownloadTitle() {
        return this.downloadTitle_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public ByteString getDownloadTitleBytes() {
        return ByteString.copyFromUtf8(this.downloadTitle_);
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public Page getPage() {
        Page page = this.page_;
        return page == null ? Page.getDefaultInstance() : page;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public boolean hasAudio() {
        return this.audio_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public boolean hasDm() {
        return this.dm_ != null;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewPageOrBuilder
    public boolean hasPage() {
        return this.page_ != null;
    }

    public static Builder newBuilder(ViewPage viewPage) {
        return DEFAULT_INSTANCE.createBuilder(viewPage);
    }

    public static ViewPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewPage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewPage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewPage parseFrom(InputStream inputStream) throws IOException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewPage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
