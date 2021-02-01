package demo.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ANNOTATION_TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationAnnotation {

	String value() default "default";
	
}
