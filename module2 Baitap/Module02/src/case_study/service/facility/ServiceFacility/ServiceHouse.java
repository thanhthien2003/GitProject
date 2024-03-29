package case_study.service.facility.ServiceFacility;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.repository.house_repo.HouseRepo;
import case_study.repository.house_repo.IHouseRepo;
import case_study.service.facility.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceHouse implements IHouse{

    House house = new House();
    static Scanner sc = new Scanner(System.in);
    private String regExHouse ="^[A-Z][a-z]+$";
    private String regExIdHouse = "^SVHO-[0-9]{4}$";
   private IHouseRepo houseRepo = new HouseRepo();
    @Override
    public House addHouse() {
        boolean flag = false;
        String serviceName;
        do {
            System.out.println("enter service name");
            serviceName = sc.nextLine();
            flag = serviceName.matches(regExHouse);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        System.out.println("\n" +
                "Enter the usable area");
        int areaUse = Integer.parseInt(sc.nextLine());
        float price;
        do {
            flag = false;
            System.out.println("enter expenses");
            price = Float.parseFloat(sc.nextLine());
            if (price > 0) {
                flag = true;
            } else {
                System.out.println("cost must be positive");
            }
        } while (!flag);
        int maxHuman = 0;
        do {
            flag = false;
            System.out.println("Enter the maximum number of people");
            maxHuman = Integer.parseInt(sc.nextLine());
            if (maxHuman > 0 && maxHuman < 20) {
                flag = true;
            } else{
                System.out.println("the maximum number of people must be greater than 0 and less than 20");
            }
        } while (!flag);
        System.out.print("enter rental type: ");
        String styleRent = sc.nextLine();
        String idService;
        do {
            System.out.println("enter ID House Service");
            idService = sc.nextLine();
            flag = idService.matches(regExIdHouse);
            if (!flag){
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVHO-YYYY, where YYYY is numbers from 0-9");
            }
        }while(!flag);
        String roomStandard;
        do {
            System.out.println("enter room roomStandard");
            roomStandard = sc.nextLine();
            flag = roomStandard.matches(regExHouse);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        int floor;
        do {
            flag = false;
            System.out.println("enter floor");
            floor = Integer.parseInt(sc.nextLine());
            if (floor > 0) {
                flag = true;
            } else {
                System.out.println("floor number must be positive");
            }
        } while (!flag);
        house = new House(serviceName, areaUse, price, maxHuman, styleRent,idService,floor,roomStandard);
        Integer value = 0;
        houseRepo.add(house,value);
        return house;
    }

    @Override
    public void deleteHouse() {
    }

    @Override
    public void saveToFileHouse(Map<House,Integer> houseStringMap) {
        houseRepo.saveToFileHouse(houseStringMap);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
