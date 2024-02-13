package com.example;

import java.lang.reflect.Method;

/**
 * This class acts like an annotation handler, looking for usages of the {@link MyAnnotation}
 * and outputs its string value as many times as its number values indicates
 */
public class AnnotationExample {

    /**
     * An annotated method to be executed 3 times.
     */
    @MyAnnotation(value = "Hello Annotation!", count = 3)
    public void annotatedMethod() {
        System.out.println("Inside annotated method");
    }


    /**
     * A method handling the locating the annotation and executing the logic for the annotation, by using the Java Reflection API.
     * This in a real world example could be Hibernate locating JPA annotations and handling/creating dynamics implementation for ex. defined repository interfaces.
     *
     */
    public void runAnnotatedMethod() {

        // Make a reference to this current class.
        Class<?> clazz = this.getClass();
        // Find all the methods in this class.
        Method[] methods = clazz.getDeclaredMethods();

        // For each method...
        for (Method method : methods) {
            // Check if it is annotated with the MyAnnotation annotation,
            // if so call the method as many times as the count variable, in the annotation, is set to.
            if (method.isAnnotationPresent(MyAnnotation.class)) {

                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("Value: " + annotation.value());
                System.out.println("Count: " + annotation.count());

                // You can perform any specific actions based on annotation values here.
                int count = annotation.count();

                for (int i = 0; i < count; i++) {

                    try {

                        method.invoke(this);

                    } catch (Exception e) {

                        System.out.println("Failed to call method.");
                        e.printStackTrace();

                    }

                }

            }

        }

    }

}