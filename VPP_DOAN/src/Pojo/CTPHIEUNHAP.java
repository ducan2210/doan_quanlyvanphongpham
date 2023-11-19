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
public class CTPHIEUNHAP {
    private String DVT;
    private int MACTPN,MAPHIEUNHAP,MaSP,SOLUONGNHAP,GIANHAP,THANHTIEN;
    public CTPHIEUNHAP(String DVT, int MACTPN, int MAPHIEUNHAP, int MaSP, int SOLUONGNHAP, int GIANHAP, int THANHTIEN) {
        this.DVT = DVT;
        this.MACTPN = MACTPN;
        this.MAPHIEUNHAP = MAPHIEUNHAP;
        this.MaSP = MaSP;
        this.SOLUONGNHAP = SOLUONGNHAP;
        this.GIANHAP = GIANHAP;
        this.THANHTIEN = THANHTIEN;
    }
    public String getDVT() {
        return DVT;
    }
    public void setDVT(String DVT) {
        this.DVT = DVT;
    }
    public int getMACTPN() {
        return MACTPN;
    }

    public void setMACTPN(int MACTPN) {
        this.MACTPN = MACTPN;
    }

    public int getMAPHIEUNHAP() {
        return MAPHIEUNHAP;
    }

    public void setMAPHIEUNHAP(int MAPHIEUNHAP) {
        this.MAPHIEUNHAP = MAPHIEUNHAP;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public int getSOLUONGNHAP() {
        return SOLUONGNHAP;
    }

    public void setSOLUONGNHAP(int SOLUONGNHAP) {
        this.SOLUONGNHAP = SOLUONGNHAP;
    }

    public int getGIANHAP() {
        return GIANHAP;
    }

    public void setGIANHAP(int GIANHAP) {
        this.GIANHAP = GIANHAP;
    }

    public int getTHANHTIEN() {
        return THANHTIEN;
    }

    public void setTHANHTIEN(int THANHTIEN) {
        this.THANHTIEN = THANHTIEN;
    }
    
}
