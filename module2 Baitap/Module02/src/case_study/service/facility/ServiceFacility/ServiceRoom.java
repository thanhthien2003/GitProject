package case_study.service.facility.ServiceFacility;

import case_study.models.facility.Room;
import case_study.repository.room_repo.IRoomRepo;
import case_study.repository.room_repo.RoomRepo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceRoom implements IRoom{

    static Scanner sc = new Scanner(System.in);
    private String regEx = "^^[A-Z][a-z]+$";
    private String regExIdRoom = "^SVRO-[0-9]{4}$";
    private IRoomRepo roomRepo = new RoomRepo();

    @Override
    public Room addRoom() {
        String serviceName = null;
        boolean flag;
        do {
            System.out.println("enter service name");
            serviceName = sc.nextLine();
            flag = serviceName.matches(regEx);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        System.out.println("Enter the usable area");
        int areaUse = Integer.parseInt(sc.nextLine());
        float price;
        do {
            flag = false;
            System.out.println("enter price");
            price = Float.parseFloat(sc.nextLine());
            if (price > 0) {
                flag = true;
            } else {
                System.out.println("cost must be positive");
            }
        } while (!flag);
        String idService;
        do {
            System.out.println("enter ID House Service");
            idService = sc.nextLine();
            flag = idService.matches(regExIdRoom);
            if (!flag){
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVRO-YYYY, where YYYY is numbers from 0-9");
            }
        }while(!flag);
        int maxHuman=0;
        do {
            flag = false;
            System.out.println("Enter the maximum number of people");
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
        Room room = new Room(serviceName, areaUse, price, maxHuman,styleRent,idService,freeService);
        Integer value =0;
        roomRepo.add(room,value);
        return room;
    }

    @Override
    public void deleteRoom() {

    }

    @Override
    public void saveToFileRoom(Map<Room, Integer> roomIntegerMap) {
        roomRepo.saveToFileRoom(roomIntegerMap);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

