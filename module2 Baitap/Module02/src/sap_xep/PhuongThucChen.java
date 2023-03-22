package sap_xep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class PhuongThucChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int x;
        int index;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            index = i;
            while (index > 0 && x < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = x;
        }
    }
}
