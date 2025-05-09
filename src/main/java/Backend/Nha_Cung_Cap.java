package Backend;

import java.time.LocalDate;

public class Nha_Cung_Cap {
    private String maNCC;
    private String tenNCC;
    private String diaChi;
    private String sdt;
    private LocalDate ngayHopTac;
    
    public Nha_Cung_Cap(String maNCC, String tenNCC, String diaChi, String sdt, LocalDate ngayHopTac) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ngayHopTac = ngayHopTac;
    }

   
    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public LocalDate getNgayHopTac() {
        return ngayHopTac;
    }

    public void setNgayHopTac(LocalDate ngayHopTac) {
        this.ngayHopTac = ngayHopTac;
    }
}
