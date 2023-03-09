package loop_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu trong mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + " cua mang");
            int n1 = sc.nextInt();
            arr[i] = n1;
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("phan tu nho nhat la " + min);
    }
}
