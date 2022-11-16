/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

/**
 *
 * @author 1styrGroupB
 */
//getter is used to return values and setter is use to update its value

public class Users {
    int id;
    public static String fname;
    public static String lname;
    public static String email;
    public static String pass;
    public static String role;
    public static String gender;
    public static String status;
    public static String permission;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        Users.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        Users.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        Users.status = status;
    }
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        Users.permission = permission;
    }

}
