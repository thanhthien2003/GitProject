package quan_ly_cong_viec.util;

public class CheckRegEx {
    public static boolean checkEmail(String email){
        String regEx = "^(((0[1-9])|[12][0-9])|3[01])/((0[1-9])|1[0-2])/([2-9]((0[2-9][3-9])|[1-9][0-9][0-9]))$";
        if (email.matches(regEx)){
            return true;
        }else {
            return false;
        }
    }
}
