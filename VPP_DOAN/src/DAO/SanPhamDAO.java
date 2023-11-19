package DAO;


import Pojo.SanPham;
import java.beans.Statement;
import java.sql.Connection;
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
public class SanPhamDAO{
    
    
    public static ArrayList<Pojo.SanPham> timKiemSanPham (String txt)
     {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = "select *  from SanPham where  tenSP LIKE '%"+txt+"%'";
             DataProvider provider = new DataProvider();
             provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                sp.setSoLuong(resultSet.getInt("SoLuong"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
     }
    public static ArrayList<Pojo.SanPham> layDanhSachSanPham()
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = "select MaSP, TenLoai,TenSP,Mau,DonGia, SoLuong,TenNCC, SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC";
             DataProvider provider = new DataProvider();
             provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                sp.setSoLuong(resultSet.getInt("SoLuong"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
     public static ArrayList<Pojo.SanPham> layDanhSachSanPhamDangKinhDoanh()
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = "select MaSP, TenLoai,TenSP,Mau,DonGia, SoLuong,TenNCC, SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.TrangThai =N'Đang kinh doanh' and SANPHAM.MaNCC= NCC.MaNCC";
             DataProvider provider = new DataProvider();
             provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                sp.setSoLuong(resultSet.getInt("SoLuong"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
    
     public static ArrayList<Pojo.SanPham> DSSPSanPham()
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = "select * from SANPHAM";
             DataProvider provider = new DataProvider();
             provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                sp.setSoLuong(resultSet.getInt("SoLuong"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
     
    public static ArrayList<Pojo.SanPham> layDanhSachLoaiSanPham()
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = "select TenLoai from LOAISANPHAM";
             DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setTenLoai(resultSet.getString("TenLoai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
    
//    public static boolean  CapnhatLaiSoLSanPham(int maSp, int sl)
//    {
//        DataProvider provider = new DataProvider();
//        provider.ketNoi();
//        String = 
//    }
    
    public static ArrayList<Pojo.SanPham> DSSPTheoLoai(String TenLoai)
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and TenLoai = N'%s'", TenLoai);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
    
     
    public static ArrayList<Pojo.SanPham> DSSPTheoTrangThai(String TrangThai)
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and SANPHAM.TrangThai = N'%s'", TrangThai);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
     
    public static ArrayList<Pojo.SanPham> DSSPTheoNCC(String TenNCC)
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and TenNCC = N'%s'", TenNCC);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
      
    public static ArrayList<Pojo.SanPham> DSSPTheoTen(String TenSP)
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and TenSP = N'%s'", TenSP);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
      
    public static ArrayList<Pojo.SanPham> DSSPTheoGia(String gia)
        {
            ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and DonGia%s", gia);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
    
    
        
    public static Pojo.SanPham loadSP(String ma)
        {
            Pojo.SanPham sp = new Pojo.SanPham();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,Hinh,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and MaSP='%s'", ma);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setHinh(resultSet.getString("Hinh"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
            }  
            }catch(SQLException e){
               e.getMessage();
            }
            return sp;
        }

    public static boolean UpdateSanPham(String MaSP, String TenSP, String Mau,String DonGia,String Hinh, String TrangThai) {
        boolean kq = false;
        String sql = String.format("update SANPHAM set TenSP=N'%s', Mau=N'%s', DonGia='%s', Hinh='%s', TrangThai=N'%s' where MaSP=%s", TenSP, Mau, DonGia, Hinh,TrangThai,MaSP);
         DataProvider provider = new DataProvider();
        provider.ketNoi();
        int n = provider.executeUpdate(sql);
        if (n > 0) {
            kq = true;
        }
        provider.closeConnection();
        return kq;
    }  
    
    public static Pojo.SanPham TimloaiSPTheoMa(String ma)
        {
            Pojo.SanPham sp = new Pojo.SanPham();
            try{
            String sql = String.format("select TenLoai from SANPHAM, LOAISANPHAM where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and MaSP='%s'", ma);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                sp.setTenLoai(resultSet.getString("TenLoai"));
            }  
            }catch(SQLException e){
               e.getMessage();
            }
            return sp;
        }
    
    public static Pojo.SanPham TimMaloaiTheoTenLoai(String tenloai)
        {
            Pojo.SanPham sp = new Pojo.SanPham();
            try{
            String sql = String.format("select MaLoai from LOAISANPHAM where TenLoai=N'%s'", tenloai);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                sp.setMaLoai(resultSet.getInt("MaLoai"));
            }  
            }catch(SQLException e){
               e.getMessage();
            }
            return sp;
        }
    
    public static boolean themSanPham(String ten, String maloai, String mancc, String mau, String hinh)
    {
         boolean kq = false;
        String sql = String.format("INSERT INTO SANPHAM([MaLoai],[TenSP],[Mau],[MaNCC],[Hinh]) VALUES ('%s',N'%s',N'%s','%s','%s')", maloai,ten,mau, mancc,hinh);
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        int n=provider.executeUpdate(sql);
        if(n>0)
        {
            kq = true;
        }
        return kq;
    }
    
    public static boolean kiemTraSanPham(String tensp, String mancc,String mau, String maloai)
    {
       try{
            String sql = String.format("select * from SANPHAM where TenSP = N'%s' and MaNCC = %s and Mau = N'%s' and MaLoai = %s", tensp,mancc,mau, maloai);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            if(resultSet.next())
            {
               return true;
            }
            }catch(SQLException e){
               e.getMessage();
            }
        return false;
    }
    
    public static ArrayList<SanPham> TimChiTietSanPham(String masp) 
        {
              ArrayList<Pojo.SanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select * from SANPHAM where MaSP = %s", masp);
             DataProvider provider = new DataProvider();
        provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                Pojo.SanPham sp = new Pojo.SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setTenLoai(resultSet.getString("TenLoai"));
                sp.setMau(resultSet.getString("Mau"));
                sp.setTenNCC(resultSet.getString("TenNCC"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
}
