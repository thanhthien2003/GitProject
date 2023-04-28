package case_study_again.service.customer_service;

import case_study_again.models.persons.Customers;
import case_study_again.models.persons.Employees;
import case_study_again.repository.customer_repo.CustomerRepo;
import case_study_again.repository.customer_repo.ICustomerRepo;
import case_study_again.util.RegExCheck;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepo customerRepo = new CustomerRepo();
    Scanner sc = new Scanner(System.in);
    static String[] styleCustomer = {
            "Diamond", "Platinium", "Gold", "Silver", "Member"
    };

    @Override
    public void display() {
        for (Customers c : customerRepo.display()) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
       Customers customer= entryCustomer();
       customerRepo.add(customer);
    }

    @Override
    public void edit() {
        System.out.print("Enter your id you want edit: ");
        String id = sc.nextLine();
        List<Customers> customersList = customerRepo.display();
        int count =0;
        for (int i = 0; i < customersList.size(); i++) {
            if (id.equals(customersList.get(i).getId())) {
                count++;
                Customers customerUp = customersList.get(i);
                boolean append;
                do {
                    append = false;
                    System.out.println("choose 1 thing you want to fix: " +
                            "\n 1. Name" +
                            "\n 2. Date" +
                            "\n 3. Gender" +
                            "\n 4. IdCountry" +
                            "\n 5. PhoneNumber" +
                            "\n 6. Email" +
                            "\n 7. typeCustomer" +
                            "\n 8. Address" );
                    String choose = sc.nextLine();
                    boolean flag = true;
                    switch (choose){
                        case "1":
                            String name = null;
                            do {
                                System.out.print("Enter name:");
                                name = sc.nextLine();
                                if (RegExCheck.checkName(name)) {
                                    flag = false;
                                } else {
                                    System.out.println("Please re-enter, maybe you forgot UpperCase a firts key ");
                                    flag = true;
                                }
                            } while (flag);
                            customerUp.setName(name);
                            append = false;
                            break;
                        case "2":
                            String date = null;
                            do {
                                System.out.print("Enter date:");
                                date = sc.nextLine();
                                if (RegExCheck.checkDate(date)) {
                                    flag = false;
                                } else {
                                    flag = true;
                                }
                            } while (flag);
                            customerUp.setDate(date);
                            append = false;
                            break;
                        case "3":
                            String gender = null;
                            do {
                                System.out.println("Choose one gender:" +
                                        "\n 1. Male" +
                                        "\n 2. Female");
                                String choose1 = sc.nextLine();
                                switch (choose) {
                                    case "1":
                                        gender = "Male";
                                        flag = false;
                                        break;
                                    case "2":
                                        gender = "Female";
                                        flag = false;
                                        break;
                                    default:
                                        System.out.println("Your choice not exist , please re-enter");
                                        flag = true;
                                        break;
                                }
                            } while (flag);
                            customerUp.setGender(gender);
                            append = false;
                            break;
                        case "4":
                            String idCountry = null;
                            do {
                                System.out.print("Enter your IdCountry:");
                                idCountry = sc.nextLine();
                                if (RegExCheck.checkIdCountry(idCountry)) {
                                    flag = false;
                                } else {
                                    System.out.println("Your enter wrong , please re-enter");
                                    flag = true;
                                }
                            } while (flag);
                            customerUp.setIdCountry(idCountry);
                            append = false;
                            break;
                        case "5":
                            String phoneNumber = null;
                            do {
                                System.out.print("Enter your phone number:");
                                phoneNumber = sc.nextLine();
                                if (RegExCheck.checkPhoneNumber(phoneNumber)) {
                                    flag = false;
                                } else {
                                    System.out.println("Your enter wrong , please re-enter with format: 0XXXXXXXXX");
                                    flag = true;
                                }
                            } while (flag);
                            customerUp.setPhoneNumber(phoneNumber);
                            append = false;
                            break;
                        case "6":
                            System.out.print("Enter your email: ");
                            String email = sc.nextLine();
                            customerUp.setEmail(email);
                            append = false;
                            break;
                        case "7":
                            String typeCustomer = null;
                            do {
                                System.out.println("Choose your type:" +
                                        "\n 1. Diamond" +
                                        "\n 2. Platinium" +
                                        "\n 3. Gold" +
                                        "\n 4. Silver" +
                                        "\n 5. Member");
                                String choose3 = sc.nextLine();
                                switch (choose3) {
                                    case "1":
                                        typeCustomer = styleCustomer[0];
                                        flag = false;
                                        break;
                                    case "2":
                                        typeCustomer = styleCustomer[1];
                                        flag = false;
                                        break;
                                    case "3":
                                        typeCustomer = styleCustomer[2];
                                        flag = false;
                                        break;
                                    case "4":
                                        typeCustomer = styleCustomer[3];
                                        flag = false;
                                        break;
                                    case "5":
                                        typeCustomer = styleCustomer[4];
                                        flag = false;
                                        break;
                                    default:
                                        System.out.println("Your choice not exist, please re-enter");
                                        flag = true;
                                        break;
                                }
                            } while (flag);
                            customerUp.setTypeCustomer(typeCustomer);
                            append = false;
                            break;
                        case "8":
                            System.out.print("Enter your address:");
                            String address = sc.nextLine();
                            customerUp.setAddress(address);
                            append = false;
                            break;
                        default:
                            append = true;
                            System.out.println("Your enter not exist, please re-enter");
                            break;
                    }
                } while (append);
                customerRepo.edit(customerUp,i);
                break;
            }
        }
        if (count==0){
            System.out.println("Your id not exist");
        }

    }

    public Customers entryCustomer() {
        boolean flag;
//        String id, String name, String date, String gender,
//        String idCountry, String phoneNumber, String email, String typeCustomer, String address
        String id = null;
        do {
            System.out.print("Enter id:");
            id = sc.nextLine();
            if (RegExCheck.checkIdCustomer(id)) {
                flag = false;
            } else {
                System.out.println("Please enter correct format:: KH-YYYY ( Y : 0-9)");
                flag = true;
            }
        } while (flag);
        String name = null;
        do {
            System.out.print("Enter name:");
            name = sc.nextLine();
            if (RegExCheck.checkName(name)) {
                flag = false;
            } else {
                System.out.println("Please re-enter, maybe you forgot UpperCase a firts key ");
                flag = true;
            }
        } while (flag);
        String date = null;
        do {
            System.out.print("Enter date:");
            date = sc.nextLine();
            if (RegExCheck.checkDate(date)) {
                flag = false;
            } else {
                flag = true;
            }
        } while (flag);
        String gender = null;
        do {
            System.out.println("Choose one gender:" +
                    "\n 1. Male" +
                    "\n 2. Female");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    gender = "Male";
                    flag = false;
                    break;
                case "2":
                    gender = "Female";
                    flag = false;
                    break;
                default:
                    System.out.println("Your choice not exist , please re-enter");
                    flag = true;
                    break;
            }
        } while (flag);
        String idCountry = null;
        do {
            System.out.print("Enter your IdCountry:");
            idCountry = sc.nextLine();
            if (RegExCheck.checkIdCountry(idCountry)) {
                flag = false;
            } else {
                System.out.println("Your enter wrong , please re-enter");
                flag = true;
            }
        } while (flag);
        String phoneNumber = null;
        do {
            System.out.print("Enter your phone number:");
            phoneNumber = sc.nextLine();
            if (RegExCheck.checkPhoneNumber(phoneNumber)) {
                flag = false;
            } else {
                System.out.println("Your enter wrong , please re-enter with format: 0XXXXXXXXX");
                flag = true;
            }
        } while (flag);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        String typeCustomer = null;
        do {
            System.out.println("Choose your type:" +
                    "\n 1. Diamond" +
                    "\n 2. Platinium" +
                    "\n 3. Gold" +
                    "\n 4. Silver" +
                    "\n 5. Member");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    typeCustomer = styleCustomer[0];
                    flag = false;
                    break;
                case "2":
                    typeCustomer = styleCustomer[1];
                    flag = false;
                    break;
                case "3":
                    typeCustomer = styleCustomer[2];
                    flag = false;
                    break;
                case "4":
                    typeCustomer = styleCustomer[3];
                    flag = false;
                    break;
                case "5":
                    typeCustomer = styleCustomer[4];
                    flag = false;
                    break;
                default:
                    System.out.println("Your choice not exist, please re-enter");
                    flag = true;
                    break;
            }
        } while (flag);
        System.out.print("Enter your address:");
        String address = sc.nextLine();
        Customers customer = new Customers(id,name,date,gender,idCountry,phoneNumber,email,typeCustomer,address);
        return customer;
    }
}
