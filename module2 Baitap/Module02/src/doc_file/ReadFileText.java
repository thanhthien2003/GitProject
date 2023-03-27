package doc_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFileText {
    public static void main(String[] args) {
        String filePath = "src/doc_file/TenQuocGia.CSV";
        List<Country> objectList = readFileCSV(filePath);
        for (Country e : objectList) {
            System.out.println(e);
        }
    }

    public static List<Country> readFileCSV(String filePath) {
        List<Country> objectList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                objectList.add(new Country(Integer.parseInt(data[0]), (data[1]), (data[2])));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("file lỗi rùi bạn ơi");
        }
        return objectList;
    }
}
