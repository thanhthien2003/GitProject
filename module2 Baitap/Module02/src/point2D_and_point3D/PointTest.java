package point2D_and_point3D;

import java.util.Arrays;
import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("day la diem 2D");
        System.out.println("nhap x");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("nhap y");
        float y = Float.parseFloat(sc.nextLine());
        Point2D point2D = new Point2D(x,y);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println("day la diem 3D");
        System.out.println("nhap x");
        float x1 = Float.parseFloat(sc.nextLine());
        System.out.println("nhap y");
        float y2 = Float.parseFloat(sc.nextLine());
        System.out.println("nhap z");
        float z = Float.parseFloat(sc.nextLine());
        Point3D point3D = new Point3D(x,y,z);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
