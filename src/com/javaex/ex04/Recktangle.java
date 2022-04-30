package com.javaex.ex04;

public class Recktangle {

	//필드
	private int a;
	private int b;
	
	
	//생성자
	public Recktangle() {}
	
	public Recktangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//메소드 - gs
	
	
	//메소드 - 일반
	public boolean equals(Object obj) {		//집가서 그림그려보기
		Recktangle r = (Recktangle) obj;
		if((this.a == r.a) && (this.b == r.b)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
