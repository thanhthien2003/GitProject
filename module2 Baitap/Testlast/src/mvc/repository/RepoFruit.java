package mvc.repository;

import mvc.model.Fruit;
import mvc.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class RepoFruit implements IRepoFruit{
     List<Fruit> fruitList = ReadAndWrite.readFile();
    @Override
    public List<Fruit> display() {
        return ReadAndWrite.readFile();
    }

    @Override
    public void add(Fruit fruit) {
        fruitList = ReadAndWrite.readFile();
        fruitList.add(fruit);
        ReadAndWrite.writeFile(fruitList,false);
    }
}
