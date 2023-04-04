package case_study.service.facility.ServiceFacility;

import case_study.models.facility.House;

import java.util.Map;

public interface IHouse {
    House addHouse();
    void deleteHouse();
    void saveToFileHouse(Map<House,Integer>houseStringMap);
}
