package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = p02; // p02의 주소를 p03으로 옮긴다. p02 p03 모두 p02의 주소를 가지고 있음.
		
		
		
		System.out.println(p01.getX());
		//클래스정보보기
		System.out.println(p01.getClass()); // 같은 틀을 썻기때문에 동일결과 출력함.
		System.out.println(p02.getClass());	// 클래스(틀)
		System.out.println("==============================");
		
		// Point 클래스의 부모로 Object클래스를 자동으로 상속한다.
		// Point클래스에서 부모를 넣지않았는데도 getClass를 사용할수있는건 
		// 클래스에서 상속하지않았어도 모든 클래스의 조상은 Object이기 때문에
		// 자동적으로 사용할수 있는것 toString getClass hashCode 등등
		
		//인스턴스의 정보 보기 --> Point의 toString() 재정의 전후 비교
		System.out.println(p01.toString());	//p01과 p02의 매개변수의 값이 다르기 때문에
		System.out.println(p02.toString());	//다른 결과 값 출력
		System.out.println("==============================");
		
		//메모리에 주소값에 대응되는 중복되지 않는 값 
		//객체를 식별하는 하나의 정수값을 의미한다.
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("============hash==================");
		
		System.out.println(p01.equals(p02)); //p01이 가지고 있는 equals를 사용함 여기서 equals는 Object를 자동 상속받은거임
		System.out.println(p02.equals(p01)); //p02이 가지고 있는 equals를 사용함 여기서 equals는 Object를 자동 상속받은거임
		// 두개는 각자 다른 Object의 equals를 두번 사용한것.
		
		System.out.println(p01.equals(p01));
		System.out.println(p02.equals(p03)); //현재 p02와 p03은 같은 주소를 가르키고 있다.
		System.out.println("==============================");
		
		System.out.println(p00.equals(p01)); //매개변수는 타입과 값은 같으나 주소의 값은 다르다. false임.
		System.out.println(p00.equals(p01)); //같은타입으로 하려면 p00에 p01의 equals와 동일하게 만들어줘야한다. 재정의해야함. 오버라이딩 아님.
		
		System.out.println("==============================");
		System.out.println("== 와  equals() 차이점");
		// == 변수의 값이 같은지를 의미한다. (기본자료형일때) == 주소의 값이 같은지를 의미한다. (기본자료형 외 즉 참조자료형) 
		// p00 p01 p02 p03은 기본자료형이 아니다.
		//equals 객체의 주소가 같은지를 의미한다.

		System.out.println(p00 == p01);// f
		System.out.println(p01 == p02);// f
		System.out.println(p02 == p00);// f
		System.out.println(p02 == p03);// t 주소가 같다.
		System.out.println(p00.equals(p01)); //매개변수는 타입과 값은 같으나 주소의 값은 다르다. false임.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
