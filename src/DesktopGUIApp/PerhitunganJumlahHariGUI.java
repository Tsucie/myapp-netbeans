package DesktopGUIApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizki Adji Pangestu (181011400052)
 */
public class PerhitunganJumlahHariGUI extends javax.swing.JFrame {

    /**
     * Creates new form PerhitunganJumlahHariGUI
     */
    public PerhitunganJumlahHariGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ApplicationPanel = new javax.swing.JPanel();
        ApplicationTitleLB = new javax.swing.JLabel();
        FormPanel = new javax.swing.JPanel();
        bulanLB = new javax.swing.JLabel();
        tahunLB = new javax.swing.JLabel();
        tahunTF = new javax.swing.JTextField();
        bulanCB = new javax.swing.JComboBox<>();
        ResultPanel = new javax.swing.JPanel();
        jmlHariLB = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        hitungBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        simpanBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Applikasi Penentu Jumlah Hari");

        ApplicationPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ApplicationPanel.setToolTipText("Applikasi Penentu Jumlah Hari");
        ApplicationPanel.setName(""); // NOI18N

        ApplicationTitleLB.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        ApplicationTitleLB.setText("Applikasi Penentu Jumlah Hari");

        FormPanel.setBackground(new java.awt.Color(51, 102, 255));
        FormPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bulanLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bulanLB.setText("Bulan");

        tahunLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tahunLB.setText("Tahun");

        tahunTF.setToolTipText("Input Tahun");

        bulanCB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bulanCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        bulanCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addComponent(tahunLB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tahunTF))
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addComponent(bulanLB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bulanCB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tahunLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tahunTF, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bulanLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bulanCB, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ResultPanel.setBackground(new java.awt.Color(68, 186, 223));
        ResultPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jmlHariLB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmlHariLB.setText("Jumlah Hari adalah :");

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jmlHariLB, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jmlHariLB, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        ButtonPanel.setBackground(new java.awt.Color(0, 153, 153));
        ButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hitungBtn.setText("Hitung");
        hitungBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungBtnActionPerformed(evt);
            }
        });

        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        keluarBtn.setText("Keluar");
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hitungBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapusBtn)
                .addGap(42, 42, 42)
                .addComponent(simpanBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keluarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitungBtn)
                    .addComponent(hapusBtn)
                    .addComponent(simpanBtn)
                    .addComponent(keluarBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ApplicationPanelLayout = new javax.swing.GroupLayout(ApplicationPanel);
        ApplicationPanel.setLayout(ApplicationPanelLayout);
        ApplicationPanelLayout.setHorizontalGroup(
            ApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplicationPanelLayout.createSequentialGroup()
                .addComponent(ApplicationTitleLB)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ApplicationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ResultPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ApplicationPanelLayout.setVerticalGroup(
            ApplicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplicationPanelLayout.createSequentialGroup()
                .addComponent(ApplicationTitleLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ApplicationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ApplicationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ApplicationPanel.getAccessibleContext().setAccessibleName("Applikasi Penentu Jumlah Hari");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bulanCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulanCBActionPerformed

    private void hitungBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungBtnActionPerformed
        if (tahunTF.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Error, Tahun belum terisi!", "ERROR", JOptionPane.WARNING_MESSAGE);
        else {
            int tahun = Integer.parseInt(tahunTF.getText());
            int jumlahHari;
            if (bulanCB.getSelectedItem().equals("Februari")) {
                if ((tahun % 4 == 0) && !(tahun % 100 == 0) || (tahun % 400 == 0))
                    jumlahHari = 29;
                else
                    jumlahHari = 28;
            }
            else if (bulanCB.getSelectedItem().equals("April") ||
                     bulanCB.getSelectedItem().equals("Juni") ||
                     bulanCB.getSelectedItem().equals("September") ||
                     bulanCB.getSelectedItem().equals("November"))
                jumlahHari = 30;
            else
                jumlahHari = 31;
            
            jmlHariLB.setText(bulanCB.getSelectedItem() + " tahun " + tahun + " adalah: " + jumlahHari);
        }
    }//GEN-LAST:event_hitungBtnActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        tahunTF.setText("");
        bulanCB.setSelectedItem("Januari");
        tahunTF.requestFocus();
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        try {
            // Make File
            BufferedWriter outFile = new BufferedWriter(new FileWriter("jumlahhari.txt"));
            // Save to file
            outFile.write(jmlHariLB.getText());
            // Show dialog for successfull save file
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
            // Close the output stream
            outFile.close();
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        dispose();
    }//GEN-LAST:event_keluarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PerhitunganJumlahHariGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganJumlahHariGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganJumlahHariGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganJumlahHariGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganJumlahHariGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ApplicationPanel;
    private javax.swing.JLabel ApplicationTitleLB;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JComboBox<String> bulanCB;
    private javax.swing.JLabel bulanLB;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JButton hitungBtn;
    private javax.swing.JLabel jmlHariLB;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JLabel tahunLB;
    private javax.swing.JTextField tahunTF;
    // End of variables declaration//GEN-END:variables
}
