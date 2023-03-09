package class_and_object;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    double a;
    double b;
    double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap he so a");
        double a = sc.nextDouble();
        System.out.println("nhap he so b");
        double b = sc.nextDouble();
        System.out.println("nhap he so c");
        double c = sc.nextDouble();
        PhuongTrinhBac2 bai1 = new PhuongTrinhBac2(a, b, c);
        System.out.println("So a nhap vao la " + bai1.getA());
        System.out.println("So b nhap vao la " + bai1.getB());
        System.out.println("So c nhap vao la " + bai1.getC());
        giaiPT(a, b, c);
    }

    public static void giaiPT(double a, double b, double c) {
        double denta = b * b - 4 * a * c;
        double r1 = 0;
        double r2 = 0;
        if (denta < 0) {
            System.out.println("The equation has no roots");
        } else if (denta == 0) {
            r1 = r1(denta, a, b, c);
            System.out.println("phuong trinh co nghiem kep = " + r1);
        } else {
            r1 = r1(denta, a, b, c);
            r2 = r2(denta, a, b, c);
            System.out.println("phuong trinh co nghiem x1 = " + r1 + "\n phuong trinh co nghiem x2= " + r2);
        }
    }

    public static double r1(double denta, double a, double b, double c) {
        double r1 = (-b + Math.pow(denta, 0.5)) / 2 * a;
        return r1;
    }

    public static double r2(double denta, double a, double b, double c) {
        double r2 = (-b - Math.pow(denta, 0.5)) / 2 * a;
        return r2;
    }
}
