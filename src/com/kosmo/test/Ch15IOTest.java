package com.kosmo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch15IOTest {
	public static void main(String[] args) {
		String src="C:\\Users\\kosmo-09\\eclipse-workspace\\java_prj\\src\\com\\kosmo\\test\\aaa.txt";
		String dest="C:\\Users\\kosmo-09\\eclipse-workspace\\java_prj\\src\\com\\kosmo\\test\\dest";
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis =new FileInputStream(src);
			int res = fis.read();
			while((res= fis.read()) != -1) {
			System.out.println((char)res);
			}
			byte[] b= {'A','I','R','P','L','A','N','E'};
			fos =new FileOutputStream(dest);
			fos.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
