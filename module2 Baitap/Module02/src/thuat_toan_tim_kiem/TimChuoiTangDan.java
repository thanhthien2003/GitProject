package thuat_toan_tim_kiem;

import java.awt.image.ImageProducer;
import java.util.*;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi bat ky");
        String str = sc.nextLine();
        String[] arr = str.toLowerCase().split(" ");
        for (String i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (String j : map.keySet()) {
            System.out.println(j + "=" + map.get(j));
        }
    }
}