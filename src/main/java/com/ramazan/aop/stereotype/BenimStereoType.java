package com.ramazan.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Stereotype
@Target({TYPE,METHOD,FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

@Named
@ApplicationScoped

public @interface BenimStereoType {
}
