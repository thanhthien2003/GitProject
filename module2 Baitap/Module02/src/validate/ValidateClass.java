package validate;

import java.util.Scanner;
import java.util.regex.Matcher;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regEx = "^[C A P][0-9]{4}[G H I K]$";
        String classes = sc.nextLine();
        boolean flag = classes.matches(regEx);
        if (flag) {
            System.out.println("Lớp của bạn là " + classes);
        } else {
            System.out.println("Nhập sai định dạng lớp");
        }
    }
}
