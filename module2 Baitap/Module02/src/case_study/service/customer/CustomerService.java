package case_study.service.customer;

import case_study.models.person.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner sc = new Scanner(System.in);
    static Customer customer = new Customer();
    static List<Customer> customerList = new ArrayList<>();
    @Override
    public void display() {
        for (Customer c:customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        customer = entryCustomer();
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("nhap id cua employee muon thay doi");
        int id = Integer.parseInt(sc.nextLine());
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            if(id==customerList.get(i).getId()){
              customer = entryCustomer();
                customerList.set(i,customer);
            }
        }
    }
    public Customer entryCustomer(){
        System.out.println("nhap ID employee");
        int id  = Integer.parseInt(sc.nextLine());
        System.out.println("nhap name employee");
        String name = sc.nextLine();
        System.out.println("nhap ngay thang sinh");
        String date = sc.nextLine();
        System.out.println("nhap gioi tinh");
        String gender = sc.nextLine();
        System.out.println("nhap so CMND");
        int idCountry = Integer.parseInt(sc.nextLine());
        System.out.println("nhap sdt");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("nhap email");
        String email = sc.nextLine();
        System.out.println("nhap cap do ");
        String typeCustomer = sc.nextLine();
        System.out.println("nhap dia chi");
        String address = sc.nextLine();
       customer =new Customer(id,name,date,gender,idCountry,phoneNumber,email,typeCustomer,address);
        return customer;
    }
}
