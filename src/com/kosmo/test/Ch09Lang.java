package com.kosmo.test;

import java.io.IOException;

public class Ch09Lang {
	public static void main(String[] args) {
		String sss="951548-4215877";
		System.out.println(sss.charAt(1));
		System.out.println(sss.length());
		System.out.println(sss.substring(0, 6));
		System.out.println(sss.concat("주민"));
		System.out.println(sss.indexOf("-"));//찾고자하는 문자의 최초위치를 찾아준다
		System.out.println(sss.lastIndexOf("5"));
		System.out.println(sss.replace("-", "*"));
		String[] aa=sss.split("-");
		System.out.println(aa);
		System.out.println(sss.toLowerCase());
		System.out.println(sss.toUpperCase());
		System.out.println(sss.trim());//공백제거
		
		
		
		
		Ch09Lang ch = new Ch09Lang();
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		String str4=new String("abc");
		
		
		if(str1.equals(str4)) {
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		int a=10;
		String astr= a+"";
		System.out.println(astr+3);
		
		String cname = new Ch09Lang().getClass().toString();
		System.out.println(cname);
		
		String str="aaaa";
		for(int i=0;i<10;i++) {
			str=str+1;
		}
		StringBuffer sb= new StringBuffer("abc");
		sb.append("d");
		System.out.println(sb);
//		스캐너용
//		try {
//			int as = System.in.read();
//			System.out.println(as);
//		} catch (IOException e) {
//			System.out.println("에러남");
//			e.printStackTrace();
//		}
	}

}
