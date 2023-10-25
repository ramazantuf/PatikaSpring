package com.ramazan.aop.interceptor;

import javax.interceptor.InterceptorBinding;
import javax.interceptor.Interceptors;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
@InterceptorBinding
@Inherited
@Target({TYPE,METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InterceptorYolKesici {

}
