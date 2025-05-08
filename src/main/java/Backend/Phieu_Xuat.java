
package Backend;


import java.util.Date;

public class Phieu_Xuat {
    private int maPhieuXuat;
    private Date ngayXuat;
    private String tenKhachHang;
    private double tongTien;
    private int maQuanTri;

    public Phieu_Xuat(int maPhieuXuat, Date ngayXuat, String tenKhachHang, double tongTien, int maQuanTri) {
        this.maPhieuXuat = maPhieuXuat;
        this.ngayXuat = ngayXuat;
        this.tenKhachHang = tenKhachHang;
        this.tongTien = tongTien;
        this.maQuanTri = maQuanTri;
    }

    // Getter và Setter
    public int getMaPhieuXuat() {
        return maPhieuXuat;
    }

    public void setMaPhieuXuat(int maPhieuXuat) {
        this.maPhieuXuat = maPhieuXuat;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaQuanTri() {
        return maQuanTri;
    }

    public void setMaQuanTri(int maQuanTri) {
        this.maQuanTri = maQuanTri;
    }
}