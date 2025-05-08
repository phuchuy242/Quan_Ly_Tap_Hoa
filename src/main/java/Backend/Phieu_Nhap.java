
package Backend;


import java.util.Date;

public class Phieu_Nhap {
    private int maPhieuNhap;
    private Date ngayNhap;
    private int maNhaCungCap;
    private int maQuanTri;

    public Phieu_Nhap(int maPhieuNhap, Date ngayNhap, int maNhaCungCap, int maQuanTri) {
        this.maPhieuNhap = maPhieuNhap;
        this.ngayNhap = ngayNhap;
        this.maNhaCungCap = maNhaCungCap;
        this.maQuanTri = maQuanTri;
    }

    // Getter và Setter
    public int getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(int maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public int getMaQuanTri() {
        return maQuanTri;
    }

    public void setMaQuanTri(int maQuanTri) {
        this.maQuanTri = maQuanTri;
    }
}