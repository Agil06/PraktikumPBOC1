/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Nama: Agil Yudis Wibawa
//NIM : 24060124120045
//Lab : C1

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author AGIL
 */
public class PBO10_24060124120045 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Rahasia"; // Sesuaikan password MySQL-mu (sama dengan MysqlUtility)

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi ke MySQL BERHASIL!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT VERSION()");

            if (rs.next()) {
                System.out.println("Versi MySQL: " + rs.getString(1));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL tidak ditemukan.");
            System.out.println("Pastikan mysql-connector-j sudah masuk ke Libraries.");
        } catch (SQLException e) {
            System.out.println("Koneksi ke MySQL GAGAL.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}