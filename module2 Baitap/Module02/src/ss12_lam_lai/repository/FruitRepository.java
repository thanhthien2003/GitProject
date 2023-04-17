package ss12_lam_lai.repository;

import ss12_lam_lai.model.Fruit;

import java.util.HashMap;
import java.util.Map;

public class FruitRepository implements IFruitRepository {

    static Map<Integer, Fruit> fruitMap = new HashMap<>();

    static {
        Fruit fruit = new Fruit("Tao", "Trai cay ngot", "25/02/20022", "27/09/20022", "VietNam", 400000);
        Fruit fruit2 = new Fruit("Quyt", "Trai cay chua", "25/02/20022", "27/09/20022", "VietNam", 100000);
        Fruit fruit3 = new Fruit("Thang long", "Trai cay ngot", "25/02/20022", "27/09/20022", "VietNam", 2000234);
        Fruit fruit4 = new Fruit("mit", "Trai cay ngot", "25/02/20022", "27/09/20022", "VietNam", 300000);
        fruitMap.put(1, fruit);
        fruitMap.put(2, fruit2);
        fruitMap.put(3, fruit3);
        fruitMap.put(4, fruit4);
    }

    @Override
    public Map<Integer, Fruit> display() {
        return fruitMap;
    }


    @Override
    public void add(Fruit fruit, int idFruit) {
        fruitMap.put(idFruit, fruit);
    }

    @Override
    public boolean delete(int idFruit) {
        for (Integer i : fruitMap.keySet()) {
            if (idFruit == i) {
                fruitMap.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void edit(Fruit fruit, int idFruit) {
        fruitMap.replace(idFruit, fruit);
    }

}
