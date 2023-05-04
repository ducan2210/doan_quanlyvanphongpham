/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author Nguyen Bach Long
 */
public class KhachHang {
    
    int maKh;
    String tenKh, phai, sdt, diaChi;

    public KhachHang(int maKh, String tenKh, String phai, String sdt, String diaChi) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        
        this.phai = phai;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public KhachHang() {
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }


    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
  
    
}
