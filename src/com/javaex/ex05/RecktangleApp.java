package com.javaex.ex05;

public class RecktangleApp {

	public static void main(String[] args) {

		Recktangle a = new Recktangle(6,4);		//24
		Recktangle b = new Recktangle(6,4);		//24
		Recktangle c = new Recktangle(12,2);	//24
		Recktangle d = new Recktangle(3,8);		//24
		Recktangle e = new Recktangle(12,4);	//48
		
		System.out.println(a.equlas(b));	//t 24 24
		System.out.println(a.equlas(c));	//t 24 24
		System.out.println(a.equlas(d));	//t 24 24
		System.out.println(a.equlas(e));	//f 24 48
		System.out.println(d.equlas(e));	//f 24 48
		
		
		
	}

}
