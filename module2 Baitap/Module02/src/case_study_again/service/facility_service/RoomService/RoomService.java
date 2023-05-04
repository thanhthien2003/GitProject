package case_study_again.service.facility_service.RoomService;

import case_study_again.models.facilitys.Room;
import case_study_again.models.facilitys.Villa;
import case_study_again.repository.facility_repo.IRoomRepo;
import case_study_again.repository.facility_repo.RoomRepo;

import java.util.Scanner;

public class RoomService implements IRoomService{
    private String regEx = "^^[A-Z][a-z]+$";
    private String regExIdRoom = "^SVRO-[0-9]{4}$";
    private Scanner sc = new Scanner(System.in);
    IRoomRepo roomRepo = new RoomRepo();
    @Override
    public void displayRoom() {
        for (Room r:roomRepo.displayRoom().keySet()) {
            System.out.println(r+","+roomRepo.displayRoom().get(r));
        }
    }

    @Override
    public void addRoom() {
    Room room = entryRoom();
    roomRepo.add(room,0);
    }

    @Override
    public void displayMaintenanceRoom() {
        for (Room r:roomRepo.displayMaintenance().keySet()) {
            System.out.println(r+","+roomRepo.displayMaintenance().get(r));
        }
    }

    public Room entryRoom(){
        String serviceName = null;
        boolean flag;
        do {
            System.out.print("enter service name: ");
            serviceName = sc.nextLine();
            flag = serviceName.matches(regEx);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        int areaUse = 0;
        do {
            try {
                System.out.print("Enter the usable area: ");
                areaUse = Integer.parseInt(sc.nextLine());
                flag=false;
            }catch (Exception e){
                System.out.println("Please just number");
                flag = true;
            }
        }while (flag);
        float price=0;
        do {
            flag = false;
            System.out.print("enter price: ");
            price = Float.parseFloat(sc.nextLine());
            if (price > 0) {
                flag = true;
            } else {
                System.out.println("cost must be positive");
            }
        } while (!flag);
        String idService=null;
        do {
            System.out.print("enter ID House Service: ");
            idService = sc.nextLine();
            flag = idService.matches(regExIdRoom);
            if (!flag){
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVRO-YYYY, where YYYY is numbers from 0-9");
            }
        }while(!flag);
        int maxHuman=0;
        do {
            flag = false;
            System.out.print("Enter the maximum number of people: ");
            maxHuman = Integer.parseInt(sc.nextLine());
            if (maxHuman > 0 && maxHuman < 20) {
                flag = true;
            } else {
                System.out.println("the maximum number of people must be greater than 0 and less than 20");
            }
        } while (!flag);
        System.out.println("enter rental type");
        String styleRent = sc.nextLine();
        System.out.println("enter free service ");
        String freeService = sc.nextLine();
        Room room = new Room(serviceName,areaUse,price,maxHuman,styleRent,idService,freeService);
        return room;
    }
}
