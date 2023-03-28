package validate;

import java.util.Scanner;

public class ValidateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regEx = "^(84)0[0-9]{9}$";
        String phoneNumber = sc.nextLine();
        boolean flag = phoneNumber.matches(regEx);
        if (flag) {
            System.out.println("sdt hop le");
        } else {
            System.out.println("sdt khong hop le");
        }
    }
}
