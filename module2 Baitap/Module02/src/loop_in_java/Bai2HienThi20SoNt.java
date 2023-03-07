package loop_in_java;

import java.util.Scanner;

public class Bai2HienThi20SoNt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so muon check vao day");
        int soNT = sc.nextInt();
        int count = 0;
        for(int i=1;i<=soNT;i++){
            if(soNT % i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println("day la so Nt");
        } else{
            System.out.println("so ban nhap k phai so NT");
        }
    }
}
