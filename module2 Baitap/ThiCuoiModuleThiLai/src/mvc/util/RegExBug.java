package mvc.util;

import java.util.regex.Pattern;

public class RegExBug {
    static String regExMaBug = "^BUG-[0-9]{3}$";

    public static boolean checkRegExMaBug(String maBug) {
        return Pattern.matches(regExMaBug, maBug);
    }
}
