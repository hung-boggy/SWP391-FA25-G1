/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DBContext {
     protected Connection connection;
    public static Connection getConnection() {
    try {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=PizaaManagement";
        String username = "sa";
        String password = "123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, username, password);
    } catch (Exception e) {
        System.out.println(e);
        return null;
    }
}
    public DBContext()
    {
        try {
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PizzaManagement";
            String username = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
}
