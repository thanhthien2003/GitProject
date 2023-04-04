package case_study.repository.house_repo;

import case_study.models.facility.House;
import case_study.models.facility.Room;

import java.util.List;
import java.util.Map;

public interface IHouseRepo {
    void add(House house,Integer value);
    void saveToFileHouse(Map<House,Integer> houseStringMap);
}
