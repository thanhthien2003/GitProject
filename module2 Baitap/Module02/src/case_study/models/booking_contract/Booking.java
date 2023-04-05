package case_study.models.booking_contract;

public class Booking {
    private int idBooking;
    private int dayStart;
    private int dayEnd;
    private int idCustomer;
    private String nameService;
    private String styleService;

    public Booking() {
    }

    public Booking(int idBooking, int dayStart, int dayEnd, int idCustomer, String nameService, String styleService) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.styleService = styleService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getDayStart() {
        return dayStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public int getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(int dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getStyleService() {
        return styleService;
    }

    public void setStyleService(String styleService) {
        this.styleService = styleService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dayStart=" + dayStart +
                ", dayEnd=" + dayEnd +
                ", idCustomer=" + idCustomer +
                ", nameService='" + nameService + '\'' +
                ", styleService='" + styleService + '\'' +
                '}';
    }
//    int idBooking, int dayStart, int dayEnd, int idCustomer, String nameService, String styleService
    public String getInforBooking(){
        return idBooking + "," + dayStart + "," + dayEnd + "," + idCustomer + "," + nameService + "," + styleService;
    }
}
