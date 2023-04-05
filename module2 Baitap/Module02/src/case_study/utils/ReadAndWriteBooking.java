package case_study.utils;

import case_study.models.booking_contract.Booking;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    static final String PATH_FILE_BOOKING = "src/case_study/data/booking.csv";
    public static void writeFileBooking(Booking bookings,boolean append){
        File file =new File(PATH_FILE_BOOKING);
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
             bufferedWriter.write(bookings.getInforBooking());
             bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
        public static Set<String> readFileBooking(){
        Set<String> bookingSet = new HashSet<>();
        File file = new File(PATH_FILE_BOOKING);
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line=bufferedReader.readLine()) != null){
                    String [] arr = line.split(",");
                    bookingSet.add(line);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return bookingSet;
        }
    }
