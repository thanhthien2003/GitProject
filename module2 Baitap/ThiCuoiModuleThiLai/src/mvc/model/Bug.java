package mvc.model;

public class Bug {
    private String maBug;
    private String tenBug;
    private String mieuTaBug;
    private String thoiGianBug;
    private String mucDoNguyHai;

    public Bug() {
    }

    public Bug(String maBug, String tenBug, String mieuTaBug, String thoiGianBug, String mucDoNguyHai) {
        this.maBug = maBug;
        this.tenBug = tenBug;
        this.mieuTaBug = mieuTaBug;
        this.thoiGianBug = thoiGianBug;
        this.mucDoNguyHai = mucDoNguyHai;
    }

    public String getMaBug() {
        return maBug;
    }

    public void setMaBug(String maBug) {
        this.maBug = maBug;
    }

    public String getTenBug() {
        return tenBug;
    }

    public void setTenBug(String tenBug) {
        this.tenBug = tenBug;
    }

    public String getMieuTaBug() {
        return mieuTaBug;
    }

    public void setMieuTaBug(String mieuTaBug) {
        this.mieuTaBug = mieuTaBug;
    }

    public String getThoiGianBug() {
        return thoiGianBug;
    }

    public void setThoiGianBug(String thoiGianBug) {
        this.thoiGianBug = thoiGianBug;
    }

    public String getMucDoNguyHai() {
        return mucDoNguyHai;
    }

    public void setMucDoNguyHai(String mucDoNguyHai) {
        this.mucDoNguyHai = mucDoNguyHai;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "maBug='" + maBug + '\'' +
                ", tenBug='" + tenBug + '\'' +
                ", mieuTaBug='" + mieuTaBug + '\'' +
                ", thoiGianBug='" + thoiGianBug + '\'' +
                ", mucDoNguyHai='" + mucDoNguyHai + '\'' +
                '}';
    }

    public String getInforCSV() {
        return maBug + "," + tenBug + "," + mieuTaBug + "," + thoiGianBug + "," + mucDoNguyHai;
    }
}
