/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesktopGUIApp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RizkiAdjiPangesu
 */
public class Koneksi {
    private static Connection _conn;
    
    public static Connection KoneksiDB() throws SQLException {
        if (_conn == null) {
            try {
                String connStr = "jdbc:mysql://localhost:3306/mahasiswa";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                _conn = (Connection) DriverManager.getConnection(connStr, user, pass);
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Koneksi gagal. Error: " + ex.getMessage());
            }
        }
        return _conn;
    }
}
