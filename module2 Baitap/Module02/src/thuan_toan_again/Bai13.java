package thuan_toan_again;

public class Bai13 {
    public static void main(String[] args) {
        int result = 0;
        System.out.println(result);
        int a = 0;
        int b = 1;
        for (int i = 0; i < 100; i++) {
            {
                result = a + b;
                if (result < 100) {
                    a = b;
                    b = result;
                    System.out.println(result);
                }

            }
        }
    }
}
