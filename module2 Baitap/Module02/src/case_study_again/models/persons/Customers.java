package case_study_again.models.persons;

public class Customers extends Person{
    private String typeCustomer;
    private String address;


    public Customers(String id, String name, String date, String gender, String idCountry, String phoneNumber, String email, String typeCustomer, String address) {
        super(id, name, date, gender, idCountry, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customers() {
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + ", id=" + id + '\'' +
                ", address='" + name + '\'' +
                "typeCustomer='" + date +
                ", name='" + gender + '\'' +
                ", date='" + idCountry + '\'' +
                ", gender='" + phoneNumber + '\'' +
                ", idCountry=" + email +
                ", phoneNumber=" + typeCustomer +
                ", email='" + address + '\'' +
                '}';
    }

    public String getInforToCustomer() {
        return id + "," + name + "," + date + "," + gender + "," + idCountry + "," + phoneNumber + "," + email + "," + typeCustomer + "," + address;
    }
}
