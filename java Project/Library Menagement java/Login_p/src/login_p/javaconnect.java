/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_p;

/**
 *
 * @author abdullah
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    public static Connection connection(){
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginDB","root","1234");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "again Try in connection class");
            return null;
        }
    }
}
