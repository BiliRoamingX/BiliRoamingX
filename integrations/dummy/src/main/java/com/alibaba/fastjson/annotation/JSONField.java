package com.alibaba.fastjson.annotation;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JSONField {
    boolean deserialize() default true;

    String format() default "";

    String name() default "";

    int ordinal() default 0;

    Feature[] parseFeatures() default {};

    boolean serialize() default true;

    SerializerFeature[] serialzeFeatures() default {};
}
