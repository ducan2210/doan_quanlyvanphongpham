/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author Nguyen Bach Long
 */
public class SanPham {
    String tenSp, mau;
    int soLuong, maSP, maLoai,maNCC ;
    int donGia;

    public SanPham(String tenSp, String mau, int soLuong, int maSP, int maLoai, int maNCC, int donGia) {
        this.tenSp = tenSp;
        this.mau = mau;
        this.soLuong = soLuong;
        this.maSP = maSP;
        this.maLoai = maLoai;
        this.maNCC = maNCC;
        this.donGia = donGia;
    }

    public SanPham() {
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    
    
}
