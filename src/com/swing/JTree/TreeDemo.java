package com.swing.JTree;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo {
	JFrame f;  
	public TreeDemo(){  
	    f=new JFrame();   
	    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
	    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
	    DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
	    style.add(color);  
	    style.add(font);  
	    DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
	    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
	   // DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
	      
	    color.add(red);
	    color.add(blue); 
	   // color.add(black);      
	    JTree jt=new JTree(style);  
	    f.add(jt);  
	    f.setSize(200,200);  
	    f.setVisible(true);  
	}  
	public static void main(String[] args) {  
	    new TreeDemo();  
	}
}
