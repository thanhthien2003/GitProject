package case_study_again.util;

import java.util.Date;
import java.util.regex.Pattern;

public class RegExCheck {
    private static String regExIdEmployee ="^(NV-)[0-9]{4}$";
    private static String regExIdCustomer ="^(KH-)[0-9]{4}$";
    private static String regExName ="^([A-Z][a-z]+\\s)([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
    private static String regExIdCountry = "^(\\d{9})|(\\d{12})$";
    private static String regExPhoneNumber = "^0\\d{9}$";

    public static boolean checkIdEmployees(String id) {
        return Pattern.matches(regExIdEmployee,id);
    }

    public static boolean checkIdCustomer(String id) {
        return Pattern.matches(regExIdCustomer, id);
    }

    public static boolean checkName(String name) {
        return Pattern.matches(regExName,name);
    }

    public static boolean checkDate(String date) {
        if (Pattern.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$",date)){
//            26/09/2003
//            0123456789
            int day = Integer.parseInt(date.substring(0,2));
            int month = Integer.parseInt(date.substring(3,5));
            int year = Integer.parseInt(date.substring(6));
            Date birthDay = new Date(year - 1900,month,day);
            Date firtsDate = new Date();
            long age = (firtsDate.getTime()-birthDay.getTime())/ Long.parseLong("31557600000");
            if (age >= 18){
                return true;
            } else {
                System.out.println("You underage");
                return  false;
            }
        } else {
            System.out.println("Your enter wrong format, please re-enter");
            return false;
        }
    }

    public static boolean checkIdCountry(String idCountry) {
        return Pattern.matches(regExIdCountry,idCountry);
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        return Pattern.matches(regExPhoneNumber,phoneNumber);
    }
}
