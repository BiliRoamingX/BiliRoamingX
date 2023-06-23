package com.bapis.bilibili.app.playerunite.pgcanymodel;

import com.bapis.bilibili.pgc.gateway.player.v2.Event;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayAbilityExtConf;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayExtInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.ViewInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class PGCAnyModel extends GeneratedMessageLite<PGCAnyModel, PGCAnyModel.Builder> implements MessageLiteOrBuilder {
    public static final int BUSINESS_FIELD_NUMBER = 3;
    private static final PGCAnyModel DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 4;
    private static volatile Parser<PGCAnyModel> PARSER = null;
    public static final int PLAY_EXT_CONF_FIELD_NUMBER = 6;
    public static final int PLAY_EXT_INFO_FIELD_NUMBER = 7;
    public static final int VIEW_INFO_FIELD_NUMBER = 5;
    private PlayViewBusinessInfo business_;
    private Event event_;
    private PlayAbilityExtConf playExtConf_;
    private PlayExtInfo playExtInfo_;
    private ViewInfo viewInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16505xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16505xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16505xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16505xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16505xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16505xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16505xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16505xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PGCAnyModel, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C64631 c64631) {
            this();
        }

        public Builder clearBusiness() {
            copyOnWrite();
            ((PGCAnyModel) this.instance).clearBusiness();
            return this;
        }

        public Builder clearEvent() {
            copyOnWrite();
            ((PGCAnyModel) this.instance).clearEvent();
            return this;
        }

        public Builder clearPlayExtConf() {
            copyOnWrite();
            ((PGCAnyModel) this.instance).clearPlayExtConf();
            return this;
        }

        public Builder clearPlayExtInfo() {
            copyOnWrite();
            ((PGCAnyModel) this.instance).clearPlayExtInfo();
            return this;
        }

        public Builder clearViewInfo() {
            copyOnWrite();
            ((PGCAnyModel) this.instance).clearViewInfo();
            return this;
        }

        public PlayViewBusinessInfo getBusiness() {
            return ((PGCAnyModel) this.instance).getBusiness();
        }

        public Event getEvent() {
            return ((PGCAnyModel) this.instance).getEvent();
        }

        public PlayAbilityExtConf getPlayExtConf() {
            return ((PGCAnyModel) this.instance).getPlayExtConf();
        }

        public PlayExtInfo getPlayExtInfo() {
            return ((PGCAnyModel) this.instance).getPlayExtInfo();
        }

        public ViewInfo getViewInfo() {
            return ((PGCAnyModel) this.instance).getViewInfo();
        }

        public boolean hasBusiness() {
            return ((PGCAnyModel) this.instance).hasBusiness();
        }

        public boolean hasEvent() {
            return ((PGCAnyModel) this.instance).hasEvent();
        }

        public boolean hasPlayExtConf() {
            return ((PGCAnyModel) this.instance).hasPlayExtConf();
        }

        public boolean hasPlayExtInfo() {
            return ((PGCAnyModel) this.instance).hasPlayExtInfo();
        }

        public boolean hasViewInfo() {
            return ((PGCAnyModel) this.instance).hasViewInfo();
        }

        public Builder mergeBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).mergeBusiness(playViewBusinessInfo);
            return this;
        }

        public Builder mergeEvent(Event event) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).mergeEvent(event);
            return this;
        }

        public Builder mergePlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).mergePlayExtConf(playAbilityExtConf);
            return this;
        }

        public Builder mergePlayExtInfo(PlayExtInfo playExtInfo) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).mergePlayExtInfo(playExtInfo);
            return this;
        }

        public Builder mergeViewInfo(ViewInfo viewInfo) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).mergeViewInfo(viewInfo);
            return this;
        }

        public Builder setBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setBusiness(playViewBusinessInfo);
            return this;
        }

        public Builder setEvent(Event event) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setEvent(event);
            return this;
        }

        public Builder setPlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setPlayExtConf(playAbilityExtConf);
            return this;
        }

        public Builder setPlayExtInfo(PlayExtInfo playExtInfo) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setPlayExtInfo(playExtInfo);
            return this;
        }

        public Builder setViewInfo(ViewInfo viewInfo) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setViewInfo(viewInfo);
            return this;
        }

        private Builder() {
            super(PGCAnyModel.DEFAULT_INSTANCE);
        }

        public Builder setBusiness(PlayViewBusinessInfo.Builder builder) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setBusiness(builder.build());
            return this;
        }

        public Builder setPlayExtConf(PlayAbilityExtConf.Builder builder) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setPlayExtConf(builder.build());
            return this;
        }

        public Builder setViewInfo(ViewInfo.Builder builder) {
            copyOnWrite();
            ((PGCAnyModel) this.instance).setViewInfo(builder.build());
            return this;
        }
    }

    static {
        PGCAnyModel pGCAnyModel = new PGCAnyModel();
        DEFAULT_INSTANCE = pGCAnyModel;
        GeneratedMessageLite.registerDefaultInstance(PGCAnyModel.class, pGCAnyModel);
    }

    private PGCAnyModel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusiness() {
        this.business_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayExtConf() {
        this.playExtConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayExtInfo() {
        this.playExtInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewInfo() {
        this.viewInfo_ = null;
    }

    public static PGCAnyModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(Event event) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayExtInfo(PlayExtInfo playExtInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewInfo(ViewInfo viewInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PGCAnyModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PGCAnyModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PGCAnyModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PGCAnyModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
        playViewBusinessInfo.getClass();
        this.business_ = playViewBusinessInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(Event event) {
        event.getClass();
        this.event_ = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
        playAbilityExtConf.getClass();
        this.playExtConf_ = playAbilityExtConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayExtInfo(PlayExtInfo playExtInfo) {
        playExtInfo.getClass();
        this.playExtInfo_ = playExtInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewInfo(ViewInfo viewInfo) {
        viewInfo.getClass();
        this.viewInfo_ = viewInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64631.f16505xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PGCAnyModel();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0003\u0007\u0005\u0000\u0000\u0000\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"business_", "event_", "viewInfo_", "playExtConf_", "playExtInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PGCAnyModel> parser = PARSER;
                if (parser == null) {
                    synchronized (PGCAnyModel.class) {
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

    public PlayViewBusinessInfo getBusiness() {
        PlayViewBusinessInfo playViewBusinessInfo = this.business_;
        return playViewBusinessInfo == null ? PlayViewBusinessInfo.getDefaultInstance() : playViewBusinessInfo;
    }

    public Event getEvent() {
        throw new RuntimeException();
    }

    public PlayAbilityExtConf getPlayExtConf() {
        PlayAbilityExtConf playAbilityExtConf = this.playExtConf_;
        return playAbilityExtConf == null ? PlayAbilityExtConf.getDefaultInstance() : playAbilityExtConf;
    }

    public PlayExtInfo getPlayExtInfo() {
        throw new RuntimeException();
    }

    public ViewInfo getViewInfo() {
        ViewInfo viewInfo = this.viewInfo_;
        return viewInfo == null ? ViewInfo.getDefaultInstance() : viewInfo;
    }

    public boolean hasBusiness() {
        return this.business_ != null;
    }

    public boolean hasEvent() {
        return this.event_ != null;
    }

    public boolean hasPlayExtConf() {
        return this.playExtConf_ != null;
    }

    public boolean hasPlayExtInfo() {
        return this.playExtInfo_ != null;
    }

    public boolean hasViewInfo() {
        return this.viewInfo_ != null;
    }

    public static Builder newBuilder(PGCAnyModel pGCAnyModel) {
        return DEFAULT_INSTANCE.createBuilder(pGCAnyModel);
    }

    public static PGCAnyModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PGCAnyModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PGCAnyModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PGCAnyModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PGCAnyModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PGCAnyModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PGCAnyModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PGCAnyModel parseFrom(InputStream inputStream) throws IOException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PGCAnyModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PGCAnyModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PGCAnyModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PGCAnyModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
