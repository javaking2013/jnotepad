package com.jk.jnotepad;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.jk.jnotepad.utility.PrintBean;

public class execute {
	
	public execute() {
		
	}
	
	public static void doit(String value){
		
		if (value.equals("New")){
			main.noteWindow.setText("");
			holder.setCurrentFile("");
			main.f.setTitle(holder.getTitle());
			
		}else if (value.equals("Open...")){
			JFileChooser openFile = new JFileChooser();
			FileFilter ft = new FileNameExtensionFilter("Text Files", "txt");
			openFile.addChoosableFileFilter(ft);
			openFile.showOpenDialog(null);
			File file = openFile.getSelectedFile();
			if(!(file == null)){
				holder.setCurrentFile(file.toString());
				main.noteWindow.setText(getContentsOfFile(holder.getCurrentFile()));
				main.f.setTitle(holder.getTitle() + " - " + holder.getCurrentFile());
			}
			
		}else if (value.equals("Save")){
			if(holder.getCurrentFile().equals("")){
				JOptionPane.showMessageDialog(null,"No file selected.");
			}else{
				saveContentsToFile(holder.getCurrentFile());
			}
			
		}else if (value.equals("Save As")){
			JFileChooser saveFile = new JFileChooser();
			FileFilter ft = new FileNameExtensionFilter("Text Files", "txt");
			saveFile.addChoosableFileFilter(ft);
			saveFile.showSaveDialog(null);
			File save = saveFile.getSelectedFile();
			if(!(save == null)){
				saveContentsToFile(save.toString());
			}
			
		}else if (value.equals("Print")){
			PrintBean printJob = new PrintBean(main.noteWindow);
			printJob.printing();
			
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
			if(!holder.isWordWrap()){
				main.noteWindow.setLineWrap(true);
				main.noteWindow.setWrapStyleWord(true);
				holder.setWordWrap(true);
			}else{
				main.noteWindow.setLineWrap(false);
				main.noteWindow.setWrapStyleWord(false);
				holder.setWordWrap(false);
			}
			
		}else if (value.equals("Font")){
			
		}else if (value.equals("Status Bar")){
			
		}else if (value.equals("View Help")){
			
		}else if (value.equals("About Jnotepad")){
			
		}else if (value.equals("NS Lookup")){
			new com.jk.jnotepad.tools.nslookup();
			
		}else if (value.equals("Increase Font")){
			
		}else if (value.equals("Decrease Font")){
			
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Unhandled... Please open a ticket with https://github.com/javaking2013/jnotepad");
		}
	}
	
	public static String getContentsOfFile(String filename){
		String output = "", line = "";
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			while((line = br.readLine()) != null){
				output += (line + "\n");
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error: " + e.toString());
		}
		return output;
	}
	
	public static void saveContentsToFile(String filename){
		
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			main.noteWindow.write(out);
			out.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error: " + e.toString());
		}
	}
	
	public static String getHighlightedText(){
		String output = "";
		
		return output;
	}
}
