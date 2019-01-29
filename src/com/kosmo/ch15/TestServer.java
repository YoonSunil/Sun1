package com.kosmo.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] qwe) {
	try {
		ServerSocket ss= new ServerSocket(7777);
		System.out.println("서버실행");
		while(true) {
			System.out.println("대기중");
			Socket sk= ss.accept();
			System.out.println("클라이언트접속");
			InputStream is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line="";
			while((line=br.readLine())!= null)
				System.out.println("서버가 읽은 값..."+line);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Client Lost");
	}
	}
}