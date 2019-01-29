package com.kosmo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch15RWTest {
	public static void main(String[] qwe) {
		String src="C:\\Users\\kosmo-09\\eclipse-workspace\\java_prj\\src\\com\\kosmo\\test\\aaa.txt";
		String dest="C:\\Users\\kosmo-09\\eclipse-workspace\\java_prj\\src\\com\\kosmo\\test\\dest";

		InputStream is=null;
		OutputStream os=null;
		FileReader fr= null;
		FileWriter fw= null;
		BufferedReader br=null;
		BufferedWriter bw=null;
//		BufferedInputStream bis=null;
//		BufferedOutputStream bos=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		
		try {
			char[] carr= {'j','a','v','a'};
			int res=0;
			fr = new FileReader(src);
			fw = new FileWriter(dest,true);
			br= new BufferedReader(fr);
			bw= new BufferedWriter(fw);
			br.readLine();
			dis= new DataInputStream(is);
			dos= new DataOutputStream(os);
			int num=0;
			String line=null;
			while(dis.available()>0) {
				System.out.println(num+10);
				dos.write(num);
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
