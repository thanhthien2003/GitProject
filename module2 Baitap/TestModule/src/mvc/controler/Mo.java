package mvc.controler;

import java.io.*;

public class Mo {
    public static void main(String[] args) {
        String pathFile = "src/mvc/controler/data.txt";
            try {
                FileReader fileReader = new FileReader(pathFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line=null;
                while ((line=bufferedReader.readLine())!=null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
    }

