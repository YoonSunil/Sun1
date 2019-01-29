package com.kosmo.test;

import java.util.ArrayList;
import java.util.HashMap;

public class Ch02Var {


	static int point=2000;//static 변수
	int point2;//인스턴스 변수
	public static void main(String[] asdf) {
		System.out.println(asdf);

		MethodCommon mc= new MethodCommon();
		String loginRes = mc.login("lee", "111");
		System.out.println(loginRes);
		
		
		int[] nob= {1,2,3};
		mc.ad(nob);
		System.out.println(mc.ad(nob));
		HashMap hs= new HashMap();
		hs.put("key_name","Sum");
		System.out.println(mc.getItembyMap(hs));

		ArrayList list=new ArrayList();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

		int[] ni= {1,2,3,4,5};
		int ind=6;
		int edq=mc.next(ni, ind);
		System.out.println(edq);
	}
}



