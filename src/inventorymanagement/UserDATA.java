/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Mysql.Main.dashboard;

/**
 *
 * @author 1styrGroupB
 */
public class UserDATA {
    
   
    public static void save(Users user){
        String query = "insert into users(FirstName, LastName, Email, Password, Role,Permission, Status, Gender) values ('"+user.getFname()+"','"+user.getLname()+"','"+user.getEmail()+"','"+user.getPass()+"','"+user.getRole()+"','"+user.getPermission()+"','Inactive','"+user.getGender()+"')";
        Pro_db.setDataDelete(query, "Registered Successfully! Wait for Admin approval!");
    }
    
    public static Users login(String email, String password){
        Users user = null;
        try{
             ResultSet rs = Pro_db.getData("select * from users where Email= '"+email+"' and Password = '"+password+"' ");
             while (rs.next()){
                 user = new Users();
                 user.setStatus(rs.getString("Status"));
                 user.setRole(rs.getString("Role"));
                 user.setPermission(rs.getString("Permission"));
                 
             }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
        return user;
    } 
    
    

}   
