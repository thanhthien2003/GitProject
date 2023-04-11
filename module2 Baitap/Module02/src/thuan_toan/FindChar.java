package thuan_toan;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi bất kỳ");
        String line = sc.nextLine();
        line = line.toLowerCase();
        int count =0;
        System.out.println("nhập ký tự muốn check");
        String a = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            String b = String.valueOf(line.charAt(i));
            if (a.equals(b)){
             count++;
            }
        }
        System.out.println("ký tự: " + a + " số lần xuất hiện: " + count);
    }
}
