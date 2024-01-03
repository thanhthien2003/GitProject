package mvc.controler;

import mvc.service.BugService;
import mvc.service.IBugService;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    IBugService bugService = new BugService();

    public void mainMenu() {
        boolean flag = true;
        System.out.println("--------Danh sach bugs--------");
        do {
            System.out.println("Moi ban chon chuc nang: " +
                    "\n 1. Hien thi danh sach bugs" +
                    "\n 2. Them moi bug" +
                    "\n 3. Thoat");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    bugService.display();
                    flag = false;
                    break;
                case "2":
                    bugService.add();
                    flag = false;
                    break;
                case "3":
                    flag = true;
                    break;
                default:
                    flag = false;
                    System.out.println("Lua chon cua ban khong ton tai, vui long chi nhap so tu 1 den 3");
            }
        } while (!flag);
    }
}
