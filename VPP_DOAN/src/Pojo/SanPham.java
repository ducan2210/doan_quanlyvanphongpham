/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author AnNguyen
 */
public class SanPham {
        private int MaSP;
	private String TenLoai;
        private int MaLoai;
	private String TenSP;
	private String Mau ;
	private int DonGia ;
	private String TenNCC ;
        private String Hinh ;
        private String TrangThai ;
        private int SoLuong;

    public SanPham(int MaSP, String TenLoai, int MaLoai, String TenSP, String Mau, int DonGia, String TenNCC, String Hinh, String TrangThai, int SoLuong) {
        this.MaSP = MaSP;
        this.TenLoai = TenLoai;
        this.MaLoai = MaLoai;
        this.TenSP = TenSP;
        this.Mau = Mau;
        this.DonGia = DonGia;
        this.TenNCC = TenNCC;
        this.Hinh = Hinh;
        this.TrangThai = TrangThai;
        this.SoLuong = SoLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }



    public SanPham() {
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
