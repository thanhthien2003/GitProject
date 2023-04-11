package thuan_toan;

import java.util.Scanner;

public class SumSnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------nhập vào giới hạn độ lớn của số SNT---------");
        boolean flag;
        do {
            flag =true;
            try {
                int sumSnt = 0;
                int count = 0;
                int n = Integer.parseInt(sc.nextLine());
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count = count + 1;
                        }
                    }
                    if (count == 2) {
                        System.out.println("đây là SNT= " + i);
                        sumSnt = sumSnt + i;
                    }
                    count = 0;
                }
            System.out.println("Tổng số nguyên tố bé hơn " + n + " = " + sumSnt);
            }catch (Exception e){
                System.out.println("Nhập sai định dạng");
                flag = false;
            }
        }while (!flag) ;
    }
}
