package lam_them.service.imp;

import lam_them.model.Instructor;
import lam_them.service.IPerson;

import java.util.ArrayList;

public class InstructorService implements IPerson {
    static ArrayList<Instructor> instructors = new ArrayList<>();
    static {
        instructors.add(new Instructor());
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
