package quan_ly_trai_cay.repository;

import quan_ly_trai_cay.model.Fruit;

import java.util.List;

public interface IRepoFruit {
    List<Fruit> display();
    void add(Fruit fruit);
}
