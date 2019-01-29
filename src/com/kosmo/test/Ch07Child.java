package com.kosmo.test;

import com.kosmo.other.Ch07Parent;

public class Ch07Child extends Ch07Parent{

	public void parentPrint() {
		System.out.println("pppp");
	}

	//overriding:오버라이딩
	//메서드의 선언부는 같고 바디를 변경
	//접근제어자는 같거나 커진다
	//예외는 부모의 예외보다 같거나 작아진다
	static int pnum=20;
	public void childFunc() {
		System.out.println("childFunc");
	}
	public static void main(String[] qwe) {
		Ch07Parent p=new Ch07Parent();
		p.parentPrint();
		Ch07Other o= new Ch07Other();
		o.myprint();
		
		System.out.println(o.othernum);
		System.out.println(pnum);
		
		Ch07Child2 c2=new Ch07Child2();
		int res= c2.add();
		System.out.println(res);
	}
}
