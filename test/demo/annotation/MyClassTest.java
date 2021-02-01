package demo.annotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyClassTest {
	
	@Test
	void test_myClass_annotation_annotation() {
		
		String value = MyClass.class.getAnnotation( CustomAnnotation.class ).annotationType().getAnnotation( AnnotationAnnotation.class ).value();
		System.out.println( value );
		assertTrue( value.contains( "annotation at annotation level" ) );
		
	}
	
	@Test
	void test_myClass_annotation() {
		
		String value = MyClass.class.getAnnotation( CustomAnnotation.class ).value();
		System.out.println( value );
		assertTrue( value.contains( "annotation at type level" ) );
		
	}
	
	@Test
	void test_myClass_constructorAnnotation() {
		
		String value = ""; 
				
		try {
			
			value = MyClass.class.getConstructor().getAnnotation( CustomAnnotation.class ).value();
			
		} catch (NoSuchMethodException | SecurityException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println( value );
		
		assertTrue( value.contains( "annotation at constructor level" ) );
		
	}
	
	@Test
	void test_myMethod_annotation() {
		
		String value = "";
		try {
			
			value = MyClass.class.getMethod( "myMethod" ).getAnnotation( CustomAnnotation.class ).value();
			
		} catch (NoSuchMethodException | SecurityException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println( value );
		assertTrue( value.contains( "annotation at method level" ) );
		
	}
	
	@Test
	void test_myParameterMethod_annotation() {
		
		String value = "";
		
		try {
			
			value = MyClass.class.getMethod( "myParameterMethod", String.class ).getAnnotation( CustomAnnotation.class ).value();
			
		} catch (NoSuchMethodException | SecurityException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println( value );
		assertTrue( value.contains( "annotation at method level again" ) );
		
	}
	
	@Test
	void test_myParameterMethod_parameterAnnotation() {
		
		String value = "";
		
		try {
			
			value = MyClass.class.getMethod( "myParameterMethod", String.class ).getParameters()[0].getAnnotation( CustomAnnotation.class ).value();
			
		} catch (NoSuchMethodException | SecurityException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println( value );
		
		assertTrue( value.contains( "annotation at parameter level" ) );
		
	}
	
	@Test
	void test_myClassProperty_annotation() {
		
		String value = ""; 
				
		try {
			
			value = MyClass.class.getDeclaredField( "property" ).getAnnotation( CustomAnnotation.class ).value();
			
		} catch (NoSuchFieldException | SecurityException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println( value );
		
		assertTrue( value.contains( "annotation at field level" ) );
		
	}

}
