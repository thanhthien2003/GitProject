package loop_in_java;

import java.util.Scanner;

public class Bai1HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("chon cac lenh sau day \n"+
                "1.Print the rectangle \n" +
                "2.Print the square triangle \n" +
                "3.Print isosceles triangle \n"+
                "4.Exit");
        int choose = scr.nextInt();
        switch (choose){
            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("nhap chieu rong cua hcn");
                int m = sc.nextInt();
                Scanner scanner = new Scanner(System.in);
                System.out.println("nhap chieu dai cua hcn");
                int n = scanner.nextInt();
                for(int i=0;i<m;i++){
                    System.out.println(" ");
                    for(int j=0;j<n;j++){
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                for(int i=0;i<7;i++){
                    System.out.println(" ");
                    for(int j=0;j<i;j++){
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                System.out.println(" ");
                for(int i=7;i>=0;i--){
                    System.out.println(" ");
                    for(int j=0;j<i;j++){
                        System.out.print("*");
                    }
                }
                break;
            case 4:
                for ( int i=0; i < 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < (i + 1) * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
        }
    }
}
