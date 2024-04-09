/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author prathmesh
 */
public class Tables {
    public static void main(String[] args)
    {
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //st.executeUpdate("CREATE TABLE appuser(appuser_pk INT AUTO_INCREMENT PRIMARY KEY, UserRole VARCHAR(100), Name VARCHAR(200), DOB VARCHAR(50), PhoneNo VARCHAR(50), Email VARCHAR(200), Username VARCHAR(200), Password VARCHAR(50), Address VARCHAR(200))");
            //st.executeUpdate("INSERT INTO appuser(UserRole, Name, DOB, PhoneNo, Email, Username, Password, Address) VALUES('Admin', 'Prathmesh', '05-08-2004', '7414959307', 'salunkheprathmesh0@gmail.com', 'Admin-Prathmesh', '12345678', 'Satara')");
            //st.executeUpdate("CREATE TABLE medicine(medicine_pk INT AUTO_INCREMENT PRIMARY KEY, uniqueID VARCHAR(200), name VARCHAR(200), companyName VARCHAR(200), quantity BIGINT, price BIGINT)");
            st.executeUpdate("CREATE TABLE bill(bill_pk INT AUTO_INCREMENT PRIMARY KEY, billID VARCHAR(200), billDate VARCHAR(200), totalPaid BIGINT, generatedBy VARCHAR(50))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
