/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.MysqlDataSource;
/**
 *
 * @author 1styrGroupB
 */
public class myConnection {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "bernadez_hims";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
    public static java.sql.Connection getConnection()
    {
        java.sql.Connection conn = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
         try {
             conn = datasource.getConnection();
          } catch (SQLException ex) {
             Logger.getLogger(" Get Connection -> "+ Connection.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        return conn;
    }
}