package com.kosmo.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ch14OutputStreamTest {
	public static void main(String[] qwe) {
		String src="C:\\Users\\kosmo-09\\eclipse-workspace\\java_prj\\src\\com\\kosmo\\test\\object.txt";
		FileOutputStream fos=null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(src);
			oos = new ObjectOutputStream(fos);

//			ArrayList<String> list = new ArrayList<String>();
//			list.add("aa");
//			list.add("bb");
//			list.add("cc");
			Ch99JDBCImpl t = new Ch99JDBCImpl();
			ArrayList<EmpVO> list = t.empList();
			MemberVO vo = new MemberVO();
			vo.setMid("lee");
			vo.setMpw("9999");
			
			oos.writeObject(list);
			oos.writeObject(vo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		} catch (IOException e) {
			e.printStackTrace();
		}finally 		{
			if(oos!=null)
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("----Write done----");
	}
}
