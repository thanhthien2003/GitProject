package case_study_again.repository.facility_repo;

import case_study_again.models.facilitys.Room;

import java.util.Map;

public interface IRoomRepo {
    Map<Room,Integer> displayRoom();
    void add(Room room,int value);
    Map<Room,Integer> displayMaintenance();
}
