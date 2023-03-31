package case_study.models.person;

public class Employee extends Person{
    private String lever;
    private String address;
    private float wage;

    public Employee() {
    }

    public Employee(int id, String name, String date, String gender, int idCountry, int phoneNumber, String email, String lever, String address, float wage) {
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
                ", id=" + id + '\'' +
                ", address='" + address + '\'' +
                ", wage='" + wage + '\'' +
                "lever='" + lever +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", idCountry=" + idCountry +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    public String getInforToEmployee(){
        return "id= " +id + ",address= " + address +",wage= " + wage +",lever= "+ lever +",name= " + name +",date= " + date +
                ",gender= "+ gender +",idCountry= " + idCountry +",phoneNumber= " + phoneNumber +",email= " + email;
    }
}
