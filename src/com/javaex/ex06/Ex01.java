package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01 == s02);
		
		System.out.println("==================================");
		
		String s03 = "하이";	// new 연산자 사용안하고 약식으로 사용하는경우 첫번째 s03은 Object에 없기때문에 객체를 생성한다. 
		String s04 = "하이";	// 똑같은 문자열이 있다면 객체생성안함. 그래서 같은문자열이기 때문에 객체를 같은 곳으로 바라본다. 즉 s03과 s04는 같은 주소를 가지고 있음. 
								// 약식으로 String s03 = "하이" 라고 하는 참조변수는 한번 생성하면 주소를 바꿀수없음.
								// 다만 String s01 = new String (); 으로 사용하는경우 애초에 새로 만들기때문에 주소값을 새로 만들지 않는다.
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);
		
		s03 = "하이하이";	// 위에있던 s03이 없어지는게 아니라 s03에 하이하이라는 문자열을 새로 메모리를 저장할 공간을 만든다. 그래서 s03과 s04는 다르다고 나오는것이다.
							// 처음선언된 s03이 바뀌는게 아니라 새로운 s03이 만들어지는 것.
		System.out.println(s03.toString());		 
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);//그렇기 때문에 false로 바뀌게 된다.
		
	}

}
