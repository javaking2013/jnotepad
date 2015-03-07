package com.jk.jnotepad;
import java.awt.event.*;
import javax.swing.*;

public class items {
	
	public items(){
		
	}
	
	public static JMenuItem getMenuItem(final String value){
		JMenuItem item = new JMenuItem(value);
		
		item.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				execute.doit(value);
			}
		});
		return item;
	}
}
