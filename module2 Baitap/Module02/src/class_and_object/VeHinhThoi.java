package class_and_object;

public class VeHinhThoi {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int x = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == a || j == b) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            a--;
            b++;
            x++;
        }
        int c = 1;
        int d = 8;
        int y = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == c || j == d) {
                    System.out.print(y);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            c++;
            d--;
            y--;
        }
    }
}
