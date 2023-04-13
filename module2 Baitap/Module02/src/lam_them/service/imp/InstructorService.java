package lam_them.service.imp;

import lam_them.model.Instructor;
import lam_them.repository.IPersonRepo;
import lam_them.repository.imp.RepoInstructor;
import lam_them.service.IPersonService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InstructorService implements IPersonService {
    static IPersonRepo instructorRepo = new RepoInstructor();
    static Instructor instructor = new Instructor();
    static List<Instructor> instructorsList = instructorRepo.display();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("enter id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter date");
        String date = sc.nextLine();
        System.out.println("enter gender");
        String gender = sc.nextLine();
        System.out.println("enter specialize");
        String specialize = sc.nextLine();
        instructor = new Instructor(id, name, date, gender, specialize);
        instructorRepo.add(instructor);
    }

    @Override
    public void delete() {
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < instructorsList.size(); i++) {
            if (id == instructorsList.get(i).getId()) {
                instructorsList.remove(i);
            }
        }
        instructorRepo.delete(instructorsList);
    }

    @Override
    public void display() {
        for (Instructor i : instructorsList) {
            System.out.println(i);
        }
    }
}
