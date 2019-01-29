package com.kosmo.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class TestServer {
	public static void main(String[] args) {
		Socket  sk = null;
		HashMap<String, Socket> map = new HashMap<String, Socket>();
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 실행....");
			
			while(true) {
				System.out.println("대기중.......");
				sk = ss.accept();
				System.out.println("클라이언트 접속...."); 
				
				
				ServerThread read = new ServerThread(sk,map);
				Thread t = new Thread(read);
				t.start();
				
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("급작스런 클라이언트 퇴장....");
		} 

	}
}
