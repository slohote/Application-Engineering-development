/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.Useraccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class ViewUpdateContactDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateContactDetails
     */
    
    JPanel userProcessContainer;
    Useraccount account;
    Enterprise enterprise;
    

    ViewUpdateContactDetails(JPanel userProcessContainer, Useraccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.enterprise=enterprise;
        txtBranchName.setText(account.getCustomer().getFirstName());
        txtPhoneNumber.setText(String.valueOf(account.getCustomer().getPhNo()));
        txtlname.setText(account.getCustomer().getLastName());
        txtBranchName.setEnabled(false);
        txtlname.setEnabled(false);
        txtState.setText(account.getCustomer().getState());
        txtStreet.setText(account.getCustomer().getStreet());
        txtZipcode.setText(String.valueOf(account.getCustomer().getZipcode()));
        txtCity.setText(account.getCustomer().getCity());
        txtEmailId.setText(account.getCustomer().getEmailId());
        txtUserName.setText(account.getUsername());
        txtPassword.setText(account.getPassword());
        txtPhoneNumber.setEnabled(false);
        txtState.setEnabled(false);
        txtStreet.setEnabled(false);
        txtZipcode.setEnabled(false);
        txtCity.setEnabled(false);
         txtEmailId.setEnabled(false);
         txtUserName.setEnabled(false);
          txtPassword.setEnabled(false);
          btnSave.setEnabled(false);
          btnUpdate.setEnabled(true);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBranchName = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(8, 32, 55));

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone number");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");

        btnSave.setBackground(new java.awt.Color(4, 27, 49));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(4, 27, 49));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Street");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("State");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Zipcode");

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        txtState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateKeyPressed(evt);
            }
        });

        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last name");

        backJButton.setBackground(new java.awt.Color(3, 37, 70));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Personal Details:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSave))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnUpdate))
                            .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZipcode, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(txtPassword))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtlname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(txtEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))))
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(81, 81, 81)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(28, 28, 28)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
     btnUpdate.setEnabled(false);
     txtPhoneNumber.setEnabled(true);
        txtState.setEnabled(true);
        txtStreet.setEnabled(true);
        txtZipcode.setEnabled(true);
        txtCity.setEnabled(true);
         txtEmailId.setEnabled(true);
         txtUserName.setEnabled(true);
          txtPassword.setEnabled(true);
         
     
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
         Pattern pattern;
         Matcher matcher;
         final String PASSWORD_PATTERN ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
         pattern = Pattern.compile(PASSWORD_PATTERN);
         String password=txtPassword.getText();
         matcher = pattern.matcher(password);
         try{
             String emailid=txtEmailId.getText();
             if(txtStreet.getText().isEmpty() || txtState.getText().isEmpty() || txtUserName.getText().isEmpty() || txtCity.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null, "Please enter all details","Warning",JOptionPane.WARNING_MESSAGE);
             }
             else
             {
                 account.getCustomer().setCity(txtCity.getText());
                 account.getCustomer().setState(txtState.getText());
                 account.getCustomer().setStreet(txtStreet.getText());
                  account.setUsername(txtUserName.getText());
             if(txtPhoneNumber.getText().length()==10)
             {
                account.getCustomer().setPhNo(Long.parseLong(txtPhoneNumber.getText()));
                account.getCustomer().setZipcode(Long.parseLong(txtZipcode.getText()));
           if(matcher.matches())
         {
             account.setPassword(password);
             
             Pattern  pattern1;
               Matcher matcher1;

               final String EMAIL_PATTERN = 
    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
               pattern1 = Pattern.compile(EMAIL_PATTERN);
                matcher1 = pattern.matcher(emailid);
                if(matcher.matches())
                {
                    
                account.getCustomer().setEmailId(txtEmailId.getText());
             JOptionPane.showMessageDialog(null, "Contact details updated successfully","Information",JOptionPane.INFORMATION_MESSAGE);
             txtPhoneNumber.setEnabled(false);
        txtEmailId.setEnabled(false);
         txtState.setEnabled(false);
         txtStreet.setEnabled(false);
         txtCity.setEnabled(false);
         txtZipcode.setEnabled(false);        
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter valid emailId!","Warning",JOptionPane.WARNING_MESSAGE);
                }
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Please enter strong password(6 to 20 characters string with at least one digit, one upper case letter, one lower case letter and one special symbol)","Warning",JOptionPane.WARNING_MESSAGE);
             return;
             
         }
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Please enter 10 digit phone number","Warning",JOptionPane.WARNING_MESSAGE);
             }
                 
             }
           
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Please enter valid details","Warning",JOptionPane.WARNING_MESSAGE); 
        }
//         if(matcher.matches())
//         {
//             account.setPassword(password);
//             JOptionPane.showMessageDialog(null, "Contact details updated successfully","Information",JOptionPane.INFORMATION_MESSAGE);
//         }
//         else
//         {
//             JOptionPane.showMessageDialog(null, "Please enter strong password(6 to 20 characters string with at least one digit, one upper case letter, one lower case letter and one special symbol)","Warning",JOptionPane.WARNING_MESSAGE);
//             return;
//             
//         }

        //account.getCustomer().setStreet(txtStreet.getText());
        account.getCustomer().setCity(txtCity.getText());
        
//        txtPhoneNumber.setEnabled(false);
//        txtEmailId.setEnabled(false);
//         txtState.setEnabled(false);
//         txtStreet.setEnabled(false);
//         txtCity.setEnabled(false);
//         txtZipcode.setEnabled(false);        
//        
//        btnSave.setEnabled(false);
//        btnUpdate.setEnabled(true);
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtPhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyPressed
        // TODO add your handling code here:
        int event =evt.getKeyCode();
        if((event>=evt.VK_0 && event<=evt.VK_9) || event ==evt.VK_BACK_SPACE || (event>=evt.VK_NUMPAD0 && event<=evt.VK_NUMPAD9))
        {
            txtPhoneNumber.setEditable(true);
            
        }
        else
        {
            txtPhoneNumber.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter valid phone number","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_txtPhoneNumberKeyPressed

    private void txtZipcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyPressed
        // TODO add your handling code here:
       int event =evt.getKeyCode();
        if((event>=evt.VK_0 && event<=evt.VK_9) || event ==evt.VK_BACK_SPACE || (event>=evt.VK_NUMPAD0 && event<=evt.VK_NUMPAD9))
        {
            txtZipcode.setEditable(true);
            
        }
        else
        {
            txtZipcode.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter valid zipcode","Warning",JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_txtZipcodeKeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
        int event =evt.getKeyCode();
        if((event>=evt.VK_A && event<=evt.VK_Z) || event ==evt.VK_BACK_SPACE || event>=evt.VK_SPACE || event<=evt.VK_SHIFT )
        {
            txtCity.setEditable(true);
            
        }
        else
        {
            txtCity.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter valid city","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_txtCityKeyPressed

    private void txtStateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyPressed
        // TODO add your handling code here:
        int event =evt.getKeyCode();
        if((event>=evt.VK_A && event<=evt.VK_Z) || event ==evt.VK_BACK_SPACE || event>=evt.VK_SPACE || event<=evt.VK_SHIFT )
        {
            txtState.setEditable(true);
            
        }
        else
        {
            txtState.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter valid state","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtStateKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtZipcode;
    private javax.swing.JTextField txtlname;
    // End of variables declaration//GEN-END:variables
}