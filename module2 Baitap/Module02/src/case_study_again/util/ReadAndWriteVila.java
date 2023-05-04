package case_study_again.util;

import case_study_again.models.facilitys.House;
import case_study_again.models.facilitys.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteVila {
     private static final String PATH_FILE_VILA="src\\case_study_again\\data\\vila.csv";
     public static Map<Villa,Integer> readFileVilla(){
          Map<Villa,Integer>villaMap = new LinkedHashMap<>();
          File file = new File(PATH_FILE_VILA);
          FileReader fileReader = null;
          BufferedReader bufferedReader = null;
          try {
               fileReader = new FileReader(file);
               bufferedReader = new BufferedReader(fileReader);
               String line=null;
               while ((line=bufferedReader.readLine()) != null){
                    String [] arr = line.split(",");
                    Villa villa = new Villa(arr[0],Integer.parseInt(arr[1]),Float.parseFloat(arr[2]),Integer.parseInt(arr[3])
                            ,arr[4],arr[5],Float.parseFloat(arr[6]),Integer.parseInt(arr[7]),arr[8]);
                    int useValue = Integer.parseInt(arr[9]);
                    villaMap.put(villa,useValue);
               }
          } catch (FileNotFoundException e) {
               throw new RuntimeException(e);
          } catch (IOException e) {
               throw new RuntimeException(e);
          } finally {
               try {
                    bufferedReader.close();
                    fileReader.close();
               } catch (IOException e) {
                    throw new RuntimeException(e);
               }
          }
          return villaMap;
     }

     public static void writeFileVilla(Map<Villa,Integer>villaMap,boolean append){
          File file = new File(PATH_FILE_VILA);
          FileWriter fileWriter = null;
          BufferedWriter bufferedWriter = null;
          try {
               fileWriter = new FileWriter(file,append);
               bufferedWriter = new BufferedWriter(fileWriter);
               for (Villa v:villaMap.keySet()) {
                    bufferedWriter.write(v.getInforVilla() + "," + villaMap.get(v));
                    bufferedWriter.newLine();
               }
          } catch (IOException e) {
               throw new RuntimeException(e);
          } finally {
               try {
                    bufferedWriter.close();
                    fileWriter.close();
               } catch (IOException e) {
                    throw new RuntimeException(e);
               }
          }
     }
}
