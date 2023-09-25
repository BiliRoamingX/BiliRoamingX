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
/* loaded from: classes14.dex */
public final class SubtitleItem extends GeneratedMessageLite<SubtitleItem, SubtitleItem.Builder> implements SubtitleItemOrBuilder {
    public static final int AI_STATUS_FIELD_NUMBER = 10;
    public static final int AI_TYPE_FIELD_NUMBER = 9;
    public static final int AUTHOR_FIELD_NUMBER = 6;
    private static final SubtitleItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ID_STR_FIELD_NUMBER = 2;
    public static final int LAN_DOC_BRIEF_FIELD_NUMBER = 8;
    public static final int LAN_DOC_FIELD_NUMBER = 4;
    public static final int LAN_FIELD_NUMBER = 3;
    private static volatile Parser<SubtitleItem> PARSER = null;
    public static final int SUBTITLE_URL_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 7;
    private int aiStatus_;
    private int aiType_;
    private UserInfo author_;
    private long id_;
    private int type_;
    private String idStr_ = "";
    private String lan_ = "";
    private String lanDoc_ = "";
    private String subtitleUrl_ = "";
    private String lanDocBrief_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.SubtitleItem$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17098xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17098xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17098xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SubtitleItem, Builder> implements SubtitleItemOrBuilder {
        /* synthetic */ Builder(C72631 c72631) {
            this();
        }

        public Builder clearAiStatus() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearAiStatus();
            return this;
        }

