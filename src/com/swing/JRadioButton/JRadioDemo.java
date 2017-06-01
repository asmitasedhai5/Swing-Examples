package com.swing.JRadioButton;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioDemo {
	JFrame f;
	JRadioButton r;

	public JRadioDemo() {
		f = new JFrame();

		
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		
		male.setBounds(100, 100, 100, 25);
		female.setBounds(200, 100, 100, 25);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		f.setSize(500, 400);
		f.setLayout(null);

		f.add(male);
		f.add(female);
		
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new JRadioDemo();
	}

}
