/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eccoursework;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Liam Keogh
 */
public class DBConnect {

    Connection dbCon = null;

    public static Connection openDBConnection() {
        try {
            Connection dbCon = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Liam Keogh\\Documents\\EnterpriseDB2.mdb");
            return dbCon;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }

    }
        
}
