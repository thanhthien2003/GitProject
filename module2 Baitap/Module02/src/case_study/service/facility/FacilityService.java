package case_study.service.facility;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.facility.ServiceFacility.*;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    public static LinkedHashMap<Facility,Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);
    static {
        Room room = new Room("phong khach",10,3000000,3,"qua vip","a","gai");
        Villa villa =new Villa("Dalat",500,100000,20,"vip nhat Dalat","10",4,3,"qua vip");
        House house = new House("nha",20,30000000,10,"part time","a",2,"vip");
        facilityIntegerLinkedHashMap.put(room,1);
        facilityIntegerLinkedHashMap.put(villa,2);
        facilityIntegerLinkedHashMap.put(house,5);
    }
    @Override
    public void displayFacility() {
        for (Facility f:facilityIntegerLinkedHashMap.keySet()) {
            System.out.println(f+""+facilityIntegerLinkedHashMap.get(f));
        }
    }

    @Override
    public void addFacility() {
        boolean flag = true;
        do {
            System.out.println("chon dich vu ban muon" +
                    "\n 1.vila" +
                    "\n 2.house" +
                    "\n 3.room" +
            "\n 4.Return");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    displayVilla();
                    break;
                case 2:
                    displayHouse();
                    break;
                case 3:
                    displayRoom();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    @Override
    public void displayMaintenance() {

    }
    public void displayRoom(){
        IRoom room = new ServiceRoom();
        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Dich vu Room" +
                    "\n 1.add new Room" +
                    "\n 2.delete Room" +
                    "\n 3.return");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                   Room room1= room.addRoom();
                   if (room1 != null) {
                       facilityIntegerLinkedHashMap.put(room1, 1);
                   } else {
                       System.out.println("bạn nhập k hợp lệ xin mời nhập lại");
                   }
                    break;
                case 2:
                    room.deleteRoom();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
    public void displayVilla(){
        IVilla villa = new ServiceVilla();
        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Dich vu villa" +
                    "\n 1.add new villa" +
                    "\n 2.delete villa" +
                    "\n 3.return");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                Villa villa1 = villa.addVilla();
                if (villa1 != null) {
                    facilityIntegerLinkedHashMap.put(villa1, 1);
                } else {
                    System.out.println("nội dung bạn nhập không hợp lệ");
                }
                    break;
                case 2:
                    villa.deleteVila();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
    public void displayHouse(){
        IHouse house = new ServiceHouse();
        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Dich vu villa" +
                    "\n 1.add new villa" +
                    "\n 2.delete villa" +
                    "\n 3.return");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                   House house1 = house.addHouse();
                   if (house1 != null) {
                       facilityIntegerLinkedHashMap.put(house1, 1);
                   } else {
                       System.out.println("nội dung bạn nhập không hợp lệ");
                   }
                    break;
                case 2:
                    house.deleteHouse();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
