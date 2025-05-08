
package Backend;

public class Quan_Tri_Vien {
    private int maQuanTri;
    private String tenDangNhap;
    private String matKhauHash;
    private String hoTen;

    public Quan_Tri_Vien(int maQuanTri, String tenDangNhap, String matKhauHash, String hoTen) {
        this.maQuanTri = maQuanTri;
        this.tenDangNhap = tenDangNhap;
        this.matKhauHash = matKhauHash;
        this.hoTen = hoTen;
    }

    // Getter và Setter
    public int getMaQuanTri() {
        return maQuanTri;
    }

    public void setMaQuanTri(int maQuanTri) {
        this.maQuanTri = maQuanTri;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhauHash() {
        return matKhauHash;
    }

    public void setMatKhauHash(String matKhauHash) {
        this.matKhauHash = matKhauHash;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}