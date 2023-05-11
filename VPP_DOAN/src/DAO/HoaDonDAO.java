/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.HoaDon;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nguyen Bach Long
 */
public class HoaDonDAO {
    
    
    
    
    public static boolean Them1HD(HoaDon hd)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        String query  = String.format("Insert into HoaDon (MaNV, NgayBan, TrangThai)"
                + " values ("+hd.getMaNV()+",'"+hd.getNgayThang()+"', '"+hd.getTrangThai()+"' )");
        
        if(dataProvider.executeUpdate(query) >= 1)
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
    
    public static HoaDon layHdVuaTao()
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        ResultSet rs = dataProvider.executeQuery("Select TOP 1 * from HoaDon Order BY MaHD DeSC");
        HoaDon hd = new HoaDon();
        try {
            while (rs.next())
            {
                
                hd.setMaHD(rs.getInt("MaHd"));
                hd.setMaKH(rs.getInt("MaKh"));
                hd.setMaNV(rs.getInt("MaNV"));
                hd.setNgayThang(rs.getString("NgayBan"));
                hd.setThanhTien(rs.getInt("ThanhTien"));
                hd.setTrangThai(rs.getString("TrangThai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hd;
        
     
    }
    
    public static boolean capNhapHoaDon(int maHD, HoaDon hd)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        String query = String.format("Update HoaDon set MaKH = "+hd.getMaKH()+", MaNV = "+hd.getMaNV()+", ThanhTien = "+hd.getThanhTien()+
                ", NgayBan = '"+hd.getNgayThang()+"', TrangThai = '"+hd.getTrangThai()+"' where MaHD = "+maHD+"");
        dataProvider.executeUpdate(query);
        return true;
    }
    
}
