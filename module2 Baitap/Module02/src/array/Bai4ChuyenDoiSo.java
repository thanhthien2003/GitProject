package array;

import java.util.Scanner;

public class Bai4ChuyenDoiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so muon doc");
        int a = sc.nextInt();
        int m, n, i, j;
        String [] donVi = {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String [] duoiHaiMuoi = {"ten","eleven","Twelve","Thirteen","Fourteen","Firteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String [] hangChuc = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        m = a / 10;
        n = a % 10;
        i = m / 10;
        j = m % 10;
        if(a >= 0 && a < 10){
            sole(a,donVi);
        } else if (a<20) {
            soDuoiHaiMuoi(a,duoiHaiMuoi);
        } else if (a<100) {
            soHangChuc(m,hangChuc);
            sole(n,donVi);
        } else if (a<1000) {
            sole(i,donVi);
            System.out.print(" hundred");
            if ( j==10){
                System.out.print("ten");
            } else if (j<20) {
                soDuoiHaiMuoi(j,duoiHaiMuoi);
            }
//            soHangChuc(j,hangChuc);
//            sole(n,donVi);
        }
    }
    public static void sole(int a,String []b) {
        for (int i = 0; i < b.length; i++) {
            if(a==i){
                System.out.println(b[i]);
                break;
            }
        }
    }
    public static void soDuoiHaiMuoi(int a,String []c){
        for (int i = 0; i < c.length; i++) {
            if (a == (i+10)){
                System.out.println(c[i]);
            }
        }
    }
    public static void soHangChuc(int a,String[]c){
        for (int i = 0; i < c.length; i++) {
            if(a == (i+2)){
                System.out.print(c[i]);
            }
        }
    }
    public static void soHangTram(int a,String[]b){
        for (int i = 1; i < b.length; i++) {
            if(a==i){
                System.out.print(b[i]+" hundred");
            }
        }
    }
}
