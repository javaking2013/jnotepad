package com.jk.jnotepad.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jk.jnotepad.utility.getHost;

public class nslookup {
	
	JButton submitIP, submitName;
	JLabel answer;
	JTextField ip1, ip2, ip3, ip4, nameField;
	
	public nslookup(){
		showit();
		btnAction();
	}
	
	public void showit(){
		JFrame f = new JFrame("");
		
		JPanel p = new JPanel();
		
		ip1 = new JTextField(3);
		ip2 = new JTextField(3);
		ip3 = new JTextField(3);
		ip4 = new JTextField(3);
		nameField = new JTextField(10);
		
		submitIP = new JButton("Find Name");
		submitName = new JButton("Find IP");
		
		answer = new JLabel();
		
		p.add(new JLabel("Enter IP Address:"));
		p.add(ip1);
		p.add(new JLabel("."));
		p.add(ip2);
		p.add(new JLabel("."));
		p.add(ip3);
		p.add(new JLabel("."));
		p.add(ip4);
		p.add(submitIP);
		p.add(new JLabel("Enter Name:"));
		p.add(nameField);
		p.add(submitName);
		p.add(answer);
		
		f.add(p);
		f.setResizable(false);
		f.setSize(325,200); // width, height
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void btnAction(){
		submitIP.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String ip = ip1.getText() + "." +
						ip2.getText() + "." +
						ip3.getText() + "." +
						ip4.getText();
				answer.setText(getHost.byIp(ip));
			}
		});
		
		submitName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				answer.setText(getHost.byName(nameField.getText()));
			}
		});
	}
}
