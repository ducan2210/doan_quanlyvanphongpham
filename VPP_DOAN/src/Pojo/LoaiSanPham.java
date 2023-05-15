/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author Nguyen Bach Long
 */
public class LoaiSanPham {
    int maLoaiSanPham;
    String tenLoai;

    public LoaiSanPham(int maLoaiSanPham, String tenLoai) {
        this.maLoaiSanPham = maLoaiSanPham;
        this.tenLoai = tenLoai;
    }

    public int getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(int maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    
    
    
}
