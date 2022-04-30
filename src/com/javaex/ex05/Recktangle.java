package com.javaex.ex05;

public class Recktangle {

	
	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Recktangle() {}
	
	public Recktangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	//메소드 - gs
	
	
	//메소드 - 일반
	public boolean equlas(Object obj) {
		Recktangle r = (Recktangle) obj;
		
		int result = this.width * this.height;
		int result1 = r.width * r.height;
		
		
		if(result == result1){
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
}
