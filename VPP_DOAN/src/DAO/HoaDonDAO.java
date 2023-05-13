/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.HoaDon;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nguyen Bach Long
 */
public class HoaDonDAO {
    
    
    public static ArrayList<HoaDon> layDsHD()
    {
        ArrayList<HoaDon> dsHd = new ArrayList<HoaDon>();
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        String query = String.format("SELECT HOADON.MaHD, KHACHHANG.TenKH, NHANVIEN.Hoten, HOADON.ThanhTien, HOADON.NgayBan, HOADON.TrangThai\n" +
                                    "FROM HOADON\n" +
                                    "LEFT JOIN KHACHHANG ON HOADON.MaKH = KHACHHANG.MaKH\n" +
                                    "JOIN NHANVIEN ON HOADON.MaNV = NHANVIEN.MaNV\n"
                                    );
        ResultSet rs =  dataProvider.executeQuery(query);
        
      
        try {
            while(rs.next())
            {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setTenKhachHang(rs.getString("TenKH"));
                hd.setTenNhanVien(rs.getString("Hoten"));
                hd.setThanhTien(rs.getInt("ThanhTien"));
                hd.setTrangThai(rs.getString("TrangThai"));
                hd.setNgayThang(rs.getString("NgayBan"));
                dsHd.add(hd);
            }   
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsHd;
    }
    
    
    public static ArrayList<HoaDon> layDsHDTheoNgay(String ngBD, String ngKT)
    {
        ArrayList<HoaDon> dsHd = new ArrayList<HoaDon>();
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        String query = String.format("SELECT HOADON.MaHD, KHACHHANG.TenKH, NHANVIEN.Hoten, HOADON.ThanhTien, HOADON.NgayBan, HOADON.TrangThai\n" +
                                    "FROM HOADON\n" +
                                    "LEFT JOIN KHACHHANG ON HOADON.MaKH = KHACHHANG.MaKH\n" +
                                    "JOIN NHANVIEN ON HOADON.MaNV = NHANVIEN.MaNV\n" +
                                    "WHERE HOADON.NgayBan >= '"+ngBD+"' AND HOADON.NgayBan <= '"+ngKT+"'");
        ResultSet rs =  dataProvider.executeQuery(query);
        
      
        try {
            while(rs.next())
            {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setTenKhachHang(rs.getString("TenKH"));
                hd.setTenNhanVien(rs.getString("Hoten"));
                hd.setThanhTien(rs.getInt("ThanhTien"));
                hd.setTrangThai(rs.getString("TrangThai"));
                hd.setNgayThang(rs.getString("NgayBan"));
                dsHd.add(hd);
            }   
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsHd;
    }
    
    
    
    
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
    
    public static boolean capNhapTrangThai(int maHD, String trangThai, Double thanhTien)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        String query = String.format("Update HoaDon set ThanhTien = "+thanhTien+", TrangThai = '"+trangThai+"' where MaHD = "+maHD+"");
        dataProvider.executeUpdate(query);
        return true;
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
    
    public static int demSoHoaDon()
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        String query = "Select count(MaHD) as soLuongHD from HoaDon";
        ResultSet rs = dataProvider.executeQuery(query);
        int soHd =0;
        try {
            while(rs.next())
            {
                soHd = rs.getInt("soLuongHD");
            }
            return soHd;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return 0;
         
    }
    
    public static Double tinhTongTienNgay(String txt)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        String query = "SELECT SUM(ThanhTien) AS TongTienNgay FROM HoaDon WHERE Day(NgayBan) = '"+txt+"'";
        ResultSet rs = dataProvider.executeQuery(query);
        Double tongTien =0.0;
        try {
            while(rs.next())
            {
                tongTien = rs.getDouble("TongTienNgay");
            }
            return tongTien;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return 0.0;
         
    }
    public static Double tinhTongTienThang(String txt)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        String query = "SELECT SUM(ThanhTien) AS TongTienThang FROM HoaDon WHERE MONTH(NgayBan) = '"+txt+"'";
        ResultSet rs = dataProvider.executeQuery(query);
        Double tongTien =0.0;
        try {
            while(rs.next())
            {
                tongTien = rs.getDouble("TongTienThang");
            }
            return tongTien;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }
    
}
