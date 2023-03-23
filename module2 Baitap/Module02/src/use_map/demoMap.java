package use_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class demoMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"thanh");
        map.put(1,"phan");
        map.put(4,"thien");
        map.put(2,"thi");
        map.put(3,"thi");
        map.put(229,"thi");
        System.out.println(map);

    }
}
