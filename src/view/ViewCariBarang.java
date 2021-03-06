/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import util.Koneksi;

/**
 *
 * @author User
 */
public class ViewCariBarang extends javax.swing.JFrame {

    /**
     * Creates new form ViewCariBarang
     */
    public ViewCariBarang() {
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

        jLabel1 = new javax.swing.JLabel();
        JT_Cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Cari = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cari Barang :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        JT_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_CariActionPerformed(evt);
            }
        });
        getContentPane().add(JT_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 320, 30));

        TB_Cari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TB_Cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TB_CariKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TB_Cari);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 430, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JT_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_CariActionPerformed
        // TODO add your handling code here:
        String nama = JT_Cari.getText();
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("id");
        table.addColumn("nama");
        table.addColumn("jenis");
        table.addColumn("jumlah");
        

        TB_Cari.setModel(table);

        try {
            Koneksi Koneksi = new Koneksi();
            Koneksi.koneksidatabase();
            String queryTampil = "select * from dbl_latihan where nama like '%"+nama+"%'";

            ResultSet res = Koneksi.state.executeQuery(queryTampil);

            while (res.next()) {
                table.addRow(new Object[]{
                    res.getString("id"), res.getString("nama"), res.getString("quis"), res.getString("tugas")
                        ,res.getString("uts"),res.getString("uas"),res.getString("totalNilai")
                });
                TB_Cari.setModel(table);
                

            }

        } catch (SQLException e) {
            System.err.println(""+e);
        }
    }//GEN-LAST:event_JT_CariActionPerformed

    private void TB_CariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TB_CariKeyReleased
        // TODO add your handling code here:
        String nama = JT_Cari.getText();
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("id");
        table.addColumn("nama");
        table.addColumn("Jenis");
        table.addColumn("Jumlah");
  
        TB_Cari.setModel(table);

        try {
            Koneksi Koneksi = new Koneksi();
            Koneksi.koneksidatabase();
            String queryTampil = "select * from dbl_latihan where nama like '%"+nama+"%'";

            ResultSet res = Koneksi.state.executeQuery(queryTampil);

            while (res.next()) {
                table.addRow(new Object[]{
                    res.getString("id"), res.getString("nama"), res.getString("quis"), res.getString("tugas")
                        ,res.getString("uts"),res.getString("uas"),res.getString("totalNilai")
                });
                TB_Cari.setModel(table);
                

            }

        } catch (SQLException e) {
            System.err.println(""+e);
        }
        
    }//GEN-LAST:event_TB_CariKeyReleased

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
            java.util.logging.Logger.getLogger(ViewCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCariBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCariBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JT_Cari;
    private javax.swing.JTable TB_Cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
