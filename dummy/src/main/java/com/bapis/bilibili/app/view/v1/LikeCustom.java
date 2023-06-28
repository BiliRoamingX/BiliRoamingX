package com.bapis.bilibili.app.view.v1;

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
public final class LikeCustom extends GeneratedMessageLite<LikeCustom, LikeCustom.Builder> implements MessageLiteOrBuilder {
    private static final LikeCustom DEFAULT_INSTANCE;
    public static final int FULL_TO_HALF_PROGRESS_FIELD_NUMBER = 2;
    public static final int IMMEDIATELY_UPGRADE_FIELD_NUMBER = 5;
    public static final int LIKE_COMMENT_FIELD_NUMBER = 6;
    public static final int LIKE_SWITCH_FIELD_NUMBER = 1;
    public static final int NON_FULL_PROGRESS_FIELD_NUMBER = 3;
    private static volatile Parser<LikeCustom> PARSER = null;
    public static final int UPDATE_COUNT_FIELD_NUMBER = 4;
    private long fullToHalfProgress_;
    private boolean immediatelyUpgrade_;
    private LikeComment likeComment_;
    private boolean likeSwitch_;
    private long nonFullProgress_;
    private long updateCount_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.LikeCustom$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67861 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16753xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16753xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16753xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16753xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16753xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16753xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16753xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16753xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LikeCustom, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67861 c67861) {
            this();
        }

        public Builder clearFullToHalfProgress() {
            copyOnWrite();
            ((LikeCustom) this.instance).clearFullToHalfProgress();
            return this;
        }

        public Builder clearImmediatelyUpgrade() {
            copyOnWrite();
            ((LikeCustom) this.instance).clearImmediatelyUpgrade();
            return this;
        }

        public Builder clearLikeComment() {
            copyOnWrite();
            ((LikeCustom) this.instance).clearLikeComment();
            return this;
        }

        public Builder clearLikeSwitch() {
            copyOnWrite();
            ((LikeCustom) this.instance).clearLikeSwitch();
            return this;
        }

        public Builder clearNonFullProgress() {
            copyOnWrite();
            ((LikeCustom) this.instance).clearNonFullProgress();
            return this;
        }

        public Builder clearUpdateCount() {
            copyOnWrite();
            ((LikeCustom) this.instance).clearUpdateCount();
            return this;
        }

        public long getFullToHalfProgress() {
            return ((LikeCustom) this.instance).getFullToHalfProgress();
        }

        public boolean getImmediatelyUpgrade() {
            return ((LikeCustom) this.instance).getImmediatelyUpgrade();
        }

        public LikeComment getLikeComment() {
            return ((LikeCustom) this.instance).getLikeComment();
        }

        public boolean getLikeSwitch() {
            return ((LikeCustom) this.instance).getLikeSwitch();
        }

        public long getNonFullProgress() {
            return ((LikeCustom) this.instance).getNonFullProgress();
        }

        public long getUpdateCount() {
            return ((LikeCustom) this.instance).getUpdateCount();
        }

        public boolean hasLikeComment() {
            return ((LikeCustom) this.instance).hasLikeComment();
        }

        public Builder mergeLikeComment(LikeComment likeComment) {
            copyOnWrite();
            ((LikeCustom) this.instance).mergeLikeComment(likeComment);
            return this;
        }

        public Builder setFullToHalfProgress(long j) {
            copyOnWrite();
            ((LikeCustom) this.instance).setFullToHalfProgress(j);
            return this;
        }

        public Builder setImmediatelyUpgrade(boolean z) {
            copyOnWrite();
            ((LikeCustom) this.instance).setImmediatelyUpgrade(z);
            return this;
        }

        public Builder setLikeComment(LikeComment likeComment) {
            copyOnWrite();
            ((LikeCustom) this.instance).setLikeComment(likeComment);
            return this;
        }

        public Builder setLikeSwitch(boolean z) {
            copyOnWrite();
            ((LikeCustom) this.instance).setLikeSwitch(z);
            return this;
        }

        public Builder setNonFullProgress(long j) {
            copyOnWrite();
            ((LikeCustom) this.instance).setNonFullProgress(j);
            return this;
        }

        public Builder setUpdateCount(long j) {
            copyOnWrite();
            ((LikeCustom) this.instance).setUpdateCount(j);
            return this;
        }

        private Builder() {
            super(LikeCustom.DEFAULT_INSTANCE);
        }

        public Builder setLikeComment(LikeComment.Builder builder) {
            copyOnWrite();
            ((LikeCustom) this.instance).setLikeComment(builder.build());
            return this;
        }
    }

    static {
        LikeCustom likeCustom = new LikeCustom();
        DEFAULT_INSTANCE = likeCustom;
        GeneratedMessageLite.registerDefaultInstance(LikeCustom.class, likeCustom);
    }

    private LikeCustom() {
    }

    public void clearFullToHalfProgress() {
        this.fullToHalfProgress_ = 0L;
    }

    public void clearImmediatelyUpgrade() {
        this.immediatelyUpgrade_ = false;
    }

    public void clearLikeComment() {
        this.likeComment_ = null;
    }

    public void clearLikeSwitch() {
        this.likeSwitch_ = false;
    }

    public void clearNonFullProgress() {
        this.nonFullProgress_ = 0L;
    }

    public void clearUpdateCount() {
        this.updateCount_ = 0L;
    }

    public static LikeCustom getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeLikeComment(LikeComment likeComment) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeCustom parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeCustom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeCustom parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeCustom> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setFullToHalfProgress(long j) {
        this.fullToHalfProgress_ = j;
    }

    public void setImmediatelyUpgrade(boolean z) {
        this.immediatelyUpgrade_ = z;
    }

    public void setLikeComment(LikeComment likeComment) {
        likeComment.getClass();
        this.likeComment_ = likeComment;
    }

    public void setLikeSwitch(boolean z) {
        this.likeSwitch_ = z;
    }

    public void setNonFullProgress(long j) {
        this.nonFullProgress_ = j;
    }

    public void setUpdateCount(long j) {
        this.updateCount_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67861.f16753xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeCustom();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0007\u0006\t", new Object[]{"likeSwitch_", "fullToHalfProgress_", "nonFullProgress_", "updateCount_", "immediatelyUpgrade_", "likeComment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeCustom> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeCustom.class) {
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

    public long getFullToHalfProgress() {
        return this.fullToHalfProgress_;
    }

    public boolean getImmediatelyUpgrade() {
        return this.immediatelyUpgrade_;
    }

    public LikeComment getLikeComment() {
        LikeComment likeComment = this.likeComment_;
        return likeComment == null ? LikeComment.getDefaultInstance() : likeComment;
    }

    public boolean getLikeSwitch() {
        return this.likeSwitch_;
    }

    public long getNonFullProgress() {
        return this.nonFullProgress_;
    }

    public long getUpdateCount() {
        return this.updateCount_;
    }

    public boolean hasLikeComment() {
        return this.likeComment_ != null;
    }

    public static Builder newBuilder(LikeCustom likeCustom) {
        return DEFAULT_INSTANCE.createBuilder(likeCustom);
    }

    public static LikeCustom parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeCustom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeCustom parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeCustom parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeCustom parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeCustom parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeCustom parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeCustom parseFrom(InputStream inputStream) throws IOException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeCustom parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeCustom parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeCustom parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeCustom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * clearLikeComment
     */
    static void access$1300(LikeCustom likeCustom) {
    }
}
