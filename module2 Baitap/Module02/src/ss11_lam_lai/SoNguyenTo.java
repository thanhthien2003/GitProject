package ss11_lam_lai;

import java.util.*;

public class SoNguyenTo {
    public static boolean checkSNT(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static Stack<Integer> pushSNTInStack(int n) {
        Stack<Integer> stackSNT = new Stack<>();
        for (int i = 1; i <= n; i++) {
            if (checkSNT(i)) {
                stackSNT.push(i);
            }
        }
        return stackSNT;
    }

    public static Queue<Integer> pushSNTInQueue(int n) {
        Queue<Integer> queueSNT = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (checkSNT(i)) {
                queueSNT.add(i);
            }
        }
        return queueSNT;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------nhập giới hạn độ lớn của số nguyên tố bạn muốn liệt kê--------");
        int n = sc.nextInt();
        System.out.println(pushSNTInStack(n));
        System.out.println(pushSNTInQueue(n));
    }
}
