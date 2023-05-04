/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.HoaDon;

/**
 *
 * @author Nguyen Bach Long
 */
public class HoaDonDAO {
    
    public static boolean ThemHD(HoaDon hd)
    {
        String query = String.format("Insert into HoaDon(NgayBan)", hd.getNgayThang());
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
        
    }
    
}
