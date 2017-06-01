package com.swing.EventHandling;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo {
	JFrame f;
	JButton btnok;
	
	public EventDemo(){
		f=new JFrame("Login Form");
		btnok=new JButton("OK");
		
		f.setSize(700,400);
		f.setLayout(null);
		btnok.setBounds(250, 100, 100, 25);
		
		
		f.add(btnok);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnok.addMouseListener(new EventHandle());
		
	}
	public static void main(String[] args) {
		new EventDemo();
	} 
}


