package DAO;


import Pojo.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnNguyen
 */
public class NhaCungCapDAO {
    public static ArrayList<NhaCungCap> layDanhSachNhaCungCap()
        {
            ArrayList<NhaCungCap> dsncc = new ArrayList<>();
            try{
            String sql = "select * from NCC where TrangThai = N'Hiện'";
            DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
            ResultSet resultSet = dataProvider.executeQuery(sql);
            while(resultSet.next())
            {
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNCC(resultSet.getInt("MaNCC"));
                ncc.setTenNCC(resultSet.getString("TenNCC"));
                ncc.setDiaChi(resultSet.getString("DiaChi"));
                ncc.setSDT(resultSet.getString("SDT"));
                dsncc.add(ncc);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dsncc;
        }
     public static ArrayList<NhaCungCap> layDanhSachNhaCungCapBiAn()
        {
            ArrayList<NhaCungCap> dsncc = new ArrayList<>();
            try{
            String sql = "select * from NCC where TrangThai = N'Ẩn'";
           DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
            ResultSet resultSet = dataProvider.executeQuery(sql);
            while(resultSet.next())
            {
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNCC(resultSet.getInt("MaNCC"));
                ncc.setTenNCC(resultSet.getString("TenNCC"));
                ncc.setDiaChi(resultSet.getString("DiaChi"));
                ncc.setSDT(resultSet.getString("SDT"));
                dsncc.add(ncc);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dsncc;
        }
    public static boolean anNhaCungCap(String ma)
    {
        boolean kq = false;
        int maNCC;
        try {
            maNCC = Integer.parseInt(ma);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return false;
        }
        String sql = String.format("update NCC set TrangThai = N'Ẩn' WHERE MaNCC = %d", maNCC);
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        int n = dataProvider.executeUpdate(sql);
        if(n>=0)
        {
            kq = true;
        }
       dataProvider.closeConnection();
        return kq;
    }
    
    public static boolean hienNhaCungCap(String ma)
    {
        boolean kq = false;
        int maNCC;
        try {
            maNCC = Integer.parseInt(ma);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return false;
        }
        String sql = String.format("update NCC set TrangThai = N'Hiện' WHERE MaNCC = %d", maNCC);
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        int n = dataProvider.executeUpdate(sql);
        if(n>=0)
        {
            kq = true;
        }
       dataProvider.closeConnection();
        return kq;
    }

    public static boolean themNhaCungCap(String ten, String diaChi, String sdt)
    {
        boolean kq = false;
        String sql = String.format("INSERT INTO NCC([TenNCC],[DiaChi],[SDT]) VALUES (N'%s',N'%s','%s')", ten,diaChi,sdt);
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        int n=dataProvider.executeUpdate(sql);
        if(n>0)
        {
            kq = true;
        }
       dataProvider.closeConnection();
        return kq;
    }

   public static boolean UpdateNhaCungCap(String ten, String diaChi, String sdt) {
        boolean kq = false;
        String sql = String.format("update NCC set DiaChi=N'%s', SDT='%s' where TenNCC=N'%s'",  diaChi, sdt, ten);
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        int n = dataProvider.executeUpdate(sql);
        if (n > 0) {
            kq = true;
        }
        dataProvider.closeConnection();
        return kq;
    }

     public static boolean kiemTraNhaCungCap(String ten)
     {
        try{
            String sql = String.format("select * from NCC where TenNCC = N'%s'", ten);
            DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
            ResultSet resultSet = dataProvider.executeQuery(sql);
            if(resultSet.next())
            {
               return true;
            }
            }catch(SQLException e){
               e.getMessage();
            }
        return false;
     }
         
     public static NhaCungCap TimNCCSPTheoMa(String ma)
        {
            NhaCungCap ncc = new NhaCungCap();
            try{
            String sql = String.format("select TenNCC from SANPHAM, NCC where SANPHAM.MaNCC = NCC.MaNCC and MaSP='%s'", ma);
            DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
            ResultSet resultSet = dataProvider.executeQuery(sql);
            while(resultSet.next())
            {
                ncc.setTenNCC(resultSet.getString("TenNCC"));
            }  
            }catch(SQLException e){
               e.getMessage();
            }
            return ncc;
        }
     
      public static NhaCungCap TimMaNCCTheoTenNCC(String ten)
        {
            NhaCungCap ncc = new NhaCungCap();
            try{
            String sql = String.format("select MaNCC from NCC where TenNCC=N'%s'", ten);
            DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
            ResultSet resultSet = dataProvider.executeQuery(sql);
            while(resultSet.next())
            {
                ncc.setMaNCC(resultSet.getInt("MaNCC"));
            }  
            }catch(SQLException e){
               e.getMessage();
            }
            return ncc;
        }
     
}
