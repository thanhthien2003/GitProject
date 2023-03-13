package circle_and_cylinder;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh vao");
        double r = Double.parseDouble(sc.nextLine());
        System.out.println("nhap mau sac");
        String color = sc.nextLine();
        Circle circle = new Circle();
        circle.setRadius(r);
        circle.setColor(color);
        System.out.println("nhap chieu cao:");
        double h = Double.parseDouble(sc.nextLine());
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(h);
        cylinder.setRadius(r);
        cylinder.setColor(color);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
