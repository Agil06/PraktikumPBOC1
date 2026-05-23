package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Sesuaikan username dan password database kamu di sini
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root"; 
                String password = "Rahasia"; 

                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Database Berhasil!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Koneksi Database Gagal: " + e.getMessage());
            }
        }
        return connection;
    }
}