package com.fidofi.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** @Auther: fido @Date: 2018/6/7 23:48 @Description: 用来表明线程安全的类或写法 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {
  String value() default "";
}
