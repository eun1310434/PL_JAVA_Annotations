/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.annotations;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ClassAnnotation {
	String developer() default "None";
	double version() default 1.0;
}

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MethodAnnotation {
	String name() default "None";
	int[] loops();
}

@ClassAnnotation(developer = "Philips", version = 1.2)
class MyClass {
	
	@MethodAnnotation(name = "Method", loops = {3, 5})
	public void Method() {
		System.out.println("Method() !!!");
	}
	
	@MethodAnnotation(name = "Method2", loops = {2})
	public void Method_02() {
		System.out.println("Method_02() !!!");
	}
}

public class Annotation2 {
	public static void main(String[] ar) {
		MyClass myClass = new MyClass();
		
		ClassAnnotation mca = myClass.getClass().getAnnotation(ClassAnnotation.class);
		System.out.println("developer = " + mca.developer());
		System.out.println("version = " + mca.version());
		
		Method[] methods = myClass.getClass().getDeclaredMethods();
		for(Method method: methods) {
			MethodAnnotation mma = method.getAnnotation(MethodAnnotation.class);
			String name = mma.name();
			int[] array = mma.loops();
			for(int x: array) {
				for(int n = 0; n < x; ++n) {
					System.out.print(name + "\t");
				}
				System.out.println();
			}
		}
	}
}
