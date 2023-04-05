package case_study.service.booking;

import case_study.service.employee.EmployeeService;
import case_study.service.employee.IEmployeeService;
import case_study.service.facility.FacilityService;

public class BookingService implements IBookingService {
    static IEmployeeService employeeService = new EmployeeService();
    FacilityService facilityService = new FacilityService();

    @Override
    public void addNewBooking() {
    employeeService.display();
    facilityService.displayFacility();

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
