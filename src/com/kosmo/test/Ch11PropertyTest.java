package com.kosmo.test;

import java.util.ArrayList;

public class Ch11PropertyTest {
	public static void main(String[] ase) {
		ArrayList<MemberVO> list= new ArrayList<MemberVO>();
		MemberVO mvo=new MemberVO();
		mvo.setMgubun("User");
		mvo.setMid("Yoon");
		mvo.setMname("Sun1");
		mvo.setMpw("1111");
		mvo.setMseq(1);
		list.add(mvo);
		
		mvo=new MemberVO();
		mvo.setMgubun("User");
		mvo.setMid("Lee");
		mvo.setMname("MinS");
		mvo.setMpw("2222");
		mvo.setMseq(2);
		list.add(mvo);
		for(int i=0;i<list.size();i++) {
			MemberVO aaa =list.get(i);
			System.out.print(aaa.getMgubun()+"\t");
			System.out.print(aaa.getMid()+"\t");	
			System.out.print(aaa.getMname()+"\t");
			System.out.print(aaa.getMpw()+"\t");
			System.out.println(aaa.getMseq());
		}
	}

}
