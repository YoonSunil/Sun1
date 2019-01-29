package com.kosmo.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class NetClassTest {
	public static void main(String[] ase) {
//		InetAddress net;
//		try {
//			net= InetAddress.getLocalHost();
//			String addr=net.getHostAddress();
//			String host = net.getHostName();			
//			System.out.println(addr+"\t"+host);
//		}catch(UnknownHostException e){	
//			
//		}
		try {
			URL url = new URL("http://www.google.com");
			InputStream is= url.openStream();
			InputStreamReader isr= new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String wwe ="";
			while((wwe=br.readLine())!=null) {
				System.out.println(wwe);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void whlie(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
