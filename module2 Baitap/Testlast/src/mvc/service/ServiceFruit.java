package mvc.service;

import mvc.model.Fruit;
import mvc.repository.IRepoFruit;
import mvc.repository.RepoFruit;

import java.util.List;
import java.util.Scanner;

public class ServiceFruit implements IServiceFruit{
    static Scanner sc = new Scanner(System.in);
    static Fruit fruit = new Fruit();
     IRepoFruit iRepoFruit = new RepoFruit();

    @Override
    public void display() {
        for (Fruit f:iRepoFruit.display()) {
            System.out.println(f);
        }
    }

    @Override
    public void add() {
        boolean flag;
        do {
            flag = true;
            try {
                System.out.println("Please enter name fruit");
                String nameFruit = sc.nextLine();
                System.out.println("Please enter style fruit");
                String styleFruit = sc.nextLine();
                System.out.println("Please enter productionDate");
                String productionDate = sc.nextLine();
                System.out.println("Please enter endDate");
                String endDate = sc.nextLine();
                System.out.println("Please enter origin");
                String origin = sc.nextLine();
                System.out.println("Please enter price fruit");
                long price = Long.parseLong(sc.nextLine());
                fruit = new Fruit(nameFruit, styleFruit, productionDate, endDate, origin, price);
                iRepoFruit.add(fruit);
            } catch (Exception e){
                System.out.println("Your enter wrong , please re-enter all because i'm so lazy for find your wrong " +
                        "and tell you what and where you need fix, it's not my fault bro  ");
                flag = false;
            }
        }while(!flag);
    }
}
