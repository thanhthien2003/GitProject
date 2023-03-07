package loop_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu trong mang");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            Scanner scr = new Scanner(System.in);
            System.out.println("nhap phan tu thu " + (i+1) + " cua mang");
            int n1 = scr.nextInt();
            arr[i] = n1;
        }
        System.out.println(Arrays.toString(arr));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nhap so luong phan tu trong mang");
        int m = sc1.nextInt();
        int [] arr1 = new int[m];
        for(int i=0;i<m;i++){
            Scanner scr1 = new Scanner(System.in);
            System.out.print("nhap phan tu thu " + (i+1) + " cua mang");
            int m1 = scr1.nextInt();
            arr1[i] = m1;
        }

        System.out.println(Arrays.toString(arr));
        int [] arr2 = new int[n+m];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[arr2.length-1-i] = arr1[i];
        }
        System.out.print("mang sau khi gop la ");
        System.out.println(Arrays.toString(arr2));
    }
}
