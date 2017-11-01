package com.henu.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MessageUtil {
	private static String fileName = "messages.txt";
	private static String path = "/src/";

	public static String readFromFile() {
		StringBuffer sb = null;
		try {
			File file = new File(path + fileName);
			
			if (!file.exists()) {
				file.createNewFile();
				return null;
			}
			
			if(file.canRead()) {
				
				FileInputStream fis = new FileInputStream(file);
				int len;
				byte[] buffer = new byte[1024];
				sb = new StringBuffer();
				while ((len=fis.read(buffer))!=-1) {
					sb.append(new String(buffer, 0, len));
				}
				fis.close();
				return sb.toString();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileName;
	}

	public static void write2File(String msg) {
		try {
			File file = new File(path + fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			
			if(file.canWrite()) {
				FileOutputStream fos = new FileOutputStream(file, true);
				fos.write(msg.getBytes("utf-8"));
				fos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getIPAddress() {
		String ip = null;
		try {
			InetAddress ipv4 = InetAddress.getLocalHost();
			ip = ipv4.getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ip;
	}
}
