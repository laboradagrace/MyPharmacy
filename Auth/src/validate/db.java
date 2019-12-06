/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import Activity.FilterHTML;
package validate;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author laboradagr_sd2022
 */
public class db {
    private int age;
    public boolean saveMedData(String brandName, String genericName, String type, double price, int quantity, String image){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbMyPharmacy", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();

            //insert data into database
            String sqlString = "insert into medicines(BrandName,GenericName,Price,type,quantity,image) values (?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sqlString);
            pstmt.setString(1, brandName);
            pstmt.setString(2, genericName);
            pstmt.setDouble(3, price);
            pstmt.setString(4,type);
            pstmt.setInt(5,quantity);
            pstmt.setString(6,image);
            pstmt.executeUpdate();
            pstmt.close();

            ResultSet rs = stmt.executeQuery("select * from medicines");

            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2)
                        +" " + rs.getDouble(3)+" " + rs.getString(4)+" " + rs.getInt(5)+" " + rs.getString(6));
            } 
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    //fetch all data of medicines
    public ArrayList<Medicine> fetchMedicines(){
        ArrayList<Medicine> medicineList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbMyPharmacy", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();

            //find data into database
            String sqlString = "SELECT * FROM `medicines`";
           

            ResultSet rs = stmt.executeQuery("select * from medicines");
            
            while(rs.next()){  
                Medicine med = new Medicine(rs.getString("brandName"),rs.getString("genericName"),rs.getString("type"), rs.getDouble("price"),rs.getInt("quantity"), rs.getString("image"));
                medicineList.add(med);
            }
            
           
            con.close();
        } catch (Exception e) {
            System.out.println(e); 
        }
        return medicineList;
    
    }
        
    //save account to MyPharmacydb table user 
 
    public boolean saveData(String username, String password, int age) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbMyPharmacy", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();

            //insert data into database
            String sqlString = "insert into users(username, password,age) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sqlString);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setInt(3,age);
            ///pstmt.setString(3, SchoolName);
            pstmt.executeUpdate();
            pstmt.close();

            ResultSet rs = stmt.executeQuery("select * from users");

            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2)+" " + rs.getInt(3));
            } 
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }
    // find account 
    public boolean findData(String username, String password){
        try {
             String dbUsername = "";
             String dbPassword = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbMyPharmacy", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();

            //find data into database
            String sqlString = "SELECT * FROM `users` WHERE `username`= ? AND `password`=?";
            PreparedStatement pstmt = con.prepareStatement(sqlString);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ///pstmt.setString(3, SchoolName);
            pstmt.executeQuery();
            pstmt.close();

            ResultSet rs = stmt.executeQuery("select * from users");
            
            while(rs.next()){
                dbUsername = rs.getString("username");
                dbPassword = rs.getString("password");
                // true;   
            }
            if(username.equals(dbUsername) && password.equals(dbPassword)){
                //this.age = rs.getInt("age");
                return true;
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e); 
        }
        return false;
    }

    public int getAge() {
        return age;
    }
    public boolean transaction(String username, Double totalAmount, int Age){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbMyPharmacy", "root", "");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            
            //insert data into database
            String sqlString = "insert into transactions(username,TotalPayment,age) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sqlString);
            pstmt.setString(1, username);
            pstmt.setDouble(2, totalAmount);
            //pstmt.Date(3, date);
            pstmt.setInt(3, Age );
            pstmt.executeUpdate();
            pstmt.close();
            ResultSet rs = stmt.executeQuery("select * from transactions");

            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getDouble(2)+" " + rs.getInt(3));
            } 
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
        
    }
        
    
            
}
