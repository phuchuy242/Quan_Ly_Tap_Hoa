package Backend;

public class Chi_Tiet_Xuat {
    private int maPhieuXuat;
    private int maSanPham;
    private int soLuong;
    private double giaBan;

    public Chi_Tiet_Xuat(int maPhieuXuat, int maSanPham, int soLuong, double giaBan) {
        this.maPhieuXuat = maPhieuXuat;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    // Getter và Setter
    public int getMaPhieuXuat() {
        return maPhieuXuat;
    }

    public void setMaPhieuXuat(int maPhieuXuat) {
        this.maPhieuXuat = maPhieuXuat;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
}