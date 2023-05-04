/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Bach Long
 */
public class SanPhamDAO {
    public static ArrayList <SanPham> dsSP()
    {
        ArrayList <SanPham> dsSP = new ArrayList<SanPham>();
        try {
            
            String querry = "Select *  from SanPham";
            DataProvider dataProvider = new DataProvider();
            dataProvider.ketNoi();
            
            ResultSet rs = dataProvider.executeQuery(querry);
            
            while(rs.next())
            {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("MaSP"));
                sp.setMaLoai(rs.getInt("MaLoai"));
                sp.setTenSp(rs.getString("TenSP"));
                sp.setMau(rs.getString("Mau"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setDonGia(rs.getInt("DonGia"));
                sp.setMaNCC(rs.getInt("MaNCC"));
                dsSP.add(sp);
            }
            dataProvider.closeConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsSP;
        
    }
    
}
