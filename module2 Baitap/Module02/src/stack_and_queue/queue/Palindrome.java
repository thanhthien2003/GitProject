package stack_and_queue.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 chuoi vao ");
        String n = sc.nextLine().toLowerCase();
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n.length(); i++) {
            arrayDeque.add(n.charAt(i));
        }
        for (int i = 0; i < n.length(); i++) {
            stack.push(n.charAt(i));
        }
        Boolean flag = true;
        for (int i = 0; i < stack.size(); i++) {
            if(stack.pop() != arrayDeque.pop()){
                flag = false;
                break;
            }
        }
         if(flag){
             System.out.println("day la chuoi palindrome");
         } else {
             System.out.println("day khong phai chuoi");
         }
    }
}
