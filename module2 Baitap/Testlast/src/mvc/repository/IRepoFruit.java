package mvc.repository;

import mvc.model.Fruit;

import java.util.List;

public interface IRepoFruit {
    List<Fruit> display();
    void add(Fruit fruit);
}
