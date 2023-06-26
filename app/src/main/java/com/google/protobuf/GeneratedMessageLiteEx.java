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
            newFields.storeField(k, v);
        }
        return newFields;
    }
}
