package thuan_toan_again;

public class Bai1 {
    public static int sumSNT(int n){
        int result=0;
        int count=0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result = result + i;
            }
            count=0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumSNT(10));
    }
}
