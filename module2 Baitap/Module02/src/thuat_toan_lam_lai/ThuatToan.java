package thuat_toan_lam_lai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThuatToan {
    public static void main(String[] args) {
        String str = "abcabcabcd";
        String[] str1 = str.split("");
        for (int j = 0; j < str1.length; j++) {
            List<String> characterList = new ArrayList<>();
            for (int i = 0; i < str1.length; i++) {
                if (str1[j].equals(str1[i])) {
                    characterList.add(str1[i]);
                }
            }
            System.out.println(characterList.get(0) + "    " + characterList.size());
        }

    }
}
