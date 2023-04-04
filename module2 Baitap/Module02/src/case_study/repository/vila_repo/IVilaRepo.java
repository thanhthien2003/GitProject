package case_study.repository.vila_repo;

import case_study.models.facility.Villa;

import java.util.List;
import java.util.Map;

public interface IVilaRepo {
   void add(Villa villa,Integer value);

      void saveToFileVilla(Map<Villa,Integer> villaIntegerMap);
}
