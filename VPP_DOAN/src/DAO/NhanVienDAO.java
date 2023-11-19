/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phuoc
 */
public class NhanVienDAO {

    public NhanVienDAO() {
    }
    
    public static boolean  ktrDangNhap(String taiKhoan, String matKhau)
    {
        String sql = "select * from NhanVien where TaiKhoan = '"+taiKhoan+"' AND matKhau = '"+matKhau+"'";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet rs=  provider.executeQuery(sql);
        try {
            while(rs.next())
            {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public static int DemSoHDnVTao(int maNV)
    {
        DataProvider provider = new DataProvider();
        provider.ketNoi();
       
        
        String query = "SELECT COUNT(*) AS invoice_count FROM NHANVIEN, HOADON WHERE NHANVIEN.MaNV = HOADON.MaNV AND  NHANVIEN.MaNV = "+maNV+"";
        ResultSet rs =  provider.executeQuery(query);
        try {
            while(rs.next())
            {
                return rs.getInt("invoice_count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
             
    }
    
     public static Pojo.NhanVien layTTDangNhap(String taiKhoan, String matKhau)
    {
        NhanVien nv = new NhanVien();
        String sql = "select * from NhanVien where TaiKhoan = '"+taiKhoan+"' AND matKhau = '"+matKhau+"'";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet resultSet=  provider.executeQuery(sql);
        try {
            while(resultSet.next())
            {
              nv.setMaNV(resultSet.getInt("MaNV"));
              nv.setHoTen(resultSet.getString("Hoten"));
              nv.setTaiKhoan(resultSet.getString("TaiKhoan"));
              nv.setMatKhau(resultSet.getString("MatKhau"));
              nv.setSoDT(resultSet.getString("SDT"));
              nv.setDiaChi(resultSet.getString("DiaChi"));
              nv.setHinh(resultSet.getString("Hinh"));
              nv.setTrangThai(resultSet.getString("TrangTrai"));
              nv.setQuyen(resultSet.getString("Quyen"));
          
            }
            return nv;
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nv;
    }
    
    public static ArrayList<NhanVien> layDanhSachNhanVien()
    {
      ArrayList<NhanVien> dsnv = new ArrayList();
      try {
        String sql = "select * from NhanVien";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet resultSet = provider.executeQuery(sql);
        while (resultSet.next())
        {
          NhanVien nv = new NhanVien();
          nv.setMaNV(resultSet.getInt("MaNV"));
          nv.setHoTen(resultSet.getString("Hoten"));
          nv.setTaiKhoan(resultSet.getString("TaiKhoan"));
          nv.setMatKhau(resultSet.getString("MatKhau"));
          nv.setSoDT(resultSet.getString("SDT"));
          nv.setDiaChi(resultSet.getString("DiaChi"));
          nv.setHinh(resultSet.getString("Hinh"));
          nv.setTrangThai(resultSet.getString("TrangTrai"));
          nv.setQuyen(resultSet.getString("Quyen"));
          dsnv.add(nv);
        }
        provider.closeConnection();
      } catch (SQLException e) {
        e.getMessage();
      }
      return dsnv;
    }
    
    public static boolean xoaNhanVien(String ma) {
    boolean kq = false;
    String sql = String.format("DELETE FROM NhanVien WHERE MaNV = %d", Integer.valueOf(ma));
     DataProvider provider = new DataProvider();
            provider.ketNoi();
    int n = provider.executeUpdate(sql);
    if (n >= 0)
    {
      kq = true;
    }
    provider.closeConnection();
    return kq;
  }
  
  public static boolean themNhanVien(NhanVien a)
  {
    boolean kq = false;
    String sql = String.format("INSERT INTO NhanVien([Hoten],[TaiKhoan],[MatKhau],[SDT],[DiaChi],[Hinh],[TrangTrai],[Quyen]) VALUES (N'%s','%s','%s','%s',N'%s','%s',N'%s',N'%s')", new Object[] { a.hoTen, a.taiKhoan, a.matKhau, a.soDT, a.diaChi, a.hinh, a.trangThai, a.quyen });
     DataProvider provider = new DataProvider();
            provider.ketNoi();
    int n = provider.executeUpdate(sql);
    if (n > 0)
    {
      kq = true;
    }
    provider.closeConnection();
    return kq;
  }
  
  public static boolean UpdateNhanVien(Pojo.NhanVien a) {
    boolean kq = false;
    String sql = String.format("update NhanVien set Hoten=N'"+a.getHoTen()+"', TaiKhoan='"+a.getTaiKhoan()+"', SDT='"+a.getTaiKhoan()+"', DiaChi=N'"+a.getDiaChi()+"', TrangTrai=N'"+a.getTrangThai()+"', Quyen=N'"+a.getQuyen()+"' where MaNV="+a.getMaNV()+"");
    DataProvider provider = new DataProvider();
    provider.ketNoi();
    int n = provider.executeUpdate(sql);
    if (n > 0) {
      kq = true;
    }
    provider.closeConnection();
    return kq;
  }
  
  public static boolean UpdateMatKhau(int ma, String mk) {
    boolean kq = false;
    String sql = String.format("update NhanVien set MatKhau='%s' where MaNV=%d", new Object[] { mk, ma });
    DataProvider provider = new DataProvider();
    provider.ketNoi();
    int n = provider.executeUpdate(sql);
    if (n > 0) {
      kq = true;
    }
    provider.closeConnection();
    return kq;
  }
  
  public static Pojo.NhanVien kiemTraNhanVien(String taikhoan)
  {
      NhanVien nv = new NhanVien();
     
      String sql = String.format("select * from NhanVien where TaiKhoan = '%s'", new Object[] { taikhoan });
      DataProvider provider = new DataProvider();
      provider.ketNoi();
      ResultSet resultSet = provider.executeQuery(sql);
      if(resultSet== null)
      {
         nv = null; 
      }
        try {
            if (resultSet.next())
            {
                
                nv.setMaNV(resultSet.getInt("MaNV"));
                nv.setHoTen(resultSet.getString("Hoten"));
                nv.setTaiKhoan(resultSet.getString("TaiKhoan"));
                nv.setMatKhau(resultSet.getString("MatKhau"));
                nv.setSoDT(resultSet.getString("SDT"));
                nv.setDiaChi(resultSet.getString("DiaChi"));
                nv.setHinh(resultSet.getString("Hinh"));
                nv.setTrangThai(resultSet.getString("TrangTrai"));
                nv.setQuyen(resultSet.getString("Quyen"));
                nv.setMatKhau(resultSet.getString("MatKhau"));
                
            } } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      provider.closeConnection();
      return nv;
     
   
     
  }


//Danh sach tai khoan

  public static ArrayList<String[]> layDanhSachTaiKhoan()
  {
      ArrayList<String[]> dstk = new ArrayList();
      try {
        String sql = "select taikhoan, matkhau from NhanVien";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet resultSet = provider.executeQuery(sql);
        while (resultSet.next())
        {
          String[] tk = new String[100];
          tk[0] = resultSet.getString("taikhoan");
          tk[1] = resultSet.getString("matkhau");
          dstk.add(tk);
        }
        provider.closeConnection();
      } catch (SQLException e) {
        e.getMessage();
      }
      return dstk;
  }
  public static ArrayList<String> layDanhSachChuDe()
  {
      ArrayList<String> dstk = new ArrayList();
      try {
        String sql = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS where TABLE_NAME = 'NHANVIEN' and COLUMN_NAME != 'Matkhau' and COLUMN_NAME != 'Hinh'";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet resultSet = provider.executeQuery(sql);
        while (resultSet.next())
        {
          dstk.add(resultSet.getString("COLUMN_NAME"));
        }
        provider.closeConnection();
      } catch (SQLException e) {
        e.getMessage();
      }
      return dstk;
  }
  
  public static ArrayList<String> layDanhSachNoiDung(String ChuDe)
  {
      ArrayList<String> dsnd = new ArrayList();
      try {
        String sql = "select distinct "+ChuDe+" from NHANVIEN";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet resultSet = provider.executeQuery(sql);
        while (resultSet.next())
        {
          dsnd.add(resultSet.getString(ChuDe));
        }
        provider.closeConnection();
      } catch (SQLException e) {
        e.getMessage();
      }
      return dsnd;
  }
  
  public static ArrayList<NhanVien> layDanhSachNhanVien(String ChuDe, String NoiDung)
  {
      ArrayList<NhanVien> dsnv = new ArrayList();
      try {
        String sql = "select * from NhanVien where "+ChuDe+"= N'"+NoiDung+"'";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet resultSet = provider.executeQuery(sql);
        while (resultSet.next())
        {
          NhanVien nv = new NhanVien();
          nv.setMaNV(resultSet.getInt("MaNV"));
          nv.setHoTen(resultSet.getString("Hoten"));
          nv.setTaiKhoan(resultSet.getString("TaiKhoan"));
          nv.setMatKhau(resultSet.getString("MatKhau"));
          nv.setSoDT(resultSet.getString("SDT"));
          nv.setDiaChi(resultSet.getString("DiaChi"));
          nv.setHinh(resultSet.getString("Hinh"));
          nv.setTrangThai(resultSet.getString("TrangTrai"));
          nv.setQuyen(resultSet.getString("Quyen"));
          nv.setMatKhau(resultSet.getString("MatKhau"));
          dsnv.add(nv);
        }
        provider.closeConnection();
      } catch (SQLException e) {
        e.getMessage();
      }
      return dsnv;
  }
  
  public static String quyDoi(String TenCot)
  {
        return switch (TenCot) {
            case "MaNV" -> "Mã Nhân Viên";
            case "Hoten" -> "Họ Và Tên";
            case "TaiKhoan" -> "Tài Khoản";
            case "SDT" -> "Số Điện Thoại";
            case "DiaChi" -> "Địa Chỉ";
            case "TrangTrai" -> "Trạng Thái";
            default -> "Quyền";
        };
  }
  public static String quyDoi(String TenCot, String reverse)
  {
        return switch (TenCot) {
            case "Mã Nhân Viên" -> "MaNV";
            case "Họ Và Tên" -> "Hoten";
            case "Tài Khoản" -> "TaiKhoan";
            case "Số Điện Thoại" -> "SDT";
            case "Địa Chỉ" -> "DiaChi";
            case "Trạng Thái" -> "TrangTrai";
            default -> "Quyen";
        };
  }
  
  
  public static ArrayList<NhanVien> layDanhSachNhanVien(int idNV)
    {
      ArrayList<NhanVien> dsnv = new ArrayList();
      try {
        String sql = "select * from NhanVien where MaNV = '"+idNV+"'";
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        ResultSet resultSet = provider.executeQuery(sql);
        while (resultSet.next())
        {
          NhanVien nv = new NhanVien();
          nv.setMaNV(resultSet.getInt("MaNV"));
          nv.setHoTen(resultSet.getString("Hoten"));
          nv.setTaiKhoan(resultSet.getString("TaiKhoan"));
          nv.setMatKhau(resultSet.getString("MatKhau"));
          nv.setSoDT(resultSet.getString("SDT"));
          nv.setDiaChi(resultSet.getString("DiaChi"));
          nv.setHinh(resultSet.getString("Hinh"));
          nv.setTrangThai(resultSet.getString("TrangTrai"));
          nv.setQuyen(resultSet.getString("Quyen"));
          dsnv.add(nv);
        }
        provider.closeConnection();
      } catch (SQLException e) {
        e.getMessage();
      }
      return dsnv;
    }
    public static boolean capNhatThongNhanVien(Pojo.NhanVien a)
    {
        boolean kq = false;
        String sql = String.format("update NhanVien set Hoten=N'%s', TaiKhoan='%s', SDT='%s', DiaChi=N'%s', Hinh='%s', TrangTrai=N'%s', Quyen=N'%s' where MaNV=%d", new Object[] { a.hoTen, a.taiKhoan, a.soDT, a.diaChi, a.hinh, a.trangThai, a.quyen, a.maNV });
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        int n = provider.executeUpdate(sql);
        if (n > 0) {
          kq = true;
        }
        provider.closeConnection();
        return kq;
    }
    
    public static NhanVien LayNhanVienTheoMa(int ma)
    {
        NhanVien nv = new NhanVien();
        DataProvider provider = new DataProvider();
        provider.ketNoi();
        String query = "Select * from NhanVien where MaNV = "+ma+"";
        ResultSet rs =  provider.executeQuery(query);
        try {
            while(rs.next())
            {
                nv.setHoTen(rs.getString("Hoten"));
                nv.setQuyen(rs.getString("Quyen"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nv;
        
    }
    
    
    
    
}