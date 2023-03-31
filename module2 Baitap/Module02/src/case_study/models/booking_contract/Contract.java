package case_study.models.booking_contract;

public class Contract {
    private int idContract;
    private int idBooking;
    private float depositsStart;
    private float getDepositsEnd;
    private int idCustomer;

    public Contract() {
    }

    public Contract(int idContract, int idBooking, float depositsStart, float getDepositsEnd, int idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.depositsStart = depositsStart;
        this.getDepositsEnd = getDepositsEnd;
        this.idCustomer = idCustomer;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public float getDepositsStart() {
        return depositsStart;
    }

    public void setDepositsStart(float depositsStart) {
        this.depositsStart = depositsStart;
    }

    public float getGetDepositsEnd() {
        return getDepositsEnd;
    }

    public void setGetDepositsEnd(float getDepositsEnd) {
        this.getDepositsEnd = getDepositsEnd;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", depositsStart=" + depositsStart +
                ", getDepositsEnd=" + getDepositsEnd +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
