package case_study_again.repository.facility_repo;

import case_study_again.models.facilitys.Room;
import case_study_again.models.facilitys.Villa;
import case_study_again.util.ReadAndWriteRoom;

import java.util.LinkedHashMap;
import java.util.Map;

public class RoomRepo implements IRoomRepo{
    Map<Room,Integer> roomIntegerMap = ReadAndWriteRoom.readFileRoom();
    @Override
    public Map<Room, Integer> displayRoom() {
        return roomIntegerMap=ReadAndWriteRoom.readFileRoom();
    }

    @Override
    public void add(Room room, int value) {
        roomIntegerMap.put(room,value);
        ReadAndWriteRoom.writeFileRoom(roomIntegerMap,false);
    }

    @Override
    public Map<Room, Integer> displayMaintenance() {
        Map<Room,Integer> roomMaintenanceMap = new LinkedHashMap<>();
        for (Room r:roomIntegerMap.keySet()) {
            if (roomIntegerMap.get(r)>=5){
                roomMaintenanceMap.put(r,roomIntegerMap.get(r));
            }
        }
        return roomMaintenanceMap;
    }
}
