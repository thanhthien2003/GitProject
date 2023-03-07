package loop_in_java;

public class Bai3HienThiCacSoNhoHon100 {
    public static void main(String[] args) {
        int count = 0;
        int soNT = 2;
        while (soNT < 100) {
            for (int i = 1; i <= soNT; i++) {
                if (soNT % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println( soNT + " la so Nt");
            }
            count = 0;
            soNT++;
        }
    }
}
