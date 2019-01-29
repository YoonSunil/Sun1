package com.kosmo.gui.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GoogleMapIOTest {
	
	public String createMapJpg() {
		String jpgPath = "c:\\down\\map.jpg";
		File f = new File(jpgPath);
		FileOutputStream fos = null;
		InputStream is = null;
		String urlStr = "https://maps.googleapis.com/maps/api/staticmap?center=가산동&zoom=16&size=800x600&maptype=roadmap&key=AIzaSyBh1ho9DaLCmzZ5-2kG0A2cIJWzNIo2noY"+ 
						"&key=AIzaSyBI2byVtSBPmYJELLJBJdBdF5jCXPAH_wo";
		try {
			fos = new FileOutputStream(f);
			URL url = new URL(urlStr);
			URLConnection conn = url.openConnection();
			is = conn.getInputStream();
			 
			int data = 0;
			while((data=is.read()) != -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (MalformedURLException e2) {
			e2.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		} finally {
			try {
				fos.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("============done===============");
		return jpgPath;
	}

}
