package stack_and_queue.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class HeNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so muon tinh he nhi phan");
        int n = sc.nextInt();
        do {
            for (int i = 0; i < n; i++) {
                stack.push(n % 2);
                n = n / 2;
            }
        } while ((n / 2) > 0);
        stack.push(n%2);
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
