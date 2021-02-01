package demo.annotation;

/**
 * Uses ElementType.TYPE annotation target
 * @author Sweet
 *
 */
@CustomAnnotation(value="annotation at type level")
public class MyClass {
	
	/**
	 * Uses ElementType.FIELD annotation target
	 */
	@CustomAnnotation(value="annotation at field level")
	private int property;
	
	/**
	 * Uses ElementType.CONSTRUCTOR annotation target
	 */
	@CustomAnnotation(value="annotation at constructor level")
	public MyClass() {
		
	}
	
	/**
	 * Uses ElementType.METHOD annotation target
	 */
	@CustomAnnotation(value="annotation at method level")
	public void myMethod() {
		
	}
	
	/**
	 * @param parameter Uses ElementType.PARAMETER annotation target
	 */
	@CustomAnnotation(value="annotation at method level again")
	public void myParameterMethod( @CustomAnnotation(value="annotation at parameter level") String parameter) {
		
	}

}
