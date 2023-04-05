package case_study.utils;

import case_study.models.facility.Facility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFacility {
    public static List<String> readFile(String pathFile){
        List<String>facilityList=new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader =null;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                facilityList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return facilityList;
    }
    public static void writeFile(String pathFile,String text,boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } try {
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
