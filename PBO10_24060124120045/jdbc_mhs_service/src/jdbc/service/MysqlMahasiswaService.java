/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jdbc.service;
import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author AGIL
 */


public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) throws SQLException {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (" + mhs.getId() + ", '" + mhs.getNama() + "')";
        Statement s = koneksi.createStatement();
        s.executeUpdate(query);
        System.out.println("Berhasil insert");
    }

    public void update(Mahasiswa mhs) throws SQLException {
        String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
        Statement s = koneksi.createStatement();
        s.executeUpdate(query);
        System.out.println("Berhasil update");
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        Statement s = koneksi.createStatement();
        s.executeUpdate(query);
        System.out.println("Berhasil delete");
    }

    public Mahasiswa getById(int id) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id = " + id;
        Statement s = koneksi.createStatement();
        ResultSet rs = s.executeQuery(query);
        if (rs.next()) {
            mhs.setId(rs.getInt("id"));
            mhs.setNama(rs.getString("nama"));
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        Statement s = koneksi.createStatement();
        ResultSet rs = s.executeQuery(query);
        while (rs.next()) {
            Mahasiswa m = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            listMhs.add(m);
        }
        return listMhs;
    }
}