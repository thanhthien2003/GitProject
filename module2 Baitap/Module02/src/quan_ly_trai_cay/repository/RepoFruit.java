package quan_ly_trai_cay.repository;

import quan_ly_trai_cay.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class RepoFruit implements IRepoFruit{
    static List<Fruit> fruitList = new ArrayList<>();
    static {
        Fruit fruit1 = new Fruit("apple","cool","26/9","26/10","America",3000);
        Fruit fruit2 = new Fruit("mango","hot","26/9","26/10","America",3000);
        Fruit fruit3 = new Fruit("watermelon","sweet","26/9","26/10","America",3000);
        Fruit fruit4 = new Fruit("coconut","salt","26/9","26/10","America",3000);
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
    }
    @Override
    public List<Fruit> display() {
        return fruitList;
    }

    @Override
    public void add(Fruit fruit) {
    fruitList.add(fruit);
    }
}
