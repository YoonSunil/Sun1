package com.kosmo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ch14InputStreamTest {
	public static void main(String[] qwe) {
		String src="C:\\Users\\kosmo-09\\eclipse-workspace\\java_prj\\src\\com\\kosmo\\test\\object.txt";
		FileInputStream fis = null;
		ObjectInputStream ois =null;

		try {
			fis = new FileInputStream(src);
			ois = new ObjectInputStream(fis);


			ArrayList<String> res =(ArrayList<String>)ois.readObject();
			MemberVO res2= (MemberVO)ois.readObject();
			System.out.println(res.size());
			System.out.println(res2.getMpw());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		} catch (IOException e) {
			e.printStackTrace();
		}finally 		{
			if(ois!=null)
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("----Read done----");
	}
}

