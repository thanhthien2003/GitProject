package case_study_again.repository.facility_repo;

import case_study.models.facility.Facility;
import case_study_again.models.facilitys.Villa;
import case_study_again.util.ReadAndWriteVila;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VilaRepo implements IVilaRepo{
    Map<Villa,Integer>villaIntegerMap =  ReadAndWriteVila.readFileVilla();
    @Override
    public Map<Villa, Integer> displayVila() {
        return villaIntegerMap=ReadAndWriteVila.readFileVilla();
    }

    @Override
    public void add(Villa villa, int value) {
    villaIntegerMap.put(villa,value);
    ReadAndWriteVila.writeFileVilla(villaIntegerMap,false);
    }

    @Override
    public Map<Villa,Integer> displayMaintenance() {
        Map<Villa,Integer> villaMaintenanceMap = new LinkedHashMap<>();
        for (Villa v:villaIntegerMap.keySet()) {
            if (villaIntegerMap.get(v)>=5){
                villaMaintenanceMap.put(v,villaIntegerMap.get(v));
            }
        }
        return villaMaintenanceMap;
    }
}
