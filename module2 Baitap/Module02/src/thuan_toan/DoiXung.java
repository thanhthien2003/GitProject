package thuan_toan;

import java.util.Scanner;

public class DoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        long check = sc.nextLong();
        boolean flag=true;
    String numberCheck = String.valueOf(check);
        for (int i = 0; i < numberCheck.length(); i++) {
                if (numberCheck.charAt(i) != (numberCheck.charAt(numberCheck.length()-1-i))){
                    flag = false;
                    break;
                }
        }
        if (flag){
            System.out.println("Đây là số đối xứng " + check);
        } else {
            System.out.println("Đây không phải là số đối xứng");
        }
    }
}
