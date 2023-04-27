package case_study_again.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite<E>{
//    public  List<E> readFile(String PATH_FILE){
//        List<E>list=new ArrayList<>();
//        File file = new File(PATH_FILE);
//        FileReader fileReader =null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line=bufferedReader.readLine())!=null){
//                list.add((E) line);
//            }
//            bufferedReader.close();
//            fileReader.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return list;
//    }
//    public void writeFile(String PATH_FILE,List<E>list){
//        File file =new File(PATH_FILE);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (E e:list) {
//                bufferedWriter.write(e.toString());
//                bufferedWriter.newLine();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                bufferedWriter.close();
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
