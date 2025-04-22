/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class koneksi {
    public Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/data_barang"; // Ganti dengan URL database kamu
            String user = "username"; // Ganti dengan username database kamu
            String password = "password"; // Ganti dengan password database kamu
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
}
