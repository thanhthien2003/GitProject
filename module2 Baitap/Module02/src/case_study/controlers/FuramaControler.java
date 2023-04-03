package case_study.controlers;

import case_study.service.booking.BookingService;
import case_study.service.booking.IBookingService;
import case_study.service.customer.CustomerService;
import case_study.service.customer.ICustomerService;
import case_study.service.employee.EmployeeService;
import case_study.service.employee.IEmployeeService;
import case_study.service.facility.FacilityService;
import case_study.service.facility.IFacilityService;
import case_study.service.promotion.IPromotionService;
import case_study.service.promotion.PromotionService;

import java.util.Scanner;

public class FuramaControler {
    private static Scanner sc = new Scanner(System.in);
    private static IEmployeeService serviceEmployee = new EmployeeService();
    private static ICustomerService serviceCustomer = new CustomerService();
    private static IFacilityService facilityService = new FacilityService();
    private static IBookingService bookingService = new BookingService();
    private static IPromotionService promotionService = new PromotionService();

    public static void displayMainMenu(){
        boolean flag = true;
        System.out.println("-----------FURAMA HOTEL------------");
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
                    break;
                case 2:
                    System.out.println("Customer Management");
                    displayCustomer();
                    break;
                case 3:
                    System.out.println("Facility Management");
                    facilityManagement();
                    break;
                case 4:
                    System.out.println("Booking Management");
                    bookingManagement();
                    break;
                case 5:
                    System.out.println("Promotion Management");
                    promotionManagement();
                    break;
                case 6:
                    flag = false;
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Enter the wrong format , please re-enter just number");
            }
        } while(flag);
    }
    public static void displayEmployee(){

    boolean flag = true;
    do {
        System.out.println("YOU CHOOSE EMPLOYEES" +
                "\n 1.Display list employees" +
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
                flag = false;
                break;
            default:
                System.out.println("entered wrong option please re-enter");
                break;
        }
    } while (flag);
    }
    public static void displayCustomer(){

        boolean flag = true;
        do {
            System.out.println("YOU CHOOSE CUSTOMER" +
                    "\n1.Display list customer" +
                    "\n 2.Add new customer" +
                    "\n 3.Edit customer" +
                    "\n 4.Return main menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    serviceCustomer.display();
                    break;
                case 2:
                    serviceCustomer.add();
                    break;
                case 3:
                    serviceCustomer.edit();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }
    public static void facilityManagement(){

        boolean flag = true;
        do {
            System.out.println("YOU CHOOSE FACILITY" +
                    "\n 1.Display list facility" +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4.Return main menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    facilityService.addFacility();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }
    public static void bookingManagement(){

        boolean flag = true;
        do {
            System.out.println("YOU CHOOSE BOOKING" +
                    "\n 1.Add new booking" +
                    "\n 2.Display list booking" +
                    "\n 3.Create new contract" +
                    "\n 4.Display list contracts" +
                    "\n 5.Edit contracts" +
                    "\n 6.Return main menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    bookingService.addNewBooking();
                    break;
                case 2:
                    bookingService.displayBooking();
                    break;
                case 3:
                    bookingService.creatNewContract();
                    break;
                case 4:
                    bookingService.displayContracts();
                    break;
                case 5:
                    bookingService.editContracts();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }
    public static void promotionManagement(){
        boolean flag = true;
        do {
            System.out.println("YOU CHOOSE PROMOTION" +
                    "\n 1.Display list customers use service" +
                    "\n 2.Display list customers get voucher" +
                    "\n 3.Return main menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    promotionService.displayCustomerUseService();
                    break;
                case 2:
                    promotionService.displayCustomerVoucher();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }
}
