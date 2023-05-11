/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class DataProvider {
    Connection connection = null;
    ResultSet resultSet;
    public void ketNoi()
    {
        String strName = "DESKTOP-CEQ6SSS";
        String strDataBase = "QLVPP__";
        String strUser = "sa";
        String strPass ="123";
        try {
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver);

            String cnn = "jdbc:sqlserver://" + strName + ":1433;databaseName=" 
            + strDataBase + ";encrypt=true;trustServerCertificate=true;user=" +strUser + ";password=" + strPass;
            connection = DriverManager.getConnection(cnn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
    }
    public ResultSet executeQuery(String query)
    {
        Statement statement;
        try {
            statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return null;
    }
    public int executeUpdate(String query)
    {
        Statement statement;
        try {
            statement = connection.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException e) {
             e.printStackTrace();
        }
        return 0;
        
    }
    

    public void closeConnection()
    {
        try {
        if(connection != null)
            {
               connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        
    }
}
