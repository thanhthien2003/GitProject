package case_study.models.person;

public class Customer extends Person{
    private String typeCustomer;
    private String address;


    public Customer(int id, String name, String date, String gender, int idCountry, int phoneNumber, String email, String typeCustomer, String address) {
        super(id, name, date, gender, idCountry, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer() {

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
                ", address='" + address + '\'' +
                "typeCustomer='" + typeCustomer +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", idCountry=" + idCountry +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
