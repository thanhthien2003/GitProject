package thuan_toan_again;

import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    public static List<Integer> sumTwoAuto(int a,int[]arr){
        List<Integer>integerList = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[j]+arr[i]==a){
                    integerList.add(j);
                    integerList.add(i);
                    return integerList;
                }
            }
        }
        return integerList;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,9,2,0,19,39,4,2};
        List<Integer>integerList = sumTwoAuto(3,arr);
        System.out.println("vi tri so thu nhat la: " + integerList.get(0)+", vi tri cua so thu 2 la: " + integerList.get(1));
    }
}
