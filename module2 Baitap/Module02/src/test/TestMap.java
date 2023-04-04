package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("oki",1);
        map.put("oke",2);
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> e: entrySet) {
            System.out.println("key-value: " + e.getKey() + e.getValue());
        }
    }
}
