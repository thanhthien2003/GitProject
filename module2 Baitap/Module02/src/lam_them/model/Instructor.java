package lam_them.model;

public class Instructor extends Person{
    private String specialize;

    public Instructor() {
    }

    public Instructor(int id, String name, String date, String gender, String specialize) {
        super(id, name, date, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
