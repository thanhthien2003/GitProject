package case_study_again.models.persons;

public class Employees extends Person{
    private String lever;
    private String position;
    private float wage;

    public Employees() {
    }

    public Employees(String id, String name, String date, String gender, String idCountry, String phoneNumber, String email, String lever, String position, float wage) {
        super(id, name, date, gender, idCountry, phoneNumber, email);
        this.lever = lever;
        this.position = position;
        this.wage = wage;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
                ", name='" + name + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                ", idCountry='" + idCountry + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", lever=" + lever +
                ", position=" + position +
                ", wage='" + wage + '\'' +
                '}';
    }

    public String getInforToEmployees(){
        return id + "," + name +"," + date +","+ gender +"," + idCountry +"," + phoneNumber +
                ","+ email +"," + lever +"," + position +"," + wage;
    }
}
