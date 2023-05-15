package DAO;


import Pojo.HoaDon;
import Pojo.LoaiSanPham;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nguyen Bach Long
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LoaiSanPhamDAO {
    
    public static ArrayList<LoaiSanPham> dsLoai()
    {
        ArrayList<LoaiSanPham> dsLoai = new ArrayList<LoaiSanPham>();
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        String query = "select * from LoaiSanPham";
        ResultSet rs =  dataProvider.executeQuery(query);
        try {
            while(rs.next())
            {
                dsLoai.add(new LoaiSanPham(rs.getInt("MaLoai"), rs.getString("TenLoai")));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsLoai;
        
    }
    
    public static boolean themLoaiSanPham(String loai){
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        String query =  "Insert into LOAISANPHAM (TenLoai) values (N'"+loai+"')";
        if(dataProvider.executeUpdate(query) >= 0){
            return true;
        }
        else
        {
            return false;
        }
       
    }
    
}
