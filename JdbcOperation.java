/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingLabs.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class JdbcOperation{
  

 public void addOperation(String name,String add,int rol)
 {
         String url="jdbc:mysql://localhost:3306/Javalabs";
         String user="root";
         String password="";
    
            Connection con;
        try
        {
        
            Class.forName("com.mysql.jdbc.Driver");
        
            con = DriverManager.getConnection(url,user,password);
        
         
            String sql = "INSERT INTO student Values ('"+name+"','"+add+"','"+rol+"')";
 
            Statement st = null;
        
            st = con.createStatement();
       
            st.executeUpdate(sql);
       
            JOptionPane.showMessageDialog(null, "Record Added Succesfully.","Record Added",
                        JOptionPane.INFORMATION_MESSAGE);      
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",
                     JOptionPane.ERROR_MESSAGE);
        }
    }
}

