package com.alibaba.fastjson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: BL */
/* loaded from: classes.dex */
public class TypeReference<T> {
    protected final Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    public Type getType() {
        return this.type;
    }
}
