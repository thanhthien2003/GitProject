package thuan_toan;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("REVERSE");
        int a = sc.nextInt();
        int b=0;
        while (a!=0){
        int z = a%10;
        b = b*10 +z;
        a= a/10;
        }
        System.out.println(b);
    }
}

