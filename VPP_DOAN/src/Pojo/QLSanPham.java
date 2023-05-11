/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author AnNguyen
 */
public class QLSanPham {
        private int MaSP;
	private String TenLoai;
	private String TenSP;
	private String Mau ;
	private int DonGia ;
	private String TenNCC ;
        private String Hinh ;
        private String TrangThai ;

    public QLSanPham(int MaSP, String TenLoai, String TenSP, String Mau, int DonGia, String TenNCC, String Hinh, String TrangThai) {
        this.MaSP = MaSP;
        this.TenLoai = TenLoai;
        this.TenSP = TenSP;
        this.Mau = Mau;
        this.DonGia = DonGia;
        this.TenNCC = TenNCC;
        this.Hinh = Hinh;
        this.TrangThai = TrangThai;
    }

    public QLSanPham() {
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
}
