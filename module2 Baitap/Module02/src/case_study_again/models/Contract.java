package case_study_again.models;

public class Contract {
    private String idContract;
    private String idBooking;
    private long  depositsStart;
    private long  getDepositsEnd;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, long depositsStart, long getDepositsEnd) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.depositsStart = depositsStart;
        this.getDepositsEnd = getDepositsEnd;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public long getDepositsStart() {
        return depositsStart;
    }

    public void setDepositsStart(long depositsStart) {
        this.depositsStart = depositsStart;
    }

    public long getGetDepositsEnd() {
        return getDepositsEnd;
    }

    public void setGetDepositsEnd(long getDepositsEnd) {
        this.getDepositsEnd = getDepositsEnd;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", depositsStart=" + depositsStart +
                ", getDepositsEnd=" + getDepositsEnd +
                '}';
    }
    public String getInforToCSV(){
        return idContract+","+idBooking+","+depositsStart+","+getDepositsEnd;
    }
}
