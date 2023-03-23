package lam_them.service.imp;

import lam_them.model.Student;
import lam_them.service.IPerson;

import java.util.ArrayList;

public class StudentService implements IPerson {
    static ArrayList<Student> students = new ArrayList<>();
    static {
        students.add(new Student());
    }
    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }

    @Override
    public void outService() {

    }
}
