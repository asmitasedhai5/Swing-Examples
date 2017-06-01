package com.swing.JMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuDemo extends JFrame{
	public JMenuDemo(){
		super("Example of Menu");
		setSize(400,300);
		JMenuBar bar=new JMenuBar();
		setJMenuBar(bar);
		
		JMenu mfile=new JMenu("File");
		JMenu medit=new JMenu("Edit");
		JMenu mview=new JMenu("View");
		
		bar.add(mfile);
		bar.add(medit);
		bar.add(mview);

		
		JMenuItem minew=new JMenuItem("New");
		JMenuItem miopen=new JMenuItem("Open");
		JMenuItem misave=new JMenuItem("save");
		
		mfile.add(minew);
		mfile.add(miopen);
		mfile.addSeparator();
		mfile.add(misave);
		setJMenuBar(bar);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args){
		new JMenuDemo();
	}
}
