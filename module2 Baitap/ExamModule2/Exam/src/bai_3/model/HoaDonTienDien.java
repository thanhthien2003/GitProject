package bai_3.model;

public class HoaDonTienDien {
    private String maHoaDon;
    private String hoVaTen;
    private String loaiKhachHang;
    private long dinhMucTieuThu;

    public HoaDonTienDien() {
    }

    public HoaDonTienDien(String maHoaDon, String hoVaTen, String loaiKhachHang, long dinhMucTieuThu) {
        this.maHoaDon = maHoaDon;
        this.hoVaTen = hoVaTen;
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public long getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(long dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return "HoaDonTienDien{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                ", dinhMucTieuThu=" + dinhMucTieuThu +
                '}';
    }
    public String getInforFile(){
        return maHoaDon + "," + hoVaTen + "," + loaiKhachHang + "," + dinhMucTieuThu;
    }
}
