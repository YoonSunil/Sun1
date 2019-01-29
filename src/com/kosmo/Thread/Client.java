package com.kosmo.Thread;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] qwe) {
		try {
			Socket sk= new Socket("192.168.0.108",7777);
			System.out.println("[Client]서버연결성공");
			OutputStream os = sk.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.flush();
			PrintStream out = new PrintStream(os);
			out.println("나다,문열어라");
			System.out.println("=====Done====");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
