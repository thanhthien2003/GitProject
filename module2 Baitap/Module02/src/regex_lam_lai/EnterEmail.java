package regex_lam_lai;

import java.util.Scanner;

public class EnterEmail {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean flag =true;
        do {
            System.out.println("nhap email");
            String email= scanner.nextLine();
            if (CheckRegEx.checkEmail(email)){
                flag = true;
                System.out.println("Email dung roi");
            } else {
                flag = false;
                System.out.println("nhap sai dinh dang email , moi nhap lai"+
                        "\n emal phai co dinh dang: XXXXXXX@XXXXX.XXXX");
            }
        }while (!flag);
    }
}
