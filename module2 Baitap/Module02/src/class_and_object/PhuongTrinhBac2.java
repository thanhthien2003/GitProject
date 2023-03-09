package class_and_object;

import java.util.Scanner;

public class PhuongTrinhBac2 {
        double a;
        double b;
        double c;
        public PhuongTrinhBac2(double a,double b,double c){
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
        Scanner sc2 = new Scanner(System.in);
        System.out.println("nhap he so b");
        double b = sc2.nextDouble();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("nhap he so c");
        double c = sc3.nextDouble();
        PhuongTrinhBac2 bai1 = new PhuongTrinhBac2(a,b,c);
        System.out.println("So a nhap vao la " + bai1.getA());
        System.out.println("So b nhap vao la " + bai1.getB());
        System.out.println("So c nhap vao la " + bai1.getC());
    }

}
