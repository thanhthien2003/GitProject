package java_collection_framework.service;

import java_collection_framework.models.Product;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductService extends Product implements IServiceProduct{
    static LinkedList<Product> linkedList = new LinkedList<>();
    static Product product1 = new Product(1,"IphoneX",10);
    static Product product2 = new Product(2,"IphoneY",20);
    static Product product3 = new Product(3,"IphoneZ",30);

    static {
        linkedList.add(product1);
        linkedList.add(product2);
        linkedList.add(product3);
    }

    public Object find;

    Scanner sc = new Scanner(System.in);
    public Product createProduct(){
        System.out.println("nhap id moi");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten san pham");
        String name = sc.nextLine();
        System.out.println("nhap gia san pham");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id,name,price);
        return product;
    }
    @Override
    public void add() {
        Product product = createProduct();
        linkedList.add(product);
    }

    @Override
    public void edit(int id) {
        int size = linkedList.size();
        for (int i = 0; i < size ; i++) {
                if(id == linkedList.get(i).getId()){
                    System.out.println("nhap ten san pham");
                    String name = sc.nextLine();
                    System.out.println("nhap gia san pham");
                    int price = Integer.parseInt(sc.nextLine());
                    Product product = new Product(i,name,price);
                    linkedList.set(i,product);
                    break;
                }
        }
    }

    @Override
    public void delete(int id) {
        for (Product x : linkedList) {
            if(id == x.getId()){
                linkedList.remove(x);
                break;
            }
        }
    }

    @Override
    public void display() {
        for (Product x:linkedList) {
            System.out.println(x);
        }
    }

    @Override
    public void search() {
        System.out.println("nhap ten san pham muon tim");
        String name = sc.nextLine();
        int count =0;
        for (int i = 0; i < linkedList.size(); i++) {
            if(name.equals(linkedList.get(i).getNameProduct())){
                System.out.println(linkedList.get(i));
                break;
            } else {
                count++;
            }
        }
        if(count == linkedList.size()){
            System.out.println("khong co san pham nay trong cua hang");
        }
    }

    @Override
    public void arrange() {
        System.out.println("1.Tang dan"+
                "\n 2.Giam dan");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                System.out.println("danh sach sau khi sap xep");
                Collections.sort(linkedList, new Product());
                for (int i = 0; i < linkedList.size(); i++) {
                    System.out.println(linkedList.get(i));
                }
                break;
            case 2:
                System.out.println("danh sach sau khi sap xep theo giam dan");
                Collections.sort(linkedList, new Product());
                Collections.reverse(linkedList);
                for (int i = 0; i < linkedList.size(); i++) {
                    System.out.println(linkedList.get(i));
                }
        }
    }
    public boolean check(int id){
        for (Product x:linkedList) {
            if(id == x.getId()){
                return true;
            }
        }
        return false;
    }
}
