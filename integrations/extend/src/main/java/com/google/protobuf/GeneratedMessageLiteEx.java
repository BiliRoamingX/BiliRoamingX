package com.google.protobuf;

import android.util.SparseArray;

public class GeneratedMessageLiteEx {
    public static void setUnknownFields(GeneratedMessageLite<?, ?> messageLite, UnknownFieldSetLite unknownFields) {
        messageLite.unknownFields = unknownFields;
    }

    public static UnknownFieldSetLite getUnknownFields(GeneratedMessageLite<?, ?> messageLite) {
        return messageLite.unknownFields;
    }

    public static void mergeUnknownFields(GeneratedMessageLite<?, ?> messageLite, UnknownFieldSetLite fields) {
        messageLite.mergeUnknownFields(fields);
    }

    public static UnknownFieldSetLite newUnknownFields(SparseArray<Object> fields) {
        return newUnknownFields(null, fields);
    }

    public static UnknownFieldSetLite newUnknownFields(UnknownFieldSetLite original, SparseArray<Object> fields) {
        UnknownFieldSetLite newFields = UnknownFieldSetLite.newInstance();
        if (original != null)
            newFields.mergeFrom(original);
        for (int i = 0; i < fields.size(); i++) {
            int k = fields.keyAt(i);
            Object v = fields.valueAt(i);
            Object value;
            int wireType;
            if (v instanceof Boolean || v instanceof Integer || v instanceof Long || v instanceof java.lang.Enum) {
                wireType = WireFormat.WIRETYPE_VARINT;
                if (v instanceof Boolean bool) {
                    value = bool ? 1L : 0L;
                } else if (v instanceof Integer integer) {
                    value = integer.longValue();
                } else if (v instanceof java.lang.Enum<?> jEnum) {
                    value = (long) jEnum.ordinal();
                } else {
                    value = v;
                }
            } else if (v instanceof Float jFloat) {
                wireType = WireFormat.WIRETYPE_FIXED32;
                value = Float.floatToIntBits(jFloat);
            } else if (v instanceof Double jDouble) {
                wireType = WireFormat.WIRETYPE_FIXED64;
                value = Double.doubleToLongBits(jDouble);
            } else if (v instanceof String || v instanceof ByteString || v instanceof MessageLite) {
                wireType = WireFormat.WIRETYPE_LENGTH_DELIMITED;
                if (v instanceof String string) {
                    value = ByteString.copyFromUtf8(string);
                } else if (v instanceof MessageLite messageLite) {
                    value = messageLite.toByteString();
                } else {
                    value = v;
                }
            } else if (v instanceof UnknownFieldSetLite) {
                wireType = WireFormat.WIRETYPE_START_GROUP;
                value = v;
            } else {
                throw new RuntimeException(String.format("unsupported value: %s, filedNumber: %d", v, k));
            }
            int tag = k << 3 | wireType/*WireFormat.makeTag(k, wireType)*/;
            newFields.storeField(tag, value);
        }
        return newFields;
    }
}
