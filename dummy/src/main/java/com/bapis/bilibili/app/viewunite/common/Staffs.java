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
public final class Staffs extends GeneratedMessageLite<Staffs, Staffs.Builder> implements MessageLiteOrBuilder {
    private static final Staffs DEFAULT_INSTANCE;
    private static volatile Parser<Staffs> PARSER = null;
    public static final int STAFF_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Staff> staff_ = GeneratedMessageLite.emptyProtobufList();
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Staffs$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70641 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17041xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17041xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17041xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Staffs, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70641 c70641) {
            this();
        }

        public Builder addAllStaff(Iterable<? extends Staff> iterable) {
            copyOnWrite();
            ((Staffs) this.instance).addAllStaff(iterable);
            return this;
        }

        public Builder addStaff(Staff staff) {
            copyOnWrite();
            ((Staffs) this.instance).addStaff(staff);
            return this;
        }

        public Builder clearStaff() {
            copyOnWrite();
            ((Staffs) this.instance).clearStaff();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Staffs) this.instance).clearTitle();
            return this;
        }

        public Staff getStaff(int i) {
            return ((Staffs) this.instance).getStaff(i);
        }

        public int getStaffCount() {
            return ((Staffs) this.instance).getStaffCount();
        }

        public List<Staff> getStaffList() {
            return Collections.unmodifiableList(((Staffs) this.instance).getStaffList());
        }

        public String getTitle() {
            return ((Staffs) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Staffs) this.instance).getTitleBytes();
        }

        public Builder removeStaff(int i) {
            copyOnWrite();
            ((Staffs) this.instance).removeStaff(i);
            return this;
        }

        public Builder setStaff(int i, Staff staff) {
            copyOnWrite();
            ((Staffs) this.instance).setStaff(i, staff);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Staffs) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Staffs) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Staffs.DEFAULT_INSTANCE);
        }

        public Builder addStaff(int i, Staff staff) {
            copyOnWrite();
            ((Staffs) this.instance).addStaff(i, staff);
            return this;
        }

        public Builder setStaff(int i, Staff.Builder builder) {
            copyOnWrite();
            ((Staffs) this.instance).setStaff(i, builder.build());
            return this;
        }

        public Builder addStaff(Staff.Builder builder) {
            copyOnWrite();
            ((Staffs) this.instance).addStaff(builder.build());
            return this;
        }

        public Builder addStaff(int i, Staff.Builder builder) {
            copyOnWrite();
            ((Staffs) this.instance).addStaff(i, builder.build());
            return this;
        }
    }

    static {
        Staffs staffs = new Staffs();
        DEFAULT_INSTANCE = staffs;
        GeneratedMessageLite.registerDefaultInstance(Staffs.class, staffs);
    }

    private Staffs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStaff(Iterable<? extends Staff> iterable) {
        ensureStaffIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.staff_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStaff(Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.add(staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaff() {
        this.staff_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureStaffIsMutable() {
        Internal.ProtobufList<Staff> protobufList = this.staff_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.staff_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Staffs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Staffs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Staffs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Staffs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Staffs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStaff(int i) {
        ensureStaffIsMutable();
        this.staff_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaff(int i, Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.set(i, staff);
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70641.f17041xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Staffs();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", new Object[]{"staff_", Staff.class, "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Staffs> parser = PARSER;
                if (parser == null) {
                    synchronized (Staffs.class) {
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

    public Staff getStaff(int i) {
        return this.staff_.get(i);
    }

    public int getStaffCount() {
        return this.staff_.size();
    }

    public List<Staff> getStaffList() {
        return this.staff_;
    }

    public StaffOrBuilder getStaffOrBuilder(int i) {
        return this.staff_.get(i);
    }

    public List<? extends StaffOrBuilder> getStaffOrBuilderList() {
        return this.staff_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(Staffs staffs) {
        return DEFAULT_INSTANCE.createBuilder(staffs);
    }

    public static Staffs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Staffs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Staffs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Staffs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStaff(int i, Staff staff) {
        staff.getClass();
        ensureStaffIsMutable();
        this.staff_.add(i, staff);
    }

    public static Staffs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Staffs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Staffs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Staffs parseFrom(InputStream inputStream) throws IOException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Staffs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Staffs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Staffs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Staffs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
