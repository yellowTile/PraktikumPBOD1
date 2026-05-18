/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbdc.utilities;

/**
 *
 * @author USER
 */


package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // 1. Menggunakan driver baru untuk MySQL Connector versi 8.0+
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // 2. Menambahkan ?serverTimezone=UTC untuk menghindari error zona waktu
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs?serverTimezone=UTC";
                
                // Sesuaikan username dan password database kamu
                String user = "student";
                String password = "rahasia";
                
                koneksi = DriverManager.getConnection(url, user, password);
                
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil!");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver (Pastikan JAR sudah masuk Classpath): " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi ke Database: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
