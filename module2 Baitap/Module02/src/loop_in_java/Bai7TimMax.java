package loop_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7TimMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang 2 chieu");
        int n = sc.nextInt();
        System.out.println("nhap do dai tung phan tu mang 2 chieu");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhap phan tu " + j + " cua phan tu " + i + " cua mang 2 chieu");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong mang la " + max);
    }
}
