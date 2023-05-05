package case_study_again.util;

import case_study_again.models.Booking;
import case_study_again.models.persons.Customers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    private static final String PATH_FILE_BOOKING = "src\\case_study_again\\data\\booking.csv";
    public static void writeFileBooking(TreeSet<Booking> bookingList, boolean flag) {
        File file = new File(PATH_FILE_BOOKING);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking b : bookingList) {
                bufferedWriter.write(b.getInforCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static TreeSet<Booking> readFileCustomer() {
        TreeSet<Booking> bookingTreeSet = new TreeSet<>();
        File file = new File(PATH_FILE_BOOKING);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                bookingTreeSet.add(new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bookingTreeSet;
    }
}
