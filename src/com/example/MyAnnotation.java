package com.example;

import java.lang.annotation.*;

  

@Retention(RetentionPolicy.RUNTIME) 

@Target(ElementType.METHOD) 

public @interface MyAnnotation { 

    String value() default "default value"; 

    int count() default 1; 

} 

 