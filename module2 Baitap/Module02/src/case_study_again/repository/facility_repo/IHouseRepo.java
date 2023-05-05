package case_study_again.repository.facility_repo;

import case_study_again.models.facilitys.House;
import case_study_again.models.facilitys.Villa;

import java.util.Map;

public interface IHouseRepo {
    Map<House,Integer> displayHouse();
    void add(House house ,int value);
    Map<House,Integer> displayMaintenance();
    void updateValueHouse(House house, Integer value);
}
