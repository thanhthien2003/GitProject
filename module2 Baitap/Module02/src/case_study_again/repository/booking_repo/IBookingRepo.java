package case_study_again.repository.booking_repo;

import case_study_again.models.Booking;
import case_study_again.repository.IRepository;

import java.util.TreeSet;

public interface IBookingRepo {
    TreeSet<Booking> display();
   void add(Booking booking);
}
