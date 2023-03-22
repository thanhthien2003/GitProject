package sap_xep;

import java.util.Arrays;

public class DemoChen {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int x;
        int index;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            index = i;
            while (index > 0 && x < arr[index - 1]) {
                arr[index] = arr[index - 1];
                System.out.println("lan thu " + i + "vi tri index " + index + " mang: " + Arrays.toString(arr));
                index--;

            }
            arr[index] = x;
            System.out.println("mang duoc sap xep sau lan thu  " + i + " = " + Arrays.toString(arr));
        }
    }
}
