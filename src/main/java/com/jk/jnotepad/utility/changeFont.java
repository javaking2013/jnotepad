package com.jk.jnotepad.utility;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import com.jk.jnotepad.holder;
import com.jk.jnotepad.main;

public class changeFont {
	
	private static JButton closeButton, setFontButton;
	private static JFrame f;
	private static JScrollPane typePane, stylePane, sizePane;
	private static JList<String> typeList;
	private static JList<Integer> styleList, sizeList;
	private static DefaultListModel<String> typeListModel;
	private static DefaultListModel<Integer> styleListModel, sizeListModel;
	
	public changeFont(){
		showit();
		btnAction();
	}
	
	private static void showit(){
		f = new JFrame("Change Font");
		JPanel p = new JPanel();
		
		closeButton = new JButton("Close");
		setFontButton = new JButton("Set Font");
		
		typeListModel = new DefaultListModel<String>();
		styleListModel = new DefaultListModel<Integer>();
		sizeListModel = new DefaultListModel<Integer>();
		
		typeListModel.addElement("Courier New");
		
		styleListModel.addElement(Font.PLAIN);
		styleListModel.addElement(Font.BOLD);
		styleListModel.addElement(Font.ITALIC);
		
		sizeListModel.addElement(12);
		sizeListModel.addElement(14);
		sizeListModel.addElement(16);
		sizeListModel.addElement(24);
		sizeListModel.addElement(36);
		sizeListModel.addElement(42);
		
		typeList = new JList<String>(typeListModel);
		typeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		styleList = new JList<Integer>(styleListModel);
		styleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sizeList = new JList<Integer>(sizeListModel);
		sizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		typePane = new JScrollPane(typeList);
		typePane.setPreferredSize(new Dimension(100,80));
		stylePane = new JScrollPane(styleList);
		stylePane.setPreferredSize(new Dimension(100,80));
		sizePane = new JScrollPane(sizeList);
		sizePane.setPreferredSize(new Dimension(50,80));
		
		p.add(new JLabel("Font Type"));
		p.add(new JLabel("Font Style"));
		p.add(new JLabel("Font Size"));
		p.add(typePane);
		p.add(stylePane);
		p.add(sizePane);
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
				if(typeList.getSelectedValue() != null){
					holder.setFontType(typeList.getSelectedValue());
				}
				if(styleList.getSelectedValue() != null){
					holder.setFontStyle(styleList.getSelectedValue());
				}
				if(sizeList.getSelectedValue() != null){
					holder.setFontSize(sizeList.getSelectedValue());
				}
				
				Font font = new Font(holder.getFontType(),
						holder.getFontStyle(), holder.getFontSize());
				main.noteWindow.setFont(font);
				f.dispose();
			}
		});
	}
}
