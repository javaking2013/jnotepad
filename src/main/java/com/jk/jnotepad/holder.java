package com.jk.jnotepad;

public class holder {
	private static String title = "Jnotepad";
	private static String currentFile = "";
	private static boolean wordwrap = false;
	private static int fontSize = 12;
	private static String fontType = "Courier New";
	private static String fontStyle = "Plain";
	
	public static String getTitle(){return title;}
	public static void setTitle(String inTitle){title = inTitle;}
	
	public static String getCurrentFile(){return currentFile;}
	public static void setCurrentFile(String inCurrentFile){currentFile = inCurrentFile;}
	
	public static boolean isWordWrap(){return wordwrap;}
	public static void setWordWrap(boolean isWordWrap){wordwrap = isWordWrap;}
	
	public static int getFontSize(){return fontSize;}
	public static void setFontSize(int inFontSize){fontSize = inFontSize;}
	
	public static String getFontType(){return fontType;}
	public static void setFontType(String inFontType){fontType = inFontType;}
	
	public static String getFontStyle(){return fontStyle;}
	public static void setFontStyle(String inFontStyle){fontStyle = inFontStyle;}
}
