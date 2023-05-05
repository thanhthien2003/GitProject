package case_study_again.models;

import java.util.Objects;

public class Booking implements Comparable{
    private String idBooking;
    private String dayBooking;
    private String dayStart;
    private String dayEnd;
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooking, String dayBooking, String dayStart, String dayEnd, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dayBooking='" + dayBooking + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }
    public String getInforCSV(){
        return idBooking + "," + dayBooking + "," + dayStart + "," + dayEnd + "," + idCustomer + "," + idService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(idBooking, booking.idBooking) && Objects.equals(dayBooking, booking.dayBooking) && Objects.equals(dayStart, booking.dayStart) && Objects.equals(dayEnd, booking.dayEnd) && Objects.equals(idCustomer, booking.idCustomer) && Objects.equals(idService, booking.idService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBooking, dayBooking, dayStart, dayEnd, idCustomer, idService);
    }

    @Override
    public int compareTo(Object o) {
        return this.idBooking.compareTo(((Booking)o).idBooking);
    }
}
