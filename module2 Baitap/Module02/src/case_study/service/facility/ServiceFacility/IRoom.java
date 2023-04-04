package case_study.service.facility.ServiceFacility;

import case_study.models.facility.Room;

import java.util.Map;

public interface IRoom {
    Room addRoom();
    void deleteRoom();
    void saveToFileRoom(Map<Room,Integer> roomIntegerMap);
}
