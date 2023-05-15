/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Bach Long
 */
public class KhachHangDAO {
    
    
    
    public static ArrayList<KhachHang> timKiemKhachHang(String txt)
    {
        ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        String querry = "select *  from KhachHang where SDT Like '%"+txt+"%'";
        ResultSet rs =  dataProvider.executeQuery(querry);
        try {
            while(rs.next())
            {
                KhachHang kh =new KhachHang();
                kh.setMaKh(rs.getInt("MaKH"));
                kh.setTenKh(rs.getString("TenKH"));
                kh.setPhai(rs.getString("Phai"));
                kh.setSdt(rs.getString("SDT"));
                kh.setDiaChi(rs.getString("DiaChi"));
                dskh.add(kh);
                
            }
            dataProvider.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dskh;
    }
    
    public static boolean thẹmKhachHang(KhachHang kh)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        String query =  "Insert Into KHACHHANG(TenKH, Phai, SDT, DiaChi) values(N'"+kh.getTenKh()+"', N'"+kh.getPhai()+"','"+kh.getSdt()+"',N'"+kh.getDiaChi()+"')";
        int i =  dataProvider.executeUpdate(query);
        if(i >= 0 )
        {
            return true;
        }
        return false;
    }
    
    
    public static ArrayList <KhachHang> dsKh()
    {
        ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
        
        String query = "select * from khachHang";
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        ResultSet rs;
        rs = dataProvider.executeQuery(query);
        
        
        try {
            while(rs.next())
            {
                KhachHang kh =new KhachHang();
                kh.setMaKh(rs.getInt("MaKH"));
                kh.setTenKh(rs.getString("TenKH"));
                kh.setPhai(rs.getString("Phai"));
                kh.setSdt(rs.getString("SDT"));
                kh.setDiaChi(rs.getString("DiaChi"));
                dskh.add(kh);
                
            }
            dataProvider.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dskh; 
    }
    
    public static KhachHang LayThongTinKhachBangMaKH(int maKh)
    {
        KhachHang kh = new KhachHang();
        String query = "select * from khachHang where maKh = "+maKh+"";
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        ResultSet rs;
        rs = dataProvider.executeQuery(query);
        try {
            while(rs.next())
            {
                kh.setMaKh(rs.getInt("MaKH"));
                kh.setTenKh(rs.getString("TenKH"));
                kh.setPhai(rs.getString("Phai"));
                kh.setSdt(rs.getString("SDT"));
                kh.setDiaChi(rs.getString("DiaChi"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kh;
    }
    
    public static boolean CapNhatKhachHang(int maKh, Pojo.KhachHang kh )
    {
        
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        String query = "Update KhachHang Set tenKh = '"+kh.getTenKh()+"', phai ='"+kh.getPhai()+"', SDT ='"+kh.getSdt()+"' , diaChi = '"+kh.getDiaChi()+"' where makh = "+maKh+"";
        int i = dataProvider.executeUpdate(query);
        
        if(i >=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }
}
