/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class koneksi {
    private Connection koneksi;
    public Connection getKoneksi(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/dbmahasiswa", "root","");
            if (koneksi != null){
            System.out.println("koneksi berhasil;");
            }
        } catch (SQLException ex) {
            System.err.println("koneksi gagal");
        }
        return koneksi;
    }
    
}
