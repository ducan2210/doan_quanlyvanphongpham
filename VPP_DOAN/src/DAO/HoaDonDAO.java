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
    
    public static boolean ThemHD(String query)
    {
        DataProvider dataProvider = new DataProvider();
        dataProvider.ketNoi();
        
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
