package quan_ly_cong_viec.util;

import quan_ly_cong_viec.model.ChiTieu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinary {
    public static final String PATH_FILE_MA_HOA = "src\\quan_ly_cong_viec\\data\\data.txt";

    public static void writeFileBinary(List<ChiTieu> chiTieuList) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_FILE_MA_HOA);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(chiTieuList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<ChiTieu> readFileBinary() {
        List<ChiTieu> chiTieuList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        try {
            File file = new File(PATH_FILE_MA_HOA);
            if(file.length()==0){
                return chiTieuList;
            }else {
                fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                chiTieuList = (List<ChiTieu>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return chiTieuList;
    }
}
