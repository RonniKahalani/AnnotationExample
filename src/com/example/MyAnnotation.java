package com.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
/**
 * This annotation is an example, that takes a string and a number.
 * The idea is for the annotation handler to output the string as many times as the number indicated.
 */
public @interface MyAnnotation { 

    String value() default "default value"; 

    int count() default 1; 

} 

 