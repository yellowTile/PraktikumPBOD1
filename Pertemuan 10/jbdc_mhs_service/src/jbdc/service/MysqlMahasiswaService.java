/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbdc.service;

/**
 *
 * @author USER
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlConnection.getConnection();
    }

    // Membuat object Mahasiswa dari ResultSet
    public Mahasiswa makeMhsObject(ResultSet rs) {
        try {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setId(rs.getInt("id"));
            mhs.setNama(rs.getString("nama"));
            return mhs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Tambah data mahasiswa
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa(id, nama) VALUES (?, ?)";

            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println("Data berhasil ditambahkan");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama=? WHERE id=?";

            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

            System.out.println("Data berhasil diupdate");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete data mahasiswa berdasarkan id
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id=?";

            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Data berhasil dihapus");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Ambil mahasiswa berdasarkan id
    public Mahasiswa getById(int id) {

        Mahasiswa mhs = null;

        try {
            String query = "SELECT * FROM mahasiswa WHERE id=?";

            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mhs;
    }

    // Ambil semua data mahasiswa
    public List<Mahasiswa> getAll() {

        List<Mahasiswa> listMhs = new ArrayList<>();

        try {
            String query = "SELECT * FROM mahasiswa";

            Statement stmt = koneksi.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                listMhs.add(makeMhsObject(rs));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listMhs;
    }
}
