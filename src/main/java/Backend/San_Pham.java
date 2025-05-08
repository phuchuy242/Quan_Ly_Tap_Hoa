package Backend;

import java.time.LocalDate;

public class San_Pham {

    private String maSP;
    private String tenSP;
    private String loaiSP;
    private double giaBan;
    private int soLuong;
    private LocalDate ngayNhap;
    private LocalDate ngayHetHan;
    private Nha_Cung_Cap nhaCungCap;

    // Constructor mặc định
    public San_Pham() {
    }

    // Constructor đầy đủ tham số
    public San_Pham(String maSP, String tenSP, String loaiSP, double giaBan, int soLuong,
                    LocalDate ngayNhap, LocalDate ngayHetHan, Nha_Cung_Cap nhaCungCap) {
        this.setMaSP(maSP);
        this.setTenSP(tenSP);
        this.setLoaiSP(loaiSP);
        this.setGiaBan(giaBan);
        this.setSoLuong(soLuong);
        this.setNgayNhap(ngayNhap);
        this.setNgayHetHan(ngayHetHan);
        this.setNhaCungCap(nhaCungCap);
    }

    // Getter & Setter
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
        if (giaBan < 0) {
            throw new IllegalArgumentException("Giá bán không được âm");
        }
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong < 0) {
            throw new IllegalArgumentException("Số lượng không được âm");
        }
        this.soLuong = soLuong;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public Nha_Cung_Cap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(Nha_Cung_Cap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    
}
