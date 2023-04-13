package lam_them.repository.imp;

import lam_them.model.Student;
import lam_them.repository.IPersonRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RepoStudent implements IPersonRepo<Student> {

    static Scanner sc = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();

    static {
        Student student = new Student(1, "ad", "23aaa", "ada2da", "dadw2", 33);
        Student student2 = new Student(3, "ad", "23adaa", "ada2da", "dadw2", 33);
        Student student3 = new Student(4, "ad", "23a22abba", "adiot2da", "dadw2", 33);
    }

    @Override
    public void delete(List studentLists) {
        studentList = studentLists;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> display() {
        return studentList;
    }


}
