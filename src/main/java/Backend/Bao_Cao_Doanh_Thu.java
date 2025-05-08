package Backend;

import java.util.Date;

public class Bao_Cao_Doanh_Thu {
    private int maBaoCao;
    private Date tuNgay;
    private Date denNgay;
    private double tongDoanhThu;
    private int tongSanPhamBan;

    public Bao_Cao_Doanh_Thu(int maBaoCao, Date tuNgay, Date denNgay, double tongDoanhThu, int tongSanPhamBan) {
        this.maBaoCao = maBaoCao;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
        this.tongDoanhThu = tongDoanhThu;
        this.tongSanPhamBan = tongSanPhamBan;
    }

    // Getter và Setter
    public int getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(int maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

    public double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public int getTongSanPhamBan() {
        return tongSanPhamBan;
    }

    public void setTongSanPhamBan(int tongSanPhamBan) {
        this.tongSanPhamBan = tongSanPhamBan;
    }
}