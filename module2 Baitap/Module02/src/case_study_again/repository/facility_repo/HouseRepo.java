package case_study_again.repository.facility_repo;

import case_study_again.models.facilitys.House;
import case_study_again.models.facilitys.Villa;
import case_study_again.util.ReadAndWriteHouse;

import java.util.LinkedHashMap;
import java.util.Map;

public class HouseRepo implements IHouseRepo{
    Map<House,Integer> houseMap = ReadAndWriteHouse.readFileHouse();
    @Override
    public Map<House, Integer> displayHouse() {
        return houseMap=ReadAndWriteHouse.readFileHouse();
    }

    @Override
    public void add(House house, int value) {
        houseMap.put(house,value);
        ReadAndWriteHouse.writeFileHouse(houseMap,false);
    }

    @Override
    public Map<House, Integer> displayMaintenance() {
        Map<House,Integer> houseMaintenanceMap = new LinkedHashMap<>();
        for (House h:houseMap.keySet()) {
            if (houseMap.get(h)>=5){
                houseMaintenanceMap.put(h,houseMap.get(h));
            }
        }
        return houseMaintenanceMap;
    }
}
