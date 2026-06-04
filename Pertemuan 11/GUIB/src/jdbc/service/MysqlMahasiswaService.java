/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author USER
 */
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }

    /** * Membuat objek mahasiswa dari ResultSet
     */
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    /** * Menambahkan data mahasiswa 
     */
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data mahasiswa berhasil ditambahkan.");
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal menambahkan data: " + sqle.getMessage());
        }
    }

    /** * Update data mahasiswa 
     */
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data mahasiswa berhasil di-update.");
            } else {
                System.out.println("Data mahasiswa dengan ID " + mhs.getId() + " tidak ditemukan.");
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal meng-update data: " + sqle.getMessage());
        }
    }

    /** * Delete data mahasiswa sesuai id 
     */
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data mahasiswa berhasil dihapus.");
            } else {
                System.out.println("Data mahasiswa dengan ID " + id + " tidak ditemukan.");
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal menghapus data: " + sqle.getMessage());
        }
    }

    /** * Ambil mahasiswa sesuai id 
     */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    mhs = makeMhsObject(rs);
                }
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal mengambil data berdasarkan ID: " + sqle.getMessage());
        }
        return mhs;
    }

    /** * Ambil semua isi tabel mahasiswa 
     */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try (PreparedStatement ps = koneksi.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMhs.add(mhs);
            }
        } catch (SQLException sqle) {
            System.out.println("Gagal mengambil semua data: " + sqle.getMessage());
        }
        return listMhs;
    }
}
