/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Pojo.CTPHIEUNHAP;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator-PC
 */
public class CHITIETPHIEUNHAP_DAO {
     public static ArrayList<CTPHIEUNHAP> getDSCTPN(){
        ArrayList<CTPHIEUNHAP> dsctpn = new ArrayList<CTPHIEUNHAP>();
        try {
            String sql = "select * from CTPHIEUNHAP";
            DataProvider cn = new DataProvider();
            cn.ketNoi();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                CTPHIEUNHAP ctpn = new CTPHIEUNHAP(  rs.getString("DVT").trim(),rs.getInt("MACTPN"),rs.getInt("MAPHIEUNHAP"), rs.getInt("MaSP"), rs.getInt("SOLUONGNHAP"), rs.getInt("GIANHAP"), rs.getInt("THANHTIEN"));
                dsctpn.add(ctpn);
            }
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu chi tiết phiếu nhập");
            e.printStackTrace();
        }
        return dsctpn;
    }
    //==================================================================
     
    public static int ThemXoaSuaCHITIETPHIEUNHAP(String sql){
        int i=0;
        try {
            DataProvider cn = new DataProvider();
            cn.ketNoi();
            i = cn.executeUpdate(sql);
            System.out.println("Thêm/xóa/sửa thành công");
            
        } catch (Exception e) {
            System.out.println("Thêm/xóa/sửa không thành công");
           
        }
        return i;
    }
       
        public static ArrayList<CTPHIEUNHAP> TimChiTietPhieuNhap(String mapn) 
    {
         ArrayList<CTPHIEUNHAP> thongTinPN = new ArrayList<CTPHIEUNHAP>();
         //KhachHang thongTinKH = new KhachHang("", "", "", "", 0);
          try {
            String sql ="select * from CTPHIEUNHAP where MAPHIEUNHAP='"+mapn+"'";
            DataProvider cn = new DataProvider();
            cn.ketNoi();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next())
            {
             CTPHIEUNHAP a = new CTPHIEUNHAP(  rs.getString("DVT").trim(),rs.getInt("MACTPN"),rs.getInt("MAPHIEUNHAP"), rs.getInt("MaSP"), rs.getInt("SOLUONGNHAP"), rs.getInt("GIANHAP"), rs.getInt("THANHTIEN"));

              thongTinPN.add(a);
            }
        } catch (Exception e) 
        {
            System.out.println("Lỗi không thể lấy dữ liệu ");
        }
          return thongTinPN;
    }
}
