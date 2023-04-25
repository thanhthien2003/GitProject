package quan_ly_cong_viec.util;

public class CheckRegEx {
    public static boolean checkEmail(String email){
        String regEx = "^\\w{6,32}@\\w{2,12}\\.\\w{2,12}$";
        if (email.matches(regEx)){
            return true;
        }else {
            return false;
        }
    }
}
