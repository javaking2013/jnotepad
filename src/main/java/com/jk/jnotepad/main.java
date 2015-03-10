package com.jk.jnotepad;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class main {
	
	public static JFrame f;
	public static JScrollPane p;
	public static JTextArea noteWindow;
	static JMenuBar menuBar;
	JMenu file, edit, format, view, help, tools;
	
	public main(){
		showit();
		btnAction();
	}
	
	public void showit(){
		
		f = new JFrame();
		
		noteWindow = new JTextArea();
		
		p = new JScrollPane(noteWindow);
		
		/* set up menu bar */
		menuBar = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		view = new JMenu("View");
		help = new JMenu("Help");
		tools = new JMenu("Tools");
		
		/* Add menus to top bar */
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		menuBar.add(view);
		menuBar.add(help);
		menuBar.add(tools);
		
		/* Add menus to FILE menu */
		file.add(items.getMenuItem("New"));
		file.add(items.getMenuItem("Open..."));
		file.add(items.getMenuItem("Save"));
		file.add(items.getMenuItem("Save As"));
		file.addSeparator();
		file.add(items.getMenuItem("Print"));
		file.addSeparator();
		file.add(items.getMenuItem("Exit"));
		
		/* add menus to EDIT menu */
		edit.add(items.getMenuItem("Undo"));
		edit.addSeparator();
		edit.add(items.getMenuItem("Cut"));
		edit.add(items.getMenuItem("Copy"));
		edit.add(items.getMenuItem("Paste"));
		edit.add(items.getMenuItem("Delete"));
		edit.addSeparator();
		edit.add(items.getMenuItem("Find"));
		edit.add(items.getMenuItem("Find Next"));
		edit.add(items.getMenuItem("Replace"));
		edit.add(items.getMenuItem("Go To"));
		edit.addSeparator();
		edit.add(items.getMenuItem("Select All"));
		edit.add(items.getMenuItem("DateTime"));
		
		/* add menus to FORMAT menu */
		format.add(items.getMenuItem("Word Wrap"));
		format.add(items.getMenuItem("Font"));
		
		/* add menus to VIEW menu */
		view.add(items.getMenuItem("Status Bar"));
		
		/* add menus to HELP menu */
		help.add(items.getMenuItem("View Help"));
		help.add(items.getMenuItem("About Jnotepad"));
		
		/* add menus to TOOLS menu */
		tools.add(items.getMenuItem("NS Lookup"));

		JToolBar toolbar = new JToolBar("jnotepad toolbar");
		toolbar.setFloatable(false);
		
		toolbar.add(items.getToolMenuItem("exit", "Exit"));
		toolbar.addSeparator();
		toolbar.add(new JTextField(10));
		
		ImageIcon img = new ImageIcon("");
		
		/* set up jframe */
		f.setJMenuBar(menuBar);
		f.add(toolbar, BorderLayout.PAGE_START);
		f.setTitle(holder.getTitle());
		f.add(p);
		f.setResizable(true);
		f.setSize(900,600);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setIconImage(img.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        f.getRootPane().getInputMap(JRootPane.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), "f5");
        f.getRootPane().getActionMap().put("f5", new AbstractAction() {
			private static final long serialVersionUID = 3184570298404185490L;
			public void actionPerformed(ActionEvent e) {
            	   JOptionPane.showMessageDialog(null,"Congratulations");
                     //display.hotKey.execute("F5");
               }
        });
	}
	
	public static void btnAction(){
		
	}
}

class PopupListener extends MouseAdapter {
    public void mouseReleased(MouseEvent e) {
       if (e.isPopupTrigger()) {
              if(e.getComponent() == main.noteWindow){
                     //main.menuBar.show(e.getComponent(), e.getX(), e.getY());
              }
        }
    }
}
