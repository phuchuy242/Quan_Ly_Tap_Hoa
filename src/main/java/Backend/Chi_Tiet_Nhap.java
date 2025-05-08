
package Backend;


public class Chi_Tiet_Nhap {
    private int maPhieuNhap;
    private int maSanPham;
    private int soLuong;
    private double giaNhap;

    public Chi_Tiet_Nhap(int maPhieuNhap, int maSanPham, int soLuong, double giaNhap) {
        this.maPhieuNhap = maPhieuNhap;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
    }

    // Getter và Setter
    public int getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
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

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }
}