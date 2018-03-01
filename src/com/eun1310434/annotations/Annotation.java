/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���, https://programmers.co.kr
*/
package com.eun1310434.annotations;
import java.util.Date;
class Annotation_super {
	public void Method_a() { }
	public void Method_b() { }
}
class Annotation_sub extends Annotation_super {
	
	@Override//���� Ŭ������ �������̵� �� ǥ��
	@SuppressWarnings("deprecation")
	public void Method_a() { 
		Date date = new Date();
		date.setYear(2016);
		//deprecation�� �޼ҵ带 ����Ͽ��⿡ 
		//@SuppressWarnings("deprecation") ������̼� ���
	}
}
public class Annotation {
	public static void main(String[] ar) {
		@SuppressWarnings("unused")//sub ��ü�� �ѹ��� ������ ǥ��
		Annotation_sub sub = new Annotation_sub();
	}
}
