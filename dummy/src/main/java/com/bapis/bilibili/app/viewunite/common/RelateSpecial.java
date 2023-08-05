package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class RelateSpecial extends GeneratedMessageLite<RelateSpecial, RelateSpecial.Builder> implements MessageLiteOrBuilder {
    public static final int BADGE_FIELD_NUMBER = 1;
    private static final RelateSpecial DEFAULT_INSTANCE;
    private static volatile Parser<RelateSpecial> PARSER = null;
    public static final int RCMD_REASON_FIELD_NUMBER = 2;
    private BadgeInfo badge_;
    private BadgeInfo rcmdReason_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateSpecial$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70471 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17027xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17027xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17027xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17027xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17027xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17027xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17027xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17027xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateSpecial, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70471 c70471) {
            this();
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((RelateSpecial) this.instance).clearBadge();
            return this;
        }

        public Builder clearRcmdReason() {
            copyOnWrite();
            ((RelateSpecial) this.instance).clearRcmdReason();
            return this;
        }

        public BadgeInfo getBadge() {
            return ((RelateSpecial) this.instance).getBadge();
        }

        public BadgeInfo getRcmdReason() {
            return ((RelateSpecial) this.instance).getRcmdReason();
        }

        public boolean hasBadge() {
            return ((RelateSpecial) this.instance).hasBadge();
        }

        public boolean hasRcmdReason() {
            return ((RelateSpecial) this.instance).hasRcmdReason();
        }

        public Builder mergeBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateSpecial) this.instance).mergeBadge(badgeInfo);
            return this;
        }

        public Builder mergeRcmdReason(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateSpecial) this.instance).mergeRcmdReason(badgeInfo);
            return this;
        }

        public Builder setBadge(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateSpecial) this.instance).setBadge(badgeInfo);
            return this;
        }

        public Builder setRcmdReason(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((RelateSpecial) this.instance).setRcmdReason(badgeInfo);
            return this;
        }

        private Builder() {
            super(RelateSpecial.DEFAULT_INSTANCE);
        }

        public Builder setBadge(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((RelateSpecial) this.instance).setBadge(builder.build());
            return this;
        }

        public Builder setRcmdReason(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((RelateSpecial) this.instance).setRcmdReason(builder.build());
            return this;
        }
    }

    static {
        RelateSpecial relateSpecial = new RelateSpecial();
        DEFAULT_INSTANCE = relateSpecial;
        GeneratedMessageLite.registerDefaultInstance(RelateSpecial.class, relateSpecial);
    }

    private RelateSpecial() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.badge_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRcmdReason() {
        this.rcmdReason_ = null;
    }

    public static RelateSpecial getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadge(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.badge_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.badge_ = BadgeInfo.newBuilder(this.badge_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.badge_ = badgeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRcmdReason(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.rcmdReason_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.rcmdReason_ = BadgeInfo.newBuilder(this.rcmdReason_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.rcmdReason_ = badgeInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateSpecial parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateSpecial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateSpecial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateSpecial> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badge_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReason(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.rcmdReason_ = badgeInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70471.f17027xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateSpecial();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"badge_", "rcmdReason_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateSpecial> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateSpecial.class) {
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

    public BadgeInfo getBadge() {
        BadgeInfo badgeInfo = this.badge_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    public BadgeInfo getRcmdReason() {
        BadgeInfo badgeInfo = this.rcmdReason_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    public boolean hasBadge() {
        return this.badge_ != null;
    }

    public boolean hasRcmdReason() {
        return this.rcmdReason_ != null;
    }

    public static Builder newBuilder(RelateSpecial relateSpecial) {
        return DEFAULT_INSTANCE.createBuilder(relateSpecial);
    }

    public static RelateSpecial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateSpecial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateSpecial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateSpecial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateSpecial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateSpecial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateSpecial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateSpecial parseFrom(InputStream inputStream) throws IOException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateSpecial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateSpecial parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateSpecial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateSpecial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
