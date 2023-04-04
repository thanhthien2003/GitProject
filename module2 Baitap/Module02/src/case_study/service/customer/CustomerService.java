package case_study.service.customer;

import case_study.models.person.Customer;
import case_study.repository.customer.CustomerRepository;
import case_study.repository.customer.ICustomerRepository;
import case_study.utils.ReadAndWriteCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static Scanner sc = new Scanner(System.in);
    static Customer customer = new Customer();
    static List<Customer> customerList = new ArrayList<>();
    private String regExDate = "^(0[1-9]||([1-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";
    static String [] styleCustomer = {
            "Diamond","Platinium","Gold","Silver","Member"
    };
    ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void display() {
        customerList = customerRepository.displayCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
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
        customerList = customerRepository.displayCustomer();
        System.out.println("Enter the id of the Customer you want to check");
        int id = Integer.parseInt(sc.nextLine());
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            if(id==customerList.get(i).getId()){
              customer = entryCustomer();
                customerList.set(i,customer);
                customerRepository.editCustomer(customerList);
            }
        }
    }
    public Customer entryCustomer() {
        boolean append;
        int id;
        do {
            append = true;
            System.out.println("enter ID employee");
             id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < customerList.size(); i++) {
                if (id == customerList.get(i).getId()){
                    System.out.println("ID id already exists");
                    append = false;
                }
            }
        }while (!append);
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
            } else {
                flag = true;
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
        String typeCustomer = null;
        do {
            flag = true;
            System.out.println("enter typeCustomer" +
                    "\n 1. Diamond" +
                    "\n 2. Platinium" +
                    "\n 3. Gold" +
                    "\n 4. Silver"+
                    "\n 5. Member");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    typeCustomer = styleCustomer[0];
                    flag=false;
                    break;
                case "2":
                    typeCustomer = styleCustomer[1];
                    flag=false;
                    break;
                case "3":
                    typeCustomer = styleCustomer[2];
                    flag=false;
                    break;
                case "4":
                    typeCustomer = styleCustomer[3];
                    flag=false;
                    break;
                case "5":
                    typeCustomer = styleCustomer[4];
                    flag=false;
                    break;
                default:
                    System.out.println("Choose does not exist , something wrong "+
                            "\n Can you enter again? ");
            }
        } while (flag);
        System.out.println("enter address");
        String address = sc.nextLine();
        customer = new Customer(id, name, date, gender, idCountry, phoneNumber, email, typeCustomer, address);
        return customer;
    }
}
