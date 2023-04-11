package thuan_toan;

import java.util.*;

public class CheckChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi bất kỳ!!");
        String line = scanner.nextLine();
        Map<Character,Integer> stringMap = new HashMap<>();
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            char a = line.charAt(i);
            if (stringMap.containsKey(a)){
                int count = stringMap.get(a);
                stringMap.put(a,count+1);
        }else {
                stringMap.put(a,1);
            }
        }
        for (Character c:stringMap.keySet()) {
            System.out.println("ky tu: " +c+ " ,so lan xuat hien la : "+stringMap.get(c));
        }
    }
}
