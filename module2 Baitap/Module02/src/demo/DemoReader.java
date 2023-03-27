package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoReader {
    public static void main(String[] args) {
        String pathFile = "src\\demo\\text.txt";
        List<String> stringList = readerList(pathFile);
        for (String s:stringList) {
            System.out.println(s);
        }
    }
    public static List<String> readerList(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try{
            reader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
}
