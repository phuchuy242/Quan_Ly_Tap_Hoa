import Backend.Nha_Cung_Cap;
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

    public San_Pham() {
    }

    public San_Pham(String maSP, String tenSP, String loaiSP, double giaBan, int soLuong, LocalDate ngayNhap, LocalDate ngayHetHan, Nha_Cung_Cap nhaCungCap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
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

    // Phương thức hiển thị thông tin sản phẩm
    @Override
    public String toString() {
        return "Mã SP: " + maSP + ", Tên SP: " + tenSP + ", Loại SP: " + loaiSP +
               ", Giá bán: " + giaBan + ", Số lượng: " + soLuong + 
               ", Ngày nhập: " + ngayNhap + ", Ngày hết hạn: " + ngayHetHan + 
               ", Nhà cung cấp: " + (nhaCungCap != null ? nhaCungCap.getTenNCC() : "Chưa có nhà cung cấp");
    }
}
