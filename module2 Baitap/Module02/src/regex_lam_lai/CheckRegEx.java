package regex_lam_lai;

import java.util.regex.Pattern;

public class CheckRegEx {
    public static boolean checkEmail(String email){
        return Pattern.matches("^\\w{6,32}@\\w{2,12}\\.\\w{2,12}$",email);
    }
}
