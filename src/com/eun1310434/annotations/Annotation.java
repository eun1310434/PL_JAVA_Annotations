/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.annotations;
import java.util.Date;
class Annotation_super {
	public void Method_a() { }
	public void Method_b() { }
}
class Annotation_sub extends Annotation_super {
	
	@Override//상위 클래스를 오버라이드 함 표시
	@SuppressWarnings("deprecation")
	public void Method_a() { 
		Date date = new Date();
		date.setYear(2016);
		//deprecation된 메소드를 사용하였기에 
		//@SuppressWarnings("deprecation") 어노테이션 사용
	}
}
public class Annotation {
	public static void main(String[] ar) {
		@SuppressWarnings("unused")//sub 객체를 한번도 사용안함 표시
		Annotation_sub sub = new Annotation_sub();
	}
}
