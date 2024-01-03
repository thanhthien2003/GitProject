package mvc.util;

import mvc.model.Fruit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String PATH_FILE="mvc\\data\\dattta.csv";
    public static List<Fruit> readFile(){
        List<Fruit> chiTieuList = new ArrayList<>();
        File file  = new File(PATH_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                String [] arr  = line.split(",");
                Fruit chiTieu  = new Fruit(arr[0],arr[1],arr[2],arr[3],arr[4],Long.parseLong(arr[5]));
                chiTieuList.add(chiTieu);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return chiTieuList;
    }

    public static void writeFile(List<Fruit>chiTieuList,boolean append){
        File file = new File(PATH_FILE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter= null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Fruit c:chiTieuList) {
                bufferedWriter.write(c.getInforCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
