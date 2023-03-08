package array;

import java.util.Scanner;

public class BaiTinhTong1CotBatKy {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {8, 7, 6},
                {9, 10, 22}
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhap cot muon tinh tong");
        int a = sc.nextInt();
        int x = sum(arr, a);
        System.out.println(x);
    }

    public static int sum(int arr[][], int c) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (c <= -1 || c > arr[i].length) {
                System.out.println("cot nay khong ton tai");
                break;
            } else {
                sum = sum + arr[i][c - 1];
            }
        }
        return sum;
    }
}

