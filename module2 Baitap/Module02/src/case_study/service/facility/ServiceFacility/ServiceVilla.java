package case_study.service.facility.ServiceFacility;

import case_study.models.facility.Villa;
import case_study.repository.vila_repo.IVilaRepo;
import case_study.repository.vila_repo.VilaRepo;
import case_study.service.facility.FacilityService;

import java.util.*;

public class ServiceVilla implements IVilla{
    static Scanner sc = new Scanner(System.in);
    private String regExVila = "^[A-Z][a-z]+$";
    private String regExIdVila = "^SVVL-[0-9]{4}$";
   static IVilaRepo vilaRepo = new VilaRepo();

    public Villa addVilla() {
        boolean flag;
        String serviceName;
        do {
            flag = false;
            System.out.println("enter service name");
            serviceName = sc.nextLine();
            flag = serviceName.matches(regExVila);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase) ");
            }
        } while (!flag);
        System.out.println("Enter the usable area ");
        int areaUse = Integer.parseInt(sc.nextLine());
        float price;
        do {
            flag = false;
            System.out.println("enter expenses ");
            price = Float.parseFloat(sc.nextLine());
            if (price > 0) {
                flag = true;
            } else {
                System.out.println("cost must be positive ");
            }
        } while (!flag);
        int maxHuman = 0;
        do {
            flag = false;
            System.out.println("Enter the maximum number of people ");
            maxHuman = Integer.parseInt(sc.nextLine());
            if (maxHuman > 0 && maxHuman < 20) {
                flag = true;
            } else {
                System.out.println("the maximum number of people must be greater than 0 and less than 20");
            }
        } while (!flag);
        System.out.println("enter rental type");
        String styleRent = sc.nextLine();
        float areaPool;
        do {
            flag = false;
            System.out.println("Enter pool area");
            areaPool = Float.parseFloat(sc.nextLine());
            if (areaPool > 30) {
                flag = true;
            }
        } while (!flag);
        int floor;
        do {
            flag = false;
            System.out.println("enter floor number");
            floor = Integer.parseInt(sc.nextLine());
            if (floor > 0) {
                flag = true;
            } else {
                System.out.println("floor number must be positive");
            }
        } while (!flag);
        String idService;
        do {
            System.out.println("enter ID House Service");
            idService = sc.nextLine();
            flag = idService.matches(regExIdVila);
            if (!flag){
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVVL-YYYY, where YYYY is numbers from 0-9");
            }
        }while(!flag);
        String roomStandard;
        do {
            System.out.println("enter room roomStandard");
            roomStandard = sc.nextLine();
            flag = roomStandard.matches(regExVila);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        Villa villa = new Villa(serviceName, areaUse, price, maxHuman, styleRent,idService,areaPool,floor,roomStandard);
        Integer value = 0;
        vilaRepo.add(villa,value);
        return villa;
    }

    @Override
    public void deleteVila() {

    }


    @Override
    public void saveToFileVilla(Map<Villa,Integer>villaIntegerMap) {
        vilaRepo.saveToFileVilla(villaIntegerMap);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
