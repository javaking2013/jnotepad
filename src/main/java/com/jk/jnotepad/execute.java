package com.jk.jnotepad;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class execute {
	
	public execute() {
		
	}
	
	public static void doit(String value){
		
		if (value.equals("New")){
			
		}else if (value.equals("Open...")){
			JFileChooser openFile = new JFileChooser();
			FileFilter ft = new FileNameExtensionFilter("Text Files", "txt");
			openFile.addChoosableFileFilter(ft);
			openFile.showOpenDialog(null);
			File file = openFile.getSelectedFile();
			main.noteWindow.replaceSelection(getContentsOfFile(file.toString()));
			
		}else if (value.equals("Save")){
			
		}else if (value.equals("Save As")){
			
		}else if (value.equals("Page Setup")){
			
		}else if (value.equals("Print")){
			
		}else if (value.equals("Exit")){
			System.exit(0);
			
		}else if (value.equals("Undo")){
			
		}else if (value.equals("Cut")){
			
		}else if (value.equals("Copy")){
			
			String selection = main.noteWindow.getSelectedText();
            StringSelection data = new StringSelection(selection);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(data, data);
            
		}else if (value.equals("Paste")){
			
			final Clipboard clipboard = main.f.getToolkit().getSystemClipboard();
			 
            Transferable clipData = clipboard.getContents(clipboard);
            if (clipData != null) {
              try {
                if (clipData.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                  String s = (String)(clipData.getTransferData(
                    DataFlavor.stringFlavor));
                  main.noteWindow.replaceSelection(s);
                }
              } catch (UnsupportedFlavorException ufe) {
                //System.err.println("Flavor unsupported: " + ufe);
              } catch (IOException ioe) {
                //System.err.println("Data not available: " + ioe);
              }
            }
		}else if (value.equals("Delete")){
			
		}else if (value.equals("Find")){
			
		}else if (value.equals("Find Next")){
			
		}else if (value.equals("Replace")){
			
		}else if (value.equals("Go To")){
			
		}else if (value.equals("Select All")){
			
		}else if (value.equals("DateTime")){
			
		}else if (value.equals("Word Wrap")){
			
		}else if (value.equals("Font")){
			
		}else if (value.equals("Status Bar")){
			
		}else if (value.equals("View Help")){
			
		}else if (value.equals("About Jnotepad")){
			
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Unhandled... Please open a ticket");
		}
	}
	
	public static String getContentsOfFile(String filename){
		String output = "";
		
		try{
			BufferedReader reader = new BufferedReader(null);
		}catch(Exception e){
			
		}
		
		return output;
	}
}
