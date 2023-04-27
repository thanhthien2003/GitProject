package case_study_again.models.persons;

public class Employees extends Person{
    private String lever;
    private String address;
    private float wage;

    public Employees() {
    }

    public Employees(String id, String name, String date, String gender, String idCountry, String phoneNumber, String email, String lever, String address, float wage) {
        super(id, name, date, gender, idCountry, phoneNumber, email);
        this.lever = lever;
        this.address = address;
        this.wage = wage;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", address='" + name + '\'' +
                ", wage=" + date +
                ", lever=" + gender +
                ", name='" + idCountry + '\'' +
                ", date='" + phoneNumber + '\'' +
                ", gender='" + email + '\'' +
                ", idCountry=" + lever +
                ", phoneNumber=" + address +
                ", email='" + wage + '\'' +
                '}';
    }

    public String getInforToEmployees(){
        return id + "," + name +"," + date +","+ gender +"," + idCountry +"," + phoneNumber +
                ","+ email +"," + lever +"," + address +"," + wage;
    }
}
