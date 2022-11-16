/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoDB.Main;


import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import inventorymanagement.UserDATA;
import inventorymanagement.Users;
import java.awt.Color;

import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import org.bson.Document;


/**
 *
 * @author 1styrGroupA
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    // create borders
   

    
    Border textField_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue);

    public Login() {
        initComponents();
        // center form 
        this.setLocationRelativeTo(null);

        // set borders
        userfield.setBorder(textField_border);
        passwordfield.setBorder(textField_border);

 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        loginbtn = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 450));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(259, 217, 0, 0);

        minimize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minimize.setForeground(java.awt.Color.red);
        minimize.setText(" -");
        minimize.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(510, 10, 19, 24);

        exit.setBackground(java.awt.Color.red);
        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 51));
        exit.setText(" x");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(540, 10, 19, 24);

        back.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        back.setForeground(java.awt.Color.yellow);
        back.setText("<--BACK ");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(460, 410, 100, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Management System");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 40, 200, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Password.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 290, 50, 48);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 210, 50, 48);

        userfield.setBackground(new java.awt.Color(0, 51, 255));
        userfield.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        userfield.setForeground(java.awt.Color.yellow);
        userfield.setText("email");
        userfield.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        userfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userfieldFocusLost(evt);
            }
        });
        getContentPane().add(userfield);
        userfield.setBounds(180, 210, 260, 50);

        loginbtn.setBackground(new java.awt.Color(42, 187, 155));
        loginbtn.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, null, null));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn);
        loginbtn.setBounds(230, 380, 119, 39);

        passwordfield.setBackground(new java.awt.Color(0, 51, 255));
        passwordfield.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        passwordfield.setForeground(java.awt.Color.yellow);
        passwordfield.setText("password");
        passwordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordfieldFocusLost(evt);
            }
        });
        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordfield);
        passwordfield.setBounds(180, 290, 260, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("ComHardware Inventory");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 10, 250, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login-icon.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 90, 130, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/H.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 590, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int e = JOptionPane.showConfirmDialog(null,"Do you really want to exit?","Confirmation",JOptionPane.YES_NO_OPTION);
        if (e==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // to miminimize the login frame
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        back.setBorder(label_border);
    }//GEN-LAST:event_backMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        back.setBorder(label_border);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Signup mi = new Signup();
        mi.setVisible(true);
        mi.pack();
        mi.setLocationRelativeTo(null);
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

    private void passwordfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusLost

        String pass = String.valueOf(passwordfield.getPassword());

        if (pass.trim().equals("")
            || pass.trim().toLowerCase().equals("password")) {
            passwordfield.setText("password");
            passwordfield.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_passwordfieldFocusLost

    private void passwordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusGained

        String pass = String.valueOf(passwordfield.getPassword());

        if (pass.trim().toLowerCase().equals("password")) {
            passwordfield.setText("");
            passwordfield.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_passwordfieldFocusGained

    private void userfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userfieldFocusLost

        if (userfield.getText().trim().equals("")
            || userfield.getText().trim().toLowerCase().equals("email")) {
            userfield.setText("email");
            userfield.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_userfieldFocusLost

    private void userfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userfieldFocusGained
        // TODO add your handling code here:
        if (userfield.getText().trim().toLowerCase().equals("email")) {
            userfield.setText("");
            userfield.setForeground(Color.yellow);
        }
    }//GEN-LAST:event_userfieldFocusGained

MongoClient mongoClient = new MongoClient( "localhost" , 27017 ); 
MongoDatabase db = mongoClient.getDatabase("bernadez_hims");
    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        MongoCollection<Document>  collection= db.getCollection("users");
        // get the email & password
        String email = userfield.getText();
        String password = String.valueOf(passwordfield.getPassword());
        
        BasicDBObject identify = new BasicDBObject();
        identify.put("Email", email);
        identify.put("Password", password);
             
        MongoCursor<Document> query = collection.find(identify).iterator();
             
             
        

        if (identify.equals(db)) {
            JOptionPane.showMessageDialog(null, "Incorrect Username / Password", "Login Error", 2);
        } else {
                if (query.hasNext()){
                    //show a new form
                        dashboard form = new dashboard();
//                        form.Ambot.setText(userfield.getText());
                        form.setVisible(true);
                        form.pack();
                        form.setLocationRelativeTo(null);
                        // close the current form(login form)
                        this.dispose();
                }
                        

                    
                
            
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        // TODO add your handling code here:

        loginbtn.setBackground(Color.green);
        loginbtn.setForeground(Color.darkGray);

        String username = userfield.getText();
        String password = passwordfield.getText();
    }//GEN-LAST:event_loginbtnMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField passwordfield;
    public static javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}