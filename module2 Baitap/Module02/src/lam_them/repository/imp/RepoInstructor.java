package lam_them.repository.imp;

import lam_them.model.Instructor;
import lam_them.repository.IPersonRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoInstructor implements IPersonRepo<Instructor> {
    static Scanner sc = new Scanner(System.in);
    static List<Instructor> instructorList = new ArrayList<>();

    static {
        Instructor instructor1 = new lam_them.model.Instructor(15, "ok33", "2aadada", "da2da", "j34ap");
        Instructor instructor2 = new lam_them.model.Instructor(23, "ok332", "2aada", "da2da", "jd3ap");
        Instructor instructor3 = new lam_them.model.Instructor(34, "ok1", "2aada", "da2da", "jda34p");
        instructorList.add(instructor1);
        instructorList.add(instructor2);
        instructorList.add(instructor3);
    }

    @Override
    public void add(Instructor instructor) {
        instructorList.add(instructor);
    }

    @Override
    public void delete(List instructorLists) {
        instructorList = instructorLists;
    }

    @Override
    public List<Instructor> display() {
        return instructorList;
    }
}
