package com.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
/**
 * This annotation is an example, that takes a value as a string and a count as an integer.
 * The idea is for the annotation handler to call the annotated method as many times as the count field is set to.
 */
public @interface MyAnnotation { 

    String value() default "default value"; 

    int count() default 1; 

} 

 