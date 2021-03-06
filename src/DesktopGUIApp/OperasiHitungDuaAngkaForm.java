package DesktopGUIApp;

/**
 * @lisence MIT
 * @author RizkiAdjiPangestu (181011400052)
 * @version 1.0.0
 * @since 2020
 */
public class OperasiHitungDuaAngkaForm extends javax.swing.JFrame {
    public OperasiHitungDuaAngkaForm() {
        initComponents();
    }
    
    private void MathCount(String firstNum, String secondNum, String operator)
    {
        OperationLB.setText(operator);
        double a = Double.parseDouble(firstNum);
        double b = Double.parseDouble(secondNum);
        double hasil;
        switch(operator)
        {
            case "+":
                hasil = a + b;
                break;
            case "-":
                hasil = a - b;
                break;
            case "*":
                hasil = a * b;
                break;
            case "/":
                hasil = a / b;
                break;
            default:
                hasil = 0;
                break;
        }
        HasilOperasiTF.setText("" + hasil);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Backgroundpanel = new javax.swing.JPanel();
        AppPanel = new javax.swing.JPanel();
        PlusOperatorBTN = new javax.swing.JToggleButton();
        MinOperatorBTN = new javax.swing.JToggleButton();
        TimesOperatorBTN = new javax.swing.JToggleButton();
        DivOperatorBTN = new javax.swing.JToggleButton();
        ExitBTN = new javax.swing.JToggleButton();
        CleanBTN = new javax.swing.JToggleButton();
        AngkaPertamaTF = new javax.swing.JTextField();
        AngkaKeduaTF = new javax.swing.JTextField();
        EqualsLB = new javax.swing.JLabel();
        OperationLB = new javax.swing.JLabel();
        HasilOperasiTF = new javax.swing.JTextField();
        Copyright = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Applikasi UTS Rizki Adji Pangestu");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Backgroundpanel.setOpaque(false);

        AppPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Operasi Hitung Dua Angka", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SansSerif", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        AppPanel.setOpaque(false);

        PlusOperatorBTN.setText("Tambah ( + )");
        PlusOperatorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusOperatorBTNActionPerformed(evt);
            }
        });

        MinOperatorBTN.setText("Kurang ( - )");
        MinOperatorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinOperatorBTNActionPerformed(evt);
            }
        });

        TimesOperatorBTN.setText("Kali ( * )");
        TimesOperatorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesOperatorBTNActionPerformed(evt);
            }
        });

        DivOperatorBTN.setText("Bagi ( / )");
        DivOperatorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivOperatorBTNActionPerformed(evt);
            }
        });

        ExitBTN.setText("Exit");
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });

        CleanBTN.setText("Bersihkan");
        CleanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AppPanelLayout = new javax.swing.GroupLayout(AppPanel);
        AppPanel.setLayout(AppPanelLayout);
        AppPanelLayout.setHorizontalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlusOperatorBTN)
                .addGap(38, 38, 38)
                .addComponent(MinOperatorBTN)
                .addGap(38, 38, 38)
                .addComponent(TimesOperatorBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(DivOperatorBTN)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(CleanBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBTN)
                .addGap(100, 100, 100))
        );
        AppPanelLayout.setVerticalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppPanelLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlusOperatorBTN)
                    .addComponent(MinOperatorBTN)
                    .addComponent(TimesOperatorBTN)
                    .addComponent(DivOperatorBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CleanBTN)
                    .addComponent(ExitBTN))
                .addGap(48, 48, 48))
        );

        AngkaPertamaTF.setBackground(new java.awt.Color(102, 102, 102));
        AngkaPertamaTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AngkaPertamaTF.setForeground(new java.awt.Color(255, 255, 255));
        AngkaPertamaTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AngkaPertamaTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AngkaPertamaTF.setOpaque(false);

        AngkaKeduaTF.setBackground(new java.awt.Color(102, 102, 102));
        AngkaKeduaTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AngkaKeduaTF.setForeground(new java.awt.Color(255, 255, 255));
        AngkaKeduaTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AngkaKeduaTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AngkaKeduaTF.setOpaque(false);

        EqualsLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EqualsLB.setText("=");

        OperationLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OperationLB.setMaximumSize(new java.awt.Dimension(25, 25));
        OperationLB.setMinimumSize(new java.awt.Dimension(25, 25));
        OperationLB.setPreferredSize(new java.awt.Dimension(25, 25));

        HasilOperasiTF.setEditable(false);
        HasilOperasiTF.setBackground(new java.awt.Color(102, 102, 102));
        HasilOperasiTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HasilOperasiTF.setForeground(new java.awt.Color(255, 255, 255));
        HasilOperasiTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        HasilOperasiTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        HasilOperasiTF.setOpaque(false);

        Copyright.setBackground(new java.awt.Color(255, 255, 255));
        Copyright.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        Copyright.setForeground(new java.awt.Color(255, 255, 255));
        Copyright.setText("By: Rizki Adji Pangestu (181011400052)");
        Copyright.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));

        javax.swing.GroupLayout BackgroundpanelLayout = new javax.swing.GroupLayout(Backgroundpanel);
        Backgroundpanel.setLayout(BackgroundpanelLayout);
        BackgroundpanelLayout.setHorizontalGroup(
            BackgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundpanelLayout.createSequentialGroup()
                .addGroup(BackgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundpanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(AngkaPertamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OperationLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(AngkaKeduaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(EqualsLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HasilOperasiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Copyright)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(BackgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundpanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        BackgroundpanelLayout.setVerticalGroup(
            BackgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundpanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(BackgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OperationLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AngkaKeduaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AngkaPertamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EqualsLB)
                        .addComponent(HasilOperasiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(Copyright)
                .addGap(21, 21, 21))
            .addGroup(BackgroundpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundpanelLayout.createSequentialGroup()
                    .addComponent(AppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        Copyright.getAccessibleContext().setAccessibleDescription("");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Backgroundpanel, gridBagConstraints);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/ranger-4df6c1b6.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Background, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlusOperatorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusOperatorBTNActionPerformed
        MathCount(AngkaPertamaTF.getText(), AngkaKeduaTF.getText(), "+");
    }//GEN-LAST:event_PlusOperatorBTNActionPerformed

    private void MinOperatorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinOperatorBTNActionPerformed
        MathCount(AngkaPertamaTF.getText(), AngkaKeduaTF.getText(), "-");
    }//GEN-LAST:event_MinOperatorBTNActionPerformed

    private void TimesOperatorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesOperatorBTNActionPerformed
        MathCount(AngkaPertamaTF.getText(), AngkaKeduaTF.getText(), "*");
    }//GEN-LAST:event_TimesOperatorBTNActionPerformed

    private void DivOperatorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivOperatorBTNActionPerformed
        MathCount(AngkaPertamaTF.getText(), AngkaKeduaTF.getText(), "/");
    }//GEN-LAST:event_DivOperatorBTNActionPerformed

    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
        dispose();
    }//GEN-LAST:event_ExitBTNActionPerformed

    private void CleanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanBTNActionPerformed
        AngkaPertamaTF.setText("");
        AngkaKeduaTF.setText("");
        OperationLB.setText("");
        HasilOperasiTF.setText("");
    }//GEN-LAST:event_CleanBTNActionPerformed

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
            java.util.logging.Logger.getLogger(OperasiHitungDuaAngkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperasiHitungDuaAngkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperasiHitungDuaAngkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperasiHitungDuaAngkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperasiHitungDuaAngkaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AngkaKeduaTF;
    private javax.swing.JTextField AngkaPertamaTF;
    private javax.swing.JPanel AppPanel;
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Backgroundpanel;
    private javax.swing.JToggleButton CleanBTN;
    private javax.swing.JLabel Copyright;
    private javax.swing.JToggleButton DivOperatorBTN;
    private javax.swing.JLabel EqualsLB;
    private javax.swing.JToggleButton ExitBTN;
    private javax.swing.JTextField HasilOperasiTF;
    private javax.swing.JToggleButton MinOperatorBTN;
    private javax.swing.JLabel OperationLB;
    private javax.swing.JToggleButton PlusOperatorBTN;
    private javax.swing.JToggleButton TimesOperatorBTN;
    // End of variables declaration//GEN-END:variables
}
