package case_study_again.repository.facility_repo;

import java.util.List;

public class FacilityRepo implements IFacilityRepo{
    IHouseRepo houseRepo = new HouseRepo();
    IVilaRepo vilaRepo = new VilaRepo();
    IRoomRepo roomRepo = new RoomRepo();

    @Override
    public void display() {
    }
}
