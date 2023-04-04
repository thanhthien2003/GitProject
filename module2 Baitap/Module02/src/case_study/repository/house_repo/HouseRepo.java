package case_study.repository.house_repo;

import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.utils.ReadAndWriteFacility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class HouseRepo implements IHouseRepo{
    private static final String PATH_FILE_HOUSE ="src\\case_study\\data\\house.csv";
    @Override
    public void add(House house, Integer value) {
        String text = house.getInfoHouse();
        ReadAndWriteFacility.writeFile(PATH_FILE_HOUSE,text,true);
    }

    @Override
    public void saveToFileHouse(Map<House, Integer> houseStringMap) {
        File file = new File(PATH_FILE_HOUSE);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            for (House h: houseStringMap.keySet()) {
                fileWriter.write(h.getInfoHouse() + "," + houseStringMap.get(h));
                fileWriter.write("\n");
            }
            fileWriter.close();
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
