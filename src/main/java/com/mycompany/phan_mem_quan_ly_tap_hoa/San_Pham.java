package com.mycompany.phan_mem_quan_ly_tap_hoa;

public class San_Pham {

    private String maSP;
    private String tenSP;
    private String loaiSP;
    private double giaBan;
    private int soLuong;
    private String ngayNhap;
    private String ngayHetHan;
    private String nhaCungCap;

    // Constructor không tham số
    public San_Pham() {
    }

    // Constructor với tham số
    public San_Pham(String maSP, String tenSP, String loaiSP, double giaBan, int soLuong, String ngayNhap, String ngayHetHan, String nhaCungCap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    // Getter và Setter
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

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    // Phương thức hiển thị thông tin sản phẩm
    public void displayInfo() {
        System.out.println("Mã sản phẩm: " + maSP);
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Loại sản phẩm: " + loaiSP);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Ngày nhập: " + ngayNhap);
        System.out.println("Ngày hết hạn: " + ngayHetHan);
        System.out.println("Nhà cung cấp: " + nhaCungCap);
    }
}
