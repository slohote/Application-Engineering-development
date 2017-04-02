/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RiskManagerRole;

import Business.Department.RiskAssessmentDepartment;
import Business.Enterprise.Enterprise;
import Business.UserAccount.Useraccount;
import Business.Workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin01
 */
public class ViewDeclinedRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeclinedRequestsJPanel
     */
    JPanel userProcessContainer;
    Useraccount userAccount;
    RiskAssessmentDepartment riskAssessmentDepartment;
    Enterprise enterprise;

    ViewDeclinedRequestsJPanel(JPanel userProcessContainer, Useraccount userAccount, RiskAssessmentDepartment riskAssessmentDepartment, Enterprise enterprise) {
         initComponents();
         this.userProcessContainer=userProcessContainer;
         this.userAccount=userAccount;
         this.riskAssessmentDepartment=riskAssessmentDepartment;
         this.enterprise=enterprise;
         populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        //department.getWorkQueue().getWorkRequestList()
        for(WorkRequest request : riskAssessmentDepartment.getWorkQueue().getWorkRequestList()){
            if(request.getStatus().equalsIgnoreCase("Risk Manager - Declined"))
            {
            Object[] row = new Object[5];
            row[0] = request.getSender().getCustomer().getSSN();
           
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getFirstName();
                System.out.println(request.getStatus());
            row[2] = request.getStatus();
            row[3]= request.getRequestDate();
            row[4]=request.getResolveDate();
            
            
            model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 102));

        workRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer SSN", "Receiver", "Status", "Request Date", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(workRequestJTable);

        backJButton.setBackground(new java.awt.Color(2, 27, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Declined Request Report:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(backJButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}