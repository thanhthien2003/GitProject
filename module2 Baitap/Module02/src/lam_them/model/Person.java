package lam_them.model;

public class Person {
    protected int id;
    protected String name;
    protected String date;
    protected String gender;

    public Person() {
    }

    public Person(int id, String name, String date, String gender) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
