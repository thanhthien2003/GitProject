package thuan_toan_again;

import java.util.ArrayList;
import java.util.List;

public class Bai10 {
    public static int findMaxNumber(int a){
        String [] arr = String.valueOf(a).split("");
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i)<list.get(i+1)){
                list.remove(i);
                break;
            }
        }
        StringBuilder result= new StringBuilder();
        List<String>arr2=new ArrayList<>();
        for (Integer i :list) {
           arr2.add(String.valueOf(i));
        }
        for (String s:arr2) {
            result.append(s);
        }
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(findMaxNumber(2739));
    }
}
