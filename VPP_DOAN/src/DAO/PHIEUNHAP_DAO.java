/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Pojo.PHIEUNHAP;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator-PC
 */
public class PHIEUNHAP_DAO {
     public static ArrayList<PHIEUNHAP> getDSPN(){
        ArrayList<PHIEUNHAP> dspn = new ArrayList<PHIEUNHAP>();
        try {
            String sql = "select * from PHIEUNHAP";
            DataProvider dataProvider = new DataProvider();
            dataProvider.ketNoi();
            ResultSet rs = dataProvider.executeQuery(sql);
            while(rs.next()){
                PHIEUNHAP pn = new PHIEUNHAP(  rs.getString("NGAYNHAP").trim(),rs.getInt("MAPHIEUNHAP"), rs.getInt("MaNV"), rs.getInt("TONGTIEN"));
                dspn.add(pn);
            }
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu phiếu nhập");
            e.printStackTrace();
        }
        return dspn;
    }
    //==================================================================
    public static int ThemXoaSuaPHIEUNHAP(String sql){
        int i=0;
        try {
            DataProvider dataProvider = new DataProvider();
            dataProvider.ketNoi();
             i = dataProvider.executeUpdate(sql);
          System.out.println("Thêm/xóa/sửa thành công");
            
        } catch (Exception e) {
            System.out.println("Thêm/xóa/sửa không thành công");
           
        }
        return i;
    }
}
