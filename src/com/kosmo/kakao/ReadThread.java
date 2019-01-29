package com.kosmo.kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread implements Runnable {
	Socket sk;
	BufferedReader br;
	InputStreamReader isr;
	InputStream is;
	public ReadThread(Socket sss) {
		this.sk = sss;
		//초기화
		try {
			is = sk.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			String line = "";
			while( (line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}  finally {
			System.out.println("클라이언트 퇴장....");
			try {
				br.close();
				sk.close();
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
		
	}

}
