package thuan_toan_again;

public class Bai9 {
    public static int findSecondMaxNumber(int []arr){
        int max=arr[0];
        int secondMax=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondMax<arr[i]&&max>arr[i]){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,4,4,4,6,5,5,2};
        System.out.println(findSecondMaxNumber(arr));
    }
}
