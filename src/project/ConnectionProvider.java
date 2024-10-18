/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author shubh
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
//        try{
//          Class.forName("com.mysql.jdbc.driver");
//          //jdbc:mysql://localhost:3307/?user=root
//          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/qems","root","root");
//          return con;
//        }
//        catch(Exception e)
//        {
//            return null;
//        }
         String url="jdbc:mysql://localhost:3307/qems";
         String username="root";
        String password="root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, username, password);
            return con;
        }catch(Exception e){
            System.out.println("Error" + e);
               return null;
        }
    }
}
