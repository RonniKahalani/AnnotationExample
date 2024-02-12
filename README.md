# AnnotationExample
This code shows a simple example of creating and handling an annotation.

The annotation takes two arguments, a string and a number. When an instance of the annotation is found, the value and number will be printed once and the annotated method will be called as many times as the number argument is set to, so the method below will be called three times.

@MyAnnotation( value="Example String", number=3)
public exampleMethod() {
...
}
