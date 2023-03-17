package stack_and_queue.stack;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoacStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 chuoi vao ");
        String n = sc.nextLine().toLowerCase();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stackb = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < n.length(); i++) {
            stack.push(n.charAt(i));
        }
        for (char i : stack) {
            if (i == '(') {
                stackb.push(i);
            } else if (i == ')') {
                stackb.pop();
            }
        }
        if (stackb.isEmpty()) {
            System.out.println("well");
        } else {
            System.out.println("???");
        }
    }
}

