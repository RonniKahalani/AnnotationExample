package com.example;

import java.lang.reflect.Method;



public class AnnotationExample {



    @MyAnnotation(value = "Hello Annotation!", count = 3)

    public void annotatedMethod() {

        System.out.println("Inside annotated method");

    }



    public static void main(String[] args) {

        AnnotationExample example = new AnnotationExample();

        example.runAnnotatedMethod();

    }



    public void runAnnotatedMethod() {

        Class<?> clazz = this.getClass();



        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(MyAnnotation.class)) {

                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

                System.out.println("Value: " + annotation.value());

                System.out.println("Count: " + annotation.count());



                // You can perform any specific actions based on annotation values here

                int count = annotation.count();

                for (int i = 0; i < count; i++) {

                    try {

                        method.invoke(this);

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                }

            }

        }

    }

}