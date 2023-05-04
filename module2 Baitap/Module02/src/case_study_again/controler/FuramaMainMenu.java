package case_study_again.controler;

import case_study_again.models.facilitys.Facility;
import case_study_again.service.booking_service.BookingService;
import case_study_again.service.booking_service.IBookingservice;
import case_study_again.service.contact_service.ContactService;
import case_study_again.service.contact_service.IContactService;
import case_study_again.service.customer_service.CustomerService;
import case_study_again.service.customer_service.ICustomerService;
import case_study_again.service.employee_service.EmployeeService;
import case_study_again.service.employee_service.IEmployeeService;
import case_study_again.service.facility_service.FacilityService;
import case_study_again.service.facility_service.IFacilityService;

import java.util.Scanner;

public class FuramaMainMenu {
    static Scanner sc = new Scanner(System.in);
    static ICustomerService customerService = new CustomerService();
    static IEmployeeService employeeService = new EmployeeService();
    static IFacilityService facilityService = new FacilityService();
    static IBookingservice bookingservice = new BookingService();
    static IContactService contactService = new ContactService();

    public static void displayMainMenu() {
        boolean flag = true;
        System.out.println("-----------FURAMA HOTEL------------");
        do {
            System.out.println("1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Employee Management");
                    displayEmployee();
                    break;
                case "2":
                    System.out.println("Customer Management");
                    displayCustomer();
                    break;
                case "3":
                    System.out.println("Facility Management");
                    facilityManagement();
                    break;
                case "4":
                    System.out.println("Booking Management");
                    bookingManagement();
                    break;
                case "5":
                    System.out.println("Promotion Management");
                    promotionManagement();
                    break;
                case "6":
                    flag = false;
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
            }
        } while (flag);
    }

    public static void displayEmployee() {
        System.out.println("--YOU CHOOSE EMPLOYEES--");
        boolean flag = true;
        do {
            System.out.println(" 1.Display list employees" +
                    "\n 2.Add new employee" +
                    "\n 3.Edit employee" +
                    "\n 4.Return main menu");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }

    public static void displayCustomer() {

        boolean flag = true;
        System.out.println("--YOU CHOOSE CUSTOMER--");
        do {
            System.out.println("1.Display list customer" +
                    "\n 2.Add new customer" +
                    "\n 3.Edit customer" +
                    "\n 4.Return main menu");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }

    public static void facilityManagement() {

        boolean flag = true;
        do {
            System.out.println("YOU CHOOSE FACILITY" +
                    "\n 1.Display list facility" +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4.Return main menu");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    FacilityControler.addFacility();
                    break;
                case "3":
                    facilityService.displayMaintenance();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }

    public static void bookingManagement() {

        boolean flag = true;
        do {
            System.out.println("YOU CHOOSE BOOKING" +
                    "\n 1.Add new booking" +
                    "\n 2.Display list booking" +
                    "\n 3.Create new contract" +
                    "\n 4.Display list contracts" +
                    "\n 5.Edit contracts" +
                    "\n 6.Return main menu");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    bookingservice.add();
                    break;
                case "2":
                    bookingservice.display();
                    break;
                case "3":
                    contactService.add();
                    break;
                case "4":
                    contactService.display();
                    break;
                case "5":
                    contactService.edit();
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }

    public static void promotionManagement() {
        boolean flag = true;
        do {
            System.out.println("YOU CHOOSE PROMOTION" +
                    "\n 1.Display list customers use service" +
                    "\n 2.Display list customers get voucher" +
                    "\n 3.Return main menu");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("entered wrong option please re-enter");
                    break;
            }
        } while (flag);
    }
}
