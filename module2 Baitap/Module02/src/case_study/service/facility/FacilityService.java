package case_study.service.facility;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.facility.ServiceFacility.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    public static LinkedHashMap<Facility,Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);
    private IVilla villaService = new ServiceVilla();
    private IHouse houseService = new ServiceHouse();
    private IRoom roomService = new ServiceRoom();
    static Map<Villa,Integer> villaIntegerMap = new HashMap<>();
    static Map<House,Integer> houseStringMap = new HashMap<>();
    static Map<Room,Integer> roomIntegerMap = new HashMap<>();
    static {
        Villa villa = new Villa("Villa",20,20000,2,"oneyear","SVVL-1000",500,50,"Good");
        Room room = new Room("Room",40,50,2,"Ok","okkii","one night");
        House house =new House("House",60,40,2,"ok","SVHO-0303",4,"Good");
        facilityIntegerLinkedHashMap.put(villa,6);
        facilityIntegerLinkedHashMap.put(room,6);
        facilityIntegerLinkedHashMap.put(house,6);
    }
    @Override
    public void displayFacility() {

        boolean flag;
         do {
             flag = true;
             System.out.println("Choose one !" +
                     "\n 1.Display Villa" +
                     "\n 2.Display House" +
                     "\n 3.Display Room"+
                     "\n 4.Return");
             String choose = sc.nextLine();
             switch (choose){
                 case "1":
                     System.out.println("THIS IS LIST VILA");
                     for (Facility f:facilityIntegerLinkedHashMap.keySet()) {
                         if (f instanceof Villa) {
                             System.out.println(f + "" + facilityIntegerLinkedHashMap.get(f));
                             villaIntegerMap.put((Villa) f,facilityIntegerLinkedHashMap.get(f));
                             }
                         }
                     villaService.saveToFileVilla(villaIntegerMap);
                     break;
                 case "2":
                     System.out.println("THIS IS LIST HOUSE");
                     for (Facility f:facilityIntegerLinkedHashMap.keySet()) {
                         if (f instanceof House) {
                             System.out.println(f + "" + facilityIntegerLinkedHashMap.get(f));
                             houseStringMap.put((House) f,facilityIntegerLinkedHashMap.get(f));
                         }
                         houseService.saveToFileHouse(houseStringMap);
                     }
                     break;
                 case "3":
                     System.out.println("THIS IS LIST ROOM");
                     for (Facility f:facilityIntegerLinkedHashMap.keySet()) {
                         if (f instanceof Room) {
                             System.out.println(f + "" + facilityIntegerLinkedHashMap.get(f));
                             roomIntegerMap.put((Room) f,facilityIntegerLinkedHashMap.get(f));
                         }
                         roomService.saveToFileRoom(roomIntegerMap);
                     }
                     break;
                 case "4":
                     flag = false;
                     break;
                 default:
                     System.out.println("Your choice does not exist!!"+
                     "\n Please re-enter");
             }
         } while (flag);
        }
// tao phuong chung de duyet map
    // duyet map, ket hop instance of.
    // service.save(facility)

    @Override
    public void addFacility() {
        boolean flag = true;
        do {
            System.out.println("Choose one service you want!" +
                    "\n 1.vila" +
                    "\n 2.house" +
                    "\n 3.room" +
            "\n 4.Return");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    serviceVilla();
                    break;
                case 2:
                    serviceHouse();
                    break;
                case 3:
                    serviceRoom();
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    @Override
    public void displayMaintenance() {
    Map<Facility,Integer> facilityMaintenanceMap = new HashMap<>();
        for (House h:houseStringMap.keySet()) {
            if(houseStringMap.get(h)  >= 5){
                facilityMaintenanceMap.put(h,houseStringMap.get(h));
            }
        }
        for (Room r:roomIntegerMap.keySet()) {
            if (roomIntegerMap.get(r) >= 5){
                facilityMaintenanceMap.put(r,roomIntegerMap.get(r));
            }
        }
        for (Villa v:villaIntegerMap.keySet()) {
            if(villaIntegerMap.get(v) >= 5){
                facilityMaintenanceMap.put(v,villaIntegerMap.get(v));
            }
        }
        for (Facility f:facilityMaintenanceMap.keySet()) {
            System.out.println(f + "," + facilityMaintenanceMap.get(f));
        }
    }
    public void serviceRoom(){
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
                       facilityIntegerLinkedHashMap.put(room1, 0);
                       for (Facility f:facilityIntegerLinkedHashMap.keySet()) {
                           if(f instanceof Room){
                           }
                       }
                   } else {
                       System.out.println("YOUR ENTER NO EXIST , PLEASE RE-ENTER");
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
    public void serviceVilla(){
        IVilla villa = new ServiceVilla();
        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Service villa" +
                    "\n 1.add new villa" +
                    "\n 2.delete villa" +
                    "\n 3.return");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                Villa villa1 = villa.addVilla();
                if (villa1 != null) {
                    facilityIntegerLinkedHashMap.put(villa1, 0);
                } else {
                    System.out.println("YOUR ENTER NO EXIST , PLEASE RE-ENTER");
                }
                    break;
                case 2:
                    villa.deleteVila();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("YOUR ENTER NO EXIST,PLEASE RE-ENTER");
                    break;
            }
        } while (flag);
    }
    public void serviceHouse(){
        IHouse house = new ServiceHouse();
        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Dich vu house" +
                    "\n 1.add new house" +
                    "\n 2.delete house" +
                    "\n 3.return");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                   House house1 = house.addHouse();
                   if (house1 != null) {
                       facilityIntegerLinkedHashMap.put(house1, 0);
                   } else {
                       System.out.println("YOUR ENTER NO EXIST , PLEASE RE-ENTER");
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
