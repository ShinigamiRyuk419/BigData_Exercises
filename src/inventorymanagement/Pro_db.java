/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 1styrGroupB
 */
public class Pro_db {
    public static void setDataDelete(String query, String message){
        try{
            Connection conn = myConnection.getConnection();
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            
            if (!message.equals("")){
                JOptionPane.showMessageDialog(null, message);
                
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query){
        try{
            Connection conn = myConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
           return null;
        }
    }
}
