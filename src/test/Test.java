/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author DELL
 */

import java.sql.Statement;
import java.util.Collections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Test {
    private static String url = "jdbc:mysql://localhost:3306/hello?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "admin";
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {     
        //Nạp Drive
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        if(con == null){
            System.out.println("FAILED");
        }else{
            System.out.println("OK");
            //Tạo câu lệnh 
            Statement stm =  con.createStatement();
            //executeUpdate
            String sql = "INSERT INTO Accounts VALUES ('phuoc', 'hello123')";
             int count = stm.executeUpdate(sql);
             System.out.println(count);
        }
    }
    
}
