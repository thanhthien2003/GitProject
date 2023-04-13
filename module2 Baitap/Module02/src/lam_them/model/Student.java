package lam_them.model;

public class Student extends Person {
    private String classes;
    private int point;

    public Student() {
    }

    public Student(int id, String name, String date, String gender, String classes, int point) {
        super(id, name, date, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
