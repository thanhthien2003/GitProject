package case_study_again.repository.facility_repo;

import case_study_again.models.facilitys.Villa;

import java.util.Map;

public interface IVilaRepo {
    Map<Villa,Integer> displayVila();
    void add(Villa villa,int value);
    Map<Villa,Integer> displayMaintenance();
}
