package file_nhi_phan.controler;

import file_nhi_phan.service.ServiceProduct;
import java_collection_framework.service.ProductService;

import java.util.Scanner;

public class Main {
    public static void displayProduct() {
        ServiceProduct serviceProduct = new ServiceProduct();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("chon chuc nang " +
                    "\n 1.Display" +
                    "\n 2.Add product" +
                    "\n 3.Find product " +
                    "\n 4.Out");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display product");
                    serviceProduct.display();
                    break;
                case 2:
                    System.out.println("Add new product");
                    serviceProduct.add();
                    break;
                case 3:
                    System.out.println("Find product");
                    serviceProduct.edit();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
