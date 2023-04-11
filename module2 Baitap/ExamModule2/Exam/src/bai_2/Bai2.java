package bai_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                int a = Integer.parseInt(sc.nextLine());
                System.out.println(findMaxNumber(a));
            } catch (Exception e) {
                flag = false;
                System.out.println("Chỉ được nhập số");
            }
        }while (!flag);
    }
    static int findMaxNumber(int n){
        if (n<1000){
            return -1;
        }else {
            String s = String.valueOf(n);
            String [] arr = s.split("");
            String a = arr[0];
            String b = arr[1];
            String c = arr[2];
            String d = arr[3];
            String stringSum1 = a + b + c;
            String stringSum2 = a + c + d;
            String stringSum3 = b + c + d;
            String stringSum4 = b + a + d;
            int sum1 = Integer.parseInt(stringSum1);
            int sum2 = Integer.parseInt(stringSum2);
            int sum3 = Integer.parseInt(stringSum3);
            int sum4 = Integer.parseInt(stringSum4);
            int [] arr2 = {sum1,sum2,sum3,sum4};
            int max = arr2[0];
            for (int i = 1; i < arr2.length; i++) {
                if (max < arr2[i]){
                    max = arr2[i];
                }
            }
            return max;
        }
    }


}
