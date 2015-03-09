package com.jk.jnotepad.utility;

import java.net.InetAddress;

public class getHost {
	
	public static String byIp(String input){
		String output = "";
		try{
			InetAddress inetAddress = InetAddress.getByName(input);
			output = inetAddress.getHostName();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return output;
	}
	
	public static String byName(String input){
		String output = "";
		try{
			InetAddress inetAddress = InetAddress.getByName(input);
			output = inetAddress.getHostAddress();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return output;
	}
}
