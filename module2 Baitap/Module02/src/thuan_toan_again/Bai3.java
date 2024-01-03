package thuan_toan_again;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        for (Integer i:sumFibonaci()) {
            System.out.println(i);
        }
    }
    public static List<Integer> sumFibonaci(){
        List<Integer>listFibonaci=new ArrayList<>();
        int result=0;
        int a = 0;
        int b = 1;
        listFibonaci.add(0);
        for (int i = 0; i < 100; i++) {
            result=a+b;
            if (result < 100) {
                a=b;
                b=result;
                listFibonaci.add(result);
            }
        }
        return listFibonaci;
    }
}
