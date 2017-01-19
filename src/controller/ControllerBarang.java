/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Koneksi;

/**
 *
 * @author User
 */
public class ControllerBarang {
    Koneksi ayu = new Koneksi();
    private String querrySimpan;
    public void simpanbarang (model.ModelBarang mt){
        ayu.koneksidatabase();
        String querrySimpan = "insert into tbl_barang (nama,jenis,jumlah) values ('"+mt.getnama()+"','"+mt.getjenis()+"','"+mt.getJumlah()+"')";
        try {
            ayu.state.executeUpdate(querrySimpan);
            JOptionPane.showMessageDialog(null, mt);
        } catch (SQLException | HeadlessException ex) {
            System.err.println("error"+ex);
            JOptionPane.showMessageDialog(null,"Data Tidak Terhapus");
        }
    }
    public void ubahdata (model.ModelBarang mt){
        ayu.koneksidatabase();
        try {
            int id =mt.getId();
            String nama =mt.getNama();
            String jenis =mt.getjenis();
            int jumlah =mt.getJumlah();
            ayu.state.executeUpdate(querrySimpan);
            JOptionPane.showMessageDialog(null, "Data Berhasil Terupdate");
        } catch (Exception e) {
            System.err.println("error"+e);
            JOptionPane.showMessageDialog(null,"Data Tidak Berubah");
        }
    }

    
}
