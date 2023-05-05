package case_study_again.repository.booking_repo;

import case_study_again.models.Booking;
import case_study_again.models.facilitys.Facility;
import case_study_again.models.facilitys.House;
import case_study_again.models.facilitys.Room;
import case_study_again.models.facilitys.Villa;
import case_study_again.repository.facility_repo.*;
import case_study_again.util.ReadAndWriteBooking;
import case_study_again.util.RegExCheck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class BookingRepo implements IBookingRepo {
    String regExIdVila = "^(SVVL-)[0-9]{4}$";
    String regExIdRoom = "^(SVRO-)[0-9]{4}$";
    String regExIdHouse = "^(SVHO-)[0-9]{4}$";
    TreeSet<Booking> bookingTreeSet = ReadAndWriteBooking.readFileCustomer();
    IVilaRepo vilaRepo = new VilaRepo();
    IHouseRepo houseRepo = new HouseRepo();
    IRoomRepo roomRepo = new RoomRepo();

    @Override
    public TreeSet<Booking> display() {
        return ReadAndWriteBooking.readFileCustomer();
    }

    @Override
    public void add(Booking booking) {
        bookingTreeSet.add(booking);
        updateCountFacility(booking);
        ReadAndWriteBooking.writeFileBooking(bookingTreeSet, false);
    }

    public void updateCountFacility(Booking booking) {
        String idService = booking.getIdService();
        if (Pattern.matches(regExIdVila, idService)) {
            for (Villa v : vilaRepo.displayVila().keySet()) {
                if (booking.getIdService().equals(v.getIdService())) {
                    vilaRepo.updateValueVilla(v, vilaRepo.displayVila().get(v) + 1);
                }
            }
        } else if (Pattern.matches(regExIdHouse, idService)) {
            for (House h : houseRepo.displayHouse().keySet()) {
                if (booking.getIdService().equals(h.getInfoHouse())) {
                    houseRepo.updateValueHouse(h, houseRepo.displayHouse().get(h) + 1);
                }
            }
        } else if (Pattern.matches(regExIdRoom, idService)) {
            for (Room r : roomRepo.displayRoom().keySet()) {
                if (booking.getIdService().equals(r.getIdService())) {
                    roomRepo.updateValueRoom(r, roomRepo.displayRoom().get(r) + 1);
                }
            }
        }
    }
}
