package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj.getClass());	//클래스 정보
		System.out.println(obj.hashCode());	//일단 주소라고 알고 있자.
		System.out.println(obj.toString());	//java.lang.Object@515f550a
		System.out.println(obj.equals(obj));//문자열 비교 문자열이 같은지
		System.out.println("============================\n");
		
		System.out.println("obj.getClass()====================");
		System.out.println(obj.getClass());
		
		System.out.println("obj.hashCode()====================");
		//메모리의 주소값에 대응되는 중복되지 않는 값
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		
		System.out.println("obj.toString()====================");
		//객체의 값 정보를 문자열로 리턴
		System.out.println(obj.toString());

		//Object클래스의 equals()는 객체의 주소를 비교한다.
		System.out.println("obj.equals()====================");
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj02));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
