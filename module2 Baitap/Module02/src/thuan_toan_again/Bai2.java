package thuan_toan_again;

import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    public static Map<String,Integer> countChar(String a){
        Map<String,Integer> countChatResult = new HashMap<>();
         String [] arr = a.split("");
        for (int i = 0; i < arr.length; i++) {
            if (countChatResult.containsKey(arr[i])){
                countChatResult.put(arr[i],countChatResult.get(arr[i])+1);
            } else {
                countChatResult.put(arr[i],1);
            }
        }
            return countChatResult;
    }

    public static void main(String[] args) {
        Map<String,Integer>stringIntegerMap=countChar("okiluon");
        for (String s:stringIntegerMap.keySet()) {
            System.out.println(s+","+stringIntegerMap.get(s));
        }
    }
}
