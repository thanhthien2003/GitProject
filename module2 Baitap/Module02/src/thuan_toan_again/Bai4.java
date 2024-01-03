package thuan_toan_again;

import java.util.ArrayList;
import java.util.List;

public class Bai4 {
    public static List<Integer> listSNT(int a){
        List<Integer>listSNT = new ArrayList<>();
        List<Integer>listSNTshare3=new ArrayList<>();
        for (int i = 0; i <= a; i++) {
            int count=0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                listSNT.add(i);
            }
        }
        int size = listSNT.size();
        for (int i = 0; i < size; i++) {
            if (listSNT.get(i)%3==0){
                listSNTshare3.add(listSNT.get(i));
            }
        }
        return listSNTshare3;
    }

    public static void main(String[] args) {
        System.out.println(listSNT(100));
    }
}
