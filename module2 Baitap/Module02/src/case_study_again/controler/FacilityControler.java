package case_study_again.controler;

import case_study_again.service.facility_service.HouseService.HouseService;
import case_study_again.service.facility_service.HouseService.IHouseService;
import case_study_again.service.facility_service.RoomService.IRoomService;
import case_study_again.service.facility_service.RoomService.RoomService;
import case_study_again.service.facility_service.VilaService.IVilaService;
import case_study_again.service.facility_service.VilaService.VilaService;

import java.util.Scanner;

public class FacilityControler {
    private Scanner sc = new Scanner(System.in);
    static IVilaService vilaService = new VilaService();
    static IHouseService houseService = new HouseService();
    static IRoomService roomService = new RoomService();

    public static void addFacility(){
        boolean flag;
        do {
            flag = true;
            System.out.println("Choose one service you want!" +
                    "\n 1.vila" +
                    "\n 2.house" +
                    "\n 3.room" +
                    "\n 4.Return");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    vilaService.addVilla();
                    break;
                case "2":
                    houseService.addHouse();
                    break;
                case "3":
                    roomService.addRoom();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (!flag);
    }
}
