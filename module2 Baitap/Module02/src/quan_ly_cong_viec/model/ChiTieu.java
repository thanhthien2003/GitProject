package quan_ly_cong_viec.model;

public class ChiTieu implements Comparable<ChiTieu> {
    private String maChiTieu;
    private String tenChiTieu;
    private String ngayChiTieu;
    private long soTienChi;
    private String moTaThem;

    public ChiTieu() {
    }

    public ChiTieu(String maChiTieu, String tenChiTieu, String ngayChiTieu, long soTienChi, String moTaThem) {
        this.maChiTieu = maChiTieu;
        this.tenChiTieu = tenChiTieu;
        this.ngayChiTieu = ngayChiTieu;
        this.soTienChi = soTienChi;
        this.moTaThem = moTaThem;
    }

    public String getMaChiTieu() {
        return maChiTieu;
    }

    public void setMaChiTieu(String maChiTieu) {
        this.maChiTieu = maChiTieu;
    }

    public String getTenChiTieu() {
        return tenChiTieu;
    }

    public void setTenChiTieu(String tenChiTieu) {
        this.tenChiTieu = tenChiTieu;
    }

    public String getNgayChiTieu() {
        return ngayChiTieu;
    }

    public void setNgayChiTieu(String ngayChiTieu) {
        this.ngayChiTieu = ngayChiTieu;
    }

    public long getSoTienChi() {
        return soTienChi;
    }

    public void setSoTienChi(long soTienChi) {
        this.soTienChi = soTienChi;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }

    @Override
    public String toString() {
        return "ChiTieu{" +
                "maChiTieu='" + maChiTieu + '\'' +
                ", tenChiTieu='" + tenChiTieu + '\'' +
                ", ngayChiTieu='" + ngayChiTieu + '\'' +
                ", soTienChi=" + soTienChi +
                ", moTaThem='" + moTaThem + '\'' +
                '}';
    }

    public String getInforFileCSV() {
        return maChiTieu + "," + tenChiTieu + "," + ngayChiTieu + "," + soTienChi + "," + maChiTieu;
    }

    @Override
    public int compareTo(ChiTieu o) {
        return o.tenChiTieu.compareTo(this.tenChiTieu);
    }
}
