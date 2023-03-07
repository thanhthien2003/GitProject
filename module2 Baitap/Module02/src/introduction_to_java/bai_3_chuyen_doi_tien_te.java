package introduction_to_java;

import java.util.Scanner;

public class bai_3_chuyen_doi_tien_te {
    public static void main(String[] args) {
        System.out.println("nhap so usd ban muon chuyen doi vao ");
        Scanner sc = new Scanner(System.in);
        int vnd = 23000;
        int usd = sc.nextInt();
        System.out.println("so tien vnd tuong ung la " + (usd * vnd));
    }
}
