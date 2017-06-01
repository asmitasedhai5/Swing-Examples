package SwingLabs.jdbc;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUIDeom implements ActionListener {

    JFrame f;
    JLabel lblname, lbladdress, lblroll;
    JTextField txtname, txtaddress, txtroll;
    JButton btnsubmit, btncancel;
    JPanel p;
  

    public GUIDeom() {
        f = new JFrame("Login Form");
        p = new JPanel();
        lblname = new JLabel("Name");
        lbladdress = new JLabel("Address");
        lblroll = new JLabel("Roll no.");
        txtname = new JTextField();
        txtaddress = new JTextField();
        txtroll = new JTextField();
        btnsubmit = new JButton("Submit");
        
        btncancel = new JButton("Cancel");
        btncancel.addActionListener(this);
        
        btnsubmit.addActionListener(this);
        f.setSize(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(4, 2, 1, 1));
        p.setBackground(Color.GRAY);

        Color c = new Color(5, 10, 15);
        lblname.setBackground(c);

        p.add(lblname);
        p.add(txtname);
        p.add(lbladdress);
        p.add(txtaddress);
        p.add(lblroll);
        p.add(txtroll);
        p.add(btnsubmit);
        
        p.add(btncancel);
        f.add(p);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new GUIDeom();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JdbcOperation g = new JdbcOperation();
        if (e.getSource() == btncancel) {
            System.exit(0);
        } else if (e.getSource() == btnsubmit) {
            String name = txtname.getText();
         String add = txtaddress.getText();
         int rol = Integer.parseInt(txtroll.getText());
           g.addOperation(name,add,rol);
        }
    }
}
