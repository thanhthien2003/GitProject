package case_study_again.service.facility_service.VilaService;

import case_study_again.models.facilitys.Villa;
import case_study_again.repository.facility_repo.IVilaRepo;
import case_study_again.repository.facility_repo.VilaRepo;

import java.util.Scanner;

public class VilaService implements IVilaService{
    private String regExVila = "^[A-Z][a-z]+$";
    private String regExIdVila = "^SVVL-[0-9]{4}$";
    private Scanner sc = new Scanner(System.in);
    IVilaRepo vilaRepo = new VilaRepo();
    @Override
    public void displayVilla() {
        for (Villa v:vilaRepo.displayVila().keySet()) {
            System.out.println(v+","+vilaRepo.displayVila().get(v));
        }
    }

    @Override
    public void addVilla() {
    Villa villa  = entryVilla();
    vilaRepo.add(villa,0);
    }

    @Override
    public void displayMaintenanceVilla() {
        for (Villa v:vilaRepo.displayMaintenance().keySet()) {
            System.out.println(v+","+vilaRepo.displayMaintenance().get(v));
        }
    }

    public Villa entryVilla(){
        boolean flag;
        String serviceName;
        do {
            flag = false;
            System.out.print("enter service name: ");
            serviceName = sc.nextLine();
            flag = serviceName.matches(regExVila);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase) ");
            }
        } while (!flag);
        System.out.print("Enter the usable area: ");
        int areaUse = Integer.parseInt(sc.nextLine());
        float price = 0;
        do {
            try {
                System.out.print("enter expenses: ");
                price = Float.parseFloat(sc.nextLine());
                if (price > 0) {
                    flag = true;
                } else {
                    System.out.println("cost must be positive ");
                    flag = false;
                }
            }catch (Exception e){
                System.out.println("Please just enter number");
                flag =false;
            }
        } while (!flag);
        int maxHuman = 0;
        do {
            try {
                System.out.print("Enter the maximum number of people: ");
                maxHuman = Integer.parseInt(sc.nextLine());
                if (maxHuman > 0 && maxHuman < 20) {
                    flag = true;
                } else {
                    System.out.println("the maximum number of people must be greater than 0 and less than 20");
                    flag = false;
                }
            }catch (Exception e){
                flag = false;
                System.out.println("Please just enter number");
            }
        } while (!flag);
        System.out.print("enter rental type: ");
        String styleRent = sc.nextLine();
        float areaPool=0;
        do {
            try {
                System.out.println("Enter pool area");
                areaPool = Float.parseFloat(sc.nextLine());
                if (areaPool > 30) {
                    flag = true;
                } else {
                    System.out.println("Area of pool > 30");
                    flag =false;
                }
            }catch (Exception e){
                System.out.println("Please just enter number");
                flag = false;
            }
        } while (!flag);
        int floor=0;
        do {
            try {
                System.out.print("enter floor number: ");
                floor = Integer.parseInt(sc.nextLine());
                if (floor > 0) {
                    flag = true;
                } else {
                    System.out.println("floor number must be positive");
                    flag =false;
                }
            }catch (Exception e){
                System.out.println("Please just enter number");
                flag =false;
            }
        } while (!flag);
        String idService;
        do {
            System.out.print("enter ID House Service: ");
            idService = sc.nextLine();
            flag = idService.matches(regExIdVila);
            if (!flag){
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVVL-YYYY, where YYYY is numbers from 0-9");
            }
        }while(!flag);
        String roomStandard;
        do {
            System.out.print("enter room roomStandard: ");
            roomStandard = sc.nextLine();
            flag = roomStandard.matches(regExVila);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        Villa villa = new Villa(serviceName,areaUse,price,maxHuman,styleRent,idService,areaPool,floor,roomStandard);
        return villa;
    }
}
