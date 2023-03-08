package array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2TinhTongCacSoCacSoODuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai cua canh ma tran vuong");
        int n = sc.nextInt();
        int result = sumArray(initArray(n));
        System.out.println("\ntong duong cheo chinh cua hinh vuong la " + result);
    }
    public static int [][] initArray(int n){
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("nhap phan tu thu o cot " + j + " hang  " + i);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        return arr;
    }
    public static int sumArray(int[][] m){
        int sumArray = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i] == m[j]){
                    sumArray = sumArray + m[i][j];
                }
            }
        }
        return sumArray;
    }
}
