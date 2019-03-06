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
public class Password_Generator extends javax.swing.JFrame {

    String password = "";
    boolean chsmall = false;
    boolean chcap = false;
    boolean chnum = false;
    boolean chspec = false;

    /**
     * Creates new form NewJFrame
     */
    public Password_Generator() {
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
        jSeparator1 = new javax.swing.JSeparator();
        Progbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Password Strength-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password Generator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(Passlabel)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(Labword)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Progbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(271, 271, 271))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(Labword)
                        .addGap(39, 39, 39)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Progbar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
        Passlabel.setText("");
        password = "";
        int r;
        int val = Slider.getValue();
        Labword.setText("No. of Words-" + Integer.toString(val));
        //for(int i=0;i<2;i++)
        {
            chcap = Chkcap.isSelected();
            chsmall = Chksmall.isSelected();
            chnum = Chknum.isSelected();
            chspec = Chkspec.isSelected();
            Random rand = new Random();
            //Passlabel.setText(chcap + " " + chsmall+" "+chnum+" "+chspec);
            while (val != 0) {
                if (chcap == true && chsmall == false && chnum == false && chspec == false) {
                    password += (char) (rand.nextInt(26) + 65);
                }
                else if (chcap == false && chsmall == true && chnum == false && chspec == false) {
                    password += (char) (rand.nextInt(26) + 97);
                }
                else if (chcap == false && chsmall == false && chnum == true && chspec == false) {
                    password += (char) (rand.nextInt(9) + 48);
                }
                else if (chcap == false && chsmall == false && chnum == false && chspec == true) {
                    password += (char) (rand.nextInt(14) + 33);
                }
                else if (chcap == true && chsmall == true && chnum == false && chspec == false) {
                    int opt = rand.nextInt(2);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 65 : rand.nextInt(26) + 97);
                }
                else if (chcap == true && chsmall == false && chnum == true && chspec == false) {
                    int opt = rand.nextInt(2);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 65 : rand.nextInt(9) + 48);
                }
                else if (chcap == true && chsmall == false && chnum == false && chspec == true) {
                    int opt = rand.nextInt(2);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 65 : rand.nextInt(14) + 33);
                }
                else if (chcap == false && chsmall == true && chnum == false && chspec == true) {
                    int opt = rand.nextInt(2);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 97 : rand.nextInt(14) + 33);
                }
                else if (chcap == false && chsmall == true && chnum == true && chspec == false) {
                    int opt = rand.nextInt(2);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 97 : rand.nextInt(9) + 48);
                }
                else if (chcap == false && chsmall == false && chnum == true && chspec == true) {
                    int opt = rand.nextInt(2);
                    password += (char) ((opt == 0) ? rand.nextInt(9) + 48 : rand.nextInt(14) + 33);
                }
                else if (chcap == true && chsmall == true && chnum == true && chspec == false) {
                    int opt = rand.nextInt(3);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 65 : (opt == 1) ? rand.nextInt(26) + 97 : rand.nextInt(9) + 48);
                }
                else if (chcap == true && chsmall == true && chnum == false && chspec == true) {
                    int opt = rand.nextInt(3);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 65 : (opt == 1) ? rand.nextInt(26) + 97 : rand.nextInt(14) + 33);
                }
                else if (chcap == true && chsmall == false && chnum == true && chspec == true) {
                    int opt = rand.nextInt(3);
                    password += (char) ((opt == 0) ? rand.nextInt(9) + 48 : (opt == 1) ? rand.nextInt(26) + 65 : rand.nextInt(14) + 33);
                }
                else if (chcap == false && chsmall == true && chnum == true && chspec == true) {
                    int opt = rand.nextInt(3);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 97 : (opt == 1) ? rand.nextInt(9) + 48 : rand.nextInt(14) + 33);
                }
                else if (chcap == true && chsmall == true && chnum == true && chspec == true) {
                    int opt = rand.nextInt(4);
                    password += (char) ((opt == 0) ? rand.nextInt(26) + 65 : (opt == 1) ? rand.nextInt(26) + 97 : (opt == 2) ? rand.nextInt(9) + 48 : rand.nextInt(14) + 33);
                }
                val--;
            }
            Passlabel.setText(password);
        }
        Progbar.setValue(100);
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
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_Generator().setVisible(true);
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
    private javax.swing.JProgressBar Progbar;
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
