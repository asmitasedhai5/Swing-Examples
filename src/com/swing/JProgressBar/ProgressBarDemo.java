package com.swing.JProgressBar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo extends JFrame {
	JProgressBar jb1;
	JProgressBar jb2;
	int i = 0, j = 0;
	public ProgressBarDemo(){
		super("Example of Progress Bar");
		setSize(400,500);
		
		jb1 = new JProgressBar(0, 2000);
		jb1.setBounds(40, 40, 160, 25);
		jb1.setValue(0);
		jb1.setStringPainted(true);
		
		setLayout(null);

		jb2 = new JProgressBar(0, 2000);
		jb2.setBounds(40, 100, 160, 25);
		jb2.setValue(0);
		jb2.setStringPainted(true);
		
		add(jb1);
		add(jb2);
		
		setVisible(true);
			}
	public void iteration1(){
		while (i <= 2000) {
			jb1.setValue(i);
			i = i + 20;
			try {
				Thread.sleep(150);
			} catch (Exception e) {
			}
		}
	}
	public void iteration2(){
		while (j <= 2000) {
			jb2.setValue(j);
			j = j + 20;
			try {
				Thread.sleep(150);
			} catch (Exception e) {
			}
		}
	}
	
	public static void main(String[] args) {
		ProgressBarDemo p=new ProgressBarDemo();
		Thread t1=new Thread(){
			public void run(){
				p.iteration1();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				p.iteration2();
			}
		};
		t1.start();
		t2.start();
	}
	
}
