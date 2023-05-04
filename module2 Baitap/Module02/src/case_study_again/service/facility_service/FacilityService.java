package case_study_again.service.facility_service;

import case_study_again.service.facility_service.HouseService.HouseService;
import case_study_again.service.facility_service.HouseService.IHouseService;
import case_study_again.service.facility_service.RoomService.IRoomService;
import case_study_again.service.facility_service.RoomService.RoomService;
import case_study_again.service.facility_service.VilaService.IVilaService;
import case_study_again.service.facility_service.VilaService.VilaService;

public class FacilityService implements IFacilityService{
    IVilaService vilaService =new VilaService();
    IHouseService houseService = new HouseService();
    IRoomService roomService = new RoomService();
    @Override
    public void display() {
        System.out.println("------------LIST FACILITY--------------");
        vilaService.displayVilla();
        houseService.displayHouse();
        roomService.displayRoom();
    }

    @Override
    public void displayMaintenance() {
        vilaService.displayMaintenanceVilla();
        houseService.displayMaintenanceHouse();
        roomService.displayMaintenanceRoom();
    }
}
