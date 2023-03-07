package loop_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu trong mang");
        int n = sc.nextInt();
       int [] arr = new int[n];
        for(int i=0;i<n;i++){
            Scanner scr = new Scanner(System.in);
            System.out.println("nhap phan tu thu " + (i+1) + " cua mang");
            int m = scr.nextInt();
            arr[i] = m;
        }
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri muon chen ");
        int x = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhap vi tri muon chen vao");
        int index = scanner1.nextInt();
        if(index <= -1 || index > arr.length-1){
            System.out.println("khong chen dc phan tu vao mang");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(index == i ){
                    arr[i] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
