/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author AnNguyen
 */
public class MatHang {
      private int MaSP;
	private String TenLoai;
	private String TenSP;
        private String Mau ;
	private int SoLuong ;

    public MatHang(int MaSP, String TenLoai, String TenSP, String Mau, int SoLuong) {
        this.MaSP = MaSP;
        this.TenLoai = TenLoai;
        this.TenSP = TenSP;
        this.Mau = Mau;
        this.SoLuong = SoLuong;
    }

    public MatHang() {
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

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

   
}
