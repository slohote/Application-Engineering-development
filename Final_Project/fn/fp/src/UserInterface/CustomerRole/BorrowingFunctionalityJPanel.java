/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.Loan.Loan;
import Business.UserAccount.Useraccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin01
 */
public class BorrowingFunctionalityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BorrowingFunctionalityJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Useraccount account;

    BorrowingFunctionalityJPanel(JPanel userProcessContainer, Useraccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.account=account;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApplyLoan = new javax.swing.JButton();
        btnLoanStatus = new javax.swing.JButton();
        btnRepayment = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(1, 50, 101));

        btnApplyLoan.setBackground(new java.awt.Color(3, 29, 55));
        btnApplyLoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApplyLoan.setForeground(new java.awt.Color(255, 255, 255));
        btnApplyLoan.setText("Apply Loan");
        btnApplyLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyLoanActionPerformed(evt);
            }
        });

        btnLoanStatus.setBackground(new java.awt.Color(3, 29, 55));
        btnLoanStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLoanStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnLoanStatus.setText("Loan Status");
        btnLoanStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanStatusActionPerformed(evt);
            }
        });

        btnRepayment.setBackground(new java.awt.Color(3, 29, 55));
        btnRepayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRepayment.setForeground(new java.awt.Color(255, 255, 255));
        btnRepayment.setText("Repayment");
        btnRepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepaymentActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(2, 27, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Borrowing Department!!!");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin01\\Desktop\\images (4).jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(backJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnApplyLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoanStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRepayment, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApplyLoan)
                    .addComponent(btnLoanStatus)
                    .addComponent(btnRepayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApplyLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyLoanActionPerformed
        // TODO add your handling code here:
        if(account.getCustomer().getBankAccountDirectory().getbankAccountList().size()!=0 )
        { 
            if(account.getCustomer().getLoanDirectory().getLoanList().size()!=0)
            {
            for(Loan loan:account.getCustomer().getLoanDirectory().getLoanList())
            {
                if(!loan.getStatus().equalsIgnoreCase("Closed")){
                    JOptionPane.showConfirmDialog(null, "Prerequisite - Please clear the earlier loan dues to apply for new loan ","Warning",JOptionPane.WARNING_MESSAGE);
                    break;
                    
                }
                else
                {
                    LoanDetailJPanel accountOpeningJPanel = new LoanDetailJPanel(userProcessContainer, account,enterprise);
                    userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
                     CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                     layout.next(userProcessContainer);
                    
                }
            }
            }
            else
            {
                LoanDetailJPanel accountOpeningJPanel = new LoanDetailJPanel(userProcessContainer, account,enterprise);
                    userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
                     CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                     layout.next(userProcessContainer);
                
            }
        
        }
        else
        {
           JOptionPane.showConfirmDialog(null, "Prerequisite - Please create saving bank account with us first!! ","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnApplyLoanActionPerformed

    private void btnLoanStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanStatusActionPerformed
        // TODO add your handling code here:
        LoanStatusJpanel accountOpeningJPanel = new LoanStatusJpanel(userProcessContainer,account, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLoanStatusActionPerformed

    private void btnRepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepaymentActionPerformed
        // TODO add your handling code here:
        RepaymentFunctionalityJPanel accountOpeningJPanel = new RepaymentFunctionalityJPanel(userProcessContainer,account,enterprise);
        userProcessContainer.add("manageOrganizationJPanel", accountOpeningJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRepaymentActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnApplyLoan;
    private javax.swing.JButton btnLoanStatus;
    private javax.swing.JButton btnRepayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}