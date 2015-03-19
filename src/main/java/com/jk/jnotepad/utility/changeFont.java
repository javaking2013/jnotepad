package com.jk.jnotepad.utility;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jk.jnotepad.holder;

public class changeFont {
	
	private static JButton closeButton, setFontButton;
	private static JFrame f;
	
	public changeFont(){
		showit();
		btnAction();
	}
	
	private static void showit(){
		f = new JFrame("Change Font");
		JPanel p = new JPanel();
		
		closeButton = new JButton("Close");
		setFontButton = new JButton("Set Font");
		
		// 3 types of font = style, appearance, size
		
		p.add(setFontButton);
		p.add(closeButton);
		
		f.add(p);
		f.setResizable(true);
		f.setSize(400,300);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private static void btnAction(){
		closeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f.dispose();
			}
		});
		
		setFontButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				
				Font f = new Font("Courier New", Font.PLAIN, holder.getFontSize());
			}
		});
	}
}
