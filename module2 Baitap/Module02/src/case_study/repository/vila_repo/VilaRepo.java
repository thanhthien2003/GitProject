package case_study.repository.vila_repo;

import case_study.models.facility.House;
import case_study.models.facility.Villa;
import case_study.repository.house_repo.IHouseRepo;
import case_study.utils.ReadAndWriteFacility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class VilaRepo implements IVilaRepo{

        private static final String PATH_FILE = "src\\case_study\\data\\villa.csv";
    @Override
    public void add(Villa villa, Integer value) {
        String text = villa.getInforVilla();
        ReadAndWriteFacility.writeFile(PATH_FILE,text,true);
    }
    @Override
    public void saveToFileVilla(Map<Villa, Integer> villaIntegerMap) {
        File file = new File(PATH_FILE);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            for (Villa v:villaIntegerMap.keySet()) {
                fileWriter.write(v.getInforVilla() + villaIntegerMap.get(v));
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
