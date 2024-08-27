/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms.view;

import com.hms.controller.PathologicalTestController;
import com.hms.model.PathologicalTest;

/**
 *
 * @author Banna
 */
public class PathologicalTestSetup extends javax.swing.JFrame {

    /**
     * Creates new form PathologicalTestSetup
     */
    public PathologicalTestSetup() {
        initComponents();
    }
    public void TypeTest(){
        if(btnPathTest.isSelected() == true && btnRadioTest.isSelected() == true){
            jLabel1.setText("Null");
            btnTestCk.setText("Select one type at a time. ");
        }else if (btnPathTest.isSelected() == true && btnRadioTest.isSelected() == false){
            jLabel1.setText("Reagent ");
            btnTestCk.setText("");
        }else if (btnPathTest.isSelected() == false && btnRadioTest.isSelected() == true){
        jLabel1.setText("Plate Dimention ");
        btnTestCk.setText("");
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

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        labelTitle = new javax.swing.JLabel();
        labelCost = new javax.swing.JLabel();
        txtTestTitle = new javax.swing.JTextField();
        labelAvailable = new javax.swing.JLabel();
        txtTestCost = new javax.swing.JTextField();
        checkBoxAvailable = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        labelOutput = new javax.swing.JLabel();
        labelCost1 = new javax.swing.JLabel();
        btnPathTest = new javax.swing.JRadioButton();
        btnRadioTest = new javax.swing.JRadioButton();
        btnTestCk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ChangeWindow = new javax.swing.JMenu();
        Home = new javax.swing.JMenuItem();
        patholoSearch = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Test Title:");

        labelCost.setText("Test Cost");

        txtTestTitle.setText("  ");
        txtTestTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestTitleActionPerformed(evt);
            }
        });

        labelAvailable.setText("Available?");

        txtTestCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestCostActionPerformed(evt);
            }
        });

        checkBoxAvailable.setText("(No by default)");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        labelCost1.setText("Test Type");

        buttonGroup1.add(btnPathTest);
        btnPathTest.setText("Pathological Test");
        btnPathTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathTestActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnRadioTest);
        btnRadioTest.setText("Radiological Test");
        btnRadioTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioTestActionPerformed(evt);
            }
        });

        btnTestCk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestCkActionPerformed(evt);
            }
        });

        jLabel1.setText("...");

        ChangeWindow.setText("Menu");

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        ChangeWindow.add(Home);

        patholoSearch.setText("Pathological Search");
        patholoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patholoSearchActionPerformed(evt);
            }
        });
        ChangeWindow.add(patholoSearch);

        jMenuBar1.add(ChangeWindow);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnTestCk, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTestTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10))
                                                .addComponent(labelCost1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelAvailable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTestCost, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnRadioTest)
                                            .addComponent(btnPathTest)
                                            .addComponent(checkBoxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(5, 5, 5)))))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTestTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCost1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPathTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRadioTest)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTestCk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTestCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCost, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAvailable)
                    .addComponent(labelAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(labelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
//        PathologicalTest pTest = new PathologicalTest(
//                txtTestTitle.getText(),
//                Double.parseDouble(txtTestCost.getText()),
//                checkBoxAvailable.isSelected());
                
        //String title = txtTestTitle.getText();
        
//        labelOutput.setText(pTest.show());
     PathologicalTestController ptc = new PathologicalTestController();
     ptc.initializePathologicalTest(txtTestTitle.getText(),
             Double.parseDouble(txtTestCost.getText()),
             checkBoxAvailable.isSelected());
     
//    labelOutput.setText(ptc.returnPTestInfo());

        

        new ShowOutput().setVisible(true);
        this.dispose();

     
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtTestTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTestTitleActionPerformed

    private void txtTestCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTestCostActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void patholoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patholoSearchActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new PathologicalTestSearch().setVisible(true);
    }//GEN-LAST:event_patholoSearchActionPerformed

    private void btnTestCkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestCkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTestCkActionPerformed

    private void btnPathTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathTestActionPerformed
        // TODO add your handling code here:
        TypeTest();
        
    }//GEN-LAST:event_btnPathTestActionPerformed

    private void btnRadioTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioTestActionPerformed
        // TODO add your handling code here:
        TypeTest();
    }//GEN-LAST:event_btnRadioTestActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PathologicalTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PathologicalTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PathologicalTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PathologicalTestSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PathologicalTestSetup().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ChangeWindow;
    private javax.swing.JMenuItem Home;
    private javax.swing.JButton btnCancel;
    private javax.swing.JRadioButton btnPathTest;
    private javax.swing.JRadioButton btnRadioTest;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField btnTestCk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkBoxAvailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelAvailable;
    private javax.swing.JLabel labelCost;
    private javax.swing.JLabel labelCost1;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenuItem patholoSearch;
    private javax.swing.JTextField txtTestCost;
    private javax.swing.JTextField txtTestTitle;
    // End of variables declaration//GEN-END:variables
}
