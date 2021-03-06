package com.kosmo.chat;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class ServerThread implements Runnable {
	Socket sk;
	HashMap map;
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	OutputStream uos;
	PrintStream uout;
	public ServerThread(Socket ss, HashMap mm) {
		this.sk = ss;
		this.map = mm;
		//초기화
		try {
			is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		
		String nickName = "";
		try {
			
			nickName = br.readLine();
			map.put(nickName, sk);
			System.out.println("총 인원:" + map.size());
			HashSet set =(HashSet)map.keySet();
			StringBuffer buffer = new StringBuffer();
			Iterator it = set.iterator();
			while(it.hasNext()) {
				buffer.append(it.next()+"@");
			}
			sendMsgToAll("Right:::"+buffer.toString());
			sendMsgToAll("Left:::"+nickName + "입장");
			
			String nickmsg = "";		
			while( (nickmsg = br.readLine()) != null) {
				System.out.println(nickmsg);
				sendMsgToAll(nickmsg);
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("강제종료");
		} finally {
			map.remove(nickName);			
			System.out.println(nickName + "퇴장");
			sendMsgToAll(nickName + "퇴장");
		}
		
	}
	
	public void sendMsgToAll(String msg) {
		try {
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				Socket usersk = (Socket)map.get(it.next());
				uos = usersk.getOutputStream();
				uout = new PrintStream(uos);
				uout.println(msg);
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}