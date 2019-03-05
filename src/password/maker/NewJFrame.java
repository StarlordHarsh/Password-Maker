/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.maker;

import java.util.Random;

/**
 *
 * @author hj101
 */
public class NewJFrame extends javax.swing.JFrame {

    String password = "";
    boolean chsmall = false;
    boolean chcap = false;
    boolean chnum = false;
    boolean chspec = false;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Passlabel = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Chksmall = new javax.swing.JCheckBox();
        Chkcap = new javax.swing.JCheckBox();
        Chknum = new javax.swing.JCheckBox();
        Chkspec = new javax.swing.JCheckBox();
        Slider = new javax.swing.JSlider();
        Labword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Passlabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        Chksmall.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Chksmall.setText("Small");
        Chksmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChksmallActionPerformed(evt);
            }
        });

        Chkcap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Chkcap.setText("Capital");
        Chkcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkcapActionPerformed(evt);
            }
        });

        Chknum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Chknum.setText("Numbers");
        Chknum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChknumActionPerformed(evt);
            }
        });

        Chkspec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Chkspec.setText("Special Characters");
        Chkspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkspecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Chksmall)
                .addGap(81, 81, 81)
                .addComponent(Chkcap)
                .addGap(81, 81, 81)
                .addComponent(Chknum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(Chkspec)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chksmall)
                    .addComponent(Chkcap)
                    .addComponent(Chknum)
                    .addComponent(Chkspec))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Slider.setMajorTickSpacing(10);
        Slider.setMaximum(50);
        Slider.setMinimum(8);
        Slider.setPaintLabels(true);
        Slider.setPaintTicks(true);
        Slider.setValue(0);
        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });

        Labword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Labword.setText("No. of Words-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Passlabel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(Labword)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Labword)
                        .addGap(44, 44, 44)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
        Labword.setText("No. of Words-" + Integer.toString(Slider.getValue()));
        //for(int i=0;i<2;i++)
        {
        chcap = Chkcap.isSelected();
        chsmall = Chksmall.isSelected();
        chnum = Chknum.isSelected();
        chspec = Chkspec.isSelected();
        Random rand = new Random();
        Passlabel.setText(chcap + " " + chsmall+" "+chnum+" "+chspec);
        }
    }//GEN-LAST:event_SliderStateChanged

    private void ChkcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkcapActionPerformed
        
        SliderStateChanged(null);
    }//GEN-LAST:event_ChkcapActionPerformed

    private void ChksmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChksmallActionPerformed
        
        SliderStateChanged(null);
    }//GEN-LAST:event_ChksmallActionPerformed

    private void ChknumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChknumActionPerformed
        
        SliderStateChanged(null);
    }//GEN-LAST:event_ChknumActionPerformed

    private void ChkspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkspecActionPerformed
        chspec = true;
        SliderStateChanged(null);
    }//GEN-LAST:event_ChkspecActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Chkcap;
    private javax.swing.JCheckBox Chknum;
    private javax.swing.JCheckBox Chksmall;
    private javax.swing.JCheckBox Chkspec;
    private javax.swing.JLabel Labword;
    private javax.swing.JTextField Passlabel;
    private javax.swing.JSlider Slider;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
