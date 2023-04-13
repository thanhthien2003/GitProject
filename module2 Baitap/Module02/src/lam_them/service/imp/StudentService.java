package lam_them.service.imp;

import lam_them.model.Instructor;
import lam_them.model.Student;
import lam_them.repository.IPersonRepo;
import lam_them.repository.imp.RepoStudent;
import lam_them.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {
    static IPersonRepo studentRepo = new RepoStudent();
    static List<Student> studentList = studentRepo.display();
    static Student student = new Student();
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
        System.out.println("enter classes");
        String specialize = sc.nextLine();
        System.out.println("enter point");
        int point = Integer.parseInt(sc.nextLine());
        student = new Student(id, name, date, gender, specialize, point);
        studentRepo.add(student);
    }

    @Override
    public void delete() {
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                studentList.remove(i);
            }
        }
        studentRepo.delete(studentList);
    }

    @Override
    public void display() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
