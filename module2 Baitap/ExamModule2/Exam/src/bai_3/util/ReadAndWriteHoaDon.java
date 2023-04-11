package bai_3.util;

import bai_3.model.HoaDonTienDien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteHoaDon {


    public static List<HoaDonTienDien> readFile(String PATH_FILE) {
        List<HoaDonTienDien> hoaDonList = new ArrayList<>();
        File file = new File(PATH_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                hoaDonList.add(new HoaDonTienDien(arr[0], arr[1], arr[2], Long.parseLong(arr[3])));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hoaDonList;
    }

    public static void writeFile(String PATH_FILE,List<HoaDonTienDien> hoaDonTienDienList, boolean flag) {
        File file = new File(PATH_FILE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (HoaDonTienDien h : hoaDonTienDienList) {
                bufferedWriter.write(h.getInforFile());
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
