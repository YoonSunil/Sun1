package com.kosmo.test;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodCommon {
	
	/**
	 * 메서드 호출관련파일
	 * 힘들었는데 재미있었당
	 * 
	 */
	int point =50000; //프로퍼티 property 전역변수
	String nation="korea";
	//get+변수명
	//전역변수값리턴
	/**
	 * 인트 @point 를 받아서 숫자출력
	 * 스트링 @nation 을 받아서 국가명출력
	 * @return
	 */
	public Object getPoint() {
		return this.point;
	}
	public Object getNation() {
		return this.nation;
	}
	//입력받은 파라미터값을 전역변수에 넣어주는 메서드 set+변수명을 만들어라

	public void setPoint(int a) {
		this.point= a;
	}
	//오버로딩(Overloading):하나의 클래스안에서 여러개의 메서드를 비교했을때 이름이같고,매개변수의 타입이 다른것
	//스태틱끼리 호출하는법
	//1.static static
	//클래스이름.메서드명
	//(해당클래스의 클래스명.)메서드명
	public double add(double a,double b) {
		return a+b;
	}

	//int[]을 입력받아서 3번째 값을 리턴하는 getitem이란 메서드 생성

	public int ad(int[] sun) {
		return sun[2];

	}

	//HashMap을 파라미터로받아 키값이 key_name인 값을 리턴
	//getItembyMap 메서드 생성

	public String getItembyMap(HashMap hs) {
		return (String)hs.get("key_name");

	}
	//문자열 배열을 파라미터로 받아
	//ArrayList로 변환해서 그 ArrayList 리턴
	//메서드명: convertArrayList
	public ArrayList convertArrayList(String[] as) {
		ArrayList list=new ArrayList();
		for(int i=0;i<as.length;i++) {
			list.add(as[i]); 
		}
		return list;
	}

	//배열의 인덱스를 파라미터로 받아
	//그 인덱스의 다음데이터를 리턴하는
	//next메서드를 생성
	public int next(int[] a,int b) {
		int res=-1;
		if(b+1<a.length)
			return a[b+1];
		else
			return res;

	}
	//사용자로부터 아이디,비밀번호를 입력받아 이름을 리턴하는 login메서드 생성
	/**
	 * 칭찬받은 메서드이다
	 * 솔까 잘했음
	 * @param id
	 * @param pw
	 * @return
	 */
	public String login(String id, String pw) {
		
		DBTest db = new DBTest();
		MemberVO vo = db.searchMember(id, pw);
		//if(a=="name" && b==1111) {
		if(vo.getMname() != null ) {
			return "로그인성공" ;
		} else {
			return "없는회원";
		}
	}

	HashMap map= new HashMap();
	//생성자:클래스이름과 동일한 메서드
	//	  :리턴이 없다. void xxx..2단구성
	//    :컴파일러는 해당 클래스 컴파일 시 생성자가 단 한개도 없을경우 기본생성자를 만들어 준다.
	//기본생성자 함수=constructor
	//초기화****
	public MethodCommon() {
		map.put("key_id", "Sun");
		map.put("key_pw", "1234");
		map.put("key_name", "윤씨");
	}
	//파라미터가 있는 생성자
	//매개변수가 있는 생성자
	
	
	//맵의 키값을 파라미터로 받아서 해당 키의 값을 리턴하는 getValueByMap 메서드를 생성
	public String getValueByMap(String map) {
		String value = (String)this.map.get(map);
		return value;
	}
	
	
	
	
}
