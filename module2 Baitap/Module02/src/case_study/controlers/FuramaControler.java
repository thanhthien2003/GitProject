package case_study.controlers;

import case_study.service.CustomerService;
import case_study.service.EmployeeService;
import case_study.service.IServicePerson;

import java.util.Scanner;

public class FuramaControler {
    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Employee Management");
                    displayEmployee();
                case 2:
                    System.out.println("Customer Management");
                    displayCustomer();
            }
        } while(true);
    }
    public static void displayEmployee(){
        IServicePerson serviceEmployee = new  EmployeeService();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    do {
        System.out.println("1.Display list employees" +
                "\n 2.Add new employee" +
                "\n 3.Edit employee" +
                "\n 4.Return main menu");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                serviceEmployee.display();
                break;
            case 2:
                serviceEmployee.add();
                break;
            case 3:
                serviceEmployee.edit();
                break;
            case 4:
                displayMainMenu();
                flag = false;
                break;
            default:
                flag = false;
                break;
        }
    } while (flag);
    }
    public static void displayCustomer(){
        IServicePerson serviceCustomer = new CustomerService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
    }
}
