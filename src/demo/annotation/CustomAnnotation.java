package demo.annotation;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

@Documented
@Target({TYPE, CONSTRUCTOR, METHOD, FIELD, PARAMETER, ANNOTATION_TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@AnnotationAnnotation(value="annotation at annotation level")
public @interface CustomAnnotation {

	String value() default "default";
	
}
