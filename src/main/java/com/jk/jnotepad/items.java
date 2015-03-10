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
	
	public static JButton getToolMenuItem(String imageName, final String toolTipText){
		JButton button = new JButton(toolTipText);
		
		//button.setActionCommand(actionCommand);
	    button.setToolTipText(toolTipText);
	    button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				execute.doit(toolTipText);
			}
		});
	    //button.setIcon(new ImageIcon("images/" + imageName + ".jpg", altText));
		
		return button;
	}
}
