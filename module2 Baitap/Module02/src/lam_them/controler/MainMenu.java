package lam_them.controler;

import lam_them.service.imp.InstructorService;
import lam_them.service.imp.StudentService;

import java.util.Scanner;

public class MainMenu {
    public static void display() {

        Scanner sc = new Scanner(System.in);
        boolean flag;
        int menu;
        do {
            flag = true;
            System.out.print("Lựa chọn thao tác với học sinh hay giảng viên: \n" +
                    "1.Học sinh \n" +
                    "2.Giảng viên \n" +
                    "3.Thoát \n");
            menu = sc.nextInt();
            System.out.println();
            switch (menu) {
                case 1:
                    MainMenu.displayStudent();
                    break;
                case 2:
                    MainMenu.displayInstructor();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("mời bạn nhập lại lựa chọn không hợp lệ ");
            }
        } while (flag);
    }

    public static void displayStudent() {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        int menu;
        boolean flag;
        do {
            flag = true;
            System.out.println("Lựa chọn các tác vụ để làm việc với danh sách học viên \n" +
                    "1.Thêm mới học sinh \n" +
                    "2.Xóa học sinh \n" +
                    "3.Xem danh sách hoặc học sinh \n" +
                    "4.Thoát \n");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Thêm mới");
                    studentService.add();
                    break;
                case 2:
                    System.out.println("xóa học sinh");
                    studentService.delete();
                    break;
                case 3:
                    System.out.println("Xem danh sách học sinh");
                    studentService.display();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("mời bạn nhập lại, nội dung nhập không hợp lệ ");
            }
        } while (flag);
    }

    public static void displayInstructor() {
        InstructorService instructorService = new InstructorService();
        Scanner sc = new Scanner(System.in);
        int menu;
        boolean flag;
        do {
            flag = true;
            System.out.println("Lựa chọn các tác vụ để làm việc với danh sách giảng  \n" +
                    "1.Thêm mới giảng viên \n" +
                    "2.Xóa học sinh \n" +
                    "3.Xem danh sách giảng viên \n" +
                    "4.Thoát \n");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Thêm mới");
                    instructorService.add();
                    break;
                case 2:
                    System.out.println("xóa giảng viên");
                    instructorService.delete();
                    break;
                case 3:
                    System.out.println("Xem danh sách giảng viên");
                    instructorService.display();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("mời bạn nhập lại, nội dung nhập không hợp lệ ");
            }
        } while (flag);
    }
}
