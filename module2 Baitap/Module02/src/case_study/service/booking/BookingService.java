package case_study.service.booking;

import case_study.service.customer.CustomerService;
import case_study.service.customer.ICustomerService;
import case_study.service.employee.EmployeeService;
import case_study.service.employee.IEmployeeService;
import case_study.service.facility.FacilityService;

import java.util.Scanner;

public class BookingService implements IBookingService {
    static ICustomerService customerService = new CustomerService();
    FacilityService facilityService = new FacilityService();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void addNewBooking() {
    customerService.display();
        System.out.println("Enter id customer you want check");
    int id = Integer.parseInt(sc.nextLine());
    facilityService.displayFacilityAll();
        System.out.println("Enter idService you want check");
    String idService = sc.nextLine();
        System.out.println("ok");
    }

    @Override
    public void displayBooking() {

    }

    @Override
    public void creatNewContract() {

    }

    @Override
    public void displayContracts() {

    }

    @Override
    public void editContracts() {

    }
}
