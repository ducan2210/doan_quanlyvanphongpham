package DAO;

import Pojo.QLSanPham;
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
public class QLSanPhamDAO{
    public static ArrayList<QLSanPham> layDanhSachSanPham()
        {
            ArrayList<QLSanPham> dssp = new ArrayList<>();
            try{
            String sql = "select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC, SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC";
            DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                QLSanPham sp = new QLSanPham();
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
     
    public static ArrayList<QLSanPham> layDanhSachLoaiSanPham()
        {
            ArrayList<QLSanPham> dssp = new ArrayList<>();
            try{
            String sql = "select TenLoai from LOAISANPHAM";
            DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                QLSanPham sp = new QLSanPham();
                sp.setTenLoai(resultSet.getString("TenLoai"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
    
    public static ArrayList<QLSanPham> DSSPTheoLoai(String TenLoai)
        {
            ArrayList<QLSanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and TenLoai = N'%s'", TenLoai);
            DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                QLSanPham sp = new QLSanPham();
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
    
     
    public static ArrayList<QLSanPham> DSSPTheoTrangThai(String TrangThai)
        {
            ArrayList<QLSanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and SANPHAM.TrangThai = N'%s'", TrangThai);
            DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                QLSanPham sp = new QLSanPham();
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
     
    public static ArrayList<QLSanPham> DSSPTheoNCC(String TenNCC)
        {
            ArrayList<QLSanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and TenNCC = N'%s'", TenNCC);
            DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                QLSanPham sp = new QLSanPham();
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
      
    public static ArrayList<QLSanPham> DSSPTheoTen(String TenSP)
        {
            ArrayList<QLSanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and TenSP = N'%s'", TenSP);
            DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                QLSanPham sp = new QLSanPham();
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
      
    public static ArrayList<QLSanPham> DSSPTheoGia(String gia)
        {
            ArrayList<QLSanPham> dssp = new ArrayList<>();
            try{
            String sql = String.format("select MaSP, TenLoai,TenSP,Mau,DonGia,TenNCC,SANPHAM.TrangThai from SANPHAM, LOAISANPHAM, NCC where SANPHAM.MaLoai = LOAISANPHAM.MaLoai and SANPHAM.MaNCC= NCC.MaNCC and DonGia%s", gia);
            DataProvider provider = new DataProvider();
            provider.ketNoi();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                QLSanPham sp = new QLSanPham();
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
        
    public static QLSanPham loadSP(String ma)
        {
            QLSanPham sp = new QLSanPham();
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
}
