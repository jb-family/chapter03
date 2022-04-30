package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(2, 3);
		Point p02 = new Point(2, 3);
		Point p03 = new Point(2, 2);
		Point p04 = p01;
		
		
		System.out.println(p01 == p02);	// 부모메소드equals사용 (Object 클래스)
		
		System.out.println(p01.equals(p02));	//논리비교	자식메소드equals사용
		System.out.println(p02.equals(p01));	//논리비교	자식메소드equals사용
		System.out.println(p01.equals(p03));	//논리비교	자식메소드equals사용
		System.out.println(p02.equals(p03));	//논리비교	자식메소드equals사용
		
		System.out.println(p01 == p04);
		System.out.println(p01.equals(p04));	// t 객체의 주소가 같기때문.
		
		
		
		
	}

}
