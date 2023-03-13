package point_and_moveablepoint;

import point2D_and_point3D.Point2D;
import point2D_and_point3D.Point3D;

import java.util.Arrays;
import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("day la vi tri ban dau ");
        System.out.println("nhap x");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("nhap y");
        float y = Float.parseFloat(sc.nextLine());
        Point2D point = new Point2D(x, y);
        System.out.println(point.toString());
        System.out.println("day la toc do");
        System.out.println("nhap speed x");
        float xSpeed = Float.parseFloat(sc.nextLine());
        System.out.println("nhap speed y");
        float ySpeed = Float.parseFloat(sc.nextLine());
        MovablePoint speed = new MovablePoint(x, y, xSpeed, ySpeed);
        System.out.println(speed.toString());
        speed.move();
        System.out.println(speed.toString());
    }
}
