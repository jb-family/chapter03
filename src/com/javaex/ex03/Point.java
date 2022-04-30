package com.javaex.ex03;

public class Point {
	
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point () {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//메소드 - gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드 - 일반
	// equals 메소드는 타입이 Object로 되어있음. 왜냐하면 누가올지모르기 때문에 모든 조상의 타입인 Object로 놓은것
	public boolean equals (Object obj) {
		Point p = (Point) obj;	// (Point) obj 는 모든 Point클래스의 obj 즉 Object의 obj를 재 정의하는것임  Object를 Point로 다운캐스팅 해주는것임.  
								// 그렇다면 모든 Point클래스의 obj는 -> 모든 Point클래스의 p로 재정의 되는것. 
								//집가서 그림그려보기
		if((this.x == p.x) && (this.y == p.y)) {
			return true;
		}else {
			return false;
		}
		
	}
}
