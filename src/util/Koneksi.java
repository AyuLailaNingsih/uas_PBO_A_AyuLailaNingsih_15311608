/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Koneksi {
    public Connection connect ;
    public Statement state ;
    public ResultSet res ;
    String namadatabase = "jdbc:mysql://localhost/db_uas_15311608";
    public Koneksi koneksi ;
    
    public void koneksidatabase(){
        try {
            connect = DriverManager.getConnection(namadatabase, "root","12345678");
            System.out.println("Koneksi Tidak Bermasalah");
            state = connect.createStatement();
        } catch (Exception e) {
            System.err.println("Cek URL, Username Host Passord Host");
            System.err.println(""+e);
        }
    }
}
