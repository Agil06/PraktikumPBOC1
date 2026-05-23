package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    private Connection conn;

    public MysqlMahasiswaService() {
        this.conn = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, mhs.getNama());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, mhs.getNama());
            stmt.setInt(2, mhs.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }

    public void indexReset() {
        // Mengosongkan tabel dan mengembalikan auto_increment id ke 1
        String query = "TRUNCATE TABLE mahasiswa";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isEmpty() {
        String query = "SELECT COUNT(*) AS total FROM mahasiswa";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                return rs.getInt("total") == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}