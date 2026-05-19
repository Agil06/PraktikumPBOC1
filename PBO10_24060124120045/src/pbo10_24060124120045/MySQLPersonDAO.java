package pbo10_24060124120045;

import java.sql.*;

//Nama: Agil Yudis Wibawa
//NIM : 24060124120045
//Lab : C1

/**
 * File: MySQLPersonDAO.java
 * Deskripsi: implementasi PersonDAO untuk MySQL
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "Salatiga@01");
        
        // kerjakan mysql query
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // tutup koneksi database
        con.close();
    }
}