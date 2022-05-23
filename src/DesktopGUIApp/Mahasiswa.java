/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesktopGUIApp;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RizkiAdjiPangestu
 */
public class Mahasiswa extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    private int drawLength = 100;

    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents(this.drawLength);
    }

    private void initComponents(int drawLength) {
        java.awt.GridBagConstraints gridBagConstraints;

        BackgroundPanel = new javax.swing.JPanel();
        AppPanel = new javax.swing.JPanel();
        OperationPanel = new javax.swing.JPanel();
        inputBTN = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();
        hapusBTN = new javax.swing.JButton();
        TableTitleLB = new javax.swing.JLabel();
        InputTitleLB = new javax.swing.JLabel();
        nimLB = new javax.swing.JLabel();
        nimTF = new javax.swing.JTextField();
        namaLB = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jkCB = new javax.swing.JComboBox<>();
        namaLB1 = new javax.swing.JLabel();
        alamatLB = new javax.swing.JLabel();
        alamatJSP = new javax.swing.JScrollPane();
        alamatTAF = new javax.swing.JTextArea();
        exitBTN = new javax.swing.JButton();
        TableScrollPane = new javax.swing.JScrollPane();
        MahasiswaTbl = new javax.swing.JTable();
        BackgroundLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        BackgroundPanel.setOpaque(false);

        AppPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 4, true), "Applikasi CRUD Mahasiswa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        AppPanel.setOpaque(false);

        OperationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Operasi Data", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        OperationPanel.setOpaque(false);

        inputBTN.setText("Input");
        inputBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBTNActionPerformed(evt);
            }
        });

        editBTN.setText("Edit");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        hapusBTN.setText("Hapus");
        hapusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OperationPanelLayout = new javax.swing.GroupLayout(OperationPanel);
        OperationPanel.setLayout(OperationPanelLayout);
        OperationPanelLayout.setHorizontalGroup(
            OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapusBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );
        OperationPanelLayout.setVerticalGroup(
            OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapusBTN)
                .addContainerGap())
        );

        TableTitleLB.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        TableTitleLB.setForeground(new java.awt.Color(255, 255, 255));
        TableTitleLB.setText("Data Mahasiswa");

        InputTitleLB.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        InputTitleLB.setForeground(new java.awt.Color(255, 255, 255));
        InputTitleLB.setText("Input Data Mahasiswa");

        nimLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nimLB.setForeground(new java.awt.Color(255, 255, 255));
        nimLB.setLabelFor(nimTF);
        nimLB.setText("NIM");

        nimTF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nimTF.setToolTipText("Input NIM Mahasiswa");

        namaLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namaLB.setForeground(new java.awt.Color(255, 255, 255));
        namaLB.setLabelFor(namaTF);
        namaLB.setText("Nama");

        namaTF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        namaTF.setToolTipText("Input Nama Mahasiswa");

        jkCB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jkCB.setMaximumRowCount(2);
        jkCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jkCB.setToolTipText("Pilih Jenis kelamin");

        namaLB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namaLB1.setForeground(new java.awt.Color(255, 255, 255));
        namaLB1.setLabelFor(jkCB);
        namaLB1.setText("Jenis Kelamin");

        alamatLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alamatLB.setForeground(new java.awt.Color(255, 255, 255));
        alamatLB.setLabelFor(alamatTAF);
        alamatLB.setText("Alamat");

        alamatTAF.setColumns(20);
        alamatTAF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        alamatTAF.setRows(5);
        alamatTAF.setToolTipText("Input Alamat Mahasiswa");
        alamatTAF.setWrapStyleWord(true);
        alamatJSP.setViewportView(alamatTAF);

        exitBTN.setText("X");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AppPanelLayout = new javax.swing.GroupLayout(AppPanel);
        AppPanel.setLayout(AppPanelLayout);
        AppPanelLayout.setHorizontalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namaLB1)
                    .addComponent(InputTitleLB)
                    .addComponent(nimLB)
                    .addComponent(namaLB)
                    .addComponent(namaTF)
                    .addComponent(jkCB, 0, 210, Short.MAX_VALUE)
                    .addComponent(nimTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppPanelLayout.createSequentialGroup()
                        .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamatLB)
                            .addComponent(alamatJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(OperationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addComponent(TableTitleLB)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AppPanelLayout.setVerticalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OperationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AppPanelLayout.createSequentialGroup()
                        .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InputTitleLB)
                            .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nimLB)
                            .addComponent(alamatLB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(alamatJSP)
                            .addGroup(AppPanelLayout.createSequentialGroup()
                                .addComponent(nimTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaLB1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jkCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TableTitleLB)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        nimTF.getAccessibleContext().setAccessibleName("");

        MahasiswaTbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MahasiswaTbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Object[] thead = { "NIM", "Nama", "Jenis kelamin", "Alamat" };
        model.setColumnIdentifiers(thead);
        MahasiswaTbl.setModel(this.model);
        MahasiswaCRUD.GetList(this.model, drawLength);

        TableScrollPane.setViewportView(MahasiswaTbl);
        if (MahasiswaTbl.getColumnModel().getColumnCount() > 0) {
            MahasiswaTbl.getColumnModel().getColumn(1).setResizable(false);
            MahasiswaTbl.getColumnModel().getColumn(2).setResizable(false);
            MahasiswaTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(TableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(BackgroundPanel, gridBagConstraints);

        BackgroundLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/LcSuXn.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(BackgroundLB, gridBagConstraints);

        pack();
    }

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void inputBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBTNActionPerformed
        String[] data = new String[4];
        data[0] = nimTF.getText();
        data[1] = namaTF.getText();
        data[2] = jkCB.getSelectedItem().toString();
        data[3] = alamatTAF.getText();
        MahasiswaCRUD.Create(data, this.model);
        nimTF.setText("");
        namaTF.setText("");
        jkCB.setSelectedIndex(0);
        alamatTAF.setText("");
    }//GEN-LAST:event_inputBTNActionPerformed

    private void hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTNActionPerformed
        int rowIndex = MahasiswaTbl.getSelectedRow();
        String nim = MahasiswaTbl.getValueAt(rowIndex, 0).toString();
        MahasiswaCRUD.Delete(nim, rowIndex, this.model);
    }//GEN-LAST:event_hapusBTNActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
        int rowIndex = MahasiswaTbl.getSelectedRow();
        String nim = MahasiswaTbl.getValueAt(rowIndex, 0).toString();
        String[] data = new String[3];
        data[0] = MahasiswaTbl.getValueAt(rowIndex, 1).toString();
        data[1] = MahasiswaTbl.getValueAt(rowIndex, 2).toString();
        data[2] = MahasiswaTbl.getValueAt(rowIndex, 3).toString();
        MahasiswaCRUD.Update(nim, rowIndex, data, this.model);
    }//GEN-LAST:event_editBTNActionPerformed
    
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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppPanel;
    private javax.swing.JLabel BackgroundLB;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel InputTitleLB;
    private javax.swing.JTable MahasiswaTbl;
    private javax.swing.JPanel OperationPanel;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TableTitleLB;
    private javax.swing.JScrollPane alamatJSP;
    private javax.swing.JLabel alamatLB;
    private javax.swing.JTextArea alamatTAF;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton hapusBTN;
    private javax.swing.JButton inputBTN;
    private javax.swing.JComboBox<String> jkCB;
    private javax.swing.JLabel namaLB;
    private javax.swing.JLabel namaLB1;
    private javax.swing.JTextField namaTF;
    private javax.swing.JLabel nimLB;
    private javax.swing.JTextField nimTF;
    // End of variables declaration//GEN-END:variables
}
