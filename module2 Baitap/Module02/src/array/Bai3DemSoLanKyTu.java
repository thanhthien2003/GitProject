package array;

import java.util.Scanner;

public class Bai3DemSoLanKyTu {
    public static void main(String[] args) {
        String str = "phanthanhthien";
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == n){
                count++;
            }
        }
        System.out.println("so lan ky tu " + n + " trong chuoi " + str + " la " + count );
    }
}
