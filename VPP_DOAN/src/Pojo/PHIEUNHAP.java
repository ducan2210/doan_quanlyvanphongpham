/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author Administrator-PC
 */
public class PHIEUNHAP {
    private String NGAYNHAP;
    private int MAPHIEUNHAP,MaNV,TONGTIEN;

    public PHIEUNHAP(String NGAYNHAP, int MAPHIEUNHAP, int MaNV, int TONGTIEN) {
        this.NGAYNHAP = NGAYNHAP;
        this.MAPHIEUNHAP = MAPHIEUNHAP;
        this.MaNV = MaNV;
        this.TONGTIEN = TONGTIEN;
    }

    public String getNGAYNHAP() {
        return NGAYNHAP;
    }

    public void setNGAYNHAP(String NGAYNHAP) {
        this.NGAYNHAP = NGAYNHAP;
    }

    public int getMAPHIEUNHAP() {
        return MAPHIEUNHAP;
    }

    public void setMAPHIEUNHAP(int MAPHIEUNHAP) {
        this.MAPHIEUNHAP = MAPHIEUNHAP;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(int TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    
}
