package class_and_object;

import java.util.Arrays;
import java.util.Scanner;

public class ClassFan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "quat co toc do la " + speed + " ban kinh la " + radius + " co mau la " + color + " va quat dang bat  ";

        } else {
            return "quat co toc do la " + speed + " ban kinh la " + radius + " co mau la " + color + " va quat dang tat  ";
        }
    }

    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        ClassFan fan2 = new ClassFan();
        fan2.setSpeed(SLOW);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        Scanner sc = new Scanner(System.in);
        System.out.println("bam 1 de bat quat");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println((fan1));
        }
        System.out.println("bam 2 de tat quat");
        int b = sc.nextInt();
        if (b == 2) {
            System.out.println((fan2));
        }
    }
}
