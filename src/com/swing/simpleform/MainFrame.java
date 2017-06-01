package com.swing.simpleform;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MainDraw extends JComponent {

	public int x = 100;
	public int y = 100;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hello", x, y);
	}

}

public class MainFrame extends JFrame implements KeyListener {
	private MainDraw draw;

	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case 37://left
			draw.x=draw.x-5;
			break;
		case 38://up
			draw.y=draw.y-5;
			break;
		case 39://right
			draw.x=draw.x+5;
			break;
		case 40://down
			draw.y=draw.y+5;
			break;
			
		}
	}

	public MainFrame() {
		this.draw = new MainDraw();

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}

	public static void main(String[] args) {

		MainFrame frame = new MainFrame();
		frame.setSize(500, 500);
		frame.setMinimumSize(new Dimension(500, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(frame.draw);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
