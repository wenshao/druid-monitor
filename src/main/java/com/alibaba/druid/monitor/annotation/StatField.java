package com.alibaba.druid.monitor.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface StatField {

    String name() default "";

    /**
     * 描述信息
     * 
     * @return
     */
    String desc() default "";
}
