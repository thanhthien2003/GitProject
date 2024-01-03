package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhap so luong nhiem vu: ");
        boolean flag = true;
        int n = 0;
        do {
            flag = false;
            try {
                n = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                flag = true;
                System.out.println("Chi duoc nhap so");
            }
        } while (flag);
        List<String> nhiemVuList = nhapNhiemVu(n);
        for (int i = 0; i < n; i++) {
            System.out.println("nhiem vu thu " + (i + 1) + " : " + nhiemVuList.get(i));
        }
    }

    public static List<String> nhapNhiemVu(int n) {
        boolean flag = true;
        List<String> nhiemVuList = new ArrayList<>();
        int d = 0;
        int f = 0;
        int diemThuong = 0;
        String result = "";
        for (int i = 0; i < n; i++) {
            do {
                flag = false;
                try {
                    System.out.print("nhap d" + (i + 1) + ": ");
                    d = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    flag = true;
                    System.out.println("Chi duoc nhap so");
                }
            } while (flag);
            do {
                flag = false;
                try {
                    System.out.print("nhap f" + (i + 1) + ": ");
                    f = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    flag = true;
                    System.out.println("Chi duoc nhap so");
                }
            } while (flag);
            diemThuong = d - f;
            result = "d" + (i + 1) + " = " + d + " va " + "f" + (i + 1) + " = " + f + " diem thuong= " + diemThuong;
            nhiemVuList.add(result);
            result = "";
        }
        return nhiemVuList;
    }
}
