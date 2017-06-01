package com.swing.simpleform;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements KeyListener {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Asmita", 100, 100);

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

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

public class Movement {

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setSize(500, 500);
		frame.setMinimumSize(new Dimension(500, 500));

		frame.setVisible(true);

		//frame.add(panel);
		frame.getContentPane().add(panel);
		frame.pack();
		//panel.add(g);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
