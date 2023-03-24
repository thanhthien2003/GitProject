package io_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFIleText {
    public static void main(String[] args) {
        String path = "src\\io_text\\text.txt";
        List<String> list = readFileText(path);
        for (String e : list) {
            System.out.println(e);
        }
        writeFileText(list, "src/io_text/demo.txt", true);
    }

    public static List<String> readFileText(String filePath) {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("file k hợp lệ");
        }
        return stringList;
    }

    public static void writeFileText(List<String> stringList, String filePath, boolean a) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, a);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            for (int i = 0; i < stringList.size(); i++) {
                bufferedWriter.write(stringList.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("File lỗi rồi bạn ơii");
        }
    }
}
