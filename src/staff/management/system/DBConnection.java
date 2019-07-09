/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aadarsha
 */
public class DBConnection {
    Connection con;
    Statement st;
    ResultSet rs;
     public Statement statementObject(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
        }catch(Exception e){
            System.out.println("driver not loaded");
        }
        con=null;
        
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/staff informare","root","");
            System.out.println("database loaded");
        }catch(Exception e){
            System.out.println("database not loaded");
        }
        st=null;
        try{
            st=con.createStatement();
            
        }catch(Exception e){
            System.out.println("error"+e);
        }
        return st;
    }
     public void dbconreset(){
         try{
            st.close();
            con.close();
         }
         catch(Exception e){
             System.out.println("Error closing connection to DB");
         }
     }
     
     /*milauna baki xa DB
     public static void connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
        }catch(Exception e){
            System.out.println("driver not loaded");
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/staff informare","root","");
            System.out.println("database loaded");
        }catch(Exception e){
            System.out.println("database not loaded");
        }
    }
     public static Statement statementObject(){
        st=null;
        try{
               st=con.createStatement();

           }
        catch(Exception e){
            System.out.println("error"+e);
        }
        return st;
     }
     */
}

