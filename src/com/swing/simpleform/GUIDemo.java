package com.swing.simpleform;

import javax.swing.*;

public class GUIDemo {
	JFrame f;
	JLabel lblusername,lblpassword;
	JTextField txtusername,txtpassword;
	JButton btnsubmit,btnreset,btncancel;
	
	public GUIDemo(){
		f=new JFrame("Login Form");
		lblusername=new JLabel("Username");
		lblpassword=new JLabel("Password");
		txtusername=new JTextField();
		txtpassword=new JPasswordField();
		btnsubmit=new JButton("submit");
		btnreset=new JButton("reset");
		btncancel=new JButton("cancel");
		
		f.setSize(700,400);
		f.setLayout(null);
		lblusername.setBounds(10, 50, 200, 25);
		txtusername.setBounds(200, 50, 250, 25);
		lblpassword.setBounds(10, 95, 200, 25);
		txtpassword.setBounds(200, 95, 250, 25);
		btnsubmit.setBounds(10, 200, 100, 25);
		btnreset.setBounds(130, 200, 100, 25);
		btncancel.setBounds(250, 200, 100, 25);
		
		f.add(lblusername);
		f.add(lblpassword);
		f.add(txtusername);
		f.add(txtpassword);
		f.add(btnsubmit);
		f.add(btnreset);
		f.add(btncancel);
		f.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new GUIDemo();
	} 
}
