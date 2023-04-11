package thuan_toan;

public class Fibonaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c=0;
        for (int i = 0; i < 100; i++) {
            c = a + b;
            if (c < 100) {
                System.out.println(c);
                a = b;
                b=c;
            }
        }
    }
}
