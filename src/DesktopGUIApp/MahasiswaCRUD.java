/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesktopGUIApp;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author TheGamer
 */
public class MahasiswaCRUD {
    public static DefaultTableModel GetList(DefaultTableModel model, int drawLength) {
        try {
            Connection _conn = Koneksi.KoneksiDB();
            Statement _cmd = _conn.createStatement();
            ResultSet data = _cmd.executeQuery("SELECT * FROM `t_mhs`");
            
            Object[] dataColumn = new Object[model.getColumnCount()];
            for (int i=0; i < drawLength; i++) {
                if (data.next()) {
                    dataColumn[0] = data.getString("nim");
                    dataColumn[1] = data.getString("nama_mhs");
                    dataColumn[2] = data.getString("jk");
                    dataColumn[3] = data.getString("alamat");
                    
                    model.addRow(dataColumn);
                }
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                null,
                "Kesalahan saat mengambil data ke database\n"+ ex.getMessage(),
                "Error!",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        return model;
    }
    
    public static Object[] GetData(String nim, DefaultTableModel model) {
        Object[] dataColumn = new Object[model.getColumnCount()];
        try {
            Connection _conn = Koneksi.KoneksiDB();
            Statement _cmd = _conn.createStatement();
            ResultSet data = _cmd.executeQuery("SELECT * FROM `t_mhs` WHERE (nim = '"+nim+"')");
            
            if (data.next()) {
                dataColumn[0] = data.getString("nim");
                dataColumn[1] = data.getString("nama_mhs");
                dataColumn[2] = data.getString("jk");
                dataColumn[3] = data.getString("alamat");
            }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(
                null,
                "Kesalahan saat mengambil data ke database\n"+ ex.getMessage(),
                "Error!",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        return dataColumn;
    }
    
    public static void Create(String[] data, DefaultTableModel model) {
        try {
            Connection _conn = Koneksi.KoneksiDB();
            String sqlStr = "INSERT INTO `t_mhs` (`nim`,`nama_mhs`,`jk`,`alamat`) "+
                                "VALUES ('"+data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"')";
            PreparedStatement _cmd = _conn.prepareStatement(sqlStr);
            _cmd.execute();
            model.addRow(GetData(data[0], model));
            
            JOptionPane.showMessageDialog(null, "Data berhasil dimasukan ke database");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal di masukan ke database\n Error: "+ ex.getMessage());
        }
    }
    
    public static void Update(String nim, int rowIndex, String data[], DefaultTableModel model) {
        try {
            Connection _conn = Koneksi.KoneksiDB();
            String sqlStr = "UPDATE `t_mhs` SET "+
                                "`nama_mhs`='"+data[0]+
                                "',`jk`='"+data[1]+
                                "',`alamat`='"+data[2]+"' "+
                            "WHERE (nim = '"+nim+"')";
            PreparedStatement _cmd = _conn.prepareStatement(sqlStr);
            _cmd.execute();
            model.setValueAt(data[0], rowIndex, 1);
            model.setValueAt(data[1], rowIndex, 2);
            model.setValueAt(data[2], rowIndex, 3);
            
            JOptionPane.showMessageDialog(null, "Data berhasil di edit ke database");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal di edit dari database\n Error: "+ ex.getMessage());
        }
    }
    
    public static void Delete(String nim, int rowIndex, DefaultTableModel model)
    {
        try {
            Connection _conn = Koneksi.KoneksiDB();
            String sqlStr = "DELETE FROM `t_mhs` WHERE ( nim = '"+nim+"')";
            PreparedStatement _cmd = _conn.prepareStatement(sqlStr);
            _cmd.execute();
            model.removeRow(rowIndex);
            
            JOptionPane.showMessageDialog(null, "Data berhasil hapus dari database");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal di hapus dari database\n Error: "+ ex.getMessage());
        }
    }
}
