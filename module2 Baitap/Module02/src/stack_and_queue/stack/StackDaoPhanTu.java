package stack_and_queue.stack;

import danh_sach.MyList;

import java.util.Scanner;
import java.util.Stack;

public class StackDaoPhanTu {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + " cua mang");
            int m = sc.nextInt();
            stack.push(m);
        }
        System.out.println(stack);

        Stack<Integer> stack2 = new Stack<>();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack2.push(stack.pop());
        }
        System.out.println(stack2);


        Stack<String> stack3 = new Stack<>();
        System.out.println("nhap chuoi vao");
        Scanner sc2 = new Scanner(System.in);
        String z = sc2.nextLine();
        for (int i = 0; i < z.length() ; i++) {
            stack3.push(String.valueOf(z.charAt(i)));
        }
        System.out.println(stack3);

        Stack<String> stack4 = new Stack<>();
        int size2 = stack3.size();
        for (int i = 0; i < size2; i++) {
            stack4.push(stack3.pop());
        }
        for (String i : stack4) {
            System.out.print(i);
        }
    }
    }

