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
/* loaded from: classes14.dex */
public final class TextInputV2 extends GeneratedMessageLite<TextInputV2, TextInputV2.Builder> implements MessageLiteOrBuilder {
    public static final int AVATAR_FIELD_NUMBER = 5;
    private static final TextInputV2 DEFAULT_INSTANCE;
    public static final int LANDSCAPE_PLACEHOLDER_FIELD_NUMBER = 2;
    private static volatile Parser<TextInputV2> PARSER = null;
    public static final int PLACEHOLDER_POST_FIELD_NUMBER = 4;
    public static final int PORTRAIT_PLACEHOLDER_FIELD_NUMBER = 1;
    public static final int RENDER_TYPE_FIELD_NUMBER = 3;
    public static final int TEXT_INPUT_LIMIT_FIELD_NUMBER = 6;
    private boolean placeholderPost_;
    private int renderType_;
    private int textInputLimit_;
    private Internal.ProtobufList<String> portraitPlaceholder_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> landscapePlaceholder_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Avatar> avatar_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.TextInputV2$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17100xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17100xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17100xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17100xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17100xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17100xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17100xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17100xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TextInputV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72661 c72661) {
            this();
        }

        public Builder addAllAvatar(Iterable<? extends Avatar> iterable) {
            copyOnWrite();
            ((TextInputV2) this.instance).addAllAvatar(iterable);
            return this;
        }

        public Builder addAllLandscapePlaceholder(Iterable<String> iterable) {
            copyOnWrite();
            ((TextInputV2) this.instance).addAllLandscapePlaceholder(iterable);
            return this;
        }

        public Builder addAllPortraitPlaceholder(Iterable<String> iterable) {
            copyOnWrite();
            ((TextInputV2) this.instance).addAllPortraitPlaceholder(iterable);
            return this;
        }

        public Builder addAvatar(Avatar avatar) {
            copyOnWrite();
            ((TextInputV2) this.instance).addAvatar(avatar);
            return this;
        }

        public Builder addLandscapePlaceholder(String str) {
            copyOnWrite();
            ((TextInputV2) this.instance).addLandscapePlaceholder(str);
            return this;
        }

        public Builder addLandscapePlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((TextInputV2) this.instance).addLandscapePlaceholderBytes(byteString);
            return this;
        }

        public Builder addPortraitPlaceholder(String str) {
            copyOnWrite();
            ((TextInputV2) this.instance).addPortraitPlaceholder(str);
            return this;
        }

        public Builder addPortraitPlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((TextInputV2) this.instance).addPortraitPlaceholderBytes(byteString);
            return this;
        }

        public Builder clearAvatar() {
            copyOnWrite();
            ((TextInputV2) this.instance).clearAvatar();
            return this;
        }

        public Builder clearLandscapePlaceholder() {
            copyOnWrite();
            ((TextInputV2) this.instance).clearLandscapePlaceholder();
            return this;
        }

        public Builder clearPlaceholderPost() {
            copyOnWrite();
            ((TextInputV2) this.instance).clearPlaceholderPost();
            return this;
        }

        public Builder clearPortraitPlaceholder() {
            copyOnWrite();
            ((TextInputV2) this.instance).clearPortraitPlaceholder();
            return this;
        }

        public Builder clearRenderType() {
            copyOnWrite();
            ((TextInputV2) this.instance).clearRenderType();
            return this;
        }

        public Builder clearTextInputLimit() {
            copyOnWrite();
            ((TextInputV2) this.instance).clearTextInputLimit();
            return this;
        }

        public Avatar getAvatar(int i) {
            return ((TextInputV2) this.instance).getAvatar(i);
        }

        public int getAvatarCount() {
            return ((TextInputV2) this.instance).getAvatarCount();
        }

        public List<Avatar> getAvatarList() {
            return Collections.unmodifiableList(((TextInputV2) this.instance).getAvatarList());
        }

        public String getLandscapePlaceholder(int i) {
            return ((TextInputV2) this.instance).getLandscapePlaceholder(i);
        }

        public ByteString getLandscapePlaceholderBytes(int i) {
            return ((TextInputV2) this.instance).getLandscapePlaceholderBytes(i);
        }

        public int getLandscapePlaceholderCount() {
            return ((TextInputV2) this.instance).getLandscapePlaceholderCount();
        }

        public List<String> getLandscapePlaceholderList() {
            return Collections.unmodifiableList(((TextInputV2) this.instance).getLandscapePlaceholderList());
        }

        public boolean getPlaceholderPost() {
            return ((TextInputV2) this.instance).getPlaceholderPost();
        }

        public String getPortraitPlaceholder(int i) {
            return ((TextInputV2) this.instance).getPortraitPlaceholder(i);
        }

        public ByteString getPortraitPlaceholderBytes(int i) {
            return ((TextInputV2) this.instance).getPortraitPlaceholderBytes(i);
        }

        public int getPortraitPlaceholderCount() {
            return ((TextInputV2) this.instance).getPortraitPlaceholderCount();
        }

        public List<String> getPortraitPlaceholderList() {
            return Collections.unmodifiableList(((TextInputV2) this.instance).getPortraitPlaceholderList());
        }

        public RenderType getRenderType() {
            return ((TextInputV2) this.instance).getRenderType();
        }

        public int getRenderTypeValue() {
            return ((TextInputV2) this.instance).getRenderTypeValue();
        }

        public int getTextInputLimit() {
            return ((TextInputV2) this.instance).getTextInputLimit();
        }

        public Builder removeAvatar(int i) {
            copyOnWrite();
            ((TextInputV2) this.instance).removeAvatar(i);
            return this;
        }

        public Builder setAvatar(int i, Avatar avatar) {
            copyOnWrite();
            ((TextInputV2) this.instance).setAvatar(i, avatar);
            return this;
        }

        public Builder setLandscapePlaceholder(int i, String str) {
            copyOnWrite();
            ((TextInputV2) this.instance).setLandscapePlaceholder(i, str);
            return this;
        }

        public Builder setPlaceholderPost(boolean z) {
            copyOnWrite();
            ((TextInputV2) this.instance).setPlaceholderPost(z);
            return this;
        }

        public Builder setPortraitPlaceholder(int i, String str) {
            copyOnWrite();
            ((TextInputV2) this.instance).setPortraitPlaceholder(i, str);
            return this;
        }

        public Builder setRenderType(RenderType renderType) {
            copyOnWrite();
            ((TextInputV2) this.instance).setRenderType(renderType);
            return this;
        }

        public Builder setRenderTypeValue(int i) {
            copyOnWrite();
            ((TextInputV2) this.instance).setRenderTypeValue(i);
            return this;
        }

        public Builder setTextInputLimit(int i) {
            copyOnWrite();
            ((TextInputV2) this.instance).setTextInputLimit(i);
            return this;
        }

        private Builder() {
            super(TextInputV2.DEFAULT_INSTANCE);
        }

        public Builder addAvatar(int i, Avatar avatar) {
            copyOnWrite();
            ((TextInputV2) this.instance).addAvatar(i, avatar);
            return this;
        }

        public Builder setAvatar(int i, Avatar.Builder builder) {
            copyOnWrite();
            ((TextInputV2) this.instance).setAvatar(i, builder.build());
            return this;
        }

        public Builder addAvatar(Avatar.Builder builder) {
            copyOnWrite();
            ((TextInputV2) this.instance).addAvatar(builder.build());
            return this;
        }

        public Builder addAvatar(int i, Avatar.Builder builder) {
            copyOnWrite();
            ((TextInputV2) this.instance).addAvatar(i, builder.build());
            return this;
        }
    }

    static {
        TextInputV2 textInputV2 = new TextInputV2();
        DEFAULT_INSTANCE = textInputV2;
        GeneratedMessageLite.registerDefaultInstance(TextInputV2.class, textInputV2);
    }

    private TextInputV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvatar(Iterable<? extends Avatar> iterable) {
        ensureAvatarIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.avatar_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLandscapePlaceholder(Iterable<String> iterable) {
        ensureLandscapePlaceholderIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.landscapePlaceholder_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPortraitPlaceholder(Iterable<String> iterable) {
        ensurePortraitPlaceholderIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.portraitPlaceholder_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvatar(Avatar avatar) {
        avatar.getClass();
        ensureAvatarIsMutable();
        this.avatar_.add(avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandscapePlaceholder(String str) {
        str.getClass();
        ensureLandscapePlaceholderIsMutable();
        this.landscapePlaceholder_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandscapePlaceholderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureLandscapePlaceholderIsMutable();
        this.landscapePlaceholder_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPortraitPlaceholder(String str) {
        str.getClass();
        ensurePortraitPlaceholderIsMutable();
        this.portraitPlaceholder_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPortraitPlaceholderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePortraitPlaceholderIsMutable();
        this.portraitPlaceholder_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLandscapePlaceholder() {
        this.landscapePlaceholder_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceholderPost() {
        this.placeholderPost_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortraitPlaceholder() {
        this.portraitPlaceholder_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderType() {
        this.renderType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextInputLimit() {
        this.textInputLimit_ = 0;
    }

    private void ensureAvatarIsMutable() {
        Internal.ProtobufList<Avatar> protobufList = this.avatar_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.avatar_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureLandscapePlaceholderIsMutable() {
        Internal.ProtobufList<String> protobufList = this.landscapePlaceholder_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.landscapePlaceholder_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePortraitPlaceholderIsMutable() {
        Internal.ProtobufList<String> protobufList = this.portraitPlaceholder_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.portraitPlaceholder_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TextInputV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TextInputV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextInputV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextInputV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TextInputV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAvatar(int i) {
        ensureAvatarIsMutable();
        this.avatar_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(int i, Avatar avatar) {
        avatar.getClass();
        ensureAvatarIsMutable();
        this.avatar_.set(i, avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandscapePlaceholder(int i, String str) {
        str.getClass();
        ensureLandscapePlaceholderIsMutable();
        this.landscapePlaceholder_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceholderPost(boolean z) {
        this.placeholderPost_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitPlaceholder(int i, String str) {
        str.getClass();
        ensurePortraitPlaceholderIsMutable();
        this.portraitPlaceholder_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderType(RenderType renderType) {
        this.renderType_ = renderType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderTypeValue(int i) {
        this.renderType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextInputLimit(int i) {
        this.textInputLimit_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72661.f17100xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TextInputV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u021a\u0002\u021a\u0003\f\u0004\u0007\u0005\u001b\u0006\u0004", new Object[]{"portraitPlaceholder_", "landscapePlaceholder_", "renderType_", "placeholderPost_", "avatar_", Avatar.class, "textInputLimit_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TextInputV2> parser = PARSER;
                if (parser == null) {
                    synchronized (TextInputV2.class) {
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

    public Avatar getAvatar(int i) {
        return this.avatar_.get(i);
    }

    public int getAvatarCount() {
        return this.avatar_.size();
    }

    public List<Avatar> getAvatarList() {
        return this.avatar_;
    }

    public AvatarOrBuilder getAvatarOrBuilder(int i) {
        return this.avatar_.get(i);
    }

    public List<? extends AvatarOrBuilder> getAvatarOrBuilderList() {
        return this.avatar_;
    }

    public String getLandscapePlaceholder(int i) {
        return this.landscapePlaceholder_.get(i);
    }

    public ByteString getLandscapePlaceholderBytes(int i) {
        return ByteString.copyFromUtf8(this.landscapePlaceholder_.get(i));
    }

    public int getLandscapePlaceholderCount() {
        return this.landscapePlaceholder_.size();
    }

    public List<String> getLandscapePlaceholderList() {
        return this.landscapePlaceholder_;
    }

    public boolean getPlaceholderPost() {
        return this.placeholderPost_;
    }

    public String getPortraitPlaceholder(int i) {
        return this.portraitPlaceholder_.get(i);
    }

    public ByteString getPortraitPlaceholderBytes(int i) {
        return ByteString.copyFromUtf8(this.portraitPlaceholder_.get(i));
    }

    public int getPortraitPlaceholderCount() {
        return this.portraitPlaceholder_.size();
    }

    public List<String> getPortraitPlaceholderList() {
        return this.portraitPlaceholder_;
    }

    public RenderType getRenderType() {
        RenderType forNumber = RenderType.forNumber(this.renderType_);
        return forNumber == null ? RenderType.UNRECOGNIZED : forNumber;
    }

    public int getRenderTypeValue() {
        return this.renderType_;
    }

    public int getTextInputLimit() {
        return this.textInputLimit_;
    }

    public static Builder newBuilder(TextInputV2 textInputV2) {
        return DEFAULT_INSTANCE.createBuilder(textInputV2);
    }

    public static TextInputV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInputV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextInputV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TextInputV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvatar(int i, Avatar avatar) {
        avatar.getClass();
        ensureAvatarIsMutable();
        this.avatar_.add(i, avatar);
    }

    public static TextInputV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TextInputV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TextInputV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TextInputV2 parseFrom(InputStream inputStream) throws IOException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextInputV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextInputV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TextInputV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInputV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
