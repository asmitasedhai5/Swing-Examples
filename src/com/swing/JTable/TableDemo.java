package com.swing.JTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo {
	JFrame f;

	public TableDemo() {
		JFrame f = new JFrame("Example of Table");

		String data[][] = { { "Ram", "ktm", "4213456" }, { "Sita", "bkt", "4567891" } };
		String column[] = { "Name", "Address", "Phone" };

		JTable table = new JTable(data, column);
		table.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(table);
		f.add(sp);
		f.setSize(300, 400);
		//f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new TableDemo();
	}
}
