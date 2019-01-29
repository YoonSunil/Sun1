package com.kosmo.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JTextArea;

public class ReadThread  implements Runnable {
	Socket sk;
	BufferedReader br;
	InputStreamReader isr;
	InputStream is;
	JTextArea chatArea;
	ChatLogin chatlogin;
	public ReadThread(Socket sss,JTextArea aaa) {
		this.sk = sss;
		this.chatArea = aaa;
		//초기화
		try {
			is = sk.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	public void run() {
		try {
			String line = "";
			while( (line = br.readLine()) != null) {
				chatArea.append(line+"\n");
//				System.out.println(line);
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}  finally {
			System.out.println("클라이언트 퇴갤....");
			try {
				br.close();
				sk.close();
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
		
	}

}
