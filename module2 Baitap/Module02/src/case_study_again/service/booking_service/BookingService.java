package case_study_again.service.booking_service;

import case_study_again.models.Booking;
import case_study_again.models.facilitys.House;
import case_study_again.models.facilitys.Room;
import case_study_again.models.facilitys.Villa;
import case_study_again.repository.booking_repo.BookingRepo;
import case_study_again.repository.booking_repo.IBookingRepo;
import case_study_again.repository.customer_repo.CustomerRepo;
import case_study_again.repository.customer_repo.ICustomerRepo;
import case_study_again.repository.facility_repo.*;
import case_study_again.service.customer_service.CustomerService;
import case_study_again.service.customer_service.ICustomerService;
import case_study_again.service.facility_service.FacilityService;
import case_study_again.service.facility_service.HouseService.HouseService;
import case_study_again.service.facility_service.HouseService.IHouseService;
import case_study_again.service.facility_service.IFacilityService;
import case_study_again.service.facility_service.RoomService.IRoomService;
import case_study_again.service.facility_service.RoomService.RoomService;
import case_study_again.service.facility_service.VilaService.IVilaService;
import case_study_again.service.facility_service.VilaService.VilaService;
import case_study_again.util.RegExCheck;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BookingService implements IBookingservice {
    ICustomerService customerService = new CustomerService();
    ICustomerRepo customerRepo = new CustomerRepo();
    IFacilityService facilityService = new FacilityService();
    IVilaService vilaService = new VilaService();
    IVilaRepo vilaRepo = new VilaRepo();
    IHouseService houseService = new HouseService();
    IHouseRepo houseRepo = new HouseRepo();
    IRoomService roomService = new RoomService();
    IRoomRepo roomRepo = new RoomRepo();
    String regExIdVila = "^(SVVL-)[0-9]{4}$";
    String regExIdRoom = "^(SVRO-)[0-9]{4}$";
    String regExIdHouse = "^(SVHO-)[0-9]{4}$";
    Scanner sc = new Scanner(System.in);
    IBookingRepo bookingRepo = new BookingRepo();

    @Override
    public void display() {
        for (Booking b : bookingRepo.display()) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        customerService.display();
        boolean flag;
        String idCustomer = null;
        do {
            flag = false;
            System.out.print("Enter id Customer: ");
            idCustomer = sc.nextLine();
            for (int i = 0; i < customerRepo.display().size(); i++) {
                if (idCustomer.equals(customerRepo.display().get(i).getId())) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Your id Customer not exist , please re-enter");
            }
        } while (!flag);
        String idService = null;
        do {
            System.out.println("Choose one service:" +
                    "\n 1. Villa" +
                    "\n 2. House" +
                    "\n 3. Room");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    idService = checkVila();
                    flag = false;
                    break;
                case "2":
                    idService = checkHouse();
                    flag = false;
                    break;
                case "3":
                    idService = checkRoom();
                    flag = false;
                    break;
                default:
                    System.out.println("Please choose one option, your option not exist");
                    flag = true;
            }
        } while (flag);
        String dayBooking = null;
        do {
            System.out.print("Enter day booking: ");
            dayBooking = sc.nextLine();
            if (RegExCheck.checkDay(dayBooking)) {
                flag = true;
            } else {
                flag = false;
                System.out.println("Your day not exist");
            }
        } while (!flag);
        String dayStart = null;
        do {
            System.out.print("Enter day start: ");
            dayStart = sc.nextLine();
            if (RegExCheck.checkDay(dayStart)) {
                flag = true;
            } else {
                flag = false;
                System.out.println("Your day not exist");
            }
        } while (!flag);
        String dayEnd = null;
        Date dayStartTime = new Date(dayStart);
        do {
            System.out.print("Enter day end: ");
            dayEnd = sc.nextLine();
            Date dayEndTime = new Date(dayEnd);
            if (dayEndTime.after(dayStartTime)) {
                flag = true;
            } else {
                flag = false;
                System.out.println("The end date cannot exist before the start date");
            }
        } while (!flag);
        System.out.println("Enter id booking");
        String idBooking = sc.nextLine();
        Booking booking = new Booking(idBooking, dayBooking, dayStart, dayEnd, idCustomer, idService);
        bookingRepo.add(booking);
    }

    public String checkVila() {
        vilaService.displayVilla();
        boolean flag;
        boolean flag1 = false;
        String idVila = null;
        do {
            System.out.print("Enter your id Villa you want: ");
            idVila = sc.nextLine();
            flag = idVila.matches(regExIdVila);
            if (!flag) {
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVVL-YYYY, where YYYY is numbers from 0-9");
            } else {
                for (Villa v : vilaRepo.displayVila().keySet()) {
                    if (idVila.equals(v.getIdService())) {
                        flag1 = true;
                        flag = true;
                    }
                }
                if (!flag1) {
                    System.out.println("Your id not exist , please re-enter");
                    flag = false;
                }
            }
        } while (!flag);
        return idVila;
    }

    public String checkHouse() {
        houseService.displayHouse();
        boolean flag;
        String idHouse = null;
        boolean flag1 = false;
        do {
            System.out.print("Enter your id House you want: ");
            idHouse = sc.nextLine();
            flag = idHouse.matches(regExIdHouse);
            if (!flag) {
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVHO-YYYY, where YYYY is numbers from 0-9");
            } else {
                for (House h : houseRepo.displayHouse().keySet()) {
                    if (idHouse.equals(h.getInfoHouse())) {
                        flag1 = true;
                        flag = true;
                    }
                }
                if (!flag1) {
                    System.out.println("Your id not exist , please re-enter");
                    flag = false;
                }
            }
        } while (!flag);
        return idHouse;
    }

    public String checkRoom() {
        roomService.displayRoom();
        boolean flag;
        String idRoom = null;
        boolean flag1 = false;
        do {
            System.out.print("Enter your id House you want: ");
            idRoom = sc.nextLine();
            flag = idRoom.matches(regExIdRoom);
            if (!flag) {
                System.out.println("Enter the wrong format , Service code must be in the correct format: SVRO-YYYY, where YYYY is numbers from 0-9");
            } else {
                for (Room r : roomRepo.displayRoom().keySet()) {
                    if (idRoom.equals(r.getIdService())) {
                        flag1 = true;
                        flag = true;
                    }
                }
                if (!flag1) {
                    System.out.println("Your id not exist, please re-enter");
                    flag = false;
                }
            }
        } while (!flag);
        return idRoom;
    }
}
