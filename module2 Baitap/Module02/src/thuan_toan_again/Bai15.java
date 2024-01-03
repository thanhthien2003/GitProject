package thuan_toan_again;

public class Bai15 {
    public static boolean checkSoDoiXung(int a){
        String [] arr = String.valueOf(a).split("");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(arr[arr.length-1-i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkSoDoiXung(123445321));
    }
}
