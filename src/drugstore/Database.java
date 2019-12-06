package drugstore;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bustamantecr_sd2022
 */
public class Database {
    public boolean userExist = false;
    public void saveData(String name, int age, String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javafinal", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = (Statement) con.createStatement();

            //insert data into database
            String sqlString = "insert into tblregister(name, age, username, password) values (?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sqlString);
            pstmt.setString(1, name);
            pstmt.setString(2, String.valueOf(age));
            pstmt.setString(3, username);
            pstmt.setString(4, password);
            ///pstmt.setString(3, SchoolName);
            pstmt.executeUpdate();
            pstmt.close();

            ResultSet rs = stmt.executeQuery("select * from tblregister");

            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public boolean login(String username, String password){
        try {
             String dbUsername = "";
             String dbPassword = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javafinal", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();

            //insert data into database
            String sqlString = "SELECT * FROM `tblregister` WHERE `Username`= ? AND `Password`=?";
            PreparedStatement pstmt = con.prepareStatement(sqlString);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ///pstmt.setString(3, SchoolName);
            pstmt.executeQuery();
            pstmt.close();

            ResultSet rs = stmt.executeQuery("select * from tblregister");
           
            while(rs.next()){
                dbUsername = rs.getString("Username");
                dbPassword = rs.getString("Password");
                // true;  
            }
            if(username.equals(dbUsername) && password.equals(dbPassword)){
                return true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
//    public void listMedicine(String genName, String brandName, int price, int quantity) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/javafinal", "root", "");
//            //here sonoo is database name, root is username and password  
//            Statement stmt = (Statement) con.createStatement();
//
//            //insert data into database
//            String sqlString = "insert into tblmedicine(generic_name, brand_name, type, price, quantity) values (?,?,?,?,?)";
//            PreparedStatement pstmt = con.prepareStatement(sqlString);
//            pstmt.setString(1, genName);
//            pstmt.setString(2, brandName)
//            pstmt.setString(3, String.valueOf(price));
//            pstmt.setString(4, String.valueOf(quantity));
//            ///pstmt.setString(3, SchoolName);
//            pstmt.executeUpdate();
//            pstmt.close();
//
//            ResultSet rs = stmt.executeQuery("select * from tbladdmedicine");
//
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + "  " + rs.getString(2));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    
    public void addMedicine(String genName, String brandName, String type, double price, int quantity) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javafinal", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = (Statement) con.createStatement();

            //insert data into database
            String sqlString = "insert into tbladdmedicine(generic_name, brand_name, type, price, quantity) values (?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sqlString);
            pstmt.setString(1, genName);
            pstmt.setString(2, brandName);
            pstmt.setString(3, type);
            pstmt.setDouble(4, price);
            pstmt.setInt(5, quantity);
            ///pstmt.setString(3, SchoolName);
            pstmt.executeUpdate();
            pstmt.close();

            ResultSet rs = stmt.executeQuery("select * from tbladdmedicine");

            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
