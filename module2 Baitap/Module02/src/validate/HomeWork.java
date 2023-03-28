package validate;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String regEx = "^([A-Z][a-z]+)(\s[A-Z][a-z]+)+$";
        boolean flag = name.matches(regEx);
        if (flag) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Tên sai định dạng");
        }
    }
}
