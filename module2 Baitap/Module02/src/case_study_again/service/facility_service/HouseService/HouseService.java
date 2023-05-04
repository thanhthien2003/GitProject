package case_study_again.service.facility_service.HouseService;

import case_study_again.models.facilitys.House;
import case_study_again.repository.facility_repo.HouseRepo;
import case_study_again.repository.facility_repo.IHouseRepo;

import java.util.Scanner;

public class HouseService implements IHouseService{
    private String regExHouse ="^[A-Z][a-z]+$";
    private String regExIdHouse = "^SVHO-[0-9]{4}$";
    Scanner sc = new Scanner(System.in);
    IHouseRepo houseRepo = new HouseRepo();
    @Override
    public void displayHouse() {
        for (House h:houseRepo.displayHouse().keySet()) {
            System.out.println(h+","+houseRepo.displayHouse().get(h));
        }
    }

    @Override
    public void addHouse() {
        House house = entryHouse();
        houseRepo.add(house,0);
    }

    @Override
    public void displayMaintenanceHouse() {
        for (House h:houseRepo.displayMaintenance().keySet()) {
            System.out.println(h+","+houseRepo.displayMaintenance().get(h));
        }
    }

    public House entryHouse(){
        boolean flag;
        String serviceName=null;
        do {
            System.out.print("enter service name: ");
            serviceName = sc.nextLine();
            flag = serviceName.matches(regExHouse);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        int areaUse=0;
        do {
            try {
                System.out.print("Enter the usable area: ");
                areaUse = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (Exception e){
                flag = true;
            }
        }while (flag);
        float price=0;
        do {
            try {
                System.out.print("enter expenses: ");
                price = Float.parseFloat(sc.nextLine());
                if (price > 0) {
                    flag = true;
                } else {
                    System.out.println("cost must be positive");
                    flag = false;
                }
            }catch (Exception e){
                System.out.println("Please enter number");
                flag = false;
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
                System.out.println("Please enter just number");
                flag = false;
            }
        } while (!flag);
        System.out.print("enter rental type: ");
        String styleRent = sc.nextLine();
        String idService;
        do {
            System.out.print("enter ID House Service: ");
            idService = sc.nextLine();
            flag = idService.matches(regExIdHouse);
            if (!flag){
                System.out.println("Enter the wrong format,Service code must be in the correct format: SVHO-YYYY, where YYYY is numbers from 0-9");
            }
        }while(!flag);
        String roomStandard;
        do {
            System.out.print("enter room roomStandard: ");
            roomStandard = sc.nextLine();
            flag = roomStandard.matches(regExHouse);
            if (!flag) {
                System.out.println("Enter the wrong name format (capitalize the first letter, the rest is lowercase)");
            }
        } while (!flag);
        int floor=0;
        do {
            try {
                System.out.print("enter floor: ");
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
        House house = new House(serviceName,areaUse,price,maxHuman,styleRent,idService,floor,roomStandard);
        return house;
    }
}
