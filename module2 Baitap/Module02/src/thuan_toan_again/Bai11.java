package thuan_toan_again;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai11 {
    public static List<Integer> checkCount(int a){
        List<Integer>integerList  =new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a%i==0){
                integerList.add(i);
            }
        }
        return integerList;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println(checkCount(sc.nextInt()));
    }
}
