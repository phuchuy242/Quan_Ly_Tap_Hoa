package Backend;

import Backend.Nha_Cung_Cap;

public class San_Pham {

    private String maSP;
    private String tenSP;
    private String loaiSP;
    private double giaBan;
    private int soLuong;
    private String ngayNhap;
    private String ngayHetHan;
    private Nha_Cung_Cap nhaCungCap;
    public San_Pham() {
    }
    public San_Pham(String maSP, String tenSP, String loaiSP, double giaBan, int soLuong, String ngayNhap, String ngayHetHan, Nha_Cung_Cap nhaCungCap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public Nha_Cung_Cap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(Nha_Cung_Cap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
}
