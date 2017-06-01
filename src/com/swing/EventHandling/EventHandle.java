package com.swing.EventHandling;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventHandle implements MouseListener  {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Mouse clicked");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse entered");

		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse exited");

		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Mouse pressed");

		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse released");

		
	}

}
