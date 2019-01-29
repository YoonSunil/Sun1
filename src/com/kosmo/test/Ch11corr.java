package com.kosmo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ch11corr {
	public static void main(String[] asr) {

		int[] numarr= {1,2,3};
		Ch02Var chVar=new Ch02Var();

		ArrayList list= new ArrayList();
		Object[] arr=new Object[5];

		list.add("aa");
		list.add("bb");
		list.add(69);
		list.add(numarr);
		list.add(chVar);

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));		
		}
		System.out.println();
		int aaa=(int)list.get(2);
		System.out.println(aaa);


		HashSet set=new HashSet();
		set.add("1");
		set.add("1");
		set.add("3");
		System.out.println(set);

		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		HashMap map=new HashMap();
		//The method put(Object,Object)
		map.put("name", "YSI");
		map.put("age", "25");
		map.put("arr", "numarr");
		map.put("cls", chVar);
		
		//for문이 의미가 없어진다.

		String mres1=(String)map.get("name");
		System.out.println(mres1);

		
		ArrayList<HashMap<String,Object>> mlist = new ArrayList<HashMap<String,Object>>();
		
		for(int i=0;i<mlist.size();i++) {
			HashMap<String,Object> hmap1= new HashMap<String,Object>();
			hmap1.put("name","lee"+i);
			hmap1.put("age",i+10);
			mlist.add(hmap1);
			System.out.println(mlist.get(i));
		}
		System.out.println("총 회원수"+mlist.size() );
		
		
	}

}
