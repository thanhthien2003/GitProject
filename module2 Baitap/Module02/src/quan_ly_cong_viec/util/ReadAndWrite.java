package quan_ly_cong_viec.util;

import quan_ly_cong_viec.model.ChiTieu;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static private final String PATH_FILE = "src\\quan_ly_cong_viec\\data\\data.csv";
    public static List<ChiTieu> readFile(){
        List<ChiTieu> chiTieuList = new ArrayList<>();
        File file  = new File(PATH_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                String [] arr  = line.split(",");
                ChiTieu chiTieu  = new ChiTieu(arr[0],arr[1],arr[2],Long.parseLong(arr[3]),arr[4]);
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

    public static void writeFile(List<ChiTieu>chiTieuList,boolean append){
            File file = new File(PATH_FILE);
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter= null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (ChiTieu c:chiTieuList) {
                bufferedWriter.write(c.getInforFileCSV());
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
