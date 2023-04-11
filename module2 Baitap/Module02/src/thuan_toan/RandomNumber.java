package thuan_toan;

public class RandomNumber {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8,12,15,15,11};
        int n = 11;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == n){
                    System.out.println("vị trí 2 số trong mảng có tổng bằng n= "+n+" là:  arr[" + i  + "]" + "arr[" + j +"]");
                }
            }
        }
    }
}
