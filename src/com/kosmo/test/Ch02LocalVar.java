package com.kosmo.test;

import java.util.HashMap;

public class Ch02LocalVar {
	int a=400;
	String nation="korea";
	//get+변수명
	//전역변수값리턴
	public static void main(String[] asd) {
		MethodCommon mc=new MethodCommon();
		System.out.println(mc.getPoint());

		System.out.println(mc.getNation());

		String we=mc.getValueByMap("key_name");	
		System.out.println(we);

		for(int i=1;i<27;i++) {
			if(i<7) {
				System.out.print(i+"\t");}
			else if(i==7){
				System.out.println();
			}else if(10<i && i<17) {
				System.out.print(i+"\t");
			}else if(i==17) {
				System.out.println();
			}else if(20<i) {
				System.out.print(i+"\t");
			}
		}

	}


}
