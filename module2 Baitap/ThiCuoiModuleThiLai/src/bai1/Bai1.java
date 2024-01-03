package bai1;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 1, 2, 6, 6, 6, 5, 5};
        System.out.println(findSingleNumber(arr));
    }

    public static int findSingleNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
            count = 0;
        }
        return -1;
    }
}
