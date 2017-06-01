package com.swing.JComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboDemo {

	JFrame f;
	JComboBox c;

	public ComboDemo() {
		f = new JFrame();

		
		JComboBox cbyear = new JComboBox();
		JComboBox cbmnth = new JComboBox();
		JComboBox cbday = new JComboBox();
		cbyear.setBounds(50, 100, 100, 25);
		cbmnth.setBounds(150, 100, 100, 25);
		cbday.setBounds(250, 100, 100, 25);

		for (int i = 1990; i <= 2020; i++)
			cbyear.addItem(i);

		String month[] = { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };
		for (int i = 0; i < 12; i++)
			cbmnth.addItem(month[i]);

		for (int i = 1; i < 33; i++)
			cbday.addItem(i);
		
		f.setSize(500, 400);
		f.setLayout(null);

		f.add(cbyear);
		f.add(cbmnth);
		f.add(cbday);
		
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new ComboDemo();
	}

}
