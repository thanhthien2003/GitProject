package case_study.service.customer;

import case_study.models.person.Customer;
import case_study.repository.customer.CustomerRepository;
import case_study.repository.customer.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner sc = new Scanner(System.in);
    static Customer customer = new Customer();
    static List<Customer> customerList = new ArrayList<>();
    private String regExDate = "^(0[1-9]||([1-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";
    ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void display() {
        customerList = customerRepository.displayCustomer();
        for (Customer c:customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        customer = entryCustomer();
        customerList.add(customer);
        customerRepository.addCustomer(customerList);
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
    public Customer entryCustomer() {
        System.out.println("enter ID employee");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter employee");
        String name = sc.nextLine();
        boolean flag = false;
        boolean flag1;
        String date;
        do {
            System.out.println("enter date of birth\n");
            date = sc.nextLine();
            flag1 = date.matches(regExDate);
            if (!flag1) {
                System.out.println("entered the wrong date format " +
                        "\n must be in the correct format: dd/mm/YYYY");
            }
        } while (!flag);
        System.out.println("enter gender");
        String gender = sc.nextLine();
        System.out.println("enter idCountry");
        int idCountry = Integer.parseInt(sc.nextLine());
        System.out.println("enter phone number");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("enter email");
        String email = sc.nextLine();
        System.out.println("enter typeCustomer");
        String typeCustomer = sc.nextLine();
        System.out.println("enter address");
        String address = sc.nextLine();
        customer = new Customer(id, name, date, gender, idCountry, phoneNumber, email, typeCustomer, address);
        return customer;
    }
}
