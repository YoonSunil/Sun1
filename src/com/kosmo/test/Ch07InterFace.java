package com.kosmo.test;

public interface Ch07InterFace extends Ch07InterFaceParent {
	//인터페이스에 오는 모든 변수는 public final static 이 따라붙는다.
	//상수만 올 수 있다.
	//상수는 반드시 대문자를 써 줄것
	int NUM =100;
	//모든 메서드는 추상(바디가 없는) 메서드여야만 한다.
	//public void myPrint() {}
	void myPrint();
	int sendEmail(String email);
	
}
