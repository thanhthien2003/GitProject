package case_study.service.facility.ServiceFacility;

import case_study.models.facility.Villa;

import java.util.Map;

public interface IVilla {
    Villa addVilla();
    void deleteVila();
    void saveToFileVilla(Map<Villa,Integer> villaIntegerMap);
}
