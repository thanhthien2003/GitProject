package case_study_again.util;

import case_study_again.models.facilitys.House;
import case_study_again.models.facilitys.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndWriteRoom {
    private static final String PATH_FILE_ROOM = "src\\case_study_again\\data\\room.csv";
    public static Map<Room,Integer> readFileRoom(){
        Map<Room,Integer>roomMap = new LinkedHashMap<>();
        File file = new File(PATH_FILE_ROOM);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine()) != null){
                String [] arr = line.split(",");
                Room room = new Room(arr[0],Integer.parseInt(arr[1]),Float.parseFloat(arr[2]),
                        Integer.parseInt(arr[3]),arr[4],arr[5],arr[6]);
                int useValue = Integer.parseInt(arr[7]);
                roomMap.put(room,useValue);
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
        return roomMap;
    }

    public static void writeFileRoom(Map<Room,Integer>roomMap,boolean append){
        File file = new File(PATH_FILE_ROOM);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room r:roomMap.keySet()) {
                bufferedWriter.write(r.getInforRoom() + "," + roomMap.get(r));
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
