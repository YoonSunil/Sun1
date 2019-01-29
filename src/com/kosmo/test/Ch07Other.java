package com.kosmo.test;
import com.kosmo.other.Ch07Parent;
public class Ch07Other extends Ch07Parent {
	//public -아무나
	//protected - 같은 패키지,다른패키지 자손은 허용
	//(default공백 안쓴거) -같은 패키지
	//private:해당클래스내에서만
	
	static int othernum;
	
	public void myprint() {
		System.out.println("dddd");
	}
	public static void main(String[] ase) {
		Ch07Child c=new Ch07Child();
		System.out.println(c.cpoint);
		c.parentPrint();
		//다형성:메서드-오버라이딩된 자식 메서드만 호출가능
		//	      변수-부모꺼만 호출가능
		//부모타입의 변수에 자식 인스턴스(주소)를 할당
		//Parent p=new Child();
		Ch07Parent pc=new Ch07Parent();
		System.out.println(pc.ppoint);
		pc.parentPrint();
		c.childFunc();
		//Ch07Child cp = new Ch07Parent();
		//자식이 부모보다 메서드가 같거나 많아서 안된다 이말이야
		
	}
	
}
