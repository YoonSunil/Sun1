package com.kosmo.test;
//추상클래스:추상메서드(바디가 없는 클래스)를 포함 할 수도 있다.
//인스턴스(주소)를 생성할 수 없고 상속에 의해서만 메서드/변수 사용 가능
//자식클래스는 반드시 추상메서드를 구현{}해야 한다.
//자식클래스도 추상클래스일경우 구현을 안해도 된다. 다만 왠만해서는 하지 말자
//일부구현을 목적으로함
public abstract class Ch07AbstractClass {
	//추상메서드:메서드 바디가 없다.
	public abstract void absFunc();
	
	public static void main(String[] ase) {
		System.out.println();
	}
	public boolean ipinCheck(String pinNo) {
		return true;
	}
}
