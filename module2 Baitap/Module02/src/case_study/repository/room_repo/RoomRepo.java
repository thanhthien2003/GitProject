package case_study.repository.room_repo;

import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.repository.house_repo.IHouseRepo;
import case_study.utils.ReadAndWriteFacility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class RoomRepo implements IRoomRepo {
    private static final String PATH_FILE_ROOM = "src\\case_study\\data\\room.csv";
    @Override
    public void add(Room room,Integer value) {
        String text = room.getInforRoom();
        ReadAndWriteFacility.writeFile(PATH_FILE_ROOM,text,true);
    }

    @Override
    public void saveToFileRoom(Map<Room, Integer> roomIntegerMap) {
        File file = new File(PATH_FILE_ROOM);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            for (Room h:roomIntegerMap.keySet()) {
                fileWriter.write(h.getInforRoom() + roomIntegerMap.get(h));
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
