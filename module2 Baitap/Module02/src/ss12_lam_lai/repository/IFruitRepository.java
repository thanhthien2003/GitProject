package ss12_lam_lai.repository;

import ss12_lam_lai.model.Fruit;

import java.util.Map;

public interface IFruitRepository {
    Map<Integer, Fruit> display();

    void add(Fruit fruit, int idFruit);

    boolean delete(int idFruit);

    void edit(Fruit fruit, int idFruit);
}
