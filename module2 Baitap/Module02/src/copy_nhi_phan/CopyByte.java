package copy_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyByte {
    public static void main(String[] args) {
        String pathFile1 = "src\\copy_nhi_phan\\nguon.dat";
        String pathFile2 = "src\\copy_nhi_phan\\dich.dat";
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        writeFile(pathFile1, text);
        String result = readFile(pathFile1);
        writeFile(pathFile2, result);
    }

    public static String readFile(String pathFile) {
        String result = "";
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        try {
            if (!file.exists()) {
                System.out.println("file không tồn tại");
            }
            fileInputStream = new FileInputStream(file);
            int i = -1;
            while ((i = fileInputStream.read()) != -1) {
                result += (char) i;
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void writeFile(String pathFile, String stringList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            if (!file.exists()) {
                System.out.println("File đã tồn tại");
            }
            fileOutputStream = new FileOutputStream(file);
            byte[] bytes = stringList.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                fileOutputStream.write(bytes[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
