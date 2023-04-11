package bai_1;

public class Bai1 {
    public static void main(String[] args) {
        int [] arr = {0,2,4,6,8};
        int [] arr2 = {5,10,15,20};
        int [] arr3 = {2,4,7,9};
        System.out.println(checkArray(arr));
        System.out.println(checkArray(arr2));
        System.out.println(checkArray(arr3));
    }
    static boolean checkArray(int[]arr){
        int count1 = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            int count2 = arr[i] - arr[i-1];
            if (count1 != count2){
                return false;
            }
        }
        return true;
    }
}
