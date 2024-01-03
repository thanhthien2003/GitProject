package mvc.service;

import mvc.model.Bug;
import mvc.repository.BugRepo;
import mvc.repository.IBugRepo;
import mvc.util.RegExBug;

import java.util.List;
import java.util.Scanner;

public class BugService implements IBugService {
    Scanner sc = new Scanner(System.in);
    IBugRepo bugRepo = new BugRepo();

    @Override
    public void display() {
        for (Bug b : bugRepo.display()) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        boolean flag = true;
        String maBug = null;
        do {
            System.out.print("Nhap ma bug: ");
            maBug = sc.nextLine();
            if (RegExBug.checkRegExMaBug(maBug)) {
                flag = true;
            } else {
                System.out.println("Vui long nhap dung dinh dang cua ma Bug la BUG-XXX trong do X la cac so");
                flag = false;
            }
        } while (!flag);
        String tenBug = "";
        do {
            flag = true;
            System.out.print("Nhap ten bug: ");
            tenBug = sc.nextLine();
            if (tenBug == "") {
                flag = false;
                System.out.println("Vui long khong de trong");
            }
        } while (!flag);
        String mieuTaBug = "";
        do {
            flag = true;
            System.out.print("Nhap mieu ta bug: ");
            mieuTaBug = sc.nextLine();
            if (mieuTaBug == "") {
                flag = false;
                System.out.println("Vui long khong de trong");
            }
        } while (!flag);
        String thoiGianBug = "";
        do {
            flag = true;
            System.out.print("Nhap thoi gian xay ra bug: ");
            thoiGianBug = sc.nextLine();
            if (thoiGianBug == "") {
                flag = false;
                System.out.println("Vui long khong de trong");
            }
        } while (!flag);
        String mucDoNguyHai = "";
        List<String> mucDoNguyHaiList = bugRepo.optionMucDoNguyHai();
        do {
            flag = true;
            System.out.println("Xin moi chon muc do nguy hai cua bug: " +
                    "\n 1. Critical" +
                    "\n 2. Major" +
                    "\n 3. Medium" +
                    "\n 4. Low");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    mucDoNguyHai = mucDoNguyHaiList.get(0);
                    flag = true;
                    break;
                case "2":
                    mucDoNguyHai = mucDoNguyHaiList.get(1);
                    flag = true;
                    break;
                case "3":
                    mucDoNguyHai = mucDoNguyHaiList.get(2);
                    flag = true;
                    break;
                case "4":
                    mucDoNguyHai = mucDoNguyHaiList.get(3);
                    flag = true;
                default:
                    System.out.println("Vui long chi duoc nhap cac so tu 1 - 4 tuong ung voi cac lua chon");
                    flag = false;
            }
        } while (!flag);
        Bug bug = new Bug(maBug, tenBug, mieuTaBug, thoiGianBug, mucDoNguyHai);
        bugRepo.add(bug);
    }
}
