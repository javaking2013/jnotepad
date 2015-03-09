package com.jk.jnotepad;

public class holder {
	private static String title = "Jnotepad";
	private static String currentFile = "";
	private static boolean wordwrap = false;
	
	public static String getTitle(){return title;}
	public static void setTitle(String inTitle){title = inTitle;}
	
	public static String getCurrentFile(){return currentFile;}
	public static void setCurrentFile(String inCurrentFile){currentFile = inCurrentFile;}
	
	public static boolean isWordWrap(){return wordwrap;}
	public static void setWordWrap(boolean isWordWrap){wordwrap = isWordWrap;}
}
