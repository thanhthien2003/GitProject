package ss12_lam_lai.service;

import ss12_lam_lai.model.Fruit;
import ss12_lam_lai.repository.FruitRepository;
import ss12_lam_lai.repository.IFruitRepository;

import java.util.Map;
import java.util.Scanner;

public class ServiceFruit implements IServiceFruit {
    static IFruitRepository fruitRepository = new FruitRepository();
    static Scanner sc = new Scanner(System.in);
    Map<Integer, Fruit> fruitMap = fruitRepository.display();

    @Override
    public void display() {
        System.out.println("Hien thi map theo cach keyset()");
        for (Integer i : fruitMap.keySet()) {
            System.out.println(i + " -- " + fruitMap.get(i));
        }
        System.out.println("Hien thi map theo cach entry");
        for (Map.Entry<Integer, Fruit> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
    }

    @Override
    public void add() {
        Fruit fruit = entryFruit();
        int idFruit = 0;
        boolean flag;
        do {
            idFruit = Integer.parseInt(sc.nextLine());
            if (fruitMap.containsKey(idFruit)) {
                System.out.println("ma trai cay da ton tai xin moi nhap lai");
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);
        fruitRepository.add(fruit, idFruit);
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma trai cay muon xoa");
        int idFruit = Integer.parseInt(sc.nextLine());
        if (fruitRepository.delete(idFruit)) {
            System.out.println("Da xoa thanh cong");
        } else {
            System.out.println("Xoa khong thanh cong");
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhap ma trai cay muon chinh sua");
        int idFruit = Integer.parseInt(sc.nextLine());
        if (fruitMap.containsKey(idFruit)) {
            Fruit fruit = entryFruit();
            fruitRepository.edit(fruit, idFruit);
        } else {
            System.out.println("ma trai cay khong ton tai");
        }
    }

    public Fruit entryFruit() {
        System.out.println("Nhap ten trai cay");
        String nameFruit = sc.nextLine();
        System.out.println("nhap loai trai cay");
        String styleFruit = sc.nextLine();
        System.out.println("nhap ngay san xuat");
        String productionDate = sc.nextLine();
        System.out.println("nhap han su dung");
        String endDate = sc.nextLine();
        System.out.println("nhap noi xuat xu");
        String origin = sc.nextLine();
        System.out.println("nhap gia trai cay ");
        long price = Long.parseLong(sc.nextLine());
        Fruit fruit = new Fruit(nameFruit, styleFruit, productionDate, endDate, origin, price);
        System.out.println("nhap ma trai cay");
        return fruit;
    }
}
