package loop_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4XoaPhanTuMang {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,2,45,3,6};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                }
            }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
        }
    }
