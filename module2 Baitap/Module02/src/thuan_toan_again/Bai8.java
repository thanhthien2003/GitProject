package thuan_toan_again;

public class Bai8 {
    public static long reverseNumber(long a){
        long soDaoNguoc=0;
        long soCuoi = 0;
        if (a<=0){
            System.out.println("Nhap vao so nguyen duong di ba");
        }else {
            while (a>0){
                soCuoi = a%10;
                soDaoNguoc = soDaoNguoc*10 + soCuoi;
                a=a/10;
            }
        }
        return soDaoNguoc;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(249303304));
    }
}
