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
public final class TextInput extends GeneratedMessageLite<TextInput, TextInput.Builder> implements MessageLiteOrBuilder {
    public static final int AVATAR_FIELD_NUMBER = 6;
    private static final TextInput DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 8;
    public static final int LANDSCAPE_PLACEHOLDER_FIELD_NUMBER = 2;
    private static volatile Parser<TextInput> PARSER = null;
    public static final int PLACEHOLDER_POST_FIELD_NUMBER = 4;
    public static final int PORTRAIT_PLACEHOLDER_FIELD_NUMBER = 1;
    public static final int POST_STATUS_FIELD_NUMBER = 7;
    public static final int RENDER_TYPE_FIELD_NUMBER = 3;
    public static final int SHOW_FIELD_NUMBER = 5;
    private Label label_;
    private boolean placeholderPost_;
    private int postStatus_;
    private int renderType_;
    private boolean show_;
    private Internal.ProtobufList<String> portraitPlaceholder_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> landscapePlaceholder_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Avatar> avatar_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.TextInput$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17099xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17099xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17099xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17099xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17099xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17099xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17099xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17099xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TextInput, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72651 c72651) {
            this();
        }

        public Builder addAllAvatar(Iterable<? extends Avatar> iterable) {
            copyOnWrite();
            ((TextInput) this.instance).addAllAvatar(iterable);
            return this;
        }

        public Builder addAllLandscapePlaceholder(Iterable<String> iterable) {
            copyOnWrite();
            ((TextInput) this.instance).addAllLandscapePlaceholder(iterable);
            return this;
        }

        public Builder addAllPortraitPlaceholder(Iterable<String> iterable) {
            copyOnWrite();
            ((TextInput) this.instance).addAllPortraitPlaceholder(iterable);
            return this;
        }

        public Builder addAvatar(Avatar avatar) {
            copyOnWrite();
            ((TextInput) this.instance).addAvatar(avatar);
            return this;
        }

        public Builder addLandscapePlaceholder(String str) {
            copyOnWrite();
            ((TextInput) this.instance).addLandscapePlaceholder(str);
            return this;
        }

        public Builder addLandscapePlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((TextInput) this.instance).addLandscapePlaceholderBytes(byteString);
            return this;
        }

        public Builder addPortraitPlaceholder(String str) {
            copyOnWrite();
            ((TextInput) this.instance).addPortraitPlaceholder(str);
            return this;
        }

        public Builder addPortraitPlaceholderBytes(ByteString byteString) {
            copyOnWrite();
            ((TextInput) this.instance).addPortraitPlaceholderBytes(byteString);
            return this;
        }

        public Builder clearAvatar() {
            copyOnWrite();
            ((TextInput) this.instance).clearAvatar();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((TextInput) this.instance).clearLabel();
            return this;
        }

        public Builder clearLandscapePlaceholder() {
            copyOnWrite();
            ((TextInput) this.instance).clearLandscapePlaceholder();
            return this;
        }

        public Builder clearPlaceholderPost() {
            copyOnWrite();
            ((TextInput) this.instance).clearPlaceholderPost();
            return this;
        }

        public Builder clearPortraitPlaceholder() {
            copyOnWrite();
            ((TextInput) this.instance).clearPortraitPlaceholder();
            return this;
        }

        public Builder clearPostStatus() {
            copyOnWrite();
            ((TextInput) this.instance).clearPostStatus();
            return this;
        }

        public Builder clearRenderType() {
            copyOnWrite();
            ((TextInput) this.instance).clearRenderType();
            return this;
        }

        public Builder clearShow() {
            copyOnWrite();
            ((TextInput) this.instance).clearShow();
            return this;
        }

        public Avatar getAvatar(int i) {
            return ((TextInput) this.instance).getAvatar(i);
        }

        public int getAvatarCount() {
            return ((TextInput) this.instance).getAvatarCount();
        }

        public List<Avatar> getAvatarList() {
            return Collections.unmodifiableList(((TextInput) this.instance).getAvatarList());
        }

        public Label getLabel() {
            return ((TextInput) this.instance).getLabel();
        }

        public String getLandscapePlaceholder(int i) {
            return ((TextInput) this.instance).getLandscapePlaceholder(i);
        }

        public ByteString getLandscapePlaceholderBytes(int i) {
            return ((TextInput) this.instance).getLandscapePlaceholderBytes(i);
        }

        public int getLandscapePlaceholderCount() {
            return ((TextInput) this.instance).getLandscapePlaceholderCount();
        }

        public List<String> getLandscapePlaceholderList() {
            return Collections.unmodifiableList(((TextInput) this.instance).getLandscapePlaceholderList());
        }

        public boolean getPlaceholderPost() {
            return ((TextInput) this.instance).getPlaceholderPost();
        }

        public String getPortraitPlaceholder(int i) {
            return ((TextInput) this.instance).getPortraitPlaceholder(i);
        }

        public ByteString getPortraitPlaceholderBytes(int i) {
            return ((TextInput) this.instance).getPortraitPlaceholderBytes(i);
        }

        public int getPortraitPlaceholderCount() {
            return ((TextInput) this.instance).getPortraitPlaceholderCount();
        }

        public List<String> getPortraitPlaceholderList() {
            return Collections.unmodifiableList(((TextInput) this.instance).getPortraitPlaceholderList());
        }

        public PostStatus getPostStatus() {
            return ((TextInput) this.instance).getPostStatus();
        }

        public int getPostStatusValue() {
            return ((TextInput) this.instance).getPostStatusValue();
        }

        public RenderType getRenderType() {
            return ((TextInput) this.instance).getRenderType();
        }

        public int getRenderTypeValue() {
            return ((TextInput) this.instance).getRenderTypeValue();
        }

        public boolean getShow() {
            return ((TextInput) this.instance).getShow();
        }

        public boolean hasLabel() {
            return ((TextInput) this.instance).hasLabel();
        }

        public Builder mergeLabel(Label label) {
            copyOnWrite();
            ((TextInput) this.instance).mergeLabel(label);
            return this;
        }

        public Builder removeAvatar(int i) {
            copyOnWrite();
            ((TextInput) this.instance).removeAvatar(i);
            return this;
        }

        public Builder setAvatar(int i, Avatar avatar) {
            copyOnWrite();
            ((TextInput) this.instance).setAvatar(i, avatar);
            return this;
        }

        public Builder setLabel(Label label) {
            copyOnWrite();
            ((TextInput) this.instance).setLabel(label);
            return this;
        }

        public Builder setLandscapePlaceholder(int i, String str) {
            copyOnWrite();
            ((TextInput) this.instance).setLandscapePlaceholder(i, str);
            return this;
        }

        public Builder setPlaceholderPost(boolean z) {
            copyOnWrite();
            ((TextInput) this.instance).setPlaceholderPost(z);
            return this;
        }

        public Builder setPortraitPlaceholder(int i, String str) {
            copyOnWrite();
            ((TextInput) this.instance).setPortraitPlaceholder(i, str);
            return this;
        }

        public Builder setPostStatus(PostStatus postStatus) {
            copyOnWrite();
            ((TextInput) this.instance).setPostStatus(postStatus);
            return this;
        }

        public Builder setPostStatusValue(int i) {
            copyOnWrite();
            ((TextInput) this.instance).setPostStatusValue(i);
            return this;
        }

        public Builder setRenderType(RenderType renderType) {
            copyOnWrite();
            ((TextInput) this.instance).setRenderType(renderType);
            return this;
        }

        public Builder setRenderTypeValue(int i) {
            copyOnWrite();
            ((TextInput) this.instance).setRenderTypeValue(i);
            return this;
        }

        public Builder setShow(boolean z) {
            copyOnWrite();
            ((TextInput) this.instance).setShow(z);
            return this;
        }

        private Builder() {
            super(TextInput.DEFAULT_INSTANCE);
        }

        public Builder addAvatar(int i, Avatar avatar) {
            copyOnWrite();
            ((TextInput) this.instance).addAvatar(i, avatar);
            return this;
        }

        public Builder setAvatar(int i, Avatar.Builder builder) {
            copyOnWrite();
            ((TextInput) this.instance).setAvatar(i, builder.build());
            return this;
        }

        public Builder setLabel(Label.Builder builder) {
            copyOnWrite();
            ((TextInput) this.instance).setLabel(builder.build());
            return this;
        }

        public Builder addAvatar(Avatar.Builder builder) {
            copyOnWrite();
            ((TextInput) this.instance).addAvatar(builder.build());
            return this;
        }

        public Builder addAvatar(int i, Avatar.Builder builder) {
            copyOnWrite();
            ((TextInput) this.instance).addAvatar(i, builder.build());
            return this;
        }
    }

    static {
        TextInput textInput = new TextInput();
        DEFAULT_INSTANCE = textInput;
        GeneratedMessageLite.registerDefaultInstance(TextInput.class, textInput);
    }

    private TextInput() {
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
    public void clearLabel() {
        this.label_ = null;
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
    public void clearPostStatus() {
        this.postStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderType() {
        this.renderType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShow() {
        this.show_ = false;
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

    public static TextInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(Label label) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TextInput parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TextInput> parser() {
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
    public void setLabel(Label label) {
        label.getClass();
        this.label_ = label;
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
    public void setPostStatus(PostStatus postStatus) {
        this.postStatus_ = postStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostStatusValue(int i) {
        this.postStatus_ = i;
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
    public void setShow(boolean z) {
        this.show_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72651.f17099xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TextInput();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0003\u0000\u0001\u021a\u0002\u021a\u0003\f\u0004\u0007\u0005\u0007\u0006\u001b\u0007\f\b\t", new Object[]{"portraitPlaceholder_", "landscapePlaceholder_", "renderType_", "placeholderPost_", "show_", "avatar_", Avatar.class, "postStatus_", "label_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TextInput> parser = PARSER;
                if (parser == null) {
                    synchronized (TextInput.class) {
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

    public Label getLabel() {
        Label label = this.label_;
        return label == null ? Label.getDefaultInstance() : label;
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

    public PostStatus getPostStatus() {
        PostStatus forNumber = PostStatus.forNumber(this.postStatus_);
        return forNumber == null ? PostStatus.UNRECOGNIZED : forNumber;
    }

    public int getPostStatusValue() {
        return this.postStatus_;
    }

    public RenderType getRenderType() {
        RenderType forNumber = RenderType.forNumber(this.renderType_);
        return forNumber == null ? RenderType.UNRECOGNIZED : forNumber;
    }

    public int getRenderTypeValue() {
        return this.renderType_;
    }

    public boolean getShow() {
        return this.show_;
    }

    public boolean hasLabel() {
        return this.label_ != null;
    }

    public static Builder newBuilder(TextInput textInput) {
        return DEFAULT_INSTANCE.createBuilder(textInput);
    }

    public static TextInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TextInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvatar(int i, Avatar avatar) {
        avatar.getClass();
        ensureAvatarIsMutable();
        this.avatar_.add(i, avatar);
    }

    public static TextInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TextInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TextInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TextInput parseFrom(InputStream inputStream) throws IOException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextInput parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TextInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
