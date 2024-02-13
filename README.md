# AnnotationExample
This code shows a simple example of creating and handling an annotation.

The annotation takes two arguments, a string and a number. 

When an instance of the annotation is found, the value and count will be printed once and the annotated method will be called as many times as the count argument is set to.

So the method below will be called three times.
```
@MyAnnotation( value="Example String", count=3 )
public exampleMethod() {
  System.out.println( "Inside annotated method" );
}
```
This will print:
```
Value: Example String
Count: 3
Inside annotated method
Inside annotated method
Inside annotated method
```
