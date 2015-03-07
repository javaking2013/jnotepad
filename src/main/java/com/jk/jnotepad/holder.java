package com.jk.jnotepad;

public class holder {
	private static String title = "Jnotepad";
	private static String currentFile = "";
	
	public static String getTitle(){return title;}
	public static void setTitle(String inTitle){title = inTitle;}
	
	public static String getCurrentFile(){return currentFile;}
	public static void setCurrentFile(String inCurrentFile){currentFile = inCurrentFile;}
}
