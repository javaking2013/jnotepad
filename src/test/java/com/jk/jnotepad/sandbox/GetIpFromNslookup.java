package com.jk.jnotepad.sandbox;

import com.jk.jnotepad.utility.getHost;

public class GetIpFromNslookup {
	
	public static void main(String[] args) {
		System.out.println(getHost.byIp("74.125.196.147"));
		System.out.println(getHost.byName("www.google.com"));
	}
}
