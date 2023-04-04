package case_study.repository.room_repo;

import case_study.models.facility.House;
import case_study.models.facility.Room;

import java.util.List;
import java.util.Map;

public interface IRoomRepo {
    void add(Room room,Integer value);
    void saveToFileRoom(Map<Room, Integer> roomIntegerMap);
}
