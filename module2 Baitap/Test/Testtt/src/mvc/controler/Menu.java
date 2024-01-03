package mvc.controler;

import mvc.service.FruitService;
import mvc.service.IServiceFruit;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    IServiceFruit serviceFruit = new FruitService();
    public void displayMainMenu(){
        System.out.println("------------FRUIT------------");
        boolean flag= true;
        do {
            System.out.println("Select one function" +
                    "\n 1. Display List Fruit" +
                    "\n 2. Add new Fruit" +
                    "\n 3. Out");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    serviceFruit.display();
                    flag = false;
                    break;
                case "2":
                    serviceFruit.add();
                    flag = false;
                    break;
                case "3":
                    System.out.println("Thank you");
                    flag = true;
                    break;
                default:
                    System.out.println("Your Select wrong , free re-enter");
                    flag = false;
            }
        } while(!flag);
    }
}
