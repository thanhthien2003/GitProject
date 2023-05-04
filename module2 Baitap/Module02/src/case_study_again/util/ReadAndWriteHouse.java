package case_study_again.util;

import case_study_again.models.facilitys.House;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteHouse {
    private static final String PATH_FILE_HOUSE = "src\\case_study_again\\data\\house.csv";

    public static Map<House,Integer> readFileHouse(){
        Map<House,Integer>houseMap = new LinkedHashMap<>();
        File file = new File(PATH_FILE_HOUSE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine()) != null){
                String [] arr = line.split(",");
                House house = new House(arr[0],Integer.parseInt(arr[1]),Float.parseFloat(arr[2]),Integer.parseInt(arr[3]),
                        arr[4],arr[5],Integer.parseInt(arr[6]),arr[7]);
                int useValue = Integer.parseInt(arr[8]);
                houseMap.put(house,useValue);
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
        return houseMap;
    }

    public static void writeFileHouse(Map<House,Integer>houseMap,boolean append){
        File file = new File(PATH_FILE_HOUSE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House h:houseMap.keySet()) {
                bufferedWriter.write(h.getInfoHouse() + "," + houseMap.get(h));
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
