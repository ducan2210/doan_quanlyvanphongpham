/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.CtHoaDon;
import Pojo.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Bach Long
 */
public class ctHoaDonDAO {
    
    public static ArrayList<CtHoaDon> dsCTHD()
    {
        ArrayList<CtHoaDon> dsCTHD = new ArrayList<CtHoaDon>();
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
       ResultSet rs =  dataProvider.executeQuery("select * from CtHoaDon");
        try {
            while(rs.next())
            {
                CtHoaDon ct = new CtHoaDon();
                ct.setMaHD(rs.getInt("MAHD"));
                ct.setMaSP(rs.getInt("MaSp"));
                ct.setSoLuong(rs.getInt("soLuong"));
                ct.setThanhTien(rs.getInt("ThanhTien"));
                dsCTHD.add(ct);
                
            }} catch (SQLException ex) {
            Logger.getLogger(ctHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsCTHD;
        
    }
    
     public static boolean Them1CTHD(CtHoaDon cthd)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        String query  = String.format("Insert into CTHOADON (MaHD,MaSP, SoLuong, ThanhTien)  values "
                + "("+cthd.getMaHD()+", "+cthd.getMaSP()+", "+cthd.getSoLuong()+", "+cthd.getThanhTien()+")");
        if(dataProvider.executeUpdate(query) >= 1)
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
}
