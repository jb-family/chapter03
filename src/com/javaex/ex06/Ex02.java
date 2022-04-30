package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd"); 
		String b = new String(",efg "); 
		/*
		System.out.println(a.concat(b));	// concat은 합쳐서 출력되게해줌.
		System.out.println(a+b);			
		*/
		
		a = a.concat(b);	// 의도적으로 값을 변경함		concat기능 찾아서 한번 정확하게 보기
		
		System.out.println(a);
		
		a = a.trim();	// 한칸이 앞으로 당겨짐. trim은 문자열의 공백을 없앤다. 앞뒤 모두 없앤다.
		
		System.out.println(a.trim());
		System.out.println("__"+a+"__");
		
		a = a.replace("ab","12");	//기존 abcd를 12cd로 변경함  글자를 바꿔버린다. 자리수상관없이 바꿈. "ab", "1232143"하면 1232143cd,efg로 변경됨
		
		System.out.println(a);
		
		System.out.println("========================");
		
		String[] sArray = a.split(",");	// 문자열이 쪼개진다. 그래서 배열로 값을 받아야한다. sArray[0] sArray[1] 에 각각 문자열이 쪼개져서 담긴다. 
										// 쪼갤값을 입력받는 문자열로 구분한다. , 있으면 , 으로 쪼개고 .이면 .이있는 문자열대로 나눈다.
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println(a);
		
		System.out.println("========================");
		
		
		String str = "Hello JAVA!";	// 이렇게 약식으로 입력하면 문자 char[] (배열)으로 저장된다.
		String result01 = str.substring(3);	//substring을 입력하면 입력한 번호부터 배열의 마지막번호까지 표현되는 기능이다.
		System.out.println(result01);
		String str1 = "Hello Java";	// 이렇게 약식으로 입력하면 문자 char[] (배열)으로 저장된다.
		String result002 = str1.substring(2, 8);	//substring을 입력하면 입력한 번호부터 배열의 마지막번호까지 표현되는 기능이다.
		System.out.println(result002);
		
		
		
		String result02 = str.substring(1, 7);	// 매개변수의 값을 2개 입력하면 1번배열값부터 7번 전 배열값까지 출력하라는 의미이다. (배열 값 1부터6까지출력한다는의미)
		System.out.println(result02);			// 메소드 오버로딩된거임 substring 메소드 오버로딩은 같은 메소드명을 사용한것임 다만 타입또는 개수와 순서가 달라야사용가능.
		
		char result03 = str.charAt(8);	//  문자열에서 특정 인덱스에 위치하는  유니코드 단일문자를 반환하는 메소드
		System.out.println(result03);
		
		
		
		
		
		
	}
}