        public Builder clearAiType() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearAiType();
            return this;
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearAuthor();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearId();
            return this;
        }

        public Builder clearIdStr() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearIdStr();
            return this;
        }

        public Builder clearLan() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearLan();
            return this;
        }

        public Builder clearLanDoc() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearLanDoc();
            return this;
        }

        public Builder clearLanDocBrief() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearLanDocBrief();
            return this;
        }

        public Builder clearSubtitleUrl() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearSubtitleUrl();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SubtitleItem) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public SubtitleAiStatus getAiStatus() {
            return ((SubtitleItem) this.instance).getAiStatus();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public int getAiStatusValue() {
            return ((SubtitleItem) this.instance).getAiStatusValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public SubtitleAiType getAiType() {
            return ((SubtitleItem) this.instance).getAiType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public int getAiTypeValue() {
            return ((SubtitleItem) this.instance).getAiTypeValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public UserInfo getAuthor() {
            return ((SubtitleItem) this.instance).getAuthor();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public long getId() {
            return ((SubtitleItem) this.instance).getId();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public String getIdStr() {
            return ((SubtitleItem) this.instance).getIdStr();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public ByteString getIdStrBytes() {
            return ((SubtitleItem) this.instance).getIdStrBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public String getLan() {
            return ((SubtitleItem) this.instance).getLan();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public ByteString getLanBytes() {
            return ((SubtitleItem) this.instance).getLanBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public String getLanDoc() {
            return ((SubtitleItem) this.instance).getLanDoc();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public String getLanDocBrief() {
            return ((SubtitleItem) this.instance).getLanDocBrief();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public ByteString getLanDocBriefBytes() {
            return ((SubtitleItem) this.instance).getLanDocBriefBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public ByteString getLanDocBytes() {
            return ((SubtitleItem) this.instance).getLanDocBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public String getSubtitleUrl() {
            return ((SubtitleItem) this.instance).getSubtitleUrl();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public ByteString getSubtitleUrlBytes() {
            return ((SubtitleItem) this.instance).getSubtitleUrlBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public SubtitleType getType() {
            return ((SubtitleItem) this.instance).getType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public int getTypeValue() {
            return ((SubtitleItem) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
        public boolean hasAuthor() {
            return ((SubtitleItem) this.instance).hasAuthor();
        }

        public Builder mergeAuthor(UserInfo userInfo) {
            copyOnWrite();
            ((SubtitleItem) this.instance).mergeAuthor(userInfo);
            return this;
        }

        public Builder setAiStatus(SubtitleAiStatus subtitleAiStatus) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setAiStatus(subtitleAiStatus);
            return this;
        }

        public Builder setAiStatusValue(int i) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setAiStatusValue(i);
            return this;
        }

        public Builder setAiType(SubtitleAiType subtitleAiType) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setAiType(subtitleAiType);
            return this;
        }

        public Builder setAiTypeValue(int i) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setAiTypeValue(i);
            return this;
        }

        public Builder setAuthor(UserInfo userInfo) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setAuthor(userInfo);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setId(j);
            return this;
        }

        public Builder setIdStr(String str) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setIdStr(str);
            return this;
        }

        public Builder setIdStrBytes(ByteString byteString) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setIdStrBytes(byteString);
            return this;
        }

        public Builder setLan(String str) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setLan(str);
            return this;
        }

        public Builder setLanBytes(ByteString byteString) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setLanBytes(byteString);
            return this;
        }

        public Builder setLanDoc(String str) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setLanDoc(str);
            return this;
        }

        public Builder setLanDocBrief(String str) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setLanDocBrief(str);
            return this;
        }

        public Builder setLanDocBriefBytes(ByteString byteString) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setLanDocBriefBytes(byteString);
            return this;
        }

        public Builder setLanDocBytes(ByteString byteString) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setLanDocBytes(byteString);
            return this;
        }

        public Builder setSubtitleUrl(String str) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setSubtitleUrl(str);
            return this;
        }

        public Builder setSubtitleUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setSubtitleUrlBytes(byteString);
            return this;
        }

        public Builder setType(SubtitleType subtitleType) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setType(subtitleType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(SubtitleItem.DEFAULT_INSTANCE);
        }

        public Builder setAuthor(UserInfo.Builder builder) {
            copyOnWrite();
            ((SubtitleItem) this.instance).setAuthor(builder.build());
            return this;
        }
    }

    static {
        SubtitleItem subtitleItem = new SubtitleItem();
        DEFAULT_INSTANCE = subtitleItem;
        GeneratedMessageLite.registerDefaultInstance(SubtitleItem.class, subtitleItem);
    }

    public SubtitleItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiStatus() {
        this.aiStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiType() {
        this.aiType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthor() {
        this.author_ = null;
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
    public void clearLan() {
        this.lan_ = getDefaultInstance().getLan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanDoc() {
        this.lanDoc_ = getDefaultInstance().getLanDoc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanDocBrief() {
        this.lanDocBrief_ = getDefaultInstance().getLanDocBrief();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitleUrl() {
        this.subtitleUrl_ = getDefaultInstance().getSubtitleUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static SubtitleItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthor(UserInfo userInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SubtitleItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SubtitleItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubtitleItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SubtitleItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiStatus(SubtitleAiStatus subtitleAiStatus) {
        this.aiStatus_ = subtitleAiStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiStatusValue(int i) {
        this.aiStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiType(SubtitleAiType subtitleAiType) {
        this.aiType_ = subtitleAiType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiTypeValue(int i) {
        this.aiType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthor(UserInfo userInfo) {
        userInfo.getClass();
        this.author_ = userInfo;
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
    public void setLan(String str) {
        str.getClass();
        this.lan_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lan_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanDoc(String str) {
        str.getClass();
        this.lanDoc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanDocBrief(String str) {
        str.getClass();
        this.lanDocBrief_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanDocBriefBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lanDocBrief_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanDocBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lanDoc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleUrl(String str) {
        str.getClass();
        this.subtitleUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitleUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(SubtitleType subtitleType) {
        this.type_ = subtitleType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72631.f17098xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SubtitleItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\t\u0007\f\b\u0208\t\f\n\f", new Object[]{"id_", "idStr_", "lan_", "lanDoc_", "subtitleUrl_", "author_", "type_", "lanDocBrief_", "aiType_", "aiStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SubtitleItem> parser = PARSER;
                if (parser == null) {
                    synchronized (SubtitleItem.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public SubtitleAiStatus getAiStatus() {
        SubtitleAiStatus forNumber = SubtitleAiStatus.forNumber(this.aiStatus_);
        return forNumber == null ? SubtitleAiStatus.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public int getAiStatusValue() {
        return this.aiStatus_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public SubtitleAiType getAiType() {
        SubtitleAiType forNumber = SubtitleAiType.forNumber(this.aiType_);
        return forNumber == null ? SubtitleAiType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public int getAiTypeValue() {
        return this.aiType_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public UserInfo getAuthor() {
        UserInfo userInfo = this.author_;
        return userInfo == null ? UserInfo.getDefaultInstance() : userInfo;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public String getIdStr() {
        return this.idStr_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public ByteString getIdStrBytes() {
        return ByteString.copyFromUtf8(this.idStr_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public String getLan() {
        return this.lan_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public ByteString getLanBytes() {
        return ByteString.copyFromUtf8(this.lan_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public String getLanDoc() {
        return this.lanDoc_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public String getLanDocBrief() {
        return this.lanDocBrief_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public ByteString getLanDocBriefBytes() {
        return ByteString.copyFromUtf8(this.lanDocBrief_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public ByteString getLanDocBytes() {
        return ByteString.copyFromUtf8(this.lanDoc_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public String getSubtitleUrl() {
        return this.subtitleUrl_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public ByteString getSubtitleUrlBytes() {
        return ByteString.copyFromUtf8(this.subtitleUrl_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public SubtitleType getType() {
        SubtitleType forNumber = SubtitleType.forNumber(this.type_);
        return forNumber == null ? SubtitleType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.SubtitleItemOrBuilder
    public boolean hasAuthor() {
        return this.author_ != null;
    }

    public static Builder newBuilder(SubtitleItem subtitleItem) {
        return DEFAULT_INSTANCE.createBuilder(subtitleItem);
    }

    public static SubtitleItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubtitleItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubtitleItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SubtitleItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SubtitleItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SubtitleItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubtitleItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SubtitleItem parseFrom(InputStream inputStream) throws IOException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubtitleItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubtitleItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SubtitleItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubtitleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
